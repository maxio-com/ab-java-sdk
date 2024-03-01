package com.maxio.advancedbilling.controllers.proformainvoices;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.ProformaInvoicesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ListProformaInvoicesResponse;
import com.maxio.advancedbilling.models.ListSubscriptionGroupProformaInvoicesInput;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.SubscriptionGroupSignupResponse;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This class tests both `Create Consolidated Proforma Invoices` and `List Subscription Group Proforma Invoices`
 * operations, as the Creation response is asynchronous and has no specific response, but it's needed to execute listing.
 */
public class ProformaInvoicesControllerSubscriptionGroupsTest {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final ProformaInvoicesController PROFORMA_INVOICES_CONTROLLER = CLIENT
            .getProformaInvoicesController();

    private static SubscriptionGroupSignupResponse groupSignup;

    @BeforeAll
    static void setUp() throws IOException, ApiException, InterruptedException {
        ProductFamily productFamily = TEST_SETUP.createProductFamily();
        Product product = TEST_SETUP.createProduct(productFamily, b -> b.priceInCents(1250));
        Component meteredComponent = TEST_SETUP.createMeteredComponent(productFamily, 11.5);

        groupSignup = TEST_SETUP.signupWithSubscriptionGroup(product, meteredComponent);
        PROFORMA_INVOICES_CONTROLLER.createConsolidatedProformaInvoice(groupSignup.getUid());

        Thread.sleep(5000);
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        TestTeardown testTeardown = new TestTeardown();
        testTeardown.deleteSubscriptionGroup(groupSignup);
    }

    @Test
    void shouldListGroupProformas() throws IOException, ApiException {
        // given-when
        ListProformaInvoicesResponse listProformaInvoicesResponse = PROFORMA_INVOICES_CONTROLLER
                .listSubscriptionGroupProformaInvoices(new ListSubscriptionGroupProformaInvoicesInput.Builder()
                        .uid(groupSignup.getUid())
                        .build()
                );

        // then
        assertThat(listProformaInvoicesResponse.getProformaInvoices()).isNotEmpty();
    }

    @Test
    void shouldReturn404WhenCreatingConsolidatedProformaInvoiceForNonGroup() {
        // when - then
        CommonAssertions.assertNotFound(
                () -> PROFORMA_INVOICES_CONTROLLER.createConsolidatedProformaInvoice("123")
        );
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getProformaInvoicesController()
                .createConsolidatedProformaInvoice("123")
        );
    }

}
