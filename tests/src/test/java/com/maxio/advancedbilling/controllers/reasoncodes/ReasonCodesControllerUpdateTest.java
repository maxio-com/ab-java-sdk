package com.maxio.advancedbilling.controllers.reasoncodes;

import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.ReasonCodesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateReasonCode;
import com.maxio.advancedbilling.models.CreateReasonCodeRequest;
import com.maxio.advancedbilling.models.ReasonCode;
import com.maxio.advancedbilling.models.UpdateReasonCode;
import com.maxio.advancedbilling.models.UpdateReasonCodeRequest;
import com.maxio.advancedbilling.utils.TestFixtures;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.concurrent.TimeUnit;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class ReasonCodesControllerUpdateTest {
    private static final ReasonCodesController REASON_CODES_CONTROLLER = TestClientProvider.getClient().getReasonCodesController();

    @AfterEach
    void deleteReasonCodes() throws IOException, ApiException {
        new TestTeardown().deleteReasonCodes();
    }

    @Test
    void shouldUpdateReasonCode() throws IOException, ApiException, InterruptedException {
        // given
        ReasonCode createResponse = REASON_CODES_CONTROLLER.createReasonCode(new CreateReasonCodeRequest(new CreateReasonCode(
                "NOT_INTERESTED", "I'm not interested in this product.", 1
        ))).getReasonCode();

        TimeUnit.SECONDS.sleep(1);

        // when
        ReasonCode updateResponse = REASON_CODES_CONTROLLER.updateReasonCode(createResponse.getId(), new UpdateReasonCodeRequest(
                        new UpdateReasonCode("NEW_CODE", "New desc", 2)))
                .getReasonCode();

        // then
        assertThat(updateResponse.getId()).isEqualTo(createResponse.getId());
        assertThat(updateResponse.getSiteId()).isNotNull();
        assertThat(updateResponse.getCode()).isEqualTo("NEW_CODE");
        assertThat(updateResponse.getPosition()).isEqualTo(2);
        assertThat(updateResponse.getDescription()).isEqualTo("New desc");
        assertThat(updateResponse.getCreatedAt())
                .isNotNull()
                .isBefore(ZonedDateTime.now());
        assertThat(updateResponse.getUpdatedAt())
                .isAfterOrEqualTo(updateResponse.getCreatedAt());

        ReasonCode readResponse = REASON_CODES_CONTROLLER.readReasonCode(createResponse.getId()).getReasonCode();
        assertThat(updateResponse)
                .usingRecursiveComparison()
                .isEqualTo(readResponse);
    }

    @Test
    void shouldUpdateNonNullProperty() throws IOException, ApiException {
        // given
        ReasonCode createResponse = REASON_CODES_CONTROLLER.createReasonCode(new CreateReasonCodeRequest(new CreateReasonCode(
                "NOT_INTERESTED", "I'm not interested in this product.", 1
        ))).getReasonCode();

        // when - then
        ReasonCode response = REASON_CODES_CONTROLLER.updateReasonCode(createResponse.getId(), new UpdateReasonCodeRequest(
                        new UpdateReasonCode(null, "new desc", null)))
                .getReasonCode();

        assertThat(response.getCode()).isEqualTo("NOT_INTERESTED");
        assertThat(response.getDescription()).isEqualTo("new desc");
        assertThat(response.getPosition()).isEqualTo(1);
    }

    @Test
    void shouldThrowExceptionIfCodeExists() throws IOException, ApiException {
        // given
        REASON_CODES_CONTROLLER.createReasonCode(new CreateReasonCodeRequest(new CreateReasonCode(
                "NOT_INTERESTED", "I'm not interested in this product.", 1
        )));

        ReasonCode code = REASON_CODES_CONTROLLER.createReasonCode(new CreateReasonCodeRequest(new CreateReasonCode(
                "NOT_INTERESTED_2", "I'm not interested in this product.", 1
        ))).getReasonCode();

        // when - then
        assertThatErrorListResponse(() -> REASON_CODES_CONTROLLER.updateReasonCode(code.getId(),
                new UpdateReasonCodeRequest(new UpdateReasonCode("NOT_INTERESTED", "desc", 1))))
                .hasErrorCode(422)
                .hasErrors("Code: This code is already in use.")
                .hasMessage("HTTP Response Not OK. Status code: 422. " +
                        "Response: '{errors:[Code: This code is already in use.]}'.");
    }

    @Test
    void shouldThrowExceptionIfCodeDoesNotExist() {
        // when - then
        assertNotFound(() -> REASON_CODES_CONTROLLER.updateReasonCode(1,
                new UpdateReasonCodeRequest(new UpdateReasonCode("code", "desc", 1)))
        );
    }

    @Test
    void shouldThrowExceptionOnInvalidCredentials() throws IOException, ApiException {
        // given
        ReasonCode createResponse = REASON_CODES_CONTROLLER.createReasonCode(new CreateReasonCodeRequest(new CreateReasonCode(
                "NOT_INTERESTED", "I'm not interested in this product.", 1
        ))).getReasonCode();

        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getReasonCodesController()
                .updateReasonCode(createResponse.getId(),
                        new UpdateReasonCodeRequest(new UpdateReasonCode("code", "desc", 1)))
        );
    }
}
