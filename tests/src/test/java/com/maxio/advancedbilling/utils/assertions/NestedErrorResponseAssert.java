package com.maxio.advancedbilling.utils.assertions;

import com.maxio.advancedbilling.exceptions.NestedErrorResponseException;

import java.util.Map;
import java.util.concurrent.Callable;

import static org.assertj.core.api.Assertions.assertThat;

public class NestedErrorResponseAssert extends ApiExceptionAssert<NestedErrorResponseException, NestedErrorResponseAssert> {

    <V> NestedErrorResponseAssert(Callable<V> runnable) {
        super(runnable);
    }

    public NestedErrorResponseAssert hasErrorMap(Map<String, Object> errorMap) {
        assertThat(actual.getErrors()).as("Expected error map").isEqualTo(errorMap);
        return this;
    }
}
