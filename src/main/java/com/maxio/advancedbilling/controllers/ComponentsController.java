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
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentResponse;
import com.maxio.advancedbilling.models.CreateEBBComponent;
import com.maxio.advancedbilling.models.CreateMeteredComponent;
import com.maxio.advancedbilling.models.CreateOnOffComponent;
import com.maxio.advancedbilling.models.CreatePrepaidComponent;
import com.maxio.advancedbilling.models.CreateQuantityBasedComponent;
import com.maxio.advancedbilling.models.ListComponentsForProductFamilyInput;
import com.maxio.advancedbilling.models.ListComponentsInput;
import com.maxio.advancedbilling.models.UpdateComponentRequest;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;
import java.util.List;

/**
 * This class lists all the endpoints of the groups.
 */
public final class ComponentsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public ComponentsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This request will create a component definition of kind **metered_component** under the
     * specified product family. Metered component can then be added and “allocated” for a
     * subscription. Metered components are used to bill for any type of unit that resets to 0 at
     * the end of the billing period (think daily Google Adwords clicks or monthly cell phone
     * minutes). This is most commonly associated with usage-based billing and many other pricing
     * schemes. Note that this is different from recurring quantity-based components, which DO NOT
     * reset to zero at the start of every billing period. If you want to bill for a quantity of
     * something that does not change unless you change it, then you want quantity components,
     * instead. For more information on components, please see our documentation
     * [here](https://maxio.zendesk.com/hc/en-us/articles/24261141522189-Components-Overview).
     * @param  productFamilyId  Required parameter: Either the product family's id or its handle
     *         prefixed with `handle:`
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentResponse createMeteredComponent(
            final String productFamilyId,
            final CreateMeteredComponent body) throws ApiException, IOException {
        return prepareCreateMeteredComponentRequest(productFamilyId, body).execute();
    }

    /**
     * Builds the ApiCall object for createMeteredComponent.
     */
    private ApiCall<ComponentResponse, ApiException> prepareCreateMeteredComponentRequest(
            final String productFamilyId,
            final CreateMeteredComponent body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/product_families/{product_family_id}/metered_components.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId)
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
                                response -> ApiHelper.deserialize(response, ComponentResponse.class))
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
     * This request will create a component definition of kind **quantity_based_component** under
     * the specified product family. Quantity Based component can then be added and “allocated” for
     * a subscription. When defining Quantity Based component, You can choose one of 2 types: ####
     * Recurring Recurring quantity-based components are used to bill for the number of some unit
     * (think monthly software user licenses or the number of pairs of socks in a box-a-month club).
     * This is most commonly associated with billing for user licenses, number of users, number of
     * employees, etc. #### One-time One-time quantity-based components are used to create ad hoc
     * usage charges that do not recur. For example, at the time of signup, you might want to charge
     * your customer a one-time fee for onboarding or other services. The allocated quantity for
     * one-time quantity-based components immediately gets reset back to zero after the allocation
     * is made. For more information on components, please see our documentation
     * [here](https://maxio.zendesk.com/hc/en-us/articles/24261141522189-Components-Overview).
     * @param  productFamilyId  Required parameter: Either the product family's id or its handle
     *         prefixed with `handle:`
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentResponse createQuantityBasedComponent(
            final String productFamilyId,
            final CreateQuantityBasedComponent body) throws ApiException, IOException {
        return prepareCreateQuantityBasedComponentRequest(productFamilyId, body).execute();
    }

    /**
     * Builds the ApiCall object for createQuantityBasedComponent.
     */
    private ApiCall<ComponentResponse, ApiException> prepareCreateQuantityBasedComponentRequest(
            final String productFamilyId,
            final CreateQuantityBasedComponent body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/product_families/{product_family_id}/quantity_based_components.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId)
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
                                response -> ApiHelper.deserialize(response, ComponentResponse.class))
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
     * This request will create a component definition of kind **on_off_component** under the
     * specified product family. On/Off component can then be added and “allocated” for a
     * subscription. On/off components are used for any flat fee, recurring add on (think $99/month
     * for tech support or a flat add on shipping fee). For more information on components, please
     * see our documentation
     * [here](https://maxio.zendesk.com/hc/en-us/articles/24261141522189-Components-Overview).
     * @param  productFamilyId  Required parameter: Either the product family's id or its handle
     *         prefixed with `handle:`
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentResponse createOnOffComponent(
            final String productFamilyId,
            final CreateOnOffComponent body) throws ApiException, IOException {
        return prepareCreateOnOffComponentRequest(productFamilyId, body).execute();
    }

    /**
     * Builds the ApiCall object for createOnOffComponent.
     */
    private ApiCall<ComponentResponse, ApiException> prepareCreateOnOffComponentRequest(
            final String productFamilyId,
            final CreateOnOffComponent body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/product_families/{product_family_id}/on_off_components.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId)
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
                                response -> ApiHelper.deserialize(response, ComponentResponse.class))
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
     * This request will create a component definition of kind **prepaid_usage_component** under the
     * specified product family. Prepaid component can then be added and “allocated” for a
     * subscription. Prepaid components allow customers to pre-purchase units that can be used up
     * over time on their subscription. In a sense, they are the mirror image of metered components;
     * while metered components charge at the end of the period for the amount of units used,
     * prepaid components are charged for at the time of purchase, and we subsequently keep track of
     * the usage against the amount purchased. For more information on components, please see our
     * documentation
     * [here](https://maxio.zendesk.com/hc/en-us/articles/24261141522189-Components-Overview).
     * @param  productFamilyId  Required parameter: Either the product family's id or its handle
     *         prefixed with `handle:`
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentResponse createPrepaidUsageComponent(
            final String productFamilyId,
            final CreatePrepaidComponent body) throws ApiException, IOException {
        return prepareCreatePrepaidUsageComponentRequest(productFamilyId, body).execute();
    }

    /**
     * Builds the ApiCall object for createPrepaidUsageComponent.
     */
    private ApiCall<ComponentResponse, ApiException> prepareCreatePrepaidUsageComponentRequest(
            final String productFamilyId,
            final CreatePrepaidComponent body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/product_families/{product_family_id}/prepaid_usage_components.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId)
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
                                response -> ApiHelper.deserialize(response, ComponentResponse.class))
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
     * This request will create a component definition of kind **event_based_component** under the
     * specified product family. Event-based component can then be added and “allocated” for a
     * subscription. Event-based components are similar to other component types, in that you define
     * the component parameters (such as name and taxability) and the pricing. A key difference for
     * the event-based component is that it must be attached to a metric. This is because the metric
     * provides the component with the actual quantity used in computing what and how much will be
     * billed each period for each subscription. So, instead of reporting usage directly for each
     * component (as you would with metered components), the usage is derived from analysis of your
     * events. For more information on components, please see our documentation
     * [here](https://maxio.zendesk.com/hc/en-us/articles/24261141522189-Components-Overview).
     * @param  productFamilyId  Required parameter: Either the product family's id or its handle
     *         prefixed with `handle:`
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentResponse createEventBasedComponent(
            final String productFamilyId,
            final CreateEBBComponent body) throws ApiException, IOException {
        return prepareCreateEventBasedComponentRequest(productFamilyId, body).execute();
    }

    /**
     * Builds the ApiCall object for createEventBasedComponent.
     */
    private ApiCall<ComponentResponse, ApiException> prepareCreateEventBasedComponentRequest(
            final String productFamilyId,
            final CreateEBBComponent body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/product_families/{product_family_id}/event_based_components.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId)
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
                                response -> ApiHelper.deserialize(response, ComponentResponse.class))
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
     * This request will return information regarding a component having the handle you provide. You
     * can identify your components with a handle so you don't have to save or reference the IDs we
     * generate.
     * @param  handle  Required parameter: The handle of the component to find
     * @return    Returns the ComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentResponse findComponent(
            final String handle) throws ApiException, IOException {
        return prepareFindComponentRequest(handle).execute();
    }

    /**
     * Builds the ApiCall object for findComponent.
     */
    private ApiCall<ComponentResponse, ApiException> prepareFindComponentRequest(
            final String handle) throws IOException {
        return new ApiCall.Builder<ComponentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/components/lookup.json")
                        .queryParam(param -> param.key("handle")
                                .value(handle))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This request will return information regarding a component from a specific product family.
     * You may read the component by either the component's id or handle. When using the handle, it
     * must be prefixed with `handle:`.
     * @param  productFamilyId  Required parameter: The Advanced Billing id of the product family to
     *         which the component belongs
     * @param  componentId  Required parameter: Either the Advanced Billing id of the component or
     *         the handle for the component prefixed with `handle:`
     * @return    Returns the ComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentResponse readComponent(
            final int productFamilyId,
            final String componentId) throws ApiException, IOException {
        return prepareReadComponentRequest(productFamilyId, componentId).execute();
    }

    /**
     * Builds the ApiCall object for readComponent.
     */
    private ApiCall<ComponentResponse, ApiException> prepareReadComponentRequest(
            final int productFamilyId,
            final String componentId) throws IOException {
        return new ApiCall.Builder<ComponentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/product_families/{product_family_id}/components/{component_id}.json")
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("component_id").value(componentId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This request will update a component from a specific product family. You may read the
     * component by either the component's id or handle. When using the handle, it must be prefixed
     * with `handle:`.
     * @param  productFamilyId  Required parameter: The Advanced Billing id of the product family to
     *         which the component belongs
     * @param  componentId  Required parameter: Either the Advanced Billing id of the component or
     *         the handle for the component prefixed with `handle:`
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentResponse updateProductFamilyComponent(
            final int productFamilyId,
            final String componentId,
            final UpdateComponentRequest body) throws ApiException, IOException {
        return prepareUpdateProductFamilyComponentRequest(productFamilyId, componentId,
                body).execute();
    }

    /**
     * Builds the ApiCall object for updateProductFamilyComponent.
     */
    private ApiCall<ComponentResponse, ApiException> prepareUpdateProductFamilyComponentRequest(
            final int productFamilyId,
            final String componentId,
            final UpdateComponentRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/product_families/{product_family_id}/components/{component_id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("component_id").value(componentId)
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
                                response -> ApiHelper.deserialize(response, ComponentResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Sending a DELETE request to this endpoint will archive the component. All current subscribers
     * will be unffected; their subscription/purchase will continue to be charged as usual.
     * @param  productFamilyId  Required parameter: The Advanced Billing id of the product family to
     *         which the component belongs
     * @param  componentId  Required parameter: Either the Advanced Billing id of the component or
     *         the handle for the component prefixed with `handle:`
     * @return    Returns the Component response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Component archiveComponent(
            final int productFamilyId,
            final String componentId) throws ApiException, IOException {
        return prepareArchiveComponentRequest(productFamilyId, componentId).execute();
    }

    /**
     * Builds the ApiCall object for archiveComponent.
     */
    private ApiCall<Component, ApiException> prepareArchiveComponentRequest(
            final int productFamilyId,
            final String componentId) throws IOException {
        return new ApiCall.Builder<Component, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/product_families/{product_family_id}/components/{component_id}.json")
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("component_id").value(componentId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Component.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This request will return a list of components for a site.
     * @param  input  ListComponentsInput object containing request parameters
     * @return    Returns the List of ComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<ComponentResponse> listComponents(
            final ListComponentsInput input) throws ApiException, IOException {
        return prepareListComponentsRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listComponents.
     */
    private ApiCall<List<ComponentResponse>, ApiException> prepareListComponentsRequest(
            final ListComponentsInput input) throws IOException {
        return new ApiCall.Builder<List<ComponentResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/components.json")
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
                        .queryParam(param -> param.key("include_archived")
                                .value(input.getIncludeArchived()).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("filter")
                                .value(input.getFilter()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        ComponentResponse[].class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This request will update a component. You may read the component by either the component's id
     * or handle. When using the handle, it must be prefixed with `handle:`.
     * @param  componentId  Required parameter: The id or handle of the component
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentResponse updateComponent(
            final String componentId,
            final UpdateComponentRequest body) throws ApiException, IOException {
        return prepareUpdateComponentRequest(componentId, body).execute();
    }

    /**
     * Builds the ApiCall object for updateComponent.
     */
    private ApiCall<ComponentResponse, ApiException> prepareUpdateComponentRequest(
            final String componentId,
            final UpdateComponentRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/components/{component_id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("component_id").value(componentId)
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
                                response -> ApiHelper.deserialize(response, ComponentResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This request will return a list of components for a particular product family.
     * @param  input  ListComponentsForProductFamilyInput object containing request parameters
     * @return    Returns the List of ComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<ComponentResponse> listComponentsForProductFamily(
            final ListComponentsForProductFamilyInput input) throws ApiException, IOException {
        return prepareListComponentsForProductFamilyRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listComponentsForProductFamily.
     */
    private ApiCall<List<ComponentResponse>, ApiException> prepareListComponentsForProductFamilyRequest(
            final ListComponentsForProductFamilyInput input) throws IOException {
        return new ApiCall.Builder<List<ComponentResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/product_families/{product_family_id}/components.json")
                        .queryParam(param -> param.key("include_archived")
                                .value(input.getIncludeArchived()).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("filter")
                                .value(input.getFilter()).isRequired(false))
                        .queryParam(param -> param.key("date_field")
                                .value((input.getDateField() != null) ? input.getDateField().value() : null).isRequired(false))
                        .queryParam(param -> param.key("end_date")
                                .value(input.getEndDate()).isRequired(false))
                        .queryParam(param -> param.key("end_datetime")
                                .value(input.getEndDatetime()).isRequired(false))
                        .queryParam(param -> param.key("start_date")
                                .value(input.getStartDate()).isRequired(false))
                        .queryParam(param -> param.key("start_datetime")
                                .value(input.getStartDatetime()).isRequired(false))
                        .templateParam(param -> param.key("product_family_id").value(input.getProductFamilyId()).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        ComponentResponse[].class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}