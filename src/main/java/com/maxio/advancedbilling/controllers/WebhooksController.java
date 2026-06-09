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
import com.maxio.advancedbilling.models.CreateOrUpdateEndpointRequest;
import com.maxio.advancedbilling.models.EnableWebhooksRequest;
import com.maxio.advancedbilling.models.EnableWebhooksResponse;
import com.maxio.advancedbilling.models.Endpoint;
import com.maxio.advancedbilling.models.EndpointResponse;
import com.maxio.advancedbilling.models.ListWebhooksInput;
import com.maxio.advancedbilling.models.ReplayWebhooksRequest;
import com.maxio.advancedbilling.models.ReplayWebhooksResponse;
import com.maxio.advancedbilling.models.WebhookResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;
import java.util.List;

/**
 * This class lists all the endpoints of the groups.
 */
public final class WebhooksController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public WebhooksController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Retrieves a list of webhooks. You can pass query parameters if you want to filter webhooks.
     * See the [Webhooks](page:introduction/webhooks/webhooks) documentation for more information.
     * @param  input  ListWebhooksInput object containing request parameters
     * @return    Returns the List of WebhookResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<WebhookResponse> listWebhooks(
            final ListWebhooksInput input) throws ApiException, IOException {
        return prepareListWebhooksRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listWebhooks.
     */
    private ApiCall<List<WebhookResponse>, ApiException> prepareListWebhooksRequest(
            final ListWebhooksInput input) {
        return new ApiCall.Builder<List<WebhookResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/webhooks.json")
                        .queryParam(param -> param.key("status")
                                .value((input.getStatus() != null) ? input.getStatus().value() : null).isRequired(false))
                        .queryParam(param -> param.key("since_date")
                                .value(input.getSinceDate()).isRequired(false))
                        .queryParam(param -> param.key("until_date")
                                .value(input.getUntilDate()).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("order")
                                .value((input.getOrder() != null) ? input.getOrder().value() : null).isRequired(false))
                        .queryParam(param -> param.key("subscription")
                                .value(input.getSubscription()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        WebhookResponse[].class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Enables webhooks for your site.
     * @param  body  Optional parameter:
     * @return    Returns the EnableWebhooksResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EnableWebhooksResponse enableWebhooks(
            final EnableWebhooksRequest body) throws ApiException, IOException {
        return prepareEnableWebhooksRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for enableWebhooks.
     */
    private ApiCall<EnableWebhooksResponse, ApiException> prepareEnableWebhooksRequest(
            final EnableWebhooksRequest body) {
        return new ApiCall.Builder<EnableWebhooksResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/webhooks/settings.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, EnableWebhooksResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Replays webhooks. Posting to this endpoint does not immediately resend the webhooks. They are
     * added to a queue and sent as soon as possible, depending on available system resources. You
     * can submit an array of up to 1000 webhook IDs in the replay request.
     * @param  body  Optional parameter:
     * @return    Returns the ReplayWebhooksResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ReplayWebhooksResponse replayWebhooks(
            final ReplayWebhooksRequest body) throws ApiException, IOException {
        return prepareReplayWebhooksRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for replayWebhooks.
     */
    private ApiCall<ReplayWebhooksResponse, ApiException> prepareReplayWebhooksRequest(
            final ReplayWebhooksRequest body) {
        return new ApiCall.Builder<ReplayWebhooksResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/webhooks/replay.json")
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
                                response -> ApiHelper.deserialize(response, ReplayWebhooksResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Creates an endpoint and assigns a list of webhook subscriptions (events) to it. See the
     * [Webhooks Reference](page:introduction/webhooks/webhooks-reference#events) page for available
     * events.
     * @param  body  Optional parameter:
     * @return    Returns the EndpointResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EndpointResponse createEndpoint(
            final CreateOrUpdateEndpointRequest body) throws ApiException, IOException {
        return prepareCreateEndpointRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for createEndpoint.
     */
    private ApiCall<EndpointResponse, ApiException> prepareCreateEndpointRequest(
            final CreateOrUpdateEndpointRequest body) {
        return new ApiCall.Builder<EndpointResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/endpoints.json")
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
                                response -> ApiHelper.deserialize(response, EndpointResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns created endpoints for a site.
     * @return    Returns the List of Endpoint response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<Endpoint> listEndpoints() throws ApiException, IOException {
        return prepareListEndpointsRequest().execute();
    }

    /**
     * Builds the ApiCall object for listEndpoints.
     */
    private ApiCall<List<Endpoint>, ApiException> prepareListEndpointsRequest() {
        return new ApiCall.Builder<List<Endpoint>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/endpoints.json")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        Endpoint[].class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Updates an Endpoint. You can change the `url` of your endpoint or the list of
     * `webhook_subscriptions` to which you are subscribed. See the [Webhooks
     * Reference](page:introduction/webhooks/webhooks-reference#events) page for available events.
     * Always send a complete list of events to which you want to subscribe. Sending a PUT request
     * for an existing endpoint with an empty list of `webhook_subscriptions` will unsubscribe all
     * events. If you want to unsubscribe from a specific event, send a list of
     * `webhook_subscriptions` without the specific event key.
     * @param  endpointId  Required parameter: The Advanced Billing id for the endpoint that should
     *         be updated
     * @param  body  Optional parameter:
     * @return    Returns the EndpointResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EndpointResponse updateEndpoint(
            final int endpointId,
            final CreateOrUpdateEndpointRequest body) throws ApiException, IOException {
        return prepareUpdateEndpointRequest(endpointId, body).execute();
    }

    /**
     * Builds the ApiCall object for updateEndpoint.
     */
    private ApiCall<EndpointResponse, ApiException> prepareUpdateEndpointRequest(
            final int endpointId,
            final CreateOrUpdateEndpointRequest body) {
        return new ApiCall.Builder<EndpointResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/endpoints/{endpoint_id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("endpoint_id").value(endpointId).isRequired(false)
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
                                response -> ApiHelper.deserialize(response, EndpointResponse.class))
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
}