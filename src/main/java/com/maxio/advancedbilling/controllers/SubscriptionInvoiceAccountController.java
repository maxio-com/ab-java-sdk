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
import com.maxio.advancedbilling.exceptions.RefundPrepaymentAggregatedErrorsResponseException;
import com.maxio.advancedbilling.exceptions.RefundPrepaymentBaseErrorsResponseException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.AccountBalances;
import com.maxio.advancedbilling.models.BasicDateField;
import com.maxio.advancedbilling.models.CreatePrepaymentRequest;
import com.maxio.advancedbilling.models.CreatePrepaymentResponse;
import com.maxio.advancedbilling.models.DeductServiceCreditRequest;
import com.maxio.advancedbilling.models.IssueServiceCreditRequest;
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
            final String subscriptionId) throws ApiException, IOException {
        return prepareReadAccountBalancesRequest(subscriptionId).execute();
    }

    /**
     * Builds the ApiCall object for readAccountBalances.
     */
    private ApiCall<AccountBalances, ApiException> prepareReadAccountBalancesRequest(
            final String subscriptionId) throws IOException {
        return new ApiCall.Builder<AccountBalances, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/account_balances.json")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, AccountBalances.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
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
            final String subscriptionId,
            final CreatePrepaymentRequest body) throws ApiException, IOException {
        return prepareCreatePrepaymentRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for createPrepayment.
     */
    private ApiCall<CreatePrepaymentResponse, ApiException> prepareCreatePrepaymentRequest(
            final String subscriptionId,
            final CreatePrepaymentRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<CreatePrepaymentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/prepayments.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CreatePrepaymentResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This request will list a subscription's prepayments.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  page  Optional parameter: Result records are organized in pages. By default, the
     *         first page of results is displayed. The page parameter specifies a page number of
     *         results to fetch. You can start navigating through the pages to consume the results.
     *         You do this by passing in a page parameter. Retrieve the next page by adding ?page=2
     *         to the query string. If there are no results to return, then an empty result set will
     *         be returned. Use in query `page=1`.
     * @param  perPage  Optional parameter: This parameter indicates how many records to fetch in
     *         each request. Default value is 20. The maximum allowed values is 200; any per_page
     *         value over 200 will be changed to 200. Use in query `per_page=200`.
     * @param  filterDateField  Optional parameter: The type of filter you would like to apply to
     *         your search. created_at - Time when prepayment was created. application_at - Time
     *         when prepayment was applied to invoice. Use in query `filter[date_field]=created_at`.
     * @param  filterStartDate  Optional parameter: The start date (format YYYY-MM-DD) with which to
     *         filter the date_field. Returns prepayments with a timestamp at or after midnight
     *         (12:00:00 AM) in your site’s time zone on the date specified. Use in query
     *         `filter[start_date]=2011-12-15`.
     * @param  filterEndDate  Optional parameter: The end date (format YYYY-MM-DD) with which to
     *         filter the date_field. Returns prepayments with a timestamp up to and including
     *         11:59:59PM in your site’s time zone on the date specified. Use in query
     *         `filter[end_date]=2011-12-15`.
     * @return    Returns the PrepaymentsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PrepaymentsResponse listPrepayments(
            final String subscriptionId,
            final Integer page,
            final Integer perPage,
            final BasicDateField filterDateField,
            final String filterStartDate,
            final String filterEndDate) throws ApiException, IOException {
        return prepareListPrepaymentsRequest(subscriptionId, page, perPage, filterDateField,
                filterStartDate, filterEndDate).execute();
    }

    /**
     * Builds the ApiCall object for listPrepayments.
     */
    private ApiCall<PrepaymentsResponse, ApiException> prepareListPrepaymentsRequest(
            final String subscriptionId,
            final Integer page,
            final Integer perPage,
            final BasicDateField filterDateField,
            final String filterStartDate,
            final String filterEndDate) throws IOException {
        return new ApiCall.Builder<PrepaymentsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/prepayments.json")
                        .queryParam(param -> param.key("page")
                                .value((page != null) ? page : 1).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value((perPage != null) ? perPage : 20).isRequired(false))
                        .queryParam(param -> param.key("filter[date_field]")
                                .value((filterDateField != null) ? filterDateField.value() : null).isRequired(false))
                        .queryParam(param -> param.key("filter[start_date]")
                                .value(filterStartDate).isRequired(false))
                        .queryParam(param -> param.key("filter[end_date]")
                                .value(filterEndDate).isRequired(false))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PrepaymentsResponse.class))
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
     * Credit will be added to the subscription in the amount specified in the request body. The
     * credit is subsequently applied to the next generated invoice.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  body  Optional parameter: Example:
     * @return    Returns the ServiceCredit response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServiceCredit issueServiceCredit(
            final String subscriptionId,
            final IssueServiceCreditRequest body) throws ApiException, IOException {
        return prepareIssueServiceCreditRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for issueServiceCredit.
     */
    private ApiCall<ServiceCredit, ApiException> prepareIssueServiceCreditRequest(
            final String subscriptionId,
            final IssueServiceCreditRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ServiceCredit, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/service_credits.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ServiceCredit.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
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
            final String subscriptionId,
            final DeductServiceCreditRequest body) throws ApiException, IOException {
        prepareDeductServiceCreditRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for deductServiceCredit.
     */
    private ApiCall<Void, ApiException> prepareDeductServiceCreditRequest(
            final String subscriptionId,
            final DeductServiceCreditRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/service_credit_deductions.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
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
            final String subscriptionId,
            final String prepaymentId,
            final RefundPrepaymentRequest body) throws ApiException, IOException {
        return prepareRefundPrepaymentRequest(subscriptionId, prepaymentId, body).execute();
    }

    /**
     * Builds the ApiCall object for refundPrepayment.
     */
    private ApiCall<PrepaymentResponse, ApiException> prepareRefundPrepaymentRequest(
            final String subscriptionId,
            final String prepaymentId,
            final RefundPrepaymentRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<PrepaymentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/prepayments/{prepayment_id}/refunds.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("prepayment_id").value(prepaymentId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PrepaymentResponse.class))
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad Request",
                                (reason, context) -> new RefundPrepaymentBaseErrorsResponseException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity",
                                (reason, context) -> new RefundPrepaymentAggregatedErrorsResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }
}
