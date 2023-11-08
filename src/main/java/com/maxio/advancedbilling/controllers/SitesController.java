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
import com.maxio.advancedbilling.models.CleanupScope;
import com.maxio.advancedbilling.models.ListChargifyJsPublicKeysInput;
import com.maxio.advancedbilling.models.ListPublicKeysResponse;
import com.maxio.advancedbilling.models.SiteResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class SitesController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public SitesController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This endpoint allows you to fetch some site data. Full documentation on Sites in the Chargify
     * UI can be located [here](https://chargify.zendesk.com/hc/en-us/articles/4407870738587).
     * Specifically, the [Clearing Site
     * Data](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405428327309) section is
     * extremely relevant to this endpoint documentation. #### Relationship invoicing enabled If
     * site has RI enabled then you will see more settings like: "customer_hierarchy_enabled": true,
     * "whopays_enabled": true, "whopays_default_payer": "self" You can read more about these
     * settings here: [Who Pays &amp; Customer
     * Hierarchy](https://chargify.zendesk.com/hc/en-us/articles/4407746683291).
     * @return    Returns the SiteResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SiteResponse readSite() throws ApiException, IOException {
        return prepareReadSiteRequest().execute();
    }

    /**
     * Builds the ApiCall object for readSite.
     */
    private ApiCall<SiteResponse, ApiException> prepareReadSiteRequest() throws IOException {
        return new ApiCall.Builder<SiteResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/site.json")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SiteResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This call is asynchronous and there may be a delay before the site data is fully deleted. If
     * you are clearing site data for an automated test, you will need to build in a delay and/or
     * check that there are no products, etc., in the site before proceeding. **This functionality
     * will only work on sites in TEST mode. Attempts to perform this on sites in “live” mode will
     * result in a response of 403 FORBIDDEN.**.
     * @param  cleanupScope  Optional parameter: `all`: Will clear all products, customers, and
     *         related subscriptions from the site. `customers`: Will clear only customers and
     *         related subscriptions (leaving the products untouched) for the site. Revenue will
     *         also be reset to 0. Use in query `cleanup_scope=all`.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void clearSite(
            final CleanupScope cleanupScope) throws ApiException, IOException {
        prepareClearSiteRequest(cleanupScope).execute();
    }

    /**
     * Builds the ApiCall object for clearSite.
     */
    private ApiCall<Void, ApiException> prepareClearSiteRequest(
            final CleanupScope cleanupScope) throws IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/sites/clear_data.json")
                        .queryParam(param -> param.key("cleanup_scope")
                                .value((cleanupScope != null) ? cleanupScope.value() : "all").isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This endpoint returns public keys used for Chargify.js.
     * @param  input  ListChargifyJsPublicKeysInput object containing request parameters
     * @return    Returns the ListPublicKeysResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListPublicKeysResponse listChargifyJsPublicKeys(
            final ListChargifyJsPublicKeysInput input) throws ApiException, IOException {
        return prepareListChargifyJsPublicKeysRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listChargifyJsPublicKeys.
     */
    private ApiCall<ListPublicKeysResponse, ApiException> prepareListChargifyJsPublicKeysRequest(
            final ListChargifyJsPublicKeysInput input) throws IOException {
        return new ApiCall.Builder<ListPublicKeysResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/chargify_js_keys.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListPublicKeysResponse.class))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }
}