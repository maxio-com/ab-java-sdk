package com.maxio.advancedbilling.controllers.subscriptioncomponents;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.SubscriptionComponentsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionComponent;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.controllers.subscriptioncomponents.SubscriptionComponentsAssertions.assertSubscriptionComponent;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;


public class SubscriptionComponentsControllerReadTest {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final SubscriptionComponentsController SUBSCRIPTION_COMPONENTS_CONTROLLER =
            TestClient.createClient().getSubscriptionComponentsController();

    private static ProductFamily productFamily;
    private static Component component;
    private static Customer customer;
    private static Subscription subscription;

    @BeforeAll
    static void setup() throws IOException, ApiException {
        productFamily = TEST_SETUP.createProductFamily();
        Product product = TEST_SETUP.createProduct(productFamily);
        component = TEST_SETUP.createQuantityBasedComponent(productFamily.getId());
        customer = TEST_SETUP.createCustomer();
        subscription = TEST_SETUP.createSubscription(customer, product);
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldReadSubscriptionComponent() throws IOException, ApiException {
        // given
        SubscriptionComponent subscriptionComponent = SUBSCRIPTION_COMPONENTS_CONTROLLER
                .readSubscriptionComponent(subscription.getId(), component.getId()).getComponent();

        // then
        assertSubscriptionComponent(subscriptionComponent, component, subscription, productFamily);
    }

    @Test
    void shouldNotReadComponentWhenSubscriptionDoesNotExist() {
        assertNotFound(() -> SUBSCRIPTION_COMPONENTS_CONTROLLER.readSubscriptionComponent(123, component.getId()));
    }

    @Test
    void shouldNotReadNonExistentSubscriptionComponent() {
        assertNotFound(() -> SUBSCRIPTION_COMPONENTS_CONTROLLER.readSubscriptionComponent(subscription.getId(), 123));
    }

    @Test
    void shouldNotReadSubscriptionComponentWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getSubscriptionComponentsController()
                .readSubscriptionComponent(subscription.getId(), component.getId()));
    }

}
