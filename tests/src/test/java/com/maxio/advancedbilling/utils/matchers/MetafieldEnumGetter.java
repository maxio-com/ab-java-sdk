package com.maxio.advancedbilling.utils.matchers;

import com.maxio.advancedbilling.models.containers.MetafieldEnum;

import java.util.List;

public class MetafieldEnumGetter<R> implements MetafieldEnum.Cases<R> {

    @Override
    public R string(String string) {
        return (R) string;
    }

    @Override
    public R listOfString(List<String> listOfString) {
        return (R) listOfString;
    }

}
