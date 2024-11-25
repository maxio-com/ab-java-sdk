package com.maxio.advancedbilling.controllers.reasoncodes;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.ReasonCodesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateReasonCode;
import com.maxio.advancedbilling.models.CreateReasonCodeRequest;
import com.maxio.advancedbilling.models.ReasonCode;
import com.maxio.advancedbilling.utils.TestFixtures;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class ReasonCodesControllerReadTest {
    private static final ReasonCodesController REASON_CODES_CONTROLLER = TestClientProvider.getClient().getReasonCodesController();

    @AfterEach
    void deleteReasonCodes() throws IOException, ApiException {
        new TestTeardown().deleteReasonCodes();
    }

    @Test
    void shouldReadReasonCode() throws IOException, ApiException {
        // given
        ReasonCode createResponse = REASON_CODES_CONTROLLER.createReasonCode(new CreateReasonCodeRequest(new CreateReasonCode(
                "NOT_INTERESTED", "I'm not interested in this product.", 1
        ))).getReasonCode();

        // when
        ReasonCode response = REASON_CODES_CONTROLLER.readReasonCode(createResponse.getId()).getReasonCode();

        // then
        assertThat(response.getId()).isNotNull();
        assertThat(response.getSiteId()).isNotNull();
        assertThat(response.getCode()).isEqualTo("NOT_INTERESTED");
        assertThat(response.getPosition()).isEqualTo(1);
        assertThat(response.getDescription()).isEqualTo("I'm not interested in this product.");
        assertThat(response.getCreatedAt())
                .isNotNull()
                .isBefore(ZonedDateTime.now());
        assertThat(response.getUpdatedAt())
                .isEqualTo(response.getCreatedAt());

        ReasonCode readResponse = REASON_CODES_CONTROLLER.readReasonCode(response.getId()).getReasonCode();
        assertThat(response)
                .usingRecursiveComparison()
                .isEqualTo(readResponse);
    }

    @Test
    void shouldThrowExceptionIfCodeDoesNotExist() {
        // when - then
        assertNotFound(() -> REASON_CODES_CONTROLLER.readReasonCode(1));
    }

    @Test
    void shouldThrowExceptionOnInvalidCredentials() throws IOException, ApiException {
        // given
        ReasonCode createResponse = REASON_CODES_CONTROLLER.createReasonCode(new CreateReasonCodeRequest(new CreateReasonCode(
                "NOT_INTERESTED", "I'm not interested in this product.", 1
        ))).getReasonCode();

        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getReasonCodesController()
                .readReasonCode(createResponse.getId()));
    }
}
