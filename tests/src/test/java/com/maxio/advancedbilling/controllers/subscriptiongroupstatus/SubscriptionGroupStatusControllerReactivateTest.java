package com.maxio.advancedbilling.controllers.subscriptiongroupstatus;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CancelGroupedSubscriptionsRequest;
import com.maxio.advancedbilling.models.FullSubscriptionGroupResponse;
import com.maxio.advancedbilling.models.ReactivateSubscriptionGroupRequest;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionState;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionGroupStatusControllerReactivateTest extends BaseSubscriptionGroupStatusControllerTest {

    @Test
    void shouldReactivateCancelledGroup() throws IOException, ApiException {
        // given
        SubscriptionGroupData group = createGroup();
        subscriptionGroupStatusController.cancelSubscriptionsInGroup(group.getSubscriptionGroup().getUid(),
                new CancelGroupedSubscriptionsRequest(false));

        group.refresh();
        assertThat(group.getSubscriptionGroup().getState()).isEqualTo(SubscriptionState.CANCELED);
        assertThat(group.getPrimarySubscription().getState()).isEqualTo(SubscriptionState.CANCELED);
        assertThat(group.getMember(0).getState()).isEqualTo(SubscriptionState.CANCELED);

        // when
        subscriptionGroupStatusController.reactivateSubscriptionGroup(group.getSubscriptionGroup().getUid(),
                new ReactivateSubscriptionGroupRequest(true, true));

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
        assertThat(primarySub.getCancelAtEndOfPeriod()).isFalse();

        assertThat(secondarySub.getState()).isEqualTo(SubscriptionState.ACTIVE);
        assertThat(secondarySub.getCanceledAt()).isNull();
        assertThat(secondarySub.getDelayedCancelAt()).isNull();
        assertThat(secondarySub.getCancelAtEndOfPeriod()).isFalse();
    }

    @Test
    void shouldThrowExceptionIfActive() throws IOException, ApiException {
        // given
        SubscriptionGroupData group = createGroup();

        // when then
        assertThatErrorListResponse(() ->
                subscriptionGroupStatusController.reactivateSubscriptionGroup(group.getSubscriptionGroup().getUid(),
                        new ReactivateSubscriptionGroupRequest()))
                .isUnprocessableEntity()
                .hasMessage("HTTP Response Not OK. Status code: 422. Response: '{errors:[Primary subscription is already active]}'.")
                .hasErrors("Primary subscription is already active");
    }

    @Test
    void shouldReturn404IfGroupDoesNotExist() {
        // when - then
        assertNotFound(() -> subscriptionGroupStatusController.reactivateSubscriptionGroup("not_existing",
                new ReactivateSubscriptionGroupRequest()));
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() throws IOException, ApiException {
        // given
        SubscriptionGroupData group = createGroup();

        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getSubscriptionGroupStatusController()
                .reactivateSubscriptionGroup(group.getSubscriptionGroup().getUid(), new ReactivateSubscriptionGroupRequest()));
    }
}
