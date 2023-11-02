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
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.IssueAdvanceInvoiceRequest;
import com.maxio.advancedbilling.models.VoidInvoiceRequest;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class AdvanceInvoiceController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public AdvanceInvoiceController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Generate an invoice in advance for a subscription's next renewal date. [Please see our
     * docs](reference/Chargify-API.v1.yaml/components/schemas/Invoice) for more information on
     * advance invoices, including eligibility on generating one; for the most part, they function
     * like any other invoice, except they are issued early and have special behavior upon being
     * voided. A subscription may only have one advance invoice per billing period. Attempting to
     * issue an advance invoice when one already exists will return an error. That said,
     * regeneration of the invoice may be forced with the params `force: true`, which will void an
     * advance invoice if one exists and generate a new one. If no advance invoice exists, a new one
     * will be generated. We recommend using either the create or preview endpoints for proforma
     * invoices to preview this advance invoice before using this endpoint to generate it.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  body  Optional parameter: Example:
     * @return    Returns the Invoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Invoice issueAdvanceInvoice(
            final String subscriptionId,
            final IssueAdvanceInvoiceRequest body) throws ApiException, IOException {
        return prepareIssueAdvanceInvoiceRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for issueAdvanceInvoice.
     */
    private ApiCall<Invoice, ApiException> prepareIssueAdvanceInvoiceRequest(
            final String subscriptionId,
            final IssueAdvanceInvoiceRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Invoice, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/advance_invoice/issue.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Invoice.class))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Once an advance invoice has been generated for a subscription's upcoming renewal, it can be
     * viewed through this endpoint. There can only be one advance invoice per subscription per
     * billing cycle.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @return    Returns the Invoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Invoice readAdvanceInvoice(
            final String subscriptionId) throws ApiException, IOException {
        return prepareReadAdvanceInvoiceRequest(subscriptionId).execute();
    }

    /**
     * Builds the ApiCall object for readAdvanceInvoice.
     */
    private ApiCall<Invoice, ApiException> prepareReadAdvanceInvoiceRequest(
            final String subscriptionId) throws IOException {
        return new ApiCall.Builder<Invoice, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/advance_invoice.json")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Invoice.class))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Void a subscription's existing advance invoice. Once voided, it can later be regenerated if
     * desired. A `reason` is required in order to void, and the invoice must have an open status.
     * Voiding will cause any prepayments and credits that were applied to the invoice to be
     * returned to the subscription. For a full overview of the impact of voiding, please [see our
     * help docs](reference/Chargify-API.v1.yaml/components/schemas/Invoice).
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  body  Optional parameter: Example:
     * @return    Returns the Invoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Invoice voidAdvanceInvoice(
            final String subscriptionId,
            final VoidInvoiceRequest body) throws ApiException, IOException {
        return prepareVoidAdvanceInvoiceRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for voidAdvanceInvoice.
     */
    private ApiCall<Invoice, ApiException> prepareVoidAdvanceInvoiceRequest(
            final String subscriptionId,
            final VoidInvoiceRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Invoice, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/advance_invoice/void.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Invoice.class))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }
}