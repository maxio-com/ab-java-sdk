package com.maxio.advancedbilling.utils.assertions;

import com.maxio.advancedbilling.exceptions.ApiException;
import org.assertj.core.api.ThrowableAssert;

import java.util.concurrent.Callable;

import static org.assertj.core.api.Assertions.assertThat;

public class ApiExceptionAssert<E extends ApiException, A extends ApiExceptionAssert<E, A>> extends ThrowableAssert<E> {
    ApiExceptionAssert(E e) {
        super(e);
    }

    public <V> ApiExceptionAssert(Callable<V> runnable) {
        super(runnable);
    }

    @SuppressWarnings("unchecked")
    public A hasErrorCode(int code) {
        assertThat(actual.getResponseCode()).as("Expected error code").isEqualTo(code);
        return (A) this;
    }

    @SuppressWarnings("unchecked")
    public A hasMessage(String message) {
        super.hasMessage(message);
        return (A) this;
    }

    @SuppressWarnings("unchecked")
    public A hasMessageStartingWithHttpNotOk() {
        super.as("hasHttpNotOkMessage").hasMessageStartingWith("HTTP Response Not OK");
        return (A) this;
    }

    @SuppressWarnings("unchecked")
    public A isUnprocessableEntity() {
        hasMessageStartingWithHttpNotOk().hasErrorCode(422);
        return (A) this;
    }

    @SuppressWarnings("unchecked")
    public A isBadRequest() {
        hasMessageStartingWithHttpNotOk().hasErrorCode(400);
        return (A) this;
    }
}
