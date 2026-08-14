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
import com.maxio.advancedbilling.exceptions.ErrorStringMapResponseException;
import com.maxio.advancedbilling.exceptions.SingleStringErrorResponseException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.CouponCurrencyRequest;
import com.maxio.advancedbilling.models.CouponCurrencyResponse;
import com.maxio.advancedbilling.models.CouponRequest;
import com.maxio.advancedbilling.models.CouponResponse;
import com.maxio.advancedbilling.models.CouponSubcodes;
import com.maxio.advancedbilling.models.CouponSubcodesResponse;
import com.maxio.advancedbilling.models.CouponUsage;
import com.maxio.advancedbilling.models.ListCouponSubcodesInput;
import com.maxio.advancedbilling.models.ListCouponsForProductFamilyInput;
import com.maxio.advancedbilling.models.ListCouponsInput;
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
     * Creates a coupon under the specified product family. You can create either a flat amount
     * coupon, by specifying `amount_in_cents`, or percentage coupon by specifying `percentage`. See
     * [Apply Coupons to
     * Subscriptions](https://maxio.zendesk.com/hc/en-us/articles/24261259337101-Coupons-and-Subscriptions)
     * for information on applying a coupon to a subscription in the Advanced Billing UI.
     * @param  productFamilyId  Required parameter: The Advanced Billing id of the product family to
     *         which the coupon belongs
     * @param  body  Optional parameter:
     * @return    Returns the CouponResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CouponResponse createCoupon(
            final int productFamilyId,
            final CouponRequest body) throws ApiException, IOException {
        return prepareCreateCouponRequest(productFamilyId, body).execute();
    }

    /**
     * Builds the ApiCall object for createCoupon.
     */
    private ApiCall<CouponResponse, ApiException> prepareCreateCouponRequest(
            final int productFamilyId,
            final CouponRequest body) {
        return new ApiCall.Builder<CouponResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/product_families/{product_family_id}/coupons.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId).isRequired(false)
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
                                response -> ApiHelper.deserialize(response, CouponResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Lists coupons for a specific product family in a site.
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
            final ListCouponsForProductFamilyInput input) {
        return new ApiCall.Builder<List<CouponResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/product_families/{product_family_id}/coupons.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("filter")
                                .value(input.getFilter()).isRequired(false))
                        .queryParam(param -> param.key("currency_prices")
                                .value(input.getCurrencyPrices()).isRequired(false))
                        .templateParam(param -> param.key("product_family_id").value(input.getProductFamilyId()).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        CouponResponse[].class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Searches for a coupon by code. If you have more than one product family and if the coupon you
     * are trying to find does not belong to the default product family in your site, you need to
     * specify (either in the URL or as a query string param) the `product_family_id`.
     * @param  productFamilyId  Optional parameter: The Advanced Billing id of the product family to
     *         which the coupon belongs
     * @param  code  Optional parameter: The code of the coupon
     * @param  currencyPrices  Optional parameter: (Optional) If you have defined multiple
     *         currencies at the site level, you can pass `?currency_prices=true` to include an
     *         array of currency price data in the response.
     * @return    Returns the CouponResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CouponResponse findCoupon(
            final Integer productFamilyId,
            final String code,
            final Boolean currencyPrices) throws ApiException, IOException {
        return prepareFindCouponRequest(productFamilyId, code, currencyPrices).execute();
    }

    /**
     * Builds the ApiCall object for findCoupon.
     */
    private ApiCall<CouponResponse, ApiException> prepareFindCouponRequest(
            final Integer productFamilyId,
            final String code,
            final Boolean currencyPrices) {
        return new ApiCall.Builder<CouponResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/coupons/find.json")
                        .queryParam(param -> param.key("product_family_id")
                                .value(productFamilyId).isRequired(false))
                        .queryParam(param -> param.key("code")
                                .value(code).isRequired(false))
                        .queryParam(param -> param.key("currency_prices")
                                .value(currencyPrices).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CouponResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns a coupon by its system-assigned ID. You must identify the Coupon in this call by the
     * ID parameter assigned to it. If instead you would like to find a Coupon using a Coupon code,
     * use the [Find Coupon]($e/Coupons/findCoupon) endpoint. If the coupon is set to
     * `use_site_exchange_rate: true`, it returns pricing based on the current exchange rate. If the
     * flag is set to false, it returns all of the defined prices for each currency.
     * @param  productFamilyId  Required parameter: The Advanced Billing id of the product family to
     *         which the coupon belongs
     * @param  couponId  Required parameter: The Advanced Billing id of the coupon
     * @param  currencyPrices  Optional parameter: (Optional) If you have defined multiple
     *         currencies at the site level, you can pass `?currency_prices=true` to include an
     *         array of currency price data in the response.
     * @return    Returns the CouponResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CouponResponse readCoupon(
            final int productFamilyId,
            final int couponId,
            final Boolean currencyPrices) throws ApiException, IOException {
        return prepareReadCouponRequest(productFamilyId, couponId, currencyPrices).execute();
    }

    /**
     * Builds the ApiCall object for readCoupon.
     */
    private ApiCall<CouponResponse, ApiException> prepareReadCouponRequest(
            final int productFamilyId,
            final int couponId,
            final Boolean currencyPrices) {
        return new ApiCall.Builder<CouponResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/product_families/{product_family_id}/coupons/{coupon_id}.json")
                        .queryParam(param -> param.key("currency_prices")
                                .value(currencyPrices).isRequired(false))
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("coupon_id").value(couponId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CouponResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Updates a coupon. You can restrict a coupon to only apply to specific products / components
     * by optionally passing in hashes of `restricted_products` and/or `restricted_components` in
     * the format: `{ "&lt;product/component_id&gt;": boolean_value }`.
     * @param  productFamilyId  Required parameter: The Advanced Billing id of the product family to
     *         which the coupon belongs
     * @param  couponId  Required parameter: The Advanced Billing id of the coupon
     * @param  body  Optional parameter:
     * @return    Returns the CouponResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CouponResponse updateCoupon(
            final int productFamilyId,
            final int couponId,
            final CouponRequest body) throws ApiException, IOException {
        return prepareUpdateCouponRequest(productFamilyId, couponId, body).execute();
    }

    /**
     * Builds the ApiCall object for updateCoupon.
     */
    private ApiCall<CouponResponse, ApiException> prepareUpdateCouponRequest(
            final int productFamilyId,
            final int couponId,
            final CouponRequest body) {
        return new ApiCall.Builder<CouponResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/product_families/{product_family_id}/coupons/{coupon_id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("coupon_id").value(couponId).isRequired(false)
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
                                response -> ApiHelper.deserialize(response, CouponResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Archives a coupon, making it unavailable for future use while remaining active on existing
     * subscriptions. Archiving makes that Coupon unavailable for future use, but allows it to
     * remain attached and functional on existing Subscriptions that are using it. The `archived_at`
     * date and time will be assigned.
     * @param  productFamilyId  Required parameter: The Advanced Billing id of the product family to
     *         which the coupon belongs
     * @param  couponId  Required parameter: The Advanced Billing id of the coupon
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
            final int couponId) {
        return new ApiCall.Builder<CouponResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/product_families/{product_family_id}/coupons/{coupon_id}.json")
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("coupon_id").value(couponId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CouponResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Lists coupons for a site.
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
            final ListCouponsInput input) {
        return new ApiCall.Builder<List<CouponResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/coupons.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("filter")
                                .value(input.getFilter()).isRequired(false))
                        .queryParam(param -> param.key("currency_prices")
                                .value(input.getCurrencyPrices()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        CouponResponse[].class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Lists coupon usage details, one entry per product.
     * @param  productFamilyId  Required parameter: The Advanced Billing id of the product family to
     *         which the coupon belongs.
     * @param  couponId  Required parameter: The Advanced Billing id of the coupon.
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
            final int couponId) {
        return new ApiCall.Builder<List<CouponUsage>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/product_families/{product_family_id}/coupons/{coupon_id}/usage.json")
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("coupon_id").value(couponId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        CouponUsage[].class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Verifies whether a specific coupon code is valid. This method is useful for validating coupon
     * codes that are entered by a customer. If you have more than one product family and if the
     * coupon you are validating does not belong to the first product family in your site, you need
     * to specify the product family, either in the URL or as a query string param. This can be done
     * by supplying the id or the handle in the `handle:my-family` format. Supplying the
     * `product_family_handle` in the URL: ```
     * https://&lt;subdomain&gt;.chargify.com/product_families/handle:&lt;product_family_handle&gt;/coupons/validate.&lt;format&gt;?code=&lt;coupon_code&gt;
     * ``` Supplying the `product_family_id` as a query parameter: ```
     * https://&lt;subdomain&gt;.chargify.com/coupons/validate.&lt;format&gt;?code=&lt;coupon_code&gt;&amp;product_family_id=&lt;id&gt;
     * ```.
     * @param  code  Required parameter: The code of the coupon
     * @param  productFamilyId  Optional parameter: The Advanced Billing id of the product family to
     *         which the coupon belongs
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
            final Integer productFamilyId) {
        return new ApiCall.Builder<CouponResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/coupons/validate.json")
                        .queryParam(param -> param.key("code")
                                .value(code))
                        .queryParam(param -> param.key("product_family_id")
                                .value(productFamilyId).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CouponResponse.class))
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("Not Found: '{$response.body}'",
                                (reason, context) -> new SingleStringErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Creates and/or updates currency prices for an existing coupon. Multiple prices can be created
     * or updated in a single request but each of the currencies must be defined on the site level
     * already and the coupon must be an amount-based coupon, not percentage. Currency pricing for
     * coupons must mirror the setup of the primary coupon pricing - if the primary coupon is
     * percentage based, you will not be able to define pricing in non-primary currencies.
     * @param  couponId  Required parameter: The Advanced Billing id of the coupon
     * @param  body  Optional parameter:
     * @return    Returns the CouponCurrencyResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CouponCurrencyResponse createOrUpdateCouponCurrencyPrices(
            final int couponId,
            final CouponCurrencyRequest body) throws ApiException, IOException {
        return prepareCreateOrUpdateCouponCurrencyPricesRequest(couponId, body).execute();
    }

    /**
     * Builds the ApiCall object for createOrUpdateCouponCurrencyPrices.
     */
    private ApiCall<CouponCurrencyResponse, ApiException> prepareCreateOrUpdateCouponCurrencyPricesRequest(
            final int couponId,
            final CouponCurrencyRequest body) {
        return new ApiCall.Builder<CouponCurrencyResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/coupons/{coupon_id}/currency_prices.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("coupon_id").value(couponId).isRequired(false)
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
                                response -> ApiHelper.deserialize(response, CouponCurrencyResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorStringMapResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Creates subcodes for an existing coupon. Coupon Subcodes allow you to create a set of unique
     * codes that allow you to expand the use of one coupon. For example: Master Coupon Code: +
     * SPRING2020 Coupon Subcodes: + SPRING90210 + DP80302 + SPRINGBALTIMORE When creating a coupon
     * subcode, you must specify a coupon to attach it to using the coupon_id. Valid coupon subcodes
     * are all capital letters, contain only letters and numbers, and do not have any spaces.
     * Lowercase letters are capitalized before the subcode is created. Note: If you are using any
     * of the allowed special characters ("%", "{@literal @}", "+", "-", "_", and "."), you must encode them
     * for use in the URL. % to %25 {@literal @} to %40 + to %2B - to %2D _ to %5F . to %2E So, if the coupon
     * subcode is `20%OFF`, the URL to delete this coupon subcode would be:
     * `https://&lt;subdomain&gt;.chargify.com/coupons/567/codes/20%25OFF.&lt;format&gt;`. For more information
     * on coupon codes and applying coupons to subscriptions, see [Coupon
     * Codes](https://maxio.zendesk.com/hc/en-us/articles/24261208729229-Coupon-Codes) and [Coupons
     * and
     * Subscriptions](https://maxio.zendesk.com/hc/en-us/articles/24261259337101-Coupons-and-Subscriptions).
     * @param  couponId  Required parameter: The Advanced Billing id of the coupon
     * @param  body  Optional parameter:
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
            final CouponSubcodes body) {
        return new ApiCall.Builder<CouponSubcodesResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/coupons/{coupon_id}/codes.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("coupon_id").value(couponId).isRequired(false)
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
                                response -> ApiHelper.deserialize(response, CouponSubcodesResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Lists the subcodes attached to a coupon.
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
            final ListCouponSubcodesInput input) {
        return new ApiCall.Builder<CouponSubcodes, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/coupons/{coupon_id}/codes.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .templateParam(param -> param.key("coupon_id").value(input.getCouponId()).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CouponSubcodes.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Updates the subcodes for a coupon, replacing all existing subcodes with the new list. Send an
     * array of new coupon subcodes. **Note**: All current subcodes for that Coupon will be deleted
     * first, and replaced with the list of subcodes sent to this endpoint. The response will
     * contain: + The created subcodes, + Subcodes that were not created because they already exist,
     * + Any subcodes not created because they are invalid.
     * @param  couponId  Required parameter: The Advanced Billing id of the coupon
     * @param  body  Optional parameter:
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
            final CouponSubcodes body) {
        return new ApiCall.Builder<CouponSubcodesResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/coupons/{coupon_id}/codes.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("coupon_id").value(couponId).isRequired(false)
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
                                response -> ApiHelper.deserialize(response, CouponSubcodesResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Deletes a specific subcode from a coupon. ## Example Given a coupon with an ID of 567, and a
     * coupon subcode of 20OFF, the URL to `DELETE` this coupon subcode would be: ```
     * http://subdomain.chargify.com/coupons/567/codes/20OFF.&lt;format&gt; ``` Note: If you are using any
     * of the allowed special characters (“%”, “{@literal @}”, “+”, “-”, “_”, and “.”), you must encode them
     * for use in the URL. | Special character | Encoding | |-------------------|----------| | % |
     * %25 | | {@literal @} | %40 | | + | %2B | | – | %2D | | _ | %5F | | . | %2E | ## Percent Encoding Example
     * Or if the coupon subcode is 20%OFF, the URL to delete this coupon subcode would be:
     * {@literal @}https://&lt;subdomain&gt;.chargify.com/coupons/567/codes/20%25OFF.&lt;format&gt;.
     * @param  couponId  Required parameter: The Advanced Billing id of the coupon to which the
     *         subcode belongs
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
            final String subcode) {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/coupons/{coupon_id}/codes/{subcode}.json")
                        .templateParam(param -> param.key("coupon_id").value(couponId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("subcode").value(subcode)
                                .shouldEncode(true))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("Not Found:'{$response.body}'",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}