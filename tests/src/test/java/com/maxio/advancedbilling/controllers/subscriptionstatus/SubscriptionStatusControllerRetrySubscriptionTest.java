package com.maxio.advancedbilling.controllers.subscriptionstatus;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionStatusControllerRetrySubscriptionTest extends SubscriptionStatusControllerTestBase {

    @Test
    void shouldRetryFailedSubscription() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();

        // when
        Subscription retriedSubscription = subscriptionStatusController.retrySubscription(subscription.getId())
                .getSubscription();

        // then
        assertThat(retriedSubscription).usingRecursiveComparison()
                .ignoringFields("productPricePointType", "prepaidDunning", "updatedAt")
                .isEqualTo(subscription);
    }

    @Test
    void shouldNotRetryCancelledSubscription() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();

        // when
        subscriptionStatusController
                .cancelSubscription(subscription.getId(), null);

        // then
        CommonAssertions
                .assertThatErrorListResponse(() -> subscriptionStatusController.retrySubscription(subscription.getId()))
                .isUnprocessableEntity()
                .hasNoErrors();
    }

    @Test
    void shouldNotRetryNonExistentSubscription() {
        assertNotFound(() -> subscriptionStatusController.retrySubscription(99999999));
    }
}
