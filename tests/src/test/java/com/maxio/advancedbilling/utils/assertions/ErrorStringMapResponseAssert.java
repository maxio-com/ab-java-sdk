package com.maxio.advancedbilling.utils.assertions;

import com.maxio.advancedbilling.exceptions.ErrorStringMapResponseException;

import java.util.Map;
import java.util.concurrent.Callable;

import static org.assertj.core.api.Assertions.assertThat;

public class ErrorStringMapResponseAssert extends ApiExceptionAssert<ErrorStringMapResponseException, ErrorStringMapResponseAssert> {

    <V> ErrorStringMapResponseAssert(Callable<V> runnable) {
        super(runnable);
    }

    public ErrorStringMapResponseAssert hasErrorMap(Map<String, String> errorMap) {
        assertThat(actual.getErrors()).as("Expected error map").isEqualTo(errorMap);
        return this;
    }
}
