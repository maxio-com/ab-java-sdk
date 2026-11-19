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
import com.maxio.advancedbilling.models.CreateWalletAdjustmentRequest;
import com.maxio.advancedbilling.models.WalletGrantResultResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class WalletAdjustmentsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public WalletAdjustmentsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Posts a signed correction against a specific grant (or, for an overdraft entry, against the
     * overdraft): positive adds units to the grant, negative removes them. `reason` is required and
     * is written to the ledger row's `memo`. Writes exactly one ledger row, of kind `adjustment`.
     * Use `source_transaction_id` to name a specific `debit` row when you're correcting one
     * recorded consumption rather than the grant's balance as a whole. When it names a
     * grant-attributed debit, it's recorded for audit only: naming it doesn't change how `amount`
     * is applied, and more than one adjustment may name the same row. When it names an overdraft
     * entry, it switches the correction to the overdraft path described below. An overdraft entry
     * (a `debit` row with no `grant_id`, written when an `allow_negative` wallet consumes past its
     * grants) can be corrected without a `grant_id`. That correction is credit-only, credits no
     * grant, and is bounded by the usage the entry still records and by the overdraft the wallet
     * still owes. Once a later grant has repaid the overdraft, correct that grant's balance
     * instead. An adjustment corrects the ledger, so it works on the grant's recorded remainder,
     * `posted_remaining`, not on `remaining`, which on a metered wallet read through [Read
     * Wallet]($e/Wallets/readWallet) also subtracts usage not yet posted. Send `posted_remaining`
     * back as `expected_remaining`; sending `remaining` on a metered wallet with pending usage
     * returns `409`. `expected_remaining` and `expected_source_corrections` are optional
     * optimistic-concurrency checks; see their field descriptions. Use them when the correction's
     * `amount` was derived from a value read earlier that might have moved since.
     * @param  walletId  Required parameter: The Advanced Billing id of the wallet.
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
     * @return    Returns the WalletGrantResultResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WalletGrantResultResponse createWalletAdjustment(
            final int walletId,
            final String idempotencyKey,
            final CreateWalletAdjustmentRequest body) throws ApiException, IOException {
        return prepareCreateWalletAdjustmentRequest(walletId, idempotencyKey, body).execute();
    }

    /**
     * Builds the ApiCall object for createWalletAdjustment.
     */
    private ApiCall<WalletGrantResultResponse, ApiException> prepareCreateWalletAdjustmentRequest(
            final int walletId,
            final String idempotencyKey,
            final CreateWalletAdjustmentRequest body) {
        return new ApiCall.Builder<WalletGrantResultResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/wallets/{wallet_id}/adjustments.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("wallet_id").value(walletId).isRequired(false)
                                .shouldEncode(true))
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
                                response -> ApiHelper.deserialize(response, WalletGrantResultResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("The `Idempotency-Key` header is empty, longer than 255 characters, or contains characters other than printable ASCII. Nothing is written.",
                                (reason, context) -> new WalletErrorResponseException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden. The response body is plain text (`403 Forbidden`), not JSON. Returned when the Wallets feature isn't enabled for the site.",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found",
                                (reason, context) -> new WalletErrorResponseException(reason, context)))
                        .localErrorCase("409",
                                 ErrorCase.setReason("Returned in two cases. A request with the same `Idempotency-Key` was still being processed when this retry's wait for it timed out (`idempotency_request_in_progress`); retry with the same key once it finishes. Or the state the `amount` was derived from has moved: either the grant's `posted_remaining` no longer matches `expected_remaining`, or the corrections already posted against `source_transaction_id` no longer sum to `expected_source_corrections`. Nothing is written. Reload and re-derive the amount.",
                                (reason, context) -> new WalletErrorResponseException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Validation failure, or an `Idempotency-Key` reused with a different request (`idempotency_key_mismatch`). Validation failures include a missing `reason`, a `reason` over 255 characters, a missing or not-found `grant_id`, a zero, malformed, or out-of-range `amount`, a negative adjustment exceeding the grant's `posted_remaining`, a positive adjustment exceeding the grant's `original`, a malformed `expected_remaining` or `expected_source_corrections` (including an empty string, which is treated as malformed rather than omitted), a `source_transaction_id` not on this wallet or not a `debit` row, an overdraft correction that debits instead of credits (\"Overdraft usage can only be corrected downward\"), that exceeds the usage the entry still records (\"Adjustment exceeds the usage this entry still records\"), or that exceeds the overdraft the wallet still owes (\"Adjustment exceeds the wallet's outstanding overdraft\", followed by how much can still be corrected), a `grant_id` sent with an overdraft entry, and an archived wallet.",
                                (reason, context) -> new WalletErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}