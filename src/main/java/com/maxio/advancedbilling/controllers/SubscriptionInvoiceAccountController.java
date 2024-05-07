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
import com.maxio.advancedbilling.exceptions.RefundPrepaymentBaseErrorsResponseException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.AccountBalances;
import com.maxio.advancedbilling.models.CreatePrepaymentRequest;
import com.maxio.advancedbilling.models.CreatePrepaymentResponse;
import com.maxio.advancedbilling.models.DeductServiceCreditRequest;
import com.maxio.advancedbilling.models.IssueServiceCreditRequest;
import com.maxio.advancedbilling.models.ListPrepaymentsInput;
import com.maxio.advancedbilling.models.PrepaymentResponse;
import com.maxio.advancedbilling.models.PrepaymentsResponse;
import com.maxio.advancedbilling.models.RefundPrepaymentRequest;
import com.maxio.advancedbilling.models.ServiceCredit;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class SubscriptionInvoiceAccountController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public SubscriptionInvoiceAccountController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Returns the `balance_in_cents` of the Subscription's Pending Discount, Service Credit, and
     * Prepayment accounts, as well as the sum of the Subscription's open, payable invoices.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @return    Returns the AccountBalances response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public AccountBalances readAccountBalances(
            final int subscriptionId) throws ApiException, IOException {
        return prepareReadAccountBalancesRequest(subscriptionId).execute();
    }

    /**
     * Builds the ApiCall object for readAccountBalances.
     */
    private ApiCall<AccountBalances, ApiException> prepareReadAccountBalancesRequest(
            final int subscriptionId) throws IOException {
        return new ApiCall.Builder<AccountBalances, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/account_balances.json")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, AccountBalances.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * ## Create Prepayment In order to specify a prepayment made against a subscription, specify
     * the `amount, memo, details, method`. When the `method` specified is `"credit_card_on_file"`,
     * the prepayment amount will be collected using the default credit card payment profile and
     * applied to the prepayment account balance. This is especially useful for manual replenishment
     * of prepaid subscriptions. Please note that you **can't** pass `amount_in_cents`.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  body  Optional parameter: Example:
     * @return    Returns the CreatePrepaymentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CreatePrepaymentResponse createPrepayment(
            final int subscriptionId,
            final CreatePrepaymentRequest body) throws ApiException, IOException {
        return prepareCreatePrepaymentRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for createPrepayment.
     */
    private ApiCall<CreatePrepaymentResponse, ApiException> prepareCreatePrepaymentRequest(
            final int subscriptionId,
            final CreatePrepaymentRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<CreatePrepaymentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/prepayments.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CreatePrepaymentResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This request will list a subscription's prepayments.
     * @param  input  ListPrepaymentsInput object containing request parameters
     * @return    Returns the PrepaymentsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PrepaymentsResponse listPrepayments(
            final ListPrepaymentsInput input) throws ApiException, IOException {
        return prepareListPrepaymentsRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listPrepayments.
     */
    private ApiCall<PrepaymentsResponse, ApiException> prepareListPrepaymentsRequest(
            final ListPrepaymentsInput input) throws IOException {
        return new ApiCall.Builder<PrepaymentsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/prepayments.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("filter")
                                .value(input.getFilter()).isRequired(false))
                        .templateParam(param -> param.key("subscription_id").value(input.getSubscriptionId()).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PrepaymentsResponse.class))
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("Not Found:'{$response.body}'",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Credit will be added to the subscription in the amount specified in the request body. The
     * credit is subsequently applied to the next generated invoice.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  body  Optional parameter: Example:
     * @return    Returns the ServiceCredit response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServiceCredit issueServiceCredit(
            final int subscriptionId,
            final IssueServiceCreditRequest body) throws ApiException, IOException {
        return prepareIssueServiceCreditRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for issueServiceCredit.
     */
    private ApiCall<ServiceCredit, ApiException> prepareIssueServiceCreditRequest(
            final int subscriptionId,
            final IssueServiceCreditRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServiceCredit, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/service_credits.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServiceCredit.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Credit will be removed from the subscription in the amount specified in the request body. The
     * credit amount being deducted must be equal to or less than the current credit balance.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  body  Optional parameter: Example:
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void deductServiceCredit(
            final int subscriptionId,
            final DeductServiceCreditRequest body) throws ApiException, IOException {
        prepareDeductServiceCreditRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for deductServiceCredit.
     */
    private ApiCall<Void, ApiException> prepareDeductServiceCreditRequest(
            final int subscriptionId,
            final DeductServiceCreditRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/service_credit_deductions.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint will refund, completely or partially, a particular prepayment applied to a
     * subscription. The `prepayment_id` will be the account transaction ID of the original payment.
     * The prepayment must have some amount remaining in order to be refunded. The amount may be
     * passed either as a decimal, with `amount`, or an integer in cents, with `amount_in_cents`.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  prepaymentId  Required parameter: id of prepayment
     * @param  body  Optional parameter: Example:
     * @return    Returns the PrepaymentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PrepaymentResponse refundPrepayment(
            final int subscriptionId,
            final long prepaymentId,
            final RefundPrepaymentRequest body) throws ApiException, IOException {
        return prepareRefundPrepaymentRequest(subscriptionId, prepaymentId, body).execute();
    }

    /**
     * Builds the ApiCall object for refundPrepayment.
     */
    private ApiCall<PrepaymentResponse, ApiException> prepareRefundPrepaymentRequest(
            final int subscriptionId,
            final long prepaymentId,
            final RefundPrepaymentRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<PrepaymentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/prepayments/{prepayment_id}/refunds.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("prepayment_id").value(prepaymentId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PrepaymentResponse.class))
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("Not Found:'{$response.body}'",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("400",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new RefundPrepaymentBaseErrorsResponseException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}