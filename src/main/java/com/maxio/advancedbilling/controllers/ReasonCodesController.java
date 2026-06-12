/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.controllers;

import com.maxio.advancedbilling.ApiHelper;
import com.maxio.advancedbilling.Server;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.CreateReasonCodeRequest;
import com.maxio.advancedbilling.models.ListReasonCodesInput;
import com.maxio.advancedbilling.models.OkResponse;
import com.maxio.advancedbilling.models.ReasonCodeResponse;
import com.maxio.advancedbilling.models.UpdateReasonCodeRequest;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;
import java.util.List;

/**
 * This class lists all the endpoints of the groups.
 */
public final class ReasonCodesController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public ReasonCodesController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Creates a reason code for a given site. # Reason Codes Intro Reason Codes are a way to gain a
     * high-level view of why your customers are cancelling the subscription to your product or
     * service. Add a set of churn reason codes to be displayed in-app and/or the Maxio Billing
     * Portal. As your subscribers decide to cancel their subscription, learn why they decided to
     * cancel. ## Reason Code Documentation Full documentation on how Reason Codes operate within
     * Advanced Billing can be located under the following links. [Churn Reason
     * Codes](https://maxio.zendesk.com/hc/en-us/articles/24286647554701-Churn-Reason-Codes) ##
     * Create Reason Code This method gives a merchant the option to create reason codes for a given
     * site.
     * @param  body  Optional parameter:
     * @return    Returns the ReasonCodeResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ReasonCodeResponse createReasonCode(
            final CreateReasonCodeRequest body) throws ApiException, IOException {
        return prepareCreateReasonCodeRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for createReasonCode.
     */
    private ApiCall<ReasonCodeResponse, ApiException> prepareCreateReasonCodeRequest(
            final CreateReasonCodeRequest body) {
        return new ApiCall.Builder<ReasonCodeResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/reason_codes.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ReasonCodeResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Lists all current churn codes for a given site.
     * @param  input  ListReasonCodesInput object containing request parameters
     * @return    Returns the List of ReasonCodeResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<ReasonCodeResponse> listReasonCodes(
            final ListReasonCodesInput input) throws ApiException, IOException {
        return prepareListReasonCodesRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listReasonCodes.
     */
    private ApiCall<List<ReasonCodeResponse>, ApiException> prepareListReasonCodesRequest(
            final ListReasonCodesInput input) {
        return new ApiCall.Builder<List<ReasonCodeResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/reason_codes.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        ReasonCodeResponse[].class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns a particular churn reason code for a given site by its unique ID.
     * @param  reasonCodeId  Required parameter: The Advanced Billing id of the reason code
     * @return    Returns the ReasonCodeResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ReasonCodeResponse readReasonCode(
            final int reasonCodeId) throws ApiException, IOException {
        return prepareReadReasonCodeRequest(reasonCodeId).execute();
    }

    /**
     * Builds the ApiCall object for readReasonCode.
     */
    private ApiCall<ReasonCodeResponse, ApiException> prepareReadReasonCodeRequest(
            final int reasonCodeId) {
        return new ApiCall.Builder<ReasonCodeResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/reason_codes/{reason_code_id}.json")
                        .templateParam(param -> param.key("reason_code_id").value(reasonCodeId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ReasonCodeResponse.class))
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("Not Found:'{$response.body}'",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Updates an existing reason code for a given site.
     * @param  reasonCodeId  Required parameter: The Advanced Billing id of the reason code
     * @param  body  Optional parameter:
     * @return    Returns the ReasonCodeResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ReasonCodeResponse updateReasonCode(
            final int reasonCodeId,
            final UpdateReasonCodeRequest body) throws ApiException, IOException {
        return prepareUpdateReasonCodeRequest(reasonCodeId, body).execute();
    }

    /**
     * Builds the ApiCall object for updateReasonCode.
     */
    private ApiCall<ReasonCodeResponse, ApiException> prepareUpdateReasonCodeRequest(
            final int reasonCodeId,
            final UpdateReasonCodeRequest body) {
        return new ApiCall.Builder<ReasonCodeResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/reason_codes/{reason_code_id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("reason_code_id").value(reasonCodeId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ReasonCodeResponse.class))
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("Not Found:'{$response.body}'",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Deletes a reason code from the Churn Reason Codes. This code will be immediately removed.
     * This action is not reversible.
     * @param  reasonCodeId  Required parameter: The Advanced Billing id of the reason code
     * @return    Returns the OkResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public OkResponse deleteReasonCode(
            final int reasonCodeId) throws ApiException, IOException {
        return prepareDeleteReasonCodeRequest(reasonCodeId).execute();
    }

    /**
     * Builds the ApiCall object for deleteReasonCode.
     */
    private ApiCall<OkResponse, ApiException> prepareDeleteReasonCodeRequest(
            final int reasonCodeId) {
        return new ApiCall.Builder<OkResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/reason_codes/{reason_code_id}.json")
                        .templateParam(param -> param.key("reason_code_id").value(reasonCodeId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, OkResponse.class))
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("Not Found:'{$response.body}'",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}