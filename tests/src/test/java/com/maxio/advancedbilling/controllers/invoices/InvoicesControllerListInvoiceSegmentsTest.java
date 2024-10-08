package com.maxio.advancedbilling.controllers.invoices;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.InvoicesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ConsolidatedInvoice;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceStatus;
import com.maxio.advancedbilling.models.ListConsolidatedInvoiceSegmentsInput;
import com.maxio.advancedbilling.models.ListInvoicesInput;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionGroupSignupResponse;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class InvoicesControllerListInvoiceSegmentsTest {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final InvoicesController INVOICES_CONTROLLER = CLIENT.getInvoicesController();

    private static SubscriptionGroupSignupResponse groupSignup;
    private static Customer customer;
    private static Subscription subscription;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        ProductFamily productFamily = TEST_SETUP.createProductFamily();
        Product product = TEST_SETUP.createProduct(productFamily, b -> b.priceInCents(1250));
        Component meteredComponent = TEST_SETUP.createMeteredComponent(productFamily, 11.5);

        customer = TEST_SETUP.createCustomer();
        subscription = TEST_SETUP.createSubscription(customer, product);

        groupSignup = TEST_SETUP.signupWithSubscriptionGroup(product, meteredComponent);
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        TestTeardown testTeardown = new TestTeardown();
        testTeardown.deleteCustomer(customer);
        testTeardown.deleteSubscriptionGroup(groupSignup);
    }

    @Test
    void shouldListInvoiceSegmentsForConsolidatedInvoice() throws IOException, ApiException {
        // given
        // Invoice segments returned on the index will only include totals, not detailed breakdowns for line_items,
        // discounts, taxes, credits, payments, or custom_fields
        String[] IGNORED_FIELDS = {"credits", "customFields", "discounts", "lineItems", "payments", "refunds", "taxes", "updatedAt", "createdAt", "additionalProperties"};

        Invoice subscriptionGroupInvoice = INVOICES_CONTROLLER
                .listInvoices(new ListInvoicesInput.Builder()
                        .customerIds(List.of(groupSignup.getCustomerId()))
                        .status(InvoiceStatus.PAID)
                        .build())
                .getInvoices()
                .get(0);

        String uid1 = getInvoiceUid(groupSignup.getSubscriptionIds().get(0));
        String uid2 = getInvoiceUid(groupSignup.getSubscriptionIds().get(1));

        // when
        ConsolidatedInvoice consolidatedInvoice = INVOICES_CONTROLLER.listConsolidatedInvoiceSegments(
                new ListConsolidatedInvoiceSegmentsInput.Builder()
                        .perPage(10)
                        .invoiceUid(subscriptionGroupInvoice.getUid())
                        .build());

        // then
        assertThat(consolidatedInvoice).isNotNull();
        assertThat(consolidatedInvoice.getInvoices()).hasSize(2);
        Map<Integer, Invoice> subscriptionIdToInvoice = consolidatedInvoice.getInvoices()
                .stream()
                .collect(Collectors.toMap(Invoice::getSubscriptionId, Function.identity()));

        Invoice segment1 = subscriptionIdToInvoice.get(groupSignup.getSubscriptionIds().get(0));
        assertThat(segment1)
                .usingRecursiveComparison()
                .ignoringFields(IGNORED_FIELDS)
                .isEqualTo(INVOICES_CONTROLLER.readInvoice(uid1));

        Invoice segment2 = subscriptionIdToInvoice.get(groupSignup.getSubscriptionIds().get(1));
        assertThat(segment2)
                .usingRecursiveComparison()
                .ignoringFields(IGNORED_FIELDS)
                .isEqualTo(INVOICES_CONTROLLER.readInvoice(uid2));
    }

    @Test
    void shouldReturnEmptyListForNonConsolidatedInvoice() throws IOException, ApiException {
        // when
        ConsolidatedInvoice response = INVOICES_CONTROLLER.listConsolidatedInvoiceSegments(
                new ListConsolidatedInvoiceSegmentsInput.Builder()
                        .invoiceUid(getInvoiceUid(subscription.getId()))
                        .build());

        // then
        assertThat(response).isNotNull();
        assertThat(response.getInvoices()).isEmpty();
    }

    @Test
    void shouldThrowUnauthorizedForInvalidCredentials() {
        // when then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient()
                .getInvoicesController()
                .listConsolidatedInvoiceSegments(new ListConsolidatedInvoiceSegmentsInput.Builder().invoiceUid("uid").build())
        );
    }

    @Test
    void shouldThrowNotFoundIfInvoiceDoesNotExist() {
        // when then
        assertNotFound(() -> INVOICES_CONTROLLER.listConsolidatedInvoiceSegments(
                new ListConsolidatedInvoiceSegmentsInput.Builder().invoiceUid("uid").build()));
    }

    private String getInvoiceUid(int subscriptionId) throws ApiException, IOException {
        return INVOICES_CONTROLLER
                .listInvoices(new ListInvoicesInput.Builder()
                        .subscriptionId(subscriptionId)
                        .build())
                .getInvoices()
                .get(0)
                .getUid();
    }
}
