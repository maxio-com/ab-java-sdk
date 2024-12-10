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
    private final AdvancedBillingClient client = TestClientProvider.getClient();
    private final TestSetup testSetup = new TestSetup(client);
    private final InvoicesController invoicesController = client.getInvoicesController();

    private Product product;
    private Customer customer;
    private Component quantityBasedComponent;

    @BeforeAll
    void setUp() throws IOException, ApiException {
        ProductFamily productFamily = testSetup.createProductFamily();
        product = testSetup.createProduct(productFamily, b -> b.priceInCents(125000));
        customer = testSetup.createCustomer();
        quantityBasedComponent = testSetup.createQuantityBasedComponent(productFamily.getId());
    }

    @AfterAll
    void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldReopenCancelledInvoice() throws IOException, ApiException {
        // given
        Subscription subscription = createTestSubscription();

        Invoice cancelledInvoice = triggerCancelledInvoice(subscription);

        // when
        Invoice reopenedInvoice = invoicesController.reopenInvoice(cancelledInvoice.getUid());

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
        Subscription subscription = testSetup.createSubscription(customer, product);

        Invoice paidInvoice = invoicesController.listInvoices(
                        new ListInvoicesInput.Builder()
                                .status(InvoiceStatus.PAID)
                                .subscriptionId(subscription.getId())
                                .build())
                .getInvoices()
                .get(0);

        // when then
        assertThatErrorListResponse(() -> invoicesController.reopenInvoice(paidInvoice.getUid()))
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
        assertNotFound(() -> invoicesController.reopenInvoice("uid_not_found"));
    }

    private Subscription createTestSubscription() throws IOException, ApiException {
        List<CreateSubscriptionComponent> subscriptionComponents = List.of(
                new CreateSubscriptionComponent.Builder()
                        .componentId(CreateSubscriptionComponentComponentId.fromNumber(quantityBasedComponent.getId()))
                        .unitBalance(10)
                        .build());

        return testSetup.createSubscription(customer, product, s -> s
                .components(subscriptionComponents));
    }

    private Invoice triggerCancelledInvoice(Subscription subscription) throws ApiException, IOException {
        client.getSubscriptionComponentsController()
                .allocateComponent(subscription.getId(), quantityBasedComponent.getId(), new CreateAllocationRequest(
                        new CreateAllocation.Builder()
                                .memo("Allocate metered for invoice")
                                .quantity(100)
                                .upgradeCharge(CreditType.FULL)
                                .build())
                );

        Invoice pendingInvoice = invoicesController.listInvoices(
                        new ListInvoicesInput.Builder()
                                .status(InvoiceStatus.PENDING)
                                .subscriptionId(subscription.getId())
                                .build())
                .getInvoices()
                .get(0);

        invoicesController.issueInvoice(pendingInvoice.getUid(), new IssueInvoiceRequest());

        client.getSubscriptionStatusController()
                .cancelSubscription(subscription.getId(), new CancellationRequest(new CancellationOptions.Builder()
                        .cancellationMessage("Get lost")
                        .build()));

        Invoice cancelledInvoice = invoicesController.listInvoices(
                        new ListInvoicesInput.Builder()
                                .status(InvoiceStatus.CANCELED)
                                .subscriptionId(subscription.getId())
                                .build())
                .getInvoices()
                .get(0);

        return invoicesController.readInvoice(cancelledInvoice.getUid());
    }
}
