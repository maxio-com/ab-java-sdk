package com.maxio.advancedbilling.controllers.invoices;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.InvoicesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.ListInvoicesInput;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.SendInvoiceRequest;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatNoException;

class InvoicesControllerSendTest {
    private final AdvancedBillingClient client = TestClientProvider.getClient();
    private final TestSetup testSetup = new TestSetup(client);
    private final InvoicesController invoicesController = client.getInvoicesController();

    private Customer customer;
    private Invoice paidInvoice;

    @BeforeAll
    void setUp() throws IOException, ApiException {
        Product product = testSetup.createProduct(testSetup.createProductFamily(), b -> b.priceInCents(1250));
        customer = testSetup.createCustomer();
        Subscription subscription = testSetup.createSubscription(customer, product);
        paidInvoice = invoicesController
                .listInvoices(new ListInvoicesInput.Builder().subscriptionId(subscription.getId()).build())
                .getInvoices()
                .get(0);
    }

    @AfterAll
    void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldSendInvoice() {
        // when - then
        assertThatNoException().isThrownBy(() -> invoicesController.sendInvoice(
                        paidInvoice.getUid(),
                        new SendInvoiceRequest.Builder()
                                .recipientEmails(List.of("recepient1@maxio.com", "recepient2@maxio.com"))
                                .ccRecipientEmails(List.of("ccRecepient1@maxio.com", "ccRecepient2@maxio.com"))
                                .bccRecipientEmails(List.of("bccRecepient1@maxio.com", "bccRecepient2@maxio.com"))
                                .build()
                )
        );
    }

    @Test
    void shouldReturn422WhenSendingInvalidEmailNotExistentInvoice() {
        // when - then
        CommonAssertions
                .assertThatErrorListResponse(() -> invoicesController.sendInvoice(paidInvoice.getUid(), new SendInvoiceRequest.Builder()
                        .recipientEmails(List.of("invalidemail"))
                        .ccRecipientEmails(List.of("user1@example.com", "user1@example.com", "user1@example.com",
                                "user1@example.com", "user1@example.com", "user1@example.com"))
                        .build()))
                .isUnprocessableEntity()
                .hasErrors("recipient_emails: must be a valid email address", "cc_recipient_emails: You can have 5 recipients at most");
    }

    @Test
    void shouldReturn422WhenSendingNotExistentInvoice() {
        // when - then
        CommonAssertions
                .assertThatErrorListResponse(() -> invoicesController.sendInvoice("123", new SendInvoiceRequest()))
                .isUnprocessableEntity()
                .hasErrors("invoice: Unable to enqueue invoice for email delivery");
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(
                () -> TestClientProvider.createInvalidCredentialsClient().getInvoicesController()
                        .sendInvoice(paidInvoice.getUid(), new SendInvoiceRequest())
        );
    }
}
