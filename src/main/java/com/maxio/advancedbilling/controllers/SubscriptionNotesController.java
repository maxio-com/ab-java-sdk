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
import com.maxio.advancedbilling.models.ListSubscriptionNotesInput;
import com.maxio.advancedbilling.models.SubscriptionNoteResponse;
import com.maxio.advancedbilling.models.UpdateSubscriptionNoteRequest;
import io.apimatic.core.ApiCall;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;
import java.util.List;

/**
 * This class lists all the endpoints of the groups.
 */
public final class SubscriptionNotesController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public SubscriptionNotesController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Use the following method to create a note for a subscription. ## How to Use Subscription
     * Notes Notes allow you to record information about a particular Subscription in a free text
     * format. If you have structured data such as birth date, color, etc., consider using Metadata
     * instead. Full documentation on how to use Notes in the Advanced Billing UI can be located
     * [here](https://maxio.zendesk.com/hc/en-us/articles/24251712214413-Subscription-Summary-Overview).
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  body  Optional parameter: Example:
     * @return    Returns the SubscriptionNoteResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionNoteResponse createSubscriptionNote(
            final int subscriptionId,
            final UpdateSubscriptionNoteRequest body) throws ApiException, IOException {
        return prepareCreateSubscriptionNoteRequest(subscriptionId, body).execute();
    }

    /**
     * Builds the ApiCall object for createSubscriptionNote.
     */
    private ApiCall<SubscriptionNoteResponse, ApiException> prepareCreateSubscriptionNoteRequest(
            final int subscriptionId,
            final UpdateSubscriptionNoteRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<SubscriptionNoteResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/notes.json")
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
                                response -> ApiHelper.deserialize(response, SubscriptionNoteResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Use this method to retrieve a list of Notes associated with a Subscription. The response will
     * be an array of Notes.
     * @param  input  ListSubscriptionNotesInput object containing request parameters
     * @return    Returns the List of SubscriptionNoteResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<SubscriptionNoteResponse> listSubscriptionNotes(
            final ListSubscriptionNotesInput input) throws ApiException, IOException {
        return prepareListSubscriptionNotesRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listSubscriptionNotes.
     */
    private ApiCall<List<SubscriptionNoteResponse>, ApiException> prepareListSubscriptionNotesRequest(
            final ListSubscriptionNotesInput input) throws IOException {
        return new ApiCall.Builder<List<SubscriptionNoteResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/notes.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .templateParam(param -> param.key("subscription_id").value(input.getSubscriptionId()).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        SubscriptionNoteResponse[].class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Once you have obtained the ID of the note you wish to read, use this method to show a
     * particular note attached to a subscription.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  noteId  Required parameter: The Advanced Billing id of the note
     * @return    Returns the SubscriptionNoteResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionNoteResponse readSubscriptionNote(
            final int subscriptionId,
            final int noteId) throws ApiException, IOException {
        return prepareReadSubscriptionNoteRequest(subscriptionId, noteId).execute();
    }

    /**
     * Builds the ApiCall object for readSubscriptionNote.
     */
    private ApiCall<SubscriptionNoteResponse, ApiException> prepareReadSubscriptionNoteRequest(
            final int subscriptionId,
            final int noteId) throws IOException {
        return new ApiCall.Builder<SubscriptionNoteResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/notes/{note_id}.json")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("note_id").value(noteId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SubscriptionNoteResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Use the following method to update a note for a Subscription.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  noteId  Required parameter: The Advanced Billing id of the note
     * @param  body  Optional parameter: Example:
     * @return    Returns the SubscriptionNoteResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SubscriptionNoteResponse updateSubscriptionNote(
            final int subscriptionId,
            final int noteId,
            final UpdateSubscriptionNoteRequest body) throws ApiException, IOException {
        return prepareUpdateSubscriptionNoteRequest(subscriptionId, noteId, body).execute();
    }

    /**
     * Builds the ApiCall object for updateSubscriptionNote.
     */
    private ApiCall<SubscriptionNoteResponse, ApiException> prepareUpdateSubscriptionNoteRequest(
            final int subscriptionId,
            final int noteId,
            final UpdateSubscriptionNoteRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<SubscriptionNoteResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/notes/{note_id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("note_id").value(noteId).isRequired(false)
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
                                response -> ApiHelper.deserialize(response, SubscriptionNoteResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Use the following method to delete a note for a Subscription.
     * @param  subscriptionId  Required parameter: The Chargify id of the subscription
     * @param  noteId  Required parameter: The Advanced Billing id of the note
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void deleteSubscriptionNote(
            final int subscriptionId,
            final int noteId) throws ApiException, IOException {
        prepareDeleteSubscriptionNoteRequest(subscriptionId, noteId).execute();
    }

    /**
     * Builds the ApiCall object for deleteSubscriptionNote.
     */
    private ApiCall<Void, ApiException> prepareDeleteSubscriptionNoteRequest(
            final int subscriptionId,
            final int noteId) throws IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/notes/{note_id}.json")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId).isRequired(false)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("note_id").value(noteId).isRequired(false)
                                .shouldEncode(true))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}