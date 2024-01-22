package com.maxio.advancedbilling.controllers.subscriptions;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.SubscriptionsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionInclude;
import com.maxio.advancedbilling.models.SubscriptionIncludedCoupon;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionsControllerReadTest {
    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final SubscriptionsController SUBSCRIPTIONS_CONTROLLER = CLIENT.getSubscriptionsController();

    private static ProductFamily PRODUCT_FAMILY;
    private static Product PRODUCT;
    private static Customer CUSTOMER;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        PRODUCT_FAMILY = TEST_SETUP.createProductFamily();
        PRODUCT = TEST_SETUP.createProduct(PRODUCT_FAMILY);
        CUSTOMER = TEST_SETUP.createCustomer();
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(CUSTOMER);
    }

    @Test
    void shouldThrow404IfSubscriptionDoesNotExist() {
        // when then
        CommonAssertions.assertNotFound(() -> SUBSCRIPTIONS_CONTROLLER
                .readSubscription(Integer.MAX_VALUE - 1, List.of()));
    }

    @Test
    void shouldReadSubscription() throws IOException, ApiException {
        // given
        Subscription subscription = TEST_SETUP.createSubscription(CUSTOMER, PRODUCT);

        // when
        Subscription readSubscription = SUBSCRIPTIONS_CONTROLLER.readSubscription(subscription.getId(), List.of())
                .getSubscription();

        // then
        assertThat(readSubscription)
                .usingRecursiveComparison()
                .ignoringFields("currentBillingAmountInCents", "updatedAt")
                .isEqualTo(subscription);
    }

    @Test
    void shouldReadSubscriptionAndIncludeAdditionalFields() throws IOException, ApiException {
        // given
        Coupon coupon = TEST_SETUP.createPercentageCoupon(PRODUCT_FAMILY, 0.5);
        Subscription subscription = TEST_SETUP.createSubscription(CUSTOMER, PRODUCT, b -> b.couponCode(coupon.getCode()));

        // when
        Subscription subscriptionIncludeNone = SUBSCRIPTIONS_CONTROLLER.readSubscription(subscription.getId(), List.of())
                .getSubscription();
        Subscription subscriptionIncludeAll = SUBSCRIPTIONS_CONTROLLER.readSubscription(subscription.getId(),
                        List.of(SubscriptionInclude.COUPONS, SubscriptionInclude.SELF_SERVICE_PAGE_TOKEN))
                .getSubscription();

        // then
        assertThat(subscriptionIncludeAll)
                .usingRecursiveComparison()
                .ignoringFields("coupons", "selfServicePageToken", "updatedAt")
                .isEqualTo(subscriptionIncludeNone);

        assertThat(subscriptionIncludeNone.getCoupons()).isNull();
        assertThat(subscriptionIncludeNone.getSelfServicePageToken()).isNull();
        assertThat(subscriptionIncludeAll.getCoupons())
                .isNotNull()
                .hasSize(1)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactly(new SubscriptionIncludedCoupon.Builder()
                        .code(coupon.getCode())
                        .useCount(0)
                        .usesAllowed(1)
                        .recurring(false)
                        .percentage("0.5")
                        .build());
        assertThat(subscriptionIncludeAll.getSelfServicePageToken()).isNotNull();
    }
}
