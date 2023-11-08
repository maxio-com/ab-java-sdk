/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.controllers;

import com.maxio.advancedbilling.ApiHelper;
import com.maxio.advancedbilling.Server;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.CountResponse;
import com.maxio.advancedbilling.models.EventResponse;
import com.maxio.advancedbilling.models.EventType;
import com.maxio.advancedbilling.models.ListEventsInput;
import com.maxio.advancedbilling.models.ListSubscriptionEventsInput;
import com.maxio.advancedbilling.models.ReadEventsCountInput;
import io.apimatic.core.ApiCall;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;
import java.util.List;

/**
 * This class lists all the endpoints of the groups.
 */
public final class EventsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public EventsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * ## Events Intro Chargify Events include various activity that happens around a Site. This
     * information is **especially** useful to track down issues that arise when subscriptions are
     * not created due to errors. Within the Chargify UI, "Events" are referred to as "Site
     * Activity". Full documentation on how to record view Events / Site Activty in the Chargify UI
     * can be located [here](https://chargify.zendesk.com/hc/en-us/articles/4407864698139). ## List
     * Events for a Site This method will retrieve a list of events for a site. Use query string
     * filters to narrow down results. You may use the `key` filter as part of your query string to
     * narrow down results. ### Legacy Filters The following keys are no longer supported. +
     * `payment_failure_recreated` + `payment_success_recreated` + `renewal_failure_recreated` +
     * `renewal_success_recreated` + `zferral_revenue_post_failure` - (Specific to the deprecated
     * Zferral integration) + `zferral_revenue_post_success` - (Specific to the deprecated Zferral
     * integration) ## Event Specific Data Event Specific Data Each event type has its own
     * `event_specific_data` specified. Here’s an example event for the
     * `subscription_product_change` event: ``` { "event": { "id": 351, "key":
     * "subscription_product_change", "message": "Product changed on Marky Mark's subscription from
     * 'Basic' to 'Pro'", "subscription_id": 205, "event_specific_data": { "new_product_id": 3,
     * "previous_product_id": 2 }, "created_at": "2012-01-30T10:43:31-05:00" } } ``` Here’s an
     * example event for the `subscription_state_change` event: ``` { "event": { "id": 353, "key":
     * "subscription_state_change", "message": "State changed on Marky Mark's subscription to Pro
     * from trialing to active", "subscription_id": 205, "event_specific_data": {
     * "new_subscription_state": "active", "previous_subscription_state": "trialing" },
     * "created_at": "2012-01-30T10:43:33-05:00" } } ```.
     * @param  input  ListEventsInput object containing request parameters
     * @return    Returns the List of EventResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<EventResponse> listEvents(
            final ListEventsInput input) throws ApiException, IOException {
        return prepareListEventsRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listEvents.
     */
    private ApiCall<List<EventResponse>, ApiException> prepareListEventsRequest(
            final ListEventsInput input) throws IOException {
        return new ApiCall.Builder<List<EventResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/events.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("since_id")
                                .value(input.getSinceId()).isRequired(false))
                        .queryParam(param -> param.key("max_id")
                                .value(input.getMaxId()).isRequired(false))
                        .queryParam(param -> param.key("direction")
                                .value((input.getDirection() != null) ? input.getDirection().value() : "desc").isRequired(false))
                        .queryParam(param -> param.key("filter")
                                .value(EventType.toValue(input.getFilter())).isRequired(false))
                        .queryParam(param -> param.key("date_field")
                                .value((input.getDateField() != null) ? input.getDateField().value() : null).isRequired(false))
                        .queryParam(param -> param.key("start_date")
                                .value(input.getStartDate()).isRequired(false))
                        .queryParam(param -> param.key("end_date")
                                .value(input.getEndDate()).isRequired(false))
                        .queryParam(param -> param.key("start_datetime")
                                .value(input.getStartDatetime()).isRequired(false))
                        .queryParam(param -> param.key("end_datetime")
                                .value(input.getEndDatetime()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        EventResponse[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * The following request will return a list of events for a subscription. Each event type has
     * its own `event_specific_data` specified.
     * @param  input  ListSubscriptionEventsInput object containing request parameters
     * @return    Returns the List of EventResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<EventResponse> listSubscriptionEvents(
            final ListSubscriptionEventsInput input) throws ApiException, IOException {
        return prepareListSubscriptionEventsRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listSubscriptionEvents.
     */
    private ApiCall<List<EventResponse>, ApiException> prepareListSubscriptionEventsRequest(
            final ListSubscriptionEventsInput input) throws IOException {
        return new ApiCall.Builder<List<EventResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/events.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("since_id")
                                .value(input.getSinceId()).isRequired(false))
                        .queryParam(param -> param.key("max_id")
                                .value(input.getMaxId()).isRequired(false))
                        .queryParam(param -> param.key("direction")
                                .value((input.getDirection() != null) ? input.getDirection().value() : "desc").isRequired(false))
                        .queryParam(param -> param.key("filter")
                                .value(EventType.toValue(input.getFilter())).isRequired(false))
                        .templateParam(param -> param.key("subscription_id").value(input.getSubscriptionId())
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        EventResponse[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Get a count of all the events for a given site by using this method.
     * @param  input  ReadEventsCountInput object containing request parameters
     * @return    Returns the CountResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CountResponse readEventsCount(
            final ReadEventsCountInput input) throws ApiException, IOException {
        return prepareReadEventsCountRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for readEventsCount.
     */
    private ApiCall<CountResponse, ApiException> prepareReadEventsCountRequest(
            final ReadEventsCountInput input) throws IOException {
        return new ApiCall.Builder<CountResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/events/count.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("since_id")
                                .value(input.getSinceId()).isRequired(false))
                        .queryParam(param -> param.key("max_id")
                                .value(input.getMaxId()).isRequired(false))
                        .queryParam(param -> param.key("direction")
                                .value((input.getDirection() != null) ? input.getDirection().value() : "desc").isRequired(false))
                        .queryParam(param -> param.key("filter")
                                .value(EventType.toValue(input.getFilter())).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CountResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }
}