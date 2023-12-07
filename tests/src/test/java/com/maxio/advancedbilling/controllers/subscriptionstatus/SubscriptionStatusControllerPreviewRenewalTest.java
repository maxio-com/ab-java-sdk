package com.maxio.advancedbilling.controllers.subscriptionstatus;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CancellationOptions;
import com.maxio.advancedbilling.models.CancellationRequest;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ReactivateSubscriptionRequest;
import com.maxio.advancedbilling.models.ReactivationBilling;
import com.maxio.advancedbilling.models.ReactivationCharge;
import com.maxio.advancedbilling.models.RenewalPreviewComponent;
import com.maxio.advancedbilling.models.RenewalPreviewRequest;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.containers.ReactivateSubscriptionRequestResume;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionStatusControllerPreviewRenewalTest extends SubscriptionStatusControllerTestBase {

    @Test
    void shouldPreviewRenewal() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();
        subscriptionStatusController.cancelSubscription(subscription.getId(), new CancellationRequest(
                new CancellationOptions()
        ));
        Component component =

        // when
        subscriptionStatusController.previewRenewal(subscription.getId(),
                new RenewalPreviewRequest(
                        List.of(
                                new RenewalPreviewComponent(
                                        123,
                                        10000,
                                )
                        )
                ))

        // then
        assertThat(reactivatedSubscription).usingRecursiveComparison()
                .ignoringFields("updatedAt")
                .isEqualTo(subscription);
    }

    @Test
    void shouldNotReactivateActiveSubscription() throws IOException, ApiException {
        // given
        Subscription subscription = createSubscription();

        // when-then
        assertThatErrorListResponse(() -> subscriptionStatusController.reactivateSubscription(subscription.getId(),
                new ReactivateSubscriptionRequest()))
                .hasErrorCode(422)
                .hasUnprocessableEntityMessage()
                .hasErrors("Cannot reactivate a subscription that is not marked \"Canceled\", \"Unpaid\", or \"Trial Ended\".");
    }

    @Test
    void shouldNotReactivateNonExistentSubscription() {
        assertNotFound(() -> subscriptionStatusController.reactivateSubscription(5, new ReactivateSubscriptionRequest()));
    }

}
