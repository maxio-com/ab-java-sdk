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
import com.maxio.advancedbilling.models.Direction;
import com.maxio.advancedbilling.models.EventResponse;
import com.maxio.advancedbilling.models.EventType;
import com.maxio.advancedbilling.models.ListEventsDateField;
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
     * @param  page  Optional parameter: Result records are organized in pages. By default, the
     *         first page of results is displayed. The page parameter specifies a page number of
     *         results to fetch. You can start navigating through the pages to consume the results.
     *         You do this by passing in a page parameter. Retrieve the next page by adding ?page=2
     *         to the query string. If there are no results to return, then an empty result set will
     *         be returned. Use in query `page=1`.
     * @param  perPage  Optional parameter: This parameter indicates how many records to fetch in
     *         each request. Default value is 20. The maximum allowed values is 200; any per_page
     *         value over 200 will be changed to 200. Use in query `per_page=200`.
     * @param  sinceId  Optional parameter: Returns events with an id greater than or equal to the
     *         one specified
     * @param  maxId  Optional parameter: Returns events with an id less than or equal to the one
     *         specified
     * @param  direction  Optional parameter: The sort direction of the returned events.
     * @param  filter  Optional parameter: You can pass multiple event keys after comma. Use in
     *         query `filter=signup_success,payment_success`.
     * @param  dateField  Optional parameter: The type of filter you would like to apply to your
     *         search.
     * @param  startDate  Optional parameter: The start date (format YYYY-MM-DD) with which to
     *         filter the date_field. Returns components with a timestamp at or after midnight
     *         (12:00:00 AM) in your site’s time zone on the date specified.
     * @param  endDate  Optional parameter: The end date (format YYYY-MM-DD) with which to filter
     *         the date_field. Returns components with a timestamp up to and including 11:59:59PM in
     *         your site’s time zone on the date specified.
     * @param  startDatetime  Optional parameter: The start date and time (format YYYY-MM-DD
     *         HH:MM:SS) with which to filter the date_field. Returns components with a timestamp at
     *         or after exact time provided in query. You can specify timezone in query - otherwise
     *         your site's time zone will be used. If provided, this parameter will be used instead
     *         of start_date.
     * @param  endDatetime  Optional parameter: The end date and time (format YYYY-MM-DD HH:MM:SS)
     *         with which to filter the date_field. Returns components with a timestamp at or before
     *         exact time provided in query. You can specify timezone in query - otherwise your
     *         site's time zone will be used. If provided, this parameter will be used instead of
     *         end_date.
     * @return    Returns the List of EventResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<EventResponse> listEvents(
            final Integer page,
            final Integer perPage,
            final Integer sinceId,
            final Integer maxId,
            final Direction direction,
            final List<EventType> filter,
            final ListEventsDateField dateField,
            final String startDate,
            final String endDate,
            final String startDatetime,
            final String endDatetime) throws ApiException, IOException {
        return prepareListEventsRequest(page, perPage, sinceId, maxId, direction, filter, dateField,
                startDate, endDate, startDatetime, endDatetime).execute();
    }

    /**
     * Builds the ApiCall object for listEvents.
     */
    private ApiCall<List<EventResponse>, ApiException> prepareListEventsRequest(
            final Integer page,
            final Integer perPage,
            final Integer sinceId,
            final Integer maxId,
            final Direction direction,
            final List<EventType> filter,
            final ListEventsDateField dateField,
            final String startDate,
            final String endDate,
            final String startDatetime,
            final String endDatetime) throws IOException {
        return new ApiCall.Builder<List<EventResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/events.json")
                        .queryParam(param -> param.key("page")
                                .value((page != null) ? page : 1).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value((perPage != null) ? perPage : 20).isRequired(false))
                        .queryParam(param -> param.key("since_id")
                                .value(sinceId).isRequired(false))
                        .queryParam(param -> param.key("max_id")
                                .value(maxId).isRequired(false))
                        .queryParam(param -> param.key("direction")
                                .value((direction != null) ? direction.value() : "desc").isRequired(false))
                        .queryParam(param -> param.key("filter")
                                .value(EventType.toValue(filter)).isRequired(false))
                        .queryParam(param -> param.key("date_field")
                                .value((dateField != null) ? dateField.value() : null).isRequired(false))
                        .queryParam(param -> param.key("start_date")
                                .value(startDate).isRequired(false))
                        .queryParam(param -> param.key("end_date")
                                .value(endDate).isRequired(false))
                        .queryParam(param -> param.key("start_datetime")
                                .value(startDatetime).isRequired(false))
                        .queryParam(param -> param.key("end_datetime")
                                .value(endDatetime).isRequired(false))
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
     * @param  sinceId  Optional parameter: Returns events with an id greater than or equal to the
     *         one specified
     * @param  maxId  Optional parameter: Returns events with an id less than or equal to the one
     *         specified
     * @param  direction  Optional parameter: The sort direction of the returned events.
     * @param  filter  Optional parameter: You can pass multiple event keys after comma. Use in
     *         query `filter=signup_success,payment_success`.
     * @return    Returns the List of EventResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<EventResponse> listSubscriptionEvents(
            final String subscriptionId,
            final Integer page,
            final Integer perPage,
            final Integer sinceId,
            final Integer maxId,
            final Direction direction,
            final List<EventType> filter) throws ApiException, IOException {
        return prepareListSubscriptionEventsRequest(subscriptionId, page, perPage, sinceId, maxId,
                direction, filter).execute();
    }

    /**
     * Builds the ApiCall object for listSubscriptionEvents.
     */
    private ApiCall<List<EventResponse>, ApiException> prepareListSubscriptionEventsRequest(
            final String subscriptionId,
            final Integer page,
            final Integer perPage,
            final Integer sinceId,
            final Integer maxId,
            final Direction direction,
            final List<EventType> filter) throws IOException {
        return new ApiCall.Builder<List<EventResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/events.json")
                        .queryParam(param -> param.key("page")
                                .value((page != null) ? page : 1).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value((perPage != null) ? perPage : 20).isRequired(false))
                        .queryParam(param -> param.key("since_id")
                                .value(sinceId).isRequired(false))
                        .queryParam(param -> param.key("max_id")
                                .value(maxId).isRequired(false))
                        .queryParam(param -> param.key("direction")
                                .value((direction != null) ? direction.value() : "desc").isRequired(false))
                        .queryParam(param -> param.key("filter")
                                .value(EventType.toValue(filter)).isRequired(false))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
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
     * @param  page  Optional parameter: Result records are organized in pages. By default, the
     *         first page of results is displayed. The page parameter specifies a page number of
     *         results to fetch. You can start navigating through the pages to consume the results.
     *         You do this by passing in a page parameter. Retrieve the next page by adding ?page=2
     *         to the query string. If there are no results to return, then an empty result set will
     *         be returned. Use in query `page=1`.
     * @param  perPage  Optional parameter: This parameter indicates how many records to fetch in
     *         each request. Default value is 20. The maximum allowed values is 200; any per_page
     *         value over 200 will be changed to 200. Use in query `per_page=200`.
     * @param  sinceId  Optional parameter: Returns events with an id greater than or equal to the
     *         one specified
     * @param  maxId  Optional parameter: Returns events with an id less than or equal to the one
     *         specified
     * @param  direction  Optional parameter: The sort direction of the returned events.
     * @param  filter  Optional parameter: You can pass multiple event keys after comma. Use in
     *         query `filter=signup_success,payment_success`.
     * @return    Returns the CountResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CountResponse readEventsCount(
            final Integer page,
            final Integer perPage,
            final Integer sinceId,
            final Integer maxId,
            final Direction direction,
            final List<EventType> filter) throws ApiException, IOException {
        return prepareReadEventsCountRequest(page, perPage, sinceId, maxId, direction,
                filter).execute();
    }

    /**
     * Builds the ApiCall object for readEventsCount.
     */
    private ApiCall<CountResponse, ApiException> prepareReadEventsCountRequest(
            final Integer page,
            final Integer perPage,
            final Integer sinceId,
            final Integer maxId,
            final Direction direction,
            final List<EventType> filter) throws IOException {
        return new ApiCall.Builder<CountResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/events/count.json")
                        .queryParam(param -> param.key("page")
                                .value((page != null) ? page : 1).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value((perPage != null) ? perPage : 20).isRequired(false))
                        .queryParam(param -> param.key("since_id")
                                .value(sinceId).isRequired(false))
                        .queryParam(param -> param.key("max_id")
                                .value(maxId).isRequired(false))
                        .queryParam(param -> param.key("direction")
                                .value((direction != null) ? direction.value() : "desc").isRequired(false))
                        .queryParam(param -> param.key("filter")
                                .value(EventType.toValue(filter)).isRequired(false))
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