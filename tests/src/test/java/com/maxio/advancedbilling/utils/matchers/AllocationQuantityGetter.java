package com.maxio.advancedbilling.utils.matchers;

import com.maxio.advancedbilling.models.containers.AllocationQuantity;

public class AllocationQuantityGetter<R> implements AllocationQuantity.Cases<R> {
    @Override
    public R number(int number) {
        return (R) Integer.valueOf(number);
    }

    @Override
    public R string(String string) {
        return (R) string;
    }

}
