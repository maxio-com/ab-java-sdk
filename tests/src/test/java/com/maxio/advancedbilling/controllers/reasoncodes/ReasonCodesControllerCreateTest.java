package com.maxio.advancedbilling.controllers.reasoncodes;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.ReasonCodesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateReasonCode;
import com.maxio.advancedbilling.models.CreateReasonCodeRequest;
import com.maxio.advancedbilling.models.ReasonCode;
import com.maxio.advancedbilling.utils.TestFixtures;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class ReasonCodesControllerCreateTest {
    private static final ReasonCodesController REASON_CODES_CONTROLLER = TestClient.createClient().getReasonCodesController();

    @AfterAll
    static void deleteReasonCodes() throws IOException, ApiException {
        new TestTeardown().deleteReasonCodes();
    }

    @Test
    void shouldCreateReasonCode() throws IOException, ApiException {
        // when
        ReasonCode response = REASON_CODES_CONTROLLER.createReasonCode(new CreateReasonCodeRequest(new CreateReasonCode(
                "NOT_INTERESTED", "I'm not interested in this product.", 1
        ))).getReasonCode();

        // when
        assertThat(response.getId()).isNotNull();
        assertThat(response.getSiteId()).isEqualTo(TestFixtures.SITE_ID);
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
    void shouldThrowExceptionIfPropertyIsMissing() {
        // when - then
        assertThatErrorListResponse(() -> REASON_CODES_CONTROLLER.createReasonCode(
                new CreateReasonCodeRequest(new CreateReasonCode())))
                .hasErrorCode(422)
                .hasErrors("Code: cannot be blank.", "Description: cannot be blank.")
                .hasMessage("HTTP Response Not OK. Status code: 422. " +
                        "Response: '{errors:[Code: cannot be blank.,Description: cannot be blank.]}'.");
    }

    @Test
    void shouldThrowExceptionIfCodeExists() throws IOException, ApiException {
        // given
        CreateReasonCodeRequest request = new CreateReasonCodeRequest(new CreateReasonCode("existing", "existing", 1));
        assertThat(REASON_CODES_CONTROLLER.createReasonCode(request).getReasonCode()).isNotNull();

        // when - then
        assertThatErrorListResponse(() -> REASON_CODES_CONTROLLER.createReasonCode(request))
                .hasErrorCode(422)
                .hasErrors("Code: This code is already in use.")
                .hasMessage("HTTP Response Not OK. Status code: 422. " +
                        "Response: '{errors:[Code: This code is already in use.]}'.");
    }

    @Test
    void shouldThrowExceptionOnInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getReasonCodesController()
                .createReasonCode(new CreateReasonCodeRequest(new CreateReasonCode("code", "desc", 1)))
        );
    }
}
