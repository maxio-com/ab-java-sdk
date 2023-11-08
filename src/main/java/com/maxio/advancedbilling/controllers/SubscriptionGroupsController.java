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
import com.maxio.advancedbilling.exceptions.SingleStringErrorResponseException;
import com.maxio.advancedbilling.exceptions.SubscriptionGroupSignupErrorResponseException;
import com.maxio.advancedbilling.exceptions.SubscriptionGroupUpdateErrorResponseException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.AddSubscriptionToAGroup;
import com.maxio.advancedbilling.models.CreateSubscriptionGroupRequest;
import com.maxio.advancedbilling.models.DeleteSubscriptionGroupResponse;
import com.maxio.advancedbilling.models.FullSubscriptionGroupResponse;
import com.maxio.advancedbilling.models.ListSubscriptionGroupsInput;
import com.maxio.advancedbilling.models.ListSubscriptionGroupsResponse;
import com.maxio.advancedbilling.models.SubscriptionGroupResponse;
import com.maxio.advancedbilling.models.SubscriptionGroupSignupRequest;
import com.maxio.advancedbilling.models.SubscriptionGroupSignupResponse;
import com.maxio.advancedbilling.models.UpdateSubscriptionGroupRequest;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class SubscriptionGroupsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public SubscriptionGroupsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Create multiple subscriptions at once under the same customer and consolidate them into a
     * subscription group. You must provide one and only one of the
     * `payer_id`/`payer_reference`/`payer_attributes` for the customer attached to the group. You
     * must provide one and only one of the
     * `payment_profile_id`/`credit_card_attributes`/`bank_account_attributes` for the payment
     * profile attached to the group. Only one of the `subscriptions` can have `"primary": true`
     * attribute set. When passing product to a subscription you can use either `product_id` or
     * `product_handle` or `offer_id`. You can also use `custom_price` instead.
     * @param  body  Optional parameter: Example:
     * @return    Returns the SubscriptionGroupSignupResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionGroupSignupResponse signupWithSubscriptionGroup(
            final SubscriptionGroupSignupRequest body) throws ApiException, IOException {
        return prepareSignupWithSubscriptionGroupRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for signupWithSubscriptionGroup.
     */
    private ApiCall<SubscriptionGroupSignupResponse, ApiException> prepareSignupWithSubscriptionGroupRequest(
            final SubscriptionGroupSignupRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<SubscriptionGroupSignupResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscription_groups/signup.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SubscriptionGroupSignupResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new SubscriptionGroupSignupErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Creates a subscription group with given members.
     * @param  body  Optional parameter: Example:
     * @return    Returns the SubscriptionGroupResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionGroupResponse createSubscriptionGroup(
            final CreateSubscriptionGroupRequest body) throws ApiException, IOException {
        return prepareCreateSubscriptionGroupRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for createSubscriptionGroup.
     */
    private ApiCall<SubscriptionGroupResponse, ApiException> prepareCreateSubscriptionGroupRequest(
            final CreateSubscriptionGroupRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<SubscriptionGroupResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscription_groups.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SubscriptionGroupResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new SingleStringErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Returns an array of subscription groups for the site. The response is paginated and will
     * return a `meta` key with pagination information. #### Account Balance Information Account
     * balance information for the subscription groups is not returned by default. If this
     * information is desired, the `include[]=account_balances` parameter must be provided with the
     * request.
     * @param  input  ListSubscriptionGroupsInput object containing request parameters
     * @return    Returns the ListSubscriptionGroupsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListSubscriptionGroupsResponse listSubscriptionGroups(
            final ListSubscriptionGroupsInput input) throws ApiException, IOException {
        return prepareListSubscriptionGroupsRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listSubscriptionGroups.
     */
    private ApiCall<ListSubscriptionGroupsResponse, ApiException> prepareListSubscriptionGroupsRequest(
            final ListSubscriptionGroupsInput input) throws IOException {
        return new ApiCall.Builder<ListSubscriptionGroupsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscription_groups.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("include")
                                .value(input.getInclude()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListSubscriptionGroupsResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Use this endpoint to find subscription group details. #### Current Billing Amount in Cents
     * Current billing amount for the subscription group is not returned by default. If this
     * information is desired, the `include[]=current_billing_amount_in_cents` parameter must be
     * provided with the request.
     * @param  uid  Required parameter: The uid of the subscription group
     * @return    Returns the FullSubscriptionGroupResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public FullSubscriptionGroupResponse readSubscriptionGroup(
            final String uid) throws ApiException, IOException {
        return prepareReadSubscriptionGroupRequest(uid).execute();
    }

    /**
     * Builds the ApiCall object for readSubscriptionGroup.
     */
    private ApiCall<FullSubscriptionGroupResponse, ApiException> prepareReadSubscriptionGroupRequest(
            final String uid) throws IOException {
        return new ApiCall.Builder<FullSubscriptionGroupResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscription_groups/{uid}.json")
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, FullSubscriptionGroupResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Use this endpoint to update subscription group members. `"member_ids": []` should contain an
     * array of both subscription IDs to set as group members and subscription IDs already present
     * in the groups. Not including them will result in removing them from subscription group. To
     * clean up members, just leave the array empty.
     * @param  uid  Required parameter: The uid of the subscription group
     * @param  body  Optional parameter: Example:
     * @return    Returns the SubscriptionGroupResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionGroupResponse updateSubscriptionGroupMembers(
            final String uid,
            final UpdateSubscriptionGroupRequest body) throws ApiException, IOException {
        return prepareUpdateSubscriptionGroupMembersRequest(uid, body).execute();
    }

    /**
     * Builds the ApiCall object for updateSubscriptionGroupMembers.
     */
    private ApiCall<SubscriptionGroupResponse, ApiException> prepareUpdateSubscriptionGroupMembersRequest(
            final String uid,
            final UpdateSubscriptionGroupRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<SubscriptionGroupResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscription_groups/{uid}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SubscriptionGroupResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new SubscriptionGroupUpdateErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Use this endpoint to delete subscription group. Only groups without members can be deleted.
     * @param  uid  Required parameter: The uid of the subscription group
     * @return    Returns the DeleteSubscriptionGroupResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DeleteSubscriptionGroupResponse deleteSubscriptionGroup(
            final String uid) throws ApiException, IOException {
        return prepareDeleteSubscriptionGroupRequest(uid).execute();
    }

    /**
     * Builds the ApiCall object for deleteSubscriptionGroup.
     */
    private ApiCall<DeleteSubscriptionGroupResponse, ApiException> prepareDeleteSubscriptionGroupRequest(
            final String uid) throws IOException {
        return new ApiCall.Builder<DeleteSubscriptionGroupResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscription_groups/{uid}.json")
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, DeleteSubscriptionGroupResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Use this endpoint to find subscription group associated with subscription. If the
     * subscription is not in a group endpoint will return 404 code.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription associated
     *         with the subscription group
     * @return    Returns the FullSubscriptionGroupResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public FullSubscriptionGroupResponse readSubscriptionGroupBySubscriptionId(
            final String subscriptionId) throws ApiException, IOException {
        return prepareReadSubscriptionGroupBySubscriptionIdRequest(subscriptionId).execute();
    }

    /**
     * Builds the ApiCall object for readSubscriptionGroupBySubscriptionId.
     */
    private ApiCall<FullSubscriptionGroupResponse, ApiException> prepareReadSubscriptionGroupBySubscriptionIdRequest(
            final String subscriptionId) throws IOException {
        return new ApiCall.Builder<FullSubscriptionGroupResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscription_groups/lookup.json")
                        .queryParam(param -> param.key("subscription_id")
                                .value(subscriptionId))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, FullSubscriptionGroupResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * For sites making use of the [Relationship
     * Billing](https://chargify.zendesk.com/hc/en-us/articles/4407737494171) and [Customer
     * Hierarchy](https://chargify.zendesk.com/hc/en-us/articles/4407746683291) features, it is
     * possible to add existing subscriptions to subscription groups. Passing `group` parameters
     * with a `target` containing a `type` and optional `id` is all that's needed. When the `target`
     * parameter specifies a `"customer"` or `"subscription"` that is already part of a hierarchy,
     * the subscription will become a member of the customer's subscription group. If the target
     * customer or subscription is not part of a subscription group, a new group will be created and
     * the subscription will become part of the group with the specified target customer set as the
     * responsible payer for the group's subscriptions. **Please Note:** In order to add an existing
     * subscription to a subscription group, it must belong to either the same customer record as
     * the target, or be within the same customer hierarchy. Rather than specifying a customer, the
     * `target` parameter could instead simply have a value of * `"self"` which indicates the
     * subscription will be paid for not by some other customer, but by the subscribing customer, *
     * `"parent"` which indicates the subscription will be paid for by the subscribing customer's
     * parent within a customer hierarchy, or * `"eldest"` which indicates the subscription will be
     * paid for by the root-level customer in the subscribing customer's hierarchy. To create a new
     * subscription into a subscription group, please reference the following: [Create Subscription
     * in a Subscription
     * Group](https://developers.chargify.com/docs/api-docs/d571659cf0f24-create-subscription#subscription-in-a-subscription-group).
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  body  Optional parameter: Example:
     * @return    Returns the SubscriptionGroupResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionGroupResponse createSubscriptionGroupHierarchy(
            final String subscriptionId,
            final AddSubscriptionToAGroup body) throws ApiException, IOException {
        return prepareCreateSubscriptionGroupHierarchyRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for createSubscriptionGroupHierarchy.
     */
    private ApiCall<SubscriptionGroupResponse, ApiException> prepareCreateSubscriptionGroupHierarchyRequest(
            final String subscriptionId,
            final AddSubscriptionToAGroup body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<SubscriptionGroupResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/group.json")
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
                                response -> ApiHelper.deserialize(response, SubscriptionGroupResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * For sites making use of the [Relationship
     * Billing](https://chargify.zendesk.com/hc/en-us/articles/4407737494171) and [Customer
     * Hierarchy](https://chargify.zendesk.com/hc/en-us/articles/4407746683291) features, it is
     * possible to remove existing subscription from subscription group.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void removeSubscriptionFromGroup(
            final String subscriptionId) throws ApiException, IOException {
        prepareRemoveSubscriptionFromGroupRequest(subscriptionId).execute();
    }

    /**
     * Builds the ApiCall object for removeSubscriptionFromGroup.
     */
    private ApiCall<Void, ApiException> prepareRemoveSubscriptionFromGroupRequest(
            final String subscriptionId) throws IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/group.json")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }
}