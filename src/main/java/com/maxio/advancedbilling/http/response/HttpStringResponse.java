/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.http.response;

import com.maxio.advancedbilling.http.Headers;
import java.io.InputStream;

/**
 * Class to hold response body as string.
 */
public class HttpStringResponse extends HttpResponse {

    /**
     * Initialization constructor.
     * @param code    The HTTP status code
     * @param headers The HTTP headers read from response
     * @param rawBody The raw data returned in the HTTP response
     * @param body String response body
     */
    public HttpStringResponse(int code, Headers headers, InputStream rawBody, String body) {
        super(code, headers, rawBody, body);
    }
}
