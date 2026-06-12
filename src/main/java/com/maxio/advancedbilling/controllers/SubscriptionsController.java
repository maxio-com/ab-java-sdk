/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.controllers;

import com.maxio.advancedbilling.ApiHelper;
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.Server;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorArrayMapResponseException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.exceptions.SingleErrorResponseException;
import com.maxio.advancedbilling.exceptions.SubscriptionAddCouponErrorException;
import com.maxio.advancedbilling.exceptions.SubscriptionRemoveCouponErrorsException;
import com.maxio.advancedbilling.exceptions.SubscriptionResponseErrorException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.ActivateSubscriptionRequest;
import com.maxio.advancedbilling.models.AddCouponsRequest;
import com.maxio.advancedbilling.models.CreateSubscriptionRequest;
import com.maxio.advancedbilling.models.ListSubscriptionsInput;
import com.maxio.advancedbilling.models.OverrideSubscriptionRequest;
import com.maxio.advancedbilling.models.PrepaidConfigurationResponse;
import com.maxio.advancedbilling.models.SubscriptionInclude;
import com.maxio.advancedbilling.models.SubscriptionListInclude;
import com.maxio.advancedbilling.models.SubscriptionPreviewResponse;
import com.maxio.advancedbilling.models.SubscriptionPurgeType;
import com.maxio.advancedbilling.models.SubscriptionResponse;
import com.maxio.advancedbilling.models.UpdateSubscriptionRequest;
import com.maxio.advancedbilling.models.UpsertPrepaidConfigurationRequest;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;
import java.util.List;

/**
 * This class lists all the endpoints of the groups.
 */
