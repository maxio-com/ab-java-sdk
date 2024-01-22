package com.maxio.advancedbilling.controllers.subscriptions;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.SubscriptionsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.SubscriptionAddCouponErrorException;
import com.maxio.advancedbilling.models.AddCouponsRequest;
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
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SubscriptionsControllerAddCouponsTest {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final SubscriptionsController SUBSCRIPTIONS_CONTROLLER = CLIENT.getSubscriptionsController();

    private static ProductFamily productFamily;
    private static Product product;
    private static Customer customer;
    private static Subscription subscription;
    private static Coupon stackableCoupon;
    private static Coupon nonStackableCoupon;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        productFamily = TEST_SETUP.createProductFamily();
        product = TEST_SETUP.createProduct(productFamily);
        customer = TEST_SETUP.createCustomer();
        subscription = TEST_SETUP.createSubscription(customer, product);
        stackableCoupon = TEST_SETUP.createPercentageCoupon(productFamily, "0.5");
        nonStackableCoupon = TEST_SETUP.createPercentageCoupon(productFamily, "0.25", false);
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldReturn404WhenSubscriptionNotExists() {
        // when - then
        CommonAssertions.assertNotFound(() -> SUBSCRIPTIONS_CONTROLLER
                .applyCouponToSubscription(123, "coupon", null)
        );
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn422WhenRequestIsIncorrect")
    void shouldReturn422WhenRequestIsIncorrect(String code, AddCouponsRequest request,
                                               Consumer<SubscriptionAddCouponErrorException> additionalRequirements) {
        // when - then
        CommonAssertions.assertUnprocessableEntity(
                SubscriptionAddCouponErrorException.class,
                () -> SUBSCRIPTIONS_CONTROLLER.applyCouponToSubscription(subscription.getId(), code, request),
                additionalRequirements
        );
    }

    private static Stream<Arguments> argsForShouldReturn422WhenRequestIsIncorrect() {
        return Stream.of(
                Arguments.arguments(
                        null, null,
                        (Consumer<SubscriptionAddCouponErrorException>) e -> {
                            assertThat(e.getCodes()).isNull();
                            assertThat(e.getCouponCode()).isNull();
                            assertThat(e.getCouponCodes()).isNull();
                            assertThat(e.getSubscription()).containsExactly("A valid coupon code is required.");
                        }
                ),
                Arguments.arguments(
                        null, new AddCouponsRequest(),
                        (Consumer<SubscriptionAddCouponErrorException>) e -> {
                            assertThat(e.getCodes()).isNull();
                            assertThat(e.getCouponCode()).isNull();
                            assertThat(e.getCouponCodes()).isNull();
                            assertThat(e.getSubscription()).containsExactly("A valid coupon code is required.");
                        }
                ),
                Arguments.arguments(
                        null, new AddCouponsRequest(List.of("not-existing-coupon")),
                        (Consumer<SubscriptionAddCouponErrorException>) e -> {
                            assertThat(e.getCodes()).isNull();
                            assertThat(e.getCouponCode()).isNull();
                            assertThat(e.getCouponCodes()).containsExactly("Coupon Codes: 'not-existing-coupon' - Coupon code could not be found.");
                            assertThat(e.getSubscription()).containsExactly("Coupon is invalid.");
                        }
                ),
                Arguments.arguments(
                        "code-in-query-param", new AddCouponsRequest(List.of("not-existing-coupon")),
                        (Consumer<SubscriptionAddCouponErrorException>) e -> {
                            assertThat(e.getCodes()).isNull();
                            assertThat(e.getCouponCode()).isNull();
                            assertThat(e.getCouponCodes()).isNull();
                            assertThat(e.getSubscription()).containsExactlyInAnyOrder("Coupon is invalid.", "Only one of 'code' or 'codes' may be set.");
                        }
                ),
                Arguments.arguments(
                        "code-in-query-param", null,
                        (Consumer<SubscriptionAddCouponErrorException>) e -> {
                            assertThat(e.getCodes()).isNull();
                            assertThat(e.getCouponCode()).containsExactly("Coupon Code: 'code-in-query-param' - Coupon code could not be found.");
                            assertThat(e.getCouponCodes()).isNull();
                            assertThat(e.getSubscription()).containsExactly("Coupon is invalid.");
                        }
                ),
                Arguments.arguments(
                        null, new AddCouponsRequest(List.of(stackableCoupon.getCode(), nonStackableCoupon.getCode())),
                        (Consumer<SubscriptionAddCouponErrorException>) e -> {
                            assertThat(e.getCodes()).isNull();
                            assertThat(e.getCouponCode()).isNull();
                            assertThat(e.getCouponCodes()).containsExactly("Coupon Codes: '%s' - That coupon is not stackable".formatted(nonStackableCoupon.getCode()));
                            assertThat(e.getSubscription()).containsExactly("Coupon is invalid.");
                        }
                )
        );
    }

    @Test
    void shouldReturn422WhenApplyingNonStackableCouponSecondTime() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product, b -> b.couponCode(nonStackableCoupon.getCode()));

        // when - then
        CommonAssertions.assertUnprocessableEntity(
                SubscriptionAddCouponErrorException.class,
                () -> SUBSCRIPTIONS_CONTROLLER.applyCouponToSubscription(subscription.getId(), null, new AddCouponsRequest(List.of(nonStackableCoupon.getCode()))),
                e -> {
                    assertThat(e.getCodes()).containsExactly("Coupon Codes: Subscription already has at least one non-stackable coupon.");
                    assertThat(e.getCouponCode()).isNull();
                    assertThat(e.getCouponCodes()).isNull();
                    assertThat(e.getSubscription()).containsExactly("Coupon is invalid.");
                }
        );
    }

    @Test
    void shouldAddCouponsToSubscription() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);
        Coupon percentageCoupon = TEST_SETUP.createPercentageCoupon(productFamily, "0.1");

        // when
        subscription = SUBSCRIPTIONS_CONTROLLER
                .applyCouponToSubscription(subscription.getId(), null,
                        new AddCouponsRequest(List.of(stackableCoupon.getCode(), percentageCoupon.getCode()))
                )
                .getSubscription();

        // then
        assertThat(subscription.getCoupons()).isNull();
        assertThat(subscription.getCouponCode()).isEqualTo(stackableCoupon.getCode());
        assertThat(subscription.getCouponCodes()).containsExactly(stackableCoupon.getCode(), percentageCoupon.getCode());
    }
}
