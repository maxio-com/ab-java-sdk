package com.maxio.advancedbilling.controllers.invoices;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.InvoicesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CancellationOptions;
import com.maxio.advancedbilling.models.CancellationRequest;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CreateAllocation;
import com.maxio.advancedbilling.models.CreateAllocationRequest;
import com.maxio.advancedbilling.models.CreateSubscriptionComponent;
import com.maxio.advancedbilling.models.CreditType;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceStatus;
import com.maxio.advancedbilling.models.IssueInvoiceRequest;
import com.maxio.advancedbilling.models.ListInvoicesInput;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.containers.CreateSubscriptionComponentComponentId;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class InvoicesControllerReopenInvoiceTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClientProvider.getClient();
    private static final InvoicesController INVOICES_CONTROLLER = CLIENT.getInvoicesController();

    private static Product product;
    private static Customer customer;
    private static Component quantityBasedComponent;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        ProductFamily productFamily = TEST_SETUP.createProductFamily();
        product = TEST_SETUP.createProduct(productFamily, b -> b.priceInCents(125000));
        customer = TEST_SETUP.createCustomer();
        quantityBasedComponent = TEST_SETUP.createQuantityBasedComponent(productFamily.getId());
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldReopenCancelledInvoice() throws IOException, ApiException {
        // given
        Subscription subscription = createTestSubscription();

        Invoice cancelledInvoice = triggerCancelledInvoice(subscription);

        // when
        Invoice reopenedInvoice = INVOICES_CONTROLLER.reopenInvoice(cancelledInvoice.getUid());

        // then
        assertThat(reopenedInvoice).isNotNull();
        assertThat(reopenedInvoice.getStatus()).isEqualTo(InvoiceStatus.OPEN);
        assertThat(reopenedInvoice)
                .usingRecursiveComparison()
                .ignoringFields("status", "createdAt", "updatedAt", "previousBalanceData.capturedAt")
                .isEqualTo(cancelledInvoice);
    }

    @Test
    void shouldThrowExceptionIfInvoiceIsNotCancelled() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);

        Invoice paidInvoice = INVOICES_CONTROLLER.listInvoices(
                        new ListInvoicesInput.Builder()
                                .status(InvoiceStatus.PAID)
                                .subscriptionId(subscription.getId())
                                .build())
                .getInvoices()
                .get(0);

        // when then
        assertThatErrorListResponse(() -> INVOICES_CONTROLLER.reopenInvoice(paidInvoice.getUid()))
                .hasErrors("The invoice must be in canceled status to be reopened.")
                .hasErrorCode(422)
                .hasMessageStartingWith("HTTP Response Not OK. Status code: 422. Response:");
    }

    @Test
    void shouldThrowUnauthorizedForInvalidCredentials() {
        // when then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient()
                .getInvoicesController()
                .reopenInvoice("uid")
        );
    }

    @Test
    void shouldThrowNotFoundIfInvoiceDoesNotExist() {
        // when then
        assertNotFound(() -> INVOICES_CONTROLLER.reopenInvoice("uid_not_found"));
    }

    private Subscription createTestSubscription() throws IOException, ApiException {
        List<CreateSubscriptionComponent> subscriptionComponents = List.of(
                new CreateSubscriptionComponent.Builder()
                        .componentId(CreateSubscriptionComponentComponentId.fromNumber(quantityBasedComponent.getId()))
                        .unitBalance(10)
                        .build());

        return TEST_SETUP.createSubscription(customer, product, s -> s
                .components(subscriptionComponents));
    }

    private Invoice triggerCancelledInvoice(Subscription subscription) throws ApiException, IOException {
        CLIENT.getSubscriptionComponentsController()
                .allocateComponent(subscription.getId(), quantityBasedComponent.getId(), new CreateAllocationRequest(
                        new CreateAllocation.Builder()
                                .memo("Allocate metered for invoice")
                                .quantity(100)
                                .upgradeCharge(CreditType.FULL)
                                .build())
                );

        Invoice pendingInvoice = INVOICES_CONTROLLER.listInvoices(
                        new ListInvoicesInput.Builder()
                                .status(InvoiceStatus.PENDING)
                                .subscriptionId(subscription.getId())
                                .build())
                .getInvoices()
                .get(0);

        INVOICES_CONTROLLER.issueInvoice(pendingInvoice.getUid(), new IssueInvoiceRequest());

        CLIENT.getSubscriptionStatusController()
                .cancelSubscription(subscription.getId(), new CancellationRequest(new CancellationOptions.Builder()
                        .cancellationMessage("Get lost")
                        .build()));

        Invoice cancelledInvoice = INVOICES_CONTROLLER.listInvoices(
                        new ListInvoicesInput.Builder()
                                .status(InvoiceStatus.CANCELED)
                                .subscriptionId(subscription.getId())
                                .build())
                .getInvoices()
                .get(0);

        return INVOICES_CONTROLLER.readInvoice(cancelledInvoice.getUid());
    }
}
