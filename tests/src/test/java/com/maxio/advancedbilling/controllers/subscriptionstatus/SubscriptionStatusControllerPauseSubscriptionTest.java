package com.maxio.advancedbilling.controllers.subscriptionstatus;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.models.AutoResume;
import com.maxio.advancedbilling.models.PauseRequest;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionState;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class SubscriptionStatusControllerPauseSubscriptionTest extends SubscriptionStatusControllerTestBase {

    @Test
    void shouldPauseActiveSubscription() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();
        ZonedDateTime timestamp = ZonedDateTime.now().minus(5, ChronoUnit.SECONDS);

        // when
        Subscription pausedSubscription = subscriptionStatusController
                .pauseSubscription(subscription.getId(), null).getSubscription();

        // then
        assertThat(pausedSubscription).usingRecursiveComparison()
                .ignoringFields("state", "updatedAt", "onHoldAt", "prepaidDunning",
                        "productPricePointType")
                .isEqualTo(subscription);
        assertThat(pausedSubscription.getState()).isEqualTo(SubscriptionState.ON_HOLD);
        assertThat(pausedSubscription.getUpdatedAt()).isAfter(timestamp);
        assertThat(pausedSubscription.getOnHoldAt()).isAfter(timestamp);
    }

    @Test
    void shouldPauseActiveSubscriptionSettingAutomaticallyResumeAt() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();
        ZonedDateTime timestamp = ZonedDateTime.now().minus(5, ChronoUnit.SECONDS);
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
                        "productPricePointType", "automaticallyResumeAt")
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
        ZonedDateTime timestamp = ZonedDateTime.now().minus(5, ChronoUnit.SECONDS);
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
                        "productPricePointType", "automaticallyResumeAt")
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

        // when-then
        assertThatExceptionOfType(ErrorListResponseException.class)
                .isThrownBy(() -> subscriptionStatusController.pauseSubscription(subscription.getId(), null)
                )
                .withMessage("Unprocessable Entity (WebDAV)")
                .satisfies(e -> {
                    assertThat(e.getResponseCode()).isEqualTo(422);
                    assertThat(e.getErrors()).containsExactlyInAnyOrder(
                            "This subscription is not eligible to be put on hold.");
                });
    }

    @Test
    void shouldNotPauseNonExistentSubscription() {
        assertNotFound(() -> subscriptionStatusController.pauseSubscription(99999999, null));
    }

}
