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
import com.maxio.advancedbilling.models.EnableWebhooksRequest;
import com.maxio.advancedbilling.models.EnableWebhooksResponse;
import com.maxio.advancedbilling.models.Endpoint;
import com.maxio.advancedbilling.models.EndpointResponse;
import com.maxio.advancedbilling.models.ListWebhooksInput;
import com.maxio.advancedbilling.models.ReplayWebhooksRequest;
import com.maxio.advancedbilling.models.ReplayWebhooksResponse;
import com.maxio.advancedbilling.models.UpdateEndpointRequest;
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
     * ## Webhooks Intro The Webhooks API allows you to view a list of all webhooks and to
     * selectively resend individual or groups of webhooks. Webhooks will be sent on endpoints
     * specified by you. Endpoints can be added via API or Web UI. There is also an option to enable
     * / disable webhooks via API request. We recommend that you review Chargify's webhook
     * documentation located in our help site. The following resources will help guide you on how to
     * use webhooks in Chargify, in addition to these webhook endpoints: + [Adding/editing new
     * webhooks](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404448450317#configure-webhook-url)
     * + [Webhooks introduction and delivery
     * information](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405568068365#webhooks-introduction-0-0)
     * + [Main webhook
     * overview](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405357509645-Webhooks-Reference#webhooks-reference-0-0)
     * + [Available webhooks and
     * payloads](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405357509645-Webhooks-Reference#events)
     * ## List Webhooks for a Site This method allows you to fetch data about webhooks. You can pass
     * query parameters if you want to filter webhooks.
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
            final ListWebhooksInput input) throws IOException {
        return new ApiCall.Builder<List<WebhookResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
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
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        WebhookResponse[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This method allows you to enable webhooks via API for your site.
     * @param  body  Optional parameter: Example:
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
            final EnableWebhooksRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<EnableWebhooksResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/webhooks/settings.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, EnableWebhooksResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Posting to the replay endpoint does not immediately resend the webhooks. They are added to a
     * queue and will be sent as soon as possible, depending on available system resources. You may
     * submit an array of up to 1000 webhook IDs to replay in the request.
     * @param  body  Optional parameter: Example:
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
            final ReplayWebhooksRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ReplayWebhooksResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/webhooks/replay.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ReplayWebhooksResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * The Chargify API allows you to create an endpoint and assign a list of webhooks subscriptions
     * (events) to it. You can check available events here. [Event
     * keys](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405357509645-Webhooks-Reference#example-payloads).
     * @param  body  Optional parameter: Example:
     * @return    Returns the EndpointResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EndpointResponse createEndpoint(
            final UpdateEndpointRequest body) throws ApiException, IOException {
        return prepareCreateEndpointRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for createEndpoint.
     */
    private ApiCall<EndpointResponse, ApiException> prepareCreateEndpointRequest(
            final UpdateEndpointRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<EndpointResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/endpoints.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, EndpointResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This method returns created endpoints for site.
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
    private ApiCall<List<Endpoint>, ApiException> prepareListEndpointsRequest() throws IOException {
        return new ApiCall.Builder<List<Endpoint>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/endpoints.json")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        Endpoint[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * You can update an Endpoint via the API with a PUT request to the resource endpoint. You can
     * change the `url` of your endpoint which consumes webhooks or list of `webhook_subscriptions`.
     * Check available [Event
     * keys](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404448450317-Webhooks#configure-webhook-url).
     * Always send a complete list of events which you want subscribe/watch. Sending an PUT request
     * for existing endpoint with empty list of `webhook_subscriptions` will end with unsubscribe
     * from all events. If you want unsubscribe from specific event, just send a list of
     * `webhook_subscriptions` without the specific event key.
     * @param  endpointId  Required parameter: The Chargify id for the endpoint that should be
     *         updated
     * @param  body  Optional parameter: Example:
     * @return    Returns the EndpointResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EndpointResponse updateEndpoint(
            final int endpointId,
            final UpdateEndpointRequest body) throws ApiException, IOException {
        return prepareUpdateEndpointRequest(endpointId, body).execute();
    }

    /**
     * Builds the ApiCall object for updateEndpoint.
     */
    private ApiCall<EndpointResponse, ApiException> prepareUpdateEndpointRequest(
            final int endpointId,
            final UpdateEndpointRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<EndpointResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/endpoints/{endpoint_id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("endpoint_id").value(endpointId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, EndpointResponse.class))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ErrorListResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }
}