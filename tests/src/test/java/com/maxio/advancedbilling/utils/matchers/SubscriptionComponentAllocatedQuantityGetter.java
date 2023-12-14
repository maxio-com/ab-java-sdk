package com.maxio.advancedbilling.utils.matchers;

import com.maxio.advancedbilling.models.containers.SubscriptionComponentAllocatedQuantity;

public class SubscriptionComponentAllocatedQuantityGetter<R> implements SubscriptionComponentAllocatedQuantity.Cases<R> {
    @Override
    public R number(int number) {
        return (R) Integer.valueOf(number);
    }

    @Override
    public R string(String string) {
        return (R) string;
    }

}
