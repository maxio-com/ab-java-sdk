package com.maxio.advancedbilling.utils.assertions;

import com.maxio.advancedbilling.exceptions.ApiException;
import org.assertj.core.api.ThrowableAssert;

import java.util.concurrent.Callable;
import java.util.function.Consumer;

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
        assertThatExceptionOfType(ApiException.class)
                .isThrownBy(throwingCallable)
                .withMessageStartingWith("Not Found")
                .extracting(ApiException::getResponseCode)
                .isEqualTo(404);
    }

    public static <E extends ApiException> void assertUnprocessableEntity(Class<E> exceptionClass,
                                                                          ThrowableAssert.ThrowingCallable throwingCallable) {
        assertUnprocessableEntity(exceptionClass, throwingCallable, e -> {
        });
    }

    public static <E extends ApiException> void assertUnprocessableEntity(Class<E> exceptionClass,
                                                                          ThrowableAssert.ThrowingCallable throwingCallable,
                                                                          Consumer<? super E> additionalRequirements) {
        assertThatExceptionOfType(exceptionClass)
                .isThrownBy(throwingCallable)
                .withMessageStartingWith("HTTP Response Not OK")
                .returns(422, ApiException::getResponseCode)
                .satisfies(additionalRequirements);
    }

    public static void assertUnauthorized(ThrowableAssert.ThrowingCallable throwingCallable) {
        assertThatExceptionOfType(ApiException.class)
                .isThrownBy(throwingCallable)
                .withMessageStartingWith("HTTP Response Not OK")
                .returns(401, ApiException::getResponseCode)
                .returns("HTTP Basic: Access denied.", ex -> ex.getHttpContext().getResponse().getBody().strip());
    }
}
