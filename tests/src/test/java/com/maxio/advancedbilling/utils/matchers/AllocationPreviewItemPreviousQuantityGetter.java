package com.maxio.advancedbilling.utils.matchers;

import com.maxio.advancedbilling.models.containers.AllocationPreviewItemPreviousQuantity;

public class AllocationPreviewItemPreviousQuantityGetter<R> implements AllocationPreviewItemPreviousQuantity.Cases<R> {
    @Override
    public R number(int number) {
        return (R) Integer.valueOf(number);
    }

    @Override
    public R string(String string) {
        return (R) string;
    }

}
