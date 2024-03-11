package com.maxio.advancedbilling.utils.matchers;

import com.maxio.advancedbilling.models.SubscriptionGroupMembersArrayError;
import com.maxio.advancedbilling.models.SubscriptionGroupSingleError;
import com.maxio.advancedbilling.models.containers.SubscriptionGroupCreateErrorResponseErrors;

public class SubscriptionGroupCreateErrorResponseErrorsGetter<R> implements SubscriptionGroupCreateErrorResponseErrors.Cases<R> {
    @Override
    public R subscriptionGroupMembersArrayError(SubscriptionGroupMembersArrayError subscriptionGroupMembersArrayError) {
        return (R) subscriptionGroupMembersArrayError;
    }

    @Override
    public R subscriptionGroupSingleError(SubscriptionGroupSingleError subscriptionGroupSingleError) {
        return (R) subscriptionGroupSingleError;
    }

    @Override
    public R string(String string) {
        return (R) string;
    }

}
