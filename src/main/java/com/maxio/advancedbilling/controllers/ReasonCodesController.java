/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.maxio.advancedbilling.ApiHelper;
import com.maxio.advancedbilling.Server;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.CreateReasonCodeRequest;
import com.maxio.advancedbilling.models.ListReasonCodesInput;
import com.maxio.advancedbilling.models.ReasonCodeResponse;
import com.maxio.advancedbilling.models.ReasonCodesJsonResponse;
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
     * # Reason Codes Intro ReasonCodes are a way to gain a high level view of why your customers
     * are cancelling the subcription to your product or service. Add a set of churn reason codes to
     * be displayed in-app and/or the Chargify Billing Portal. As your subscribers decide to cancel
     * their subscription, learn why they decided to cancel. ## Reason Code Documentation Full
     * documentation on how Reason Codes operate within Chargify can be located under the following
     * links. [Churn Reason
     * Codes](https://chargify.zendesk.com/hc/en-us/articles/4407896775579#churn-reason-codes) ##
     * Create Reason Code This method gives a merchant the option to create a reason codes for a
     * given Site.
     * @param  body  Optional parameter: Example:
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
            final CreateReasonCodeRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ReasonCodeResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/reason_codes.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ReasonCodeResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This method gives a merchant the option to retrieve a list of all of the current churn codes
     * for a given site.
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
            final ListReasonCodesInput input) throws IOException {
        return new ApiCall.Builder<List<ReasonCodeResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/reason_codes.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        ReasonCodeResponse[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This method gives a merchant the option to retrieve a list of a particular code for a given
     * Site by providing the unique numerical ID of the code.
     * @param  reasonCodeId  Required parameter: The Chargify id of the reason code
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
            final int reasonCodeId) throws IOException {
        return new ApiCall.Builder<ReasonCodeResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/reason_codes/{reason_code_id}.json")
                        .templateParam(param -> param.key("reason_code_id").value(reasonCodeId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ReasonCodeResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This method gives a merchant the option to update an existing reason code for a given site.
     * @param  reasonCodeId  Required parameter: The Chargify id of the reason code
     * @param  body  Optional parameter: Example:
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
            final UpdateReasonCodeRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ReasonCodeResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/reason_codes/{reason_code_id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("reason_code_id").value(reasonCodeId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ReasonCodeResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This method gives a merchant the option to delete one reason code from the Churn Reason
     * Codes. This code will be immediately removed. This action is not reversable.
     * @param  reasonCodeId  Required parameter: The Chargify id of the reason code
     * @return    Returns the ReasonCodesJsonResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ReasonCodesJsonResponse deleteReasonCode(
            final int reasonCodeId) throws ApiException, IOException {
        return prepareDeleteReasonCodeRequest(reasonCodeId).execute();
    }

    /**
     * Builds the ApiCall object for deleteReasonCode.
     */
    private ApiCall<ReasonCodesJsonResponse, ApiException> prepareDeleteReasonCodeRequest(
            final int reasonCodeId) throws IOException {
        return new ApiCall.Builder<ReasonCodesJsonResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/reason_codes/{reason_code_id}.json")
                        .templateParam(param -> param.key("reason_code_id").value(reasonCodeId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ReasonCodesJsonResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }
}