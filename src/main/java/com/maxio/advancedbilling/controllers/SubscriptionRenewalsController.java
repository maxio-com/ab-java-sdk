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
import com.maxio.advancedbilling.models.ScheduledRenewalConfigurationItemRequest;
import com.maxio.advancedbilling.models.ScheduledRenewalConfigurationItemResponse;
import com.maxio.advancedbilling.models.ScheduledRenewalConfigurationRequest;
import com.maxio.advancedbilling.models.ScheduledRenewalConfigurationResponse;
import com.maxio.advancedbilling.models.ScheduledRenewalConfigurationsResponse;
import com.maxio.advancedbilling.models.ScheduledRenewalLockInRequest;
import com.maxio.advancedbilling.models.ScheduledRenewalUpdateRequest;
import com.maxio.advancedbilling.models.Status;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class SubscriptionRenewalsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public SubscriptionRenewalsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Creates a scheduled renewal configuration for a subscription. The scheduled renewal is based
     * on the subscription’s current product and component setup.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  body  Optional parameter:
     * @return    Returns the ScheduledRenewalConfigurationResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ScheduledRenewalConfigurationResponse createScheduledRenewalConfiguration(
            final int subscriptionId,
            final ScheduledRenewalConfigurationRequest body) throws ApiException, IOException {
        return prepareCreateScheduledRenewalConfigurationRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for createScheduledRenewalConfiguration.
     */
    private ApiCall<ScheduledRenewalConfigurationResponse, ApiException> prepareCreateScheduledRenewalConfigurationRequest(
            final int subscriptionId,
            final ScheduledRenewalConfigurationRequest body) {
        return new ApiCall.Builder<ScheduledRenewalConfigurationResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/scheduled_renewals.json")
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
                                response -> ApiHelper.deserialize(response, ScheduledRenewalConfigurationResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Lists scheduled renewal configurations for the subscription and permits an optional status
     * query filter.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  status  Optional parameter: (Optional) Status filter for scheduled renewal
     *         configurations.
     * @return    Returns the ScheduledRenewalConfigurationsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ScheduledRenewalConfigurationsResponse listScheduledRenewalConfigurations(
            final int subscriptionId,
            final Status status) throws ApiException, IOException {
        return prepareListScheduledRenewalConfigurationsRequest(subscriptionId, status).execute();
    }

    /**
     * Builds the ApiCall object for listScheduledRenewalConfigurations.
     */
    private ApiCall<ScheduledRenewalConfigurationsResponse, ApiException> prepareListScheduledRenewalConfigurationsRequest(
            final int subscriptionId,
            final Status status) {
        return new ApiCall.Builder<ScheduledRenewalConfigurationsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/scheduled_renewals.json")
                        .queryParam(param -> param.key("status")
                                .value((status != null) ? status.value() : null).isRequired(false))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ScheduledRenewalConfigurationsResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Retrieves the configuration settings for the scheduled renewal.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  id  Required parameter: The renewal id.
     * @return    Returns the ScheduledRenewalConfigurationResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ScheduledRenewalConfigurationResponse readScheduledRenewalConfiguration(
            final int subscriptionId,
            final int id) throws ApiException, IOException {
        return prepareReadScheduledRenewalConfigurationRequest(subscriptionId, id).execute();
    }

    /**
     * Builds the ApiCall object for readScheduledRenewalConfiguration.
     */
    private ApiCall<ScheduledRenewalConfigurationResponse, ApiException> prepareReadScheduledRenewalConfigurationRequest(
            final int subscriptionId,
            final int id) {
        return new ApiCall.Builder<ScheduledRenewalConfigurationResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/scheduled_renewals/{id}.json")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("id").value(id).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ScheduledRenewalConfigurationResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Updates an existing configuration.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  id  Required parameter: The renewal id.
     * @param  body  Optional parameter:
     * @return    Returns the ScheduledRenewalConfigurationResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ScheduledRenewalConfigurationResponse updateScheduledRenewalConfiguration(
            final int subscriptionId,
            final int id,
            final ScheduledRenewalConfigurationRequest body) throws ApiException, IOException {
        return prepareUpdateScheduledRenewalConfigurationRequest(subscriptionId, id,
                body).execute();
    }

    /**
     * Builds the ApiCall object for updateScheduledRenewalConfiguration.
     */
    private ApiCall<ScheduledRenewalConfigurationResponse, ApiException> prepareUpdateScheduledRenewalConfigurationRequest(
            final int subscriptionId,
            final int id,
            final ScheduledRenewalConfigurationRequest body) {
        return new ApiCall.Builder<ScheduledRenewalConfigurationResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/scheduled_renewals/{id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("id").value(id).isRequired(false)
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
                                response -> ApiHelper.deserialize(response, ScheduledRenewalConfigurationResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Schedules a future lock-in date for the renewal.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  id  Required parameter: The renewal id.
     * @param  body  Optional parameter:
     * @return    Returns the ScheduledRenewalConfigurationResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ScheduledRenewalConfigurationResponse scheduleScheduledRenewalLockIn(
            final int subscriptionId,
            final int id,
            final ScheduledRenewalLockInRequest body) throws ApiException, IOException {
        return prepareScheduleScheduledRenewalLockInRequest(subscriptionId, id, body).execute();
    }

    /**
     * Builds the ApiCall object for scheduleScheduledRenewalLockIn.
     */
    private ApiCall<ScheduledRenewalConfigurationResponse, ApiException> prepareScheduleScheduledRenewalLockInRequest(
            final int subscriptionId,
            final int id,
            final ScheduledRenewalLockInRequest body) {
        return new ApiCall.Builder<ScheduledRenewalConfigurationResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/scheduled_renewals/{id}/schedule_lock_in.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("id").value(id).isRequired(false)
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
                                response -> ApiHelper.deserialize(response, ScheduledRenewalConfigurationResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Locks in the renewal immediately.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  id  Required parameter: The renewal id.
     * @return    Returns the ScheduledRenewalConfigurationResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ScheduledRenewalConfigurationResponse lockInScheduledRenewalImmediately(
            final int subscriptionId,
            final int id) throws ApiException, IOException {
        return prepareLockInScheduledRenewalImmediatelyRequest(subscriptionId, id).execute();
    }

    /**
     * Builds the ApiCall object for lockInScheduledRenewalImmediately.
     */
    private ApiCall<ScheduledRenewalConfigurationResponse, ApiException> prepareLockInScheduledRenewalImmediatelyRequest(
            final int subscriptionId,
            final int id) {
        return new ApiCall.Builder<ScheduledRenewalConfigurationResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/scheduled_renewals/{id}/immediate_lock_in.json")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("id").value(id).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ScheduledRenewalConfigurationResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Restores a scheduled renewal configuration to an editable state.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  id  Required parameter: The renewal id.
     * @return    Returns the ScheduledRenewalConfigurationResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ScheduledRenewalConfigurationResponse unpublishScheduledRenewalConfiguration(
            final int subscriptionId,
            final int id) throws ApiException, IOException {
        return prepareUnpublishScheduledRenewalConfigurationRequest(subscriptionId, id).execute();
    }

    /**
     * Builds the ApiCall object for unpublishScheduledRenewalConfiguration.
     */
    private ApiCall<ScheduledRenewalConfigurationResponse, ApiException> prepareUnpublishScheduledRenewalConfigurationRequest(
            final int subscriptionId,
            final int id) {
        return new ApiCall.Builder<ScheduledRenewalConfigurationResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/scheduled_renewals/{id}/unpublish.json")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("id").value(id).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ScheduledRenewalConfigurationResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Cancels a scheduled renewal configuration.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  id  Required parameter: The renewal id.
     * @return    Returns the ScheduledRenewalConfigurationResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ScheduledRenewalConfigurationResponse cancelScheduledRenewalConfiguration(
            final int subscriptionId,
            final int id) throws ApiException, IOException {
        return prepareCancelScheduledRenewalConfigurationRequest(subscriptionId, id).execute();
    }

    /**
     * Builds the ApiCall object for cancelScheduledRenewalConfiguration.
     */
    private ApiCall<ScheduledRenewalConfigurationResponse, ApiException> prepareCancelScheduledRenewalConfigurationRequest(
            final int subscriptionId,
            final int id) {
        return new ApiCall.Builder<ScheduledRenewalConfigurationResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/scheduled_renewals/{id}/cancel.json")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("id").value(id).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ScheduledRenewalConfigurationResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Adds product and component line items to the scheduled renewal. If your site has list vs
     * sales pricing enabled, accepts renewal_configuration_item.custom_price.list_price_point_id,
     * validates and persists it; omitted value follows existing/default behavior; with list vs
     * sales pricing disabled, parameter is ignored (no validation/behavioral impact). This
     * functionality is supported in the API, but is not currently supported in SDKs.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  scheduledRenewalsConfigurationId  Required parameter: The scheduled renewal
     *         configuration id.
     * @param  body  Optional parameter:
     * @return    Returns the ScheduledRenewalConfigurationItemResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ScheduledRenewalConfigurationItemResponse createScheduledRenewalConfigurationItem(
            final int subscriptionId,
            final int scheduledRenewalsConfigurationId,
            final ScheduledRenewalConfigurationItemRequest body) throws ApiException, IOException {
        return prepareCreateScheduledRenewalConfigurationItemRequest(subscriptionId,
                scheduledRenewalsConfigurationId, body).execute();
    }

    /**
     * Builds the ApiCall object for createScheduledRenewalConfigurationItem.
     */
    private ApiCall<ScheduledRenewalConfigurationItemResponse, ApiException> prepareCreateScheduledRenewalConfigurationItemRequest(
            final int subscriptionId,
            final int scheduledRenewalsConfigurationId,
            final ScheduledRenewalConfigurationItemRequest body) {
        return new ApiCall.Builder<ScheduledRenewalConfigurationItemResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/scheduled_renewals/{scheduled_renewals_configuration_id}/configuration_items.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("scheduled_renewals_configuration_id").value(scheduledRenewalsConfigurationId).isRequired(false)
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
                                response -> ApiHelper.deserialize(response, ScheduledRenewalConfigurationItemResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Updates an existing configuration item’s pricing and quantity. If you site has list vs sales
     * pricing enabled, accepts renewal_configuration_item.custom_price.list_price_point_id,
     * validates and persists it; omitted value follows existing/default behavior; with list vs
     * sales pricing disabled, parameter is ignored (no validation/behavioral impact). This
     * functionality is supported in the API, but is not currently supported in SDKs.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  scheduledRenewalsConfigurationId  Required parameter: The scheduled renewal
     *         configuration id.
     * @param  id  Required parameter: The scheduled renewal configuration item id.
     * @param  body  Optional parameter:
     * @return    Returns the ScheduledRenewalConfigurationItemResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ScheduledRenewalConfigurationItemResponse updateScheduledRenewalConfigurationItem(
            final int subscriptionId,
            final int scheduledRenewalsConfigurationId,
            final int id,
            final ScheduledRenewalUpdateRequest body) throws ApiException, IOException {
        return prepareUpdateScheduledRenewalConfigurationItemRequest(subscriptionId,
                scheduledRenewalsConfigurationId, id, body).execute();
    }

    /**
     * Builds the ApiCall object for updateScheduledRenewalConfigurationItem.
     */
    private ApiCall<ScheduledRenewalConfigurationItemResponse, ApiException> prepareUpdateScheduledRenewalConfigurationItemRequest(
            final int subscriptionId,
            final int scheduledRenewalsConfigurationId,
            final int id,
            final ScheduledRenewalUpdateRequest body) {
        return new ApiCall.Builder<ScheduledRenewalConfigurationItemResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/scheduled_renewals/{scheduled_renewals_configuration_id}/configuration_items/{id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("scheduled_renewals_configuration_id").value(scheduledRenewalsConfigurationId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("id").value(id).isRequired(false)
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
                                response -> ApiHelper.deserialize(response, ScheduledRenewalConfigurationItemResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Removes an item from the pending renewal configuration.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  scheduledRenewalsConfigurationId  Required parameter: The scheduled renewal
     *         configuration id.
     * @param  id  Required parameter: The scheduled renewal configuration item id.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void deleteScheduledRenewalConfigurationItem(
            final int subscriptionId,
            final int scheduledRenewalsConfigurationId,
            final int id) throws ApiException, IOException {
        prepareDeleteScheduledRenewalConfigurationItemRequest(subscriptionId,
                scheduledRenewalsConfigurationId, id).execute();
    }

    /**
     * Builds the ApiCall object for deleteScheduledRenewalConfigurationItem.
     */
    private ApiCall<Void, ApiException> prepareDeleteScheduledRenewalConfigurationItemRequest(
            final int subscriptionId,
            final int scheduledRenewalsConfigurationId,
            final int id) {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/scheduled_renewals/{scheduled_renewals_configuration_id}/configuration_items/{id}.json")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("scheduled_renewals_configuration_id").value(scheduledRenewalsConfigurationId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("id").value(id).isRequired(false)
                                .shouldEncode(true))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}