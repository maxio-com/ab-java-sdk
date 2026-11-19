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
import com.maxio.advancedbilling.models.AggregatedEntitlementsResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class EntitlementsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public EntitlementsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Returns every feature a subscription is entitled to, collapsed into one entry per feature key
     * and periodicity window across all products and components on the subscription. A
     * `usage_limit` feature granted with two different periodicities comes back as two entries
     * sharing one `feature_key`, each identified by its own `periodicity_key`. When more than one
     * product or component grants the same feature key and periodicity, the values are combined: -
     * **`access_right`** features are combined with a boolean OR. If any contributor grants access,
     * the aggregate is `true`. `source_products` only lists the contributors that granted `true`. -
     * **`usage_limit`** features are summed across every contributor sharing the same periodicity
     * window. `source_products` lists every contributor. Grants with different periodicities are
     * not summed together. Each periodicity is returned as a separate entry. - **`service_right`**
     * features are not combined: one contributor's value wins. Do not rely on which one when
     * several grant the same feature key. `enabled` reflects both the aggregated value and the
     * subscription's state. The field is `false` whenever the subscription is not in a live state
     * (`active`, `trialing`, `assessing`, `past_due`, `soft_failure`), regardless of the aggregated
     * value. Entitlements deliberately stay enabled through dunning.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @return    Returns the AggregatedEntitlementsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public AggregatedEntitlementsResponse readSubscriptionEntitlements(
            final int subscriptionId) throws ApiException, IOException {
        return prepareReadSubscriptionEntitlementsRequest(subscriptionId).execute();
    }

    /**
     * Builds the ApiCall object for readSubscriptionEntitlements.
     */
    private ApiCall<AggregatedEntitlementsResponse, ApiException> prepareReadSubscriptionEntitlementsRequest(
            final int subscriptionId) {
        return new ApiCall.Builder<AggregatedEntitlementsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/entitlements.json")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, AggregatedEntitlementsResponse.class))
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
}