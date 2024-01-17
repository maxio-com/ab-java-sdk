package com.maxio.advancedbilling.utils.assertions;

import com.maxio.advancedbilling.exceptions.ErrorArrayMapResponseException;

import java.util.Map;
import java.util.concurrent.Callable;

import static org.assertj.core.api.Assertions.assertThat;

public class ErrorArrayMapResponseAssert extends ApiExceptionAssert<ErrorArrayMapResponseException, ErrorArrayMapResponseAssert> {

    <V> ErrorArrayMapResponseAssert(Callable<V> runnable) {
        super(runnable);
    }

    public ErrorArrayMapResponseAssert hasErrorMap(Map<String, Object> errorMap) {
        assertThat(actual.getErrors()).as("Expected error map").isEqualTo(errorMap);
        return this;
    }
}
