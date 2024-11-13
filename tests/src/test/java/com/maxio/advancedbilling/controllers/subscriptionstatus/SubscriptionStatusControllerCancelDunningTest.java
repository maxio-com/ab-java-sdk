package com.maxio.advancedbilling.controllers.subscriptionstatus;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateAllocation;
import com.maxio.advancedbilling.models.CreateAllocationRequest;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionState;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.assertions.ApiExceptionAssert;
import org.junit.jupiter.api.Test;
import java.io.IOException;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionStatusControllerCancelDunningTest extends SubscriptionStatusControllerTestBase {

    @Test
    void shouldCancelDunning() throws IOException, ApiException {
        // given
        AdvancedBillingClient client = TestClient.createClient();
        Subscription subscription = createSubscription();
        int componentId = new TestSetup().createQuantityBasedComponent(productFamilyId).getId();

        // when
        // force subscription into dunning by failing mid-period component allocation payment
        client.getPaymentProfilesController().deleteSubscriptionsPaymentProfile(
                subscription.getId(),
                subscription.getCreditCard().getId());
        client.getSubscriptionComponentsController().allocateComponent(
                subscription.getId(), componentId, new CreateAllocationRequest(new CreateAllocation.Builder()
                        .quantity(10)
                        .componentId(componentId)
                        .initiateDunning(true)
                        .accrueCharge(false)
                        .build()
                )
        );
        Subscription pastDueSubscription = client.getSubscriptionsController().readSubscription(subscription.getId(), null).getSubscription();
        assertThat(pastDueSubscription.getState()).isEqualTo(SubscriptionState.PAST_DUE);

        Subscription subscriptionAfterDunningCancelled = subscriptionStatusController
                .cancelDunning(subscription.getId()).getSubscription();

        // then
        assertThat(subscriptionAfterDunningCancelled).usingRecursiveComparison()
                .ignoringFields("customer", "dunningCommunicationDelayEnabled", "paymentType",
                        "prepaidDunning", "previousState", "productPricePointType", "updatedAt",
                        "balanceInCents", "creditCard")
                .isEqualTo(subscription);
        assertThat(subscriptionAfterDunningCancelled.getState()).isEqualTo(SubscriptionState.ACTIVE);
        assertThat(subscriptionAfterDunningCancelled.getPreviousState()).isEqualTo(SubscriptionState.PAST_DUE);
    }

    @Test
    void shouldNotCancelDunningForNonExistentSubscription() {
        assertNotFound(() -> subscriptionStatusController.cancelDunning(99999999));
    }

    @Test
    void shouldNotCancelDunningForActiveSubscription() throws IOException, ApiException {
        Subscription subscription = createSubscription();

        // when - then
        new ApiExceptionAssert(() -> subscriptionStatusController.cancelDunning(subscription.getId()))
                .hasErrorCode(422)
                .hasMessage("HTTP Response Not OK. Status code: 422. Response: '{errors:[This subscription is not eligible to have its dunning canceled.]}'.");
    }

    @Test
    void shouldNotCancelDunningProvidingInvalidCredentials() throws IOException, ApiException {
        Subscription subscription = createSubscription();
        // when - then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getSubscriptionStatusController()
                .cancelDunning(subscription.getId()));
    }

}
