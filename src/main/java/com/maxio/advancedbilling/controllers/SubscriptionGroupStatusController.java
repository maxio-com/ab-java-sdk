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
     * This endpoint will immediately cancel all subscriptions within the specified group. The group
     * is identified by it's `uid` passed in the URL. To successfully cancel the group, the primary
     * subscription must be on automatic billing. The group members as well must be on automatic
     * billing or they must be prepaid. In order to cancel a subscription group while also charging
     * for any unbilled usage on metered or prepaid components, the `charge_unbilled_usage=true`
     * parameter must be included in the request.
     * @param  uid  Required parameter: The uid of the subscription group
     * @param  body  Optional parameter: Example:
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
            final CancelGroupedSubscriptionsRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscription_groups/{uid}/cancel.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("uid").value(uid)
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
     * This endpoint will schedule all subscriptions within the specified group to be canceled at
     * the end of their billing period. The group is identified by it's uid passed in the URL. All
     * subscriptions in the group must be on automatic billing in order to successfully cancel them,
     * and the group must not be in a "past_due" state.
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
            final String uid) throws IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscription_groups/{uid}/delayed_cancel.json")
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
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
     * Removing the delayed cancellation on a subscription group will ensure that the subscriptions
     * do not get canceled at the end of the period. The request will reset the
     * `cancel_at_end_of_period` flag to false on each member in the group.
     * @param  uid  Required parameter: The uid of the subscription group
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void stopDelayedCancellationForGroup(
            final String uid) throws ApiException, IOException {
        prepareStopDelayedCancellationForGroupRequest(uid).execute();
    }

    /**
     * Builds the ApiCall object for stopDelayedCancellationForGroup.
     */
    private ApiCall<Void, ApiException> prepareStopDelayedCancellationForGroupRequest(
            final String uid) throws IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscription_groups/{uid}/delayed_cancel.json")
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
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
     * This endpoint will attempt to reactivate or resume a cancelled subscription group. Upon
     * reactivation, any canceled invoices created after the beginning of the primary subscription's
     * billing period will be reopened and payment will be attempted on them. If the subscription
     * group is being reactivated (as opposed to resumed), new charges will also be assessed for the
     * new billing period. Whether a subscription group is reactivated (a new billing period is
     * created) or resumed (the current billing period is respected) will depend on the parameters
     * that are sent with the request as well as the date of the request relative to the primary
     * subscription's period. ## Reactivating within the current period If a subscription group is
     * cancelled and reactivated within the primary subscription's current period, we can choose to
     * either start a new billing period or maintain the existing one. If we want to maintain the
     * existing billing period the `resume=true` option must be passed in request parameters. An
     * exception to the above are subscriptions that are on calendar billing. These subscriptions
     * cannot be reactivated within the current period. If the `resume=true` option is not passed
     * the request will return an error. The `resume_members` option is ignored in this case. All
     * eligible group members will be automatically resumed. ## Reactivating beyond the current
     * period In this case, a subscription group can only be reactivated with a new billing period.
     * If the `resume=true` option is passed it will be ignored. Member subscriptions can have
     * billing periods that are longer than the primary (e.g. a monthly primary with annual group
     * members). If the primary subscription in a group cannot be reactivated within the current
     * period, but other group members can be, passing `resume_members=true` will resume the
     * existing billing period for eligible group members. The primary subscription will begin a new
     * billing period. For calendar billing subscriptions, the new billing period created will be a
     * partial one, spanning from the date of reactivation to the next corresponding calendar
     * renewal date.
     * @param  uid  Required parameter: The uid of the subscription group
     * @param  body  Optional parameter: Example:
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
            final ReactivateSubscriptionGroupRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ReactivateSubscriptionGroupResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscription_groups/{uid}/reactivate.json")
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
                                response -> ApiHelper.deserialize(response, ReactivateSubscriptionGroupResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }
}