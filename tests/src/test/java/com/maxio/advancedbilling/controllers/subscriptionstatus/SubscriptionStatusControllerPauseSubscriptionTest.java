package com.maxio.advancedbilling.controllers.subscriptionstatus;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.AutoResume;
import com.maxio.advancedbilling.models.PauseRequest;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionState;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionStatusControllerPauseSubscriptionTest extends SubscriptionStatusControllerTestBase {

    @Test
    void shouldPauseActiveSubscription() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();
        ZonedDateTime timestamp = ZonedDateTime.now().minusSeconds(5);

        // when
        Subscription pausedSubscription = subscriptionStatusController
                .pauseSubscription(subscription.getId(), null).getSubscription();

        // then
        assertThat(pausedSubscription).usingRecursiveComparison()
                .ignoringFields("state", "updatedAt", "onHoldAt", "prepaidDunning",
                        "productPricePointType", "dunningCommunicationDelayEnabled",
                        "customer.countryName", "customer.stateName", "customer.locale", "customer.additionalProperties")
                .isEqualTo(subscription);
        assertThat(pausedSubscription.getState()).isEqualTo(SubscriptionState.ON_HOLD);
        assertThat(pausedSubscription.getUpdatedAt()).isAfter(timestamp);
        assertThat(pausedSubscription.getOnHoldAt()).isAfter(timestamp);
    }

    @Test
    void shouldPauseActiveSubscriptionSettingAutomaticallyResumeAt() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();
        ZonedDateTime timestamp = ZonedDateTime.now().minusSeconds(5);
        ZonedDateTime resumeAt = ZonedDateTime.now().plusDays(3);
        PauseRequest pauseRequest = new PauseRequest(
                new AutoResume(resumeAt)
        );

        // when
        Subscription pausedSubscription = subscriptionStatusController
                .pauseSubscription(subscription.getId(), pauseRequest).getSubscription();

        // then
        assertThat(pausedSubscription).usingRecursiveComparison()
                .ignoringFields("state", "updatedAt", "onHoldAt", "prepaidDunning",
                        "productPricePointType", "automaticallyResumeAt", "dunningCommunicationDelayEnabled",
                        "customer.countryName", "customer.stateName", "customer.locale", "customer.additionalProperties")
                .isEqualTo(subscription);
        assertThat(pausedSubscription.getState()).isEqualTo(SubscriptionState.ON_HOLD);
        assertThat(pausedSubscription.getUpdatedAt()).isAfter(timestamp);
        assertThat(pausedSubscription.getAutomaticallyResumeAt().toEpochSecond())
                .isEqualTo(resumeAt.toEpochSecond());
        assertThat(pausedSubscription.getOnHoldAt()).isAfter(timestamp);
    }

    @Test
    void shouldUpdatePausedSubscriptionAutomaticResumptionDateToNull() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();
        ZonedDateTime timestamp = ZonedDateTime.now().minusSeconds(5);
        ZonedDateTime resumeAt = ZonedDateTime.now().plusDays(3);
        PauseRequest pauseRequest = new PauseRequest(
                new AutoResume(resumeAt)
        );
        PauseRequest updateResumptionDateRequest = new PauseRequest(
                new AutoResume(null)
        );

        // when
        subscriptionStatusController
                .pauseSubscription(subscription.getId(), pauseRequest);
        Subscription pausedSubscription = subscriptionStatusController
                .updateAutomaticSubscriptionResumption(subscription.getId(), updateResumptionDateRequest)
                .getSubscription();

        // then
        assertThat(pausedSubscription).usingRecursiveComparison()
                .ignoringFields("state", "updatedAt", "onHoldAt", "prepaidDunning",
                        "productPricePointType", "automaticallyResumeAt", "dunningCommunicationDelayEnabled",
                        "customer.countryName", "customer.stateName", "customer.locale", "customer.additionalProperties")
                .isEqualTo(subscription);
        assertThat(pausedSubscription.getState()).isEqualTo(SubscriptionState.ON_HOLD);
        assertThat(pausedSubscription.getUpdatedAt()).isAfter(timestamp);
        assertThat(pausedSubscription.getAutomaticallyResumeAt()).isNull();
    }

    @Test
    void shouldNotPauseAlreadyPausedSubscription() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();

        // when
        subscriptionStatusController
                .pauseSubscription(subscription.getId(), null);

        // when - then
        CommonAssertions
                .assertThatErrorListResponse(() -> subscriptionStatusController.pauseSubscription(subscription.getId(), null))
                .isUnprocessableEntity()
                .hasErrors("This subscription is not eligible to be put on hold.");
    }

    @Test
    void shouldNotPauseNonExistentSubscription() {
        assertNotFound(() -> subscriptionStatusController.pauseSubscription(99999999, null));
    }

}
