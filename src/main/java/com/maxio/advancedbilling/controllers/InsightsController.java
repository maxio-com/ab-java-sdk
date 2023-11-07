/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.controllers;

import com.maxio.advancedbilling.ApiHelper;
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.Server;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.SubscriptionsMrrErrorResponseException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.ListMRRResponse;
import com.maxio.advancedbilling.models.ListMrrPerSubscriptionInput;
import com.maxio.advancedbilling.models.MRRResponse;
import com.maxio.advancedbilling.models.ReadMrrMovementsInput;
import com.maxio.advancedbilling.models.SiteSummary;
import com.maxio.advancedbilling.models.SubscriptionMRRResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * This class lists all the endpoints of the groups.
 */
public final class InsightsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public InsightsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * The Stats API is a very basic view of some Site-level stats. This API call only answers with
     * JSON responses. An XML version is not provided. ## Stats Documentation There currently is not
     * a complimentary matching set of documentation that compliments this endpoint. However, each
     * Site's dashboard will reflect the summary of information provided in the Stats reposnse. ```
     * https://subdomain.chargify.com/dashboard ```.
     * @return    Returns the SiteSummary response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SiteSummary readSiteStats() throws ApiException, IOException {
        return prepareReadSiteStatsRequest().execute();
    }

    /**
     * Builds the ApiCall object for readSiteStats.
     */
    private ApiCall<SiteSummary, ApiException> prepareReadSiteStatsRequest() throws IOException {
        return new ApiCall.Builder<SiteSummary, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stats.json")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SiteSummary.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This endpoint returns your site's current MRR, including plan and usage breakouts.
     * @deprecated
     * 
     * @param  atTime  Optional parameter: submit a timestamp in ISO8601 format to request MRR for a
     *         historic time
     * @param  subscriptionId  Optional parameter: submit the id of a subscription in order to limit
     *         results
     * @return    Returns the MRRResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    @Deprecated
    public MRRResponse readMrr(
            final LocalDateTime atTime,
            final Integer subscriptionId) throws ApiException, IOException {
        return prepareReadMrrRequest(atTime, subscriptionId).execute();
    }

    /**
     * Builds the ApiCall object for readMrr.
     */
    private ApiCall<MRRResponse, ApiException> prepareReadMrrRequest(
            final LocalDateTime atTime,
            final Integer subscriptionId) throws IOException {
        return new ApiCall.Builder<MRRResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/mrr.json")
                        .queryParam(param -> param.key("at_time")
                                .value(DateTimeHelper.toRfc8601DateTime(atTime)).isRequired(false))
                        .queryParam(param -> param.key("subscription_id")
                                .value(subscriptionId).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, MRRResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This endpoint returns your site's MRR movements. ## Understanding MRR movements This endpoint
     * will aid in accessing your site's [MRR
     * Report](https://chargify.zendesk.com/hc/en-us/articles/4407838249627) data. Whenever a
     * subscription event occurs that causes your site's MRR to change (such as a signup or
     * upgrade), we record an MRR movement. These records are accessible via the MRR Movements
     * endpoint. Each MRR Movement belongs to a subscription and contains a timestamp, category, and
     * an amount. `line_items` represent the subscription's product configuration at the time of the
     * movement. ### Plan &amp; Usage Breakouts In the MRR Report UI, we support a setting to [include
     * or
     * exclude](https://chargify.zendesk.com/hc/en-us/articles/4407838249627#displaying-component-based-metered-usage-in-mrr)
     * usage revenue. In the MRR APIs, responses include `plan` and `usage` breakouts. Plan includes
     * revenue from: * Products * Quantity-Based Components * On/Off Components Usage includes
     * revenue from: * Metered Components * Prepaid Usage Components.
     * @deprecated
     * 
     * @param  input  ReadMrrMovementsInput object containing request parameters
     * @return    Returns the ListMRRResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    @Deprecated
    public ListMRRResponse readMrrMovements(
            final ReadMrrMovementsInput input) throws ApiException, IOException {
        return prepareReadMrrMovementsRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for readMrrMovements.
     */
    private ApiCall<ListMRRResponse, ApiException> prepareReadMrrMovementsRequest(
            final ReadMrrMovementsInput input) throws IOException {
        return new ApiCall.Builder<ListMRRResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/mrr_movements.json")
                        .queryParam(param -> param.key("subscription_id")
                                .value(input.getSubscriptionId()).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("direction")
                                .value((input.getDirection() != null) ? input.getDirection().value() : null).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListMRRResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This endpoint returns your site's current MRR, including plan and usage breakouts split per
     * subscription.
     * @deprecated
     * 
     * @param  input  ListMrrPerSubscriptionInput object containing request parameters
     * @return    Returns the SubscriptionMRRResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    @Deprecated
    public SubscriptionMRRResponse listMrrPerSubscription(
            final ListMrrPerSubscriptionInput input) throws ApiException, IOException {
        return prepareListMrrPerSubscriptionRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listMrrPerSubscription.
     */
    private ApiCall<SubscriptionMRRResponse, ApiException> prepareListMrrPerSubscriptionRequest(
            final ListMrrPerSubscriptionInput input) throws IOException {
        return new ApiCall.Builder<SubscriptionMRRResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions_mrr.json")
                        .queryParam(param -> param.key("filter[subscription_ids]")
                                .value(input.getFilterSubscriptionIds()).isRequired(false))
                        .queryParam(param -> param.key("at_time")
                                .value(input.getAtTime()).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("direction")
                                .value((input.getDirection() != null) ? input.getDirection().value() : null).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SubscriptionMRRResponse.class))
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad Request",
                                (reason, context) -> new SubscriptionsMrrErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }
}