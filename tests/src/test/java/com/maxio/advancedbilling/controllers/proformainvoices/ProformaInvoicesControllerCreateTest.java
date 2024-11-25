package com.maxio.advancedbilling.controllers.proformainvoices;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ProformaInvoicesControllerCreateTest extends ProformaInvoicesTestBase {

    private Customer customer;

    @BeforeAll
    void setUp() throws IOException, ApiException {
        customer = TEST_SETUP.createCustomer();
    }

    @AfterAll
    void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldCreateProformaInvoice() throws IOException, ApiException {
        // given - when
        ProformaInvoiceWithComponents invoiceWithData = createProformaInvoiceWithComponents(customer);

        // then
        assertProformaInvoice(customer, invoiceWithData, true, false);
    }

    @Test
    void shouldReturn404WhenCreatingProformaInvoiceForNonExistentSubscription() {
        // when - then
        CommonAssertions.assertNotFound(
                () -> PROFORMA_INVOICES_CONTROLLER.createProformaInvoice(123)
        );
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getProformaInvoicesController()
                .createProformaInvoice(123)
        );
    }

}
