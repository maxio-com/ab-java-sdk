package com.maxio.advancedbilling.controllers.subscriptiongroupstatus;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CancelGroupedSubscriptionsRequest;
import com.maxio.advancedbilling.models.FullSubscriptionGroupResponse;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionState;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionGroupStatusControllerCancelDelayedCancellationTest extends BaseSubscriptionGroupStatusControllerTest {

    @Test
    void shouldCancelDelayedCancellation() throws IOException, ApiException {
        // given
        SubscriptionGroupData group = createGroup();
        subscriptionGroupStatusController.initiateDelayedCancellationForGroup(group.getSubscriptionGroup().getUid());

        // when
        subscriptionGroupStatusController.cancelDelayedCancellationForGroup(group.getSubscriptionGroup().getUid());

        // then
        group.refresh();

        FullSubscriptionGroupResponse subscriptionGroup = group.getSubscriptionGroup();
        assertThat(subscriptionGroup.getState()).isEqualTo(SubscriptionState.ACTIVE);
        assertThat(subscriptionGroup.getCancelAtEndOfPeriod()).isFalse();

        Subscription primarySub = group.getPrimarySubscription();
        Subscription secondarySub = group.getMembers().get(0);

        assertThat(primarySub.getState()).isEqualTo(SubscriptionState.ACTIVE);
        assertThat(primarySub.getCanceledAt()).isNull();
        assertThat(primarySub.getDelayedCancelAt()).isNull();
        assertThat(primarySub.getCancelAtEndOfPeriod()).isNull();

        assertThat(secondarySub.getState()).isEqualTo(SubscriptionState.ACTIVE);
        assertThat(secondarySub.getCanceledAt()).isNull();
        assertThat(secondarySub.getDelayedCancelAt()).isNull();
        assertThat(secondarySub.getCancelAtEndOfPeriod()).isNull();
    }

    @Test
    void shouldThrowExceptionIfAlreadyCancelled() throws IOException, ApiException {
        // given
        SubscriptionGroupData group = createGroup();
        subscriptionGroupStatusController.cancelSubscriptionsInGroup(group.getSubscriptionGroup().getUid(),
                new CancelGroupedSubscriptionsRequest(false));

        // when then
        assertThatErrorListResponse(() ->
                subscriptionGroupStatusController.cancelDelayedCancellationForGroup(group.getSubscriptionGroup().getUid()))
                .isUnprocessableEntity()
                .hasMessage("HTTP Response Not OK. Status code: 422. Response: '{errors:[Primary Subscription is already canceled. " +
                        "Changes to schedule cancellation are blocked.,Subscriptions group does not have a pending delayed cancellation]}'.")
                .hasErrors("Primary Subscription is already canceled. Changes to schedule cancellation are blocked.",
                        "Subscriptions group does not have a pending delayed cancellation");
    }

    @Test
    void shouldReturn404IfGroupDoesNotExist() {
        // when - then
        assertNotFound(() -> subscriptionGroupStatusController.cancelDelayedCancellationForGroup("not_existing"));
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() throws IOException, ApiException {
        // given
        SubscriptionGroupData group = createGroup();

        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getSubscriptionGroupStatusController()
                .cancelDelayedCancellationForGroup(group.getSubscriptionGroup().getUid()));
    }
}
