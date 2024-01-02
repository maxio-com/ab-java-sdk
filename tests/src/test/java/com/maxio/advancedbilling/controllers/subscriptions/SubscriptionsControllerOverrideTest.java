package com.maxio.advancedbilling.controllers.subscriptions;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.SubscriptionsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.OverrideSubscription;
import com.maxio.advancedbilling.models.OverrideSubscriptionRequest;
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
import java.time.ZonedDateTime;
import java.util.Random;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatSingleErrorResponse;
import static org.assertj.core.api.Assertions.assertThat;

class SubscriptionsControllerOverrideTest {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final SubscriptionsController SUBSCRIPTIONS_CONTROLLER = CLIENT.getSubscriptionsController();

    private static ProductFamily productFamily;
    private static Customer customer;
    private static Subscription subscription;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        productFamily = TEST_SETUP.createProductFamily();
        Product product = TEST_SETUP.createProduct(productFamily);
        customer = TEST_SETUP.createCustomer();
        subscription = TEST_SETUP.createSubscription(customer, product, b -> b.nextBillingAt(ZonedDateTime.now().plusDays(7)));
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldReturn404WhenSubscriptionNotExists() {
        // when - then
        CommonAssertions.assertNotFound(() -> SUBSCRIPTIONS_CONTROLLER
                .overrideSubscription(123, new OverrideSubscriptionRequest())
        );
    }

    @Test
    void shouldReturn422WhenProvidedCurrentPeriodStartsAtIsAfterTheCurrentDatetime() {
        // when - then
        assertThatSingleErrorResponse(() -> SUBSCRIPTIONS_CONTROLLER.overrideSubscription(
                        subscription.getId(),
                        new OverrideSubscriptionRequest(new OverrideSubscription.Builder()
                                .currentPeriodStartsAt(ZonedDateTime.now().plusDays(1))
                                .build()
                        )
                )
        )
                .isUnprocessableEntity()
                .hasErrorMessage("Current period starts at: must be before current date and time");
    }

    @Test
    void shouldReturn422WhenSubscriptionIsAlreadyBilled() throws IOException, ApiException {
        // given
        Product product = TEST_SETUP.createProduct(productFamily, b -> b.priceInCents(new Random().nextInt(1, 100000)));
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);

        // when - then
        assertThatSingleErrorResponse(() -> SUBSCRIPTIONS_CONTROLLER.overrideSubscription(
                        subscription.getId(),
                        new OverrideSubscriptionRequest(new OverrideSubscription.Builder()
                                .currentPeriodStartsAt(ZonedDateTime.now().minusDays(1))
                                .build()
                        )
                )
        )
                .isUnprocessableEntity()
                .hasErrorMessage("Current period starts at: can only be updated if subscription has no statements or invoices");
    }

    @Test
    void shouldOverrideSubscription() throws IOException, ApiException {
        // when
        SUBSCRIPTIONS_CONTROLLER.overrideSubscription(
                subscription.getId(),
                new OverrideSubscriptionRequest(new OverrideSubscription.Builder()
                        .activatedAt(ZonedDateTime.parse("2020-01-01T00:00:00.000Z"))
                        .expiresAt(ZonedDateTime.parse("2020-12-31T23:59:59.000Z"))
                        .currentPeriodStartsAt(ZonedDateTime.parse("2020-01-05T00:00:00.000Z"))
                        .build()
                )
        );

        // then
        Subscription overriddenSubscription = SUBSCRIPTIONS_CONTROLLER
                .readSubscription(subscription.getId(), null)
                .getSubscription();
        assertThat(overriddenSubscription.getActivatedAt()).isEqualTo("2020-01-01T00:00:00.000Z");
        assertThat(overriddenSubscription.getExpiresAt()).isEqualTo("2020-12-31T23:59:59.000Z");
        assertThat(overriddenSubscription.getCurrentPeriodStartedAt()).isEqualTo("2020-01-05T00:00:00.000Z");
    }
}
