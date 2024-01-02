package com.maxio.advancedbilling.controllers.invoices;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
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
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final InvoicesController INVOICES_CONTROLLER = CLIENT.getInvoicesController();

    private static Customer customer;
    private static Invoice paidInvoice;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        Product product = TEST_SETUP.createProduct(TEST_SETUP.createProductFamily(), b -> b.priceInCents(1250));
        customer = TEST_SETUP.createCustomer();
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);
        paidInvoice = INVOICES_CONTROLLER
                .listInvoices(new ListInvoicesInput.Builder().subscriptionId(subscription.getId()).build())
                .getInvoices()
                .get(0);
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldSendInvoice() {
        // when - then
        assertThatNoException().isThrownBy(() -> INVOICES_CONTROLLER.sendInvoice(
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
                .assertThatErrorListResponse(() -> INVOICES_CONTROLLER.sendInvoice(paidInvoice.getUid(), new SendInvoiceRequest.Builder()
                        .recipientEmails(List.of("invalidemail"))
                        .ccRecipientEmails(List.of("user1@example.com","user1@example.com","user1@example.com",
                                "user1@example.com","user1@example.com","user1@example.com"))
                        .build()))
                .isUnprocessableEntity()
                .hasErrors("recipient_emails: must be a valid email address", "cc_recipient_emails: You can have 5 recipients at most");
    }

    @Test
    void shouldReturn422WhenSendingNotExistentInvoice() {
        // when - then
        CommonAssertions
                .assertThatErrorListResponse(() -> INVOICES_CONTROLLER.sendInvoice("123", new SendInvoiceRequest()))
                .isUnprocessableEntity()
                .hasErrors("invoice: Unable to enqueue invoice for email delivery");
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(
                () -> TestClient.createInvalidCredentialsClient().getInvoicesController()
                        .sendInvoice(paidInvoice.getUid(), new SendInvoiceRequest())
        );
    }
}
