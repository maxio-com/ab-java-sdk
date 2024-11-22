package com.maxio.advancedbilling.controllers.reasoncodes;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.ReasonCodesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateReasonCode;
import com.maxio.advancedbilling.models.CreateReasonCodeRequest;
import com.maxio.advancedbilling.models.OkResponse;
import com.maxio.advancedbilling.models.ReasonCode;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class ReasonCodesControllerDeleteTest {
    private static final ReasonCodesController REASON_CODES_CONTROLLER = TestClientProvider.getClient().getReasonCodesController();

    @AfterAll
    static void deleteReasonCodes() throws IOException, ApiException {
        new TestTeardown().deleteReasonCodes();
    }

    @Test
    void shouldDeleteReasonCode() throws IOException, ApiException {
        // given
        ReasonCode createCodeResponse = REASON_CODES_CONTROLLER.createReasonCode(new CreateReasonCodeRequest(new CreateReasonCode(
                "NOT_INTERESTED", "I'm not interested in this product.", 1
        ))).getReasonCode();
        ReasonCode readResponse = REASON_CODES_CONTROLLER.readReasonCode(createCodeResponse.getId()).getReasonCode();
        assertThat(createCodeResponse)
                .usingRecursiveComparison()
                .isEqualTo(readResponse);

        // when
        OkResponse response = REASON_CODES_CONTROLLER.deleteReasonCode(createCodeResponse.getId());
        assertThat(response.getOk()).isEqualTo("ok");

        assertNotFound(() -> REASON_CODES_CONTROLLER.readReasonCode(createCodeResponse.getId()));
    }

    @Test
    void shouldThrowExceptionIfCodeDoesNotExists() {
        // when - then
        assertNotFound(() -> REASON_CODES_CONTROLLER.deleteReasonCode(1));
    }

    @Test
    void shouldThrowExceptionOnInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getReasonCodesController()
                .deleteReasonCode(1));
    }
}
