/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UpdateEndpointRequest type.
 */
public class UpdateEndpointRequest {
    private UpdateEndpoint endpoint;

    /**
     * Default constructor.
     */
    public UpdateEndpointRequest() {
    }

    /**
     * Initialization constructor.
     * @param  endpoint  UpdateEndpoint value for endpoint.
     */
    public UpdateEndpointRequest(
            UpdateEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Getter for Endpoint.
     * Used to Create or Update Endpoint
     * @return Returns the UpdateEndpoint
     */
    @JsonGetter("endpoint")
    public UpdateEndpoint getEndpoint() {
        return endpoint;
    }

    /**
     * Setter for Endpoint.
     * Used to Create or Update Endpoint
     * @param endpoint Value for UpdateEndpoint
     */
    @JsonSetter("endpoint")
    public void setEndpoint(UpdateEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Converts this UpdateEndpointRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateEndpointRequest [" + "endpoint=" + endpoint + "]";
    }

    /**
     * Builds a new {@link UpdateEndpointRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateEndpointRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(endpoint);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateEndpointRequest}.
     */
    public static class Builder {
        private UpdateEndpoint endpoint;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  endpoint  UpdateEndpoint value for endpoint.
         */
        public Builder(UpdateEndpoint endpoint) {
            this.endpoint = endpoint;
        }

        /**
         * Setter for endpoint.
         * @param  endpoint  UpdateEndpoint value for endpoint.
         * @return Builder
         */
        public Builder endpoint(UpdateEndpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * Builds a new {@link UpdateEndpointRequest} object using the set fields.
         * @return {@link UpdateEndpointRequest}
         */
        public UpdateEndpointRequest build() {
            return new UpdateEndpointRequest(endpoint);
        }
    }
}
