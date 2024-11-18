package com.maxio.advancedbilling.controllers.reasoncodes;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.ReasonCodesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateReasonCode;
import com.maxio.advancedbilling.models.CreateReasonCodeRequest;
import com.maxio.advancedbilling.models.ListReasonCodesInput;
import com.maxio.advancedbilling.models.ReasonCodeResponse;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class ReasonCodesControllerListTest {
    private static final ReasonCodesController REASON_CODES_CONTROLLER = TestClient.createClient().getReasonCodesController();
    private static final List<ReasonCodeResponse> EXISTING_CODES = new ArrayList<>();

    @BeforeEach
    void createReasonCodes() throws IOException, ApiException {
        new TestTeardown().deleteReasonCodes();
        EXISTING_CODES.clear();
        for (int i = 0; i < 10; ++i) {
            ReasonCodeResponse response = REASON_CODES_CONTROLLER.createReasonCode(
                    new CreateReasonCodeRequest(
                            new CreateReasonCode("CODE_" + i, "Description_" + i, i)
                    ));
            EXISTING_CODES.add(response);
        }
    }

    @AfterEach
    void deleteReasonCodes() throws IOException, ApiException {
        new TestTeardown().deleteReasonCodes();
    }

    @Test
    void shouldListAllReasonCodes() throws IOException, ApiException {
        // when
        List<ReasonCodeResponse> reasonCodeResponses = REASON_CODES_CONTROLLER.listReasonCodes(new ListReasonCodesInput());

        // then
        assertThat(reasonCodeResponses)
                .hasSize(10)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyElementsOf(EXISTING_CODES);
    }

    @Test
    void shouldListReasonCodesWithPaging() throws IOException, ApiException {
        // when
        List<ReasonCodeResponse> firstPage = REASON_CODES_CONTROLLER.listReasonCodes(new ListReasonCodesInput(1, 2));
        List<ReasonCodeResponse> secondPage = REASON_CODES_CONTROLLER.listReasonCodes(new ListReasonCodesInput(2, 2));
        List<ReasonCodeResponse> bigPage = REASON_CODES_CONTROLLER.listReasonCodes(new ListReasonCodesInput(1, 8));

        // then
        assertThat(firstPage)
                .hasSize(2)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyElementsOf(EXISTING_CODES.subList(0, 2));
        assertThat(secondPage)
                .hasSize(2)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyElementsOf(EXISTING_CODES.subList(2, 4));
        assertThat(bigPage)
                .hasSize(8)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyElementsOf(EXISTING_CODES.subList(0, 8));
    }

    @Test
    void shouldReturnEmptyList() throws IOException, ApiException {
        // given
        new TestTeardown().deleteReasonCodes();

        // when
        List<ReasonCodeResponse> reasonCodes = REASON_CODES_CONTROLLER.listReasonCodes(new ListReasonCodesInput());

        // then
        assertThat(reasonCodes)
                .isNotNull()
                .isEmpty();
    }

    @Test
    void shouldThrowExceptionIfPageIsInvalid() {
        // when - then
        assertThatErrorListResponse(() -> REASON_CODES_CONTROLLER.listReasonCodes(
                new ListReasonCodesInput(0, 2)))
                .hasErrorCode(422)
                .hasErrors("invalid page: 0")
                .hasMessage("HTTP Response Not OK. Status code: 422. Response: '{errors:[invalid page: 0]}'.");
    }

    @Test
    void shouldThrowExceptionOnInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getReasonCodesController()
                .listReasonCodes(new ListReasonCodesInput()));
    }
}
