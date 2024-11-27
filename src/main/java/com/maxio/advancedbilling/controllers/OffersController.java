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
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.CreateOfferRequest;
import com.maxio.advancedbilling.models.ListOffersInput;
import com.maxio.advancedbilling.models.ListOffersResponse;
import com.maxio.advancedbilling.models.OfferResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class OffersController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public OffersController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Create an offer within your Advanced Billing site by sending a POST request. ## Documentation
     * Offers allow you to package complicated combinations of products, components and coupons into
     * a convenient package which can then be subscribed to just like products. Once an offer is
     * defined it can be used as an alternative to the product when creating subscriptions. Full
     * documentation on how to use offers in the Advanced Billing UI can be located
     * [here](https://maxio.zendesk.com/hc/en-us/articles/24261295098637-Offers-Overview). ## Using
     * a Product Price Point You can optionally pass in a `product_price_point_id` that corresponds
     * with the `product_id` and the offer will use that price point. If a `product_price_point_id`
     * is not passed in, the product's default price point will be used.
     * @param  body  Optional parameter: Example:
     * @return    Returns the OfferResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public OfferResponse createOffer(
            final CreateOfferRequest body) throws ApiException, IOException {
        return prepareCreateOfferRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for createOffer.
     */
    private ApiCall<OfferResponse, ApiException> prepareCreateOfferRequest(
            final CreateOfferRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<OfferResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/offers.json")
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
                                response -> ApiHelper.deserialize(response, OfferResponse.class))
                        .nullify404(false)
                        .localErrorCase("422",
                                 ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                                (reason, context) -> new ErrorArrayMapResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint will list offers for a site.
     * @param  input  ListOffersInput object containing request parameters
     * @return    Returns the ListOffersResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListOffersResponse listOffers(
            final ListOffersInput input) throws ApiException, IOException {
        return prepareListOffersRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listOffers.
     */
    private ApiCall<ListOffersResponse, ApiException> prepareListOffersRequest(
            final ListOffersInput input) throws IOException {
        return new ApiCall.Builder<ListOffersResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/offers.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("include_archived")
                                .value(input.getIncludeArchived()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListOffersResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This method allows you to list a specific offer's attributes. This is different than list all
     * offers for a site, as it requires an `offer_id`.
     * @param  offerId  Required parameter: The Chargify id of the offer
     * @return    Returns the OfferResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public OfferResponse readOffer(
            final int offerId) throws ApiException, IOException {
        return prepareReadOfferRequest(offerId).execute();
    }

    /**
     * Builds the ApiCall object for readOffer.
     */
    private ApiCall<OfferResponse, ApiException> prepareReadOfferRequest(
            final int offerId) throws IOException {
        return new ApiCall.Builder<OfferResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/offers/{offer_id}.json")
                        .templateParam(param -> param.key("offer_id").value(offerId).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, OfferResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Archive an existing offer. Please provide an `offer_id` in order to archive the correct item.
     * @param  offerId  Required parameter: The Chargify id of the offer
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void archiveOffer(
            final int offerId) throws ApiException, IOException {
        prepareArchiveOfferRequest(offerId).execute();
    }

    /**
     * Builds the ApiCall object for archiveOffer.
     */
    private ApiCall<Void, ApiException> prepareArchiveOfferRequest(
            final int offerId) throws IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/offers/{offer_id}/archive.json")
                        .templateParam(param -> param.key("offer_id").value(offerId).isRequired(false)
                                .shouldEncode(true))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Unarchive a previously archived offer. Please provide an `offer_id` in order to un-archive
     * the correct item.
     * @param  offerId  Required parameter: The Chargify id of the offer
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void unarchiveOffer(
            final int offerId) throws ApiException, IOException {
        prepareUnarchiveOfferRequest(offerId).execute();
    }

    /**
     * Builds the ApiCall object for unarchiveOffer.
     */
    private ApiCall<Void, ApiException> prepareUnarchiveOfferRequest(
            final int offerId) throws IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.PRODUCTION.value())
                        .path("/offers/{offer_id}/unarchive.json")
                        .templateParam(param -> param.key("offer_id").value(offerId).isRequired(false)
                                .shouldEncode(true))
                        .withAuth(auth -> auth
                                .add("BasicAuth"))
                        .arraySerializationFormat(ArraySerializationFormat.CSV)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}