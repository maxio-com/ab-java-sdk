package com.maxio.advancedbilling.utils.matchers;

import com.maxio.advancedbilling.models.containers.SubscriptionComponentUnitBalance;

public class SubscriptionComponentUnitBalanceGetter<R> implements SubscriptionComponentUnitBalance.Cases<R> {
    @Override
    public R number(int number) {
        return (R) Integer.valueOf(number);
    }

    @Override
    public R string(String string) {
        return (R) string;
    }

}
