package com.maxio.advancedbilling.controllers.subscriptionstatus;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.models.Subscription;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

import static com.maxio.advancedbilling.models.SubscriptionState.ACTIVE;
import static com.maxio.advancedbilling.models.SubscriptionState.ON_HOLD;
import static com.maxio.advancedbilling.utils.CommonAssertions.assertNotFound;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class SubscriptionStatusResumeSubscriptionTest extends SubscriptionStatusControllerTestBase {

    @Test
    void shouldResumePausedSubscription() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();
        ZonedDateTime timestamp = ZonedDateTime.now().minus(5, ChronoUnit.SECONDS);

        // when
        subscriptionStatusController.pauseSubscription(subscription.getId(), null);
        Subscription resumedSubscription = subscriptionStatusController
                .resumeSubscription(subscription.getId(), null).getSubscription();

        // then
        assertThat(resumedSubscription).usingRecursiveComparison()
                .ignoringFields("updatedAt", "prepaidDunning", "previousState", "productPricePointType")
                .isEqualTo(subscription);
        assertThat(resumedSubscription.getUpdatedAt()).isAfter(timestamp);
        assertThat(resumedSubscription.getState()).isEqualTo(ACTIVE);
        assertThat(resumedSubscription.getPreviousState()).isEqualTo(ON_HOLD);
    }

    @Test
    void shouldNotResumeActiveSubscription() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();

        // when-then
        assertThatExceptionOfType(ErrorListResponseException.class)
                .isThrownBy(() -> subscriptionStatusController
                        .resumeSubscription(subscription.getId(), null)
                )
                .withMessage("Unprocessable Entity (WebDAV)")
                .satisfies(e -> {
                    assertThat(e.getResponseCode()).isEqualTo(422);
                    assertThat(e.getErrors()).containsExactlyInAnyOrder(
                            "Only subscriptions that are on hold can be resumed.");
                });
    }

    @Test
    void shouldNotResumeNonExistentSubscription() {
        assertNotFound(() -> subscriptionStatusController.resumeSubscription(99999999, null));
    }

}
