package com.maxio.advancedbilling.utils.assertions;

import com.maxio.advancedbilling.exceptions.SubscriptionGroupUpdateErrorResponseException;

import java.util.List;
import java.util.concurrent.Callable;

import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionGroupUpdateErrorAssert extends ApiExceptionAssert<SubscriptionGroupUpdateErrorResponseException, SubscriptionGroupUpdateErrorAssert> {

    <V> SubscriptionGroupUpdateErrorAssert(Callable<V> runnable) {
        super(runnable);
    }

    public SubscriptionGroupUpdateErrorAssert hasMemberErrors(List<String> errors) {
        assertThat(actual.getErrors().getMembers()).as("Expected member errors")
                .containsExactlyInAnyOrderElementsOf(errors);
        return this;
    }
}
