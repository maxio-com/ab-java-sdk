package com.maxio.advancedbilling.controllers.subscriptiongroupstatus;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CancelGroupedSubscriptionsRequest;
import com.maxio.advancedbilling.models.CreateUsage;
import com.maxio.advancedbilling.models.CreateUsageRequest;
import com.maxio.advancedbilling.models.FullSubscriptionGroupResponse;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.ListInvoicesInput;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionState;
import com.maxio.advancedbilling.models.containers.CreateUsageComponentId;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.byLessThan;

public class SubscriptionGroupStatusControllerCancelTest extends BaseSubscriptionGroupStatusControllerTest {

    @Test
    void shouldCancelGroupWithoutCharge() throws IOException, ApiException {
        // given
        ZonedDateTime before = ZonedDateTime.now().truncatedTo(ChronoUnit.SECONDS);

        SubscriptionGroupData group = createGroup();
        CreateUsageComponentId componentId = CreateUsageComponentId.fromNumber(meteredComponent.getId());
        CreateUsageRequest usageRequest = new CreateUsageRequest(
                new CreateUsage.Builder()
                        .quantity(10.0)
                        .memo("testing")
                        .build()
        );

        subscriptionComponentsController.createUsage(group.getPrimarySubscription().getId(), componentId, usageRequest);
        subscriptionComponentsController.createUsage(group.getMember(0).getId(), componentId, usageRequest);

        // when
        subscriptionGroupStatusController.cancelSubscriptionsInGroup(group.getSubscriptionGroup().getUid(),
                new CancelGroupedSubscriptionsRequest(false));

        // then
        group.refresh();

        FullSubscriptionGroupResponse subscriptionGroup = group.getSubscriptionGroup();
        assertThat(subscriptionGroup.getCancelAtEndOfPeriod()).isFalse();
        assertThat(subscriptionGroup.getState()).isEqualTo(SubscriptionState.CANCELED);

        Subscription primarySub = group.getPrimarySubscription();
        assertThat(primarySub.getState()).isEqualTo(SubscriptionState.CANCELED);
        assertThat(primarySub.getCanceledAt()).isCloseTo(before, byLessThan(60, ChronoUnit.SECONDS));

        Subscription secondarySub = group.getMember(0);
        assertThat(secondarySub.getState()).isEqualTo(SubscriptionState.CANCELED);
        assertThat(secondarySub.getCanceledAt()).isCloseTo(before, byLessThan(60, ChronoUnit.SECONDS));

        // no charge at cancellation, only one invoice from signup
        assertThat(getInvoices(primarySub)).hasSize(1);
        assertThat(getInvoices(secondarySub)).hasSize(1);
    }

    @Test
    void shouldCancelGroupWithCharge() throws IOException, ApiException {
        // given
        ZonedDateTime before = ZonedDateTime.now().truncatedTo(ChronoUnit.SECONDS);

        SubscriptionGroupData group = createGroup();
        CreateUsageComponentId componentId = CreateUsageComponentId.fromNumber(meteredComponent.getId());
        CreateUsageRequest usageRequest = new CreateUsageRequest(
                new CreateUsage.Builder()
                        .quantity(10.0)
                        .memo("testing")
                        .build()
        );

        subscriptionComponentsController.createUsage(group.getPrimarySubscription().getId(), componentId, usageRequest);
        subscriptionComponentsController.createUsage(group.getMember(0).getId(), componentId, usageRequest);

        // when
        subscriptionGroupStatusController.cancelSubscriptionsInGroup(group.getSubscriptionGroup().getUid(),
                new CancelGroupedSubscriptionsRequest(true));

        // then
        group.refresh();

        FullSubscriptionGroupResponse subscriptionGroup = group.getSubscriptionGroup();
        assertThat(subscriptionGroup.getCancelAtEndOfPeriod()).isFalse();
        assertThat(subscriptionGroup.getState()).isEqualTo(SubscriptionState.CANCELED);

        Subscription primarySub = group.getPrimarySubscription();
        assertThat(primarySub.getState()).isEqualTo(SubscriptionState.CANCELED);
        assertThat(primarySub.getCanceledAt()).isCloseTo(before, byLessThan(60, ChronoUnit.SECONDS));

        Subscription secondarySub = group.getMember(0);
        assertThat(secondarySub.getState()).isEqualTo(SubscriptionState.CANCELED);
        assertThat(secondarySub.getCanceledAt()).isCloseTo(before, byLessThan(60, ChronoUnit.SECONDS));

        // additional charge, second invoice
        assertThat(getInvoices(primarySub)).hasSize(2);
        assertThat(getInvoices(secondarySub)).hasSize(2);
    }

    @Test
    void shouldReturn404IfGroupDoesNotExist() {
        // when - then
        assertNotFound(() -> subscriptionGroupStatusController
                .cancelSubscriptionsInGroup("not_existing", new CancelGroupedSubscriptionsRequest(false)));
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() throws IOException, ApiException {
        // given
        SubscriptionGroupData group = createGroup();

        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getSubscriptionGroupStatusController()
                .cancelSubscriptionsInGroup(group.getSubscriptionGroup().getUid(), new CancelGroupedSubscriptionsRequest(false)));
    }

    private List<Invoice> getInvoices(Subscription subscription) throws ApiException, IOException {
        return invoicesController.listInvoices(new ListInvoicesInput.Builder()
                        .subscriptionId(subscription.getId())
                        .build())
                .getInvoices();
    }
}
