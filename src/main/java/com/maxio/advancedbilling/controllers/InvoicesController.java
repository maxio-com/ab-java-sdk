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
import com.maxio.advancedbilling.exceptions.NestedErrorResponseException;
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
import com.maxio.advancedbilling.models.ListCreditNotesInput;
import com.maxio.advancedbilling.models.ListCreditNotesResponse;
import com.maxio.advancedbilling.models.ListInvoiceEventsInput;
import com.maxio.advancedbilling.models.ListInvoiceEventsResponse;
import com.maxio.advancedbilling.models.ListInvoiceSegmentsInput;
import com.maxio.advancedbilling.models.ListInvoicesInput;
import com.maxio.advancedbilling.models.ListInvoicesResponse;
import com.maxio.advancedbilling.models.MultiInvoicePaymentResponse;
import com.maxio.advancedbilling.models.PaymentResponse;
import com.maxio.advancedbilling.models.RecordPaymentRequest;
import com.maxio.advancedbilling.models.RefundInvoiceRequest;
import com.maxio.advancedbilling.models.SendInvoiceRequest;
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
     * Refund an invoice, segment, or consolidated invoice. ## Partial Refund for Consolidated
     * Invoice A refund less than the total of a consolidated invoice will be split across its
     * segments. A $50.00 refund on a $100.00 consolidated invoice with one $60.00 and one $40.00
     * segment, the refunded amount will be applied as 50% of each ($30.00 and $20.00 respectively).
     * @param  uid  Required parameter: The unique identifier for the invoice, this does not refer
     *         to the public facing invoice number.
     * @param  body  Optional parameter: Example:
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
            final RefundInvoiceRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Invoice, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/invoices/{uid}/refunds.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Invoice.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * By default, invoices returned on the index will only include totals, not detailed breakdowns
     * for `line_items`, `discounts`, `taxes`, `credits`, `payments`, `custom_fields`, or `refunds`.
     * To include breakdowns, pass the specific field as a key in the query with a value set to
     * `true`.
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
            final ListInvoicesInput input) throws IOException {
        return new ApiCall.Builder<ListInvoicesResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
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
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListInvoicesResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Use this endpoint to retrieve the details for an invoice.
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
            final String uid) throws IOException {
        return new ApiCall.Builder<Invoice, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/invoices/{uid}.json")
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Invoice.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This endpoint returns a list of invoice events. Each event contains event "data" (such as an
     * applied payment) as well as a snapshot of the `invoice` at the time of event completion.
     * Exposed event types are: + issue_invoice + apply_credit_note + apply_payment + refund_invoice
     * + void_invoice + void_remainder + backport_invoice + change_invoice_status +
     * change_invoice_collection_method + remove_payment Invoice events are returned in ascending
     * order. If both a `since_date` and `since_id` are provided in request parameters, the
     * `since_date` will be used. Note - invoice events that occurred prior to 09/05/2018 __will
     * not__ contain an `invoice` snapshot.
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
            final ListInvoiceEventsInput input) throws IOException {
        return new ApiCall.Builder<ListInvoiceEventsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
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
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListInvoiceEventsResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This API call should be used when you want to record a payment of a given type against a
     * specific invoice. If you would like to apply a payment across multiple invoices, you can use
     * the Bulk Payment endpoint. ## Create a Payment from the existing payment profile In order to
     * apply a payment to an invoice using an existing payment profile, specify `type` as `payment`,
     * the amount less than the invoice total, and the customer's `payment_profile_id`. The ID of a
     * payment profile might be retrieved via the Payment Profiles API endpoint. ``` { "type":
     * "payment", "payment": { "amount": 10.00, "payment_profile_id": 123 } } ``` ## Create a
     * Payment from the Subscription's Prepayment Account In order apply a prepayment to an invoice,
     * specify the `type` as `prepayment`, and also the `amount`. ``` { "type": "prepayment",
     * "payment": { "amount": 10.00 } } ``` Note that the `amount` must be less than or equal to the
     * Subscription's Prepayment account balance. ## Create a Payment from the Subscription's
     * Service Credit Account In order to apply a service credit to an invoice, specify the `type`
     * as `service_credit`, and also the `amount`: ``` { "type": "service_credit", "payment": {
     * "amount": 10.00 } } ``` Note that Chargify will attempt to fully pay the invoice's
     * `due_amount` from the Subscription's Service Credit account. At this time, partial payments
     * from a Service Credit Account are only allowed for consolidated invoices (subscription
     * groups). Therefore, for normal invoices the Service Credit account balance must be greater
     * than or equal to the invoice's `due_amount`.
     * @param  uid  Required parameter: The unique identifier for the invoice, this does not refer
     *         to the public facing invoice number.
     * @param  body  Optional parameter: Example:
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
            final CreateInvoicePaymentRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Invoice, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/invoices/{uid}/payments.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Invoice.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This API call should be used when you want to record an external payment against multiple
     * invoices. In order apply a payment to multiple invoices, at minimum, specify the `amount` and
     * `applications` (i.e., `invoice_uid` and `amount`) details. ``` { "payment": { "memo": "to pay
     * the bills", "details": "check number 8675309", "method": "check", "amount": "250.00",
     * "applications": [ { "invoice_uid": "inv_8gk5bwkct3gqt", "amount": "100.00" }, {
     * "invoice_uid": "inv_7bc6bwkct3lyt", "amount": "150.00" } ] } } ``` Note that the invoice
     * payment amounts must be greater than 0. Total amount must be greater or equal to invoices
     * payment amount sum.
     * @param  body  Optional parameter: Example:
     * @return    Returns the MultiInvoicePaymentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public MultiInvoicePaymentResponse recordExternalPaymentForInvoices(
            final CreateMultiInvoicePaymentRequest body) throws ApiException, IOException {
        return prepareRecordExternalPaymentForInvoicesRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for recordExternalPaymentForInvoices.
     */
    private ApiCall<MultiInvoicePaymentResponse, ApiException> prepareRecordExternalPaymentForInvoicesRequest(
            final CreateMultiInvoicePaymentRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<MultiInvoicePaymentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/invoices/payments.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, MultiInvoicePaymentResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Credit Notes are like inverse invoices. They reduce the amount a customer owes. By default,
     * the credit notes returned by this endpoint will exclude the arrays of `line_items`,
     * `discounts`, `taxes`, `applications`, or `refunds`. To include these arrays, pass the
     * specific field as a key in the query with a value set to `true`.
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
            final ListCreditNotesInput input) throws IOException {
        return new ApiCall.Builder<ListCreditNotesResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
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
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListCreditNotesResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Use this endpoint to retrieve the details for a credit note.
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
            final String uid) throws IOException {
        return new ApiCall.Builder<CreditNote, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/credit_notes/{uid}.json")
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CreditNote.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Record an external payment made against a subscription that will pay partially or in full one
     * or more invoices. Payment will be applied starting with the oldest open invoice and then next
     * oldest, and so on until the amount of the payment is fully consumed. Excess payment will
     * result in the creation of a prepayment on the Invoice Account. Only ungrouped or primary
     * subscriptions may be paid using the "bulk" payment request.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  body  Optional parameter: Example:
     * @return    Returns the PaymentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PaymentResponse recordPaymentForSubscription(
            final String subscriptionId,
            final RecordPaymentRequest body) throws ApiException, IOException {
        return prepareRecordPaymentForSubscriptionRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for recordPaymentForSubscription.
     */
    private ApiCall<PaymentResponse, ApiException> prepareRecordPaymentForSubscriptionRequest(
            final String subscriptionId,
            final RecordPaymentRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<PaymentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/payments.json")
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
                                response -> ApiHelper.deserialize(response, PaymentResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This endpoint allows you to reopen any invoice with the "canceled" status. Invoices enter
     * "canceled" status if they were open at the time the subscription was canceled (whether
     * through dunning or an intentional cancellation). Invoices with "canceled" status are no
     * longer considered to be due. Once reopened, they are considered due for payment. Payment may
     * then be captured in one of the following ways: - Reactivating the subscription, which will
     * capture all open invoices (See note below about automatic reopening of invoices.) - Recording
     * a payment directly against the invoice A note about reactivations: any canceled invoices from
     * the most recent active period are automatically opened as a part of the reactivation process.
     * Reactivating via this endpoint prior to reactivation is only necessary when you wish to
     * capture older invoices from previous periods during the reactivation. ### Reopening
     * Consolidated Invoices When reopening a consolidated invoice, all of its canceled segments
     * will also be reopened.
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
            final String uid) throws IOException {
        return new ApiCall.Builder<Invoice, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/invoices/{uid}/reopen.json")
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Invoice.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This endpoint allows you to void any invoice with the "open" or "canceled" status. It will
     * also allow voiding of an invoice with the "pending" status if it is not a consolidated
     * invoice.
     * @param  uid  Required parameter: The unique identifier for the invoice, this does not refer
     *         to the public facing invoice number.
     * @param  body  Optional parameter: Example:
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
            final VoidInvoiceRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Invoice, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/invoices/{uid}/void.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Invoice.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Invoice segments returned on the index will only include totals, not detailed breakdowns for
     * `line_items`, `discounts`, `taxes`, `credits`, `payments`, or `custom_fields`.
     * @param  input  ListInvoiceSegmentsInput object containing request parameters
     * @return    Returns the ConsolidatedInvoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ConsolidatedInvoice listInvoiceSegments(
            final ListInvoiceSegmentsInput input) throws ApiException, IOException {
        return prepareListInvoiceSegmentsRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listInvoiceSegments.
     */
    private ApiCall<ConsolidatedInvoice, ApiException> prepareListInvoiceSegmentsRequest(
            final ListInvoiceSegmentsInput input) throws IOException {
        return new ApiCall.Builder<ConsolidatedInvoice, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
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
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ConsolidatedInvoice.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This endpoint will allow you to create an ad hoc invoice. ### Basic Behavior You can create a
     * basic invoice by sending an array of line items to this endpoint. Each line item, at a
     * minimum, must include a title, a quantity and a unit price. Example: ```json { "invoice": {
     * "line_items": [ { "title": "A Product", "quantity": 12, "unit_price": "150.00" } ] } } ```
     * ### Catalog items Instead of creating custom products like in above example, You can pass
     * existing items like products, components. ```json { "invoice": { "line_items": [ {
     * "product_id": "handle:gold-product", "quantity": 2, } ] } } ``` The price for each line item
     * will be calculated as well as a total due amount for the invoice. Multiple line items can be
     * sent. ### Line items types When defining line item, You can choose one of 3 types for one
     * line item: #### Custom item Like in basic behavior example above, You can pass `title` and
     * `unit_price` for custom item. #### Product id Product handle (with handle: prefix) or id from
     * the scope of current subscription's site can be provided with `product_id`. By default
     * `unit_price` is taken from product's default price point, but can be overwritten by passing
     * `unit_price` or `product_price_point_id`. If `product_id` is used, following fields cannot be
     * used: `title`, `component_id`. #### Component id Component handle (with handle: prefix) or id
     * from the scope of current subscription's site can be provided with `component_id`. If
     * `component_id` is used, following fields cannot be used: `title`, `product_id`. By default
     * `unit_price` is taken from product's default price point, but can be overwritten by passing
     * `unit_price` or `price_point_id`. At this moment price points are supportted only for
     * quantity based, on/off and metered components. For prepaid and event based billing components
     * `unit_price` is required. ### Coupons When creating ad hoc invoice, new discounts can be
     * applied in following way: ```json { "invoice": { "line_items": [ { "product_id":
     * "handle:gold-product", "quantity": 1 } ], "coupons": [ { "code": "COUPONCODE", "percentage":
     * 50.0 } ] } } ``` If You want to use existing coupon for discount creation, only `code` and
     * optional `product_family_id` is needed ```json ... "coupons": [ { "code": "FREESETUP",
     * "product_family_id": 1 } ] ... ``` ### Coupon options #### Code Coupon `code` will be
     * displayed on invoice discount section. Coupon code can only contain uppercase letters,
     * numbers, and allowed special characters. Lowercase letters will be converted to uppercase. It
     * can be used to select an existing coupon from the catalog, or as an ad hoc coupon when passed
     * with `percentage` or `amount`. #### Percentage Coupon `percentage` can take values from 0 to
     * 100 and up to 4 decimal places. It cannot be used with `amount`. Only for ad hoc coupons,
     * will be ignored if `code` is used to select an existing coupon from the catalog. #### Amount
     * Coupon `amount` takes number value. It cannot be used with `percentage`. Used only when not
     * matching existing coupon by `code`. #### Description Optional `description` will be displayed
     * with coupon `code`. Used only when not matching existing coupon by `code`. #### Product
     * Family id Optional `product_family_id` handle (with handle: prefix) or id is used to match
     * existing coupon within site, when codes are not unique. #### Compounding Strategy Optional
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
     * will be created with a issue date set to today. `issue_date` parameter can be send to alter
     * that. Only dates in the past can be send. `issue_date` should be send in `YYYY-MM-DD` format.
     * #### Net Terms By default, invoices will be created with a due date matching the date of
     * invoice creation. If a different due date is desired, the `net_terms` parameter can be sent
     * indicating the number of days in advance the due date should be. #### Addresses The seller,
     * shipping and billing addresses can be sent to override the site's defaults. Each address
     * requires to send a `first_name` at a minimum in order to work. Please see below for the
     * details on which parameters can be sent for each address object. #### Memo and Payment
     * Instructions A custom memo can be sent with the `memo` parameter to override the site's
     * default. Likewise, custom payment instructions can be sent with the `payment_instrucions`
     * parameter. #### Status By default, invoices will be created with open status. Possible
     * alternative is `draft`.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  body  Optional parameter: Example:
     * @return    Returns the InvoiceResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public InvoiceResponse createInvoice(
            final String subscriptionId,
            final CreateInvoiceRequest body) throws ApiException, IOException {
        return prepareCreateInvoiceRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for createInvoice.
     */
    private ApiCall<InvoiceResponse, ApiException> prepareCreateInvoiceRequest(
            final String subscriptionId,
            final CreateInvoiceRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<InvoiceResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/invoices.json")
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
                                response -> ApiHelper.deserialize(response, InvoiceResponse.class))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new NestedErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This endpoint allows for invoices to be programmatically delivered via email. This endpoint
     * supports the delivery of both ad-hoc and automatically generated invoices. Additionally, this
     * endpoint supports email delivery to direct recipients, carbon-copy (cc) recipients, and blind
     * carbon-copy (bcc) recipients. Please note that if no recipient email addresses are specified
     * in the request, then the subscription's default email configuration will be used. For
     * example, if `recipient_emails` is left blank, then the invoice will be delivered to the
     * subscription's customer email address. On success, a 204 no-content response will be
     * returned. Please note that this does not indicate that email(s) have been delivered, but
     * instead indicates that emails have been successfully queued for delivery. If _any_ invalid or
     * malformed email address is found in the request body, the entire request will be rejected and
     * a 422 response will be returned.
     * @param  uid  Required parameter: The unique identifier for the invoice, this does not refer
     *         to the public facing invoice number.
     * @param  body  Optional parameter: Example:
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
            final SendInvoiceRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/invoices/{uid}/deliveries.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Customer information may change after an invoice is issued which may lead to a mismatch
     * between customer information that are present on an open invoice and actual customer
     * information. This endpoint allows to preview these differences, if any. The endpoint doesn't
     * accept a request body. Customer information differences are calculated on the application
     * side.
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
            final String uid) throws IOException {
        return new ApiCall.Builder<CustomerChangesPreviewResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/invoices/{uid}/customer_information/preview.json")
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CustomerChangesPreviewResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This endpoint updates customer information on an open invoice and returns the updated
     * invoice. If you would like to preview changes that will be applied, use the
     * `/invoices/{uid}/customer_information/preview.json` endpoint before. The endpoint doesn't
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
            final String uid) throws IOException {
        return new ApiCall.Builder<Invoice, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/invoices/{uid}/customer_information.json")
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Invoice.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This endpoint allows you to issue an invoice that is in "pending" status. For example, you
     * can issue an invoice that was created when allocating new quantity on a component and using
     * "accrue charges" option. You cannot issue a pending child invoice that was created for a
     * member subscription in a group. For Remittance subscriptions, the invoice will go into "open"
     * status and payment won't be attempted. The value for `on_failed_payment` would be rejected if
     * sent. Any prepayments or service credits that exist on subscription will be automatically
     * applied. Additionally, if setting is on, an email will be sent for issued invoice. For
     * Automatic subscriptions, prepayments and service credits will apply to the invoice and before
     * payment is attempted. On successful payment, the invoice will go into "paid" status and email
     * will be sent to the customer (if setting applies). When payment fails, the next event depends
     * on the `on_failed_payment` value: - `leave_open_invoice` - prepayments and credits applied to
     * invoice; invoice status set to "open"; email sent to the customer for the issued invoice (if
     * setting applies); payment failure recorded in the invoice history. This is the default
     * option. - `rollback_to_pending` - prepayments and credits not applied; invoice remains in
     * "pending" status; no email sent to the customer; payment failure recorded in the invoice
     * history. - `initiate_dunning` - prepayments and credits applied to the invoice; invoice
     * status set to "open"; email sent to the customer for the issued invoice (if setting applies);
     * payment failure recorded in the invoice history; subscription will most likely go into
     * "past_due" or "canceled" state (depending upon net terms and dunning settings).
     * @param  uid  Required parameter: The unique identifier for the invoice, this does not refer
     *         to the public facing invoice number.
     * @param  body  Optional parameter: Example:
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
            final IssueInvoiceRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Invoice, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/invoices/{uid}/issue.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Invoice.class))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }
}