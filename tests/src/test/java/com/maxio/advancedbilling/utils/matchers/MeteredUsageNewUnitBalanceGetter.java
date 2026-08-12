package com.maxio.advancedbilling.utils.matchers;

import com.maxio.advancedbilling.models.containers.MeteredUsageNewUnitBalance;

public class MeteredUsageNewUnitBalanceGetter<R> implements MeteredUsageNewUnitBalance.Cases<R> {
    @Override
    public R number(int number) {
        return (R) Integer.valueOf(number);
    }

    @Override
    public R string(String string) {
        return (R) string;
    }

}
