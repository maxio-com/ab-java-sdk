/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.controllers;

import com.maxio.advancedbilling.ApiHelper;
import com.maxio.advancedbilling.Server;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.SingleStringErrorResponseException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.ReferralValidationResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class ReferralCodesController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public ReferralCodesController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Use this method to determine if the referral code is valid and applicable within your Site.
     * This method is useful for validating referral codes that are entered by a customer. ##
     * Referrals Documentation Full documentation on how to use the referrals feature in the
     * Chargify UI can be located
     * [here](https://chargify.zendesk.com/hc/en-us/articles/4407802831643). ## Server Response If
     * the referral code is valid the status code will be `200` and the referral code will be
     * returned. If the referral code is invalid, a `404` response will be returned.
     * @param  code  Required parameter: The referral code you are trying to validate
     * @return    Returns the ReferralValidationResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ReferralValidationResponse validateReferralCode(
            final String code) throws ApiException, IOException {
        return prepareValidateReferralCodeRequest(code).execute();
    }

    /**
     * Builds the ApiCall object for validateReferralCode.
     */
    private ApiCall<ReferralValidationResponse, ApiException> prepareValidateReferralCodeRequest(
            final String code) throws IOException {
        return new ApiCall.Builder<ReferralValidationResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/referral_codes/validate.json")
                        .queryParam(param -> param.key("code")
                                .value(code))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ReferralValidationResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }
}