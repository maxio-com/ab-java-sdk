package com.maxio.advancedbilling.controllers.subscriptionstatus;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.DelayedCancellationResponse;
import com.maxio.advancedbilling.models.Subscription;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionStatusControllerCancelDelayedCancellationTest extends SubscriptionStatusControllerTestBase {

    @Test
    void shouldCancelDelayedCancellation() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();
        ZonedDateTime timestamp = ZonedDateTime.now().minusSeconds(5);

        // when
        subscriptionStatusController.initiateDelayedCancellation(subscription.getId(), null);
        DelayedCancellationResponse delayedCancellationResponse = subscriptionStatusController
                .cancelDelayedCancellation(subscription.getId());

        Subscription updatedSubscription = subscriptionsController.readSubscription(subscription.getId(), null)
                .getSubscription();

        // then
        assertThat(delayedCancellationResponse.getMessage())
                .isEqualTo("This subscription will no longer cancel at the end of the period");
        assertThat(delayedCancellationResponse.getAdditionalProperties()).isEmpty();

        assertThat(updatedSubscription).usingRecursiveComparison()
                .ignoringFields("updatedAt", "currentBillingAmountInCents")
                .isEqualTo(subscription);
        assertThat(updatedSubscription.getUpdatedAt()).isAfter(timestamp);
        assertThat(updatedSubscription.getScheduledCancellationAt()).isNull();
        assertThat(updatedSubscription.getDelayedCancelAt()).isNull();
        assertThat(updatedSubscription.getCancelAtEndOfPeriod()).isFalse();
    }

    @Test
    void shouldNotCancelDelayedCancellationForNonExistentSubscription() {
        assertNotFound(() -> subscriptionStatusController.cancelDelayedCancellation(99999999));
    }

    @Test
    void shouldNotCancelDelayedCancellationProvidingInvalidCredentials() throws IOException, ApiException {
        Subscription subscription = createSubscription();
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getSubscriptionStatusController()
                .cancelDelayedCancellation(subscription.getId()));
    }

}
