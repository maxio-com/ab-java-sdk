package com.maxio.advancedbilling.controllers.subscriptions;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.SubscriptionsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.ActivateSubscriptionRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.ProductPricePoint;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionState;
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
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SubscriptionsControllerActivateTest {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClientProvider.getClient();
    private static final SubscriptionsController SUBSCRIPTIONS_CONTROLLER = CLIENT.getSubscriptionsController();

    private static Customer customer;
    private static Product freeProduct;
    private static Product paidProduct;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        customer = TEST_SETUP.createCustomer();
        ProductFamily productFamily = TEST_SETUP.createProductFamily();
        freeProduct = TEST_SETUP.createProduct(productFamily);
        paidProduct = TEST_SETUP.createProduct(productFamily, b -> b.priceInCents(100L));
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldReturn404WhenSubscriptionNotExists() {
        // when - then
        CommonAssertions.assertNotFound(() -> SUBSCRIPTIONS_CONTROLLER
                .activateSubscription(123, new ActivateSubscriptionRequest())
        );
    }

    @Test
    void shouldReturn400WhenSubscriptionIsAlreadyActive() throws IOException, ApiException {
        // given
        Subscription activeSubscription = TEST_SETUP.createSubscription(customer, freeProduct);

        // when - then
        CommonAssertions
                .assertThatErrorArrayMapResponse(() -> SUBSCRIPTIONS_CONTROLLER
                        .activateSubscription(activeSubscription.getId(), new ActivateSubscriptionRequest())
                )
                .isBadRequest()
                .hasErrorMap(Map.of("base", List.of("Only trialing or awaiting signup subscriptions can be activated immediately.")));
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn400OnFailureWhenProductIsWithoutTrialAndRevertOnFailureIsToggleable")
    void shouldReturn400OnFailureWhenProductIsWithoutTrialAndRevertOnFailureIsToggleable(Boolean revertOnFailure,
                                                                                         String expectedErrorMapMessage,
                                                                                         SubscriptionState expectedSubscriptionState)
            throws IOException, ApiException {
        // given
        Subscription awaitingSignupSubscriptionWithFailedPaymentProfile = TEST_SETUP.createSubscription(
                customer,
                paidProduct,
                subscriptionCustomizer -> subscriptionCustomizer
                        .initialBillingAt(ZonedDateTime.now().plusDays(5)),
                paymentProfileCustomizer -> paymentProfileCustomizer.fullNumber("2")
        );

        // when - then
        CommonAssertions
                .assertThatErrorArrayMapResponse(() -> SUBSCRIPTIONS_CONTROLLER.activateSubscription(
                        awaitingSignupSubscriptionWithFailedPaymentProfile.getId(),
                        new ActivateSubscriptionRequest.Builder().revertOnFailure(revertOnFailure).build())
                )
                .isBadRequest()
                .hasErrorMap(Map.of("base", List.of(expectedErrorMapMessage)));

        Subscription subscription = SUBSCRIPTIONS_CONTROLLER
                .readSubscription(awaitingSignupSubscriptionWithFailedPaymentProfile.getId(), null)
                .getSubscription();
        assertThat(subscription.getState()).isEqualTo(expectedSubscriptionState);
    }

    private static Stream<Arguments> argsForShouldReturn400OnFailureWhenProductIsWithoutTrialAndRevertOnFailureIsToggleable() {
        return Stream.of(
                Arguments.of(
                        false,
                        "Bogus Gateway: Forced failure. The subscription is now in the 'Canceled' state.",
                        SubscriptionState.CANCELED
                ),
                Arguments.of(
                        true,
                        "Bogus Gateway: Forced failure. The subscription is now in the 'Awaiting Signup' state.",
                        SubscriptionState.AWAITING_SIGNUP
                )
        );
    }

    @Test
    void shouldReturn400WhenProductIsWithoutTrialAndNoPaymentMethodWasOnFile() throws IOException, ApiException {
        // given
        Subscription awaitingSignupSubscriptionWithoutPaymentProfile = TEST_SETUP.createSubscription(
                customer,
                paidProduct,
                subscriptionCustomizer -> subscriptionCustomizer
                        .initialBillingAt(ZonedDateTime.now().plusDays(5))
                        .creditCardAttributes(null)
        );

        // when - then
        CommonAssertions
                .assertThatErrorArrayMapResponse(() -> SUBSCRIPTIONS_CONTROLLER.activateSubscription(
                        awaitingSignupSubscriptionWithoutPaymentProfile.getId(),
                        new ActivateSubscriptionRequest.Builder().revertOnFailure(false).build())
                )
                .isBadRequest()
                .hasErrorMap(Map.of("base", List.of("No payment method was on file for the $1.00 balance. The subscription is now in the 'Canceled' state.")));

        Subscription subscription = SUBSCRIPTIONS_CONTROLLER
                .readSubscription(awaitingSignupSubscriptionWithoutPaymentProfile.getId(), null)
                .getSubscription();
        assertThat(subscription.getState()).isEqualTo(SubscriptionState.CANCELED);
    }

    @Test
    void shouldActivateSubscriptionWhenProductIsWithoutTrial() throws IOException, ApiException {
        // given
        Subscription awaitingSignupSubscription = TEST_SETUP.createSubscription(
                customer,
                paidProduct,
                subscriptionCustomizer -> subscriptionCustomizer
                        .initialBillingAt(ZonedDateTime.now().plusDays(5))
        );

        // when
        Subscription activatedSubscription = SUBSCRIPTIONS_CONTROLLER
                .activateSubscription(awaitingSignupSubscription.getId(), new ActivateSubscriptionRequest())
                .getSubscription();

        // then
        assertThat(activatedSubscription)
                .extracting("id", "state")
                .containsExactly(awaitingSignupSubscription.getId(), SubscriptionState.ACTIVE);
    }

    @Test
    void shouldActivateSubscriptionWhenProductIsWithTrial() throws IOException, ApiException {
        // given
        ProductPricePoint trialProductPricePoint = TEST_SETUP.createProductPricePoint(
                freeProduct,
                "trialProductPricePoint",
                pricePointCustomizer -> pricePointCustomizer
                        .trialType("payment_expected")
                        .trialPriceInCents(500L)
                        .trialInterval(1)
                        .trialIntervalUnit(IntervalUnit.MONTH)
                        .initialChargeAfterTrial(true)
        );

        Subscription awaitingSignupSubscriptionWithTrial = TEST_SETUP.createSubscription(
                customer,
                freeProduct,
                subscriptionCustomizer -> subscriptionCustomizer
                        .initialBillingAt(ZonedDateTime.now().plusDays(5))
                        .productPricePointId(trialProductPricePoint.getId())
        );

        // when
        Subscription activatedSubscription = SUBSCRIPTIONS_CONTROLLER
                .activateSubscription(awaitingSignupSubscriptionWithTrial.getId(), new ActivateSubscriptionRequest())
                .getSubscription();

        // then
        assertThat(activatedSubscription)
                .extracting("id", "state")
                .containsExactly(awaitingSignupSubscriptionWithTrial.getId(), SubscriptionState.TRIALING);
    }
}
