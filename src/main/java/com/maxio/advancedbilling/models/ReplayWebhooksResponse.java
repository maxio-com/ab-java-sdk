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
 * This is a model class for ReplayWebhooksResponse type.
 */
public class ReplayWebhooksResponse {
    private String status;

    /**
     * Default constructor.
     */
    public ReplayWebhooksResponse() {
    }

    /**
     * Initialization constructor.
     * @param  status  String value for status.
     */
    public ReplayWebhooksResponse(
            String status) {
        this.status = status;
    }

    /**
     * Getter for Status.
     * @return Returns the String
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Converts this ReplayWebhooksResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReplayWebhooksResponse [" + "status=" + status + "]";
    }

    /**
     * Builds a new {@link ReplayWebhooksResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReplayWebhooksResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .status(getStatus());
        return builder;
    }

    /**
     * Class to build instances of {@link ReplayWebhooksResponse}.
     */
    public static class Builder {
        private String status;



        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Builds a new {@link ReplayWebhooksResponse} object using the set fields.
         * @return {@link ReplayWebhooksResponse}
         */
        public ReplayWebhooksResponse build() {
            return new ReplayWebhooksResponse(status);
        }
    }
}
