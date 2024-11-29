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
import com.maxio.advancedbilling.exceptions.ErrorArrayMapResponseException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.ComponentCurrencyPricesResponse;
import com.maxio.advancedbilling.models.ComponentPricePointResponse;
import com.maxio.advancedbilling.models.ComponentPricePointsResponse;
import com.maxio.advancedbilling.models.ComponentResponse;
import com.maxio.advancedbilling.models.CreateComponentPricePointRequest;
import com.maxio.advancedbilling.models.CreateComponentPricePointsRequest;
import com.maxio.advancedbilling.models.CreateCurrencyPricesRequest;
import com.maxio.advancedbilling.models.ListAllComponentPricePointsInput;
import com.maxio.advancedbilling.models.ListComponentPricePointsInput;
import com.maxio.advancedbilling.models.ListComponentsPricePointsResponse;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.UpdateComponentPricePointRequest;
import com.maxio.advancedbilling.models.UpdateCurrencyPricesRequest;
import com.maxio.advancedbilling.models.containers.ArchiveComponentPricePointComponentId;
import com.maxio.advancedbilling.models.containers.ArchiveComponentPricePointPricePointId;
import com.maxio.advancedbilling.models.containers.ReadComponentPricePointComponentId;
import com.maxio.advancedbilling.models.containers.ReadComponentPricePointPricePointId;
import com.maxio.advancedbilling.models.containers.UpdateComponentPricePointComponentId;
import com.maxio.advancedbilling.models.containers.UpdateComponentPricePointPricePointId;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class ComponentPricePointsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public ComponentPricePointsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Sets a new default price point for the component. This new default will apply to all new
     * subscriptions going forward - existing subscriptions will remain on their current price
     * point. See [Price Points
     * Documentation](https://maxio.zendesk.com/hc/en-us/articles/24261191737101-Price-Points-Components)
     * for more information on price points and moving subscriptions between price points. Note:
     * Custom price points are not able to be set as the default for a component.
     * @param  componentId  Required parameter: The Advanced Billing id of the component to which
     *         the price point belongs
     * @param  pricePointId  Required parameter: The Advanced Billing id of the price point
     * @return    Returns the ComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentResponse promoteComponentPricePointToDefault(
            final int componentId,
            final int pricePointId) throws ApiException, IOException {
        return preparePromoteComponentPricePointToDefaultRequest(componentId,
                pricePointId).execute();
    }

    /**
     * Builds the ApiCall object for promoteComponentPricePointToDefault.
     */
    private ApiCall<ComponentResponse, ApiException> preparePromoteComponentPricePointToDefaultRequest(
            final int componentId,
            final int pricePointId) throws IOException {
        return new ApiCall.Builder<ComponentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/components/{component_id}/price_points/{price_point_id}/default.json")
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint can be used to create a new price point for an existing component.
     * @param  componentId  Required parameter: The Advanced Billing id of the component
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
                        .server(Server.PRODUCTION.value())
                        .path("/components/{component_id}/price_points.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
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
                                response -> ApiHelper.deserialize(response, ComponentPricePointResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorArrayMapResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
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
     * @param  input  ListComponentPricePointsInput object containing request parameters
     * @return    Returns the ComponentPricePointsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentPricePointsResponse listComponentPricePoints(
            final ListComponentPricePointsInput input) throws ApiException, IOException {
        return prepareListComponentPricePointsRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listComponentPricePoints.
     */
    private ApiCall<ComponentPricePointsResponse, ApiException> prepareListComponentPricePointsRequest(
            final ListComponentPricePointsInput input) throws IOException {
        return new ApiCall.Builder<ComponentPricePointsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/components/{component_id}/price_points.json")
                        .queryParam(param -> param.key("currency_prices")
                                .value(input.getCurrencyPrices()).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("filter[type]")
                                .value(PricePointType.toValue(input.getFilterType())).isRequired(false))
                        .templateParam(param -> param.key("component_id").value(input.getComponentId()).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentPricePointsResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Use this endpoint to create multiple component price points in one request.
     * @param  componentId  Required parameter: The Advanced Billing id of the component for which
     *         you want to fetch price points.
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentPricePointsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentPricePointsResponse bulkCreateComponentPricePoints(
            final String componentId,
            final CreateComponentPricePointsRequest body) throws ApiException, IOException {
        return prepareBulkCreateComponentPricePointsRequest(componentId, body).execute();
    }

    /**
     * Builds the ApiCall object for bulkCreateComponentPricePoints.
     */
    private ApiCall<ComponentPricePointsResponse, ApiException> prepareBulkCreateComponentPricePointsRequest(
            final String componentId,
            final CreateComponentPricePointsRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentPricePointsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/components/{component_id}/price_points/bulk.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("component_id").value(componentId)
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
                                response -> ApiHelper.deserialize(response, ComponentPricePointsResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * When updating a price point, it's prices can be updated as well by creating new prices or
     * editing / removing existing ones. Passing in a price bracket without an `id` will attempt to
     * create a new price. Including an `id` will update the corresponding price, and including the
     * `_destroy` flag set to true along with the `id` will remove that price. Note: Custom price
     * points cannot be updated directly. They must be edited through the Subscription.
     * @param  componentId  Required parameter: The id or handle of the component. When using the
     *         handle, it must be prefixed with `handle:`. Example: `123` for an integer ID, or
     *         `handle:example-product-handle` for a string handle.
     * @param  pricePointId  Required parameter: The id or handle of the price point. When using the
     *         handle, it must be prefixed with `handle:`. Example: `123` for an integer ID, or
     *         `handle:example-price_point-handle` for a string handle.
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentPricePointResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentPricePointResponse updateComponentPricePoint(
            final UpdateComponentPricePointComponentId componentId,
            final UpdateComponentPricePointPricePointId pricePointId,
            final UpdateComponentPricePointRequest body) throws ApiException, IOException {
        return prepareUpdateComponentPricePointRequest(componentId, pricePointId, body).execute();
    }

    /**
     * Builds the ApiCall object for updateComponentPricePoint.
     */
    private ApiCall<ComponentPricePointResponse, ApiException> prepareUpdateComponentPricePointRequest(
            final UpdateComponentPricePointComponentId componentId,
            final UpdateComponentPricePointPricePointId pricePointId,
            final UpdateComponentPricePointRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentPricePointResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/components/{component_id}/price_points/{price_point_id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("component_id").value(componentId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId)
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
                                response -> ApiHelper.deserialize(response, ComponentPricePointResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorArrayMapResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Use this endpoint to retrieve details for a specific component price point. You can achieve
     * this by using either the component price point ID or handle.
     * @param  componentId  Required parameter: The id or handle of the component. When using the
     *         handle, it must be prefixed with `handle:`. Example: `123` for an integer ID, or
     *         `handle:example-product-handle` for a string handle.
     * @param  pricePointId  Required parameter: The id or handle of the price point. When using the
     *         handle, it must be prefixed with `handle:`. Example: `123` for an integer ID, or
     *         `handle:example-price_point-handle` for a string handle.
     * @param  currencyPrices  Optional parameter: Include an array of currency price data
     * @return    Returns the ComponentPricePointResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentPricePointResponse readComponentPricePoint(
            final ReadComponentPricePointComponentId componentId,
            final ReadComponentPricePointPricePointId pricePointId,
            final Boolean currencyPrices) throws ApiException, IOException {
        return prepareReadComponentPricePointRequest(componentId, pricePointId,
                currencyPrices).execute();
    }

    /**
     * Builds the ApiCall object for readComponentPricePoint.
     */
    private ApiCall<ComponentPricePointResponse, ApiException> prepareReadComponentPricePointRequest(
            final ReadComponentPricePointComponentId componentId,
            final ReadComponentPricePointPricePointId pricePointId,
            final Boolean currencyPrices) throws IOException {
        return new ApiCall.Builder<ComponentPricePointResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/components/{component_id}/price_points/{price_point_id}.json")
                        .queryParam(param -> param.key("currency_prices")
                                .value(currencyPrices).isRequired(false))
                        .templateParam(param -> param.key("component_id").value(componentId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentPricePointResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * A price point can be archived at any time. Subscriptions using a price point that has been
     * archived will continue using it until they're moved to another price point.
     * @param  componentId  Required parameter: The id or handle of the component. When using the
     *         handle, it must be prefixed with `handle:`. Example: `123` for an integer ID, or
     *         `handle:example-product-handle` for a string handle.
     * @param  pricePointId  Required parameter: The id or handle of the price point. When using the
     *         handle, it must be prefixed with `handle:`. Example: `123` for an integer ID, or
     *         `handle:example-price_point-handle` for a string handle.
     * @return    Returns the ComponentPricePointResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentPricePointResponse archiveComponentPricePoint(
            final ArchiveComponentPricePointComponentId componentId,
            final ArchiveComponentPricePointPricePointId pricePointId) throws ApiException, IOException {
        return prepareArchiveComponentPricePointRequest(componentId, pricePointId).execute();
    }

    /**
     * Builds the ApiCall object for archiveComponentPricePoint.
     */
    private ApiCall<ComponentPricePointResponse, ApiException> prepareArchiveComponentPricePointRequest(
            final ArchiveComponentPricePointComponentId componentId,
            final ArchiveComponentPricePointPricePointId pricePointId) throws IOException {
        return new ApiCall.Builder<ComponentPricePointResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/components/{component_id}/price_points/{price_point_id}.json")
                        .templateParam(param -> param.key("component_id").value(componentId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentPricePointResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Use this endpoint to unarchive a component price point.
     * @param  componentId  Required parameter: The Advanced Billing id of the component to which
     *         the price point belongs
     * @param  pricePointId  Required parameter: The Advanced Billing id of the price point
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
                        .server(Server.PRODUCTION.value())
                        .path("/components/{component_id}/price_points/{price_point_id}/unarchive.json")
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentPricePointResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint allows you to create currency prices for a given currency that has been defined
     * on the site level in your settings. When creating currency prices, they need to mirror the
     * structure of your primary pricing. For each price level defined on the component price point,
     * there should be a matching price level created in the given currency. Note: Currency Prices
     * are not able to be created for custom price points.
     * @param  pricePointId  Required parameter: The Advanced Billing id of the price point
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentCurrencyPricesResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentCurrencyPricesResponse createCurrencyPrices(
            final int pricePointId,
            final CreateCurrencyPricesRequest body) throws ApiException, IOException {
        return prepareCreateCurrencyPricesRequest(pricePointId, body).execute();
    }

    /**
     * Builds the ApiCall object for createCurrencyPrices.
     */
    private ApiCall<ComponentCurrencyPricesResponse, ApiException> prepareCreateCurrencyPricesRequest(
            final int pricePointId,
            final CreateCurrencyPricesRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentCurrencyPricesResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/price_points/{price_point_id}/currency_prices.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId).isRequired(false)
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
                                response -> ApiHelper.deserialize(response, ComponentCurrencyPricesResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorArrayMapResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint allows you to update currency prices for a given currency that has been defined
     * on the site level in your settings. Note: Currency Prices are not able to be updated for
     * custom price points.
     * @param  pricePointId  Required parameter: The Advanced Billing id of the price point
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentCurrencyPricesResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentCurrencyPricesResponse updateCurrencyPrices(
            final int pricePointId,
            final UpdateCurrencyPricesRequest body) throws ApiException, IOException {
        return prepareUpdateCurrencyPricesRequest(pricePointId, body).execute();
    }

    /**
     * Builds the ApiCall object for updateCurrencyPrices.
     */
    private ApiCall<ComponentCurrencyPricesResponse, ApiException> prepareUpdateCurrencyPricesRequest(
            final int pricePointId,
            final UpdateCurrencyPricesRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentCurrencyPricesResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/price_points/{price_point_id}/currency_prices.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId).isRequired(false)
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
                                response -> ApiHelper.deserialize(response, ComponentCurrencyPricesResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorArrayMapResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This method allows to retrieve a list of Components Price Points belonging to a Site.
     * @param  input  ListAllComponentPricePointsInput object containing request parameters
     * @return    Returns the ListComponentsPricePointsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListComponentsPricePointsResponse listAllComponentPricePoints(
            final ListAllComponentPricePointsInput input) throws ApiException, IOException {
        return prepareListAllComponentPricePointsRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listAllComponentPricePoints.
     */
    private ApiCall<ListComponentsPricePointsResponse, ApiException> prepareListAllComponentPricePointsRequest(
            final ListAllComponentPricePointsInput input) throws IOException {
        return new ApiCall.Builder<ListComponentsPricePointsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/components_price_points.json")
                        .queryParam(param -> param.key("include")
                                .value((input.getInclude() != null) ? input.getInclude().value() : null).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("direction")
                                .value((input.getDirection() != null) ? input.getDirection().value() : null).isRequired(false))
                        .queryParam(param -> param.key("filter")
                                .value(input.getFilter()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListComponentsPricePointsResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}