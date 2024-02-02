package com.maxio.advancedbilling.controllers.subscriptions;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.SubscriptionsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.SubscriptionRemoveCouponErrorsException;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class SubscriptionsControllerRemoveCouponTest {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final SubscriptionsController SUBSCRIPTIONS_CONTROLLER = CLIENT.getSubscriptionsController();

    private static Product product;
    private static Customer customer;
    private static Coupon percentageCoupon;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        ProductFamily productFamily = TEST_SETUP.createProductFamily();
        product = TEST_SETUP.createProduct(productFamily);
        customer = TEST_SETUP.createCustomer();
        percentageCoupon = TEST_SETUP.createPercentageCoupon(productFamily, "0.5");
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldReturn404WhenSubscriptionNotExists() {
        // when - then
        CommonAssertions.assertNotFound(() -> SUBSCRIPTIONS_CONTROLLER
                .removeCouponFromSubscription(123, "coupon")
        );
    }

    @Test
    void shouldReturn422WhenSubscriptionHasNoCoupons() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);

        // when - then
        CommonAssertions.assertUnprocessableEntity(
                SubscriptionRemoveCouponErrorsException.class,
                () -> SUBSCRIPTIONS_CONTROLLER.removeCouponFromSubscription(subscription.getId(), "coupon"),
                e -> assertThat(e.getSubscription()).containsExactly("This subscription does not have any coupons.")
        );
    }

    @Test
    void shouldReturn422WhenRemovingNotExistingCoupon() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product, b -> b.couponCode(percentageCoupon.getCode()));

        // when - then
        CommonAssertions.assertUnprocessableEntity(
                SubscriptionRemoveCouponErrorsException.class,
                () -> SUBSCRIPTIONS_CONTROLLER.removeCouponFromSubscription(subscription.getId(), "not-existing-coupon"),
                e -> assertThat(e.getSubscription()).containsExactly("Coupon is invalid.")
        );
    }

    @Test
    void shouldRemoveCouponFromSubscription() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product, b -> b.couponCode(percentageCoupon.getCode()));

        // when
        SUBSCRIPTIONS_CONTROLLER.removeCouponFromSubscription(subscription.getId(), subscription.getCouponCode());

        // then
        Subscription updatedSubscription = SUBSCRIPTIONS_CONTROLLER
                .readSubscription(subscription.getId(), null)
                .getSubscription();
        assertThat(updatedSubscription.getCouponCode()).isNull();
    }
}
