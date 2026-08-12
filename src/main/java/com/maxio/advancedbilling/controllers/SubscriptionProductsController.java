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
import com.maxio.advancedbilling.models.SubscriptionMigrationPreviewRequest;
import com.maxio.advancedbilling.models.SubscriptionMigrationPreviewResponse;
import com.maxio.advancedbilling.models.SubscriptionProductMigrationRequest;
import com.maxio.advancedbilling.models.SubscriptionResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class SubscriptionProductsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public SubscriptionProductsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Migrates a subscription to a different product. To create a migration, you must pass the
     * `product_id` or `product_handle` in the object when you send a POST request. You can also
     * pass either a `product_price_point_id` or `product_price_point_handle` to choose which price
     * point the subscription is moved to. If no price point identifier is passed, the subscription
     * is moved to the product's default price point. The response is the updated subscription. ##
     * Valid Subscriptions Subscriptions should be in the `active` or `trialing` state to be
     * migrated. (For backwards compatibility reasons, it is possible to migrate a subscription that
     * is in the `trial_ended` state via the API, however this is not recommended. Since
     * `trial_ended` is an end-of-life state, the subscription should be canceled, the product
     * changed, and then the subscription can be reactivated.) For more information, see [Product
     * Changes and
     * Migrations](https://docs.maxio.com/hc/en-us/articles/24252069837581-Product-Changes-and-Migrations).
     * ## Failed Migrations Important note: One of the most common ways that a migration can fail is
     * when the attempt is made to migrate a subscription to its current product. ## 3D Secure (3DS)
     * Authentication post-authentication flow When a payment requires 3DS Authentication to adhere
     * to Strong Customer Authentication (SCA), the request enters a post-authentication flow where
     * a 422 Unprocessable Entity status is returned with an action_link that will direct the
     * customer through 3DS Authentication. See the [3D Secure Post-Authentication
     * Flow](https://docs.maxio.com/hc/en-us/articles/44277749524365-3D-Secure-Post-Authentication-Flow)
     * article in the product documentation to learn how to manage the redirect flow.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  body  Optional parameter:
     * @return    Returns the SubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionResponse migrateSubscriptionProduct(
            final int subscriptionId,
            final SubscriptionProductMigrationRequest body) throws ApiException, IOException {
        return prepareMigrateSubscriptionProductRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for migrateSubscriptionProduct.
     */
    private ApiCall<SubscriptionResponse, ApiException> prepareMigrateSubscriptionProductRequest(
            final int subscriptionId,
            final SubscriptionProductMigrationRequest body) {
        return new ApiCall.Builder<SubscriptionResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/migrations.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
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
                                response -> ApiHelper.deserialize(response, SubscriptionResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Previews the charges resulting from migrating a subscription to a different product. ##
     * Previewing a future date It is also possible to preview the migration for a date in the
     * future, as long as it's still within the subscription's current billing period, by passing a
     * `proration_date` along with the request (e.g., `"proration_date":
     * "2020-12-18T18:25:43.511Z"`). This will calculate the prorated adjustment, charge, payment
     * and credit applied values assuming the migration is done at that date in the future as
     * opposed to right now.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription.
     * @param  body  Optional parameter:
     * @return    Returns the SubscriptionMigrationPreviewResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionMigrationPreviewResponse previewSubscriptionProductMigration(
            final int subscriptionId,
            final SubscriptionMigrationPreviewRequest body) throws ApiException, IOException {
        return preparePreviewSubscriptionProductMigrationRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for previewSubscriptionProductMigration.
     */
    private ApiCall<SubscriptionMigrationPreviewResponse, ApiException> preparePreviewSubscriptionProductMigrationRequest(
            final int subscriptionId,
            final SubscriptionMigrationPreviewRequest body) {
        return new ApiCall.Builder<SubscriptionMigrationPreviewResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/subscriptions/{subscription_id}/migrations/preview.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
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
                                response -> ApiHelper.deserialize(response, SubscriptionMigrationPreviewResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}