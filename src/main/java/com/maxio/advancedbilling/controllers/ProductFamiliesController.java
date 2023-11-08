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
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.CreateProductFamilyRequest;
import com.maxio.advancedbilling.models.ListProductFamiliesInput;
import com.maxio.advancedbilling.models.ListProductsForProductFamilyInput;
import com.maxio.advancedbilling.models.ProductFamilyResponse;
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
public final class ProductFamiliesController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public ProductFamiliesController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This method allows to retrieve a list of Products belonging to a Product Family.
     * @param  input  ListProductsForProductFamilyInput object containing request parameters
     * @return    Returns the List of ProductResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<ProductResponse> listProductsForProductFamily(
            final ListProductsForProductFamilyInput input) throws ApiException, IOException {
        return prepareListProductsForProductFamilyRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listProductsForProductFamily.
     */
    private ApiCall<List<ProductResponse>, ApiException> prepareListProductsForProductFamilyRequest(
            final ListProductsForProductFamilyInput input) throws IOException {
        return new ApiCall.Builder<List<ProductResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/product_families/{product_family_id}/products.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
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
                        .queryParam(param -> param.key("include_archived")
                                .value(input.getIncludeArchived()).isRequired(false))
                        .queryParam(param -> param.key("include")
                                .value((input.getInclude() != null) ? input.getInclude().value() : null).isRequired(false))
                        .queryParam(param -> param.key("filter[prepaid_product_price_point][product_price_point_id]")
                                .value((input.getFilterPrepaidProductPricePointProductPricePointId() != null) ? input.getFilterPrepaidProductPricePointProductPricePointId().value() : null).isRequired(false))
                        .queryParam(param -> param.key("filter[use_site_exchange_rate]")
                                .value(input.getFilterUseSiteExchangeRate()).isRequired(false))
                        .templateParam(param -> param.key("product_family_id").value(input.getProductFamilyId()).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        ProductResponse[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This method will create a Product Family within your Chargify site. Create a Product Family
     * to act as a container for your products, components and coupons. Full documentation on how
     * Product Families operate within the Chargify UI can be located
     * [here](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405369633421).
     * @param  body  Optional parameter: Example:
     * @return    Returns the ProductFamilyResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ProductFamilyResponse createProductFamily(
            final CreateProductFamilyRequest body) throws ApiException, IOException {
        return prepareCreateProductFamilyRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for createProductFamily.
     */
    private ApiCall<ProductFamilyResponse, ApiException> prepareCreateProductFamilyRequest(
            final CreateProductFamilyRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ProductFamilyResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/product_families.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ProductFamilyResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This method allows to retrieve a list of Product Families for a site.
     * @param  input  ListProductFamiliesInput object containing request parameters
     * @return    Returns the List of ProductFamilyResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<ProductFamilyResponse> listProductFamilies(
            final ListProductFamiliesInput input) throws ApiException, IOException {
        return prepareListProductFamiliesRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listProductFamilies.
     */
    private ApiCall<List<ProductFamilyResponse>, ApiException> prepareListProductFamiliesRequest(
            final ListProductFamiliesInput input) throws IOException {
        return new ApiCall.Builder<List<ProductFamilyResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/product_families.json")
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
                                        ProductFamilyResponse[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This method allows to retrieve a Product Family via the `product_family_id`. The response
     * will contain a Product Family object. The product family can be specified either with the id
     * number, or with the `handle:my-family` format.
     * @param  id  Required parameter: The Chargify id of the product family
     * @return    Returns the ProductFamilyResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ProductFamilyResponse readProductFamily(
            final int id) throws ApiException, IOException {
        return prepareReadProductFamilyRequest(id).execute();
    }

    /**
     * Builds the ApiCall object for readProductFamily.
     */
    private ApiCall<ProductFamilyResponse, ApiException> prepareReadProductFamilyRequest(
            final int id) throws IOException {
        return new ApiCall.Builder<ProductFamilyResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/product_families/{id}.json")
                        .templateParam(param -> param.key("id").value(id).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ProductFamilyResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }
}