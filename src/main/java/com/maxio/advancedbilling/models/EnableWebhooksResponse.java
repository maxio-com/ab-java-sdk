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
 * This is a model class for EnableWebhooksResponse type.
 */
public class EnableWebhooksResponse {
    private Boolean webhooksEnabled;

    /**
     * Default constructor.
     */
    public EnableWebhooksResponse() {
    }

    /**
     * Initialization constructor.
     * @param  webhooksEnabled  Boolean value for webhooksEnabled.
     */
    public EnableWebhooksResponse(
            Boolean webhooksEnabled) {
        this.webhooksEnabled = webhooksEnabled;
    }

    /**
     * Getter for WebhooksEnabled.
     * @return Returns the Boolean
     */
    @JsonGetter("webhooks_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getWebhooksEnabled() {
        return webhooksEnabled;
    }

    /**
     * Setter for WebhooksEnabled.
     * @param webhooksEnabled Value for Boolean
     */
    @JsonSetter("webhooks_enabled")
    public void setWebhooksEnabled(Boolean webhooksEnabled) {
        this.webhooksEnabled = webhooksEnabled;
    }

    /**
     * Converts this EnableWebhooksResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EnableWebhooksResponse [" + "webhooksEnabled=" + webhooksEnabled + "]";
    }

    /**
     * Builds a new {@link EnableWebhooksResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EnableWebhooksResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .webhooksEnabled(getWebhooksEnabled());
        return builder;
    }

    /**
     * Class to build instances of {@link EnableWebhooksResponse}.
     */
    public static class Builder {
        private Boolean webhooksEnabled;



        /**
         * Setter for webhooksEnabled.
         * @param  webhooksEnabled  Boolean value for webhooksEnabled.
         * @return Builder
         */
        public Builder webhooksEnabled(Boolean webhooksEnabled) {
            this.webhooksEnabled = webhooksEnabled;
            return this;
        }

        /**
         * Builds a new {@link EnableWebhooksResponse} object using the set fields.
         * @return {@link EnableWebhooksResponse}
         */
        public EnableWebhooksResponse build() {
            return new EnableWebhooksResponse(webhooksEnabled);
        }
    }
}
