package com.maxio.advancedbilling.controllers.proformainvoices;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.ProformaInvoice;
import com.maxio.advancedbilling.models.ProformaInvoiceStatus;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.VoidInvoice;
import com.maxio.advancedbilling.models.VoidInvoiceRequest;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class ProformaInvoicesControllerVoidTest extends ProformaInvoicesTestBase {

    private static Customer customer;

    ProformaInvoicesControllerVoidTest() throws IOException, ApiException {
    }

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        customer = TEST_SETUP.createCustomer();
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    public void shouldVoidProformaInvoice() throws IOException, ApiException {
        // given
        ProformaInvoice proformaInvoice = createBasicProformaInvoice(customer);

        // when
        ProformaInvoice voidedInvoice = PROFORMA_INVOICES_CONTROLLER
                .voidProformaInvoice(proformaInvoice.getUid(), new VoidInvoiceRequest(
                        new VoidInvoice("Duplicate invoice")
                ));

        // then
        assertThat(voidedInvoice).usingRecursiveComparison().ignoringFields("status")
                .isEqualTo(proformaInvoice);
        assertThat(voidedInvoice.getStatus()).isEqualTo(ProformaInvoiceStatus.VOIDED);
    }

    @Test
    void shouldReturn422WhenVoidingVoidedInvoice() throws IOException, ApiException {
        // given
        ProformaInvoice proformaInvoice = createBasicProformaInvoice(customer);
        PROFORMA_INVOICES_CONTROLLER
                .voidProformaInvoice(proformaInvoice.getUid(), new VoidInvoiceRequest(
                        new VoidInvoice("Duplicate invoice")
                ));

        // when - then
        CommonAssertions
                .assertThatErrorListResponse(() -> PROFORMA_INVOICES_CONTROLLER
                        .voidProformaInvoice(proformaInvoice.getUid(), new VoidInvoiceRequest(new VoidInvoice("Duplicate invoice"))))
                .isUnprocessableEntity()
                .hasErrors("Only draft proforma invoices may be voided.");
    }

    @Test
    void shouldReturn422WhenVoidingInvoiceWithoutReason() throws IOException, ApiException {
        // given
        ProformaInvoice proformaInvoice = createBasicProformaInvoice(customer);

        // when - then
        CommonAssertions
                .assertThatErrorListResponse(() -> PROFORMA_INVOICES_CONTROLLER
                        .voidProformaInvoice(proformaInvoice.getUid(), new VoidInvoiceRequest(new VoidInvoice())))
                .isUnprocessableEntity()
                .hasErrors("You must provide a reason for voiding the proforma invoice.");
    }

    @Test
    void shouldReturn404WhenVoidingNotExistentInvoice() {
        // when - then
        CommonAssertions.assertNotFound(() -> PROFORMA_INVOICES_CONTROLLER
                .voidProformaInvoice("123", new VoidInvoiceRequest(new VoidInvoice("Duplicate invoice")))
        );
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(
                () -> TestClient.createInvalidCredentialsClient().getProformaInvoicesController()
                        .voidProformaInvoice("123", new VoidInvoiceRequest(new VoidInvoice("Duplicate invoice")))
        );
    }

    private ProformaInvoice createBasicProformaInvoice(Customer customer) throws IOException, ApiException {
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);
        return CLIENT.getProformaInvoicesController().createProformaInvoice(subscription.getId());
    }

}
