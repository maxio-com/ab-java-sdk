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
    public A hasUnprocessableEntityMessage() {
        super.as("hasUnprocessableEntityMessage").hasMessage("Unprocessable Entity (WebDAV)");
        return (A) this;
    }

    @SuppressWarnings("unchecked")
    public A hasHttpNotOkMessage() {
        super.as("hasHttpNotOkMessage").hasMessage("HTTP Response Not OK");
        return (A) this;
    }

    @SuppressWarnings("unchecked")
    public A hasBadRequestMessage() {
        super.as("hasBadRequestMessage").hasMessage("Bad Request");
        return (A) this;
    }

    @SuppressWarnings("unchecked")
    public A isUnprocessableEntity() {
        hasUnprocessableEntityMessage().hasErrorCode(422);
        return (A) this;
    }

    @SuppressWarnings("unchecked")
    public A isBadRequest() {
        hasBadRequestMessage().hasErrorCode(400);
        return (A) this;
    }
}
