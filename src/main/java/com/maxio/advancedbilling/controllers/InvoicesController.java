/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.controllers;

import com.maxio.advancedbilling.ApiHelper;
import com.maxio.advancedbilling.Server;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorArrayMapResponseException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.ConsolidatedInvoice;
import com.maxio.advancedbilling.models.CreateInvoicePaymentRequest;
import com.maxio.advancedbilling.models.CreateInvoiceRequest;
import com.maxio.advancedbilling.models.CreateMultiInvoicePaymentRequest;
import com.maxio.advancedbilling.models.CreditNote;
import com.maxio.advancedbilling.models.CustomerChangesPreviewResponse;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.InvoiceEventType;
import com.maxio.advancedbilling.models.InvoiceResponse;
import com.maxio.advancedbilling.models.IssueInvoiceRequest;
import com.maxio.advancedbilling.models.ListConsolidatedInvoiceSegmentsInput;
import com.maxio.advancedbilling.models.ListCreditNotesInput;
import com.maxio.advancedbilling.models.ListCreditNotesResponse;
import com.maxio.advancedbilling.models.ListInvoiceEventsInput;
import com.maxio.advancedbilling.models.ListInvoiceEventsResponse;
import com.maxio.advancedbilling.models.ListInvoicesInput;
import com.maxio.advancedbilling.models.ListInvoicesResponse;
import com.maxio.advancedbilling.models.MultiInvoicePaymentResponse;
import com.maxio.advancedbilling.models.RecordPaymentRequest;
import com.maxio.advancedbilling.models.RecordPaymentResponse;
import com.maxio.advancedbilling.models.RefundInvoiceRequest;
import com.maxio.advancedbilling.models.SendInvoiceRequest;
import com.maxio.advancedbilling.models.UpdateInvoiceRequest;
import com.maxio.advancedbilling.models.VoidInvoiceRequest;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class InvoicesController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public InvoicesController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Refunds an invoice, segment, or consolidated invoice. ## Partial Refund for Consolidated
     * Invoice A refund less than the total of a consolidated invoice will be split across its
     * segments. For a $50.00 refund on a $100.00 consolidated invoice with one $60.00 segment and
     * one $40.00 segment, the refunded amount will be applied as 50% of each ($30.00 and $20.00,
     * respectively).
     * @param  uid  Required parameter: The unique identifier for the invoice, this does not refer
     *         to the public facing invoice number.
     * @param  body  Optional parameter:
     * @return    Returns the Invoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Invoice refundInvoice(
            final String uid,
            final RefundInvoiceRequest body) throws ApiException, IOException {
        return prepareRefundInvoiceRequest(uid, body).execute();
    }

    /**
     * Builds the ApiCall object for refundInvoice.
     */
    private ApiCall<Invoice, ApiException> prepareRefundInvoiceRequest(
            final String uid,
            final RefundInvoiceRequest body) {
        return new ApiCall.Builder<Invoice, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/invoices/{uid}/refunds.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("uid").value(uid)
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
                                response -> ApiHelper.deserialize(response, Invoice.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Lists invoices for a site. By default, invoices returned on the index will only include
     * totals, not detailed breakdowns for `line_items`, `discounts`, `taxes`, `credits`,
     * `payments`, `custom_fields`, or `refunds`. To include breakdowns, pass the specific field as
     * a key in the query with a value set to `true`.
     * @param  input  ListInvoicesInput object containing request parameters
     * @return    Returns the ListInvoicesResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListInvoicesResponse listInvoices(
            final ListInvoicesInput input) throws ApiException, IOException {
        return prepareListInvoicesRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listInvoices.
     */
    private ApiCall<ListInvoicesResponse, ApiException> prepareListInvoicesRequest(
            final ListInvoicesInput input) {
        return new ApiCall.Builder<ListInvoicesResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/invoices.json")
                        .queryParam(param -> param.key("start_date")
                                .value(input.getStartDate()).isRequired(false))
                        .queryParam(param -> param.key("end_date")
                                .value(input.getEndDate()).isRequired(false))
                        .queryParam(param -> param.key("status")
                                .value((input.getStatus() != null) ? input.getStatus().value() : null).isRequired(false))
                        .queryParam(param -> param.key("subscription_id")
                                .value(input.getSubscriptionId()).isRequired(false))
                        .queryParam(param -> param.key("subscription_group_uid")
                                .value(input.getSubscriptionGroupUid()).isRequired(false))
                        .queryParam(param -> param.key("consolidation_level")
                                .value(input.getConsolidationLevel()).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("direction")
                                .value((input.getDirection() != null) ? input.getDirection().value() : "desc").isRequired(false))
                        .queryParam(param -> param.key("line_items")
                                .value(input.getLineItems()).isRequired(false))
                        .queryParam(param -> param.key("discounts")
                                .value(input.getDiscounts()).isRequired(false))
                        .queryParam(param -> param.key("taxes")
                                .value(input.getTaxes()).isRequired(false))
                        .queryParam(param -> param.key("credits")
                                .value(input.getCredits()).isRequired(false))
                        .queryParam(param -> param.key("payments")
                                .value(input.getPayments()).isRequired(false))
                        .queryParam(param -> param.key("custom_fields")
                                .value(input.getCustomFields()).isRequired(false))
                        .queryParam(param -> param.key("refunds")
                                .value(input.getRefunds()).isRequired(false))
                        .queryParam(param -> param.key("date_field")
                                .value((input.getDateField() != null) ? input.getDateField().value() : "due_date").isRequired(false))
                        .queryParam(param -> param.key("start_datetime")
                                .value(input.getStartDatetime()).isRequired(false))
                        .queryParam(param -> param.key("end_datetime")
                                .value(input.getEndDatetime()).isRequired(false))
                        .queryParam(param -> param.key("customer_ids")
                                .value(input.getCustomerIds()).isRequired(false))
                        .queryParam(param -> param.key("number")
                                .value(input.getNumber()).isRequired(false))
                        .queryParam(param -> param.key("product_ids")
                                .value(input.getProductIds()).isRequired(false))
                        .queryParam(param -> param.key("sort")
                                .value((input.getSort() != null) ? input.getSort().value() : "number").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListInvoicesResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns the details for an invoice. ## PDF Invoice retrieval Individual PDF Invoices can be
     * retrieved by using the "Accept" header application/pdf or appending .pdf as the format
     * portion of the URL: ```curl -u &lt;api_key&gt;:x -H Accept:application/pdf -H
     * https://acme.chargify.com/invoices/inv_8gd8tdhtd3hgr.pdf &gt; output_file.pdf URL:
     * `https://&lt;subdomain&gt;.chargify.com/invoices/&lt;uid&gt;.&lt;format&gt;` Method: GET Required parameters:
     * `uid` Response: A single Invoice. ```.
     * @param  uid  Required parameter: The unique identifier for the invoice, this does not refer
     *         to the public facing invoice number.
     * @return    Returns the Invoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Invoice readInvoice(
            final String uid) throws ApiException, IOException {
        return prepareReadInvoiceRequest(uid).execute();
    }

    /**
     * Builds the ApiCall object for readInvoice.
     */
    private ApiCall<Invoice, ApiException> prepareReadInvoiceRequest(
            final String uid) {
        return new ApiCall.Builder<Invoice, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/invoices/{uid}.json")
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Invoice.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Lists invoice events for a site. Each event contains event "data" (such as an applied
     * payment) as well as a snapshot of the `invoice` at the time of event completion. Exposed
     * event types are: + issue_invoice + apply_credit_note + apply_payment + refund_invoice +
     * void_invoice + void_remainder + backport_invoice + change_invoice_status +
     * change_invoice_collection_method + remove_payment + failed_payment + apply_debit_note +
     * create_debit_note + change_chargeback_status Invoice events are returned in ascending order.
     * If both a `since_date` and `since_id` are provided in request parameters, the `since_date`
     * will be used. Note - invoice events that occurred prior to 09/05/2018 __will not__ contain an
     * `invoice` snapshot.
     * @param  input  ListInvoiceEventsInput object containing request parameters
     * @return    Returns the ListInvoiceEventsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListInvoiceEventsResponse listInvoiceEvents(
            final ListInvoiceEventsInput input) throws ApiException, IOException {
        return prepareListInvoiceEventsRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listInvoiceEvents.
     */
    private ApiCall<ListInvoiceEventsResponse, ApiException> prepareListInvoiceEventsRequest(
            final ListInvoiceEventsInput input) {
        return new ApiCall.Builder<ListInvoiceEventsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/invoices/events.json")
                        .queryParam(param -> param.key("since_date")
                                .value(input.getSinceDate()).isRequired(false))
                        .queryParam(param -> param.key("since_id")
                                .value(input.getSinceId()).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("invoice_uid")
                                .value(input.getInvoiceUid()).isRequired(false))
                        .queryParam(param -> param.key("with_change_invoice_status")
                                .value(input.getWithChangeInvoiceStatus()).isRequired(false))
                        .queryParam(param -> param.key("event_types")
                                .value(InvoiceEventType.toValue(input.getEventTypes())).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListInvoiceEventsResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Applies a payment of a given type against a specific invoice. If you would like to apply a
     * payment across multiple invoices, you can use the [Record Payment for Multiple
     * Invoices]($e/Invoices/recordPaymentForMultipleInvoices) endpoint.
     * @param  uid  Required parameter: The unique identifier for the invoice, this does not refer
     *         to the public facing invoice number.
     * @param  body  Optional parameter:
     * @return    Returns the Invoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Invoice recordPaymentForInvoice(
            final String uid,
            final CreateInvoicePaymentRequest body) throws ApiException, IOException {
        return prepareRecordPaymentForInvoiceRequest(uid, body).execute();
    }

    /**
     * Builds the ApiCall object for recordPaymentForInvoice.
     */
    private ApiCall<Invoice, ApiException> prepareRecordPaymentForInvoiceRequest(
            final String uid,
            final CreateInvoicePaymentRequest body) {
        return new ApiCall.Builder<Invoice, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/invoices/{uid}/payments.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("uid").value(uid)
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
                                response -> ApiHelper.deserialize(response, Invoice.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Records an external payment against multiple invoices. To apply a payment to multiple
     * invoices, at minimum, specify the `amount` and `applications` (i.e., `invoice_uid` and
     * `amount`) details. Note that the invoice payment amounts must be greater than 0. Total amount
     * must be greater or equal to invoices payment amount sum.
     * @param  body  Optional parameter:
     * @return    Returns the MultiInvoicePaymentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public MultiInvoicePaymentResponse recordPaymentForMultipleInvoices(
            final CreateMultiInvoicePaymentRequest body) throws ApiException, IOException {
        return prepareRecordPaymentForMultipleInvoicesRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for recordPaymentForMultipleInvoices.
     */
    private ApiCall<MultiInvoicePaymentResponse, ApiException> prepareRecordPaymentForMultipleInvoicesRequest(
            final CreateMultiInvoicePaymentRequest body) {
        return new ApiCall.Builder<MultiInvoicePaymentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/invoices/payments.json")
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
                                response -> ApiHelper.deserialize(response, MultiInvoicePaymentResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Lists credit notes for a site. Credit Notes are like inverse invoices. They reduce the amount
     * a customer owes. By default, the credit notes returned by this endpoint will exclude the
     * arrays of `line_items`, `discounts`, `taxes`, `applications`, or `refunds`. To include these
     * arrays, pass the specific field as a key in the query with a value set to `true`.
     * @param  input  ListCreditNotesInput object containing request parameters
     * @return    Returns the ListCreditNotesResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListCreditNotesResponse listCreditNotes(
            final ListCreditNotesInput input) throws ApiException, IOException {
        return prepareListCreditNotesRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listCreditNotes.
     */
    private ApiCall<ListCreditNotesResponse, ApiException> prepareListCreditNotesRequest(
            final ListCreditNotesInput input) {
        return new ApiCall.Builder<ListCreditNotesResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/credit_notes.json")
                        .queryParam(param -> param.key("subscription_id")
                                .value(input.getSubscriptionId()).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("line_items")
                                .value(input.getLineItems()).isRequired(false))
                        .queryParam(param -> param.key("discounts")
                                .value(input.getDiscounts()).isRequired(false))
                        .queryParam(param -> param.key("taxes")
                                .value(input.getTaxes()).isRequired(false))
                        .queryParam(param -> param.key("refunds")
                                .value(input.getRefunds()).isRequired(false))
                        .queryParam(param -> param.key("applications")
                                .value(input.getApplications()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListCreditNotesResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns the details for a credit note.
     * @param  uid  Required parameter: The unique identifier of the credit note
     * @return    Returns the CreditNote response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CreditNote readCreditNote(
            final String uid) throws ApiException, IOException {
        return prepareReadCreditNoteRequest(uid).execute();
    }

    /**
     * Builds the ApiCall object for readCreditNote.
     */
    private ApiCall<CreditNote, ApiException> prepareReadCreditNoteRequest(
            final String uid) {
        return new ApiCall.Builder<CreditNote, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/credit_notes/{uid}.json")
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CreditNote.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Records an external payment made against a subscription that will pay partially or in full
     * one or more invoices. Payment will be applied starting with the oldest open invoice and then
     * next oldest, and so on until the amount of the payment is fully consumed. Excess payment will
     * result in the creation of a prepayment on the Invoice Account. Only ungrouped or primary
     * subscriptions may be paid using the "bulk" payment request.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  body  Optional parameter:
     * @return    Returns the RecordPaymentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public RecordPaymentResponse recordPaymentForSubscription(
            final int subscriptionId,
            final RecordPaymentRequest body) throws ApiException, IOException {
        return prepareRecordPaymentForSubscriptionRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for recordPaymentForSubscription.
     */
    private ApiCall<RecordPaymentResponse, ApiException> prepareRecordPaymentForSubscriptionRequest(
            final int subscriptionId,
            final RecordPaymentRequest body) {
        return new ApiCall.Builder<RecordPaymentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/payments.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
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
                                response -> ApiHelper.deserialize(response, RecordPaymentResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Reopens any invoice with the "canceled" status. Invoices enter "canceled" status if they were
     * open at the time the subscription was canceled (whether through dunning or an intentional
     * cancellation). Invoices with "canceled" status are no longer considered to be due. Once
     * reopened, they are considered due for payment. Payment may then be captured in one of the
     * following ways: - Reactivating the subscription, which will capture all open invoices (See
     * note below about automatic reopening of invoices.) - Recording a payment directly against the
     * invoice A note about reactivations: any canceled invoices from the most recent active period
     * are automatically opened as a part of the reactivation process. Reactivating via this
     * endpoint prior to reactivation is only necessary when you wish to capture older invoices from
     * previous periods during the reactivation. ### Reopening Consolidated Invoices When reopening
     * a consolidated invoice, all of its canceled segments will also be reopened.
     * @param  uid  Required parameter: The unique identifier for the invoice, this does not refer
     *         to the public facing invoice number.
     * @return    Returns the Invoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Invoice reopenInvoice(
            final String uid) throws ApiException, IOException {
        return prepareReopenInvoiceRequest(uid).execute();
    }

    /**
     * Builds the ApiCall object for reopenInvoice.
     */
    private ApiCall<Invoice, ApiException> prepareReopenInvoiceRequest(
            final String uid) {
        return new ApiCall.Builder<Invoice, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/invoices/{uid}/reopen.json")
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Invoice.class))
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("Not Found:'{$response.body}'",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Voids any invoice with the "open" or "canceled" status. It will also allow voiding of an
     * invoice with the "pending" status if it is not a consolidated invoice.
     * @param  uid  Required parameter: The unique identifier for the invoice, this does not refer
     *         to the public facing invoice number.
     * @param  body  Optional parameter:
     * @return    Returns the Invoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Invoice voidInvoice(
            final String uid,
            final VoidInvoiceRequest body) throws ApiException, IOException {
        return prepareVoidInvoiceRequest(uid, body).execute();
    }

    /**
     * Builds the ApiCall object for voidInvoice.
     */
    private ApiCall<Invoice, ApiException> prepareVoidInvoiceRequest(
            final String uid,
            final VoidInvoiceRequest body) {
        return new ApiCall.Builder<Invoice, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/invoices/{uid}/void.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("uid").value(uid)
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
                                response -> ApiHelper.deserialize(response, Invoice.class))
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("Not Found:'{$response.body}'",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Lists segments for a consolidated invoice. Invoice segments returned on the index will only
     * include totals, not detailed breakdowns for `line_items`, `discounts`, `taxes`, `credits`,
     * `payments`, or `custom_fields`.
     * @param  input  ListConsolidatedInvoiceSegmentsInput object containing request parameters
     * @return    Returns the ConsolidatedInvoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ConsolidatedInvoice listConsolidatedInvoiceSegments(
            final ListConsolidatedInvoiceSegmentsInput input) throws ApiException, IOException {
        return prepareListConsolidatedInvoiceSegmentsRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listConsolidatedInvoiceSegments.
     */
    private ApiCall<ConsolidatedInvoice, ApiException> prepareListConsolidatedInvoiceSegmentsRequest(
            final ListConsolidatedInvoiceSegmentsInput input) {
        return new ApiCall.Builder<ConsolidatedInvoice, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/invoices/{invoice_uid}/segments.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("direction")
                                .value((input.getDirection() != null) ? input.getDirection().value() : "asc").isRequired(false))
                        .templateParam(param -> param.key("invoice_uid").value(input.getInvoiceUid())
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ConsolidatedInvoice.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Creates an ad hoc invoice. ### Basic Behavior You can create a basic invoice by sending an
     * array of line items to this endpoint. Each line item, at a minimum, must include a title, a
     * quantity and a unit price. Example: ```json { "invoice": { "line_items": [ { "title": "A
     * Product", "quantity": 12, "unit_price": "150.00" } ] } } ``` ### Catalog items Instead of
     * creating custom products like in above example, You can pass existing items like products,
     * components. ```json { "invoice": { "line_items": [ { "product_id": "handle:gold-product",
     * "quantity": 2, } ] } } ``` The price for each line item will be calculated as well as a total
     * due amount for the invoice. Multiple line items can be sent. ### Line item types When
     * defining a line item, You can choose one of 3 types for a line item: #### Custom item As
     * shown in the basic behavior example, You can pass `title` and `unit_price` for custom item.
     * #### Product id Product handle (with handle: prefix) or id from the scope of current
     * subscription's site can be provided with `product_id`. By default `unit_price` is taken from
     * product's default price point, but can be overwritten by passing `unit_price` or
     * `product_price_point_id`. If `product_id` is used, following fields cannot be used: `title`,
     * `component_id`. #### Component id Component handle (with handle: prefix) or id from the scope
     * of current subscription's site can be provided with `component_id`. If `component_id` is
     * used, following fields cannot be used: `title`, `product_id`. By default `unit_price` is
     * taken from product's default price point, but can be overwritten by passing `unit_price` or
     * `price_point_id`. At this moment price points are supported only for quantity based, on/off
     * and metered components. For prepaid and event based billing components `unit_price` is
     * required. ### Coupons When creating ad hoc invoice, new discounts can be applied in following
     * way: ```json { "invoice": { "line_items": [ { "product_id": "handle:gold-product",
     * "quantity": 1 } ], "coupons": [ { "code": "COUPONCODE", "percentage": 50.0 } ] } } ``` If You
     * want to use existing coupon for discount creation, only `code` and optional
     * `product_family_id` is needed ```json ... "coupons": [ { "code": "FREESETUP",
     * "product_family_id": 1 } ] ... ``` #### Using Coupon Subcodes You can also use coupon
     * subcodes to apply existing coupons with specific subcodes: ```json ... "coupons": [ {
     * "subcode": "SUB1", "product_family_id": 1 } ] ... ``` **Important:** You cannot specify both
     * `code` and `subcode` for the same coupon. Use either: - `code` to apply a main coupon -
     * `subcode` to apply a specific coupon subcode The API response will include both the main
     * coupon code and the subcode used: ```json ... "coupons": [ { "code": "MAIN123", "subcode":
     * "SUB1", "product_family_id": 1, "percentage": 10, "description": "Special discount" } ] ...
     * ``` ### Coupon options #### Code Coupon `code` will be displayed on invoice discount section.
     * Coupon code can only contain uppercase letters, numbers, and allowed special characters.
     * Lowercase letters will be converted to uppercase. It can be used to select an existing coupon
     * from the catalog, or as an ad hoc coupon when passed with `percentage` or `amount`. ####
     * Subcode Coupon `subcode` allows you to apply existing coupons using their subcodes. When a
     * subcode is used, the API response will include both the main coupon code and the specific
     * subcode that was applied. Subcodes are case-insensitive and will be converted to uppercase
     * automatically. #### Percentage Coupon `percentage` can take values from 0 to 100 and up to 4
     * decimal places. It cannot be used with `amount`. Only for ad hoc coupons, will be ignored if
     * `code` is used to select an existing coupon from the catalog. #### Amount Coupon `amount`
     * takes number value. It cannot be used with `percentage`. Used only when not matching existing
     * coupon by `code`. #### Description Optional `description` will be displayed with coupon
     * `code`. Used only when not matching existing coupon by `code`. #### Product Family id
     * Optional `product_family_id` handle (with handle: prefix) or id is used to match existing
     * coupon within site, when codes are not unique. #### Compounding Strategy Optional
     * `compounding_strategy` for percentage coupons, can take values `compound` or `full-price`.
     * For amount coupons, discounts will be always calculated against the original item price,
     * before other discounts are applied. `compound` strategy: Percentage-based discounts will be
     * calculated against the remaining price, after prior discounts have been calculated. It is set
     * by default. `full-price` strategy: Percentage-based discounts will always be calculated
     * against the original item price, before other discounts are applied. ### Line Item Options
     * #### Period Date Range A custom period date range can be defined for each line item with the
     * `period_range_start` and `period_range_end` parameters. Dates must be sent in the
     * `YYYY-MM-DD` format. `period_range_end` must be greater or equal `period_range_start`. ####
     * Taxes The `taxable` parameter can be sent as `true` if taxes should be calculated for a
     * specific line item. For this to work, the site should be configured to use and calculate
     * taxes. Further, if the site uses Avalara for tax calculations, a `tax_code` parameter should
     * also be sent. For existing catalog items: products/components taxes cannot be overwritten.
     * #### Price Point Price point handle (with handle: prefix) or id from the scope of current
     * subscription's site can be provided with `price_point_id` for components with `component_id`
     * or `product_price_point_id` for products with `product_id` parameter. If price point is
     * passed `unit_price` cannot be used. It can be used only with catalog items products and
     * components. #### Description Optional `description` parameter, it will overwrite default
     * generated description for line item. ### Invoice Options #### Issue Date By default, invoices
     * will be created with a issue date set to today in your site's time zone. The `issue_date`
     * parameter can be sent to alter the default. Only today or dates in the past are accepted.
     * This date is interpreted and validated in your site's time zone. The format for `issue_date`
     * is `YYYY-MM-DD`. #### Net Terms By default, invoices will be created with a due date matching
     * the date of invoice creation. If a different due date is desired, the `net_terms` parameter
     * can be sent indicating the number of days in advance the due date should be. #### Addresses
     * The seller, shipping and billing addresses can be sent to override the site's defaults. Each
     * address requires to send a `first_name` at a minimum in order to work. See below for the
     * details on which parameters can be sent for each address object. #### Memo and Payment
     * Instructions A custom memo can be sent with the `memo` parameter to override the site's
     * default. Likewise, custom payment instructions can be sent with the `payment_instructions`
     * parameter. #### Status By default, invoices will be created with open status. Possible
     * alternative is `draft`.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  body  Optional parameter:
     * @return    Returns the InvoiceResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public InvoiceResponse createInvoice(
            final int subscriptionId,
            final CreateInvoiceRequest body) throws ApiException, IOException {
        return prepareCreateInvoiceRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for createInvoice.
     */
    private ApiCall<InvoiceResponse, ApiException> prepareCreateInvoiceRequest(
            final int subscriptionId,
            final CreateInvoiceRequest body) {
        return new ApiCall.Builder<InvoiceResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/invoices.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
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
                                response -> ApiHelper.deserialize(response, InvoiceResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorArrayMapResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Updates an ad hoc invoice while it is in the `draft` state. **Important: only invoices with
     * the `adhoc` role and `draft` status can be updated.** Any other invoice — issued, or with a
     * different role (e.g. `renewal`, `signup`) — cannot be updated through this endpoint and the
     * request returns a `422` error. If the invoice does not belong to the provided subscription, a
     * `404` error is returned. Only the attributes submitted in the request are changed — omitted
     * attributes keep their current values. ### Line Items The `line_items` array describes changes
     * to the invoice's line items. Line items not referenced in the array remain unchanged. ####
     * Adding a line item A line item without a `uid` is added to the invoice. The same line item
     * types and options as on invoice creation are supported (custom items, `product_id`,
     * `component_id`, price points, period date ranges, taxes). #### Updating a line item A line
     * item with the `uid` of an existing line item updates that line item with the submitted
     * attributes. Amounts and taxes are recalculated. #### Removing a line item A line item with a
     * `uid` and `"_destroy": true` is removed from the invoice. Other line items remain unchanged.
     * Referencing a `uid` which does not exist on the invoice returns a `422` error. ### Coupons
     * When the `coupons` key is present, the submitted coupons replace all discounts currently
     * applied to the invoice. Send an empty array to remove all discounts. Coupon options are the
     * same as on invoice creation. ### Invoice Options #### Issue Date and Net Terms The
     * `issue_date` parameter can be sent to change the invoice's issue date. Only today or dates in
     * the past are accepted. The date is interpreted and validated in your site's time zone, using
     * the `YYYY-MM-DD` format. The `net_terms` parameter indicates the number of days after the
     * issue date on which the invoice is due. The due date is recalculated whenever the issue date
     * or net terms change. #### Addresses The seller, shipping and billing addresses can be sent to
     * replace the addresses on the invoice. Each address requires to send a `first_name` at a
     * minimum in order to work. Taxes are recalculated after an address change. #### Memo and
     * Payment Instructions A custom memo can be sent with the `memo` parameter. Likewise, custom
     * payment instructions can be sent with the `payment_instructions` parameter.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  uid  Required parameter: The unique identifier for the invoice, this does not refer
     *         to the public facing invoice number.
     * @param  body  Optional parameter:
     * @return    Returns the InvoiceResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public InvoiceResponse updateInvoice(
            final int subscriptionId,
            final String uid,
            final UpdateInvoiceRequest body) throws ApiException, IOException {
        return prepareUpdateInvoiceRequest(subscriptionId, uid, body).execute();
    }

    /**
     * Builds the ApiCall object for updateInvoice.
     */
    private ApiCall<InvoiceResponse, ApiException> prepareUpdateInvoiceRequest(
            final int subscriptionId,
            final String uid,
            final UpdateInvoiceRequest body) {
        return new ApiCall.Builder<InvoiceResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/invoices/{uid}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("uid").value(uid)
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
                                response -> ApiHelper.deserialize(response, InvoiceResponse.class))
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("Not Found:'{$response.body}'",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorArrayMapResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Deletes an ad hoc invoice while it is in the `draft` state. **Important: only invoices with
     * the `adhoc` role and `draft` status can be deleted.** Any other invoice — issued, or with a
     * different role (e.g. `renewal`, `signup`) — cannot be deleted through this endpoint and the
     * request returns a `422` error. Issued invoices should be voided instead. If the invoice does
     * not belong to the provided subscription, a `404` error is returned. A successful deletion
     * returns a `204 No Content` response and the invoice is permanently removed.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  uid  Required parameter: The unique identifier for the invoice, this does not refer
     *         to the public facing invoice number.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void deleteInvoice(
            final int subscriptionId,
            final String uid) throws ApiException, IOException {
        prepareDeleteInvoiceRequest(subscriptionId, uid).execute();
    }

    /**
     * Builds the ApiCall object for deleteInvoice.
     */
    private ApiCall<Void, ApiException> prepareDeleteInvoiceRequest(
            final int subscriptionId,
            final String uid) {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/invoices/{uid}.json")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("Not Found:'{$response.body}'",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Sends an invoice to the customer via email. This endpoint supports the delivery of both
     * ad-hoc and automatically generated invoices. Additionally, this endpoint supports email
     * delivery to direct recipients, carbon-copy (cc) recipients, and blind carbon-copy (bcc)
     * recipients. **File Attachments**: You can attach files to invoice emails using
     * `attachment_urls[]` parameter by providing URLs to the files you want to attach. When using
     * attachments, the request must use `multipart/form-data` content type. Max 10 files, 10MB per
     * file. If no recipient email addresses are specified in the request, then the subscription's
     * default email configuration will be used. For example, if `recipient_emails` is left blank,
     * then the invoice will be delivered to the subscription's customer email address. On success,
     * a 204 no-content response will be returned. The response does not indicate that email(s) have
     * been delivered, but instead indicates that emails have been successfully queued for delivery.
     * If _any_ invalid or malformed email address is found in the request body, the entire request
     * will be rejected and a 422 response will be returned.
     * @param  uid  Required parameter: The unique identifier for the invoice, this does not refer
     *         to the public facing invoice number.
     * @param  body  Optional parameter:
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void sendInvoice(
            final String uid,
            final SendInvoiceRequest body) throws ApiException, IOException {
        prepareSendInvoiceRequest(uid, body).execute();
    }

    /**
     * Builds the ApiCall object for sendInvoice.
     */
    private ApiCall<Void, ApiException> prepareSendInvoiceRequest(
            final String uid,
            final SendInvoiceRequest body) {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/invoices/{uid}/deliveries.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Previews the effect of customer information changes on an open invoice. Customer information
     * may change after an invoice is issued, which may lead to a mismatch between customer
     * information that is present on an open invoice and actual customer information. This endpoint
     * allows you to preview these differences, if any. The endpoint doesn't accept a request body.
     * Customer information differences are calculated on the application side.
     * @param  uid  Required parameter: The unique identifier for the invoice, this does not refer
     *         to the public facing invoice number.
     * @return    Returns the CustomerChangesPreviewResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CustomerChangesPreviewResponse previewCustomerInformationChanges(
            final String uid) throws ApiException, IOException {
        return preparePreviewCustomerInformationChangesRequest(uid).execute();
    }

    /**
     * Builds the ApiCall object for previewCustomerInformationChanges.
     */
    private ApiCall<CustomerChangesPreviewResponse, ApiException> preparePreviewCustomerInformationChangesRequest(
            final String uid) {
        return new ApiCall.Builder<CustomerChangesPreviewResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/invoices/{uid}/customer_information/preview.json")
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CustomerChangesPreviewResponse.class))
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("Not Found:'{$response.body}'",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Updates customer information on an open invoice and returns the updated invoice. If you would
     * like to preview changes that will be applied, use the
     * `/invoices/{uid}/customer_information/preview.json` endpoint first. The endpoint doesn't
     * accept a request body. Customer information differences are calculated on the application
     * side.
     * @param  uid  Required parameter: The unique identifier for the invoice, this does not refer
     *         to the public facing invoice number.
     * @return    Returns the Invoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Invoice updateCustomerInformation(
            final String uid) throws ApiException, IOException {
        return prepareUpdateCustomerInformationRequest(uid).execute();
    }

    /**
     * Builds the ApiCall object for updateCustomerInformation.
     */
    private ApiCall<Invoice, ApiException> prepareUpdateCustomerInformationRequest(
            final String uid) {
        return new ApiCall.Builder<Invoice, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/invoices/{uid}/customer_information.json")
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Invoice.class))
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("Not Found:'{$response.body}'",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Issues an invoice that is in "pending" or "draft" status. For example, you can issue an
     * invoice that was created when allocating new quantity on a component and using "accrue
     * charges" option. You cannot issue a pending child invoice that was created for a member
     * subscription in a group. For Remittance subscriptions, the invoice will go into "open" status
     * and payment won't be attempted. The value for `on_failed_payment` would be rejected if sent.
     * Any prepayments or service credits that exist on the subscription will be automatically
     * applied. Additionally, if the setting is enabled, an email will be sent for the issued
     * invoice. For Automatic subscriptions, prepayments and service credits will apply to the
     * invoice before payment is attempted. On successful payment, the invoice will go into "paid"
     * status and email will be sent to the customer (if setting applies). When payment fails, the
     * next event depends on the `on_failed_payment` value: - `leave_open_invoice` - prepayments and
     * credits applied to invoice; invoice status set to "open"; email sent to the customer for the
     * issued invoice (if setting applies); payment failure recorded in the invoice history. This is
     * the default option. - `rollback_to_pending` - prepayments and credits not applied; invoice
     * remains in "pending" status; no email sent to the customer; payment failure recorded in the
     * invoice history. - `initiate_dunning` - prepayments and credits applied to the invoice;
     * invoice status set to "open"; email sent to the customer for the issued invoice (if setting
     * applies); payment failure recorded in the invoice history; subscription will most likely go
     * into "past_due" or "canceled" state (depending upon net terms and dunning settings).
     * @param  uid  Required parameter: The unique identifier for the invoice, this does not refer
     *         to the public facing invoice number.
     * @param  body  Optional parameter:
     * @return    Returns the Invoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Invoice issueInvoice(
            final String uid,
            final IssueInvoiceRequest body) throws ApiException, IOException {
        return prepareIssueInvoiceRequest(uid, body).execute();
    }

    /**
     * Builds the ApiCall object for issueInvoice.
     */
    private ApiCall<Invoice, ApiException> prepareIssueInvoiceRequest(
            final String uid,
            final IssueInvoiceRequest body) {
        return new ApiCall.Builder<Invoice, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/invoices/{uid}/issue.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("uid").value(uid)
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
                                response -> ApiHelper.deserialize(response, Invoice.class))
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("Not Found:'{$response.body}'",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}