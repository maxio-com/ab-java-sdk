package com.maxio.advancedbilling.utils.matchers;


import com.maxio.advancedbilling.models.containers.PriceEndingQuantity;

public class PriceEndingQuantityGetter<R> implements PriceEndingQuantity.Cases<R> {
    @Override
    public R number(int number) {
        return (R) Integer.valueOf(number);
    }

    @Override
    public R string(String string) {
        return (R) string;
    }

}
