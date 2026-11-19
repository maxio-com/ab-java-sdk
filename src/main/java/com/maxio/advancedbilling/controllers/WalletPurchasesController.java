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
import com.maxio.advancedbilling.models.CreateWalletPurchaseRequest;
import com.maxio.advancedbilling.models.WalletPurchasePreviewResponse;
import com.maxio.advancedbilling.models.WalletPurchaseResultResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class WalletPurchasesController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public WalletPurchasesController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Purchases prepaid units for the wallet and charges the subscription's payment method for
     * them, using the wallet's `price_point_id` unless a different price point is named. A
     * successful purchase writes a grant of origin `purchase`, with its expiration following the
     * funding entitlement's grant expiration policy. How "charged" works depends on the
     * subscription's collection method. For card/automatic collection, the payment is attempted
     * immediately; a decline writes nothing to the wallet, and the call fails with a `422` naming
     * the gateway's decline reason. For invoice-billed (remittance) subscriptions, there's no
     * immediate charge to decline: an invoice is drafted, the wallet is credited right away, and
     * the invoice is issued afterward. If issuing the invoice fails at that point, the invoice is
     * left in draft state and reported for follow-up, but the call still returns `201` and the
     * units already credited are **not** rolled back. See [Preview Wallet
     * Purchase]($e/Wallet%20Purchases/previewWalletPurchase) to quote a price before charging
     * anything.
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
     * @return    Returns the WalletPurchaseResultResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WalletPurchaseResultResponse createWalletPurchase(
            final int walletId,
            final String idempotencyKey,
            final CreateWalletPurchaseRequest body) throws ApiException, IOException {
        return prepareCreateWalletPurchaseRequest(walletId, idempotencyKey, body).execute();
    }

    /**
     * Builds the ApiCall object for createWalletPurchase.
     */
    private ApiCall<WalletPurchaseResultResponse, ApiException> prepareCreateWalletPurchaseRequest(
            final int walletId,
            final String idempotencyKey,
            final CreateWalletPurchaseRequest body) {
        return new ApiCall.Builder<WalletPurchaseResultResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/wallets/{wallet_id}/purchases.json")
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
                                response -> ApiHelper.deserialize(response, WalletPurchaseResultResponse.class))
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
                                 ErrorCase.setReason("Returned in two cases, both with nothing new charged or written. `idempotency_request_in_progress`: a purchase with the same `Idempotency-Key` is still running; retry with the same key once it finishes. `idempotency_key_outcome_unknown`: an earlier purchase with this key ended with a server error or an unexpected failure before its result was recorded, so it may or may not have charged the customer. Check the subscription's invoices before buying again under a new key.",
                                (reason, context) -> new WalletErrorResponseException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Validation or payment failure, or an `Idempotency-Key` reused with a different request (`idempotency_key_mismatch`). Validation failures include a missing `purchase` root, a missing, malformed, non-positive, or out-of-range `quantity`, a `price_point_id` that doesn't belong to the wallet's billing product, an archived, custom, or otherwise unusable price point, no price point to purchase at (neither sent nor set on the wallet), a memo over 255 characters, an archived wallet, a price point with no price in the subscription's currency, a declined payment (message includes the gateway's own detail), an invoice that couldn't be created at all, a payment that settled but whose units could not be credited (`purchase_paid_but_uncredited`, whose message ends with the paid invoice's uid so it can be reconciled), a declined payment whose invoice could not be voided and is still open (`purchase_declined_invoice_open`), a purchase that failed before payment and left its invoice open (`purchase_invoice_left_open`), and a wallet whose billing product isn't a Wallet Product (only possible for a wallet created before Wallet Products became required).\n\n`purchase_paid_but_uncredited`, `purchase_declined_invoice_open` and `purchase_invoice_left_open` bodies also carry `invoice_uid` and `invoice_number`. With an `Idempotency-Key`, these three responses are stored and replayed like a success.",
                                (reason, context) -> new WalletErrorResponseException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("`purchase_payment_outcome_unknown`: the payment was attempted but the gateway did not confirm whether the card was charged. Nothing is credited by this call; if the invoice turns out to be paid, the units are credited automatically (see [Purchasing Units](page:introduction/basic-concepts/wallets#purchasing-units)). The body includes `invoice_uid` and `invoice_number` when an invoice was created; check that invoice before buying again. Retrying with the same `Idempotency-Key` returns `409` (`idempotency_key_outcome_unknown`) rather than charging again.",
                                (reason, context) -> new WalletErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Quotes the price for a purchase at the given quantity and price point, without charging the
     * payment method or writing to the wallet. Takes the same parameters as [Create Wallet
     * Purchase]($e/Wallet%20Purchases/createWalletPurchase).
     * @param  walletId  Required parameter: The Advanced Billing id of the wallet.
     * @param  body  Optional parameter:
     * @return    Returns the WalletPurchasePreviewResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WalletPurchasePreviewResponse previewWalletPurchase(
            final int walletId,
            final CreateWalletPurchaseRequest body) throws ApiException, IOException {
        return preparePreviewWalletPurchaseRequest(walletId, body).execute();
    }

    /**
     * Builds the ApiCall object for previewWalletPurchase.
     */
    private ApiCall<WalletPurchasePreviewResponse, ApiException> preparePreviewWalletPurchaseRequest(
            final int walletId,
            final CreateWalletPurchaseRequest body) {
        return new ApiCall.Builder<WalletPurchasePreviewResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/wallets/{wallet_id}/purchases/preview.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("wallet_id").value(walletId).isRequired(false)
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
                                response -> ApiHelper.deserialize(response, WalletPurchasePreviewResponse.class))
                        .nullify404(false)
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden. The response body is plain text (`403 Forbidden`), not JSON. Returned when the Wallets feature isn't enabled for the site.",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found",
                                (reason, context) -> new WalletErrorResponseException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Validation failure. Same cases as Create Wallet Purchase, minus the payment-outcome cases, since nothing is charged.",
                                (reason, context) -> new WalletErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}