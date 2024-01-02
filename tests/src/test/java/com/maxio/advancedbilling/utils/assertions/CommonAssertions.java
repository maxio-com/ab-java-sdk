package com.maxio.advancedbilling.utils.assertions;

import com.maxio.advancedbilling.exceptions.ApiException;
import org.assertj.core.api.ThrowableAssert;

import java.util.concurrent.Callable;
import java.util.function.Consumer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class CommonAssertions {

    private CommonAssertions() {
        // utility class
    }

    public static <V> ErrorListResponseAssert assertThatErrorListResponse(Callable<V> throwingCallable) {
        return new ErrorListResponseAssert(throwingCallable);
    }

    public static ErrorListResponseAssert assertThatErrorListResponse(ThrowingRunnable throwingRunnable) {
        return new ErrorListResponseAssert((Callable<Void>) () -> {
            throwingRunnable.run();
            return null;
        });
    }

    public static SingleErrorResponseAssert assertThatSingleErrorResponse(ThrowingRunnable throwingRunnable) {
        return new SingleErrorResponseAssert((Callable<Void>) () -> {
            throwingRunnable.run();
            return null;
        });
    }

    public static <V> NestedErrorResponseAssert assertThatNestedErrorResponse(Callable<V> throwingCallable) {
        return new NestedErrorResponseAssert(throwingCallable);
    }

    public interface ThrowingRunnable {
        void run() throws Exception;
    }

    public static void assertNotFound(ThrowableAssert.ThrowingCallable throwingCallable) {
        assertNotFound(throwingCallable, "HTTP Response Not OK");
    }

    public static void assertNotFound(ThrowableAssert.ThrowingCallable throwingCallable, String exceptionMessage) {
        assertThatExceptionOfType(ApiException.class)
                .isThrownBy(throwingCallable)
                .withMessage(exceptionMessage)
                .extracting(ApiException::getResponseCode)
                .isEqualTo(404);
    }

    public static <E extends ApiException> void assertUnprocessableEntityNotOk(Class<E> exceptionClass,
                                                                               ThrowableAssert.ThrowingCallable throwingCallable) {
        assertUnprocessableEntityNotOk(exceptionClass, throwingCallable, e -> {
        });
    }

    public static <E extends ApiException> void assertUnprocessableEntity(Class<E> exceptionClass,
                                                                          ThrowableAssert.ThrowingCallable throwingCallable) {
        assertUnprocessableEntity(exceptionClass, throwingCallable, e -> {
        });
    }

    public static <E extends ApiException> void assertUnprocessableEntityNotOk(Class<E> exceptionClass,
                                                                               ThrowableAssert.ThrowingCallable throwingCallable,
                                                                               Consumer<? super E> additionalRequirements) {
        assertUnprocessableEntity(exceptionClass, throwingCallable, "HTTP Response Not OK", additionalRequirements);
    }

    public static <E extends ApiException> void assertUnprocessableEntity(Class<E> exceptionClass,
                                                                          ThrowableAssert.ThrowingCallable throwingCallable,
                                                                          Consumer<? super E> additionalRequirements) {
        assertUnprocessableEntity(exceptionClass, throwingCallable, "Unprocessable Entity (WebDAV)", additionalRequirements);
    }

    public static <E extends ApiException> void assertUnprocessableEntity(Class<E> exceptionClass,
                                                                          ThrowableAssert.ThrowingCallable throwingCallable,
                                                                          String exceptionMessage,
                                                                          Consumer<? super E> additionalRequirements) {
        assertThatExceptionOfType(exceptionClass)
                .isThrownBy(throwingCallable)
                .withMessage(exceptionMessage)
                .satisfies(e -> assertThat(e.getResponseCode()).isEqualTo(422))
                .satisfies(additionalRequirements);
    }

    public static void assertUnauthorized(ThrowableAssert.ThrowingCallable throwingCallable) {
        assertUnauthorized(throwingCallable, "HTTP Response Not OK");
    }

    public static void assertUnauthorized(ThrowableAssert.ThrowingCallable throwingCallable, String exceptionMessage) {
        assertUnauthorized(throwingCallable, exceptionMessage, "HTTP Basic: Access denied.");
    }

    public static void assertUnauthorized(ThrowableAssert.ThrowingCallable throwingCallable,
                                          String exceptionMessage,
                                          String responseBody) {
        assertThatExceptionOfType(ApiException.class)
                .isThrownBy(throwingCallable)
                .withMessage(exceptionMessage)
                .returns(401, ApiException::getResponseCode)
                .returns(responseBody, ex -> ex.getHttpContext().getResponse().getBody().strip());
    }

}
