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
     * In order to create a migration, you must pass the `product_id` or `product_handle` in the
     * object when you send a POST request. You may also pass either a `product_price_point_id` or
     * `product_price_point_handle` to choose which price point the subscription is moved to. If no
     * price point identifier is passed the subscription will be moved to the products default price
     * point. The response will be the updated subscription. ## Valid Subscriptions Subscriptions
     * should be in the `active` or `trialing` state in order to be migrated. (For backwards
     * compatibility reasons, it is possible to migrate a subscription that is in the `trial_ended`
     * state via the API, however this is not recommended. Since `trial_ended` is an end-of-life
     * state, the subscription should be canceled, the product changed, and then the subscription
     * can be reactivated.) ## Migrations Documentation Full documentation on how to record
     * Migrations in the Chargify UI can be located
     * [here](https://chargify.zendesk.com/hc/en-us/articles/4407898373531). ## Failed Migrations
     * One of the most common ways that a migration can fail is when the attempt is made to migrate
     * a subscription to it's current product. Please be aware of this issue! ## Migration 3D Secure
     * - Stripe It may happen that a payment needs 3D Secure Authentication when the subscription is
     * migrated to a new product; this is referred to in our help docs as a [post-authentication
     * flow](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405177432077#psd2-flows-pre-authentication-and-post-authentication).
     * The server returns `422 Unprocessable Entity` in this case with the following response:
     * ```json { "errors": [ "Your card was declined. This transaction requires 3D secure
     * authentication." ], "gateway_payment_id": "pi_1F0aGoJ2UDb3Q4av7zU3sHPh", "description": "This
     * card requires 3D secure authentication. Redirect the customer to the URL from the action_link
     * attribute to authenticate. Attach callback_url param to this URL if you want to be notified
     * about the result of 3D Secure authentication. Attach redirect_url param to this URL if you
     * want to redirect a customer back to your page after 3D Secure authentication. Example:
     * https://mysite.chargify.com/3d-secure/pi_1FCm4RKDeye4C0XfbqquXRYm?one_time_token_id=128&amp;callback_url=https://localhost:4000&amp;redirect_url=https://yourpage.com
     * will do a POST request to https://localhost:4000 after payment is authenticated and will
     * redirect a customer to https://yourpage.com after 3DS authentication.", "action_link":
     * "http://acme.chargify.com/3d-secure/pi_1F0aGoJ2UDb3Q4av7zU3sHPh?one_time_token_id=242" } ```
     * To let the customer go through 3D Secure Authentication, they need to be redirected to the
     * URL specified in `action_link`. Optionally, you can specify `callback_url` parameter in the
     * `action_link` URL if you’d like to be notified about the result of 3D Secure Authentication.
     * The `callback_url` will return the following information: - whether the authentication was
     * successful (`success`) - the gateway ID for the payment (`gateway_payment_id`) - the
     * subscription ID (`subscription_id`) Lastly, you can also specify a `redirect_url` within the
     * `action_link` URL if you’d like to redirect a customer back to your site. It is not possible
     * to use `action_link` in an iframe inside a custom application. You have to redirect the
     * customer directly to the `action_link`, then, to be notified about the result, use
     * `redirect_url` or `callback_url`. The final URL that you send a customer to to complete 3D
     * Secure may resemble the following, where the first half is the `action_link` and the second
     * half contains a `redirect_url` and `callback_url`:
     * `https://mysite.chargify.com/3d-secure/pi_1FCm4RKDeye4C0XfbqquXRYm?one_time_token_id=128&amp;callback_url=https://localhost:4000&amp;redirect_url=https://yourpage.com`
     * ### Example Redirect Flow You may wish to redirect customers to different pages depending on
     * whether their SCA was performed successfully. Here's an example flow to use as a reference:
     * 1. Create a migration via API; it requires 3DS 2. You receive a `gateway_payment_id` in the
     * `action_link` along other params in the response. 3. Use this `gateway_payment_id` to, for
     * example, connect with your internal resources or generate a session_id 4. Include 1 of those
     * attributes inside the `callback_url` and `redirect_url` to be aware which “session” this
     * applies to 5. Redirect the customer to the `action_link` with `callback_url` and
     * `redirect_url` applied 6. After the customer finishes 3DS authentication, we let you know the
     * result by making a request to applied `callback_url`. 7. After that, we redirect the customer
     * to the `redirect_url`; at this point the result of authentication is known 8. Optionally, you
     * can use the applied "msg" param in the `redirect_url` to determine whether it was successful
     * or not.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  body  Optional parameter: Example:
     * @return    Returns the SubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionResponse migrateSubscriptionProduct(
            final String subscriptionId,
            final SubscriptionProductMigrationRequest body) throws ApiException, IOException {
        return prepareMigrateSubscriptionProductRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for migrateSubscriptionProduct.
     */
    private ApiCall<SubscriptionResponse, ApiException> prepareMigrateSubscriptionProductRequest(
            final String subscriptionId,
            final SubscriptionProductMigrationRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<SubscriptionResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/migrations.json")
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
                                response -> ApiHelper.deserialize(response, SubscriptionResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * ## Previewing a future date It is also possible to preview the migration for a date in the
     * future, as long as it's still within the subscription's current billing period, by passing a
     * `proration_date` along with the request (eg: `"proration_date": "2020-12-18T18:25:43.511Z"`).
     * This will calculate the prorated adjustment, charge, payment and credit applied values
     * assuming the migration is done at that date in the future as opposed to right now.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  body  Optional parameter: Example:
     * @return    Returns the SubscriptionMigrationPreviewResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionMigrationPreviewResponse previewSubscriptionProductMigration(
            final String subscriptionId,
            final SubscriptionMigrationPreviewRequest body) throws ApiException, IOException {
        return preparePreviewSubscriptionProductMigrationRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for previewSubscriptionProductMigration.
     */
    private ApiCall<SubscriptionMigrationPreviewResponse, ApiException> preparePreviewSubscriptionProductMigrationRequest(
            final String subscriptionId,
            final SubscriptionMigrationPreviewRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<SubscriptionMigrationPreviewResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/migrations/preview.json")
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
                                response -> ApiHelper.deserialize(response, SubscriptionMigrationPreviewResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }
}