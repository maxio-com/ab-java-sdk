package com.maxio.advancedbilling.controllers.subscriptions;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.SubscriptionsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionsControllerFindTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final SubscriptionsController SUBSCRIPTIONS_CONTROLLER = CLIENT.getSubscriptionsController();

    private static Product product;
    private static Customer customer;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        product = TEST_SETUP.createProduct(TEST_SETUP.createProductFamily());
        customer = TEST_SETUP.createCustomer();
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldThrow404IfSubscriptionDoesNotExist() {
        // when then
        CommonAssertions.assertNotFound(() -> SUBSCRIPTIONS_CONTROLLER
                .findSubscription("non-existing-reference"));
    }

    @Test
    void shouldFindSubscriptionByReference() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product, customizer -> customizer.reference(randomAlphanumeric(10)));

        // when
        Subscription readSubscription = SUBSCRIPTIONS_CONTROLLER.findSubscription(subscription.getReference())
                .getSubscription();

        // then
        assertThat(readSubscription)
                .usingRecursiveComparison()
                .ignoringFields("currentBillingAmountInCents", "updatedAt")
                .isEqualTo(subscription);
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product, customizer -> customizer.reference(randomAlphanumeric(10)));

        // when - then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient()
                .getSubscriptionsController()
                .findSubscription(subscription.getReference())
        );
    }
}
