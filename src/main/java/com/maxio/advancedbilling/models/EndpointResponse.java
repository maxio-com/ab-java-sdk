/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for EndpointResponse type.
 */
public class EndpointResponse {
    private Endpoint endpoint;

    /**
     * Default constructor.
     */
    public EndpointResponse() {
    }

    /**
     * Initialization constructor.
     * @param  endpoint  Endpoint value for endpoint.
     */
    public EndpointResponse(
            Endpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Getter for Endpoint.
     * @return Returns the Endpoint
     */
    @JsonGetter("endpoint")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Endpoint getEndpoint() {
        return endpoint;
    }

    /**
     * Setter for Endpoint.
     * @param endpoint Value for Endpoint
     */
    @JsonSetter("endpoint")
    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Converts this EndpointResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EndpointResponse [" + "endpoint=" + endpoint + "]";
    }

    /**
     * Builds a new {@link EndpointResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EndpointResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .endpoint(getEndpoint());
        return builder;
    }

    /**
     * Class to build instances of {@link EndpointResponse}.
     */
    public static class Builder {
        private Endpoint endpoint;



        /**
         * Setter for endpoint.
         * @param  endpoint  Endpoint value for endpoint.
         * @return Builder
         */
        public Builder endpoint(Endpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * Builds a new {@link EndpointResponse} object using the set fields.
         * @return {@link EndpointResponse}
         */
        public EndpointResponse build() {
            return new EndpointResponse(endpoint);
        }
    }
}
