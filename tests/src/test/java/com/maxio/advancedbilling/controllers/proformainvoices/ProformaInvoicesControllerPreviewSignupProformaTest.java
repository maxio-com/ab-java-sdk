package com.maxio.advancedbilling.controllers.proformainvoices;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.ProformaInvoicesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateSubscription;
import com.maxio.advancedbilling.models.CreateSubscriptionRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class ProformaInvoicesControllerPreviewSignupProformaTest {

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
    void shouldPreviewSignupProformaWithNextProforma() throws IOException, ApiException {
        // given-when
        ProformaInvoicesCreator proformaInvoicesCreator = new ProformaInvoicesCreator();
        ProformaInvoicesCreator.SignupProformaPreviewWithComponents previewWithData =
                proformaInvoicesCreator.previewSignupProformaInvoice(customer);

        // then
        proformaInvoicesCreator.assertProformaInvoice(customer,
                new ProformaInvoicesCreator.ProformaInvoiceWithComponents(previewWithData.preview().getCurrentProformaInvoice(),
                        previewWithData.quantityBasedComponent(), previewWithData.meteredComponent()),
                false, true);

        assertThat(previewWithData.preview().getNextProformaInvoice()).usingRecursiveComparison()
                .ignoringFields("createdAt", "subtotalAmount", "totalAmount", "uid", "lineItems",
                        "deliveryDate", "dueAmount")
                .isEqualTo(previewWithData.preview().getCurrentProformaInvoice());
    }

    @Test
    void shouldReturn422WhenCreatingProformaInvoiceWithInvalidData() {
        // when - then
        CommonAssertions
                .assertThatErrorArrayMapResponse(() -> PROFORMA_INVOICES_CONTROLLER.previewSignupProformaInvoice(
                        null,
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
        CommonAssertions.assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getProformaInvoicesController()
                .previewSignupProformaInvoice(null, null)
        );
    }

}
