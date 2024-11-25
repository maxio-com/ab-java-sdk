package com.maxio.advancedbilling.controllers.proformainvoices;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.CreateSubscription;
import com.maxio.advancedbilling.models.CreateSubscriptionRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.ProformaInvoice;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ProformaInvoicesControllerCreateSignupProformaTest extends ProformaInvoicesTestBase {

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
    void shouldCreateSignupProforma() throws IOException, ApiException {
        // given - when
        ProformaInvoiceWithComponents invoiceWithData = createSignupProformaInvoice(customer);

        // then
        assertProformaInvoice(customer, invoiceWithData, true, true);
    }

    @Test
    void shouldReturn422WhenCreatingProformaInvoiceWithInvalidData() {
        // when - then
        CommonAssertions
                .assertThatErrorArrayMapResponse(() -> PROFORMA_INVOICES_CONTROLLER.createSignupProformaInvoice(
                        new CreateSubscriptionRequest(new CreateSubscription.Builder()
                                .productId(11)
                                .build()
                                )
                        )
                )
                .isUnprocessableEntity()
                .hasErrorMap(Map.of("base", List.of("Couldn't find Product by 11")));
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getProformaInvoicesController()
                .createSignupProformaInvoice(null)
        );
    }

    private ProformaInvoiceWithComponents createSignupProformaInvoice(Customer customer) throws IOException, ApiException {
        Component meteredComponent = TEST_SETUP.createMeteredComponent(productFamily, 11.5);
        Component quantityBasedComponent = TEST_SETUP.createQuantityBasedComponent(productFamily.getId());

        ProformaInvoice proformaInvoice = CLIENT.getProformaInvoicesController().createSignupProformaInvoice(
                new CreateSubscriptionRequest(
                        getCreateSubscription(customer, meteredComponent, quantityBasedComponent)
                )
        );

        return new ProformaInvoiceWithComponents(proformaInvoice, quantityBasedComponent, meteredComponent);
    }

}
