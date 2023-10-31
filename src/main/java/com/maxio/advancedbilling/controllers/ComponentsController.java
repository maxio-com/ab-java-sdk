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
import com.maxio.advancedbilling.models.BasicDateField;
import com.maxio.advancedbilling.models.ComponentKindPath;
import com.maxio.advancedbilling.models.ComponentPricePointResponse;
import com.maxio.advancedbilling.models.ComponentPricePointsResponse;
import com.maxio.advancedbilling.models.ComponentResponse;
import com.maxio.advancedbilling.models.CreateComponentPricePointRequest;
import com.maxio.advancedbilling.models.CreateComponentPricePointsRequest;
import com.maxio.advancedbilling.models.CreateCurrencyPricesRequest;
import com.maxio.advancedbilling.models.CurrencyPrice;
import com.maxio.advancedbilling.models.IncludeNotNull;
import com.maxio.advancedbilling.models.ListComponentsPricePointsInclude;
import com.maxio.advancedbilling.models.ListComponentsPricePointsResponse;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.UpdateComponentPricePointRequest;
import com.maxio.advancedbilling.models.UpdateComponentRequest;
import com.maxio.advancedbilling.models.UpdateCurrencyPricesRequest;
import com.maxio.advancedbilling.models.containers.CreateComponentBody;
import com.maxio.advancedbilling.models.containers.ListAllComponentPricePointsDirection;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;
import java.util.List;

/**
 * This class lists all the endpoints of the groups.
 */
