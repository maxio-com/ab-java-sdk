/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for CreateOrUpdateEndpointRequest type.
 */
public class CreateOrUpdateEndpointRequest
        extends BaseModel {
    private CreateOrUpdateEndpoint endpoint;

    /**
     * Default constructor.
     */
    public CreateOrUpdateEndpointRequest() {
    }

    /**
     * Initialization constructor.
     * @param  endpoint  CreateOrUpdateEndpoint value for endpoint.
     */
    public CreateOrUpdateEndpointRequest(
            CreateOrUpdateEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Getter for Endpoint.
     * Used to Create or Update Endpoint
     * @return Returns the CreateOrUpdateEndpoint
     */
    @JsonGetter("endpoint")
    public CreateOrUpdateEndpoint getEndpoint() {
        return endpoint;
    }

    /**
     * Setter for Endpoint.
     * Used to Create or Update Endpoint
     * @param endpoint Value for CreateOrUpdateEndpoint
     */
    @JsonSetter("endpoint")
    public void setEndpoint(CreateOrUpdateEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Converts this CreateOrUpdateEndpointRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateOrUpdateEndpointRequest [" + "endpoint=" + endpoint
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CreateOrUpdateEndpointRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateOrUpdateEndpointRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(endpoint);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateOrUpdateEndpointRequest}.
     */
    public static class Builder {
        private CreateOrUpdateEndpoint endpoint;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  endpoint  CreateOrUpdateEndpoint value for endpoint.
         */
        public Builder(CreateOrUpdateEndpoint endpoint) {
            this.endpoint = endpoint;
        }

        /**
         * Setter for endpoint.
         * @param  endpoint  CreateOrUpdateEndpoint value for endpoint.
         * @return Builder
         */
        public Builder endpoint(CreateOrUpdateEndpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * Builds a new {@link CreateOrUpdateEndpointRequest} object using the set fields.
         * @return {@link CreateOrUpdateEndpointRequest}
         */
        public CreateOrUpdateEndpointRequest build() {
            return new CreateOrUpdateEndpointRequest(endpoint);
        }
    }
}
