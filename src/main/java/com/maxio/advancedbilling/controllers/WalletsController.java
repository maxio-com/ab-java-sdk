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
import com.maxio.advancedbilling.models.CreateWalletRequest;
import com.maxio.advancedbilling.models.Status2;
import com.maxio.advancedbilling.models.UpdateWalletRequest;
import com.maxio.advancedbilling.models.WalletResponse;
import com.maxio.advancedbilling.models.WalletsListResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class WalletsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public WalletsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Lists the wallets on your site, in creation order, paginated. Without `subscription_id`,
     * returns every wallet on the site. The API key is the tenancy boundary; `subscription_id` only
     * narrows the result set further. Archived wallets are included unless you filter them out with
     * `status=active`.
     * @param  page  Optional parameter: Result records are organized in pages. By default, the
     *         first page of results is displayed. The page parameter specifies a page number of
     *         results to fetch. You can start navigating through the pages to consume the results.
     *         You do this by passing in a page parameter. Retrieve the next page by adding ?page=2
     *         to the query string. If there are no results to return, then an empty result set will
     *         be returned. Use in query `page=1`.
     * @param  perPage  Optional parameter: This parameter indicates how many records to fetch in
     *         each request. Default value is 20. The maximum allowed values is 200; any per_page
     *         value over 200 will be changed to 200. Use in query `per_page=200`.
     * @param  subscriptionId  Optional parameter: Restricts the result to wallets owned by this
     *         subscription.
     * @param  status  Optional parameter: Restricts the result by wallet status. An unrecognized
     *         value returns `422` rather than being silently ignored.
     * @return    Returns the WalletsListResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WalletsListResponse listWallets(
            final Integer page,
            final Integer perPage,
            final Integer subscriptionId,
            final Status2 status) throws ApiException, IOException {
        return prepareListWalletsRequest(page, perPage, subscriptionId, status).execute();
    }

    /**
     * Builds the ApiCall object for listWallets.
     */
    private ApiCall<WalletsListResponse, ApiException> prepareListWalletsRequest(
            final Integer page,
            final Integer perPage,
            final Integer subscriptionId,
            final Status2 status) {
        return new ApiCall.Builder<WalletsListResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/wallets.json")
                        .queryParam(param -> param.key("page")
                                .value((page != null) ? page : 1).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value((perPage != null) ? perPage : 20).isRequired(false))
                        .queryParam(param -> param.key("subscription_id")
                                .value(subscriptionId).isRequired(false))
                        .queryParam(param -> param.key("status")
                                .value((status != null) ? status.value() : null).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, WalletsListResponse.class))
                        .nullify404(false)
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden. The response body is plain text (`403 Forbidden`), not JSON. Returned when the Wallets feature isn't enabled for the site.",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new WalletErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Creates a wallet owned by a subscription and denominated by a [Wallet
     * Product]($e/Wallet%20Products/createWalletProduct): only a Wallet Product can denominate a
     * wallet, not an ordinary component. The Wallet Product must be active; it never belongs to a
     * product family, so there's no family check against the subscription. It's **immutable for the
     * life of the wallet**; there's no way to repoint an existing wallet at a different one. This
     * endpoint always creates a `manual` wallet. To provision a wallet automatically from a
     * usage-limit entitlement instead, configure `wallet_behavior` on the Feature behind that
     * entitlement (see [the Wallets concept
     * guide](page:introduction/basic-concepts/wallets#provisioning-a-wallet-from-a-feature)) rather
     * than sending `entitlement_id` here.
     * @param  idempotencyKey  Optional parameter: A key you generate, such as a UUID, that makes
     *         retrying this request safe. 1 to 255 printable ASCII characters; surrounding double
     *         quotes are ignored. Keys are scoped to your site and kept for at least 24 hours. The
     *         first request with a key runs normally. A retry with the same key, method, path and
     *         query string, and a byte-identical body returns the stored status and body of that
     *         first request without running it again. The same key with a different request returns
     *         `422` (`idempotency_key_mismatch`). A retry that arrives while the first request is
     *         still running waits for it to finish, and returns `409`
     *         (`idempotency_request_in_progress`) only if that wait times out; on Create Wallet
     *         Purchase the `409` is immediate. Only successful responses are stored, so a failed
     *         request can be retried with the same key. When this header is sent,
     *         `uniqueness_token` is not checked. See [Idempotent
     *         retries](page:introduction/basic-concepts/wallets#idempotent-retries) for the
     *         details, including how wallet purchases differ.
     * @param  body  Optional parameter:
     * @return    Returns the WalletResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WalletResponse createWallet(
            final String idempotencyKey,
            final CreateWalletRequest body) throws ApiException, IOException {
        return prepareCreateWalletRequest(idempotencyKey, body).execute();
    }

    /**
     * Builds the ApiCall object for createWallet.
     */
    private ApiCall<WalletResponse, ApiException> prepareCreateWalletRequest(
            final String idempotencyKey,
            final CreateWalletRequest body) {
        return new ApiCall.Builder<WalletResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/wallets.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("Idempotency-Key")
                                .value(idempotencyKey).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, WalletResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("The `Idempotency-Key` header is empty, longer than 255 characters, or contains characters other than printable ASCII. Nothing is written.",
                                (reason, context) -> new WalletErrorResponseException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden. The response body is plain text (`403 Forbidden`), not JSON. Returned when the Wallets feature isn't enabled for the site.",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Unknown or cross-site subscription or meter, or a `wallet_product_id` that doesn't resolve to a Wallet Product on this site.",
                                (reason, context) -> new WalletErrorResponseException(reason, context)))
                        .localErrorCase("409",
                                 ErrorCase.setReason("A request with the same `Idempotency-Key` was still being processed when this retry's wait for it timed out (`idempotency_request_in_progress`). Nothing is written; retry with the same key once it finishes.",
                                (reason, context) -> new WalletErrorResponseException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Validation failure, or an `Idempotency-Key` reused with a different request (`idempotency_key_mismatch`). Validation failures include a missing or archived `wallet_product_id`; a `price_point_id` that's missing, archived, a subscription-specific custom price point, or doesn't belong to the Wallet Product; an invalid `depletion_policy` or `hard_stop_overflow` value; a meter that isn't a `sum` or `count` meter; an invalid `conversion_rate`; a subscription with no reference, when pairing a meter whose stream bills by subscription reference; and the `initial_balance` / `initial_balance_expires_at` error cases described on those fields. Also returned for `entitlement_id`: this endpoint never accepts it, and rejects it with the message shown below rather than silently ignoring it. Also returned when `subscription_id` names a prepaid subscription: a wallet would double-meter a balance the subscription already tracks on its own, so the two are mutually exclusive.",
                                (reason, context) -> new WalletErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns the wallet's balance and grant breakdown. For an active, metered wallet on a site
     * with metered consumption enabled, this is the only operation that computes a live balance
     * from meter usage; see the wallet resource's `metered_*` fields. It is also the only operation
     * where `balance` can differ from `posted_balance`, and a grant's `remaining` from its
     * `posted_remaining`: the pending usage is drawn from the grants in drain order, so the grants'
     * `remaining` add up to `balance`. Readable regardless of status. Archiving a wallet doesn't
     * affect reads.
     * @param  id  Required parameter: The Advanced Billing id of the wallet.
     * @return    Returns the WalletResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WalletResponse readWallet(
            final int id) throws ApiException, IOException {
        return prepareReadWalletRequest(id).execute();
    }

    /**
     * Builds the ApiCall object for readWallet.
     */
    private ApiCall<WalletResponse, ApiException> prepareReadWalletRequest(
            final int id) {
        return new ApiCall.Builder<WalletResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/wallets/{id}.json")
                        .templateParam(param -> param.key("id").value(id).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, WalletResponse.class))
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
     * Archives the wallet: blocks further grants, debits, adjustments, and purchases (each returns
     * `422`), stops any metered drawdown, and stops recurring funding (its schedule is deactivated
     * with reason `wallet_archived`, not removed), while reads and the ledger stay available.
     * Nothing already on the wallet is destroyed or clawed back, but nothing on it can be spent
     * either, by any path, once archived. Idempotent: archiving an already-archived wallet returns
     * the same `200`. There is no restore endpoint.
     * @param  id  Required parameter: The Advanced Billing id of the wallet.
     * @return    Returns the WalletResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WalletResponse archiveWallet(
            final int id) throws ApiException, IOException {
        return prepareArchiveWalletRequest(id).execute();
    }

    /**
     * Builds the ApiCall object for archiveWallet.
     */
    private ApiCall<WalletResponse, ApiException> prepareArchiveWalletRequest(
            final int id) {
        return new ApiCall.Builder<WalletResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/wallets/{id}.json")
                        .templateParam(param -> param.key("id").value(id).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, WalletResponse.class))
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
     * Updates the wallet's editable attributes. Only `name` is editable; any other attribute in the
     * body is ignored. Send only the attributes to change.
     * @param  id  Required parameter: The Advanced Billing id of the wallet.
     * @param  body  Optional parameter:
     * @return    Returns the WalletResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WalletResponse updateWallet(
            final int id,
            final UpdateWalletRequest body) throws ApiException, IOException {
        return prepareUpdateWalletRequest(id, body).execute();
    }

    /**
     * Builds the ApiCall object for updateWallet.
     */
    private ApiCall<WalletResponse, ApiException> prepareUpdateWalletRequest(
            final int id,
            final UpdateWalletRequest body) {
        return new ApiCall.Builder<WalletResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/wallets/{id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("id").value(id).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.PATCH))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, WalletResponse.class))
                        .nullify404(false)
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden. The response body is plain text (`403 Forbidden`), not JSON. Returned when the Wallets feature isn't enabled for the site.",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found",
                                (reason, context) -> new WalletErrorResponseException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Validation failure. Includes a body with no editable attribute (`parameter_missing`), a `name` over 255 characters (`validation_failed`), and an archived wallet (`wallet_archived`).",
                                (reason, context) -> new WalletErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}