package com.maxio.advancedbilling.utils.assertions;

import com.maxio.advancedbilling.exceptions.SubscriptionResponseErrorException;
import com.maxio.advancedbilling.models.Subscription;

import java.util.concurrent.Callable;

import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionResponseErrorAssert extends ApiExceptionAssert<SubscriptionResponseErrorException, SubscriptionResponseErrorAssert> {

    public <V> SubscriptionResponseErrorAssert(Callable<V> runnable) {
        super(runnable);
    }

    public SubscriptionResponseErrorAssert isEqualTo(Subscription expected) {
        assertThat(actual.getSubscription())
                .usingRecursiveComparison()
                .ignoringFields("updatedAt")
                .isEqualTo(expected);
        return this;
    }
}
