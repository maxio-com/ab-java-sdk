package com.maxio.advancedbilling.utils.matchers;

import com.maxio.advancedbilling.models.containers.AllocationPreviewItemQuantity;

public class AllocationPreviewItemQuantityGetter<R> implements AllocationPreviewItemQuantity.Cases<R> {
    @Override
    public R number(int number) {
        return (R) Integer.valueOf(number);
    }

    @Override
    public R string(String string) {
        return (R) string;
    }

}