public final class ComponentsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public ComponentsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This request will create a component definition under the specified product family. These
     * component definitions determine what components are named, how they are measured, and how
     * much they cost. Components can then be added and “allocated” for each subscription to a
     * product in the product family. These component line-items affect how much a subscription will
     * be charged, depending on the current allocations (i.e. 4 IP Addresses, or SSL “enabled”) This
     * documentation covers both component definitions and component line-items. Please understand
     * the difference. Please note that you may not edit components via API. To do so, please log
     * into the application. ### Component Documentation For more information on components, please
     * see our documentation
     * [here](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405020625677). For information
     * on how to record component usage against a subscription, please see the following resources:
     * + [Proration and Component
     * Allocations](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405020625677#applying-proration-and-recording-components)
     * + [Recording component usage against a
     * subscription](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404606587917#recording-component-usage).
     * @param  productFamilyId  Required parameter: The Chargify id of the product family to which
     *         the component belongs
     * @param  componentKind  Required parameter: The component kind
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentResponse createComponent(
            final int productFamilyId,
            final ComponentKindPath componentKind,
            final CreateComponentBody body) throws ApiException, IOException {
        return prepareCreateComponentRequest(productFamilyId, componentKind, body).execute();
    }

    /**
     * Builds the ApiCall object for createComponent.
     */
    private ApiCall<ComponentResponse, ApiException> prepareCreateComponentRequest(
            final int productFamilyId,
            final ComponentKindPath componentKind,
            final CreateComponentBody body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/product_families/{product_family_id}/{component_kind}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serializeTypeCombinator(body))
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("component_kind").value((componentKind != null) ? componentKind.value() : null)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * This request will return information regarding a component having the handle you provide. You
     * can identify your components with a handle so you don't have to save or reference the IDs we
     * generate.
     * @param  handle  Required parameter: The handle of the component to find
     * @return    Returns the ComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentResponse readComponentByHandle(
            final String handle) throws ApiException, IOException {
        return prepareReadComponentByHandleRequest(handle).execute();
    }

    /**
     * Builds the ApiCall object for readComponentByHandle.
     */
    private ApiCall<ComponentResponse, ApiException> prepareReadComponentByHandleRequest(
            final String handle) throws IOException {
        return new ApiCall.Builder<ComponentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components/lookup.json")
                        .queryParam(param -> param.key("handle")
                                .value(handle))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * This request will return information regarding a component from a specific product family.
     * You may read the component by either the component's id or handle. When using the handle, it
     * must be prefixed with `handle:`.
     * @param  productFamilyId  Required parameter: The Chargify id of the product family to which
     *         the component belongs
     * @param  componentId  Required parameter: Either the Chargify id of the component or the
     *         handle for the component prefixed with `handle:`
     * @return    Returns the ComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentResponse readComponentById(
            final int productFamilyId,
            final String componentId) throws ApiException, IOException {
        return prepareReadComponentByIdRequest(productFamilyId, componentId).execute();
    }

    /**
     * Builds the ApiCall object for readComponentById.
     */
    private ApiCall<ComponentResponse, ApiException> prepareReadComponentByIdRequest(
            final int productFamilyId,
            final String componentId) throws IOException {
        return new ApiCall.Builder<ComponentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/product_families/{product_family_id}/components/{component_id}.json")
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("component_id").value(componentId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * This request will update a component from a specific product family. You may read the
     * component by either the component's id or handle. When using the handle, it must be prefixed
     * with `handle:`.
     * @param  productFamilyId  Required parameter: The Chargify id of the product family to which
     *         the component belongs
     * @param  componentId  Required parameter: Either the Chargify id of the component or the
     *         handle for the component prefixed with `handle:`
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentResponse updateProductFamilyComponent(
            final int productFamilyId,
            final String componentId,
            final UpdateComponentRequest body) throws ApiException, IOException {
        return prepareUpdateProductFamilyComponentRequest(productFamilyId, componentId,
                body).execute();
    }

    /**
     * Builds the ApiCall object for updateProductFamilyComponent.
     */
    private ApiCall<ComponentResponse, ApiException> prepareUpdateProductFamilyComponentRequest(
            final int productFamilyId,
            final String componentId,
            final UpdateComponentRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/product_families/{product_family_id}/components/{component_id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("component_id").value(componentId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * Sending a DELETE request to this endpoint will archive the component. All current subscribers
     * will be unffected; their subscription/purchase will continue to be charged as usual.
     * @param  productFamilyId  Required parameter: The Chargify id of the product family to which
     *         the component belongs
     * @param  componentId  Required parameter: Either the Chargify id of the component or the
     *         handle for the component prefixed with `handle:`
     * @return    Returns the ComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentResponse archiveComponent(
            final int productFamilyId,
            final String componentId) throws ApiException, IOException {
        return prepareArchiveComponentRequest(productFamilyId, componentId).execute();
    }

    /**
     * Builds the ApiCall object for archiveComponent.
     */
    private ApiCall<ComponentResponse, ApiException> prepareArchiveComponentRequest(
            final int productFamilyId,
            final String componentId) throws IOException {
        return new ApiCall.Builder<ComponentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/product_families/{product_family_id}/components/{component_id}.json")
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("component_id").value(componentId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * This request will return a list of components for a site.
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
     *         end_date. optional
     * @param  includeArchived  Optional parameter: Include archived items
     * @param  page  Optional parameter: Result records are organized in pages. By default, the
     *         first page of results is displayed. The page parameter specifies a page number of
     *         results to fetch. You can start navigating through the pages to consume the results.
     *         You do this by passing in a page parameter. Retrieve the next page by adding ?page=2
     *         to the query string. If there are no results to return, then an empty result set will
     *         be returned. Use in query `page=1`.
     * @param  perPage  Optional parameter: This parameter indicates how many records to fetch in
     *         each request. Default value is 20. The maximum allowed values is 200; any per_page
     *         value over 200 will be changed to 200. Use in query `per_page=200`.
     * @param  filterIds  Optional parameter: Allows fetching components with matching id based on
     *         provided value. Use in query `filter[ids]=1,2,3`.
     * @param  filterUseSiteExchangeRate  Optional parameter: Allows fetching components with
     *         matching use_site_exchange_rate based on provided value (refers to default price
     *         point). Use in query `filter[use_site_exchange_rate]=true`.
     * @return    Returns the List of ComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<ComponentResponse> listComponents(
            final BasicDateField dateField,
            final String startDate,
            final String endDate,
            final String startDatetime,
            final String endDatetime,
            final Boolean includeArchived,
            final Integer page,
            final Integer perPage,
            final List<String> filterIds,
            final Boolean filterUseSiteExchangeRate) throws ApiException, IOException {
        return prepareListComponentsRequest(dateField, startDate, endDate, startDatetime,
                endDatetime, includeArchived, page, perPage, filterIds,
                filterUseSiteExchangeRate).execute();
    }

    /**
     * Builds the ApiCall object for listComponents.
     */
    private ApiCall<List<ComponentResponse>, ApiException> prepareListComponentsRequest(
            final BasicDateField dateField,
            final String startDate,
            final String endDate,
            final String startDatetime,
            final String endDatetime,
            final Boolean includeArchived,
            final Integer page,
            final Integer perPage,
            final List<String> filterIds,
            final Boolean filterUseSiteExchangeRate) throws IOException {
        return new ApiCall.Builder<List<ComponentResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components.json")
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
                        .queryParam(param -> param.key("include_archived")
                                .value(includeArchived).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value((page != null) ? page : 1).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value((perPage != null) ? perPage : 20).isRequired(false))
                        .queryParam(param -> param.key("filter[ids]")
                                .value(filterIds).isRequired(false))
                        .queryParam(param -> param.key("filter[use_site_exchange_rate]")
                                .value(filterUseSiteExchangeRate).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        ComponentResponse[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * This request will update a component. You may read the component by either the component's id
     * or handle. When using the handle, it must be prefixed with `handle:`.
     * @param  componentId  Required parameter: The id or handle of the component
     * @param  body  Optional parameter: Example:
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void updateComponent(
            final String componentId,
            final UpdateComponentRequest body) throws ApiException, IOException {
        prepareUpdateComponentRequest(componentId, body).execute();
    }

    /**
     * Builds the ApiCall object for updateComponent.
     */
    private ApiCall<Void, ApiException> prepareUpdateComponentRequest(
            final String componentId,
            final UpdateComponentRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components/{component_id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("component_id").value(componentId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * Sets a new default price point for the component. This new default will apply to all new
     * subscriptions going forward - existing subscriptions will remain on their current price
     * point. See [Price Points
     * Documentation](https://chargify.zendesk.com/hc/en-us/articles/4407755865883#price-points) for
     * more information on price points and moving subscriptions between price points. Note: Custom
     * price points are not able to be set as the default for a component.
     * @param  componentId  Required parameter: The Chargify id of the component to which the price
     *         point belongs
     * @param  pricePointId  Required parameter: The Chargify id of the price point
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void updateDefaultPricePointForComponent(
            final int componentId,
            final int pricePointId) throws ApiException, IOException {
        prepareUpdateDefaultPricePointForComponentRequest(componentId, pricePointId).execute();
    }

    /**
     * Builds the ApiCall object for updateDefaultPricePointForComponent.
     */
    private ApiCall<Void, ApiException> prepareUpdateDefaultPricePointForComponentRequest(
            final int componentId,
            final int pricePointId) throws IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components/{component_id}/price_points/{price_point_id}/default.json")
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId).isRequired(false)
                                .shouldEncode(true))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * This request will return a list of components for a particular product family.
     * @param  productFamilyId  Required parameter: The Chargify id of the product family
     * @param  includeArchived  Optional parameter: Include archived items.
     * @param  filterIds  Optional parameter: Allows fetching components with matching id based on
     *         provided value. Use in query `filter[ids]=1,2`.
     * @param  page  Optional parameter: Result records are organized in pages. By default, the
     *         first page of results is displayed. The page parameter specifies a page number of
     *         results to fetch. You can start navigating through the pages to consume the results.
     *         You do this by passing in a page parameter. Retrieve the next page by adding ?page=2
     *         to the query string. If there are no results to return, then an empty result set will
     *         be returned. Use in query `page=1`.
     * @param  perPage  Optional parameter: This parameter indicates how many records to fetch in
     *         each request. Default value is 20. The maximum allowed values is 200; any per_page
     *         value over 200 will be changed to 200. Use in query `per_page=200`.
     * @param  dateField  Optional parameter: The type of filter you would like to apply to your
     *         search. Use in query `date_field=created_at`.
     * @param  endDate  Optional parameter: The end date (format YYYY-MM-DD) with which to filter
     *         the date_field. Returns components with a timestamp up to and including 11:59:59PM in
     *         your site’s time zone on the date specified.
     * @param  endDatetime  Optional parameter: The end date and time (format YYYY-MM-DD HH:MM:SS)
     *         with which to filter the date_field. Returns components with a timestamp at or before
     *         exact time provided in query. You can specify timezone in query - otherwise your
     *         site's time zone will be used. If provided, this parameter will be used instead of
     *         end_date. optional.
     * @param  startDate  Optional parameter: The start date (format YYYY-MM-DD) with which to
     *         filter the date_field. Returns components with a timestamp at or after midnight
     *         (12:00:00 AM) in your site’s time zone on the date specified.
     * @param  startDatetime  Optional parameter: The start date and time (format YYYY-MM-DD
     *         HH:MM:SS) with which to filter the date_field. Returns components with a timestamp at
     *         or after exact time provided in query. You can specify timezone in query - otherwise
     *         your site's time zone will be used. If provided, this parameter will be used instead
     *         of start_date.
     * @param  filterUseSiteExchangeRate  Optional parameter: Allows fetching components with
     *         matching use_site_exchange_rate based on provided value (refers to default price
     *         point). Use in query `filter[use_site_exchange_rate]=true`.
     * @return    Returns the List of ComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<ComponentResponse> listComponentsForProductFamily(
            final int productFamilyId,
            final Boolean includeArchived,
            final List<Integer> filterIds,
            final Integer page,
            final Integer perPage,
            final BasicDateField dateField,
            final String endDate,
            final String endDatetime,
            final String startDate,
            final String startDatetime,
            final Boolean filterUseSiteExchangeRate) throws ApiException, IOException {
        return prepareListComponentsForProductFamilyRequest(productFamilyId, includeArchived,
                filterIds, page, perPage, dateField, endDate, endDatetime, startDate, startDatetime,
                filterUseSiteExchangeRate).execute();
    }

    /**
     * Builds the ApiCall object for listComponentsForProductFamily.
     */
    private ApiCall<List<ComponentResponse>, ApiException> prepareListComponentsForProductFamilyRequest(
            final int productFamilyId,
            final Boolean includeArchived,
            final List<Integer> filterIds,
            final Integer page,
            final Integer perPage,
            final BasicDateField dateField,
            final String endDate,
            final String endDatetime,
            final String startDate,
            final String startDatetime,
            final Boolean filterUseSiteExchangeRate) throws IOException {
        return new ApiCall.Builder<List<ComponentResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/product_families/{product_family_id}/components.json")
                        .queryParam(param -> param.key("include_archived")
                                .value(includeArchived).isRequired(false))
                        .queryParam(param -> param.key("filter[ids]")
                                .value(filterIds).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value((page != null) ? page : 1).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value((perPage != null) ? perPage : 20).isRequired(false))
                        .queryParam(param -> param.key("date_field")
                                .value((dateField != null) ? dateField.value() : null).isRequired(false))
                        .queryParam(param -> param.key("end_date")
                                .value(endDate).isRequired(false))
                        .queryParam(param -> param.key("end_datetime")
                                .value(endDatetime).isRequired(false))
                        .queryParam(param -> param.key("start_date")
                                .value(startDate).isRequired(false))
                        .queryParam(param -> param.key("start_datetime")
                                .value(startDatetime).isRequired(false))
                        .queryParam(param -> param.key("filter[use_site_exchange_rate]")
                                .value(filterUseSiteExchangeRate).isRequired(false))
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        ComponentResponse[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * This endpoint can be used to create a new price point for an existing component.
     * @param  componentId  Required parameter: The Chargify id of the component
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentPricePointResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentPricePointResponse createComponentPricePoint(
            final int componentId,
            final CreateComponentPricePointRequest body) throws ApiException, IOException {
        return prepareCreateComponentPricePointRequest(componentId, body).execute();
    }

    /**
     * Builds the ApiCall object for createComponentPricePoint.
     */
    private ApiCall<ComponentPricePointResponse, ApiException> prepareCreateComponentPricePointRequest(
            final int componentId,
            final CreateComponentPricePointRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentPricePointResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components/{component_id}/price_points.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentPricePointResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * Use this endpoint to read current price points that are associated with a component. You may
     * specify the component by using either the numeric id or the `handle:gold` syntax. When
     * fetching a component's price points, if you have defined multiple currencies at the site
     * level, you can optionally pass the `?currency_prices=true` query param to include an array of
     * currency price data in the response. If the price point is set to `use_site_exchange_rate:
     * true`, it will return pricing based on the current exchange rate. If the flag is set to
     * false, it will return all of the defined prices for each currency.
     * @param  componentId  Required parameter: The Chargify id of the component
     * @param  currencyPrices  Optional parameter: Include an array of currency price data
     * @param  page  Optional parameter: Result records are organized in pages. By default, the
     *         first page of results is displayed. The page parameter specifies a page number of
     *         results to fetch. You can start navigating through the pages to consume the results.
     *         You do this by passing in a page parameter. Retrieve the next page by adding ?page=2
     *         to the query string. If there are no results to return, then an empty result set will
     *         be returned. Use in query `page=1`.
     * @param  perPage  Optional parameter: This parameter indicates how many records to fetch in
     *         each request. Default value is 20. The maximum allowed values is 200; any per_page
     *         value over 200 will be changed to 200. Use in query `per_page=200`.
     * @param  filterType  Optional parameter: Use in query: `filter[type]=catalog,default`.
     * @return    Returns the ComponentPricePointsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentPricePointsResponse listComponentPricePoints(
            final int componentId,
            final Boolean currencyPrices,
            final Integer page,
            final Integer perPage,
            final List<PricePointType> filterType) throws ApiException, IOException {
        return prepareListComponentPricePointsRequest(componentId, currencyPrices, page, perPage,
                filterType).execute();
    }

    /**
     * Builds the ApiCall object for listComponentPricePoints.
     */
    private ApiCall<ComponentPricePointsResponse, ApiException> prepareListComponentPricePointsRequest(
            final int componentId,
            final Boolean currencyPrices,
            final Integer page,
            final Integer perPage,
            final List<PricePointType> filterType) throws IOException {
        return new ApiCall.Builder<ComponentPricePointsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components/{component_id}/price_points.json")
                        .queryParam(param -> param.key("currency_prices")
                                .value(currencyPrices).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value((page != null) ? page : 1).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value((perPage != null) ? perPage : 20).isRequired(false))
                        .queryParam(param -> param.key("filter[type]")
                                .value(PricePointType.toValue(filterType)).isRequired(false))
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentPricePointsResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * Use this endpoint to create multiple component price points in one request.
     * @param  componentId  Required parameter: The Chargify id of the component for which you want
     *         to fetch price points.
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentPricePointsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentPricePointsResponse createComponentPricePoints(
            final String componentId,
            final CreateComponentPricePointsRequest body) throws ApiException, IOException {
        return prepareCreateComponentPricePointsRequest(componentId, body).execute();
    }

    /**
     * Builds the ApiCall object for createComponentPricePoints.
     */
    private ApiCall<ComponentPricePointsResponse, ApiException> prepareCreateComponentPricePointsRequest(
            final String componentId,
            final CreateComponentPricePointsRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentPricePointsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components/{component_id}/price_points/bulk.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("component_id").value(componentId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentPricePointsResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * When updating a price point, it's prices can be updated as well by creating new prices or
     * editing / removing existing ones. Passing in a price bracket without an `id` will attempt to
     * create a new price. Including an `id` will update the corresponding price, and including the
     * `_destroy` flag set to true along with the `id` will remove that price. Note: Custom price
     * points cannot be updated directly. They must be edited through the Subscription.
     * @param  componentId  Required parameter: The Chargify id of the component to which the price
     *         point belongs
     * @param  pricePointId  Required parameter: The Chargify id of the price point
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentPricePointResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentPricePointResponse updateComponentPricePoint(
            final int componentId,
            final int pricePointId,
            final UpdateComponentPricePointRequest body) throws ApiException, IOException {
        return prepareUpdateComponentPricePointRequest(componentId, pricePointId, body).execute();
    }

    /**
     * Builds the ApiCall object for updateComponentPricePoint.
     */
    private ApiCall<ComponentPricePointResponse, ApiException> prepareUpdateComponentPricePointRequest(
            final int componentId,
            final int pricePointId,
            final UpdateComponentPricePointRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentPricePointResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components/{component_id}/price_points/{price_point_id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentPricePointResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * A price point can be archived at any time. Subscriptions using a price point that has been
     * archived will continue using it until they're moved to another price point.
     * @param  componentId  Required parameter: The Chargify id of the component to which the price
     *         point belongs
     * @param  pricePointId  Required parameter: The Chargify id of the price point
     * @return    Returns the ComponentPricePointResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentPricePointResponse archiveComponentPricePoint(
            final int componentId,
            final int pricePointId) throws ApiException, IOException {
        return prepareArchiveComponentPricePointRequest(componentId, pricePointId).execute();
    }

    /**
     * Builds the ApiCall object for archiveComponentPricePoint.
     */
    private ApiCall<ComponentPricePointResponse, ApiException> prepareArchiveComponentPricePointRequest(
            final int componentId,
            final int pricePointId) throws IOException {
        return new ApiCall.Builder<ComponentPricePointResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components/{component_id}/price_points/{price_point_id}.json")
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentPricePointResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * Use this endpoint to unarchive a component price point.
     * @param  componentId  Required parameter: The Chargify id of the component to which the price
     *         point belongs
     * @param  pricePointId  Required parameter: The Chargify id of the price point
     * @return    Returns the ComponentPricePointResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentPricePointResponse unarchiveComponentPricePoint(
            final int componentId,
            final int pricePointId) throws ApiException, IOException {
        return prepareUnarchiveComponentPricePointRequest(componentId, pricePointId).execute();
    }

    /**
     * Builds the ApiCall object for unarchiveComponentPricePoint.
     */
    private ApiCall<ComponentPricePointResponse, ApiException> prepareUnarchiveComponentPricePointRequest(
            final int componentId,
            final int pricePointId) throws IOException {
        return new ApiCall.Builder<ComponentPricePointResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components/{component_id}/price_points/{price_point_id}/unarchive.json")
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentPricePointResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * This endpoint allows you to create currency prices for a given currency that has been defined
     * on the site level in your settings. When creating currency prices, they need to mirror the
     * structure of your primary pricing. For each price level defined on the component price point,
     * there should be a matching price level created in the given currency. Note: Currency Prices
     * are not able to be created for custom price points.
     * @param  pricePointId  Required parameter: The Chargify id of the price point
     * @param  body  Optional parameter: Example:
     * @return    Returns the List of CurrencyPrice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<CurrencyPrice> createCurrencyPrices(
            final int pricePointId,
            final CreateCurrencyPricesRequest body) throws ApiException, IOException {
        return prepareCreateCurrencyPricesRequest(pricePointId, body).execute();
    }

    /**
     * Builds the ApiCall object for createCurrencyPrices.
     */
    private ApiCall<List<CurrencyPrice>, ApiException> prepareCreateCurrencyPricesRequest(
            final int pricePointId,
            final CreateCurrencyPricesRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<List<CurrencyPrice>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/price_points/{price_point_id}/currency_prices.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        CurrencyPrice[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * This endpoint allows you to update currency prices for a given currency that has been defined
     * on the site level in your settings. Note: Currency Prices are not able to be updated for
     * custom price points.
     * @param  pricePointId  Required parameter: The Chargify id of the price point
     * @param  body  Optional parameter: Example:
     * @return    Returns the List of CurrencyPrice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<CurrencyPrice> updateCurrencyPrices(
            final int pricePointId,
            final UpdateCurrencyPricesRequest body) throws ApiException, IOException {
        return prepareUpdateCurrencyPricesRequest(pricePointId, body).execute();
    }

    /**
     * Builds the ApiCall object for updateCurrencyPrices.
     */
    private ApiCall<List<CurrencyPrice>, ApiException> prepareUpdateCurrencyPricesRequest(
            final int pricePointId,
            final UpdateCurrencyPricesRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<List<CurrencyPrice>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/price_points/{price_point_id}/currency_prices.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        CurrencyPrice[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * This method allows to retrieve a list of Components Price Points belonging to a Site.
     * @param  filterDateField  Optional parameter: The type of filter you would like to apply to
     *         your search. Use in query: `filter[date_field]=created_at`.
     * @param  filterEndDate  Optional parameter: The end date (format YYYY-MM-DD) with which to
     *         filter the date_field. Returns price points with a timestamp up to and including
     *         11:59:59PM in your site’s time zone on the date specified.
     * @param  filterEndDatetime  Optional parameter: The end date and time (format YYYY-MM-DD
     *         HH:MM:SS) with which to filter the date_field. Returns price points with a timestamp
     *         at or before exact time provided in query. You can specify timezone in query -
     *         otherwise your site's time zone will be used. If provided, this parameter will be
     *         used instead of end_date.
     * @param  include  Optional parameter: Allows including additional data in the response. Use in
     *         query: `include=currency_prices`.
     * @param  page  Optional parameter: Result records are organized in pages. By default, the
     *         first page of results is displayed. The page parameter specifies a page number of
     *         results to fetch. You can start navigating through the pages to consume the results.
     *         You do this by passing in a page parameter. Retrieve the next page by adding ?page=2
     *         to the query string. If there are no results to return, then an empty result set will
     *         be returned. Use in query `page=1`.
     * @param  perPage  Optional parameter: This parameter indicates how many records to fetch in
     *         each request. Default value is 20. The maximum allowed values is 200; any per_page
     *         value over 200 will be changed to 200. Use in query `per_page=200`.
     * @param  filterStartDate  Optional parameter: The start date (format YYYY-MM-DD) with which to
     *         filter the date_field. Returns price points with a timestamp at or after midnight
     *         (12:00:00 AM) in your site’s time zone on the date specified.
     * @param  filterStartDatetime  Optional parameter: The start date and time (format YYYY-MM-DD
     *         HH:MM:SS) with which to filter the date_field. Returns price points with a timestamp
     *         at or after exact time provided in query. You can specify timezone in query -
     *         otherwise your site's time zone will be used. If provided, this parameter will be
     *         used instead of start_date.
     * @param  filterType  Optional parameter: Allows fetching price points with matching type. Use
     *         in query: `filter[type]=custom,catalog`.
     * @param  direction  Optional parameter: Controls the order in which results are returned. Use
     *         in query `direction=asc`.
     * @param  filterIds  Optional parameter: Allows fetching price points with matching id based on
     *         provided values. Use in query: `filter[ids]=1,2,3`.
     * @param  filterArchivedAt  Optional parameter: Allows fetching price points only if
     *         archived_at is present or not. Use in query: `filter[archived_at]=not_null`.
     * @return    Returns the ListComponentsPricePointsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListComponentsPricePointsResponse listAllComponentPricePoints(
            final BasicDateField filterDateField,
            final String filterEndDate,
            final String filterEndDatetime,
            final ListComponentsPricePointsInclude include,
            final Integer page,
            final Integer perPage,
            final String filterStartDate,
            final String filterStartDatetime,
            final PricePointType filterType,
            final ListAllComponentPricePointsDirection direction,
            final List<Integer> filterIds,
            final IncludeNotNull filterArchivedAt) throws ApiException, IOException {
        return prepareListAllComponentPricePointsRequest(filterDateField, filterEndDate,
                filterEndDatetime, include, page, perPage, filterStartDate, filterStartDatetime,
                filterType, direction, filterIds, filterArchivedAt).execute();
    }

    /**
     * Builds the ApiCall object for listAllComponentPricePoints.
     */
    private ApiCall<ListComponentsPricePointsResponse, ApiException> prepareListAllComponentPricePointsRequest(
            final BasicDateField filterDateField,
            final String filterEndDate,
            final String filterEndDatetime,
            final ListComponentsPricePointsInclude include,
            final Integer page,
            final Integer perPage,
            final String filterStartDate,
            final String filterStartDatetime,
            final PricePointType filterType,
            final ListAllComponentPricePointsDirection direction,
            final List<Integer> filterIds,
            final IncludeNotNull filterArchivedAt) throws IOException {
        return new ApiCall.Builder<ListComponentsPricePointsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components_price_points.json")
                        .queryParam(param -> param.key("filter[date_field]")
                                .value((filterDateField != null) ? filterDateField.value() : null).isRequired(false))
                        .queryParam(param -> param.key("filter[end_date]")
                                .value(filterEndDate).isRequired(false))
                        .queryParam(param -> param.key("filter[end_datetime]")
                                .value(filterEndDatetime).isRequired(false))
                        .queryParam(param -> param.key("include")
                                .value((include != null) ? include.value() : null).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value((page != null) ? page : 1).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value((perPage != null) ? perPage : 20).isRequired(false))
                        .queryParam(param -> param.key("filter[start_date]")
                                .value(filterStartDate).isRequired(false))
                        .queryParam(param -> param.key("filter[start_datetime]")
                                .value(filterStartDatetime).isRequired(false))
                        .queryParam(param -> param.key("filter[type]")
                                .value((filterType != null) ? filterType.value() : null).isRequired(false))
                        .queryParam(param -> param.key("direction")
                                .value((direction != null) ? direction.value() : null).isRequired(false))
                        .queryParam(param -> param.key("filter[ids]")
                                .value(filterIds).isRequired(false))
                        .queryParam(param -> param.key("filter[archived_at]")
                                .value((filterArchivedAt != null) ? filterArchivedAt.value() : null).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListComponentsPricePointsResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }
}