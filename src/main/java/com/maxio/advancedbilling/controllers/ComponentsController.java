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
import com.maxio.advancedbilling.exceptions.ErrorArrayMapResponseException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentCurrencyPricesResponse;
import com.maxio.advancedbilling.models.ComponentPricePointResponse;
import com.maxio.advancedbilling.models.ComponentPricePointsResponse;
import com.maxio.advancedbilling.models.ComponentResponse;
import com.maxio.advancedbilling.models.CreateComponentPricePointRequest;
import com.maxio.advancedbilling.models.CreateComponentPricePointsRequest;
import com.maxio.advancedbilling.models.CreateCurrencyPricesRequest;
import com.maxio.advancedbilling.models.CreateEBBComponent;
import com.maxio.advancedbilling.models.CreateMeteredComponent;
import com.maxio.advancedbilling.models.CreateOnOffComponent;
import com.maxio.advancedbilling.models.CreatePrepaidComponent;
import com.maxio.advancedbilling.models.CreateQuantityBasedComponent;
import com.maxio.advancedbilling.models.ListAllComponentPricePointsInput;
import com.maxio.advancedbilling.models.ListComponentPricePointsInput;
import com.maxio.advancedbilling.models.ListComponentsForProductFamilyInput;
import com.maxio.advancedbilling.models.ListComponentsInput;
import com.maxio.advancedbilling.models.ListComponentsPricePointsResponse;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.UpdateComponentPricePointRequest;
import com.maxio.advancedbilling.models.UpdateComponentRequest;
import com.maxio.advancedbilling.models.UpdateCurrencyPricesRequest;
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
     * [here](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405020625677).
     * @param  productFamilyId  Required parameter: The Chargify id of the product family to which
     *         the component belongs
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentResponse createMeteredComponent(
            final int productFamilyId,
            final CreateMeteredComponent body) throws ApiException, IOException {
        return prepareCreateMeteredComponentRequest(productFamilyId, body).execute();
    }

    /**
     * Builds the ApiCall object for createMeteredComponent.
     */
    private ApiCall<ComponentResponse, ApiException> prepareCreateMeteredComponentRequest(
            final int productFamilyId,
            final CreateMeteredComponent body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/product_families/{product_family_id}/metered_components.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
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
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
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
     * [here](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405020625677).
     * @param  productFamilyId  Required parameter: The Chargify id of the product family to which
     *         the component belongs
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentResponse createQuantityBasedComponent(
            final int productFamilyId,
            final CreateQuantityBasedComponent body) throws ApiException, IOException {
        return prepareCreateQuantityBasedComponentRequest(productFamilyId, body).execute();
    }

    /**
     * Builds the ApiCall object for createQuantityBasedComponent.
     */
    private ApiCall<ComponentResponse, ApiException> prepareCreateQuantityBasedComponentRequest(
            final int productFamilyId,
            final CreateQuantityBasedComponent body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/product_families/{product_family_id}/quantity_based_components.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
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
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This request will create a component definition of kind **on_off_component** under the
     * specified product family. On/Off component can then be added and “allocated” for a
     * subscription. On/off components are used for any flat fee, recurring add on (think $99/month
     * for tech support or a flat add on shipping fee). For more information on components, please
     * see our documentation
     * [here](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405020625677).
     * @param  productFamilyId  Required parameter: The Chargify id of the product family to which
     *         the component belongs
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentResponse createOnOffComponent(
            final int productFamilyId,
            final CreateOnOffComponent body) throws ApiException, IOException {
        return prepareCreateOnOffComponentRequest(productFamilyId, body).execute();
    }

    /**
     * Builds the ApiCall object for createOnOffComponent.
     */
    private ApiCall<ComponentResponse, ApiException> prepareCreateOnOffComponentRequest(
            final int productFamilyId,
            final CreateOnOffComponent body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/product_families/{product_family_id}/on_off_components.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
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
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
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
     * documentation [here](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405020625677).
     * @param  productFamilyId  Required parameter: The Chargify id of the product family to which
     *         the component belongs
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentResponse createPrepaidUsageComponent(
            final int productFamilyId,
            final CreatePrepaidComponent body) throws ApiException, IOException {
        return prepareCreatePrepaidUsageComponentRequest(productFamilyId, body).execute();
    }

    /**
     * Builds the ApiCall object for createPrepaidUsageComponent.
     */
    private ApiCall<ComponentResponse, ApiException> prepareCreatePrepaidUsageComponentRequest(
            final int productFamilyId,
            final CreatePrepaidComponent body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/product_families/{product_family_id}/prepaid_usage_components.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
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
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
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
     * [here](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405020625677).
     * @param  productFamilyId  Required parameter: The Chargify id of the product family to which
     *         the component belongs
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentResponse createEventBasedComponent(
            final int productFamilyId,
            final CreateEBBComponent body) throws ApiException, IOException {
        return prepareCreateEventBasedComponentRequest(productFamilyId, body).execute();
    }

    /**
     * Builds the ApiCall object for createEventBasedComponent.
     */
    private ApiCall<ComponentResponse, ApiException> prepareCreateEventBasedComponentRequest(
            final int productFamilyId,
            final CreateEBBComponent body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/product_families/{product_family_id}/event_based_components.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
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
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
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
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components/lookup.json")
                        .queryParam(param -> param.key("handle")
                                .value(handle))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This request will return information regarding a component from a specific product family.
     * You may read the component by either the component's id or handle. When using the handle, it
     * must be prefixed with `handle:`.
     * @param  productFamilyId  Required parameter: The Chargify id of the product family to which
     *         the component belongs
     * @param  componentId  Required parameter: Either the Chargify id of the component or the
     *         handle for the component prefixed with `handle:`
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
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/product_families/{product_family_id}/components/{component_id}.json")
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("component_id").value(componentId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This request will update a component from a specific product family. You may read the
     * component by either the component's id or handle. When using the handle, it must be prefixed
     * with `handle:`.
     * @param  productFamilyId  Required parameter: The Chargify id of the product family to which
     *         the component belongs
     * @param  componentId  Required parameter: Either the Chargify id of the component or the
     *         handle for the component prefixed with `handle:`
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
                        .server(Server.ENUM_DEFAULT.value())
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
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Sending a DELETE request to this endpoint will archive the component. All current subscribers
     * will be unffected; their subscription/purchase will continue to be charged as usual.
     * @param  productFamilyId  Required parameter: The Chargify id of the product family to which
     *         the component belongs
     * @param  componentId  Required parameter: Either the Chargify id of the component or the
     *         handle for the component prefixed with `handle:`
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
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/product_families/{product_family_id}/components/{component_id}.json")
                        .templateParam(param -> param.key("product_family_id").value(productFamilyId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("component_id").value(componentId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Component.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
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
                        .server(Server.ENUM_DEFAULT.value())
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
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        ComponentResponse[].class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
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
                        .server(Server.ENUM_DEFAULT.value())
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
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Sets a new default price point for the component. This new default will apply to all new
     * subscriptions going forward - existing subscriptions will remain on their current price
     * point. See [Price Points
     * Documentation](https://chargify.zendesk.com/hc/en-us/articles/4407755865883#price-points) for
     * more information on price points and moving subscriptions between price points. Note: Custom
     * price points are not able to be set as the default for a component.
     * @param  componentId  Required parameter: The Chargify id of the component to which the price
     *         point belongs
     * @param  pricePointId  Required parameter: The Chargify id of the price point
     * @return    Returns the ComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentResponse promoteComponentPricePointToDefault(
            final int componentId,
            final int pricePointId) throws ApiException, IOException {
        return preparePromoteComponentPricePointToDefaultRequest(componentId,
                pricePointId).execute();
    }

    /**
     * Builds the ApiCall object for promoteComponentPricePointToDefault.
     */
    private ApiCall<ComponentResponse, ApiException> preparePromoteComponentPricePointToDefaultRequest(
            final int componentId,
            final int pricePointId) throws IOException {
        return new ApiCall.Builder<ComponentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components/{component_id}/price_points/{price_point_id}/default.json")
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
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
                        .server(Server.ENUM_DEFAULT.value())
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
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        ComponentResponse[].class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This endpoint can be used to create a new price point for an existing component.
     * @param  componentId  Required parameter: The Chargify id of the component
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentPricePointResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentPricePointResponse createComponentPricePoint(
            final int componentId,
            final CreateComponentPricePointRequest body) throws ApiException, IOException {
        return prepareCreateComponentPricePointRequest(componentId, body).execute();
    }

    /**
     * Builds the ApiCall object for createComponentPricePoint.
     */
    private ApiCall<ComponentPricePointResponse, ApiException> prepareCreateComponentPricePointRequest(
            final int componentId,
            final CreateComponentPricePointRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentPricePointResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components/{component_id}/price_points.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentPricePointResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Use this endpoint to read current price points that are associated with a component. You may
     * specify the component by using either the numeric id or the `handle:gold` syntax. When
     * fetching a component's price points, if you have defined multiple currencies at the site
     * level, you can optionally pass the `?currency_prices=true` query param to include an array of
     * currency price data in the response. If the price point is set to `use_site_exchange_rate:
     * true`, it will return pricing based on the current exchange rate. If the flag is set to
     * false, it will return all of the defined prices for each currency.
     * @param  input  ListComponentPricePointsInput object containing request parameters
     * @return    Returns the ComponentPricePointsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentPricePointsResponse listComponentPricePoints(
            final ListComponentPricePointsInput input) throws ApiException, IOException {
        return prepareListComponentPricePointsRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listComponentPricePoints.
     */
    private ApiCall<ComponentPricePointsResponse, ApiException> prepareListComponentPricePointsRequest(
            final ListComponentPricePointsInput input) throws IOException {
        return new ApiCall.Builder<ComponentPricePointsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components/{component_id}/price_points.json")
                        .queryParam(param -> param.key("currency_prices")
                                .value(input.getCurrencyPrices()).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("filter[type]")
                                .value(PricePointType.toValue(input.getFilterType())).isRequired(false))
                        .templateParam(param -> param.key("component_id").value(input.getComponentId()).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentPricePointsResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Use this endpoint to create multiple component price points in one request.
     * @param  componentId  Required parameter: The Chargify id of the component for which you want
     *         to fetch price points.
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentPricePointsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentPricePointsResponse bulkCreateComponentPricePoints(
            final String componentId,
            final CreateComponentPricePointsRequest body) throws ApiException, IOException {
        return prepareBulkCreateComponentPricePointsRequest(componentId, body).execute();
    }

    /**
     * Builds the ApiCall object for bulkCreateComponentPricePoints.
     */
    private ApiCall<ComponentPricePointsResponse, ApiException> prepareBulkCreateComponentPricePointsRequest(
            final String componentId,
            final CreateComponentPricePointsRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentPricePointsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components/{component_id}/price_points/bulk.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("component_id").value(componentId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentPricePointsResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * When updating a price point, it's prices can be updated as well by creating new prices or
     * editing / removing existing ones. Passing in a price bracket without an `id` will attempt to
     * create a new price. Including an `id` will update the corresponding price, and including the
     * `_destroy` flag set to true along with the `id` will remove that price. Note: Custom price
     * points cannot be updated directly. They must be edited through the Subscription.
     * @param  componentId  Required parameter: The Chargify id of the component to which the price
     *         point belongs
     * @param  pricePointId  Required parameter: The Chargify id of the price point
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentPricePointResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentPricePointResponse updateComponentPricePoint(
            final int componentId,
            final int pricePointId,
            final UpdateComponentPricePointRequest body) throws ApiException, IOException {
        return prepareUpdateComponentPricePointRequest(componentId, pricePointId, body).execute();
    }

    /**
     * Builds the ApiCall object for updateComponentPricePoint.
     */
    private ApiCall<ComponentPricePointResponse, ApiException> prepareUpdateComponentPricePointRequest(
            final int componentId,
            final int pricePointId,
            final UpdateComponentPricePointRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentPricePointResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components/{component_id}/price_points/{price_point_id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentPricePointResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorArrayMapResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * A price point can be archived at any time. Subscriptions using a price point that has been
     * archived will continue using it until they're moved to another price point.
     * @param  componentId  Required parameter: The Chargify id of the component to which the price
     *         point belongs
     * @param  pricePointId  Required parameter: The Chargify id of the price point
     * @return    Returns the ComponentPricePointResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentPricePointResponse archiveComponentPricePoint(
            final int componentId,
            final int pricePointId) throws ApiException, IOException {
        return prepareArchiveComponentPricePointRequest(componentId, pricePointId).execute();
    }

    /**
     * Builds the ApiCall object for archiveComponentPricePoint.
     */
    private ApiCall<ComponentPricePointResponse, ApiException> prepareArchiveComponentPricePointRequest(
            final int componentId,
            final int pricePointId) throws IOException {
        return new ApiCall.Builder<ComponentPricePointResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components/{component_id}/price_points/{price_point_id}.json")
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentPricePointResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Use this endpoint to unarchive a component price point.
     * @param  componentId  Required parameter: The Chargify id of the component to which the price
     *         point belongs
     * @param  pricePointId  Required parameter: The Chargify id of the price point
     * @return    Returns the ComponentPricePointResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentPricePointResponse unarchiveComponentPricePoint(
            final int componentId,
            final int pricePointId) throws ApiException, IOException {
        return prepareUnarchiveComponentPricePointRequest(componentId, pricePointId).execute();
    }

    /**
     * Builds the ApiCall object for unarchiveComponentPricePoint.
     */
    private ApiCall<ComponentPricePointResponse, ApiException> prepareUnarchiveComponentPricePointRequest(
            final int componentId,
            final int pricePointId) throws IOException {
        return new ApiCall.Builder<ComponentPricePointResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components/{component_id}/price_points/{price_point_id}/unarchive.json")
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentPricePointResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This endpoint allows you to create currency prices for a given currency that has been defined
     * on the site level in your settings. When creating currency prices, they need to mirror the
     * structure of your primary pricing. For each price level defined on the component price point,
     * there should be a matching price level created in the given currency. Note: Currency Prices
     * are not able to be created for custom price points.
     * @param  pricePointId  Required parameter: The Chargify id of the price point
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentCurrencyPricesResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentCurrencyPricesResponse createCurrencyPrices(
            final int pricePointId,
            final CreateCurrencyPricesRequest body) throws ApiException, IOException {
        return prepareCreateCurrencyPricesRequest(pricePointId, body).execute();
    }

    /**
     * Builds the ApiCall object for createCurrencyPrices.
     */
    private ApiCall<ComponentCurrencyPricesResponse, ApiException> prepareCreateCurrencyPricesRequest(
            final int pricePointId,
            final CreateCurrencyPricesRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentCurrencyPricesResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/price_points/{price_point_id}/currency_prices.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentCurrencyPricesResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorArrayMapResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This endpoint allows you to update currency prices for a given currency that has been defined
     * on the site level in your settings. Note: Currency Prices are not able to be updated for
     * custom price points.
     * @param  pricePointId  Required parameter: The Chargify id of the price point
     * @param  body  Optional parameter: Example:
     * @return    Returns the ComponentCurrencyPricesResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ComponentCurrencyPricesResponse updateCurrencyPrices(
            final int pricePointId,
            final UpdateCurrencyPricesRequest body) throws ApiException, IOException {
        return prepareUpdateCurrencyPricesRequest(pricePointId, body).execute();
    }

    /**
     * Builds the ApiCall object for updateCurrencyPrices.
     */
    private ApiCall<ComponentCurrencyPricesResponse, ApiException> prepareUpdateCurrencyPricesRequest(
            final int pricePointId,
            final UpdateCurrencyPricesRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ComponentCurrencyPricesResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/price_points/{price_point_id}/currency_prices.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ComponentCurrencyPricesResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorArrayMapResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This method allows to retrieve a list of Components Price Points belonging to a Site.
     * @param  input  ListAllComponentPricePointsInput object containing request parameters
     * @return    Returns the ListComponentsPricePointsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListComponentsPricePointsResponse listAllComponentPricePoints(
            final ListAllComponentPricePointsInput input) throws ApiException, IOException {
        return prepareListAllComponentPricePointsRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listAllComponentPricePoints.
     */
    private ApiCall<ListComponentsPricePointsResponse, ApiException> prepareListAllComponentPricePointsRequest(
            final ListAllComponentPricePointsInput input) throws IOException {
        return new ApiCall.Builder<ListComponentsPricePointsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components_price_points.json")
                        .queryParam(param -> param.key("include")
                                .value((input.getInclude() != null) ? input.getInclude().value() : null).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("direction")
                                .value((input.getDirection() != null) ? input.getDirection().value() : null).isRequired(false))
                        .queryParam(param -> param.key("filter")
                                .value(input.getFilter()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListComponentsPricePointsResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }
}