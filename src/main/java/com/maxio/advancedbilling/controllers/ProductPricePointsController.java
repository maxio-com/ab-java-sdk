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
import com.maxio.advancedbilling.exceptions.ProductPricePointErrorResponseException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.BulkCreateProductPricePointsRequest;
import com.maxio.advancedbilling.models.BulkCreateProductPricePointsResponse;
import com.maxio.advancedbilling.models.CreateProductCurrencyPricesRequest;
import com.maxio.advancedbilling.models.CreateProductPricePointRequest;
import com.maxio.advancedbilling.models.CurrencyPricesResponse;
import com.maxio.advancedbilling.models.ListAllProductPricePointsInput;
import com.maxio.advancedbilling.models.ListProductPricePointsInput;
import com.maxio.advancedbilling.models.ListProductPricePointsResponse;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.ProductPricePointResponse;
import com.maxio.advancedbilling.models.ProductResponse;
import com.maxio.advancedbilling.models.UpdateCurrencyPricesRequest;
import com.maxio.advancedbilling.models.UpdateProductPricePointRequest;
import com.maxio.advancedbilling.models.containers.ArchiveProductPricePointPricePointId;
import com.maxio.advancedbilling.models.containers.ArchiveProductPricePointProductId;
import com.maxio.advancedbilling.models.containers.CreateProductPricePointProductId;
import com.maxio.advancedbilling.models.containers.ReadProductPricePointPricePointId;
import com.maxio.advancedbilling.models.containers.ReadProductPricePointProductId;
import com.maxio.advancedbilling.models.containers.UpdateProductPricePointPricePointId;
import com.maxio.advancedbilling.models.containers.UpdateProductPricePointProductId;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class ProductPricePointsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public ProductPricePointsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * [Product Price Point
     * Documentation](https://maxio.zendesk.com/hc/en-us/articles/24261111947789-Product-Price-Points).
     * @param  productId  Required parameter: The id or handle of the product. When using the
     *         handle, it must be prefixed with `handle:`
     * @param  body  Optional parameter: Example:
     * @return    Returns the ProductPricePointResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ProductPricePointResponse createProductPricePoint(
            final CreateProductPricePointProductId productId,
            final CreateProductPricePointRequest body) throws ApiException, IOException {
        return prepareCreateProductPricePointRequest(productId, body).execute();
    }

    /**
     * Builds the ApiCall object for createProductPricePoint.
     */
    private ApiCall<ProductPricePointResponse, ApiException> prepareCreateProductPricePointRequest(
            final CreateProductPricePointProductId productId,
            final CreateProductPricePointRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ProductPricePointResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/products/{product_id}/price_points.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("product_id").value(productId)
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
                                response -> ApiHelper.deserialize(response, ProductPricePointResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ProductPricePointErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Use this endpoint to retrieve a list of product price points.
     * @param  input  ListProductPricePointsInput object containing request parameters
     * @return    Returns the ListProductPricePointsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListProductPricePointsResponse listProductPricePoints(
            final ListProductPricePointsInput input) throws ApiException, IOException {
        return prepareListProductPricePointsRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listProductPricePoints.
     */
    private ApiCall<ListProductPricePointsResponse, ApiException> prepareListProductPricePointsRequest(
            final ListProductPricePointsInput input) throws IOException {
        return new ApiCall.Builder<ListProductPricePointsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/products/{product_id}/price_points.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("currency_prices")
                                .value(input.getCurrencyPrices()).isRequired(false))
                        .queryParam(param -> param.key("filter[type]")
                                .value(PricePointType.toValue(input.getFilterType())).isRequired(false))
                        .queryParam(param -> param.key("archived")
                                .value(input.getArchived()).isRequired(false))
                        .templateParam(param -> param.key("product_id").value(input.getProductId())
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListProductPricePointsResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Use this endpoint to update a product price point. Note: Custom product price points are not
     * able to be updated.
     * @param  productId  Required parameter: The id or handle of the product. When using the
     *         handle, it must be prefixed with `handle:`. Example: `123` for an integer ID, or
     *         `handle:example-product-handle` for a string handle.
     * @param  pricePointId  Required parameter: The id or handle of the price point. When using the
     *         handle, it must be prefixed with `handle:`. Example: `123` for an integer ID, or
     *         `handle:example-product-price-point-handle` for a string handle.
     * @param  body  Optional parameter: Example:
     * @return    Returns the ProductPricePointResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ProductPricePointResponse updateProductPricePoint(
            final UpdateProductPricePointProductId productId,
            final UpdateProductPricePointPricePointId pricePointId,
            final UpdateProductPricePointRequest body) throws ApiException, IOException {
        return prepareUpdateProductPricePointRequest(productId, pricePointId, body).execute();
    }

    /**
     * Builds the ApiCall object for updateProductPricePoint.
     */
    private ApiCall<ProductPricePointResponse, ApiException> prepareUpdateProductPricePointRequest(
            final UpdateProductPricePointProductId productId,
            final UpdateProductPricePointPricePointId pricePointId,
            final UpdateProductPricePointRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ProductPricePointResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/products/{product_id}/price_points/{price_point_id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("product_id").value(productId)
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
                                response -> ApiHelper.deserialize(response, ProductPricePointResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Use this endpoint to retrieve details for a specific product price point. You can achieve
     * this by using either the product price point ID or handle.
     * @param  productId  Required parameter: The id or handle of the product. When using the
     *         handle, it must be prefixed with `handle:`. Example: `123` for an integer ID, or
     *         `handle:example-product-handle` for a string handle.
     * @param  pricePointId  Required parameter: The id or handle of the price point. When using the
     *         handle, it must be prefixed with `handle:`. Example: `123` for an integer ID, or
     *         `handle:example-product-price-point-handle` for a string handle.
     * @param  currencyPrices  Optional parameter: When fetching a product's price points, if you
     *         have defined multiple currencies at the site level, you can optionally pass the
     *         ?currency_prices=true query param to include an array of currency price data in the
     *         response. If the product price point is set to use_site_exchange_rate: true, it will
     *         return pricing based on the current exchange rate. If the flag is set to false, it
     *         will return all of the defined prices for each currency.
     * @return    Returns the ProductPricePointResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ProductPricePointResponse readProductPricePoint(
            final ReadProductPricePointProductId productId,
            final ReadProductPricePointPricePointId pricePointId,
            final Boolean currencyPrices) throws ApiException, IOException {
        return prepareReadProductPricePointRequest(productId, pricePointId,
                currencyPrices).execute();
    }

    /**
     * Builds the ApiCall object for readProductPricePoint.
     */
    private ApiCall<ProductPricePointResponse, ApiException> prepareReadProductPricePointRequest(
            final ReadProductPricePointProductId productId,
            final ReadProductPricePointPricePointId pricePointId,
            final Boolean currencyPrices) throws IOException {
        return new ApiCall.Builder<ProductPricePointResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/products/{product_id}/price_points/{price_point_id}.json")
                        .queryParam(param -> param.key("currency_prices")
                                .value(currencyPrices).isRequired(false))
                        .templateParam(param -> param.key("product_id").value(productId)
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
                                response -> ApiHelper.deserialize(response, ProductPricePointResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Use this endpoint to archive a product price point.
     * @param  productId  Required parameter: The id or handle of the product. When using the
     *         handle, it must be prefixed with `handle:`. Example: `123` for an integer ID, or
     *         `handle:example-product-handle` for a string handle.
     * @param  pricePointId  Required parameter: The id or handle of the price point. When using the
     *         handle, it must be prefixed with `handle:`. Example: `123` for an integer ID, or
     *         `handle:example-product-price-point-handle` for a string handle.
     * @return    Returns the ProductPricePointResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ProductPricePointResponse archiveProductPricePoint(
            final ArchiveProductPricePointProductId productId,
            final ArchiveProductPricePointPricePointId pricePointId) throws ApiException, IOException {
        return prepareArchiveProductPricePointRequest(productId, pricePointId).execute();
    }

    /**
     * Builds the ApiCall object for archiveProductPricePoint.
     */
    private ApiCall<ProductPricePointResponse, ApiException> prepareArchiveProductPricePointRequest(
            final ArchiveProductPricePointProductId productId,
            final ArchiveProductPricePointPricePointId pricePointId) throws IOException {
        return new ApiCall.Builder<ProductPricePointResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/products/{product_id}/price_points/{price_point_id}.json")
                        .templateParam(param -> param.key("product_id").value(productId)
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
                                response -> ApiHelper.deserialize(response, ProductPricePointResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Use this endpoint to unarchive an archived product price point.
     * @param  productId  Required parameter: The Advanced Billing id of the product to which the
     *         price point belongs
     * @param  pricePointId  Required parameter: The Advanced Billing id of the product price point
     * @return    Returns the ProductPricePointResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ProductPricePointResponse unarchiveProductPricePoint(
            final int productId,
            final int pricePointId) throws ApiException, IOException {
        return prepareUnarchiveProductPricePointRequest(productId, pricePointId).execute();
    }

    /**
     * Builds the ApiCall object for unarchiveProductPricePoint.
     */
    private ApiCall<ProductPricePointResponse, ApiException> prepareUnarchiveProductPricePointRequest(
            final int productId,
            final int pricePointId) throws IOException {
        return new ApiCall.Builder<ProductPricePointResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/products/{product_id}/price_points/{price_point_id}/unarchive.json")
                        .templateParam(param -> param.key("product_id").value(productId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.PATCH))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ProductPricePointResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Use this endpoint to make a product price point the default for the product. Note: Custom
     * product price points are not able to be set as the default for a product.
     * @param  productId  Required parameter: The Advanced Billing id of the product to which the
     *         price point belongs
     * @param  pricePointId  Required parameter: The Advanced Billing id of the product price point
     * @return    Returns the ProductResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ProductResponse promoteProductPricePointToDefault(
            final int productId,
            final int pricePointId) throws ApiException, IOException {
        return preparePromoteProductPricePointToDefaultRequest(productId, pricePointId).execute();
    }

    /**
     * Builds the ApiCall object for promoteProductPricePointToDefault.
     */
    private ApiCall<ProductResponse, ApiException> preparePromoteProductPricePointToDefaultRequest(
            final int productId,
            final int pricePointId) throws IOException {
        return new ApiCall.Builder<ProductResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/products/{product_id}/price_points/{price_point_id}/default.json")
                        .templateParam(param -> param.key("product_id").value(productId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.PATCH))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ProductResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Use this endpoint to create multiple product price points in one request.
     * @param  productId  Required parameter: The Advanced Billing id of the product to which the
     *         price points belong
     * @param  body  Optional parameter: Example:
     * @return    Returns the BulkCreateProductPricePointsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BulkCreateProductPricePointsResponse bulkCreateProductPricePoints(
            final int productId,
            final BulkCreateProductPricePointsRequest body) throws ApiException, IOException {
        return prepareBulkCreateProductPricePointsRequest(productId, body).execute();
    }

    /**
     * Builds the ApiCall object for bulkCreateProductPricePoints.
     */
    private ApiCall<BulkCreateProductPricePointsResponse, ApiException> prepareBulkCreateProductPricePointsRequest(
            final int productId,
            final BulkCreateProductPricePointsRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<BulkCreateProductPricePointsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/products/{product_id}/price_points/bulk.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("product_id").value(productId).isRequired(false)
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
                                response -> ApiHelper.deserialize(response, BulkCreateProductPricePointsResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint allows you to create currency prices for a given currency that has been defined
     * on the site level in your settings. When creating currency prices, they need to mirror the
     * structure of your primary pricing. If the product price point defines a trial and/or setup
     * fee, each currency must also define a trial and/or setup fee. Note: Currency Prices are not
     * able to be created for custom product price points.
     * @param  productPricePointId  Required parameter: The Advanced Billing id of the product price
     *         point
     * @param  body  Optional parameter: Example:
     * @return    Returns the CurrencyPricesResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CurrencyPricesResponse createProductCurrencyPrices(
            final int productPricePointId,
            final CreateProductCurrencyPricesRequest body) throws ApiException, IOException {
        return prepareCreateProductCurrencyPricesRequest(productPricePointId, body).execute();
    }

    /**
     * Builds the ApiCall object for createProductCurrencyPrices.
     */
    private ApiCall<CurrencyPricesResponse, ApiException> prepareCreateProductCurrencyPricesRequest(
            final int productPricePointId,
            final CreateProductCurrencyPricesRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<CurrencyPricesResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/product_price_points/{product_price_point_id}/currency_prices.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("product_price_point_id").value(productPricePointId).isRequired(false)
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
                                response -> ApiHelper.deserialize(response, CurrencyPricesResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorArrayMapResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint allows you to update the `price`s of currency prices for a given currency that
     * exists on the product price point. When updating the pricing, it needs to mirror the
     * structure of your primary pricing. If the product price point defines a trial and/or setup
     * fee, each currency must also define a trial and/or setup fee. Note: Currency Prices are not
     * able to be updated for custom product price points.
     * @param  productPricePointId  Required parameter: The Advanced Billing id of the product price
     *         point
     * @param  body  Optional parameter: Example:
     * @return    Returns the CurrencyPricesResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CurrencyPricesResponse updateProductCurrencyPrices(
            final int productPricePointId,
            final UpdateCurrencyPricesRequest body) throws ApiException, IOException {
        return prepareUpdateProductCurrencyPricesRequest(productPricePointId, body).execute();
    }

    /**
     * Builds the ApiCall object for updateProductCurrencyPrices.
     */
    private ApiCall<CurrencyPricesResponse, ApiException> prepareUpdateProductCurrencyPricesRequest(
            final int productPricePointId,
            final UpdateCurrencyPricesRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<CurrencyPricesResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/product_price_points/{product_price_point_id}/currency_prices.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("product_price_point_id").value(productPricePointId).isRequired(false)
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
                                response -> ApiHelper.deserialize(response, CurrencyPricesResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorArrayMapResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This method allows retrieval of a list of Products Price Points belonging to a Site.
     * @param  input  ListAllProductPricePointsInput object containing request parameters
     * @return    Returns the ListProductPricePointsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListProductPricePointsResponse listAllProductPricePoints(
            final ListAllProductPricePointsInput input) throws ApiException, IOException {
        return prepareListAllProductPricePointsRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listAllProductPricePoints.
     */
    private ApiCall<ListProductPricePointsResponse, ApiException> prepareListAllProductPricePointsRequest(
            final ListAllProductPricePointsInput input) throws IOException {
        return new ApiCall.Builder<ListProductPricePointsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/products_price_points.json")
                        .queryParam(param -> param.key("direction")
                                .value((input.getDirection() != null) ? input.getDirection().value() : null).isRequired(false))
                        .queryParam(param -> param.key("filter")
                                .value(input.getFilter()).isRequired(false))
                        .queryParam(param -> param.key("include")
                                .value((input.getInclude() != null) ? input.getInclude().value() : null).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListProductPricePointsResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}