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
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.CreateMetadataRequest;
import com.maxio.advancedbilling.models.CreateMetafieldsRequest;
import com.maxio.advancedbilling.models.ListMetadataInput;
import com.maxio.advancedbilling.models.ListMetafieldsInput;
import com.maxio.advancedbilling.models.ListMetafieldsResponse;
import com.maxio.advancedbilling.models.Metadata;
import com.maxio.advancedbilling.models.Metafield;
import com.maxio.advancedbilling.models.PaginatedMetadata;
import com.maxio.advancedbilling.models.ReadMetadataInput;
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
     * ## Custom Fields: Metafield Intro **Chargify refers to Custom Fields in the API documentation
     * as metafields and metadata.** Within the Chargify UI, metadata and metafields are grouped
     * together under the umbrella of "Custom Fields." All of our UI-based documentation that
     * references custom fields will not cite the terminology metafields or metadata. + **Metafield
     * is the custom field** + **Metadata is the data populating the custom field.** Chargify
     * Metafields are used to add meaningful attributes to subscription and customer resources. Full
     * documentation on how to create Custom Fields in the Chargify UI can be located
     * [here](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405332553613-Custom-Fields-Reference).
     * For additional documentation on how to record data within custom fields, please see our
     * subscription-based documentation
     * [here.](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404434903181-Subscription-Summary#custom-fields)
     * Metafield are the place where you will set up your resource to accept additional data. It is
     * scoped to the site instead of a specific customer or subscription. Think of it as the key,
     * and Metadata as the value on every record. ## Create Metafields Use this endpoint to create
     * metafields for your Site. Metafields can be populated with metadata after the fact. Each site
     * is limited to 100 unique Metafields (i.e. keys, or names) per resource. This means you can
     * have 100 Metafields for Subscription and another 100 for Customer. ### Metafields
     * "On-the-Fly" It is possible to create Metafields “on the fly” when you create your Metadata –
     * if a non-existant name is passed when creating Metadata, a Metafield for that key will be
     * automatically created. The Metafield API, however, gives you more control over your “keys”.
     * ### Metafield Scope Warning If configuring metafields in the Admin UI or via the API, be
     * careful sending updates to metafields with the scope attribute – **if a partial update is
     * sent it will overwrite the current configuration**.
     * @param  resourceType  Required parameter: the resource type to which the metafields belong
     * @param  body  Optional parameter: Example:
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
            final CreateMetafieldsRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<List<Metafield>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/{resource_type}/metafields.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("resource_type").value((resourceType != null) ? resourceType.value() : null)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        Metafield[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This endpoint lists metafields associated with a site. The metafield description and usage is
     * contained in the response.
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
            final ListMetafieldsInput input) throws IOException {
        return new ApiCall.Builder<ListMetafieldsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
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
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListMetafieldsResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Use the following method to update metafields for your Site. Metafields can be populated with
     * metadata after the fact.
     * @param  resourceType  Required parameter: the resource type to which the metafields belong
     * @param  name  Required parameter: Name of the custom field.
     * @param  currentName  Optional parameter: This only applies when you are updating an existing
     *         record and you wish to rename the field. Note you must supply name and current_name
     *         to rename the field
     * @param  body  Optional parameter: Example:
     * @return    Returns the List of Metafield response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<Metafield> updateMetafield(
            final ResourceType resourceType,
            final String name,
            final String currentName,
            final UpdateMetafieldsRequest body) throws ApiException, IOException {
        return prepareUpdateMetafieldRequest(resourceType, name, currentName, body).execute();
    }

    /**
     * Builds the ApiCall object for updateMetafield.
     */
    private ApiCall<List<Metafield>, ApiException> prepareUpdateMetafieldRequest(
            final ResourceType resourceType,
            final String name,
            final String currentName,
            final UpdateMetafieldsRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<List<Metafield>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/{resource_type}/metafields.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .queryParam(param -> param.key("name")
                                .value(name))
                        .queryParam(param -> param.key("current_name")
                                .value(currentName).isRequired(false))
                        .templateParam(param -> param.key("resource_type").value((resourceType != null) ? resourceType.value() : null)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        Metafield[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Use the following method to delete a metafield. This will remove the metafield from the Site.
     * Additionally, this will remove the metafield and associated metadata with all Subscriptions
     * on the Site.
     * @param  resourceType  Required parameter: the resource type to which the metafields belong
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
            final String name) throws IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/{resource_type}/metafields.json")
                        .queryParam(param -> param.key("name")
                                .value(name).isRequired(false))
                        .templateParam(param -> param.key("resource_type").value((resourceType != null) ? resourceType.value() : null)
                                .shouldEncode(true))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * ## Custom Fields: Metadata Intro **Chargify refers to Custom Fields in the API documentation
     * as metafields and metadata.** Within the Chargify UI, metadata and metafields are grouped
     * together under the umbrella of "Custom Fields." All of our UI-based documentation that
     * references custom fields will not cite the terminology metafields or metadata. + **Metafield
     * is the custom field** + **Metadata is the data populating the custom field.** Chargify
     * Metafields are used to add meaningful attributes to subscription and customer resources. Full
     * documentation on how to create Custom Fields in the Chargify UI can be located
     * [here](https://chargify.zendesk.com/hc/en-us/articles/4407659856411). For additional
     * documentation on how to record data within custom fields, please see our subscription-based
     * documentation
     * [here.](https://chargify.zendesk.com/hc/en-us/articles/4407884887835#custom-fields) Metadata
     * is associated to a customer or subscription, and corresponds to a Metafield. When creating a
     * new metadata object for a given record, **if the metafield is not present it will be
     * created**. ## Metadata limits Metadata values are limited to 2kB in size. Additonally, there
     * are limits on the number of unique metafields available per resource. ## Create Metadata This
     * method will create a metafield for the site on the fly if it does not already exist, and
     * populate the metadata value. ### Subscription or Customer Resource Please pay special
     * attention to the resource you use when creating metadata.
     * @param  resourceType  Required parameter: the resource type to which the metafields belong
     * @param  resourceId  Required parameter: The Chargify id of the customer or the subscription
     *         for which the metadata applies
     * @param  value  Optional parameter: Can be a single item or a list of metadata
     * @param  body  Optional parameter: Example:
     * @return    Returns the List of Metadata response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<Metadata> createMetadata(
            final ResourceType resourceType,
            final String resourceId,
            final String value,
            final CreateMetadataRequest body) throws ApiException, IOException {
        return prepareCreateMetadataRequest(resourceType, resourceId, value, body).execute();
    }

    /**
     * Builds the ApiCall object for createMetadata.
     */
    private ApiCall<List<Metadata>, ApiException> prepareCreateMetadataRequest(
            final ResourceType resourceType,
            final String resourceId,
            final String value,
            final CreateMetadataRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<List<Metadata>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/{resource_type}/{resource_id}/metadata.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .queryParam(param -> param.key("value")
                                .value(value).isRequired(false))
                        .templateParam(param -> param.key("resource_type").value((resourceType != null) ? resourceType.value() : null)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("resource_id").value(resourceId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        Metadata[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This request will list all of the metadata belonging to a particular resource (ie.
     * subscription, customer) that is specified. ## Metadata Data This endpoint will also display
     * the current stats of your metadata to use as a tool for pagination.
     * @param  input  ReadMetadataInput object containing request parameters
     * @return    Returns the PaginatedMetadata response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PaginatedMetadata readMetadata(
            final ReadMetadataInput input) throws ApiException, IOException {
        return prepareReadMetadataRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for readMetadata.
     */
    private ApiCall<PaginatedMetadata, ApiException> prepareReadMetadataRequest(
            final ReadMetadataInput input) throws IOException {
        return new ApiCall.Builder<PaginatedMetadata, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/{resource_type}/{resource_id}/metadata.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .templateParam(param -> param.key("resource_type").value((input.getResourceType() != null) ? input.getResourceType().value() : null)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("resource_id").value(input.getResourceId())
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PaginatedMetadata.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This method allows you to update the existing metadata associated with a subscription or
     * customer.
     * @param  resourceType  Required parameter: the resource type to which the metafields belong
     * @param  resourceId  Required parameter: The Chargify id of the customer or the subscription
     *         for which the metadata applies
     * @param  value  Optional parameter: Can be a single item or a list of metadata
     * @param  body  Optional parameter: Example:
     * @return    Returns the List of Metadata response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<Metadata> updateMetadata(
            final ResourceType resourceType,
            final String resourceId,
            final String value,
            final UpdateMetadataRequest body) throws ApiException, IOException {
        return prepareUpdateMetadataRequest(resourceType, resourceId, value, body).execute();
    }

    /**
     * Builds the ApiCall object for updateMetadata.
     */
    private ApiCall<List<Metadata>, ApiException> prepareUpdateMetadataRequest(
            final ResourceType resourceType,
            final String resourceId,
            final String value,
            final UpdateMetadataRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<List<Metadata>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/{resource_type}/{resource_id}/metadata.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .queryParam(param -> param.key("value")
                                .value(value).isRequired(false))
                        .templateParam(param -> param.key("resource_type").value((resourceType != null) ? resourceType.value() : null)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("resource_id").value(resourceId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        Metadata[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This method removes the metadata from the subscriber/customer cited. ## Query String Usage
     * For instance if you wanted to delete the metadata for customer 99 named weight you would
     * request: ``` https://acme.chargify.com/customers/99/metadata.json?name=weight ``` If you want
     * to delete multiple metadata fields for a customer 99 named: `weight` and `age` you wrould
     * request: ``` https://acme.chargify.com/customers/99/metadata.json?names[]=weight&amp;names[]=age
     * ``` ## Successful Response For a success, there will be a code `200` and the plain text
     * response `true`. ## Unsuccessful Response When a failed response is encountered, you will
     * receive a `404` response and the plain text response of `true`.
     * @param  resourceType  Required parameter: the resource type to which the metafields belong
     * @param  resourceId  Required parameter: The Chargify id of the customer or the subscription
     *         for which the metadata applies
     * @param  name  Optional parameter: Name of field to be removed.
     * @param  names  Optional parameter: Names of fields to be removed. Use in query:
     *         `names[]=field1&amp;names[]=my-field&amp;names[]=another-field`.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void deleteMetadata(
            final ResourceType resourceType,
            final String resourceId,
            final String name,
            final List<String> names) throws ApiException, IOException {
        prepareDeleteMetadataRequest(resourceType, resourceId, name, names).execute();
    }

    /**
     * Builds the ApiCall object for deleteMetadata.
     */
    private ApiCall<Void, ApiException> prepareDeleteMetadataRequest(
            final ResourceType resourceType,
            final String resourceId,
            final String name,
            final List<String> names) throws IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/{resource_type}/{resource_id}/metadata.json")
                        .queryParam(param -> param.key("name")
                                .value(name).isRequired(false))
                        .queryParam(param -> param.key("names[]")
                                .value(names).isRequired(false))
                        .templateParam(param -> param.key("resource_type").value((resourceType != null) ? resourceType.value() : null)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("resource_id").value(resourceId)
                                .shouldEncode(true))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.PLAIN))
                .build();
    }

    /**
     * This method will provide you information on usage of metadata across your selected resource
     * (ie. subscriptions, customers) ## Metadata Data This endpoint will also display the current
     * stats of your metadata to use as a tool for pagination. ### Metadata for multiple records
     * `https://acme.chargify.com/subscriptions/metadata.json?resource_ids[]=1&amp;resource_ids[]=2` ##
     * Read Metadata for a Site This endpoint will list the number of pages of metadata information
     * that are contained within a site.
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
            final ListMetadataInput input) throws IOException {
        return new ApiCall.Builder<PaginatedMetadata, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/{resource_type}/metadata.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("date_field")
                                .value((input.getDateField() != null) ? input.getDateField().value() : null).isRequired(false))
                        .queryParam(param -> param.key("start_date")
                                .value(input.getStartDate()).isRequired(false))
                        .queryParam(param -> param.key("end_date")
                                .value(input.getEndDate()).isRequired(false))
                        .queryParam(param -> param.key("start_datetime")
                                .value(input.getStartDatetime()).isRequired(false))
                        .queryParam(param -> param.key("end_datetime")
                                .value(input.getEndDatetime()).isRequired(false))
                        .queryParam(param -> param.key("with_deleted")
                                .value(input.getWithDeleted()).isRequired(false))
                        .queryParam(param -> param.key("resource_ids[]")
                                .value(input.getResourceIds()).isRequired(false))
                        .queryParam(param -> param.key("direction")
                                .value((input.getDirection() != null) ? input.getDirection().value() : null).isRequired(false))
                        .templateParam(param -> param.key("resource_type").value((input.getResourceType() != null) ? input.getResourceType().value() : null)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PaginatedMetadata.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.PLAIN))
                .build();
    }
}