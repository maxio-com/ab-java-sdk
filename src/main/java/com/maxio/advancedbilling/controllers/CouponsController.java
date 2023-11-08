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
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.CouponCurrency;
import com.maxio.advancedbilling.models.CouponCurrencyRequest;
import com.maxio.advancedbilling.models.CouponResponse;
import com.maxio.advancedbilling.models.CouponSubcodes;
import com.maxio.advancedbilling.models.CouponSubcodesResponse;
import com.maxio.advancedbilling.models.CouponUsage;
import com.maxio.advancedbilling.models.ListCouponSubcodesInput;
import com.maxio.advancedbilling.models.ListCouponsForProductFamilyInput;
import com.maxio.advancedbilling.models.ListCouponsInput;
import com.maxio.advancedbilling.models.containers.CreateCouponBody;
import com.maxio.advancedbilling.models.containers.UpdateCouponBody;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;
import java.util.List;

/**
 * This class lists all the endpoints of the groups.
 */
public final class CouponsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public CouponsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * ## Coupons Documentation Coupons can be administered in the Chargify application or created
     * via API. Please view our section on [creating
     * coupons](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404742830733) for more
     * information. Additionally, for documentation on how to apply a coupon to a subscription
     * within the Chargify UI, please see our documentation
     * [here](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404761012877). ## Create Coupon
     * This request will create a coupon, based on the provided information. When creating a coupon,
     * you must specify a product family using the `product_family_id`. If no `product_family_id` is
     * passed, the first product family available is used. You will also need to formulate your URL
     * to cite the Product Family ID in your request. You can restrict a coupon to only apply to
     * specific products / components by optionally passing in hashes of `restricted_products`
     * and/or `restricted_components` in the format: `{ "&lt;product/component_id&gt;": boolean_value }`.
     * @param  productFamilyId  Required parameter: The Chargify id of the product family to which
     *         the coupon belongs
     * @param  body  Optional parameter: Example:
     * @return    Returns the CouponResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CouponResponse createCoupon(
            final int productFamilyId,
            final CreateCouponBody body) throws ApiException, IOException {
        return prepareCreateCouponRequest(productFamilyId, body).execute();
    }

    /**
     * Builds the ApiCall object for createCoupon.
     */
    private ApiCall<CouponResponse, ApiException> prepareCreateCouponRequest(
            final int productFamilyId,
            final CreateCouponBody body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<CouponResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/product_families/{product_family_id}/coupons.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serializeTypeCombinator(body))
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CouponResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * List coupons for a specific Product Family in a Site. If the coupon is set to
     * `use_site_exchange_rate: true`, it will return pricing based on the current exchange rate. If
     * the flag is set to false, it will return all of the defined prices for each currency.
     * @param  input  ListCouponsForProductFamilyInput object containing request parameters
     * @return    Returns the List of CouponResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<CouponResponse> listCouponsForProductFamily(
            final ListCouponsForProductFamilyInput input) throws ApiException, IOException {
        return prepareListCouponsForProductFamilyRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listCouponsForProductFamily.
     */
    private ApiCall<List<CouponResponse>, ApiException> prepareListCouponsForProductFamilyRequest(
            final ListCouponsForProductFamilyInput input) throws IOException {
        return new ApiCall.Builder<List<CouponResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/product_families/{product_family_id}/coupons.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("filter[date_field]")
                                .value((input.getFilterDateField() != null) ? input.getFilterDateField().value() : null).isRequired(false))
                        .queryParam(param -> param.key("filter[end_date]")
                                .value(input.getFilterEndDate()).isRequired(false))
                        .queryParam(param -> param.key("filter[end_datetime]")
                                .value(input.getFilterEndDatetime()).isRequired(false))
                        .queryParam(param -> param.key("filter[start_date]")
                                .value(input.getFilterStartDate()).isRequired(false))
                        .queryParam(param -> param.key("filter[start_datetime]")
                                .value(input.getFilterStartDatetime()).isRequired(false))
                        .queryParam(param -> param.key("filter[ids]")
                                .value(input.getFilterIds()).isRequired(false))
                        .queryParam(param -> param.key("filter[codes]")
                                .value(input.getFilterCodes()).isRequired(false))
                        .queryParam(param -> param.key("currency_prices")
                                .value(input.getCurrencyPrices()).isRequired(false))
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
                                        CouponResponse[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * You can search for a coupon via the API with the find method. By passing a code parameter,
     * the find will attempt to locate a coupon that matches that code. If no coupon is found, a 404
     * is returned. If you have more than one product family and if the coupon you are trying to
     * find does not belong to the default product family in your site, then you will need to
     * specify (either in the url or as a query string param) the product family id.
     * @param  productFamilyId  Optional parameter: The Chargify id of the product family to which
     *         the coupon belongs
     * @param  code  Optional parameter: The code of the coupon
     * @return    Returns the CouponResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CouponResponse readCouponByCode(
            final Integer productFamilyId,
            final String code) throws ApiException, IOException {
        return prepareReadCouponByCodeRequest(productFamilyId, code).execute();
    }

    /**
     * Builds the ApiCall object for readCouponByCode.
     */
    private ApiCall<CouponResponse, ApiException> prepareReadCouponByCodeRequest(
            final Integer productFamilyId,
            final String code) throws IOException {
        return new ApiCall.Builder<CouponResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/coupons/find.json")
                        .queryParam(param -> param.key("product_family_id")
                                .value(productFamilyId).isRequired(false))
                        .queryParam(param -> param.key("code")
                                .value(code).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CouponResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * You can retrieve the Coupon via the API with the Show method. You must identify the Coupon in
     * this call by the ID parameter that Chargify assigns. If instead you would like to find a
     * Coupon using a Coupon code, see the Coupon Find method. When fetching a coupon, if you have
     * defined multiple currencies at the site level, you can optionally pass the
     * `?currency_prices=true` query param to include an array of currency price data in the
     * response. If the coupon is set to `use_site_exchange_rate: true`, it will return pricing
     * based on the current exchange rate. If the flag is set to false, it will return all of the
     * defined prices for each currency.
     * @param  productFamilyId  Required parameter: The Chargify id of the product family to which
     *         the coupon belongs
     * @param  couponId  Required parameter: The Chargify id of the coupon
     * @return    Returns the CouponResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CouponResponse readCoupon(
            final int productFamilyId,
            final int couponId) throws ApiException, IOException {
        return prepareReadCouponRequest(productFamilyId, couponId).execute();
    }

    /**
     * Builds the ApiCall object for readCoupon.
     */
    private ApiCall<CouponResponse, ApiException> prepareReadCouponRequest(
            final int productFamilyId,
            final int couponId) throws IOException {
        return new ApiCall.Builder<CouponResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/product_families/{product_family_id}/coupons/{coupon_id}.json")
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("coupon_id").value(couponId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CouponResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * ## Update Coupon You can update a Coupon via the API with a PUT request to the resource
     * endpoint. You can restrict a coupon to only apply to specific products / components by
     * optionally passing in hashes of `restricted_products` and/or `restricted_components` in the
     * format: `{ "&lt;product/component_id&gt;": boolean_value }`.
     * @param  productFamilyId  Required parameter: The Chargify id of the product family to which
     *         the coupon belongs
     * @param  couponId  Required parameter: The Chargify id of the coupon
     * @param  body  Optional parameter: Example:
     * @return    Returns the CouponResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CouponResponse updateCoupon(
            final int productFamilyId,
            final int couponId,
            final UpdateCouponBody body) throws ApiException, IOException {
        return prepareUpdateCouponRequest(productFamilyId, couponId, body).execute();
    }

    /**
     * Builds the ApiCall object for updateCoupon.
     */
    private ApiCall<CouponResponse, ApiException> prepareUpdateCouponRequest(
            final int productFamilyId,
            final int couponId,
            final UpdateCouponBody body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<CouponResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/product_families/{product_family_id}/coupons/{coupon_id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serializeTypeCombinator(body))
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("coupon_id").value(couponId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CouponResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * You can archive a Coupon via the API with the archive method. Archiving makes that Coupon
     * unavailable for future use, but allows it to remain attached and functional on existing
     * Subscriptions that are using it. The `archived_at` date and time will be assigned.
     * @param  productFamilyId  Required parameter: The Chargify id of the product family to which
     *         the coupon belongs
     * @param  couponId  Required parameter: The Chargify id of the coupon
     * @return    Returns the CouponResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CouponResponse archiveCoupon(
            final int productFamilyId,
            final int couponId) throws ApiException, IOException {
        return prepareArchiveCouponRequest(productFamilyId, couponId).execute();
    }

    /**
     * Builds the ApiCall object for archiveCoupon.
     */
    private ApiCall<CouponResponse, ApiException> prepareArchiveCouponRequest(
            final int productFamilyId,
            final int couponId) throws IOException {
        return new ApiCall.Builder<CouponResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/product_families/{product_family_id}/coupons/{coupon_id}.json")
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("coupon_id").value(couponId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CouponResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * You can retrieve a list of coupons. If the coupon is set to `use_site_exchange_rate: true`,
     * it will return pricing based on the current exchange rate. If the flag is set to false, it
     * will return all of the defined prices for each currency.
     * @param  input  ListCouponsInput object containing request parameters
     * @return    Returns the List of CouponResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<CouponResponse> listCoupons(
            final ListCouponsInput input) throws ApiException, IOException {
        return prepareListCouponsRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listCoupons.
     */
    private ApiCall<List<CouponResponse>, ApiException> prepareListCouponsRequest(
            final ListCouponsInput input) throws IOException {
        return new ApiCall.Builder<List<CouponResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/coupons.json")
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
                        .queryParam(param -> param.key("filter[ids]")
                                .value(input.getFilterIds()).isRequired(false))
                        .queryParam(param -> param.key("filter[codes]")
                                .value(input.getFilterCodes()).isRequired(false))
                        .queryParam(param -> param.key("currency_prices")
                                .value(input.getCurrencyPrices()).isRequired(false))
                        .queryParam(param -> param.key("filter[end_date]")
                                .value(input.getFilterEndDate()).isRequired(false))
                        .queryParam(param -> param.key("filter[end_datetime]")
                                .value(input.getFilterEndDatetime()).isRequired(false))
                        .queryParam(param -> param.key("filter[start_date]")
                                .value(input.getFilterStartDate()).isRequired(false))
                        .queryParam(param -> param.key("filter[start_datetime]")
                                .value(input.getFilterStartDatetime()).isRequired(false))
                        .queryParam(param -> param.key("filter[date_field]")
                                .value((input.getFilterDateField() != null) ? input.getFilterDateField().value() : null).isRequired(false))
                        .queryParam(param -> param.key("filter[use_site_exchange_rate]")
                                .value(input.getFilterUseSiteExchangeRate()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        CouponResponse[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This request will provide details about the coupon usage as an array of data hashes, one per
     * product.
     * @param  productFamilyId  Required parameter: The Chargify id of the product family to which
     *         the coupon belongs
     * @param  couponId  Required parameter: The Chargify id of the coupon
     * @return    Returns the List of CouponUsage response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<CouponUsage> readCouponUsage(
            final int productFamilyId,
            final int couponId) throws ApiException, IOException {
        return prepareReadCouponUsageRequest(productFamilyId, couponId).execute();
    }

    /**
     * Builds the ApiCall object for readCouponUsage.
     */
    private ApiCall<List<CouponUsage>, ApiException> prepareReadCouponUsageRequest(
            final int productFamilyId,
            final int couponId) throws IOException {
        return new ApiCall.Builder<List<CouponUsage>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/product_families/{product_family_id}/coupons/{coupon_id}/usage.json")
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("coupon_id").value(couponId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        CouponUsage[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * You can verify if a specific coupon code is valid using the `validate` method. This method is
     * useful for validating coupon codes that are entered by a customer. If the coupon is found and
     * is valid, the coupon will be returned with a 200 status code. If the coupon is invalid, the
     * status code will be 404 and the response will say why it is invalid. If the coupon is valid,
     * the status code will be 200 and the coupon will be returned. The following reasons for
     * invalidity are supported: + Coupon not found + Coupon is invalid + Coupon expired If you have
     * more than one product family and if the coupon you are validating does not belong to the
     * first product family in your site, then you will need to specify the product family, either
     * in the url or as a query string param. This can be done by supplying the id or the handle in
     * the `handle:my-family` format. Eg. ```
     * https://&lt;subdomain&gt;.chargify.com/product_families/handle:&lt;product_family_handle&gt;/coupons/validate.&lt;format&gt;?code=&lt;coupon_code&gt;
     * ``` Or: ```
     * https://&lt;subdomain&gt;.chargify.com/coupons/validate.&lt;format&gt;?code=&lt;coupon_code&gt;&amp;product_family_id=&lt;id&gt;
     * ```.
     * @param  code  Required parameter: The code of the coupon
     * @param  productFamilyId  Optional parameter: The Chargify id of the product family to which
     *         the coupon belongs
     * @return    Returns the CouponResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CouponResponse validateCoupon(
            final String code,
            final Integer productFamilyId) throws ApiException, IOException {
        return prepareValidateCouponRequest(code, productFamilyId).execute();
    }

    /**
     * Builds the ApiCall object for validateCoupon.
     */
    private ApiCall<CouponResponse, ApiException> prepareValidateCouponRequest(
            final String code,
            final Integer productFamilyId) throws IOException {
        return new ApiCall.Builder<CouponResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/coupons/validate.json")
                        .queryParam(param -> param.key("code")
                                .value(code))
                        .queryParam(param -> param.key("product_family_id")
                                .value(productFamilyId).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CouponResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This endpoint allows you to create and/or update currency prices for an existing coupon.
     * Multiple prices can be created or updated in a single request but each of the currencies must
     * be defined on the site level already and the coupon must be an amount-based coupon, not
     * percentage. Currency pricing for coupons must mirror the setup of the primary coupon pricing
     * - if the primary coupon is percentage based, you will not be able to define pricing in
     * non-primary currencies.
     * @param  couponId  Required parameter: The Chargify id of the coupon
     * @param  body  Optional parameter: Example:
     * @return    Returns the List of CouponCurrency response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<CouponCurrency> updateCouponCurrencyPrices(
            final int couponId,
            final CouponCurrencyRequest body) throws ApiException, IOException {
        return prepareUpdateCouponCurrencyPricesRequest(couponId, body).execute();
    }

    /**
     * Builds the ApiCall object for updateCouponCurrencyPrices.
     */
    private ApiCall<List<CouponCurrency>, ApiException> prepareUpdateCouponCurrencyPricesRequest(
            final int couponId,
            final CouponCurrencyRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<List<CouponCurrency>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/coupon/{coupon_id}/currency_prices.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("coupon_id").value(couponId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        CouponCurrency[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * ## Coupon Subcodes Intro Coupon Subcodes allow you to create a set of unique codes that allow
     * you to expand the use of one coupon. For example: Master Coupon Code: + SPRING2020 Coupon
     * Subcodes: + SPRING90210 + DP80302 + SPRINGBALTIMORE Coupon subcodes can be administered in
     * the Admin Interface or via the API. When creating a coupon subcode, you must specify a coupon
     * to attach it to using the coupon_id. Valid coupon subcodes are all capital letters, contain
     * only letters and numbers, and do not have any spaces. Lowercase letters will be capitalized
     * before the subcode is created. ## Coupon Subcodes Documentation Full documentation on how to
     * create coupon subcodes in the Chargify UI can be located
     * [here](https://chargify.zendesk.com/hc/en-us/articles/4407755909531#coupon-codes).
     * Additionally, for documentation on how to apply a coupon to a Subscription within the
     * Chargify UI, please see our documentation
     * [here](https://chargify.zendesk.com/hc/en-us/articles/4407884887835#coupon). ## Create Coupon
     * Subcode This request allows you to create specific subcodes underneath an existing coupon
     * code. *Note*: If you are using any of the allowed special characters ("%", "{@literal @}", "+", "-",
     * "_", and "."), you must encode them for use in the URL. % to %25 {@literal @} to %40 + to %2B - to %2D _
     * to %5F . to %2E So, if the coupon subcode is `20%OFF`, the URL to delete this coupon subcode
     * would be: `https://&lt;subdomain&gt;.chargify.com/coupons/567/codes/20%25OFF.&lt;format&gt;`.
     * @param  couponId  Required parameter: The Chargify id of the coupon
     * @param  body  Optional parameter: Example:
     * @return    Returns the CouponSubcodesResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CouponSubcodesResponse createCouponSubcodes(
            final int couponId,
            final CouponSubcodes body) throws ApiException, IOException {
        return prepareCreateCouponSubcodesRequest(couponId, body).execute();
    }

    /**
     * Builds the ApiCall object for createCouponSubcodes.
     */
    private ApiCall<CouponSubcodesResponse, ApiException> prepareCreateCouponSubcodesRequest(
            final int couponId,
            final CouponSubcodes body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<CouponSubcodesResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/coupons/{coupon_id}/codes.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("coupon_id").value(couponId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CouponSubcodesResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This request allows you to request the subcodes that are attached to a coupon.
     * @param  input  ListCouponSubcodesInput object containing request parameters
     * @return    Returns the CouponSubcodes response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CouponSubcodes listCouponSubcodes(
            final ListCouponSubcodesInput input) throws ApiException, IOException {
        return prepareListCouponSubcodesRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listCouponSubcodes.
     */
    private ApiCall<CouponSubcodes, ApiException> prepareListCouponSubcodesRequest(
            final ListCouponSubcodesInput input) throws IOException {
        return new ApiCall.Builder<CouponSubcodes, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/coupons/{coupon_id}/codes.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .templateParam(param -> param.key("coupon_id").value(input.getCouponId()).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CouponSubcodes.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * You can update the subcodes for the given Coupon via the API with a PUT request to the
     * resource endpoint. Send an array of new coupon subcodes. **Note**: All current subcodes for
     * that Coupon will be deleted first, and replaced with the list of subcodes sent to this
     * endpoint. The response will contain: + The created subcodes, + Subcodes that were not created
     * because they already exist, + Any subcodes not created because they are invalid.
     * @param  couponId  Required parameter: The Chargify id of the coupon
     * @param  body  Optional parameter: Example:
     * @return    Returns the CouponSubcodesResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CouponSubcodesResponse updateCouponSubcodes(
            final int couponId,
            final CouponSubcodes body) throws ApiException, IOException {
        return prepareUpdateCouponSubcodesRequest(couponId, body).execute();
    }

    /**
     * Builds the ApiCall object for updateCouponSubcodes.
     */
    private ApiCall<CouponSubcodesResponse, ApiException> prepareUpdateCouponSubcodesRequest(
            final int couponId,
            final CouponSubcodes body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<CouponSubcodesResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/coupons/{coupon_id}/codes.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("coupon_id").value(couponId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CouponSubcodesResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * ## Example Given a coupon with an ID of 567, and a coupon subcode of 20OFF, the URL to
     * `DELETE` this coupon subcode would be: ```
     * http://subdomain.chargify.com/coupons/567/codes/20OFF.&lt;format&gt; ``` Note: If you are using any
     * of the allowed special characters (“%”, “{@literal @}”, “+”, “-”, “_”, and “.”), you must encode them
     * for use in the URL. | Special character | Encoding | |-------------------|----------| | % |
     * %25 | | {@literal @} | %40 | | + | %2B | | – | %2D | | _ | %5F | | . | %2E | ## Percent Encoding Example
     * Or if the coupon subcode is 20%OFF, the URL to delete this coupon subcode would be:
     * {@literal @}https://&lt;subdomain&gt;.chargify.com/coupons/567/codes/20%25OFF.&lt;format&gt;.
     * @param  couponId  Required parameter: The Chargify id of the coupon to which the subcode
     *         belongs
     * @param  subcode  Required parameter: The subcode of the coupon
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void deleteCouponSubcode(
            final int couponId,
            final String subcode) throws ApiException, IOException {
        prepareDeleteCouponSubcodeRequest(couponId, subcode).execute();
    }

    /**
     * Builds the ApiCall object for deleteCouponSubcode.
     */
    private ApiCall<Void, ApiException> prepareDeleteCouponSubcodeRequest(
            final int couponId,
            final String subcode) throws IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/coupons/{coupon_id}/codes/{subcode}.json")
                        .templateParam(param -> param.key("coupon_id").value(couponId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("subcode").value(subcode)
                                .shouldEncode(true))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }
}