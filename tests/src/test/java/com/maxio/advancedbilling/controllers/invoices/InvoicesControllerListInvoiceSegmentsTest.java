package com.maxio.advancedbilling.controllers.invoices;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
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
    private final AdvancedBillingClient client = TestClientProvider.getClient();
    private final TestSetup testSetup = new TestSetup(client);
    private final InvoicesController invoicesController = client.getInvoicesController();

    private SubscriptionGroupSignupResponse groupSignup;
    private Customer customer;
    private Subscription subscription;

    @BeforeAll
    void setUp() throws IOException, ApiException {
        ProductFamily productFamily = testSetup.createProductFamily();
        Product product = testSetup.createProduct(productFamily, b -> b.priceInCents(1250));
        Component meteredComponent = testSetup.createMeteredComponent(productFamily, 11.5);

        customer = testSetup.createCustomer();
        subscription = testSetup.createSubscription(customer, product);

        groupSignup = testSetup.signupWithSubscriptionGroup(product, meteredComponent);
    }

    @AfterAll
    void teardown() throws IOException, ApiException {
        TestTeardown testTeardown = new TestTeardown();
        testTeardown.deleteCustomer(customer);
        testTeardown.deleteSubscriptionGroup(groupSignup);
    }

    @Test
    void shouldListInvoiceSegmentsForConsolidatedInvoice() throws IOException, ApiException {
        // given
        // Invoice segments returned on the index will only include totals, not detailed breakdowns for line_items,
        // discounts, taxes, credits, debits, payments, or custom_fields
        String[] IGNORED_FIELDS = {"credits", "debits", "customFields", "discounts", "lineItems", "payments", "refunds", "taxes", "updatedAt", "createdAt", "additionalProperties"};

        Invoice subscriptionGroupInvoice = invoicesController
                .listInvoices(new ListInvoicesInput.Builder()
                        .customerIds(List.of(groupSignup.getCustomerId()))
                        .status(InvoiceStatus.PAID)
                        .build())
                .getInvoices()
                .get(0);

        String uid1 = getInvoiceUid(groupSignup.getSubscriptionIds().get(0));
        String uid2 = getInvoiceUid(groupSignup.getSubscriptionIds().get(1));

        // when
        ConsolidatedInvoice consolidatedInvoice = invoicesController.listConsolidatedInvoiceSegments(
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
                .isEqualTo(invoicesController.readInvoice(uid1));

        Invoice segment2 = subscriptionIdToInvoice.get(groupSignup.getSubscriptionIds().get(1));
        assertThat(segment2)
                .usingRecursiveComparison()
                .ignoringFields(IGNORED_FIELDS)
                .isEqualTo(invoicesController.readInvoice(uid2));
    }

    @Test
    void shouldReturnEmptyListForNonConsolidatedInvoice() throws IOException, ApiException {
        // when
        ConsolidatedInvoice response = invoicesController.listConsolidatedInvoiceSegments(
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
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient()
                .getInvoicesController()
                .listConsolidatedInvoiceSegments(new ListConsolidatedInvoiceSegmentsInput.Builder().invoiceUid("uid").build())
        );
    }

    @Test
    void shouldThrowNotFoundIfInvoiceDoesNotExist() {
        // when then
        assertNotFound(() -> invoicesController.listConsolidatedInvoiceSegments(
                new ListConsolidatedInvoiceSegmentsInput.Builder().invoiceUid("uid").build()));
    }

    private String getInvoiceUid(int subscriptionId) throws ApiException, IOException {
        return invoicesController
                .listInvoices(new ListInvoicesInput.Builder()
                        .subscriptionId(subscriptionId)
                        .build())
                .getInvoices()
                .get(0)
                .getUid();
    }
}
