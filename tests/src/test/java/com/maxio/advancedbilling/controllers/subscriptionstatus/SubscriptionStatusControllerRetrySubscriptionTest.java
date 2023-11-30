package com.maxio.advancedbilling.controllers.subscriptionstatus;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.models.Subscription;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.CommonAssertions.assertNotFound;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

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
        assertThatExceptionOfType(ErrorListResponseException.class)
                .isThrownBy(() -> subscriptionStatusController.retrySubscription(subscription.getId())
                )
                .withMessage("Unprocessable Entity (WebDAV)")
                .satisfies(e -> {
                    assertThat(e.getResponseCode()).isEqualTo(422);
                    assertThat(e.getErrors()).isEmpty();
                });
    }

    @Test
    void shouldNotRetryUnownedSubscription() {
        assertNotFound(() -> subscriptionStatusController.retrySubscription(99999999));
    }

}
