package com.maxio.advancedbilling.utils.assertions;

import com.maxio.advancedbilling.exceptions.SingleErrorResponseErrorException;

import java.util.concurrent.Callable;

import static org.assertj.core.api.Assertions.assertThat;

public class SingleErrorResponseAssert extends ApiExceptionAssert<SingleErrorResponseErrorException, SingleErrorResponseAssert> {

    <V> SingleErrorResponseAssert(Callable<V> callable) {
        super(callable);
    }

    public SingleErrorResponseAssert hasErrorMessage(String errorMessage) {
        assertThat(actual.getError()).as("Expected error message").isEqualTo(errorMessage);
        return this;
    }
}
