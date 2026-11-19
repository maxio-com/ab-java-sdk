/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.controllers;

import com.maxio.advancedbilling.ApiHelper;
import com.maxio.advancedbilling.Server;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.WalletErrorResponseException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.CreateWalletProductRequest;
import com.maxio.advancedbilling.models.SortBy1;
import com.maxio.advancedbilling.models.SortDirection;
import com.maxio.advancedbilling.models.Status1;
import com.maxio.advancedbilling.models.UpdateWalletProductRequest;
import com.maxio.advancedbilling.models.WalletProductResponse;
import com.maxio.advancedbilling.models.WalletProductUsageResponse;
import com.maxio.advancedbilling.models.WalletProductsListResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class WalletProductsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public WalletProductsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Lists the Wallet Products on your site.
     * @param  includeArchived  Optional parameter: Includes archived Wallet Products in the result.
     *         Defaults to `false`. Ignored when `status` is also sent.
     * @param  status  Optional parameter: Restricts the result by status, and overrides
     *         `include_archived` when sent. An unrecognized value falls back to `active` rather
     *         than returning `422`.
     * @param  q  Optional parameter: Restricts the result to Wallet Products whose name, handle, or
     *         unit name contains this substring (case-insensitive).
     * @param  sortBy  Optional parameter: The field to sort results by. An unrecognized value falls
     *         back to `name`.
     * @param  sortDirection  Optional parameter: The sort direction. Anything other than `desc` is
     *         treated as `asc`.
     * @param  page  Optional parameter: Result records are organized in pages. By default, the
     *         first page of results is displayed. The page parameter specifies a page number of
     *         results to fetch. You can start navigating through the pages to consume the results.
     *         You do this by passing in a page parameter. Retrieve the next page by adding ?page=2
     *         to the query string. If there are no results to return, then an empty result set will
     *         be returned. Use in query `page=1`.
     * @param  perPage  Optional parameter: This parameter indicates how many records to fetch in
     *         each request. Default value is 20. The maximum allowed values is 200; any per_page
     *         value over 200 will be changed to 200. Use in query `per_page=200`.
     * @return    Returns the WalletProductsListResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WalletProductsListResponse listWalletProducts(
            final Boolean includeArchived,
            final Status1 status,
            final String q,
            final SortBy1 sortBy,
            final SortDirection sortDirection,
            final Integer page,
            final Integer perPage) throws ApiException, IOException {
        return prepareListWalletProductsRequest(includeArchived, status, q, sortBy, sortDirection,
                page, perPage).execute();
    }

    /**
     * Builds the ApiCall object for listWalletProducts.
     */
    private ApiCall<WalletProductsListResponse, ApiException> prepareListWalletProductsRequest(
            final Boolean includeArchived,
            final Status1 status,
            final String q,
            final SortBy1 sortBy,
            final SortDirection sortDirection,
            final Integer page,
            final Integer perPage) {
        return new ApiCall.Builder<WalletProductsListResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/wallet_products.json")
                        .queryParam(param -> param.key("include_archived")
                                .value(includeArchived).isRequired(false))
                        .queryParam(param -> param.key("status")
                                .value((status != null) ? status.value() : null).isRequired(false))
                        .queryParam(param -> param.key("q")
                                .value(q).isRequired(false))
                        .queryParam(param -> param.key("sort_by")
                                .value((sortBy != null) ? sortBy.value() : "name").isRequired(false))
                        .queryParam(param -> param.key("sort_direction")
                                .value((sortDirection != null) ? sortDirection.value() : "asc").isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value((page != null) ? page : 1).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value((perPage != null) ? perPage : 20).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, WalletProductsListResponse.class))
                        .nullify404(false)
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden. The response body is plain text (`403 Forbidden`), not JSON. Returned when the Wallets feature isn't enabled for the site.",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Creates a Wallet Product: a billing product with no product family, meant to denominate
     * wallets and to be purchased through [Create Wallet
     * Purchase]($e/Wallet%20Purchases/createWalletPurchase). It's a Component under the hood, so it
     * returns the full Component field set, and can optionally be priced with one or more price
     * points in the same call.
     * @param  body  Optional parameter:
     * @return    Returns the WalletProductResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WalletProductResponse createWalletProduct(
            final CreateWalletProductRequest body) throws ApiException, IOException {
        return prepareCreateWalletProductRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for createWalletProduct.
     */
    private ApiCall<WalletProductResponse, ApiException> prepareCreateWalletProductRequest(
            final CreateWalletProductRequest body) {
        return new ApiCall.Builder<WalletProductResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/wallet_products.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, WalletProductResponse.class))
                        .nullify404(false)
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden. The response body is plain text (`403 Forbidden`), not JSON. Returned when the Wallets feature isn't enabled for the site.",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Validation failure. Includes a `product_family_id` (rejected rather than ignored), and any failure validating a price point in `price_point`/`price_points`, which rolls back the whole call, including the Wallet Product itself.",
                                (reason, context) -> new WalletErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns the Wallet Product.
     * @param  id  Required parameter: The Advanced Billing id of the Wallet Product, or its handle
     *         prefixed with `handle:` (for example `handle:token-pack`). A bare handle returns
     *         `404`.
     * @return    Returns the WalletProductResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WalletProductResponse readWalletProduct(
            final String id) throws ApiException, IOException {
        return prepareReadWalletProductRequest(id).execute();
    }

    /**
     * Builds the ApiCall object for readWalletProduct.
     */
    private ApiCall<WalletProductResponse, ApiException> prepareReadWalletProductRequest(
            final String id) {
        return new ApiCall.Builder<WalletProductResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/wallet_products/{id}.json")
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, WalletProductResponse.class))
                        .nullify404(false)
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden. The response body is plain text (`403 Forbidden`), not JSON. Returned when the Wallets feature isn't enabled for the site.",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found",
                                (reason, context) -> new WalletErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Updates the Wallet Product's catalog-facing fields. Omitted fields are left unchanged. Unlike
     * [Create Wallet Product]($e/Wallet%20Products/createWalletProduct), this does not accept
     * `unit_name`, `handle`, `price_point`, or `price_points`; see the request schema for which
     * fields are actually mutable.
     * @param  id  Required parameter: The Advanced Billing id of the Wallet Product, or its handle
     *         prefixed with `handle:` (for example `handle:token-pack`). A bare handle returns
     *         `404`.
     * @param  body  Optional parameter:
     * @return    Returns the WalletProductResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WalletProductResponse updateWalletProduct(
            final String id,
            final UpdateWalletProductRequest body) throws ApiException, IOException {
        return prepareUpdateWalletProductRequest(id, body).execute();
    }

    /**
     * Builds the ApiCall object for updateWalletProduct.
     */
    private ApiCall<WalletProductResponse, ApiException> prepareUpdateWalletProductRequest(
            final String id,
            final UpdateWalletProductRequest body) {
        return new ApiCall.Builder<WalletProductResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/wallet_products/{id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("id").value(id)
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
                                response -> ApiHelper.deserialize(response, WalletProductResponse.class))
                        .nullify404(false)
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden. The response body is plain text (`403 Forbidden`), not JSON. Returned when the Wallets feature isn't enabled for the site.",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found",
                                (reason, context) -> new WalletErrorResponseException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Validation failure.",
                                (reason, context) -> new WalletErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns everything drawing on this Wallet Product: the wallet templates billing through it,
     * split into ones using its default price point and ones overriding it, plus a sample of up to
     * 50 of the active wallets actually created from them. A wallet template can appear more than
     * once in `wallet_templates`/`price_point_overrides`, once per Feature and owning
     * plan/component sharing it, so these arrays aren't one row per template.
     * @param  id  Required parameter: The Advanced Billing id of the Wallet Product, or its handle
     *         prefixed with `handle:` (for example `handle:token-pack`). A bare handle returns
     *         `404`.
     * @return    Returns the WalletProductUsageResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WalletProductUsageResponse readWalletProductUsage(
            final String id) throws ApiException, IOException {
        return prepareReadWalletProductUsageRequest(id).execute();
    }

    /**
     * Builds the ApiCall object for readWalletProductUsage.
     */
    private ApiCall<WalletProductUsageResponse, ApiException> prepareReadWalletProductUsageRequest(
            final String id) {
        return new ApiCall.Builder<WalletProductUsageResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/wallet_products/{id}/usage.json")
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, WalletProductUsageResponse.class))
                        .nullify404(false)
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden. The response body is plain text (`403 Forbidden`), not JSON. Returned when the Wallets feature isn't enabled for the site.",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found",
                                (reason, context) -> new WalletErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Archives the Wallet Product. Refuses when an active Feature's `wallet_behavior` still points
     * at it, or when it's used in a scheduled renewal. This protects Feature-provisioned wallets,
     * but not a wallet created manually against this product: a manual wallet can be left
     * denominated by an archived Wallet Product, and [Create Wallet
     * Purchase]($e/Wallet%20Purchases/createWalletPurchase) doesn't check whether the billing
     * product is archived before pricing and charging a purchase against it.
     * @param  id  Required parameter: The Advanced Billing id of the Wallet Product, or its handle
     *         prefixed with `handle:` (for example `handle:token-pack`). A bare handle returns
     *         `404`.
     * @return    Returns the WalletProductResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WalletProductResponse archiveWalletProduct(
            final String id) throws ApiException, IOException {
        return prepareArchiveWalletProductRequest(id).execute();
    }

    /**
     * Builds the ApiCall object for archiveWalletProduct.
     */
    private ApiCall<WalletProductResponse, ApiException> prepareArchiveWalletProductRequest(
            final String id) {
        return new ApiCall.Builder<WalletProductResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/wallet_products/{id}/archive.json")
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, WalletProductResponse.class))
                        .nullify404(false)
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden. The response body is plain text (`403 Forbidden`), not JSON. Returned when the Wallets feature isn't enabled for the site.",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found",
                                (reason, context) -> new WalletErrorResponseException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("The Wallet Product is already archived, is in use by one or more Features, or is in use by a scheduled renewal.",
                                (reason, context) -> new WalletErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Restores an archived Wallet Product.
     * @param  id  Required parameter: The Advanced Billing id of the Wallet Product, or its handle
     *         prefixed with `handle:` (for example `handle:token-pack`). A bare handle returns
     *         `404`.
     * @return    Returns the WalletProductResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WalletProductResponse unarchiveWalletProduct(
            final String id) throws ApiException, IOException {
        return prepareUnarchiveWalletProductRequest(id).execute();
    }

    /**
     * Builds the ApiCall object for unarchiveWalletProduct.
     */
    private ApiCall<WalletProductResponse, ApiException> prepareUnarchiveWalletProductRequest(
            final String id) {
        return new ApiCall.Builder<WalletProductResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/wallet_products/{id}/unarchive.json")
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, WalletProductResponse.class))
                        .nullify404(false)
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden. The response body is plain text (`403 Forbidden`), not JSON. Returned when the Wallets feature isn't enabled for the site.",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found",
                                (reason, context) -> new WalletErrorResponseException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("The Wallet Product is not archived.",
                                (reason, context) -> new WalletErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}