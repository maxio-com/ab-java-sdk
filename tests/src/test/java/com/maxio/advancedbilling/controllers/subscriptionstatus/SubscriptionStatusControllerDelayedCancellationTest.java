package com.maxio.advancedbilling.controllers.subscriptionstatus;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CancellationOptions;
import com.maxio.advancedbilling.models.CancellationRequest;
import com.maxio.advancedbilling.models.DelayedCancellationResponse;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.utils.assertions.ApiExceptionAssert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionStatusControllerDelayedCancellationTest extends SubscriptionStatusControllerTestBase {

    private static Subscription subscriptionForErrors;

    @BeforeAll
    static void beforeAll() throws IOException, ApiException {
        subscriptionForErrors = createSubscription();
    }

    @Test
    void shouldInitiateDelayedCancellation() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();
        ZonedDateTime timestamp = ZonedDateTime.now().minusSeconds(5);
        String message = "Unsatisfied with the service";
        String reasonCode = "CHURN";

        // when
        CancellationRequest request = new CancellationRequest(
                new CancellationOptions.Builder()
                        .cancellationMessage(message)
                        .reasonCode(reasonCode)
                        .build()
        );
        DelayedCancellationResponse delayedCancellationResponse = subscriptionStatusController
                .initiateDelayedCancellation(subscription.getId(), request);
        Subscription updatedSubscription = subscriptionsController.readSubscription(subscription.getId(), null)
                .getSubscription();

        // then
        assertThat(delayedCancellationResponse.getMessage())
                .isEqualTo("This subscription is scheduled to be canceled at the end of the current period");

        assertThat(delayedCancellationResponse.getAdditionalProperties()).isEmpty();
        assertThat(updatedSubscription).usingRecursiveComparison()
                .ignoringFields("updatedAt", "cancelAtEndOfPeriod", "cancellationMessage",
                        "currentBillingAmountInCents", "reasonCode", "scheduledCancellationAt", "delayedCancelAt")
                .isEqualTo(subscription);
        assertThat(updatedSubscription.getUpdatedAt()).isAfter(timestamp);
        assertThat(updatedSubscription.getScheduledCancellationAt()).isAfter(timestamp);
        assertThat(updatedSubscription.getDelayedCancelAt()).isAfter(timestamp);
        assertThat(updatedSubscription.getCancelAtEndOfPeriod()).isTrue();
        assertThat(updatedSubscription.getReasonCode()).isEqualTo(reasonCode);
        assertThat(updatedSubscription.getCancellationMessage()).isEqualTo(message);
    }

    @Test
    void shouldNotCancelNonExistentSubscription() {
        assertNotFound(() -> subscriptionStatusController.initiateDelayedCancellation(99999999, null));
    }

    @Test
    void shouldNotCancelAlreadyCanceledSubscriptionExceedingMessagesLimits() throws IOException, ApiException {
        String reasonCode = "a".repeat(256);
        String cancellationMessage = "a".repeat(65536);
        CancellationRequest cancellationRequest = new CancellationRequest(
                new CancellationOptions.Builder()
                        .cancellationMessage(cancellationMessage)
                        .reasonCode(reasonCode)
                        .build()
        );

        // when - then
        new ApiExceptionAssert(() -> subscriptionStatusController.initiateDelayedCancellation(subscriptionForErrors.getId(), cancellationRequest))
                .hasErrorCode(422)
                .hasMessage("HTTP Response Not OK. Status code: 422. Response: '{errors:[reason_code size cannot be greater than 255,cancellation_message size cannot be greater than 65535]}'.");
    }

    @Test
    void shouldNotCancelAlreadyCanceledSubscription() throws IOException, ApiException {
        // when
        subscriptionStatusController
                .cancelSubscription(subscriptionForErrors.getId(), null);

        // then
        assertThatErrorListResponse(() -> subscriptionStatusController
                .initiateDelayedCancellation(subscriptionForErrors.getId(), null))
                .isUnprocessableEntity()
                .hasErrors("The subscription is already canceled");
    }

    @Test
    void shouldNotCancelSubscriptionProvidingInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getSubscriptionStatusController()
                .initiateDelayedCancellation(subscriptionForErrors.getId(), null));
    }

}
