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
import com.maxio.advancedbilling.models.CancelGroupedSubscriptionsRequest;
import com.maxio.advancedbilling.models.ReactivateSubscriptionGroupRequest;
import com.maxio.advancedbilling.models.ReactivateSubscriptionGroupResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class SubscriptionGroupStatusController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public SubscriptionGroupStatusController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Cancels all subscriptions within the specified group immediately. The group is identified by
     * the `uid` that is passed in the URL. To successfully cancel the group, the primary
     * subscription must be on automatic billing. The group members must be on automatic billing or
     * prepaid. To cancel a subscription group while also charging for any unbilled usage on metered
     * or prepaid components, the `charge_unbilled_usage=true` parameter must be included in the
     * request.
     * @param  uid  Required parameter: The uid of the subscription group
     * @param  body  Optional parameter:
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void cancelSubscriptionsInGroup(
            final String uid,
            final CancelGroupedSubscriptionsRequest body) throws ApiException, IOException {
        prepareCancelSubscriptionsInGroupRequest(uid, body).execute();
    }

    /**
     * Builds the ApiCall object for cancelSubscriptionsInGroup.
     */
    private ApiCall<Void, ApiException> prepareCancelSubscriptionsInGroupRequest(
            final String uid,
            final CancelGroupedSubscriptionsRequest body) {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscription_groups/{uid}/cancel.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("uid").value(uid)
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
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Schedules all subscriptions within the specified group to be canceled at the end of their
     * billing period. The group is identified by its uid passed in the URL. All subscriptions in
     * the group must be on automatic billing in order to successfully cancel them, and the group
     * must not be in a "past_due" state.
     * @param  uid  Required parameter: The uid of the subscription group
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void initiateDelayedCancellationForGroup(
            final String uid) throws ApiException, IOException {
        prepareInitiateDelayedCancellationForGroupRequest(uid).execute();
    }

    /**
     * Builds the ApiCall object for initiateDelayedCancellationForGroup.
     */
    private ApiCall<Void, ApiException> prepareInitiateDelayedCancellationForGroupRequest(
            final String uid) {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscription_groups/{uid}/delayed_cancel.json")
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Removes the delayed cancellation on a subscription group. Removing the delayed cancellation
     * on a subscription group will ensure that the subscriptions do not get canceled at the end of
     * the period. The request will reset the `cancel_at_end_of_period` flag to false on each member
     * in the group.
     * @param  uid  Required parameter: The uid of the subscription group
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void cancelDelayedCancellationForGroup(
            final String uid) throws ApiException, IOException {
        prepareCancelDelayedCancellationForGroupRequest(uid).execute();
    }

    /**
     * Builds the ApiCall object for cancelDelayedCancellationForGroup.
     */
    private ApiCall<Void, ApiException> prepareCancelDelayedCancellationForGroupRequest(
            final String uid) {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscription_groups/{uid}/delayed_cancel.json")
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Reactivates or resumes a cancelled subscription group. Upon reactivation, any canceled
     * invoices created after the beginning of the primary subscription's billing period will be
     * reopened and payment will be attempted on them. If the subscription group is being
     * reactivated (as opposed to resumed), new charges will also be assessed for the new billing
     * period. Whether a subscription group is reactivated (a new billing period is created) or
     * resumed (the current billing period is respected) will depend on the parameters that are sent
     * with the request as well as the date of the request relative to the primary subscription's
     * period. ## Reactivating within the current period If a subscription group is cancelled and
     * reactivated within the primary subscription's current period, we can choose to either start a
     * new billing period or maintain the existing one. If we want to maintain the existing billing
     * period, the `resume=true` option must be passed in request parameters. An exception to the
     * above are subscriptions that are on calendar billing. These subscriptions cannot be
     * reactivated within the current period. If the `resume=true` option is not passed, the request
     * will return an error. The `resume_members` option is ignored in this case. All eligible group
     * members will be automatically resumed. ## Reactivating beyond the current period In this
     * case, a subscription group can only be reactivated with a new billing period. If the
     * `resume=true` option is passed it will be ignored. Member subscriptions can have billing
     * periods that are longer than the primary (e.g. a monthly primary with annual group members).
     * If the primary subscription in a group cannot be reactivated within the current period, but
     * other group members can be, passing `resume_members=true` will resume the existing billing
     * period for eligible group members. The primary subscription will begin a new billing period.
     * For calendar billing subscriptions, the new billing period created will be a partial one,
     * spanning from the date of reactivation to the next corresponding calendar renewal date. ## 3D
     * Secure (3DS) Authentication post-authentication flow When a payment requires 3DS
     * Authentication to adhere to Strong Customer Authentication (SCA), the request enters a
     * post-authentication flow where a 422 Unprocessable Entity status is returned with an
     * action_link that will direct the customer through 3DS Authentication. See the [3D Secure
     * Post-Authentication
     * Flow](https://docs.maxio.com/hc/en-us/articles/44277749524365-3D-Secure-Post-Authentication-Flow)
     * article in the product documentation to learn how to manage the redirect flow.
     * @param  uid  Required parameter: The uid of the subscription group
     * @param  body  Optional parameter:
     * @return    Returns the ReactivateSubscriptionGroupResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ReactivateSubscriptionGroupResponse reactivateSubscriptionGroup(
            final String uid,
            final ReactivateSubscriptionGroupRequest body) throws ApiException, IOException {
        return prepareReactivateSubscriptionGroupRequest(uid, body).execute();
    }

    /**
     * Builds the ApiCall object for reactivateSubscriptionGroup.
     */
    private ApiCall<ReactivateSubscriptionGroupResponse, ApiException> prepareReactivateSubscriptionGroupRequest(
            final String uid,
            final ReactivateSubscriptionGroupRequest body) {
        return new ApiCall.Builder<ReactivateSubscriptionGroupResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscription_groups/{uid}/reactivate.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("uid").value(uid)
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
                                response -> ApiHelper.deserialize(response, ReactivateSubscriptionGroupResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}