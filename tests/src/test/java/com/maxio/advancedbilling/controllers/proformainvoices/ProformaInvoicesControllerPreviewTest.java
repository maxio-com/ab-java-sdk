package com.maxio.advancedbilling.controllers.proformainvoices;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ProformaInvoicesControllerPreviewTest extends ProformaInvoicesTestBase {

    private static Customer customer;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        customer = TEST_SETUP.createCustomer();
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldPreviewProformaInvoice() throws IOException, ApiException {
        // given - when
        ProformaInvoiceWithComponents invoiceWithData = previewProformaInvoiceWithComponents(customer);

        // then
        assertProformaInvoice(customer, invoiceWithData, false, false);
    }

    @Test
    void shouldReturn404WhenCreatingProformaInvoiceForNonExistentSubscription() {
        // when - then
        CommonAssertions.assertNotFound(
                () -> PROFORMA_INVOICES_CONTROLLER.previewProformaInvoice(123)
        );
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getProformaInvoicesController()
                .previewProformaInvoice(123)
        );
    }

    private ProformaInvoiceWithComponents previewProformaInvoiceWithComponents(Customer customer) throws IOException, ApiException {
        Component meteredComponent = TEST_SETUP.createMeteredComponent(productFamily, 11.5);
        Component quantityBasedComponent = TEST_SETUP.createQuantityBasedComponent(productFamily.getId());
        Subscription subscription = setupSubscription(customer, quantityBasedComponent, meteredComponent);

        return new ProformaInvoiceWithComponents(
                CLIENT.getProformaInvoicesController().previewProformaInvoice(subscription.getId()),
                quantityBasedComponent, meteredComponent
        );
    }

}
