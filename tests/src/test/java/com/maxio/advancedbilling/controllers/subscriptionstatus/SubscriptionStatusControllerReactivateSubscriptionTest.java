package com.maxio.advancedbilling.controllers.subscriptionstatus;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CancellationOptions;
import com.maxio.advancedbilling.models.CancellationRequest;
import com.maxio.advancedbilling.models.ReactivateSubscriptionRequest;
import com.maxio.advancedbilling.models.ReactivationBilling;
import com.maxio.advancedbilling.models.ReactivationCharge;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.containers.ReactivateSubscriptionRequestResume;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.models.SubscriptionState.CANCELED;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionStatusControllerReactivateSubscriptionTest extends SubscriptionStatusControllerTestBase {

    @Test
    void shouldReactivateSubscription() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();
        subscriptionStatusController.cancelSubscription(subscription.getId(), new CancellationRequest(
                new CancellationOptions()
        ));

        // when
        Subscription reactivatedSubscription = subscriptionStatusController.reactivateSubscription(subscription.getId(),
                        new ReactivateSubscriptionRequest.Builder()
                                .calendarBilling(new ReactivationBilling(ReactivationCharge.PRORATED))
                                .includeTrial(true)
                                .preserveBalance(true)
                                .couponCode("ff")
                                .useCreditsAndPrepayments(true)
                                .resume(ReactivateSubscriptionRequestResume.fromBoolean(true))
                                .build())
                .getSubscription();

        // then
        assertThat(reactivatedSubscription).usingRecursiveComparison()
                .ignoringFields("updatedAt", "cancelAtEndOfPeriod", "previousState", "productPricePointType",
                        "dunningCommunicationDelayEnabled", "prepaidDunning", "customer.countryName", "customer.stateName",
                        "customer.locale", "customer.additionalProperties")
                .isEqualTo(subscription);
        assertThat(reactivatedSubscription.getPreviousState()).isEqualTo(CANCELED);
    }

    @Test
    void shouldNotReactivateActiveSubscription() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();

        // when - then
        assertThatErrorListResponse(() -> subscriptionStatusController.reactivateSubscription(subscription.getId(),
                new ReactivateSubscriptionRequest()))
                .isUnprocessableEntity()
                .hasErrors("Cannot reactivate a subscription that is not marked \"Canceled\" or \"Trial Ended\".");
    }

    @Test
    void shouldNotReactivateNonExistentSubscription() {
        assertNotFound(() -> subscriptionStatusController.reactivateSubscription(5, new ReactivateSubscriptionRequest()));
    }

    @Test
    void shouldNotReactivateSubscriptionWhenProvidingInvalidCredentials() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();

        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getSubscriptionStatusController()
                .reactivateSubscription(subscription.getId(),
                        new ReactivateSubscriptionRequest()));
    }

}
