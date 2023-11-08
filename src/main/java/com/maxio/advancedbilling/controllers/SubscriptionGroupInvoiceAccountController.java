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
import com.maxio.advancedbilling.models.DeductServiceCreditRequest;
import com.maxio.advancedbilling.models.IssueServiceCreditRequest;
import com.maxio.advancedbilling.models.ListPrepaymentsForSubscriptionGroupInput;
import com.maxio.advancedbilling.models.ListSubscriptionGroupPrepaymentResponse;
import com.maxio.advancedbilling.models.ServiceCredit;
import com.maxio.advancedbilling.models.ServiceCreditResponse;
import com.maxio.advancedbilling.models.SubscriptionGroupPrepaymentRequest;
import com.maxio.advancedbilling.models.SubscriptionGroupPrepaymentResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class SubscriptionGroupInvoiceAccountController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public SubscriptionGroupInvoiceAccountController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * A prepayment can be added for a subscription group identified by the group's `uid`. This
     * endpoint requires a `amount`, `details`, `method`, and `memo`. On success, the prepayment
     * will be added to the group's prepayment balance.
     * @param  uid  Required parameter: The uid of the subscription group
     * @param  body  Optional parameter: Example:
     * @return    Returns the SubscriptionGroupPrepaymentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionGroupPrepaymentResponse createSubscriptionGroupPrepayment(
            final String uid,
            final SubscriptionGroupPrepaymentRequest body) throws ApiException, IOException {
        return prepareCreateSubscriptionGroupPrepaymentRequest(uid, body).execute();
    }

    /**
     * Builds the ApiCall object for createSubscriptionGroupPrepayment.
     */
    private ApiCall<SubscriptionGroupPrepaymentResponse, ApiException> prepareCreateSubscriptionGroupPrepaymentRequest(
            final String uid,
            final SubscriptionGroupPrepaymentRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<SubscriptionGroupPrepaymentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscription_groups/{uid}/prepayments.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SubscriptionGroupPrepaymentResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This request will list a subscription group's prepayments.
     * @param  input  ListPrepaymentsForSubscriptionGroupInput object containing request parameters
     * @return    Returns the ListSubscriptionGroupPrepaymentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListSubscriptionGroupPrepaymentResponse listPrepaymentsForSubscriptionGroup(
            final ListPrepaymentsForSubscriptionGroupInput input) throws ApiException, IOException {
        return prepareListPrepaymentsForSubscriptionGroupRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listPrepaymentsForSubscriptionGroup.
     */
    private ApiCall<ListSubscriptionGroupPrepaymentResponse, ApiException> prepareListPrepaymentsForSubscriptionGroupRequest(
            final ListPrepaymentsForSubscriptionGroupInput input) throws IOException {
        return new ApiCall.Builder<ListSubscriptionGroupPrepaymentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscription_groups/{uid}/prepayments.json")
                        .queryParam(param -> param.key("filter[date_field]")
                                .value((input.getFilterDateField() != null) ? input.getFilterDateField().value() : null).isRequired(false))
                        .queryParam(param -> param.key("filter[end_date]")
                                .value(input.getFilterEndDate()).isRequired(false))
                        .queryParam(param -> param.key("filter[start_date]")
                                .value(input.getFilterStartDate()).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .templateParam(param -> param.key("uid").value(input.getUid())
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListSubscriptionGroupPrepaymentResponse.class))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Credit can be issued for a subscription group identified by the group's `uid`. Credit will be
     * added to the group in the amount specified in the request body. The credit will be applied to
     * group member invoices as they are generated.
     * @param  uid  Required parameter: The uid of the subscription group
     * @param  body  Optional parameter: Example:
     * @return    Returns the ServiceCreditResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServiceCreditResponse issueSubscriptionGroupServiceCredits(
            final String uid,
            final IssueServiceCreditRequest body) throws ApiException, IOException {
        return prepareIssueSubscriptionGroupServiceCreditsRequest(uid, body).execute();
    }

    /**
     * Builds the ApiCall object for issueSubscriptionGroupServiceCredits.
     */
    private ApiCall<ServiceCreditResponse, ApiException> prepareIssueSubscriptionGroupServiceCreditsRequest(
            final String uid,
            final IssueServiceCreditRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServiceCreditResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscription_groups/{uid}/service_credits.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServiceCreditResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Credit can be deducted for a subscription group identified by the group's `uid`. Credit will
     * be deducted from the group in the amount specified in the request body.
     * @param  uid  Required parameter: The uid of the subscription group
     * @param  body  Optional parameter: Example:
     * @return    Returns the ServiceCredit response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServiceCredit deductSubscriptionGroupServiceCredits(
            final String uid,
            final DeductServiceCreditRequest body) throws ApiException, IOException {
        return prepareDeductSubscriptionGroupServiceCreditsRequest(uid, body).execute();
    }

    /**
     * Builds the ApiCall object for deductSubscriptionGroupServiceCredits.
     */
    private ApiCall<ServiceCredit, ApiException> prepareDeductSubscriptionGroupServiceCreditsRequest(
            final String uid,
            final DeductServiceCreditRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServiceCredit, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscription_groups/{uid}/service_credit_deductions.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServiceCredit.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }
}