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
import com.maxio.advancedbilling.exceptions.ErrorMapResponseException;
import com.maxio.advancedbilling.exceptions.ProformaBadRequestErrorResponseException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.CreateSubscriptionRequest;
import com.maxio.advancedbilling.models.Direction;
import com.maxio.advancedbilling.models.ProformaInvoice;
import com.maxio.advancedbilling.models.ProformaInvoicePreview;
import com.maxio.advancedbilling.models.SignupProformaPreviewResponse;
import com.maxio.advancedbilling.models.Status;
import com.maxio.advancedbilling.models.VoidInvoiceRequest;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;
import java.util.List;

/**
 * This class lists all the endpoints of the groups.
 */
public final class ProformaInvoicesController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public ProformaInvoicesController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This endpoint will trigger the creation of a consolidated proforma invoice asynchronously. It
     * will return a 201 with no message, or a 422 with any errors. To find and view the new
     * consolidated proforma invoice, you may poll the subscription group listing for proforma
     * invoices; only one consolidated proforma invoice may be created per group at a time. If the
     * information becomes outdated, simply void the old consolidated proforma invoice and generate
     * a new one. ## Restrictions Proforma invoices are only available on Relationship Invoicing
     * sites. To create a proforma invoice, the subscription must not be prepaid, and must be in a
     * live state.
     * @param  uid  Required parameter: The uid of the subscription group
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void createConsolidatedProformaInvoice(
            final String uid) throws ApiException, IOException {
        prepareCreateConsolidatedProformaInvoiceRequest(uid).execute();
    }

    /**
     * Builds the ApiCall object for createConsolidatedProformaInvoice.
     */
    private ApiCall<Void, ApiException> prepareCreateConsolidatedProformaInvoiceRequest(
            final String uid) throws IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscription_groups/{uid}/proforma_invoices.json")
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * Only proforma invoices with a `consolidation_level` of parent are returned. By default,
     * proforma invoices returned on the index will only include totals, not detailed breakdowns for
     * `line_items`, `discounts`, `taxes`, `credits`, `payments`, `custom_fields`. To include
     * breakdowns, pass the specific field as a key in the query with a value set to true.
     * @param  uid  Required parameter: The uid of the subscription group
     * @return    Returns the ProformaInvoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ProformaInvoice listSubscriptionGroupProformaInvoices(
            final String uid) throws ApiException, IOException {
        return prepareListSubscriptionGroupProformaInvoicesRequest(uid).execute();
    }

    /**
     * Builds the ApiCall object for listSubscriptionGroupProformaInvoices.
     */
    private ApiCall<ProformaInvoice, ApiException> prepareListSubscriptionGroupProformaInvoicesRequest(
            final String uid) throws IOException {
        return new ApiCall.Builder<ProformaInvoice, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscription_groups/{uid}/proforma_invoices.json")
                        .templateParam(param -> param.key("uid").value(uid)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ProformaInvoice.class))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * Use this endpoint to read the details of an existing proforma invoice. ## Restrictions
     * Proforma invoices are only available on Relationship Invoicing sites.
     * @param  proformaInvoiceUid  Required parameter: The uid of the proforma invoice
     * @return    Returns the ProformaInvoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ProformaInvoice readProformaInvoice(
            final int proformaInvoiceUid) throws ApiException, IOException {
        return prepareReadProformaInvoiceRequest(proformaInvoiceUid).execute();
    }

    /**
     * Builds the ApiCall object for readProformaInvoice.
     */
    private ApiCall<ProformaInvoice, ApiException> prepareReadProformaInvoiceRequest(
            final int proformaInvoiceUid) throws IOException {
        return new ApiCall.Builder<ProformaInvoice, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/proforma_invoices/{proforma_invoice_uid}.json")
                        .templateParam(param -> param.key("proforma_invoice_uid").value(proformaInvoiceUid).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ProformaInvoice.class))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * This endpoint will create a proforma invoice and return it as a response. If the information
     * becomes outdated, simply void the old proforma invoice and generate a new one. If you would
     * like to preview the next billing amounts without generating a full proforma invoice, please
     * use the renewal preview endpoint. ## Restrictions Proforma invoices are only available on
     * Relationship Invoicing sites. To create a proforma invoice, the subscription must not be in a
     * group, must not be prepaid, and must be in a live state.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @return    Returns the ProformaInvoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ProformaInvoice createProformaInvoice(
            final String subscriptionId) throws ApiException, IOException {
        return prepareCreateProformaInvoiceRequest(subscriptionId).execute();
    }

    /**
     * Builds the ApiCall object for createProformaInvoice.
     */
    private ApiCall<ProformaInvoice, ApiException> prepareCreateProformaInvoiceRequest(
            final String subscriptionId) throws IOException {
        return new ApiCall.Builder<ProformaInvoice, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/proforma_invoices.json")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ProformaInvoice.class))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * By default, proforma invoices returned on the index will only include totals, not detailed
     * breakdowns for `line_items`, `discounts`, `taxes`, `credits`, `payments`, or `custom_fields`.
     * To include breakdowns, pass the specific field as a key in the query with a value set to
     * `true`.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  startDate  Optional parameter: The beginning date range for the invoice's Due Date,
     *         in the YYYY-MM-DD format.
     * @param  endDate  Optional parameter: The ending date range for the invoice's Due Date, in the
     *         YYYY-MM-DD format.
     * @param  status  Optional parameter: The current status of the invoice. Allowed Values: draft,
     *         open, paid, pending, voided
     * @param  page  Optional parameter: Result records are organized in pages. By default, the
     *         first page of results is displayed. The page parameter specifies a page number of
     *         results to fetch. You can start navigating through the pages to consume the results.
     *         You do this by passing in a page parameter. Retrieve the next page by adding ?page=2
     *         to the query string. If there are no results to return, then an empty result set will
     *         be returned. Use in query `page=1`.
     * @param  perPage  Optional parameter: This parameter indicates how many records to fetch in
     *         each request. Default value is 20. The maximum allowed values is 200; any per_page
     *         value over 200 will be changed to 200. Use in query `per_page=200`.
     * @param  direction  Optional parameter: The sort direction of the returned invoices.
     * @param  lineItems  Optional parameter: Include line items data
     * @param  discounts  Optional parameter: Include discounts data
     * @param  taxes  Optional parameter: Include taxes data
     * @param  credits  Optional parameter: Include credits data
     * @param  payments  Optional parameter: Include payments data
     * @param  customFields  Optional parameter: Include custom fields data
     * @return    Returns the List of ProformaInvoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<ProformaInvoice> listProformaInvoices(
            final String subscriptionId,
            final String startDate,
            final String endDate,
            final Status status,
            final Integer page,
            final Integer perPage,
            final Direction direction,
            final Boolean lineItems,
            final Boolean discounts,
            final Boolean taxes,
            final Boolean credits,
            final Boolean payments,
            final Boolean customFields) throws ApiException, IOException {
        return prepareListProformaInvoicesRequest(subscriptionId, startDate, endDate, status, page,
                perPage, direction, lineItems, discounts, taxes, credits, payments,
                customFields).execute();
    }

    /**
     * Builds the ApiCall object for listProformaInvoices.
     */
    private ApiCall<List<ProformaInvoice>, ApiException> prepareListProformaInvoicesRequest(
            final String subscriptionId,
            final String startDate,
            final String endDate,
            final Status status,
            final Integer page,
            final Integer perPage,
            final Direction direction,
            final Boolean lineItems,
            final Boolean discounts,
            final Boolean taxes,
            final Boolean credits,
            final Boolean payments,
            final Boolean customFields) throws IOException {
        return new ApiCall.Builder<List<ProformaInvoice>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/proforma_invoices.json")
                        .queryParam(param -> param.key("start_date")
                                .value(startDate).isRequired(false))
                        .queryParam(param -> param.key("end_date")
                                .value(endDate).isRequired(false))
                        .queryParam(param -> param.key("status")
                                .value((status != null) ? status.value() : null).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value((page != null) ? page : 1).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value((perPage != null) ? perPage : 20).isRequired(false))
                        .queryParam(param -> param.key("direction")
                                .value((direction != null) ? direction.value() : "desc").isRequired(false))
                        .queryParam(param -> param.key("line_items")
                                .value((lineItems != null) ? lineItems : false).isRequired(false))
                        .queryParam(param -> param.key("discounts")
                                .value((discounts != null) ? discounts : false).isRequired(false))
                        .queryParam(param -> param.key("taxes")
                                .value((taxes != null) ? taxes : false).isRequired(false))
                        .queryParam(param -> param.key("credits")
                                .value((credits != null) ? credits : false).isRequired(false))
                        .queryParam(param -> param.key("payments")
                                .value((payments != null) ? payments : false).isRequired(false))
                        .queryParam(param -> param.key("custom_fields")
                                .value((customFields != null) ? customFields : false).isRequired(false))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        ProformaInvoice[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * This endpoint will void a proforma invoice that has the status "draft". ## Restrictions
     * Proforma invoices are only available on Relationship Invoicing sites. Only proforma invoices
     * that have the appropriate status may be reopened. If the invoice identified by {uid} does not
     * have the appropriate status, the response will have HTTP status code 422 and an error
     * message. A reason for the void operation is required to be included in the request body. If
     * one is not provided, the response will have HTTP status code 422 and an error message.
     * @param  proformaInvoiceUid  Required parameter: The uid of the proforma invoice
     * @param  body  Optional parameter: Example:
     * @return    Returns the ProformaInvoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ProformaInvoice voidProformaInvoice(
            final String proformaInvoiceUid,
            final VoidInvoiceRequest body) throws ApiException, IOException {
        return prepareVoidProformaInvoiceRequest(proformaInvoiceUid, body).execute();
    }

    /**
     * Builds the ApiCall object for voidProformaInvoice.
     */
    private ApiCall<ProformaInvoice, ApiException> prepareVoidProformaInvoiceRequest(
            final String proformaInvoiceUid,
            final VoidInvoiceRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ProformaInvoice, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/proforma_invoices/{proforma_invoice_uid}/void.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("proforma_invoice_uid").value(proformaInvoiceUid)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ProformaInvoice.class))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * Return a preview of the data that will be included on a given subscription's proforma invoice
     * if one were to be generated. It will have similar line items and totals as a renewal preview,
     * but the response will be presented in the format of a proforma invoice. Consequently it will
     * include additional information such as the name and addresses that will appear on the
     * proforma invoice. The preview endpoint is subject to all the same conditions as the proforma
     * invoice endpoint. For example, previews are only available on the Relationship Invoicing
     * architecture, and previews cannot be made for end-of-life subscriptions. If all the data
     * returned in the preview is as expected, you may then create a static proforma invoice and
     * send it to your customer. The data within a preview will not be saved and will not be
     * accessible after the call is made. Alternatively, if you have some proforma invoices already,
     * you may make a preview call to determine whether any billing information for the
     * subscription's upcoming renewal has changed.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @return    Returns the ProformaInvoicePreview response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ProformaInvoicePreview previewProformaInvoice(
            final String subscriptionId) throws ApiException, IOException {
        return preparePreviewProformaInvoiceRequest(subscriptionId).execute();
    }

    /**
     * Builds the ApiCall object for previewProformaInvoice.
     */
    private ApiCall<ProformaInvoicePreview, ApiException> preparePreviewProformaInvoiceRequest(
            final String subscriptionId) throws IOException {
        return new ApiCall.Builder<ProformaInvoicePreview, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/proforma_invoices/preview.json")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ProformaInvoicePreview.class))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * This endpoint is only available for Relationship Invoicing sites. It cannot be used to create
     * consolidated proforma invoices or preview prepaid subscriptions. Create a proforma invoice to
     * preview costs before a subscription's signup. Like other proforma invoices, it can be emailed
     * to the customer, voided, and publicly viewed on the chargifypay domain. Pass a payload that
     * resembles a subscription create or signup preview request. For example, you can specify
     * components, coupons/a referral, offers, custom pricing, and an existing customer or payment
     * profile to populate a shipping or billing address. A product and customer first name, last
     * name, and email are the minimum requirements. We recommend associating the proforma invoice
     * with a customer_id to easily find their proforma invoices, since the subscription_id will
     * always be blank.
     * @param  body  Optional parameter: Example:
     * @return    Returns the ProformaInvoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ProformaInvoice createSignupProformaInvoice(
            final CreateSubscriptionRequest body) throws ApiException, IOException {
        return prepareCreateSignupProformaInvoiceRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for createSignupProformaInvoice.
     */
    private ApiCall<ProformaInvoice, ApiException> prepareCreateSignupProformaInvoiceRequest(
            final CreateSubscriptionRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ProformaInvoice, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/proforma_invoices.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ProformaInvoice.class))
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad Request",
                                (reason, context) -> new ProformaBadRequestErrorResponseException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorMapResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }

    /**
     * This endpoint is only available for Relationship Invoicing sites. It cannot be used to create
     * consolidated proforma invoice previews or preview prepaid subscriptions. Create a signup
     * preview in the format of a proforma invoice to preview costs before a subscription's signup.
     * You have the option of optionally previewing the first renewal's costs as well. The proforma
     * invoice preview will not be persisted. Pass a payload that resembles a subscription create or
     * signup preview request. For example, you can specify components, coupons/a referral, offers,
     * custom pricing, and an existing customer or payment profile to populate a shipping or billing
     * address. A product and customer first name, last name, and email are the minimum
     * requirements.
     * @param  includeNextProformaInvoice  Optional parameter: Choose to include a proforma invoice
     *         preview for the first renewal
     * @param  body  Optional parameter: Example:
     * @return    Returns the SignupProformaPreviewResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SignupProformaPreviewResponse previewSignupProformaInvoice(
            final String includeNextProformaInvoice,
            final CreateSubscriptionRequest body) throws ApiException, IOException {
        return preparePreviewSignupProformaInvoiceRequest(includeNextProformaInvoice,
                body).execute();
    }

    /**
     * Builds the ApiCall object for previewSignupProformaInvoice.
     */
    private ApiCall<SignupProformaPreviewResponse, ApiException> preparePreviewSignupProformaInvoiceRequest(
            final String includeNextProformaInvoice,
            final CreateSubscriptionRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<SignupProformaPreviewResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/proforma_invoices/preview.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .queryParam(param -> param.key("include=next_proforma_invoice")
                                .value(includeNextProformaInvoice).isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SignupProformaPreviewResponse.class))
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad Request",
                                (reason, context) -> new ProformaBadRequestErrorResponseException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorMapResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV
))
                .build();
    }
}