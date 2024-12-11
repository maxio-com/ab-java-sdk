package com.maxio.advancedbilling.utils.assertions;

import com.maxio.advancedbilling.exceptions.SingleStringErrorResponseException;

import java.util.concurrent.Callable;

import static org.assertj.core.api.Assertions.assertThat;

public class SingleStringErrorResponseAssert extends ApiExceptionAssert<SingleStringErrorResponseException, SingleStringErrorResponseAssert> {

    <V> SingleStringErrorResponseAssert(Callable<V> callable) {
        super(callable);
    }

    public SingleStringErrorResponseAssert hasErrorMessage(String errorMessage) {
        assertThat(actual.getErrors()).as("Expected error message").isEqualTo(errorMessage);
        return this;
    }
}
