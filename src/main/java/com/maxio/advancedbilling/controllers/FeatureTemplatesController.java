/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.controllers;

import com.maxio.advancedbilling.ApiHelper;
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.Server;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.CreateFeatureTemplateRequest;
import com.maxio.advancedbilling.models.FeatureTemplateResponse;
import com.maxio.advancedbilling.models.FeatureTemplatesListResponse;
import com.maxio.advancedbilling.models.Kind;
import com.maxio.advancedbilling.models.SortBy;
import com.maxio.advancedbilling.models.SortDirection;
import com.maxio.advancedbilling.models.Status1;
import com.maxio.advancedbilling.models.UpdateFeatureTemplateRequest;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;
import java.time.LocalDate;

/**
 * This class lists all the endpoints of the groups.
 */
public final class FeatureTemplatesController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public FeatureTemplatesController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Lists the feature templates defined for your site, active (non-archived) ones by default.
     * Pass `status=archived` or `status=all` to widen the result set. Supply `page` or `per_page`
     * to paginate. Without either parameter, the response includes the full result set.
     * @param  page  Optional parameter: Result records are organized in pages. By default, the
     *         first page of results is displayed. The page parameter specifies a page number of
     *         results to fetch. You can start navigating through the pages to consume the results.
     *         You do this by passing in a page parameter. Retrieve the next page by adding ?page=2
     *         to the query string. If there are no results to return, then an empty result set will
     *         be returned. Use in query `page=1`.
     * @param  perPage  Optional parameter: This parameter indicates how many records to fetch in
     *         each request. Default value is 20. The maximum allowed values is 200; any per_page
     *         value over 200 will be changed to 200. Use in query `per_page=200`.
     * @param  status  Optional parameter: Filters by archived state. Defaults to `active`
     *         (non-archived templates only).
     * @param  q  Optional parameter: Filters to feature templates whose name contains this
     *         substring (case-insensitive).
     * @param  kind  Optional parameter: Filters by feature kind.
     * @param  updatedFrom  Optional parameter: Returns feature templates updated on or after this
     *         date.
     * @param  updatedTo  Optional parameter: Returns feature templates updated on or before this
     *         date.
     * @param  sortBy  Optional parameter: The field to sort results by.
     * @param  sortDirection  Optional parameter: The sort direction of the returned feature
     *         templates.
     * @return    Returns the FeatureTemplatesListResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public FeatureTemplatesListResponse listFeatureTemplates(
            final Integer page,
            final Integer perPage,
            final Status1 status,
            final String q,
            final Kind kind,
            final LocalDate updatedFrom,
            final LocalDate updatedTo,
            final SortBy sortBy,
            final SortDirection sortDirection) throws ApiException, IOException {
        return prepareListFeatureTemplatesRequest(page, perPage, status, q, kind, updatedFrom,
                updatedTo, sortBy, sortDirection).execute();
    }

    /**
     * Builds the ApiCall object for listFeatureTemplates.
     */
    private ApiCall<FeatureTemplatesListResponse, ApiException> prepareListFeatureTemplatesRequest(
            final Integer page,
            final Integer perPage,
            final Status1 status,
            final String q,
            final Kind kind,
            final LocalDate updatedFrom,
            final LocalDate updatedTo,
            final SortBy sortBy,
            final SortDirection sortDirection) {
        return new ApiCall.Builder<FeatureTemplatesListResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/features.json")
                        .queryParam(param -> param.key("page")
                                .value((page != null) ? page : 1).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value((perPage != null) ? perPage : 20).isRequired(false))
                        .queryParam(param -> param.key("status")
                                .value((status != null) ? status.value() : "active").isRequired(false))
                        .queryParam(param -> param.key("q")
                                .value(q).isRequired(false))
                        .queryParam(param -> param.key("kind")
                                .value((kind != null) ? kind.value() : null).isRequired(false))
                        .queryParam(param -> param.key("updated_from")
                                .value(DateTimeHelper.toSimpleDate(updatedFrom)).isRequired(false))
                        .queryParam(param -> param.key("updated_to")
                                .value(DateTimeHelper.toSimpleDate(updatedTo)).isRequired(false))
                        .queryParam(param -> param.key("sort_by")
                                .value((sortBy != null) ? sortBy.value() : "name").isRequired(false))
                        .queryParam(param -> param.key("sort_direction")
                                .value((sortDirection != null) ? sortDirection.value() : "asc").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, FeatureTemplatesListResponse.class))
                        .nullify404(false)
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Defines a new feature at the site level. Feature templates aren't billable on their own.
     * Attach a template to products or components to grant the feature to subscribers.
     * @param  body  Optional parameter:
     * @return    Returns the FeatureTemplateResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public FeatureTemplateResponse createFeatureTemplate(
            final CreateFeatureTemplateRequest body) throws ApiException, IOException {
        return prepareCreateFeatureTemplateRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for createFeatureTemplate.
     */
    private ApiCall<FeatureTemplateResponse, ApiException> prepareCreateFeatureTemplateRequest(
            final CreateFeatureTemplateRequest body) {
        return new ApiCall.Builder<FeatureTemplateResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/features.json")
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
                                response -> ApiHelper.deserialize(response, FeatureTemplateResponse.class))
                        .nullify404(false)
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns a single feature template. Archived feature templates are not addressable here and
     * return `404`. Restore a template first to read or update it.
     * @param  id  Required parameter: The Advanced Billing id of the feature template.
     * @return    Returns the FeatureTemplateResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public FeatureTemplateResponse readFeatureTemplate(
            final int id) throws ApiException, IOException {
        return prepareReadFeatureTemplateRequest(id).execute();
    }

    /**
     * Builds the ApiCall object for readFeatureTemplate.
     */
    private ApiCall<FeatureTemplateResponse, ApiException> prepareReadFeatureTemplateRequest(
            final int id) {
        return new ApiCall.Builder<FeatureTemplateResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/features/{id}.json")
                        .templateParam(param -> param.key("id").value(id).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, FeatureTemplateResponse.class))
                        .nullify404(false)
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Updates the name, description, unit, value type, default value, or default periodicity of a
     * feature template. `key` is rejected on every update. `kind` is rejected once any feature
     * catalog item has been created from this template. Archived feature templates are not
     * addressable here and return `404`. Restore a template first to update it.
     * @param  id  Required parameter: The Advanced Billing id of the feature template.
     * @param  body  Optional parameter:
     * @return    Returns the FeatureTemplateResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public FeatureTemplateResponse updateFeatureTemplate(
            final int id,
            final UpdateFeatureTemplateRequest body) throws ApiException, IOException {
        return prepareUpdateFeatureTemplateRequest(id, body).execute();
    }

    /**
     * Builds the ApiCall object for updateFeatureTemplate.
     */
    private ApiCall<FeatureTemplateResponse, ApiException> prepareUpdateFeatureTemplateRequest(
            final int id,
            final UpdateFeatureTemplateRequest body) {
        return new ApiCall.Builder<FeatureTemplateResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/features/{id}.json")
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
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, FeatureTemplateResponse.class))
                        .nullify404(false)
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Archives a feature template. Archived feature templates are not addressable via [Read Feature
     * Template]($e/Feature%20Templates/readFeatureTemplate) or [Update Feature
     * Template]($e/Feature%20Templates/updateFeatureTemplate). Both endpoints return `404` until
     * the template is restored. The feature template record itself is never hard-deleted, and can
     * always be restored with [Restore Feature
     * Template]($e/Feature%20Templates/restoreFeatureTemplate). Reversibility does not extend to
     * `remove_from_catalog=true`: the feature catalog items and entitlements that parameter
     * destroys are gone permanently, and restoring the template will not bring subscriber access
     * back.
     * @param  id  Required parameter: The Advanced Billing id of the feature template.
     * @param  removeFromCatalog  Optional parameter: When `true`, also destroys every feature
     *         catalog item created from this template and cascades to their entitlements, revoking
     *         subscriber access immediately. When `false` (default), the feature template and its
     *         feature catalog items are archived, and existing entitlements are preserved.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void archiveFeatureTemplate(
            final int id,
            final Boolean removeFromCatalog) throws ApiException, IOException {
        prepareArchiveFeatureTemplateRequest(id, removeFromCatalog).execute();
    }

    /**
     * Builds the ApiCall object for archiveFeatureTemplate.
     */
    private ApiCall<Void, ApiException> prepareArchiveFeatureTemplateRequest(
            final int id,
            final Boolean removeFromCatalog) {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/features/{id}.json")
                        .queryParam(param -> param.key("remove_from_catalog")
                                .value((removeFromCatalog != null) ? removeFromCatalog : false).isRequired(false))
                        .templateParam(param -> param.key("id").value(id).isRequired(false)
                                .shouldEncode(true))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Clears the feature template's archived state. Feature catalog items created from this
     * template are not automatically restored. Restore each one individually.
     * @param  id  Required parameter: The Advanced Billing id of the feature template.
     * @return    Returns the FeatureTemplateResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public FeatureTemplateResponse restoreFeatureTemplate(
            final int id) throws ApiException, IOException {
        return prepareRestoreFeatureTemplateRequest(id).execute();
    }

    /**
     * Builds the ApiCall object for restoreFeatureTemplate.
     */
    private ApiCall<FeatureTemplateResponse, ApiException> prepareRestoreFeatureTemplateRequest(
            final int id) {
        return new ApiCall.Builder<FeatureTemplateResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/features/{id}/restore.json")
                        .templateParam(param -> param.key("id").value(id).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, FeatureTemplateResponse.class))
                        .nullify404(false)
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}