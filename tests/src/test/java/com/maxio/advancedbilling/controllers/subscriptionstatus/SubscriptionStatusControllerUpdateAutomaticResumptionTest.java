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

public class SubscriptionStatusControllerUpdateAutomaticResumptionTest extends SubscriptionStatusControllerTestBase {

    @Test
    void shouldUpdatePausedSubscriptionAutomaticResumptionDate() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();
        ZonedDateTime timestamp = ZonedDateTime.now().minus(5, ChronoUnit.SECONDS);
        ZonedDateTime resumeAt = ZonedDateTime.now().plusDays(3);
        PauseRequest pauseRequest = new PauseRequest(
                new AutoResume(resumeAt)
        );

        // when
        subscriptionStatusController.pauseSubscription(subscription.getId(), null);
        Subscription pausedSubscription = subscriptionStatusController
                .updateAutomaticSubscriptionResumption(subscription.getId(), pauseRequest).getSubscription();

        // then
        assertThat(pausedSubscription).usingRecursiveComparison()
                .ignoringFields("state", "updatedAt", "onHoldAt", "prepaidDunning",
                        "productPricePointType", "automaticallyResumeAt")
                .isEqualTo(subscription);
        assertThat(pausedSubscription.getState()).isEqualTo(SubscriptionState.ON_HOLD);
        assertThat(pausedSubscription.getUpdatedAt()).isAfter(timestamp);
        assertThat(pausedSubscription.getAutomaticallyResumeAt().toEpochSecond())
                .isEqualTo(resumeAt.toEpochSecond());
    }

    @Test
    void shouldNotUpdatePausedSubscriptionAutomaticResumptionDateToDateInPast() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();
        PauseRequest pauseRequest = new PauseRequest(
                new AutoResume(ZonedDateTime.now().minusMonths(2))
        );

        // when
        subscriptionStatusController
                .pauseSubscription(subscription.getId(), null);

        // then
        assertThatExceptionOfType(ErrorListResponseException.class)
                .isThrownBy(() -> subscriptionStatusController
                        .updateAutomaticSubscriptionResumption(subscription.getId(), pauseRequest)
                )
                .withMessage("Unprocessable Entity (WebDAV)")
                .satisfies(e -> {
                    assertThat(e.getResponseCode()).isEqualTo(422);
                    assertThat(e.getErrors()).containsExactlyInAnyOrder(
                            "Automatic resume date: must be at least 24 hours in the future.");
                });
    }

    @Test
    void shouldNotUpdateActiveSubscriptionAutomaticResumptionDate() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();

        // when-then
        assertThatExceptionOfType(ErrorListResponseException.class)
                .isThrownBy(() -> subscriptionStatusController.updateAutomaticSubscriptionResumption(subscription.getId(), null)
                )
                .withMessage("Unprocessable Entity (WebDAV)")
                .satisfies(e -> {
                    assertThat(e.getResponseCode()).isEqualTo(422);
                    assertThat(e.getErrors()).containsExactlyInAnyOrder(
                            "Subscription is not currently on hold.");
                });
    }

    @Test
    void shouldNotUpdateNonExistentSubscriptionAutomaticResumptionDate() {
        assertNotFound(() -> subscriptionStatusController.updateAutomaticSubscriptionResumption(99999999, null));
    }

}
