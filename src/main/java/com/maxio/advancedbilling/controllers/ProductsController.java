/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.maxio.advancedbilling.ApiHelper;
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.Server;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.CreateOrUpdateProductRequest;
import com.maxio.advancedbilling.models.ListProductsInput;
import com.maxio.advancedbilling.models.ProductResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;
import java.util.List;

/**
 * This class lists all the endpoints of the groups.
 */
public final class ProductsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public ProductsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Use this method to create a product within your Advanced Billing site. + [Products
     * Documentation](https://maxio.zendesk.com/hc/en-us/articles/24261090117645-Products-Overview)
     * + [Changing a Subscription's
     * Product](https://maxio.zendesk.com/hc/en-us/articles/24252069837581-Product-Changes-and-Migrations).
     * @param  productFamilyId  Required parameter: Either the product family's id or its handle
     *         prefixed with `handle:`
     * @param  body  Optional parameter: Example:
     * @return    Returns the ProductResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ProductResponse createProduct(
            final String productFamilyId,
            final CreateOrUpdateProductRequest body) throws ApiException, IOException {
        return prepareCreateProductRequest(productFamilyId, body).execute();
    }

    /**
     * Builds the ApiCall object for createProduct.
     */
    private ApiCall<ProductResponse, ApiException> prepareCreateProductRequest(
            final String productFamilyId,
            final CreateOrUpdateProductRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ProductResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/product_families/{product_family_id}/products.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId)
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
                                response -> ApiHelper.deserialize(response, ProductResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint allows you to read the current details of a product that you've created in
     * Advanced Billing.
     * @param  productId  Required parameter: The Advanced Billing id of the product
     * @return    Returns the ProductResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ProductResponse readProduct(
            final int productId) throws ApiException, IOException {
        return prepareReadProductRequest(productId).execute();
    }

    /**
     * Builds the ApiCall object for readProduct.
     */
    private ApiCall<ProductResponse, ApiException> prepareReadProductRequest(
            final int productId) throws IOException {
        return new ApiCall.Builder<ProductResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/products/{product_id}.json")
                        .templateParam(param -> param.key("product_id").value(productId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ProductResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Use this method to change aspects of an existing product. ### Input Attributes Update Notes +
     * `update_return_params` The parameters we will append to your `update_return_url`. See Return
     * URLs and Parameters ### Product Price Point Updating a product using this endpoint will
     * create a new price point and set it as the default price point for this product. If you
     * should like to update an existing product price point, that must be done separately.
     * @param  productId  Required parameter: The Advanced Billing id of the product
     * @param  body  Optional parameter: Example:
     * @return    Returns the ProductResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ProductResponse updateProduct(
            final int productId,
            final CreateOrUpdateProductRequest body) throws ApiException, IOException {
        return prepareUpdateProductRequest(productId, body).execute();
    }

    /**
     * Builds the ApiCall object for updateProduct.
     */
    private ApiCall<ProductResponse, ApiException> prepareUpdateProductRequest(
            final int productId,
            final CreateOrUpdateProductRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ProductResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/products/{product_id}.json")
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
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ProductResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Sending a DELETE request to this endpoint will archive the product. All current subscribers
     * will be unffected; their subscription/purchase will continue to be charged monthly. This will
     * restrict the option to chose the product for purchase via the Billing Portal, as well as
     * disable Public Signup Pages for the product.
     * @param  productId  Required parameter: The Advanced Billing id of the product
     * @return    Returns the ProductResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ProductResponse archiveProduct(
            final int productId) throws ApiException, IOException {
        return prepareArchiveProductRequest(productId).execute();
    }

    /**
     * Builds the ApiCall object for archiveProduct.
     */
    private ApiCall<ProductResponse, ApiException> prepareArchiveProductRequest(
            final int productId) throws IOException {
        return new ApiCall.Builder<ProductResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/products/{product_id}.json")
                        .templateParam(param -> param.key("product_id").value(productId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ProductResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This method allows to retrieve a Product object by its `api_handle`.
     * @param  apiHandle  Required parameter: The handle of the product
     * @return    Returns the ProductResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ProductResponse readProductByHandle(
            final String apiHandle) throws ApiException, IOException {
        return prepareReadProductByHandleRequest(apiHandle).execute();
    }

    /**
     * Builds the ApiCall object for readProductByHandle.
     */
    private ApiCall<ProductResponse, ApiException> prepareReadProductByHandleRequest(
            final String apiHandle) throws IOException {
        return new ApiCall.Builder<ProductResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/products/handle/{api_handle}.json")
                        .templateParam(param -> param.key("api_handle").value(apiHandle)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ProductResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This method allows to retrieve a list of Products belonging to a Site.
     * @param  input  ListProductsInput object containing request parameters
     * @return    Returns the List of ProductResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<ProductResponse> listProducts(
            final ListProductsInput input) throws ApiException, IOException {
        return prepareListProductsRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listProducts.
     */
    private ApiCall<List<ProductResponse>, ApiException> prepareListProductsRequest(
            final ListProductsInput input) throws IOException {
        return new ApiCall.Builder<List<ProductResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/products.json")
                        .queryParam(param -> param.key("date_field")
                                .value((input.getDateField() != null) ? input.getDateField().value() : null).isRequired(false))
                        .queryParam(param -> param.key("filter")
                                .value(input.getFilter()).isRequired(false))
                        .queryParam(param -> param.key("end_date")
                                .value(DateTimeHelper.toSimpleDate(input.getEndDate())).isRequired(false))
                        .queryParam(param -> param.key("end_datetime")
                                .value(DateTimeHelper.toRfc8601DateTime(input.getEndDatetime())).isRequired(false))
                        .queryParam(param -> param.key("start_date")
                                .value(DateTimeHelper.toSimpleDate(input.getStartDate())).isRequired(false))
                        .queryParam(param -> param.key("start_datetime")
                                .value(DateTimeHelper.toRfc8601DateTime(input.getStartDatetime())).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("include_archived")
                                .value(input.getIncludeArchived()).isRequired(false))
                        .queryParam(param -> param.key("include")
                                .value((input.getInclude() != null) ? input.getInclude().value() : null).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        ProductResponse[].class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}