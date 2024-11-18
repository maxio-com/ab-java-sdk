package com.maxio.advancedbilling.controllers.referralcodes;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.ReferralCodesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.ReferralCode;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.utils.TestFixtures;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class ReferralCodesControllerValidateTest {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final ReferralCodesController REFERRAL_CODES_CONTROLLER = CLIENT.getReferralCodesController();
    private static Product product;
    private static Customer customer;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        ProductFamily productFamily = TEST_SETUP.createProductFamily();
        product = TEST_SETUP.createProduct(productFamily, b -> b.priceInCents(1250));
        customer = new TestSetup().createCustomer();
    }

    @AfterAll
    static void deleteCustomer() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldValidateReferralCode() throws IOException, ApiException {
        // given
        Subscription subscription = new TestSetup().createSubscription(customer, product);
        assertThat(subscription.getReferralCode()).isNotBlank();

        // when
        ReferralCode response = REFERRAL_CODES_CONTROLLER.validateReferralCode(subscription.getReferralCode())
                .getReferralCode();

        // then
        assertThat(response.getCode()).isEqualTo(subscription.getReferralCode());
        assertThat(response.getSubscriptionId()).isEqualTo(subscription.getId());
        assertThat(response.getId()).isNotNull();
        assertThat(response.getSiteId()).isEqualTo(TestFixtures.SITE_ID);
    }

    @Test
    void shouldReturn404IfCodeDoesNotExist() {
        // when - then
        assertNotFound(() -> REFERRAL_CODES_CONTROLLER.validateReferralCode("non_existent"), "Invalid referral code.");
    }

    @Test
    void shouldThrowExceptionOnInvalidCredentials() throws IOException, ApiException {
        // given
        Subscription subscription = new TestSetup().createSubscription(customer, product);
        assertThat(subscription.getReferralCode()).isNotBlank();

        // when - then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getReferralCodesController()
                .validateReferralCode(subscription.getReferralCode()));
    }
}
