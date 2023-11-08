/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.controllers;

import com.maxio.advancedbilling.ApiHelper;
import com.maxio.advancedbilling.Server;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.ListSaleRepItem;
import com.maxio.advancedbilling.models.ListSalesCommissionSettingsInput;
import com.maxio.advancedbilling.models.ListSalesRepsInput;
import com.maxio.advancedbilling.models.SaleRep;
import com.maxio.advancedbilling.models.SaleRepSettings;
import io.apimatic.core.ApiCall;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;
import java.util.List;

/**
 * This class lists all the endpoints of the groups.
 */
public final class SalesCommissionsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public SalesCommissionsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Endpoint returns subscriptions with associated sales reps ## Modified Authentication Process
     * The Sales Commission API differs from other Chargify API endpoints. This resource is
     * associated with the seller itself. Up to now all available resources were at the level of the
     * site, therefore creating the API Key per site was a sufficient solution. To share resources
     * at the seller level, a new authentication method was introduced, which is user
     * authentication. Creating an API Key for a user is a required step to correctly use the Sales
     * Commission API, more details
     * [here](https://developers.chargify.com/docs/developer-docs/ZG9jOjMyNzk5NTg0-2020-04-20-new-api-authentication).
     * Access to the Sales Commission API endpoints is available to users with financial access,
     * where the seller has the Advanced Analytics component enabled. For further information on
     * getting access to Advanced Analytics please contact Chargify support. &gt; Note: The request is
     * at seller level, it means `&lt;&lt;subdomain&gt;&gt;` variable will be replaced by `app`.
     * @param  input  ListSalesCommissionSettingsInput object containing request parameters
     * @return    Returns the List of SaleRepSettings response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<SaleRepSettings> listSalesCommissionSettings(
            final ListSalesCommissionSettingsInput input) throws ApiException, IOException {
        return prepareListSalesCommissionSettingsRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listSalesCommissionSettings.
     */
    private ApiCall<List<SaleRepSettings>, ApiException> prepareListSalesCommissionSettingsRequest(
            final ListSalesCommissionSettingsInput input) throws IOException {
        return new ApiCall.Builder<List<SaleRepSettings>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/sellers/{seller_id}/sales_commission_settings.json")
                        .queryParam(param -> param.key("live_mode")
                                .value(input.getLiveMode()).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .templateParam(param -> param.key("seller_id").value(input.getSellerId())
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Authorization")
                                .value(input.getAuthorization()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        SaleRepSettings[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Endpoint returns sales rep list with details ## Modified Authentication Process The Sales
     * Commission API differs from other Chargify API endpoints. This resource is associated with
     * the seller itself. Up to now all available resources were at the level of the site, therefore
     * creating the API Key per site was a sufficient solution. To share resources at the seller
     * level, a new authentication method was introduced, which is user authentication. Creating an
     * API Key for a user is a required step to correctly use the Sales Commission API, more details
     * [here](https://developers.chargify.com/docs/developer-docs/ZG9jOjMyNzk5NTg0-2020-04-20-new-api-authentication).
     * Access to the Sales Commission API endpoints is available to users with financial access,
     * where the seller has the Advanced Analytics component enabled. For further information on
     * getting access to Advanced Analytics please contact Chargify support. &gt; Note: The request is
     * at seller level, it means `&lt;&lt;subdomain&gt;&gt;` variable will be replaced by `app`.
     * @param  input  ListSalesRepsInput object containing request parameters
     * @return    Returns the List of ListSaleRepItem response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<ListSaleRepItem> listSalesReps(
            final ListSalesRepsInput input) throws ApiException, IOException {
        return prepareListSalesRepsRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listSalesReps.
     */
    private ApiCall<List<ListSaleRepItem>, ApiException> prepareListSalesRepsRequest(
            final ListSalesRepsInput input) throws IOException {
        return new ApiCall.Builder<List<ListSaleRepItem>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/sellers/{seller_id}/sales_reps.json")
                        .queryParam(param -> param.key("live_mode")
                                .value(input.getLiveMode()).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .templateParam(param -> param.key("seller_id").value(input.getSellerId())
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Authorization")
                                .value(input.getAuthorization()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        ListSaleRepItem[].class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * Endpoint returns sales rep and attached subscriptions details. ## Modified Authentication
     * Process The Sales Commission API differs from other Chargify API endpoints. This resource is
     * associated with the seller itself. Up to now all available resources were at the level of the
     * site, therefore creating the API Key per site was a sufficient solution. To share resources
     * at the seller level, a new authentication method was introduced, which is user
     * authentication. Creating an API Key for a user is a required step to correctly use the Sales
     * Commission API, more details
     * [here](https://developers.chargify.com/docs/developer-docs/ZG9jOjMyNzk5NTg0-2020-04-20-new-api-authentication).
     * Access to the Sales Commission API endpoints is available to users with financial access,
     * where the seller has the Advanced Analytics component enabled. For further information on
     * getting access to Advanced Analytics please contact Chargify support. &gt; Note: The request is
     * at seller level, it means `&lt;&lt;subdomain&gt;&gt;` variable will be replaced by `app`.
     * @param  sellerId  Required parameter: The Chargify id of your seller account
     * @param  salesRepId  Required parameter: The Chargify id of sales rep.
     * @param  authorization  Optional parameter: For authorization use user API key. See details
     *         [here](https://developers.chargify.com/docs/developer-docs/ZG9jOjMyNzk5NTg0-2020-04-20-new-api-authentication).
     * @param  liveMode  Optional parameter: This parameter indicates if records should be fetched
     *         from live mode sites. Default value is true.
     * @param  page  Optional parameter: Result records are organized in pages. By default, the
     *         first page of results is displayed. The page parameter specifies a page number of
     *         results to fetch. You can start navigating through the pages to consume the results.
     *         You do this by passing in a page parameter. Retrieve the next page by adding ?page=2
     *         to the query string. If there are no results to return, then an empty result set will
     *         be returned. Use in query `page=1`.
     * @param  perPage  Optional parameter: This parameter indicates how many records to fetch in
     *         each request. Default value is 100.
     * @return    Returns the SaleRep response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SaleRep readSalesRep(
            final String sellerId,
            final String salesRepId,
            final String authorization,
            final Boolean liveMode,
            final Integer page,
            final Integer perPage) throws ApiException, IOException {
        return prepareReadSalesRepRequest(sellerId, salesRepId, authorization, liveMode, page,
                perPage).execute();
    }

    /**
     * Builds the ApiCall object for readSalesRep.
     */
    private ApiCall<SaleRep, ApiException> prepareReadSalesRepRequest(
            final String sellerId,
            final String salesRepId,
            final String authorization,
            final Boolean liveMode,
            final Integer page,
            final Integer perPage) throws IOException {
        return new ApiCall.Builder<SaleRep, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/sellers/{seller_id}/sales_reps/{sales_rep_id}.json")
                        .queryParam(param -> param.key("live_mode")
                                .value(liveMode).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value((page != null) ? page : 1).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value((perPage != null) ? perPage : 100).isRequired(false))
                        .templateParam(param -> param.key("seller_id").value(sellerId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("sales_rep_id").value(salesRepId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Authorization")
                                .value((authorization != null) ? authorization : "Bearer <<apiKey>>").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SaleRep.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }
}