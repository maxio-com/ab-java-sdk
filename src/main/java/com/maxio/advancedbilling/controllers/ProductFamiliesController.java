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
import com.maxio.advancedbilling.models.BasicDateField;
import com.maxio.advancedbilling.models.CreateProductFamilyRequest;
import com.maxio.advancedbilling.models.IncludeNotNull;
import com.maxio.advancedbilling.models.ListProductsInclude;
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
     * @param  productFamilyId  Required parameter: The Chargify id of the product family to which
     *         the product belongs
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
     *         search. Use in query: `date_field=created_at`.
     * @param  startDate  Optional parameter: The start date (format YYYY-MM-DD) with which to
     *         filter the date_field. Returns products with a timestamp at or after midnight
     *         (12:00:00 AM) in your site’s time zone on the date specified.
     * @param  endDate  Optional parameter: The end date (format YYYY-MM-DD) with which to filter
     *         the date_field. Returns products with a timestamp up to and including 11:59:59PM in
     *         your site’s time zone on the date specified.
     * @param  startDatetime  Optional parameter: The start date and time (format YYYY-MM-DD
     *         HH:MM:SS) with which to filter the date_field. Returns products with a timestamp at
     *         or after exact time provided in query. You can specify timezone in query - otherwise
     *         your site's time zone will be used. If provided, this parameter will be used instead
     *         of start_date.
     * @param  endDatetime  Optional parameter: The end date and time (format YYYY-MM-DD HH:MM:SS)
     *         with which to filter the date_field. Returns products with a timestamp at or before
     *         exact time provided in query. You can specify timezone in query - otherwise your
     *         site's time zone will be used. If provided, this parameter will be used instead of
     *         end_date.
     * @param  includeArchived  Optional parameter: Include archived products
     * @param  include  Optional parameter: Allows including additional data in the response. Use in
     *         query `include=prepaid_product_price_point`.
     * @param  filterPrepaidProductPricePointProductPricePointId  Optional parameter: Allows
     *         fetching products only if a prepaid product price point is present or not. To use
     *         this filter you also have to include the following param in the request
     *         `include=prepaid_product_price_point`. Use in query
     *         `filter[prepaid_product_price_point][product_price_point_id]=not_null`.
     * @param  filterUseSiteExchangeRate  Optional parameter: Allows fetching products with matching
     *         use_site_exchange_rate based on provided value (refers to default price point). Use
     *         in query `filter[use_site_exchange_rate]=true`.
     * @return    Returns the List of ProductResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<ProductResponse> listProductsForProductFamily(
            final int productFamilyId,
            final Integer page,
            final Integer perPage,
            final BasicDateField dateField,
            final String startDate,
            final String endDate,
            final String startDatetime,
            final String endDatetime,
            final Boolean includeArchived,
            final ListProductsInclude include,
            final IncludeNotNull filterPrepaidProductPricePointProductPricePointId,
            final Boolean filterUseSiteExchangeRate) throws ApiException, IOException {
        return prepareListProductsForProductFamilyRequest(productFamilyId, page, perPage, dateField,
                startDate, endDate, startDatetime, endDatetime, includeArchived, include,
                filterPrepaidProductPricePointProductPricePointId,
                filterUseSiteExchangeRate).execute();
    }

    /**
     * Builds the ApiCall object for listProductsForProductFamily.
     */
    private ApiCall<List<ProductResponse>, ApiException> prepareListProductsForProductFamilyRequest(
            final int productFamilyId,
            final Integer page,
            final Integer perPage,
            final BasicDateField dateField,
            final String startDate,
            final String endDate,
            final String startDatetime,
            final String endDatetime,
            final Boolean includeArchived,
            final ListProductsInclude include,
            final IncludeNotNull filterPrepaidProductPricePointProductPricePointId,
            final Boolean filterUseSiteExchangeRate) throws IOException {
        return new ApiCall.Builder<List<ProductResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/product_families/{product_family_id}/products.json")
                        .queryParam(param -> param.key("page")
                                .value((page != null) ? page : 1).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value((perPage != null) ? perPage : 20).isRequired(false))
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
                        .queryParam(param -> param.key("include")
                                .value((include != null) ? include.value() : null).isRequired(false))
                        .queryParam(param -> param.key("filter[prepaid_product_price_point][product_price_point_id]")
                                .value((filterPrepaidProductPricePointProductPricePointId != null) ? filterPrepaidProductPricePointProductPricePointId.value() : null).isRequired(false))
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
                                        ProductResponse[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
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
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * This method allows to retrieve a list of Product Families for a site.
     * @param  dateField  Optional parameter: The type of filter you would like to apply to your
     *         search. Use in query: `date_field=created_at`.
     * @param  startDate  Optional parameter: The start date (format YYYY-MM-DD) with which to
     *         filter the date_field. Returns products with a timestamp at or after midnight
     *         (12:00:00 AM) in your site’s time zone on the date specified.
     * @param  endDate  Optional parameter: The end date (format YYYY-MM-DD) with which to filter
     *         the date_field. Returns products with a timestamp up to and including 11:59:59PM in
     *         your site’s time zone on the date specified.
     * @param  startDatetime  Optional parameter: The start date and time (format YYYY-MM-DD
     *         HH:MM:SS) with which to filter the date_field. Returns products with a timestamp at
     *         or after exact time provided in query. You can specify timezone in query - otherwise
     *         your site's time zone will be used. If provided, this parameter will be used instead
     *         of start_date.
     * @param  endDatetime  Optional parameter: The end date and time (format YYYY-MM-DD HH:MM:SS)
     *         with which to filter the date_field. Returns products with a timestamp at or before
     *         exact time provided in query. You can specify timezone in query - otherwise your
     *         site's time zone will be used. If provided, this parameter will be used instead of
     *         end_date.
     * @return    Returns the List of ProductFamilyResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<ProductFamilyResponse> listProductFamilies(
            final BasicDateField dateField,
            final String startDate,
            final String endDate,
            final String startDatetime,
            final String endDatetime) throws ApiException, IOException {
        return prepareListProductFamiliesRequest(dateField, startDate, endDate, startDatetime,
                endDatetime).execute();
    }

    /**
     * Builds the ApiCall object for listProductFamilies.
     */
    private ApiCall<List<ProductFamilyResponse>, ApiException> prepareListProductFamiliesRequest(
            final BasicDateField dateField,
            final String startDate,
            final String endDate,
            final String startDatetime,
            final String endDatetime) throws IOException {
        return new ApiCall.Builder<List<ProductFamilyResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/product_families.json")
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
                                        ProductFamilyResponse[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
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
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }
}