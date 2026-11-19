/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.controllers;

import com.maxio.advancedbilling.ApiHelper;
import com.maxio.advancedbilling.Server;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.CreateFeatureCatalogItemRequest;
import com.maxio.advancedbilling.models.FeatureCatalogItemResponse;
import com.maxio.advancedbilling.models.FeatureCatalogItemsListResponse;
import com.maxio.advancedbilling.models.UpdateFeatureCatalogItemRequest;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class ComponentFeaturesController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public ComponentFeaturesController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Lists the feature catalog items attached to this component, including price-point-specific
     * overrides.
     * @param  componentId  Required parameter: The Advanced Billing id of the component.
     * @return    Returns the FeatureCatalogItemsListResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public FeatureCatalogItemsListResponse listComponentFeatures(
            final int componentId) throws ApiException, IOException {
        return prepareListComponentFeaturesRequest(componentId).execute();
    }

    /**
     * Builds the ApiCall object for listComponentFeatures.
     */
    private ApiCall<FeatureCatalogItemsListResponse, ApiException> prepareListComponentFeaturesRequest(
            final int componentId) {
        return new ApiCall.Builder<FeatureCatalogItemsListResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/components/{component_id}/features.json")
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, FeatureCatalogItemsListResponse.class))
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
     * Attaches a feature template to this component. Pass `price_point_type: "PricePoint"` and
     * `price_point_id` to scope the feature catalog item to a single component price point instead
     * of the whole component. `value`, the periodicity and the grant expiration fall back to the
     * feature template's defaults when omitted. **Product- or component-level items are a
     * template.** A feature catalog item without `price_point_id` is copied onto price points
     * created after it (except bulk-created price points; [Clone Component Price
     * Point]($e/Component%3A%20Price%20Points/cloneComponentPricePoint) applies only the
     * `feature_catalog_items` you send with it, and the automatic clone described below copies the
     * source's features), but it is not added to price points that already exist, so their
     * subscribers get nothing from it, even with `propagate_to_subscriptions: true`. To grant a
     * feature to existing subscribers, create the item on each existing price point. **Restoring a
     * template item.** Restoring an archived product- or component-level item, or creating one
     * again for the same feature template, also restores the price-point copies that were archived
     * together with it (for example, when the feature template was archived). If one of those price
     * points has subscribers without the feature, the call returns `422` naming that price point,
     * unless you send `propagate_to_subscriptions: true`, which restores the copies and grants the
     * feature to those subscribers. **Price points with subscribers.** When the feature catalog
     * item is scoped to a price point that already has subscribers and you don't send
     * `propagate_to_subscriptions: true`, the new feature applies to new subscriptions only. The
     * price point is cloned with its current features, the new feature is applied to the clone, and
     * the response carries the clone's `price_point_id`. The feature catalog item in the response
     * is also a different record, with a new `id`: later calls for the clone must use that `id`,
     * not the original one. Existing subscribers stay on the original price point, unchanged; sign
     * new subscriptions up on the clone to give them the change. A component price point has
     * subscribers when any subscription, including a canceled one or one allocated a quantity of
     * zero, has the component at that price point. Price points that can't be cloned (archived or
     * custom ones, or a component price point with an interval on a site without multi-frequency)
     * make the request return `422`, with a message naming `propagate_to_subscriptions: true` as
     * the way to apply the change to existing subscribers instead.
     * @param  componentId  Required parameter: The Advanced Billing id of the component.
     * @param  body  Optional parameter:
     * @return    Returns the FeatureCatalogItemResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public FeatureCatalogItemResponse createComponentFeature(
            final int componentId,
            final CreateFeatureCatalogItemRequest body) throws ApiException, IOException {
        return prepareCreateComponentFeatureRequest(componentId, body).execute();
    }

    /**
     * Builds the ApiCall object for createComponentFeature.
     */
    private ApiCall<FeatureCatalogItemResponse, ApiException> prepareCreateComponentFeatureRequest(
            final int componentId,
            final CreateFeatureCatalogItemRequest body) {
        return new ApiCall.Builder<FeatureCatalogItemResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/components/{component_id}/features.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
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
                                response -> ApiHelper.deserialize(response, FeatureCatalogItemResponse.class))
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
     * Returns a single feature catalog item attached to this component.
     * @param  componentId  Required parameter: The Advanced Billing id of the component.
     * @param  id  Required parameter: The Advanced Billing id of the feature catalog item.
     * @return    Returns the FeatureCatalogItemResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public FeatureCatalogItemResponse readComponentFeature(
            final int componentId,
            final int id) throws ApiException, IOException {
        return prepareReadComponentFeatureRequest(componentId, id).execute();
    }

    /**
     * Builds the ApiCall object for readComponentFeature.
     */
    private ApiCall<FeatureCatalogItemResponse, ApiException> prepareReadComponentFeatureRequest(
            final int componentId,
            final int id) {
        return new ApiCall.Builder<FeatureCatalogItemResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/components/{component_id}/features/{id}.json")
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("id").value(id).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, FeatureCatalogItemResponse.class))
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
     * Updates the value or periodicity of a feature catalog item attached to this component. A
     * request that changes nothing returns the item as it is. **Price points with subscribers.**
     * When the feature catalog item is scoped to a price point that already has subscribers and you
     * don't send `propagate_to_subscriptions: true`, the update applies to new subscriptions only.
     * The price point is cloned with its current features, the update is applied to the clone, and
     * the response carries the clone's `price_point_id`. The feature catalog item in the response
     * is also a different record, with a new `id`: later calls for the clone must use that `id`,
     * not the original one. Existing subscribers stay on the original price point, unchanged; sign
     * new subscriptions up on the clone to give them the change. A component price point has
     * subscribers when any subscription, including a canceled one or one allocated a quantity of
     * zero, has the component at that price point. Price points that can't be cloned (archived or
     * custom ones, or a component price point with an interval on a site without multi-frequency)
     * make the request return `422`, with a message naming `propagate_to_subscriptions: true` as
     * the way to apply the change to existing subscribers instead.
     * @param  componentId  Required parameter: The Advanced Billing id of the component.
     * @param  id  Required parameter: The Advanced Billing id of the feature catalog item.
     * @param  body  Optional parameter:
     * @return    Returns the FeatureCatalogItemResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public FeatureCatalogItemResponse updateComponentFeature(
            final int componentId,
            final int id,
            final UpdateFeatureCatalogItemRequest body) throws ApiException, IOException {
        return prepareUpdateComponentFeatureRequest(componentId, id, body).execute();
    }

    /**
     * Builds the ApiCall object for updateComponentFeature.
     */
    private ApiCall<FeatureCatalogItemResponse, ApiException> prepareUpdateComponentFeatureRequest(
            final int componentId,
            final int id,
            final UpdateFeatureCatalogItemRequest body) {
        return new ApiCall.Builder<FeatureCatalogItemResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/components/{component_id}/features/{id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
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
                                response -> ApiHelper.deserialize(response, FeatureCatalogItemResponse.class))
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
     * Removes a feature catalog item from this component. Returns `204` when the item is removed in
     * place. **Price points with subscribers.** When the feature catalog item is scoped to a price
     * point that already has subscribers and you don't send `destroy_entitlements=true`, the
     * removal applies to new subscriptions only. The price point is cloned with its current
     * features, the removal is applied to the clone, and the call returns `200` with the archived
     * feature catalog item on the clone (carrying the clone's `price_point_id` and a new `id`)
     * instead of `204`. Existing subscribers stay on the original price point, unchanged; sign new
     * subscriptions up on the clone to give them the change. A component price point has
     * subscribers when any subscription, including a canceled one or one allocated a quantity of
     * zero, has the component at that price point. Price points that can't be cloned (archived or
     * custom ones, or a component price point with an interval on a site without multi-frequency)
     * make the request return `422`, with a message naming `destroy_entitlements=true` as the way
     * to apply the change to existing subscribers instead.
     * @param  componentId  Required parameter: The Advanced Billing id of the component.
     * @param  id  Required parameter: The Advanced Billing id of the feature catalog item.
     * @param  destroyEntitlements  Optional parameter: When `true`, permanently deletes this
     *         feature catalog item and every entitlement it created, revoking subscriber access
     *         immediately. When `false` (default), the feature catalog item is archived and
     *         existing entitlements are preserved.
     * @return    Returns the FeatureCatalogItemResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public FeatureCatalogItemResponse removeComponentFeature(
            final int componentId,
            final int id,
            final Boolean destroyEntitlements) throws ApiException, IOException {
        return prepareRemoveComponentFeatureRequest(componentId, id, destroyEntitlements).execute();
    }

    /**
     * Builds the ApiCall object for removeComponentFeature.
     */
    private ApiCall<FeatureCatalogItemResponse, ApiException> prepareRemoveComponentFeatureRequest(
            final int componentId,
            final int id,
            final Boolean destroyEntitlements) {
        return new ApiCall.Builder<FeatureCatalogItemResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/components/{component_id}/features/{id}.json")
                        .queryParam(param -> param.key("destroy_entitlements")
                                .value((destroyEntitlements != null) ? destroyEntitlements : false).isRequired(false))
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("id").value(id).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, FeatureCatalogItemResponse.class))
                        .nullify404(false)
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("The price point has subscribers but can't be cloned (it is archived or custom, or it is a component price point with an interval on a site without multi-frequency). Send `destroy_entitlements=true` to remove the feature from its existing subscribers instead.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Clears the archived state of a feature catalog item attached to this component. Returns `422`
     * if the parent feature template is still archived. Restore the feature template first.
     * Otherwise, restoring an item that isn't archived returns it unchanged. **Price points with
     * subscribers.** When the feature catalog item is scoped to a price point that already has
     * subscribers and you don't send `propagate_to_subscriptions=true`, the restore applies to new
     * subscriptions only. The price point is cloned with its current features, the restore is
     * applied to the clone, and the response carries the clone's `price_point_id`. The feature
     * catalog item in the response is also a different record, with a new `id`: later calls for the
     * clone must use that `id`, not the original one. Existing subscribers stay on the original
     * price point, unchanged; sign new subscriptions up on the clone to give them the change. A
     * component price point has subscribers when any subscription, including a canceled one or one
     * allocated a quantity of zero, has the component at that price point. Price points that can't
     * be cloned (archived or custom ones, or a component price point with an interval on a site
     * without multi-frequency) make the request return `422`, with a message naming
     * `propagate_to_subscriptions: true` as the way to apply the change to existing subscribers
     * instead.
     * @param  componentId  Required parameter: The Advanced Billing id of the component.
     * @param  id  Required parameter: The Advanced Billing id of the feature catalog item.
     * @param  propagateToSubscriptions  Optional parameter: When `true`, the restored feature is
     *         applied to the existing subscriptions on its price point. When `false` (default), an
     *         item scoped to a price point with subscribers is restored on a clone of that price
     *         point instead; a product- or component-level item is never cloned, and returns `422`
     *         if a price-point copy it restores has subscribers without the feature. See the
     *         description.
     * @return    Returns the FeatureCatalogItemResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public FeatureCatalogItemResponse restoreComponentFeature(
            final int componentId,
            final int id,
            final Boolean propagateToSubscriptions) throws ApiException, IOException {
        return prepareRestoreComponentFeatureRequest(componentId, id,
                propagateToSubscriptions).execute();
    }

    /**
     * Builds the ApiCall object for restoreComponentFeature.
     */
    private ApiCall<FeatureCatalogItemResponse, ApiException> prepareRestoreComponentFeatureRequest(
            final int componentId,
            final int id,
            final Boolean propagateToSubscriptions) {
        return new ApiCall.Builder<FeatureCatalogItemResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/components/{component_id}/features/{id}/restore.json")
                        .queryParam(param -> param.key("propagate_to_subscriptions")
                                .value((propagateToSubscriptions != null) ? propagateToSubscriptions : false).isRequired(false))
                        .templateParam(param -> param.key("component_id").value(componentId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("id").value(id).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, FeatureCatalogItemResponse.class))
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