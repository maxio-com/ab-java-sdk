/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.controllers;

import com.maxio.advancedbilling.ApiHelper;
import com.maxio.advancedbilling.Server;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.SingleErrorResponseException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.BatchJobResponse;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.ListExportedInvoicesInput;
import com.maxio.advancedbilling.models.ListExportedProformaInvoicesInput;
import com.maxio.advancedbilling.models.ListExportedSubscriptionsInput;
import com.maxio.advancedbilling.models.ProformaInvoice;
import com.maxio.advancedbilling.models.Subscription;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;
import java.util.List;

/**
 * This class lists all the endpoints of the groups.
 */
public final class APIExportsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public APIExportsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This API returns an array of exported proforma invoices for a provided `batch_id`. Pay close
     * attention to pagination in order to control responses from the server. Example: `GET
     * https://{subdomain}.chargify.com/api_exports/proforma_invoices/123/rows?per_page=10000&amp;page=1`.
     * @param  input  ListExportedProformaInvoicesInput object containing request parameters
     * @return    Returns the List of ProformaInvoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<ProformaInvoice> listExportedProformaInvoices(
            final ListExportedProformaInvoicesInput input) throws ApiException, IOException {
        return prepareListExportedProformaInvoicesRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listExportedProformaInvoices.
     */
    private ApiCall<List<ProformaInvoice>, ApiException> prepareListExportedProformaInvoicesRequest(
            final ListExportedProformaInvoicesInput input) throws IOException {
        return new ApiCall.Builder<List<ProformaInvoice>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/api_exports/proforma_invoices/{batch_id}/rows.json")
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .templateParam(param -> param.key("batch_id").value(input.getBatchId())
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
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This API returns an array of exported invoices for a provided `batch_id`. Pay close attention
     * to pagination in order to control responses from the server. Example: `GET
     * https://{subdomain}.chargify.com/api_exports/invoices/123/rows?per_page=10000&amp;page=1`.
     * @param  input  ListExportedInvoicesInput object containing request parameters
     * @return    Returns the List of Invoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<Invoice> listExportedInvoices(
            final ListExportedInvoicesInput input) throws ApiException, IOException {
        return prepareListExportedInvoicesRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listExportedInvoices.
     */
    private ApiCall<List<Invoice>, ApiException> prepareListExportedInvoicesRequest(
            final ListExportedInvoicesInput input) throws IOException {
        return new ApiCall.Builder<List<Invoice>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/api_exports/invoices/{batch_id}/rows.json")
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .templateParam(param -> param.key("batch_id").value(input.getBatchId())
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        Invoice[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This API returns an array of exported subscriptions for a provided `batch_id`. Pay close
     * attention to pagination in order to control responses from the server. Example: `GET
     * https://{subdomain}.chargify.com/api_exports/subscriptions/123/rows?per_page=200&amp;page=1`.
     * @param  input  ListExportedSubscriptionsInput object containing request parameters
     * @return    Returns the List of Subscription response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<Subscription> listExportedSubscriptions(
            final ListExportedSubscriptionsInput input) throws ApiException, IOException {
        return prepareListExportedSubscriptionsRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listExportedSubscriptions.
     */
    private ApiCall<List<Subscription>, ApiException> prepareListExportedSubscriptionsRequest(
            final ListExportedSubscriptionsInput input) throws IOException {
        return new ApiCall.Builder<List<Subscription>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/api_exports/subscriptions/{batch_id}/rows.json")
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .templateParam(param -> param.key("batch_id").value(input.getBatchId())
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        Subscription[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This API creates a proforma invoices export and returns a batchjob object. It is only
     * available for Relationship Invoicing architecture.
     * @return    Returns the BatchJobResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BatchJobResponse exportProformaInvoices() throws ApiException, IOException {
        return prepareExportProformaInvoicesRequest().execute();
    }

    /**
     * Builds the ApiCall object for exportProformaInvoices.
     */
    private ApiCall<BatchJobResponse, ApiException> prepareExportProformaInvoicesRequest() throws IOException {
        return new ApiCall.Builder<BatchJobResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/api_exports/proforma_invoices.json")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, BatchJobResponse.class))
                        .localErrorCase("409",
                                 ErrorCase.setReason("Conflict",
                                (reason, context) -> new SingleErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This API creates an invoices export and returns a batchjob object.
     * @return    Returns the BatchJobResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BatchJobResponse exportInvoices() throws ApiException, IOException {
        return prepareExportInvoicesRequest().execute();
    }

    /**
     * Builds the ApiCall object for exportInvoices.
     */
    private ApiCall<BatchJobResponse, ApiException> prepareExportInvoicesRequest() throws IOException {
        return new ApiCall.Builder<BatchJobResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/api_exports/invoices.json")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, BatchJobResponse.class))
                        .localErrorCase("409",
                                 ErrorCase.setReason("Conflict",
                                (reason, context) -> new SingleErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This API creates a subscriptions export and returns a batchjob object.
     * @return    Returns the BatchJobResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BatchJobResponse exportSubscriptions() throws ApiException, IOException {
        return prepareExportSubscriptionsRequest().execute();
    }

    /**
     * Builds the ApiCall object for exportSubscriptions.
     */
    private ApiCall<BatchJobResponse, ApiException> prepareExportSubscriptionsRequest() throws IOException {
        return new ApiCall.Builder<BatchJobResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/api_exports/subscriptions.json")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, BatchJobResponse.class))
                        .localErrorCase("409",
                                 ErrorCase.setReason("Conflict",
                                (reason, context) -> new SingleErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This API returns a batchjob object for proforma invoices export.
     * @param  batchId  Required parameter: Id of a Batch Job.
     * @return    Returns the BatchJobResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BatchJobResponse readProformaInvoicesExport(
            final String batchId) throws ApiException, IOException {
        return prepareReadProformaInvoicesExportRequest(batchId).execute();
    }

    /**
     * Builds the ApiCall object for readProformaInvoicesExport.
     */
    private ApiCall<BatchJobResponse, ApiException> prepareReadProformaInvoicesExportRequest(
            final String batchId) throws IOException {
        return new ApiCall.Builder<BatchJobResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/api_exports/proforma_invoices/{batch_id}.json")
                        .templateParam(param -> param.key("batch_id").value(batchId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, BatchJobResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This API returns a batchjob object for invoices export.
     * @param  batchId  Required parameter: Id of a Batch Job.
     * @return    Returns the BatchJobResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BatchJobResponse readInvoicesExport(
            final String batchId) throws ApiException, IOException {
        return prepareReadInvoicesExportRequest(batchId).execute();
    }

    /**
     * Builds the ApiCall object for readInvoicesExport.
     */
    private ApiCall<BatchJobResponse, ApiException> prepareReadInvoicesExportRequest(
            final String batchId) throws IOException {
        return new ApiCall.Builder<BatchJobResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/api_exports/invoices/{batch_id}.json")
                        .templateParam(param -> param.key("batch_id").value(batchId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, BatchJobResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This API returns a batchjob object for subscriptions export.
     * @param  batchId  Required parameter: Id of a Batch Job.
     * @return    Returns the BatchJobResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BatchJobResponse readSubscriptionsExport(
            final String batchId) throws ApiException, IOException {
        return prepareReadSubscriptionsExportRequest(batchId).execute();
    }

    /**
     * Builds the ApiCall object for readSubscriptionsExport.
     */
    private ApiCall<BatchJobResponse, ApiException> prepareReadSubscriptionsExportRequest(
            final String batchId) throws IOException {
        return new ApiCall.Builder<BatchJobResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/api_exports/subscriptions/{batch_id}.json")
                        .templateParam(param -> param.key("batch_id").value(batchId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, BatchJobResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }
}