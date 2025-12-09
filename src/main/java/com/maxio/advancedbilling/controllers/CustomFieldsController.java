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
import com.maxio.advancedbilling.exceptions.SingleErrorResponseException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.CreateMetadataRequest;
import com.maxio.advancedbilling.models.CreateMetafieldsRequest;
import com.maxio.advancedbilling.models.ListMetadataForResourceTypeInput;
import com.maxio.advancedbilling.models.ListMetadataInput;
import com.maxio.advancedbilling.models.ListMetafieldsInput;
import com.maxio.advancedbilling.models.ListMetafieldsResponse;
import com.maxio.advancedbilling.models.Metadata;
import com.maxio.advancedbilling.models.Metafield;
import com.maxio.advancedbilling.models.PaginatedMetadata;
import com.maxio.advancedbilling.models.ResourceType;
import com.maxio.advancedbilling.models.UpdateMetadataRequest;
import com.maxio.advancedbilling.models.UpdateMetafieldsRequest;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;
import java.util.List;

/**
 * This class lists all the endpoints of the groups.
 */
public final class CustomFieldsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public CustomFieldsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Creates metafields on a Site for either the Subscriptions or Customers resource. Metafields
     * and their metadata are created in the Custom Fields configuration page on your Site.
     * Metafields can be populated with metadata when you create them or later with the [Update
     * Metafield]($e/Custom%20Fields/updateMetafield), [Create
     * Metadata]($e/Custom%20Fields/createMetadata), or [Update
     * Metadata]($e/Custom%20Fields/updateMetadata) endpoints. The Create Metadata and Update
     * Metadata endpoints allow you to add metafields and metadata values to a specific subscription
     * or customer. Each site is limited to 100 unique metafields per resource. This means you can
     * have 100 metafields for Subscriptions and another 100 for Customers. &gt; Note: After creating a
     * metafield, the resource type cannot be modified. In the UI and product documentation,
     * metafields and metadata are called Custom Fields. - Metafield is the custom field - Metadata
     * is the data populating the custom field. See [Custom Fields
     * Reference](https://docs.maxio.com/hc/en-us/articles/24266140850573-Custom-Fields-Reference)
     * and [Custom Fields
     * Tab](https://maxio.zendesk.com/hc/en-us/articles/24251701302925-Subscription-Summary-Custom-Fields-Tab)
     * for information on using Custom Fields in the Advanced Billing UI.
     * @param  resourceType  Required parameter: The resource type to which the metafields belong.
     * @param  body  Optional parameter:
     * @return    Returns the List of Metafield response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<Metafield> createMetafields(
            final ResourceType resourceType,
            final CreateMetafieldsRequest body) throws ApiException, IOException {
        return prepareCreateMetafieldsRequest(resourceType, body).execute();
    }

    /**
     * Builds the ApiCall object for createMetafields.
     */
    private ApiCall<List<Metafield>, ApiException> prepareCreateMetafieldsRequest(
            final ResourceType resourceType,
            final CreateMetafieldsRequest body) {
        return new ApiCall.Builder<List<Metafield>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/{resource_type}/metafields.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("resource_type").value((resourceType != null) ? resourceType.value() : null)
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
                                response -> ApiHelper.deserializeArray(response,
                                        Metafield[].class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new SingleErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Lists the metafields and their associated details for a Site and resource type. You can
     * filter the request to a specific metafield.
     * @param  input  ListMetafieldsInput object containing request parameters
     * @return    Returns the ListMetafieldsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListMetafieldsResponse listMetafields(
            final ListMetafieldsInput input) throws ApiException, IOException {
        return prepareListMetafieldsRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listMetafields.
     */
    private ApiCall<ListMetafieldsResponse, ApiException> prepareListMetafieldsRequest(
            final ListMetafieldsInput input) {
        return new ApiCall.Builder<ListMetafieldsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/{resource_type}/metafields.json")
                        .queryParam(param -> param.key("name")
                                .value(input.getName()).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("direction")
                                .value((input.getDirection() != null) ? input.getDirection().value() : null).isRequired(false))
                        .templateParam(param -> param.key("resource_type").value((input.getResourceType() != null) ? input.getResourceType().value() : null)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListMetafieldsResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Updates metafields on your Site for a resource type. Depending on the request structure, you
     * can update or add metafields and metadata to the Subscriptions or Customers resource. With
     * this endpoint, you can: - Add metafields. If the metafield specified in current_name does not
     * exist, a new metafield is added. &gt;Note: Each site is limited to 100 unique metafields per
     * resource. This means you can have 100 metafields for Subscriptions and another 100 for
     * Customers. - Change the name of a metafield. &gt;Note: To keep the metafield name the same and
     * only update the metadata for the metafield, you must use the current metafield name in both
     * the `current_name` and `name` parameters. - Change the input type for the metafield. For
     * example, you can change a metafield input type from text to a dropdown. If you change the
     * input type from text to a dropdown or radio, you must update the specific subscriptions or
     * customers where the metafield was used to reflect the updated metafield and metadata. - Add
     * metadata values to the existing metadata for a dropdown or radio metafield. &gt;Note: Updates to
     * metadata overwrite. To add one or more values, you must specify all metadata values including
     * the new value you want to add. - Add new metadata to a dropdown or radio for a metafield that
     * was created without metadata. - Remove metadata for a dropdown or radio for a metafield.
     * &gt;Note: Updates to metadata overwrite existing values. To remove one or more values, specify
     * all metadata values except those you want to remove. - Add or update scope settings for a
     * metafield. &gt;Note: Scope changes overwrite existing settings. You must specify the complete
     * scope, including the changes you want to make.
     * @param  resourceType  Required parameter: The resource type to which the metafields belong.
     * @param  body  Optional parameter:
     * @return    Returns the List of Metafield response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<Metafield> updateMetafield(
            final ResourceType resourceType,
            final UpdateMetafieldsRequest body) throws ApiException, IOException {
        return prepareUpdateMetafieldRequest(resourceType, body).execute();
    }

    /**
     * Builds the ApiCall object for updateMetafield.
     */
    private ApiCall<List<Metafield>, ApiException> prepareUpdateMetafieldRequest(
            final ResourceType resourceType,
            final UpdateMetafieldsRequest body) {
        return new ApiCall.Builder<List<Metafield>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/{resource_type}/metafields.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("resource_type").value((resourceType != null) ? resourceType.value() : null)
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
                                response -> ApiHelper.deserializeArray(response,
                                        Metafield[].class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new SingleErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Deletes a metafield from your Site. Removes the metafield and associated metadata from all
     * Subscriptions or Customers resources on the Site.
     * @param  resourceType  Required parameter: The resource type to which the metafields belong.
     * @param  name  Optional parameter: The name of the metafield to be deleted
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void deleteMetafield(
            final ResourceType resourceType,
            final String name) throws ApiException, IOException {
        prepareDeleteMetafieldRequest(resourceType, name).execute();
    }

    /**
     * Builds the ApiCall object for deleteMetafield.
     */
    private ApiCall<Void, ApiException> prepareDeleteMetafieldRequest(
            final ResourceType resourceType,
            final String name) {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/{resource_type}/metafields.json")
                        .queryParam(param -> param.key("name")
                                .value(name).isRequired(false))
                        .templateParam(param -> param.key("resource_type").value((resourceType != null) ? resourceType.value() : null)
                                .shouldEncode(true))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("Not Found:'{$response.body}'",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Creates metadata and metafields for a specific subscription or customer, or updates metadata
     * values of existing metafields for a subscription or customer. Metadata values are limited to
     * 2 KB in size. If you create metadata on a subscription or customer with a metafield that does
     * not already exist, the metafield is created with the metadata you specify and it is always
     * added as a text field. You can update the input_type for the metafield with the [Update
     * Metafield]($e/Custom%20Fields/updateMetafield) endpoint. &gt;Note: Each site is limited to 100
     * unique metafields per resource. This means you can have 100 metafields for Subscriptions and
     * another 100 for Customers.
     * @param  resourceType  Required parameter: The resource type to which the metafields belong.
     * @param  resourceId  Required parameter: The Advanced Billing id of the customer or the
     *         subscription for which the metadata applies
     * @param  body  Optional parameter:
     * @return    Returns the List of Metadata response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<Metadata> createMetadata(
            final ResourceType resourceType,
            final int resourceId,
            final CreateMetadataRequest body) throws ApiException, IOException {
        return prepareCreateMetadataRequest(resourceType, resourceId, body).execute();
    }

    /**
     * Builds the ApiCall object for createMetadata.
     */
    private ApiCall<List<Metadata>, ApiException> prepareCreateMetadataRequest(
            final ResourceType resourceType,
            final int resourceId,
            final CreateMetadataRequest body) {
        return new ApiCall.Builder<List<Metadata>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/{resource_type}/{resource_id}/metadata.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("resource_type").value((resourceType != null) ? resourceType.value() : null)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("resource_id").value(resourceId).isRequired(false)
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
                                response -> ApiHelper.deserializeArray(response,
                                        Metadata[].class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new SingleErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Lists metadata and metafields for a specific customer or subscription.
     * @param  input  ListMetadataInput object containing request parameters
     * @return    Returns the PaginatedMetadata response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PaginatedMetadata listMetadata(
            final ListMetadataInput input) throws ApiException, IOException {
        return prepareListMetadataRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listMetadata.
     */
    private ApiCall<PaginatedMetadata, ApiException> prepareListMetadataRequest(
            final ListMetadataInput input) {
        return new ApiCall.Builder<PaginatedMetadata, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/{resource_type}/{resource_id}/metadata.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .templateParam(param -> param.key("resource_type").value((input.getResourceType() != null) ? input.getResourceType().value() : null)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("resource_id").value(input.getResourceId()).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PaginatedMetadata.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Updates metadata and metafields on the Site and the customer or subscription specified, and
     * updates the metadata value on a subscription or customer. If you update metadata on a
     * subscription or customer with a metafield that does not already exist, the metafield is
     * created with the metadata you specify and it is always added as a text field to the Site and
     * to the subscription or customer you specify. You can update the input_type for the metafield
     * with the Update Metafield endpoint. Each site is limited to 100 unique metafields per
     * resource. This means you can have 100 metafields for Subscription and another 100 for
     * Customer.
     * @param  resourceType  Required parameter: The resource type to which the metafields belong.
     * @param  resourceId  Required parameter: The Advanced Billing id of the customer or the
     *         subscription for which the metadata applies
     * @param  body  Optional parameter:
     * @return    Returns the List of Metadata response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<Metadata> updateMetadata(
            final ResourceType resourceType,
            final int resourceId,
            final UpdateMetadataRequest body) throws ApiException, IOException {
        return prepareUpdateMetadataRequest(resourceType, resourceId, body).execute();
    }

    /**
     * Builds the ApiCall object for updateMetadata.
     */
    private ApiCall<List<Metadata>, ApiException> prepareUpdateMetadataRequest(
            final ResourceType resourceType,
            final int resourceId,
            final UpdateMetadataRequest body) {
        return new ApiCall.Builder<List<Metadata>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/{resource_type}/{resource_id}/metadata.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("resource_type").value((resourceType != null) ? resourceType.value() : null)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("resource_id").value(resourceId).isRequired(false)
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
                                response -> ApiHelper.deserializeArray(response,
                                        Metadata[].class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new SingleErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Deletes one or more metafields (and associated metadata) from the specified subscription or
     * customer.
     * @param  resourceType  Required parameter: The resource type to which the metafields belong.
     * @param  resourceId  Required parameter: The Advanced Billing id of the customer or the
     *         subscription for which the metadata applies
     * @param  name  Optional parameter: Name of field to be removed.
     * @param  names  Optional parameter: Names of fields to be removed. Use in query:
     *         `names[]=field1&amp;names[]=my-field&amp;names[]=another-field`.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void deleteMetadata(
            final ResourceType resourceType,
            final int resourceId,
            final String name,
            final List<String> names) throws ApiException, IOException {
        prepareDeleteMetadataRequest(resourceType, resourceId, name, names).execute();
    }

    /**
     * Builds the ApiCall object for deleteMetadata.
     */
    private ApiCall<Void, ApiException> prepareDeleteMetadataRequest(
            final ResourceType resourceType,
            final int resourceId,
            final String name,
            final List<String> names) {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/{resource_type}/{resource_id}/metadata.json")
                        .queryParam(param -> param.key("name")
                                .value(name).isRequired(false))
                        .queryParam(param -> param.key("names")
                                .value(names).isRequired(false))
                        .templateParam(param -> param.key("resource_type").value((resourceType != null) ? resourceType.value() : null)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("resource_id").value(resourceId).isRequired(false)
                                .shouldEncode(true))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setTemplate("Not Found:'{$response.body}'",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Lists metadata for a specified array of subscriptions or customers.
     * @param  input  ListMetadataForResourceTypeInput object containing request parameters
     * @return    Returns the PaginatedMetadata response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PaginatedMetadata listMetadataForResourceType(
            final ListMetadataForResourceTypeInput input) throws ApiException, IOException {
        return prepareListMetadataForResourceTypeRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listMetadataForResourceType.
     */
    private ApiCall<PaginatedMetadata, ApiException> prepareListMetadataForResourceTypeRequest(
            final ListMetadataForResourceTypeInput input) {
        return new ApiCall.Builder<PaginatedMetadata, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/{resource_type}/metadata.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("date_field")
                                .value((input.getDateField() != null) ? input.getDateField().value() : null).isRequired(false))
                        .queryParam(param -> param.key("start_date")
                                .value(DateTimeHelper.toSimpleDate(input.getStartDate())).isRequired(false))
                        .queryParam(param -> param.key("end_date")
                                .value(DateTimeHelper.toSimpleDate(input.getEndDate())).isRequired(false))
                        .queryParam(param -> param.key("start_datetime")
                                .value(DateTimeHelper.toRfc8601DateTime(input.getStartDatetime())).isRequired(false))
                        .queryParam(param -> param.key("end_datetime")
                                .value(DateTimeHelper.toRfc8601DateTime(input.getEndDatetime())).isRequired(false))
                        .queryParam(param -> param.key("with_deleted")
                                .value(input.getWithDeleted()).isRequired(false))
                        .queryParam(param -> param.key("resource_ids")
                                .value(input.getResourceIds()).isRequired(false))
                        .queryParam(param -> param.key("direction")
                                .value((input.getDirection() != null) ? input.getDirection().value() : null).isRequired(false))
                        .templateParam(param -> param.key("resource_type").value((input.getResourceType() != null) ? input.getResourceType().value() : null)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.UNINDEXED)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PaginatedMetadata.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}