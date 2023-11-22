package com.maxio.advancedbilling.utils;

import com.maxio.advancedbilling.exceptions.ApiException;
import org.assertj.core.api.ThrowableAssert;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class CommonAssertions {

    private CommonAssertions() {
        // utility class
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
}
