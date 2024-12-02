package com.maxio.advancedbilling.utils.matchers;


import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;

public class PriceStartingQuantityGetter<R> implements PriceStartingQuantity.Cases<R> {
    @Override
    public R number(int number) {
        return (R) Integer.valueOf(number);
    }

    @Override
    public R string(String string) {
        return (R) string;
    }

}
