package com.maxio.advancedbilling.controllers.proformainvoices;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.ProformaInvoicesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.ProformaInvoice;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class ProformaInvoicesControllerReadTest {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final ProformaInvoicesController PROFORMA_INVOICES_CONTROLLER = CLIENT
            .getProformaInvoicesController();

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
    void shouldReadProformaInvoice() throws IOException, ApiException {
        // given
        ProformaInvoice createdProformaInvoice = new ProformaInvoicesCreator()
                .createProformaInvoiceWithComponents(customer).invoice();

        // when
        ProformaInvoice proformaInvoice = PROFORMA_INVOICES_CONTROLLER.readProformaInvoice(createdProformaInvoice.getUid());

        // then
        assertThat(proformaInvoice).usingRecursiveComparison().isEqualTo(createdProformaInvoice);
    }

    @Test
    void shouldReturn404WhenReadingNonExistentProformaInvoice() {
        // when - then
        CommonAssertions.assertNotFound(
                () -> PROFORMA_INVOICES_CONTROLLER.readProformaInvoice("123")
        );
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getProformaInvoicesController()
                .readProformaInvoice("123")
        );
    }

}
