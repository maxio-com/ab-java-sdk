package com.maxio.advancedbilling.controllers.subscriptionstatus;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CancellationMethod;
import com.maxio.advancedbilling.models.CancellationOptions;
import com.maxio.advancedbilling.models.CancellationRequest;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionState;
import com.maxio.advancedbilling.utils.assertions.ApiExceptionAssert;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionStatusControllerCancelSubscriptionTest extends SubscriptionStatusControllerTestBase {

    @Test
    void shouldCancelActiveSubscription() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();
        ZonedDateTime timestamp = ZonedDateTime.now().minusSeconds(5);

        // when
        Subscription cancelledSubscription = subscriptionStatusController
                .cancelSubscription(subscription.getId(), null).getSubscription();

        // then
        assertThat(cancelledSubscription).usingRecursiveComparison()
                .ignoringFields("state", "updatedAt", "canceledAt", "cancelAtEndOfPeriod",
                        "cancellationMethod", "reasonCode")
                .isEqualTo(subscription);
        assertThat(cancelledSubscription.getState()).isEqualTo(SubscriptionState.CANCELED);
        assertThat(cancelledSubscription.getUpdatedAt()).isAfter(timestamp);
        assertThat(cancelledSubscription.getCanceledAt()).isAfter(timestamp);
        assertThat(cancelledSubscription.getCancellationMethod()).isEqualTo(CancellationMethod.MERCHANT_API);
        assertThat(cancelledSubscription.getReasonCode())
                .isEqualTo("CH:Unknown");
    }

    @Test
    void shouldCancelActiveSubscriptionProvidingReasonCodeAndMessage() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();
        ZonedDateTime timestamp = ZonedDateTime.now().minusSeconds(5);
        String reasonCode = "CHURN";
        String cancellationMessage = "Customer left.";
        CancellationRequest cancellationRequest = new CancellationRequest(
                new CancellationOptions.Builder()
                        .cancellationMessage(cancellationMessage)
                        .reasonCode(reasonCode)
                        .build()
        );

        // when
        Subscription cancelledSubscription = subscriptionStatusController
                .cancelSubscription(subscription.getId(), cancellationRequest).getSubscription();

        // then
        assertThat(cancelledSubscription).usingRecursiveComparison()
                .ignoringFields("state", "updatedAt", "canceledAt", "cancelAtEndOfPeriod",
                        "cancellationMethod", "reasonCode", "cancellationMessage")
                .isEqualTo(subscription);
        assertThat(cancelledSubscription.getState()).isEqualTo(SubscriptionState.CANCELED);
        assertThat(cancelledSubscription.getUpdatedAt()).isAfter(timestamp);
        assertThat(cancelledSubscription.getCanceledAt()).isAfter(timestamp);
        assertThat(cancelledSubscription.getCancellationMethod()).isEqualTo(CancellationMethod.MERCHANT_API);
        assertThat(cancelledSubscription.getReasonCode()).isEqualTo(reasonCode);
        assertThat(cancelledSubscription.getCancellationMessage()).isEqualTo(cancellationMessage);
    }

    @Test
    void shouldNotRetryNonExistentSubscription() {
        assertNotFound(() -> subscriptionStatusController.cancelSubscription(99999999, null));
    }

    @Test
    void shouldNotCancelAlreadyCanceledSubscriptionExceedingMessagesLimits() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();

        String reasonCode = "a".repeat(256);
        String cancellationMessage = "a".repeat(65536);
        CancellationRequest cancellationRequest = new CancellationRequest(
                new CancellationOptions.Builder()
                        .cancellationMessage(cancellationMessage)
                        .reasonCode(reasonCode)
                        .build()
        );

        // when - then
        new ApiExceptionAssert(() -> subscriptionStatusController.cancelSubscription(subscription.getId(), cancellationRequest))
                .hasErrorCode(422)
                .hasMessage("HTTP Response Not OK. Status code: 422. Response: '{errors:[reason_code size cannot be greater than 255,cancellation_message size cannot be greater than 65535]}'.");
    }

    @Test
    void shouldNotCancelAlreadyCanceledSubscription() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();

        // when
        subscriptionStatusController
                .cancelSubscription(subscription.getId(), null);

        // then
        new ApiExceptionAssert(() -> subscriptionStatusController.cancelSubscription(subscription.getId(), null))
                .hasErrorCode(422)
                .hasMessage("HTTP Response Not OK. Status code: 422. Response: '{error:The subscription is already canceled}'.");
    }

}
