package com.maxio.advancedbilling.controllers.subscriptionstatus;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CancellationMethod;
import com.maxio.advancedbilling.models.CancellationOptions;
import com.maxio.advancedbilling.models.CancellationRequest;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionState;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class SubscriptionStatusControllerCancelSubscriptionTest extends SubscriptionStatusControllerTestBase {

    @Test
    void shouldCancelActiveSubscription() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();
        ZonedDateTime timestamp = ZonedDateTime.now().minus(5, ChronoUnit.SECONDS);

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
        ZonedDateTime timestamp = ZonedDateTime.now().minus(5, ChronoUnit.SECONDS);
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
        assertNotFound(() -> subscriptionStatusController.cancelSubscription(99999999, null),
                "Not Found");
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

        // when-then
        assertThatExceptionOfType(ApiException.class)
                .isThrownBy(() -> subscriptionStatusController.cancelSubscription(subscription.getId(), cancellationRequest))
                .withMessage("Unprocessable Entity (WebDAV)")
                .satisfies(e -> {
                    assertThat(e.getResponseCode()).isEqualTo(422);
                    assertThat(e.getHttpContext().getResponse().getBody()).isEqualTo("""
                            {"errors":["reason_code size cannot be greater than 255","cancellation_message size cannot be greater than 65535"]}"""
                    );
                });
    }

    @Test
    void shouldNotCancelAlreadyCanceledSubscription() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();

        // when
        subscriptionStatusController
                .cancelSubscription(subscription.getId(), null);

        // then
        assertThatExceptionOfType(ApiException.class)
                .isThrownBy(() -> subscriptionStatusController.cancelSubscription(subscription.getId(), null)
                )
                .withMessage("Unprocessable Entity (WebDAV)")
                .satisfies(e -> {
                    assertThat(e.getResponseCode()).isEqualTo(422);
                    assertThat(e.getHttpContext().getResponse().getBody()).isEqualTo("""
                            {"error":"The subscription is already canceled"}"""
                    );
                });
    }

}
