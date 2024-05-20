package com.maxio.advancedbilling.controllers.subscriptionstatus;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;

import static com.maxio.advancedbilling.models.SubscriptionState.ACTIVE;
import static com.maxio.advancedbilling.models.SubscriptionState.ON_HOLD;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionStatusControllerResumeSubscriptionTest extends SubscriptionStatusControllerTestBase {

    @Test
    void shouldResumePausedSubscription() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();
        ZonedDateTime timestamp = ZonedDateTime.now().minusSeconds(5);

        // when
        subscriptionStatusController.pauseSubscription(subscription.getId(), null);
        Subscription resumedSubscription = subscriptionStatusController
                .resumeSubscription(subscription.getId(), null).getSubscription();

        // then
        assertThat(resumedSubscription).usingRecursiveComparison()
                .ignoringFields("updatedAt", "prepaidDunning", "previousState", "productPricePointType",
                        "dunningCommunicationDelayEnabled", "customer.countryName", "customer.stateName")
                .isEqualTo(subscription);
        assertThat(resumedSubscription.getUpdatedAt()).isAfter(timestamp);
        assertThat(resumedSubscription.getState()).isEqualTo(ACTIVE);
        assertThat(resumedSubscription.getPreviousState()).isEqualTo(ON_HOLD);
    }

    @Test
    void shouldNotResumeActiveSubscription() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();

        // when - then
        CommonAssertions
                .assertThatErrorListResponse(() -> subscriptionStatusController
                        .resumeSubscription(subscription.getId(), null)
                )
                .isUnprocessableEntity()
                .hasErrors("Only subscriptions that are on hold can be resumed.");
    }

    @Test
    void shouldNotResumeNonExistentSubscription() {
        assertNotFound(() -> subscriptionStatusController.resumeSubscription(99999999, null));
    }
}
