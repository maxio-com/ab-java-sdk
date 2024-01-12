package com.maxio.advancedbilling.utils.assertions;

import com.maxio.advancedbilling.exceptions.ErrorListResponseException;

import java.util.concurrent.Callable;

import static org.assertj.core.api.Assertions.assertThat;

public class ErrorListResponseAssert extends ApiExceptionAssert<ErrorListResponseException, ErrorListResponseAssert> {
    ErrorListResponseAssert(ErrorListResponseException e) {
        super(e);
    }

    <V> ErrorListResponseAssert(Callable<V> runnable) {
        super(runnable);
    }

    public ErrorListResponseAssert hasErrors(String... errors) {
        assertThat(actual.getErrors()).as("Expected errors").containsExactlyInAnyOrder(errors);
        return this;
    }

    public ErrorListResponseAssert hasNoErrors() {
        assertThat(actual.getErrors()).as("Expected no errors").isEmpty();
        return this;
    }
}
