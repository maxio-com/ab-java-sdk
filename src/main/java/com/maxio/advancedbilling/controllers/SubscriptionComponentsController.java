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
import com.maxio.advancedbilling.exceptions.ComponentAllocationErrorException;
import com.maxio.advancedbilling.exceptions.ComponentPricePointErrorException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.exceptions.SubscriptionComponentAllocationErrorException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.AllocateComponents;
import com.maxio.advancedbilling.models.AllocationPreviewResponse;
import com.maxio.advancedbilling.models.AllocationResponse;
import com.maxio.advancedbilling.models.BulkComponentSPricePointAssignment;
import com.maxio.advancedbilling.models.CreateAllocationRequest;
import com.maxio.advancedbilling.models.CreateUsageRequest;
import com.maxio.advancedbilling.models.CreditSchemeRequest;
import com.maxio.advancedbilling.models.EBBEvent;
import com.maxio.advancedbilling.models.ListSubscriptionComponentsForSiteInput;
import com.maxio.advancedbilling.models.ListSubscriptionComponentsInput;
import com.maxio.advancedbilling.models.ListSubscriptionComponentsResponse;
import com.maxio.advancedbilling.models.ListUsagesInput;
import com.maxio.advancedbilling.models.PreviewAllocationsRequest;
import com.maxio.advancedbilling.models.SubscriptionComponentResponse;
import com.maxio.advancedbilling.models.SubscriptionResponse;
import com.maxio.advancedbilling.models.SubscriptionState;
import com.maxio.advancedbilling.models.UpdateAllocationExpirationDate;
import com.maxio.advancedbilling.models.UsageResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;
import java.util.List;

/**
 * This class lists all the endpoints of the groups.
 */
