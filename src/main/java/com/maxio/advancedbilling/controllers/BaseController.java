/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.controllers;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.http.client.HttpCallback;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.HttpClient;
import java.util.HashMap;
import java.util.Map;

/**
 * Base class for all Controllers.
 */
public abstract class BaseController {
    protected static final Map<String, ErrorCase<ApiException>> GLOBAL_ERROR_CASES =
            new HashMap<String, ErrorCase<ApiException>>();
    private GlobalConfiguration globalConfig;
    static {
        GLOBAL_ERROR_CASES.put("404", ErrorCase.setTemplate("Not Found:'{$response.body}'",
                (reason, context) -> new ApiException(reason, context)));
        GLOBAL_ERROR_CASES.put(ErrorCase.DEFAULT, ErrorCase.setTemplate("HTTP Response Not OK. Status code: {$statusCode}. Response: '{$response.body}'.",
                (reason, context) -> new ApiException(reason, context)));
    }

    protected BaseController(GlobalConfiguration globalConfig) {
        this.globalConfig = globalConfig;
    }

    /**
     * Get httpCallback associated with this controller.
     * @return HttpCallback
     */
    public HttpCallback getHttpCallback() {
        return (HttpCallback) globalConfig.getHttpCallback();
    }
    
    /**
     * Shared instance of the Http client.
     * @return The shared instance of the http client 
     */
    public HttpClient getClientInstance() {
        return globalConfig.getHttpClient();
    }

    /**
     * Instance of the Global Configuration
     * @return The instance of the global configuration 
     */
    protected GlobalConfiguration getGlobalConfiguration() {
        return globalConfig;
    }
}
