/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for EnableWebhooksRequest type.
 */
public class EnableWebhooksRequest {
    private boolean webhooksEnabled;

    /**
     * Default constructor.
     */
    public EnableWebhooksRequest() {
    }

    /**
     * Initialization constructor.
     * @param  webhooksEnabled  boolean value for webhooksEnabled.
     */
    public EnableWebhooksRequest(
            boolean webhooksEnabled) {
        this.webhooksEnabled = webhooksEnabled;
    }

    /**
     * Getter for WebhooksEnabled.
     * @return Returns the boolean
     */
    @JsonGetter("webhooks_enabled")
    public boolean getWebhooksEnabled() {
        return webhooksEnabled;
    }

    /**
     * Setter for WebhooksEnabled.
     * @param webhooksEnabled Value for boolean
     */
    @JsonSetter("webhooks_enabled")
    public void setWebhooksEnabled(boolean webhooksEnabled) {
        this.webhooksEnabled = webhooksEnabled;
    }

    /**
     * Converts this EnableWebhooksRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EnableWebhooksRequest [" + "webhooksEnabled=" + webhooksEnabled + "]";
    }

    /**
     * Builds a new {@link EnableWebhooksRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EnableWebhooksRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(webhooksEnabled);
        return builder;
    }

    /**
     * Class to build instances of {@link EnableWebhooksRequest}.
     */
    public static class Builder {
        private boolean webhooksEnabled;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  webhooksEnabled  boolean value for webhooksEnabled.
         */
        public Builder(boolean webhooksEnabled) {
            this.webhooksEnabled = webhooksEnabled;
        }

        /**
         * Setter for webhooksEnabled.
         * @param  webhooksEnabled  boolean value for webhooksEnabled.
         * @return Builder
         */
        public Builder webhooksEnabled(boolean webhooksEnabled) {
            this.webhooksEnabled = webhooksEnabled;
            return this;
        }

        /**
         * Builds a new {@link EnableWebhooksRequest} object using the set fields.
         * @return {@link EnableWebhooksRequest}
         */
        public EnableWebhooksRequest build() {
            return new EnableWebhooksRequest(webhooksEnabled);
        }
    }
}