public final class SubscriptionsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public SubscriptionsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Creates a Subscription for a customer and product. Specify the product with `product_id` or
     * `product_handle`. To set a specific product price point, use `product_price_point_handle` or
     * `product_price_point_id`. Identify an existing customer with `customer_id` or
     * `customer_reference`. Optionally, include an existing payment profile using
     * `payment_profile_id`. To create a new customer, pass customer_attributes. Select an option
     * from the **Request Examples** drop-down on the right side of the portal to see examples of
     * common scenarios for creating subscriptions. See the [Subscription
     * Signups](page:introduction/basic-concepts/subscription-signup) article for more information
     * on working with subscriptions in Advanced Billing. ## Payment information Payment information
     * may be required to create a subscription, depending on the options for the Product being
     * subscribed. See [product
     * options](https://docs.maxio.com/hc/en-us/articles/24261076617869-Edit-Products) for more
     * information. See the [Payments Profile]($e/Payment%20Profiles/createPaymentProfile) endpoint
     * for details on payment parameters. Do not use real card information for testing. See the
     * Sites articles that cover [testing your site
     * setup](https://docs.maxio.com/hc/en-us/articles/24250712113165-Testing-Overview#testing-overview-0-0)
     * for more details on testing in your sandbox. Note that collecting and sending raw card
     * details in production requires [PCI
     * compliance](https://docs.maxio.com/hc/en-us/articles/24183956938381-PCI-Compliance#pci-compliance-0-0)
     * on your end. If your business is not PCI compliant, use [Maxio.js (formerly
     * Chargify.js)](https://docs.maxio.com/hc/en-us/articles/38163190843789-Chargify-js-Overview#chargify-js-overview-0-0)
     * to collect credit card or bank account information. ## 3D Secure (3DS) Authentication
     * post-authentication flow When a payment requires 3DS Authentication to adhere to Strong
     * Customer Authentication (SCA), the request enters a post-authentication flow where a 422
     * Unprocessable Entity status is returned with an action_link that will direct the customer
     * through 3DS Authentication. See the [3D Secure Post-Authentication
     * Flow](https://docs.maxio.com/hc/en-us/articles/44277749524365-3D-Secure-Post-Authentication-Flow)
     * article in the product documentation to learn how to manage the redirect flow.
     * @param  body  Optional parameter:
     * @return    Returns the SubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionResponse createSubscription(
            final CreateSubscriptionRequest body) throws ApiException, IOException {
        return prepareCreateSubscriptionRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for createSubscription.
     */
    private ApiCall<SubscriptionResponse, ApiException> prepareCreateSubscriptionRequest(
            final CreateSubscriptionRequest body) {
        return new ApiCall.Builder<SubscriptionResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions.json")
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
                                response -> ApiHelper.deserialize(response, SubscriptionResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns an array of subscriptions from a Site. Pay close attention to query string filters
     * and pagination in order to control responses from the server. ## Search for a subscription
     * Use the query strings below to search for a subscription using the criteria available. The
     * return value will be an array. ## Self-Service Page token Self-Service Page token for the
     * subscriptions is not returned by default. If this information is desired, the
     * include[]=self_service_page_token parameter must be provided with the request.
     * @param  input  ListSubscriptionsInput object containing request parameters
     * @return    Returns the List of SubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<SubscriptionResponse> listSubscriptions(
            final ListSubscriptionsInput input) throws ApiException, IOException {
        return prepareListSubscriptionsRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listSubscriptions.
     */
    private ApiCall<List<SubscriptionResponse>, ApiException> prepareListSubscriptionsRequest(
            final ListSubscriptionsInput input) {
        return new ApiCall.Builder<List<SubscriptionResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("state")
                                .value((input.getState() != null) ? input.getState().value() : null).isRequired(false))
                        .queryParam(param -> param.key("product")
                                .value(input.getProduct()).isRequired(false))
                        .queryParam(param -> param.key("product_price_point_id")
                                .value(input.getProductPricePointId()).isRequired(false))
                        .queryParam(param -> param.key("coupon")
                                .value(input.getCoupon()).isRequired(false))
                        .queryParam(param -> param.key("coupon_code")
                                .value(input.getCouponCode()).isRequired(false))
                        .queryParam(param -> param.key("date_field")
                                .value((input.getDateField() != null) ? input.getDateField().value() : null).isRequired(false))
                        .queryParam(param -> param.key("start_date")
                                .value(DateTimeHelper.toSimpleDate(input.getStartDate())).isRequired(false))
                        .queryParam(param -> param.key("end_date")
                                .value(DateTimeHelper.toSimpleDate(input.getEndDate())).isRequired(false))
                        .queryParam(param -> param.key("start_datetime")
                                .value(DateTimeHelper.toRfc8601DateTime(input.getStartDatetime())).isRequired(false))
                        .queryParam(param -> param.key("end_datetime")
                                .value(DateTimeHelper.toRfc8601DateTime(input.getEndDatetime())).isRequired(false))
                        .queryParam(param -> param.key("metadata")
                                .value(input.getMetadata()).isRequired(false))
                        .queryParam(param -> param.key("direction")
                                .value((input.getDirection() != null) ? input.getDirection().value() : null).isRequired(false))
                        .queryParam(param -> param.key("sort")
                                .value((input.getSort() != null) ? input.getSort().value() : "signup_date").isRequired(false))
                        .queryParam(param -> param.key("include")
                                .value(SubscriptionListInclude.toValue(input.getInclude())).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        SubscriptionResponse[].class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Updates one or more attributes of a subscription. ## Update Subscription Payment Method
     * Change the card that your subscriber uses for their subscription. You can also use this
     * method to change the expiration date of the card **if your gateway allows**. Do not use real
     * card information for testing. See the Sites articles that cover [testing your site
     * setup](https://docs.maxio.com/hc/en-us/articles/24250712113165-Testing-Overview#testing-overview-0-0)
     * for more details on testing in your sandbox. Note that collecting and sending raw card
     * details in production requires [PCI
     * compliance](https://docs.maxio.com/hc/en-us/articles/24183956938381-PCI-Compliance#pci-compliance-0-0)
     * on your end. If your business is not PCI compliant, use
     * [Chargify.js](https://docs.maxio.com/hc/en-us/articles/38163190843789-Chargify-js-Overview#chargify-js-overview-0-0)
     * to collect credit card or bank account information. &gt; Note: Partial card updates for
     * **Authorize.Net** are not allowed via this endpoint. The existing Payment Profile must be
     * directly updated instead. ## Update Product You also use this method to change the
     * subscription to a different product by setting a new value for product_handle. A product
     * change can be done in two different ways, **product change** or **delayed product change**.
     * ### Product Change You can change a subscription's product. The new payment amount is
     * calculated and charged at the normal start of the next period. If you require complex product
     * changes or prorated upgrades and downgrades instead, please see the documentation on
     * [Migrating Subscription
     * Products](https://docs.maxio.com/hc/en-us/articles/24252069837581-Product-Changes-and-Migrations#product-changes-and-migrations-0-0).
     * To perform a product change, set either the `product_handle` or `product_id` attribute to
     * that of a different product from the same site as the subscription. You can also change the
     * price point by passing in either `product_price_point_id` or `product_price_point_handle` -
     * otherwise the new product's default price point is used. ### Delayed Product Change This
     * method also changes the product and/or price point, and the new payment amount is calculated
     * and charged at the normal start of the next period. This method schedules the product change
     * to happen automatically at the subscription’s next renewal date. To perform a delayed product
     * change, set the `product_handle` attribute as you would in a regular product change, but also
     * set the `product_change_delayed` attribute to `true`. No proration applies in this case. You
     * can also perform a delayed change to the price point by passing in either
     * `product_price_point_id` or `product_price_point_handle` &gt; **Note:** To cancel a delayed
     * product change, set `next_product_id` to an empty string. ## Billing Date Changes You can
     * update dates for a subscription. ### Regular Billing Date Changes Send the `next_billing_at`
     * to set the next billing date for the subscription. After that date passes and the
     * subscription is processed, the following billing date will be set according to the
     * subscription's product period. &gt; Note: If you pass an invalid date, the correct date is
     * automatically set to the correct date. For example, if February 30 is passed, the next
     * billing would be set to March 2nd in a non-leap year. The server response will not return
     * data under the key/value pair of `next_billing_at`. View the key/value pair of
     * `current_period_ends_at` to verify that the `next_billing_at` date has been changed
     * successfully. ### Calendar Billing and Snap Day Changes For a subscription using Calendar
     * Billing, setting the next billing date is a bit different. Send the `snap_day` attribute to
     * change the calendar billing date for **a subscription using a product eligible for calendar
     * billing**. &gt; Note: If you change the product associated with a subscription that contains a
     * `snap_day` and immediately `READ/GET` the subscription data, it will still contain original
     * `snap_day`. The `snap_day` will reset to null on the next billing cycle. This is because a
     * product change is instantaneous and only affects the product associated with a subscription.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  body  Optional parameter:
     * @return    Returns the SubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionResponse updateSubscription(
            final int subscriptionId,
            final UpdateSubscriptionRequest body) throws ApiException, IOException {
        return prepareUpdateSubscriptionRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for updateSubscription.
     */
    private ApiCall<SubscriptionResponse, ApiException> prepareUpdateSubscriptionRequest(
            final int subscriptionId,
            final UpdateSubscriptionRequest body) {
        return new ApiCall.Builder<SubscriptionResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}.json")
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
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SubscriptionResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Retrieves subscription details. ## Self-Service Page token Self-Service Page token for the
     * subscription is not returned by default. If this information is desired, the
     * include[]=self_service_page_token parameter must be provided with the request.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  include  Optional parameter: Allows including additional data in the response. Use in
     *         query: `include[]=coupons&amp;include[]=self_service_page_token`.
     * @return    Returns the SubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionResponse readSubscription(
            final int subscriptionId,
            final List<SubscriptionInclude> include) throws ApiException, IOException {
        return prepareReadSubscriptionRequest(subscriptionId, include).execute();
    }

    /**
     * Builds the ApiCall object for readSubscription.
     */
    private ApiCall<SubscriptionResponse, ApiException> prepareReadSubscriptionRequest(
            final int subscriptionId,
            final List<SubscriptionInclude> include) {
        return new ApiCall.Builder<SubscriptionResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}.json")
                        .queryParam(param -> param.key("include")
                                .value(SubscriptionInclude.toValue(include)).isRequired(false))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SubscriptionResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Sets certain subscription fields that are usually managed automatically. Some of the fields
     * can be set via the normal Subscriptions Update API, but others can only be set using this
     * endpoint. This endpoint is provided for cases where you need to “align” Advanced Billing data
     * with data that happened in your system, perhaps before you started using Advanced Billing.
     * For example, you may choose to import your historical subscription data, and would like the
     * activation and cancellation dates in Advanced Billing to match your existing historical
     * dates. Advanced Billing does not backfill historical events (i.e. from the Events API), but
     * some static data can be changed via this API. Why are some fields only settable from this
     * endpoint, and not the normal subscription create and update endpoints? Because we want users
     * of this endpoint to be aware that these fields are usually managed by Advanced Billing, and
     * using this API means **you are stepping out on your own.** Changing these fields will not
     * affect any other attributes. For example, adding an expiration date will not affect the next
     * assessment date on the subscription. If you regularly need to override the
     * current_period_starts_at for new subscriptions, this can also be accomplished by setting both
     * `previous_billing_at` and `next_billing_at` at subscription creation. See the documentation
     * on [Importing Subscriptions](./b3A6MTQxMDgzODg-create-subscription#subscriptions-import) for
     * more information. ## Limitations When passing `current_period_starts_at` some validations are
     * made: 1. The subscription needs to be unbilled (no statements or invoices). 2. The value
     * passed must be a valid date/time. We recommend using the iso 8601 format. 3. The value passed
     * must be before the current date/time. If unpermitted parameters are sent, a 400 HTTP response
     * is sent along with a string giving the reason for the problem.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  body  Optional parameter: Only these fields are available to be set.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void overrideSubscription(
            final int subscriptionId,
            final OverrideSubscriptionRequest body) throws ApiException, IOException {
        prepareOverrideSubscriptionRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for overrideSubscription.
     */
    private ApiCall<Void, ApiException> prepareOverrideSubscriptionRequest(
            final int subscriptionId,
            final OverrideSubscriptionRequest body) {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/override.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new SingleErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Finds a subscription by its reference.
     * @param  reference  Optional parameter: Subscription reference
     * @return    Returns the SubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionResponse findSubscription(
            final String reference) throws ApiException, IOException {
        return prepareFindSubscriptionRequest(reference).execute();
    }

    /**
     * Builds the ApiCall object for findSubscription.
     */
    private ApiCall<SubscriptionResponse, ApiException> prepareFindSubscriptionRequest(
            final String reference) {
        return new ApiCall.Builder<SubscriptionResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/lookup.json")
                        .queryParam(param -> param.key("reference")
                                .value(reference).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SubscriptionResponse.class))
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("Not Found:'{$response.body}'",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Purges an individual subscription for sites in test mode. Provide the subscription ID in the
     * url. To confirm, supply the customer ID in the query string `ack` parameter. You may also
     * delete the customer record and/or payment profiles by passing `cascade` parameters. For
     * example, to delete just the customer record, the query params would be:
     * `?ack={customer_id}&amp;cascade[]=customer` If you need to remove subscriptions from a live site,
     * contact support to discuss your use case. ### Delete customer and payment profile The query
     * params will be: `?ack={customer_id}&amp;cascade[]=customer&amp;cascade[]=payment_profile`.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  ack  Required parameter: id of the customer.
     * @param  cascade  Optional parameter: Options are "customer" or "payment_profile". Use in
     *         query: `cascade[]=customer&amp;cascade[]=payment_profile`.
     * @return    Returns the SubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionResponse purgeSubscription(
            final int subscriptionId,
            final int ack,
            final List<SubscriptionPurgeType> cascade) throws ApiException, IOException {
        return preparePurgeSubscriptionRequest(subscriptionId, ack, cascade).execute();
    }

    /**
     * Builds the ApiCall object for purgeSubscription.
     */
    private ApiCall<SubscriptionResponse, ApiException> preparePurgeSubscriptionRequest(
            final int subscriptionId,
            final int ack,
            final List<SubscriptionPurgeType> cascade) {
        return new ApiCall.Builder<SubscriptionResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/purge.json")
                        .queryParam(param -> param.key("ack")
                                .value(ack).isRequired(false))
                        .queryParam(param -> param.key("cascade")
                                .value(SubscriptionPurgeType.toValue(cascade)).isRequired(false))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SubscriptionResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new SubscriptionResponseErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Updates a subscription's prepaid configuration.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  body  Optional parameter:
     * @return    Returns the PrepaidConfigurationResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PrepaidConfigurationResponse updatePrepaidSubscriptionConfiguration(
            final int subscriptionId,
            final UpsertPrepaidConfigurationRequest body) throws ApiException, IOException {
        return prepareUpdatePrepaidSubscriptionConfigurationRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for updatePrepaidSubscriptionConfiguration.
     */
    private ApiCall<PrepaidConfigurationResponse, ApiException> prepareUpdatePrepaidSubscriptionConfigurationRequest(
            final int subscriptionId,
            final UpsertPrepaidConfigurationRequest body) {
        return new ApiCall.Builder<PrepaidConfigurationResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/prepaid_configurations.json")
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
                                response -> ApiHelper.deserialize(response, PrepaidConfigurationResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Previews a subscription by POSTing the same JSON or XML as for a subscription creation. The
     * "Next Billing" amount and "Next Billing" date are represented in each Subscriber's Summary. A
     * subscription will not be created by utilizing this endpoint; it is meant to serve as a
     * prediction. For more information, see our documentation
     * [here](https://maxio.zendesk.com/hc/en-us/articles/24252493695757-Subscriber-Interface-Overview).
     * ## Taxable Subscriptions This endpoint will preview taxes applicable to a purchase. In order
     * for taxes to be previewed, the following conditions must be met: + Taxes must be configured
     * on the subscription + The preview must be for the purchase of a taxable product or component,
     * or combination of the two. + The subscription payload must contain a full billing or shipping
     * address in order to calculate tax For more information about creating taxable previews, see
     * our documentation guide on how to create [taxable
     * subscriptions.](https://maxio.zendesk.com/hc/en-us/sections/24287012349325-Taxes) You do
     * **not** need to include a card number to generate tax information when you are previewing a
     * subscription. However, when you actually want to create the subscription, you must include
     * the credit card information if you want the billing address to be stored in Advanced Billing.
     * The billing address and the credit card information are stored together within the payment
     * profile object. Also, you may not send a billing address to Advanced Billing without payment
     * profile information, as the address is stored on the card. You can pass shipping and billing
     * addresses and still decide not to calculate taxes. To do that, pass
     * `skip_billing_manifest_taxes: true` attribute. ## Non-taxable Subscriptions If you'd like to
     * calculate subscriptions that do not include tax you may leave off the billing information.
     * @param  body  Optional parameter:
     * @return    Returns the SubscriptionPreviewResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionPreviewResponse previewSubscription(
            final CreateSubscriptionRequest body) throws ApiException, IOException {
        return preparePreviewSubscriptionRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for previewSubscription.
     */
    private ApiCall<SubscriptionPreviewResponse, ApiException> preparePreviewSubscriptionRequest(
            final CreateSubscriptionRequest body) {
        return new ApiCall.Builder<SubscriptionPreviewResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/preview.json")
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
                                response -> ApiHelper.deserialize(response, SubscriptionPreviewResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Applies one or more coupon codes to an existing subscription. An existing subscription can
     * accommodate multiple discounts/coupon codes. This is only applicable if each coupon is
     * stackable. For more information on stackable coupons, we recommend reviewing our [coupon
     * documentation.](https://maxio.zendesk.com/hc/en-us/articles/24261259337101-Coupons-and-Subscriptions#stackability-rules)
     * ## Query Parameters vs Request Body Parameters Passing in a coupon code as a query parameter
     * will add the code to the subscription, completely replacing all existing coupon codes on the
     * subscription. For this reason, using this query parameter on this endpoint has been
     * deprecated in favor of using the request body parameters as described below. When passing in
     * request body parameters, the list of coupon codes will simply be added to any existing list
     * of codes on the subscription.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  code  Optional parameter: A code for the coupon that would be applied to a
     *         subscription
     * @param  body  Optional parameter:
     * @return    Returns the SubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionResponse applyCouponsToSubscription(
            final int subscriptionId,
            final String code,
            final AddCouponsRequest body) throws ApiException, IOException {
        return prepareApplyCouponsToSubscriptionRequest(subscriptionId, code, body).execute();
    }

    /**
     * Builds the ApiCall object for applyCouponsToSubscription.
     */
    private ApiCall<SubscriptionResponse, ApiException> prepareApplyCouponsToSubscriptionRequest(
            final int subscriptionId,
            final String code,
            final AddCouponsRequest body) {
        return new ApiCall.Builder<SubscriptionResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/add_coupon.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .queryParam(param -> param.key("code")
                                .value(code).isRequired(false))
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
                                response -> ApiHelper.deserialize(response, SubscriptionResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new SubscriptionAddCouponErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Removes a coupon from an existing subscription. For more information on the expected behavior
     * of removing a coupon from a subscription, see our documentation
     * [here.](https://maxio.zendesk.com/hc/en-us/articles/24261259337101-Coupons-and-Subscriptions#removing-a-coupon).
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  couponCode  Optional parameter: The coupon code
     * @return    Returns the String response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public String removeCouponFromSubscription(
            final int subscriptionId,
            final String couponCode) throws ApiException, IOException {
        return prepareRemoveCouponFromSubscriptionRequest(subscriptionId, couponCode).execute();
    }

    /**
     * Builds the ApiCall object for removeCouponFromSubscription.
     */
    private ApiCall<String, ApiException> prepareRemoveCouponFromSubscriptionRequest(
            final int subscriptionId,
            final String couponCode) {
        return new ApiCall.Builder<String, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/remove_coupon.json")
                        .queryParam(param -> param.key("coupon_code")
                                .value(couponCode).isRequired(false))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> new String(response))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new SubscriptionRemoveCouponErrorsException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Activates awaiting signup and trialing subscriptions. This feature is only available on the
     * Relationship Invoicing architecture. Subscriptions in a group may not be activated
     * immediately. For details on how the activation works, and how to activate subscriptions
     * through the application, see [activation](#). The `revert_on_failure` parameter controls the
     * behavior upon activation failure. - If set to `true` and something goes wrong i.e. payment
     * fails, then Advanced Billing will not change the subscription's state. The subscription’s
     * billing period will also remain the same. - If set to `false` and something goes wrong i.e.
     * payment fails, then Advanced Billing will continue through with the activation and enter an
     * end of life state. For trialing subscriptions, that will either be trial ended (if the trial
     * is no obligation), past due (if the trial has an obligation), or canceled (if the site has no
     * dunning strategy, or has a strategy that says to cancel immediately). For awaiting signup
     * subscriptions, that will always be canceled. The default activation failure behavior can be
     * configured per activation attempt, or you may set a default value under Config &gt; Settings &gt;
     * Subscription Activation Settings. ## Activation Scenarios ### Activate Awaiting Signup
     * subscription - Given you have a product without trial - Given you have a site without dunning
     * strategy ```mermaid flowchart LR AS[Awaiting Signup] --&gt; A{Activate} A --&gt;|Success| Active A
     * --&gt;|Failure| ROF{revert_on_failure} ROF --&gt;|true| AS ROF --&gt;|false| Canceled ``` - Given you
     * have a product with trial - Given you have a site with dunning strategy ```mermaid flowchart
     * LR AS[Awaiting Signup] --&gt; A{Activate} A --&gt;|Success| Trialing A --&gt;|Failure|
     * ROF{revert_on_failure} ROF --&gt;|true| AS ROF --&gt;|false| PD[Past Due] ``` ### Activate Trialing
     * subscription You can read more about the behavior of trialing subscriptions
     * [here](https://maxio.zendesk.com/hc/en-us/articles/24252155721869-Trialing-Subscriptions).
     * When the `revert_on_failure` parameter is set to `true`, the subscription's state will remain
     * as Trialing, we will void the invoice from activation and return any prepayments and credits
     * applied to the invoice back to the subscription.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  body  Optional parameter:
     * @return    Returns the SubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionResponse activateSubscription(
            final int subscriptionId,
            final ActivateSubscriptionRequest body) throws ApiException, IOException {
        return prepareActivateSubscriptionRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for activateSubscription.
     */
    private ApiCall<SubscriptionResponse, ApiException> prepareActivateSubscriptionRequest(
            final int subscriptionId,
            final ActivateSubscriptionRequest body) {
        return new ApiCall.Builder<SubscriptionResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/activate.json")
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
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SubscriptionResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorArrayMapResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}