public final class SubscriptionComponentsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public SubscriptionComponentsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This request will list information regarding a specific component owned by a subscription.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  componentId  Required parameter: The Chargify id of the component. Alternatively, the
     *         component's handle prefixed by `handle:`
     * @return    Returns the SubscriptionComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionComponentResponse readSubscriptionComponent(
            final String subscriptionId,
            final int componentId) throws ApiException, IOException {
        return prepareReadSubscriptionComponentRequest(subscriptionId, componentId).execute();
    }

    /**
     * Builds the ApiCall object for readSubscriptionComponent.
     */
    private ApiCall<SubscriptionComponentResponse, ApiException> prepareReadSubscriptionComponentRequest(
            final String subscriptionId,
            final int componentId) throws IOException {
        return new ApiCall.Builder<SubscriptionComponentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/components/{component_id}.json")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SubscriptionComponentResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This request will list a subscription's applied components. ## Archived Components When
     * requesting to list components for a given subscription, if the subscription contains
     * **archived** components they will be listed in the server response.
     * @param  input  ListSubscriptionComponentsInput object containing request parameters
     * @return    Returns the List of SubscriptionComponentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<SubscriptionComponentResponse> listSubscriptionComponents(
            final ListSubscriptionComponentsInput input) throws ApiException, IOException {
        return prepareListSubscriptionComponentsRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listSubscriptionComponents.
     */
    private ApiCall<List<SubscriptionComponentResponse>, ApiException> prepareListSubscriptionComponentsRequest(
            final ListSubscriptionComponentsInput input) throws IOException {
        return new ApiCall.Builder<List<SubscriptionComponentResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/components.json")
                        .queryParam(param -> param.key("date_field")
                                .value((input.getDateField() != null) ? input.getDateField().value() : null).isRequired(false))
                        .queryParam(param -> param.key("direction")
                                .value((input.getDirection() != null) ? input.getDirection().value() : null).isRequired(false))
                        .queryParam(param -> param.key("end_date")
                                .value(input.getEndDate()).isRequired(false))
                        .queryParam(param -> param.key("end_datetime")
                                .value(input.getEndDatetime()).isRequired(false))
                        .queryParam(param -> param.key("price_point_ids")
                                .value((input.getPricePointIds() != null) ? input.getPricePointIds().value() : null).isRequired(false))
                        .queryParam(param -> param.key("product_family_ids")
                                .value(input.getProductFamilyIds()).isRequired(false))
                        .queryParam(param -> param.key("sort")
                                .value((input.getSort() != null) ? input.getSort().value() : null).isRequired(false))
                        .queryParam(param -> param.key("start_date")
                                .value(input.getStartDate()).isRequired(false))
                        .queryParam(param -> param.key("start_datetime")
                                .value(input.getStartDatetime()).isRequired(false))
                        .queryParam(param -> param.key("include")
                                .value((input.getInclude() != null) ? input.getInclude().value() : null).isRequired(false))
                        .queryParam(param -> param.key("filter[use_site_exchange_rate]")
                                .value(input.getFilterUseSiteExchangeRate()).isRequired(false))
                        .queryParam(param -> param.key("filter[currencies]")
                                .value(input.getFilterCurrencies()).isRequired(false))
                        .templateParam(param -> param.key("subscription_id").value(input.getSubscriptionId())
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        SubscriptionComponentResponse[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Updates the price points on one or more of a subscription's components. The `price_point` key
     * can take either a: 1. Price point id (integer) 2. Price point handle (string) 3. `"_default"`
     * string, which will reset the price point to the component's current default price point.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  body  Optional parameter: Example:
     * @return    Returns the BulkComponentSPricePointAssignment response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BulkComponentSPricePointAssignment updateSubscriptionComponentsPricePoints(
            final String subscriptionId,
            final BulkComponentSPricePointAssignment body) throws ApiException, IOException {
        return prepareUpdateSubscriptionComponentsPricePointsRequest(subscriptionId,
                body).execute();
    }

    /**
     * Builds the ApiCall object for updateSubscriptionComponentsPricePoints.
     */
    private ApiCall<BulkComponentSPricePointAssignment, ApiException> prepareUpdateSubscriptionComponentsPricePointsRequest(
            final String subscriptionId,
            final BulkComponentSPricePointAssignment body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<BulkComponentSPricePointAssignment, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/price_points.json")
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
                                response -> ApiHelper.deserialize(response, BulkComponentSPricePointAssignment.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ComponentPricePointErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Resets all of a subscription's components to use the current default. **Note**: this will
     * update the price point for all of the subscription's components, even ones that have not been
     * allocated yet.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @return    Returns the SubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionResponse resetSubscriptionComponentsPricePoints(
            final String subscriptionId) throws ApiException, IOException {
        return prepareResetSubscriptionComponentsPricePointsRequest(subscriptionId).execute();
    }

    /**
     * Builds the ApiCall object for resetSubscriptionComponentsPricePoints.
     */
    private ApiCall<SubscriptionResponse, ApiException> prepareResetSubscriptionComponentsPricePointsRequest(
            final String subscriptionId) throws IOException {
        return new ApiCall.Builder<SubscriptionResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/price_points/reset.json")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SubscriptionResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This endpoint creates a new allocation, setting the current allocated quantity for the
     * Component and recording a memo. **Notice**: Allocations can only be updated for Quantity,
     * On/Off, and Prepaid Components. ## Allocations Documentation Full documentation on how to
     * record Allocations in the Chargify UI can be located
     * [here](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404527849997). It is focused on
     * how allocations operate within the Chargify UI.It goes into greater detail on how the user
     * interface will react when recording allocations. This documentation also goes into greater
     * detail on how proration is taken into consideration when applying component allocations. ##
     * Proration Schemes Changing the allocated quantity of a component mid-period can result in
     * either a Charge or Credit being applied to the subscription. When creating an allocation via
     * the API, you can pass the `upgrade_charge`, `downgrade_credit`, and `accrue_charge` to be
     * applied. **Notice:** These proration and accural fields will be ignored for Prepaid
     * Components since this component type always generate charges immediately without proration.
     * For background information on prorated components and upgrade/downgrade schemes, see [Setting
     * Component
     * Allocations.](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404527849997#proration-upgrades-vs-downgrades).
     * See the tables below for valid values. | upgrade_charge | Definition
     *                                |
     * |----------------|-------------------------------------------------------------------| |
     * `full`         | A charge is added for the full price of the component.            | |
     * `prorated`     | A charge is added for the prorated price of the component change. | | `none`
     *         | No charge is added.                                               | |
     * downgrade_credit | Definition                                        |
     * |------------------|---------------------------------------------------| | `full`
     * | A full price credit is added for the amount owed. | | `prorated`       | A prorated credit
     * is added for the amount owed.   | | `none`           | No charge is added.
     *             | | accrue_charge | Definition
     *                                             |
     * |---------------|------------------------------------------------------------------------------------------------------------|
     * | `true`        | Attempt to charge the customer at next renewal. | | `false`       | Attempt
     * to charge the customer right away. If it fails, the charge will be accrued until the next
     * renewal. | ### Order of Resolution for upgrade_charge and downgrade_credit 1. Per allocation
     * in API call (within a single allocation of the `allocations` array) 2. [Component-level
     * default
     * value](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404527849997-Component-Allocations#component-allocations-0-0)
     * 3. Allocation API call top level (outside of the `allocations` array) 4. [Site-level default
     * value](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404527849997#proration-schemes)
     * ### Order of Resolution for accrue charge 1. Allocation API call top level (outside of the
     * `allocations` array) 2. [Site-level default
     * value](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404527849997#proration-schemes)
     * **NOTE: Proration uses the current price of the component as well as the current tax rates.
     * Changes to either may cause the prorated charge/credit to be wrong.**.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  componentId  Required parameter: The Chargify id of the component
     * @param  body  Optional parameter: Example:
     * @return    Returns the AllocationResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public AllocationResponse allocateComponent(
            final String subscriptionId,
            final int componentId,
            final CreateAllocationRequest body) throws ApiException, IOException {
        return prepareAllocateComponentRequest(subscriptionId, componentId, body).execute();
    }

    /**
     * Builds the ApiCall object for allocateComponent.
     */
    private ApiCall<AllocationResponse, ApiException> prepareAllocateComponentRequest(
            final String subscriptionId,
            final int componentId,
            final CreateAllocationRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<AllocationResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/components/{component_id}/allocations.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, AllocationResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This endpoint returns the 50 most recent Allocations, ordered by most recent first. ## On/Off
     * Components When a subscription's on/off component has been toggled to on (`1`) or off (`0`),
     * usage will be logged in this response. ## Querying data via Chargify gem You can also query
     * the current quantity via the [official Chargify
     * Gem.](http://github.com/chargify/chargify_api_ares) ```# First way component =
     * Chargify::Subscription::Component.find(1, :params =&gt; {:subscription_id =&gt; 7}) puts
     * component.allocated_quantity # =&gt; 23 # Second way component =
     * Chargify::Subscription.find(7).component(1) puts component.allocated_quantity # =&gt; 23 ```.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  componentId  Required parameter: The Chargify id of the component
     * @param  page  Optional parameter: Result records are organized in pages. By default, the
     *         first page of results is displayed. The page parameter specifies a page number of
     *         results to fetch. You can start navigating through the pages to consume the results.
     *         You do this by passing in a page parameter. Retrieve the next page by adding ?page=2
     *         to the query string. If there are no results to return, then an empty result set will
     *         be returned. Use in query `page=1`.
     * @return    Returns the List of AllocationResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<AllocationResponse> listAllocations(
            final String subscriptionId,
            final int componentId,
            final Integer page) throws ApiException, IOException {
        return prepareListAllocationsRequest(subscriptionId, componentId, page).execute();
    }

    /**
     * Builds the ApiCall object for listAllocations.
     */
    private ApiCall<List<AllocationResponse>, ApiException> prepareListAllocationsRequest(
            final String subscriptionId,
            final int componentId,
            final Integer page) throws IOException {
        return new ApiCall.Builder<List<AllocationResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/components/{component_id}/allocations.json")
                        .queryParam(param -> param.key("page")
                                .value((page != null) ? page : 1).isRequired(false))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        AllocationResponse[].class))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Creates multiple allocations, setting the current allocated quantity for each of the
     * components and recording a memo. The charges and/or credits that are created will be rolled
     * up into a single total which is used to determine whether this is an upgrade or a downgrade.
     * Be aware of the Order of Resolutions explained below in determining the proration scheme. A
     * `component_id` is required for each allocation. This endpoint only responds to JSON. It is
     * not available for XML.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  body  Optional parameter: Example:
     * @return    Returns the List of AllocationResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<AllocationResponse> allocateComponents(
            final String subscriptionId,
            final AllocateComponents body) throws ApiException, IOException {
        return prepareAllocateComponentsRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for allocateComponents.
     */
    private ApiCall<List<AllocationResponse>, ApiException> prepareAllocateComponentsRequest(
            final String subscriptionId,
            final AllocateComponents body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<List<AllocationResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/allocations.json")
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
                                response -> ApiHelper.deserializeArray(response,
                                        AllocationResponse[].class))
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

    /**
     * Chargify offers the ability to preview a potential subscription's **quantity-based** or
     * **on/off** component allocation in the middle of the current billing period. This is useful
     * if you want users to be able to see the effect of a component operation before actually doing
     * it. ## Fine-grained Component Control: Use with multiple `upgrade_charge`s or
     * `downgrade_credits` When the allocation uses multiple different types of `upgrade_charge`s or
     * `downgrade_credit`s, the Allocation is viewed as an Allocation which uses "Fine-Grained
     * Component Control". As a result, the response will not include `direction` and `proration`
     * within the `allocation_preview` at the `line_items` and `allocations` level respectfully. See
     * example below for Fine-Grained Component Control response.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  body  Optional parameter: Example:
     * @return    Returns the AllocationPreviewResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public AllocationPreviewResponse previewAllocations(
            final String subscriptionId,
            final PreviewAllocationsRequest body) throws ApiException, IOException {
        return preparePreviewAllocationsRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for previewAllocations.
     */
    private ApiCall<AllocationPreviewResponse, ApiException> preparePreviewAllocationsRequest(
            final String subscriptionId,
            final PreviewAllocationsRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<AllocationPreviewResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/allocations/preview.json")
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
                                response -> ApiHelper.deserialize(response, AllocationPreviewResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ComponentAllocationErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * When the expiration interval options are selected on a prepaid usage component price point,
     * all allocations will be created with an expiration date. This expiration date can be changed
     * after the fact to allow for extending or shortening the allocation's active window. In order
     * to change a prepaid usage allocation's expiration date, a PUT call must be made to the
     * allocation's endpoint with a new expiration date. ## Limitations A few limitations exist when
     * changing an allocation's expiration date: - An expiration date can only be changed for an
     * allocation that belongs to a price point with expiration interval options explicitly set. -
     * An expiration date can be changed towards the future with no limitations. - An expiration
     * date can be changed towards the past (essentially expiring it) up to the subscription's
     * current period beginning date.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  componentId  Required parameter: The Chargify id of the component
     * @param  allocationId  Required parameter: The Chargify id of the allocation
     * @param  body  Optional parameter: Example:
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void updatePrepaidUsageAllocation(
            final String subscriptionId,
            final int componentId,
            final int allocationId,
            final UpdateAllocationExpirationDate body) throws ApiException, IOException {
        prepareUpdatePrepaidUsageAllocationRequest(subscriptionId, componentId, allocationId,
                body).execute();
    }

    /**
     * Builds the ApiCall object for updatePrepaidUsageAllocation.
     */
    private ApiCall<Void, ApiException> prepareUpdatePrepaidUsageAllocationRequest(
            final String subscriptionId,
            final int componentId,
            final int allocationId,
            final UpdateAllocationExpirationDate body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/components/{component_id}/allocations/{allocation_id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("allocation_id").value(allocationId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new SubscriptionComponentAllocationErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Prepaid Usage components are unique in that their allocations are always additive. In order
     * to reduce a subscription's allocated quantity for a prepaid usage component each allocation
     * must be destroyed individually via this endpoint. ## Credit Scheme By default, destroying an
     * allocation will generate a service credit on the subscription. This behavior can be modified
     * with the optional `credit_scheme` parameter on this endpoint. The accepted values are: 1.
     * `none`: The allocation will be destroyed and the balances will be updated but no service
     * credit or refund will be created. 2. `credit`: The allocation will be destroyed and the
     * balances will be updated and a service credit will be generated. This is also the default
     * behavior if the `credit_scheme` param is not passed. 3. `refund`: The allocation will be
     * destroyed and the balances will be updated and a refund will be issued along with a Credit
     * Note.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  componentId  Required parameter: The Chargify id of the component
     * @param  allocationId  Required parameter: The Chargify id of the allocation
     * @param  body  Optional parameter: Example:
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void deletePrepaidUsageAllocation(
            final String subscriptionId,
            final int componentId,
            final int allocationId,
            final CreditSchemeRequest body) throws ApiException, IOException {
        prepareDeletePrepaidUsageAllocationRequest(subscriptionId, componentId, allocationId,
                body).execute();
    }

    /**
     * Builds the ApiCall object for deletePrepaidUsageAllocation.
     */
    private ApiCall<Void, ApiException> prepareDeletePrepaidUsageAllocationRequest(
            final String subscriptionId,
            final int componentId,
            final int allocationId,
            final CreditSchemeRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/components/{component_id}/allocations/{allocation_id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("allocation_id").value(allocationId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new SubscriptionComponentAllocationErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * ## Documentation Full documentation on how to create Components in the Chargify UI can be
     * located
     * [here](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405020625677#creating-components).
     * Additionally, for information on how to record component usage against a subscription, please
     * see the following resources: + [Recording Metered Component
     * Usage](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404527849997#reporting-metered-component-usage)
     * + [Reporting Prepaid Component
     * Status](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404527849997#reporting-prepaid-component-status)
     * You may choose to report metered or prepaid usage to Chargify as often as you wish. You may
     * report usage as it happens. You may also report usage periodically, such as each night or
     * once per billing period. If usage events occur in your system very frequently (on the order
     * of thousands of times an hour), it is best to accumulate usage into batches on your side, and
     * then report those batches less frequently, such as daily. This will ensure you remain below
     * any API throttling limits. If your use case requires higher rates of usage reporting, we
     * recommend utilizing Events Based Components. ## Create Usage for Subscription This endpoint
     * allows you to record an instance of metered or prepaid usage for a subscription. The
     * `quantity` from usage for each component is accumulated to the `unit_balance` on the
     * [Component Line Item](./b3A6MTQxMDgzNzQ-read-subscription-component) for the subscription. ##
     * Price Point ID usage If you are using price points, for metered and prepaid usage components,
     * Chargify gives you the option to specify a price point in your request. You do not need to
     * specify a price point ID. If a price point is not included, the default price point for the
     * component will be used when the usage is recorded. If an invalid `price_point_id` is
     * submitted, the endpoint will return an error. ## Deducting Usage In the event that you need
     * to reverse a previous usage report or otherwise deduct from the current usage balance, you
     * may provide a negative quantity. Example: Previously recorded: ```json { "usage": {
     * "quantity": 5000, "memo": "Recording 5000 units" } } ``` At this point, `unit_balance` would
     * be `5000`. To reduce the balance to `0`, POST the following payload: ```json { "usage": {
     * "quantity": -5000, "memo": "Deducting 5000 units" } } ``` The `unit_balance` has a floor of
     * `0`; negative unit balances are never allowed. For example, if the usage balance is 100 and
     * you deduct 200 units, the unit balance would then be `0`, not `-100`. ## FAQ Q. Is it
     * possible to record metered usage for more than one component at a time? A. No. Usage should
     * be reported as one API call per component on a single subscription. For example, to record
     * that a subscriber has sent both an SMS Message and an Email, send an API call for each.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  componentId  Required parameter: Either the Chargify id for the component or the
     *         component's handle prefixed by `handle:`
     * @param  body  Optional parameter: Example:
     * @return    Returns the UsageResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public UsageResponse createUsage(
            final String subscriptionId,
            final int componentId,
            final CreateUsageRequest body) throws ApiException, IOException {
        return prepareCreateUsageRequest(subscriptionId, componentId, body).execute();
    }

    /**
     * Builds the ApiCall object for createUsage.
     */
    private ApiCall<UsageResponse, ApiException> prepareCreateUsageRequest(
            final String subscriptionId,
            final int componentId,
            final CreateUsageRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<UsageResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/components/{component_id}/usages.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, UsageResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This request will return a list of the usages associated with a subscription for a particular
     * metered component. This will display the previously recorded components for a subscription.
     * This endpoint is not compatible with quantity-based components. ## Since Date and Until Date
     * Usage Note: The `since_date` and `until_date` attributes each default to midnight on the date
     * specified. For example, in order to list usages for January 20th, you would need to append
     * the following to the URL. ``` ?since_date=2016-01-20&amp;until_date=2016-01-21 ``` ## Read Usage
     * by Handle Use this endpoint to read the previously recorded components for a subscription.
     * You can now specify either the component id (integer) or the component handle prefixed by
     * "handle:" to specify the unique identifier for the component you are working with.
     * @param  input  ListUsagesInput object containing request parameters
     * @return    Returns the List of UsageResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<UsageResponse> listUsages(
            final ListUsagesInput input) throws ApiException, IOException {
        return prepareListUsagesRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listUsages.
     */
    private ApiCall<List<UsageResponse>, ApiException> prepareListUsagesRequest(
            final ListUsagesInput input) throws IOException {
        return new ApiCall.Builder<List<UsageResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/components/{component_id}/usages.json")
                        .queryParam(param -> param.key("since_id")
                                .value(input.getSinceId()).isRequired(false))
                        .queryParam(param -> param.key("max_id")
                                .value(input.getMaxId()).isRequired(false))
                        .queryParam(param -> param.key("since_date")
                                .value(input.getSinceDate()).isRequired(false))
                        .queryParam(param -> param.key("until_date")
                                .value(input.getUntilDate()).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .templateParam(param -> param.key("subscription_id").value(input.getSubscriptionId())
                                .shouldEncode(true))
                        .templateParam(param -> param.key("component_id").value(input.getComponentId()).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        UsageResponse[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * In order to bill your subscribers on your Events data under the Events-Based Billing feature,
     * the components must be activated for the subscriber. Learn more about the role of activation
     * in the [Events-Based Billing
     * docs](https://chargify.zendesk.com/hc/en-us/articles/4407720810907#activating-components-for-subscribers).
     * Use this endpoint to activate an event-based component for a single subscription. Activating
     * an event-based component causes Chargify to bill for events when the subscription is renewed.
     * *Note: it is possible to stream events for a subscription at any time, regardless of
     * component activation status. The activation status only determines if the subscription should
     * be billed for event-based component usage at renewal.*.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  componentId  Required parameter: The Chargify id of the component
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void activateEventBasedComponent(
            final int subscriptionId,
            final int componentId) throws ApiException, IOException {
        prepareActivateEventBasedComponentRequest(subscriptionId, componentId).execute();
    }

    /**
     * Builds the ApiCall object for activateEventBasedComponent.
     */
    private ApiCall<Void, ApiException> prepareActivateEventBasedComponentRequest(
            final int subscriptionId,
            final int componentId) throws IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/event_based_billing/subscriptions/{subscription_id}/components/{component_id}/activate.json")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Use this endpoint to deactivate an event-based component for a single subscription.
     * Deactivating the event-based component causes Chargify to ignore related events at
     * subscription renewal.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  componentId  Required parameter: The Chargify id of the component
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void deactivateEventBasedComponent(
            final int subscriptionId,
            final int componentId) throws ApiException, IOException {
        prepareDeactivateEventBasedComponentRequest(subscriptionId, componentId).execute();
    }

    /**
     * Builds the ApiCall object for deactivateEventBasedComponent.
     */
    private ApiCall<Void, ApiException> prepareDeactivateEventBasedComponentRequest(
            final int subscriptionId,
            final int componentId) throws IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/event_based_billing/subscriptions/{subscription_id}/components/{component_id}/deactivate.json")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * ## Documentation Events-Based Billing is an evolved form of metered billing that is based on
     * data-rich events streamed in real-time from your system to Chargify. These events can then be
     * transformed, enriched, or analyzed to form the computed totals of usage charges billed to
     * your customers. This API allows you to stream events into the Chargify data ingestion engine.
     * Learn more about the feature in general in the [Events-Based Billing help
     * docs](https://chargify.zendesk.com/hc/en-us/articles/4407720613403). ## Record Event Use this
     * endpoint to record a single event. *Note: this endpoint differs from the standard Chargify
     * endpoints in that the URL subdomain will be `events` and your site subdomain will be included
     * in the URL path. For example:* ```
     * https://events.chargify.com/my-site-subdomain/events/my-stream-api-handle ```.
     * @param  subdomain  Required parameter: Your site's subdomain
     * @param  apiHandle  Required parameter: Identifies the Stream for which the event should be
     *         published.
     * @param  storeUid  Optional parameter: If you've attached your own Keen project as a Chargify
     *         event data-store, use this parameter to indicate the data-store.
     * @param  body  Optional parameter: Example:
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void recordEvent(
            final String subdomain,
            final String apiHandle,
            final String storeUid,
            final EBBEvent body) throws ApiException, IOException {
        prepareRecordEventRequest(subdomain, apiHandle, storeUid, body).execute();
    }

    /**
     * Builds the ApiCall object for recordEvent.
     */
    private ApiCall<Void, ApiException> prepareRecordEventRequest(
            final String subdomain,
            final String apiHandle,
            final String storeUid,
            final EBBEvent body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/{subdomain}/events/{api_handle}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .queryParam(param -> param.key("store_uid")
                                .value(storeUid).isRequired(false))
                        .templateParam(param -> param.key("subdomain").value(subdomain)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("api_handle").value(apiHandle)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Use this endpoint to record a collection of events. *Note: this endpoint differs from the
     * standard Chargify endpoints in that the subdomain will be `events` and your site subdomain
     * will be included in the URL path.* A maximum of 1000 events can be published in a single
     * request. A 422 will be returned if this limit is exceeded.
     * @param  subdomain  Required parameter: Your site's subdomain
     * @param  apiHandle  Required parameter: Identifies the Stream for which the events should be
     *         published.
     * @param  storeUid  Optional parameter: If you've attached your own Keen project as a Chargify
     *         event data-store, use this parameter to indicate the data-store.
     * @param  body  Optional parameter: Example:
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void recordEvents(
            final String subdomain,
            final String apiHandle,
            final String storeUid,
            final List<EBBEvent> body) throws ApiException, IOException {
        prepareRecordEventsRequest(subdomain, apiHandle, storeUid, body).execute();
    }

    /**
     * Builds the ApiCall object for recordEvents.
     */
    private ApiCall<Void, ApiException> prepareRecordEventsRequest(
            final String subdomain,
            final String apiHandle,
            final String storeUid,
            final List<EBBEvent> body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/{subdomain}/events/{api_handle}/bulk.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .queryParam(param -> param.key("store_uid")
                                .value(storeUid).isRequired(false))
                        .templateParam(param -> param.key("subdomain").value(subdomain)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("api_handle").value(apiHandle)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This request will list components applied to each subscription.
     * @param  input  ListSubscriptionComponentsForSiteInput object containing request parameters
     * @return    Returns the ListSubscriptionComponentsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListSubscriptionComponentsResponse listSubscriptionComponentsForSite(
            final ListSubscriptionComponentsForSiteInput input) throws ApiException, IOException {
        return prepareListSubscriptionComponentsForSiteRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listSubscriptionComponentsForSite.
     */
    private ApiCall<ListSubscriptionComponentsResponse, ApiException> prepareListSubscriptionComponentsForSiteRequest(
            final ListSubscriptionComponentsForSiteInput input) throws IOException {
        return new ApiCall.Builder<ListSubscriptionComponentsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions_components.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("sort")
                                .value((input.getSort() != null) ? input.getSort().value() : null).isRequired(false))
                        .queryParam(param -> param.key("direction")
                                .value((input.getDirection() != null) ? input.getDirection().value() : null).isRequired(false))
                        .queryParam(param -> param.key("date_field")
                                .value((input.getDateField() != null) ? input.getDateField().value() : null).isRequired(false))
                        .queryParam(param -> param.key("start_date")
                                .value(input.getStartDate()).isRequired(false))
                        .queryParam(param -> param.key("start_datetime")
                                .value(input.getStartDatetime()).isRequired(false))
                        .queryParam(param -> param.key("end_date")
                                .value(input.getEndDate()).isRequired(false))
                        .queryParam(param -> param.key("end_datetime")
                                .value(input.getEndDatetime()).isRequired(false))
                        .queryParam(param -> param.key("subscription_ids")
                                .value(input.getSubscriptionIds()).isRequired(false))
                        .queryParam(param -> param.key("price_point_ids")
                                .value((input.getPricePointIds() != null) ? input.getPricePointIds().value() : null).isRequired(false))
                        .queryParam(param -> param.key("product_family_ids")
                                .value(input.getProductFamilyIds()).isRequired(false))
                        .queryParam(param -> param.key("include")
                                .value((input.getInclude() != null) ? input.getInclude().value() : null).isRequired(false))
                        .queryParam(param -> param.key("filter[use_site_exchange_rate]")
                                .value(input.getFilterUseSiteExchangeRate()).isRequired(false))
                        .queryParam(param -> param.key("filter[currencies]")
                                .value(input.getFilterCurrencies()).isRequired(false))
                        .queryParam(param -> param.key("filter[subscription][states]")
                                .value(SubscriptionState.toValue(input.getFilterSubscriptionStates())).isRequired(false))
                        .queryParam(param -> param.key("filter[subscription][date_field]")
                                .value((input.getFilterSubscriptionDateField() != null) ? input.getFilterSubscriptionDateField().value() : null).isRequired(false))
                        .queryParam(param -> param.key("filter[subscription][start_date]")
                                .value(input.getFilterSubscriptionStartDate()).isRequired(false))
                        .queryParam(param -> param.key("filter[subscription][start_datetime]")
                                .value(input.getFilterSubscriptionStartDatetime()).isRequired(false))
                        .queryParam(param -> param.key("filter[subscription][end_date]")
                                .value(input.getFilterSubscriptionEndDate()).isRequired(false))
                        .queryParam(param -> param.key("filter[subscription][end_datetime]")
                                .value(input.getFilterSubscriptionEndDatetime()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListSubscriptionComponentsResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }
}