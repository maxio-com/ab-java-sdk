package com.maxio.advancedbilling.controllers.paymentprofiles;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.PaymentProfilesController;
import com.maxio.advancedbilling.controllers.SubscriptionsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateSubscription;
import com.maxio.advancedbilling.models.CreateSubscriptionRequest;
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

class PaymentProfilesControllerSendRequestPaymentUpdateEmailTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final PaymentProfilesController PAYMENT_PROFILES_CONTROLLER = CLIENT.getPaymentProfilesController();
    private static final SubscriptionsController SUBSCRIPTIONS_CONTROLLER = CLIENT.getSubscriptionsController();

    private static Customer customer;
    private static Subscription subscription;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        Product product = TEST_SETUP.createProduct(TEST_SETUP.createProductFamily());
        customer = TEST_SETUP.createCustomer();
        subscription = SUBSCRIPTIONS_CONTROLLER
                .createSubscription(new CreateSubscriptionRequest(new CreateSubscription.Builder()
                                .productId(product.getId())
                                .customerId(customer.getId())
                                .build()
                        )
                )
                .getSubscription();
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldReturn422WhenTooManyRequests() throws IOException, ApiException {
        // when
        for (int i = 0; i < 5; i++) {
            // happy path tested here as well (no need to create a separate test for that)
            PAYMENT_PROFILES_CONTROLLER.sendRequestUpdatePaymentEmail(subscription.getId());
        }

        // then
        CommonAssertions
                .assertThatErrorListResponse(() -> PAYMENT_PROFILES_CONTROLLER
                        .sendRequestUpdatePaymentEmail(subscription.getId())
                )
                .isUnprocessableEntity()
                .hasErrors("Too many requests. You can perform 5 requests within 00:30:00");
    }

    @Test
    void shouldReturn404ForNotExistentSubscriptionId() {
        // when - then
        CommonAssertions.assertNotFound(
                () -> PAYMENT_PROFILES_CONTROLLER.sendRequestUpdatePaymentEmail(123)
        );
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(
                () -> TestClient.createInvalidCredentialsClient()
                        .getPaymentProfilesController()
                        .sendRequestUpdatePaymentEmail(subscription.getId())
        );
    }
}
