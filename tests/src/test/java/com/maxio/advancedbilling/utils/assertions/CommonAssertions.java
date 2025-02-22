package com.maxio.advancedbilling.utils.assertions;

import com.maxio.advancedbilling.exceptions.ApiException;
import org.assertj.core.api.ThrowableAssert;
import org.assertj.core.api.ThrowableAssertAlternative;
import org.assertj.core.api.ThrowingConsumer;

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

    public static SingleStringErrorResponseAssert assertThatSingleStringErrorResponse(ThrowingRunnable throwingRunnable) {
        return new SingleStringErrorResponseAssert((Callable<Void>) () -> {
            throwingRunnable.run();
            return null;
        });
    }

    public static <V> ErrorArrayMapResponseAssert assertThatErrorArrayMapResponse(Callable<V> throwingCallable) {
        return new ErrorArrayMapResponseAssert(throwingCallable);
    }

    public static <V> ErrorStringMapResponseAssert assertThatErrorStringMapResponse(Callable<V> throwingCallable) {
        return new ErrorStringMapResponseAssert(throwingCallable);
    }

    public static <V> SubscriptionGroupUpdateErrorAssert assertSubscriptionGroupUpdateErrors(Callable<V> throwingCallable) {
        return new SubscriptionGroupUpdateErrorAssert(throwingCallable);
    }

    public static <V> SubscriptionResponseErrorAssert assertSubscriptionResponseError(Callable<V> throwingCallable) {
        return new SubscriptionResponseErrorAssert(throwingCallable);
    }

    public static void assertNotFound(ThrowableAssert.ThrowingCallable throwingCallable) {
        assertThatExceptionOfType(ApiException.class)
                .isThrownBy(throwingCallable)
                .withMessageStartingWith("Not Found")
                .extracting(ApiException::getResponseCode)
                .isEqualTo(404);
    }

    public static void assertNotFound(ThrowableAssert.ThrowingCallable throwingCallable, String message) {
        assertThatExceptionOfType(ApiException.class)
                .isThrownBy(throwingCallable)
                .withMessage(message)
                .extracting(ApiException::getResponseCode)
                .isEqualTo(404);
    }

    public static <E extends ApiException> void assertUnprocessableEntity(Class<E> exceptionClass,
                                                                          ThrowableAssert.ThrowingCallable throwingCallable,
                                                                          ThrowingConsumer<? super E> additionalRequirements) {
        assertUnprocessableEntity(exceptionClass, throwingCallable)
                .satisfies(additionalRequirements);
    }

    public static <E extends ApiException> void assertUnprocessableEntity(Class<E> exceptionClass,
                                                                          ThrowableAssert.ThrowingCallable throwingCallable,
                                                                          Consumer<? super E> additionalRequirements) {
        assertUnprocessableEntity(exceptionClass, throwingCallable)
                .satisfies(additionalRequirements);
    }

    public static <E extends ApiException> ThrowableAssertAlternative<E> assertUnprocessableEntity(Class<E> exceptionClass,
                                                                                                   ThrowableAssert.ThrowingCallable throwingCallable) {
        return assertThatExceptionOfType(exceptionClass)
                .isThrownBy(throwingCallable)
                .withMessageStartingWith("HTTP Response Not OK")
                .returns(422, ApiException::getResponseCode);
    }

    public static void assertUnauthorized(ThrowableAssert.ThrowingCallable throwingCallable) {
        assertThatExceptionOfType(ApiException.class)
                .isThrownBy(throwingCallable)
                .withMessageStartingWith("HTTP Response Not OK")
                .returns(401, ApiException::getResponseCode)
                .returns("HTTP Basic: Access denied.", ex -> ex.getHttpContext().getResponse().getBody().strip());
    }

    public interface ThrowingRunnable {
        void run() throws Exception;
    }
}
