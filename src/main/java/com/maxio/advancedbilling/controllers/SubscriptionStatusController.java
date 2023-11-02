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
import com.maxio.advancedbilling.models.CancellationRequest;
import com.maxio.advancedbilling.models.DelayedCancellationResponse;
import com.maxio.advancedbilling.models.PauseRequest;
import com.maxio.advancedbilling.models.ReactivateSubscriptionRequest;
import com.maxio.advancedbilling.models.RenewalPreviewRequest;
import com.maxio.advancedbilling.models.RenewalPreviewResponse;
import com.maxio.advancedbilling.models.ResumptionCharge;
import com.maxio.advancedbilling.models.SubscriptionResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class SubscriptionStatusController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public SubscriptionStatusController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Chargify offers the ability to retry collecting the balance due on a past due Subscription
     * without waiting for the next scheduled attempt. ## Successful Reactivation The response will
     * be `200 OK` with the updated Subscription. ## Failed Reactivation The response will be `422
     * "Unprocessable Entity`.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @return    Returns the SubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionResponse retrySubscription(
            final String subscriptionId) throws ApiException, IOException {
        return prepareRetrySubscriptionRequest(subscriptionId).execute();
    }

    /**
     * Builds the ApiCall object for retrySubscription.
     */
    private ApiCall<SubscriptionResponse, ApiException> prepareRetrySubscriptionRequest(
            final String subscriptionId) throws IOException {
        return new ApiCall.Builder<SubscriptionResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/retry.json")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SubscriptionResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * The DELETE action causes the cancellation of the Subscription. This means, the method sets
     * the Subscription state to "canceled".
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  body  Optional parameter: Example:
     * @return    Returns the SubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionResponse cancelSubscription(
            final String subscriptionId,
            final CancellationRequest body) throws ApiException, IOException {
        return prepareCancelSubscriptionRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for cancelSubscription.
     */
    private ApiCall<SubscriptionResponse, ApiException> prepareCancelSubscriptionRequest(
            final String subscriptionId,
            final CancellationRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<SubscriptionResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SubscriptionResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Resume a paused (on-hold) subscription. If the normal next renewal date has not passed, the
     * subscription will return to active and will renew on that date. Otherwise, it will behave
     * like a reactivation, setting the billing date to 'now' and charging the subscriber.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  calendarBillingResumptionCharge  Optional parameter: (For calendar billing
     *         subscriptions only) The way that the resumed subscription's charge should be handled
     * @return    Returns the SubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionResponse resumeSubscription(
            final String subscriptionId,
            final ResumptionCharge calendarBillingResumptionCharge) throws ApiException, IOException {
        return prepareResumeSubscriptionRequest(subscriptionId,
                calendarBillingResumptionCharge).execute();
    }

    /**
     * Builds the ApiCall object for resumeSubscription.
     */
    private ApiCall<SubscriptionResponse, ApiException> prepareResumeSubscriptionRequest(
            final String subscriptionId,
            final ResumptionCharge calendarBillingResumptionCharge) throws IOException {
        return new ApiCall.Builder<SubscriptionResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/resume.json")
                        .queryParam(param -> param.key("calendar_billing['resumption_charge']")
                                .value((calendarBillingResumptionCharge != null) ? calendarBillingResumptionCharge.value() : "prorated").isRequired(false))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SubscriptionResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This will place the subscription in the on_hold state and it will not renew. ## Limitations
     * You may not place a subscription on hold if the `next_billing` date is within 24 hours.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  body  Optional parameter: Example:
     * @return    Returns the SubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionResponse pauseSubscription(
            final String subscriptionId,
            final PauseRequest body) throws ApiException, IOException {
        return preparePauseSubscriptionRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for pauseSubscription.
     */
    private ApiCall<SubscriptionResponse, ApiException> preparePauseSubscriptionRequest(
            final String subscriptionId,
            final PauseRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<SubscriptionResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/hold.json")
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
                                response -> ApiHelper.deserialize(response, SubscriptionResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Once a subscription has been paused / put on hold, you can update the date which was
     * specified to automatically resume the subscription. To update a subscription's resume date,
     * use this method to change or update the `automatically_resume_at` date. ### Remove the resume
     * date Alternately, you can change the `automatically_resume_at` to `null` if you would like
     * the subscription to not have a resume date.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  body  Optional parameter: Example:
     * @return    Returns the SubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionResponse updateAutomaticSubscriptionResumption(
            final String subscriptionId,
            final PauseRequest body) throws ApiException, IOException {
        return prepareUpdateAutomaticSubscriptionResumptionRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for updateAutomaticSubscriptionResumption.
     */
    private ApiCall<SubscriptionResponse, ApiException> prepareUpdateAutomaticSubscriptionResumptionRequest(
            final String subscriptionId,
            final PauseRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<SubscriptionResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/hold.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SubscriptionResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Chargify offers the ability to reactivate a previously canceled subscription. For details on
     * how the reactivation works, and how to reactivate subscriptions through the application, see
     * [reactivation](https://chargify.zendesk.com/hc/en-us/articles/4407898737691). **Please note:
     * The term "resume" is used also during another process in Chargify. This occurs when an
     * on-hold subscription is "resumed". This returns the subscription to an active state.** + The
     * response returns the subscription object in the `active` or `trialing` state. + The
     * `canceled_at` and `cancellation_message` fields do not have values. + The method works for
     * "Canceled" or "Trial Ended" subscriptions. + It will not work for items not marked as
     * "Canceled", "Unpaid", or "Trial Ended". ## Resume the current billing period for a
     * subscription A subscription is considered "resumable" if you are attempting to reactivate
     * within the billing period the subscription was canceled in. A resumed subscription's billing
     * date remains the same as before it was canceled. In other words, it does not start a new
     * billing period. Payment may or may not be collected for a resumed subscription, depending on
     * whether or not the subscription had a balance when it was canceled (for example, if it was
     * canceled because of dunning). Consider a subscription which was created on June 1st, and
     * would renew on July 1st. The subscription is then canceled on June 15. If a reactivation with
     * `resume: true` were attempted _before_ what would have been the next billing date of July
     * 1st, then Chargify would resume the subscription. If a reactivation with `resume: true` were
     * attempted _after_ what would have been the next billing date of July 1st, then Chargify would
     * not resume the subscription, and instead it would be reactivated with a new billing period. |
     * Canceled | Reactivation | Resumable? | |---|---|---| | Jun 15 | June 28 | Yes | | Jun 15 |
     * July 2 | No | ## Reactivation Scenarios ### Reactivating Canceled Subscription While
     * Preserving Balance + Given you have a product that costs $20 + Given you have a canceled
     * subscription to the $20 product + 1 charge should exist for $20 + 1 payment should exist for
     * $20 + When the subscription has canceled due to dunning, it retained a negative balance of
     * $20 #### Results The resulting charges upon reactivation will be: + 1 charge for $20 for the
     * new product + 1 charge for $20 for the balance due + Total charges = $40 + The subscription
     * will transition to active + The subscription balance will be zero ### Reactivating a Canceled
     * Subscription With Coupon + Given you have a canceled subscription + It has no current period
     * defined + You have a coupon code "EARLYBIRD" + The coupon is set to recur for 6 periods PUT
     * request sent to:
     * `https://acme.chargify.com/subscriptions/{subscription_id}/reactivate.json?coupon_code=EARLYBIRD`
     * #### Results + The subscription will transition to active + The subscription should have
     * applied a coupon with code "EARLYBIRD" ### Reactivating Canceled Subscription With a Trial,
     * Without the include_trial Flag + Given you have a canceled subscription + The product
     * associated with the subscription has a trial + PUT request to
     * `https://acme.chargify.com/subscriptions/{subscription_id}/reactivate.json` #### Results +
     * The subscription will transition to active ### Reactivating Canceled Subscription With Trial,
     * With the include_trial Flag + Given you have a canceled subscription + The product associated
     * with the subscription has a trial + Send a PUT request to
     * `https://acme.chargify.com/subscriptions/{subscription_id}/reactivate.json?include_trial=1`
     * #### Results + The subscription will transition to trialing ### Reactivating Trial Ended
     * Subscription + Given you have a trial_ended subscription + Send a PUT request to
     * `https://acme.chargify.com/subscriptions/{subscription_id}/reactivate.json` #### Results +
     * The subscription will transition to active ### Resuming a Canceled Subscription + Given you
     * have a `canceled` subscription and it is resumable + Send a PUT request to
     * `https://acme.chargify.com/subscriptions/{subscription_id}/reactivate.json?resume=true` ####
     * Results + The subscription will transition to active + The next billing date should not have
     * changed ### Attempting to resume a subscription which is not resumable + Given you have a
     * `canceled` subscription, and it is not resumable + Send a PUT request to
     * `https://acme.chargify.com/subscriptions/{subscription_id}/reactivate.json?resume=true` ####
     * Results + The subscription will transition to active, with a new billing period. ###
     * Attempting to resume but not reactivate a subscription which is not resumable + Given you
     * have a `canceled` subscription, and it is not resumable + Send a PUT request to
     * `https://acme.chargify.com/subscriptions/{subscription_id}/reactivate.json?resume[require_resume]=true`
     * + The response status should be "422 UNPROCESSABLE ENTITY" + The subscription should be
     * canceled with the following response ``` { "errors": ["Request was 'resume only', but this
     * subscription cannot be resumed."] } ``` #### Results + The subscription should remain
     * `canceled` + The next billing date should not have changed ### Resuming Subscription Which
     * Was Trialing + Given you have a `trial_ended` subscription, and it is resumable + And the
     * subscription was canceled in the middle of a trial + And there is still time left on the
     * trial + Send a PUT request to
     * `https://acme.chargify.com/subscriptions/{subscription_id}/reactivate.json?resume=true` ####
     * Results + The subscription will transition to trialing + The next billing date should not
     * have changed ### Resuming Subscription Which Was trial_ended + Given you have a `trial_ended`
     * subscription, and it is resumable + Send a PUT request to
     * `https://acme.chargify.com/subscriptions/{subscription_id}/reactivate.json?resume=true` ####
     * Results + The subscription will transition to active + The next billing date should not have
     * changed + Any product-related charges should have been collected.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  body  Optional parameter: Example:
     * @return    Returns the SubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionResponse reactivateSubscription(
            final String subscriptionId,
            final ReactivateSubscriptionRequest body) throws ApiException, IOException {
        return prepareReactivateSubscriptionRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for reactivateSubscription.
     */
    private ApiCall<SubscriptionResponse, ApiException> prepareReactivateSubscriptionRequest(
            final String subscriptionId,
            final ReactivateSubscriptionRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<SubscriptionResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/reactivate.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SubscriptionResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Chargify offers the ability to cancel a subscription at the end of the current billing
     * period. This period is set by its current product. Requesting to cancel the subscription at
     * the end of the period sets the `cancel_at_end_of_period` flag to true. Note that you cannot
     * set `cancel_at_end_of_period` at subscription creation, or if the subscription is past due.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  body  Optional parameter: Example:
     * @return    Returns the DelayedCancellationResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DelayedCancellationResponse initiateDelayedCancellation(
            final String subscriptionId,
            final CancellationRequest body) throws ApiException, IOException {
        return prepareInitiateDelayedCancellationRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for initiateDelayedCancellation.
     */
    private ApiCall<DelayedCancellationResponse, ApiException> prepareInitiateDelayedCancellationRequest(
            final String subscriptionId,
            final CancellationRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<DelayedCancellationResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/delayed_cancel.json")
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
                                response -> ApiHelper.deserialize(response, DelayedCancellationResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Removing the delayed cancellation on a subscription will ensure that it doesn't get canceled
     * at the end of the period that it is in. The request will reset the `cancel_at_end_of_period`
     * flag to `false`. This endpoint is idempotent. If the subscription was not set to cancel in
     * the future, removing the delayed cancellation has no effect and the call will be successful.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @return    Returns the DelayedCancellationResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DelayedCancellationResponse stopDelayedCancellation(
            final String subscriptionId) throws ApiException, IOException {
        return prepareStopDelayedCancellationRequest(subscriptionId).execute();
    }

    /**
     * Builds the ApiCall object for stopDelayedCancellation.
     */
    private ApiCall<DelayedCancellationResponse, ApiException> prepareStopDelayedCancellationRequest(
            final String subscriptionId) throws IOException {
        return new ApiCall.Builder<DelayedCancellationResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/delayed_cancel.json")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, DelayedCancellationResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * If a subscription is currently in dunning, the subscription will be set to active and the
     * active Dunner will be resolved.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @return    Returns the SubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionResponse cancelDunning(
            final String subscriptionId) throws ApiException, IOException {
        return prepareCancelDunningRequest(subscriptionId).execute();
    }

    /**
     * Builds the ApiCall object for cancelDunning.
     */
    private ApiCall<SubscriptionResponse, ApiException> prepareCancelDunningRequest(
            final String subscriptionId) throws IOException {
        return new ApiCall.Builder<SubscriptionResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/cancel_dunning.json")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SubscriptionResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * The Chargify API allows you to preview a renewal by posting to the renewals endpoint. Renewal
     * Preview is an object representing a subscription’s next assessment. You can retrieve it to
     * see a snapshot of how much your customer will be charged on their next renewal. The "Next
     * Billing" amount and "Next Billing" date are already represented in the UI on each
     * Subscriber's Summary. For more information, please see our documentation
     * [here](https://chargify.zendesk.com/hc/en-us/articles/4407884887835#next-billing). ##
     * Optional Component Fields This endpoint is particularly useful due to the fact that it will
     * return the computed billing amount for the base product and the components which are in use
     * by a subscriber. By default, the preview will include billing details for all components _at
     * their **current** quantities_. This means: * Current `allocated_quantity` for quantity-based
     * components * Current enabled/disabled status for on/off components * Current metered usage
     * `unit_balance` for metered components * Current metric quantity value for events recorded
     * thus far for events-based components In the above statements, "current" means the quantity or
     * value as of the call to the renewal preview endpoint. We do not predict end-of-period values
     * for components, so metered or events-based usage may be less than it will eventually be at
     * the end of the period. Optionally, **you may provide your own custom quantities** for any
     * component to see a billing preview for non-current quantities. This is accomplished by
     * sending a request body with data under the `components` key. See the request body
     * documentation below. ## Subscription Side Effects You can request a `POST` to obtain this
     * data from the endpoint without any side effects. Plain and simple, this will preview data,
     * not log any changes against a subscription.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  body  Optional parameter: Example:
     * @return    Returns the RenewalPreviewResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public RenewalPreviewResponse previewRenewal(
            final String subscriptionId,
            final RenewalPreviewRequest body) throws ApiException, IOException {
        return preparePreviewRenewalRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for previewRenewal.
     */
    private ApiCall<RenewalPreviewResponse, ApiException> preparePreviewRenewalRequest(
            final String subscriptionId,
            final RenewalPreviewRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<RenewalPreviewResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/renewals/preview.json")
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
                                response -> ApiHelper.deserialize(response, RenewalPreviewResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }
}