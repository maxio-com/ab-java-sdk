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
 * This is a model class for WebhookResponse type.
 */
public class WebhookResponse {
    private Webhook webhook;

    /**
     * Default constructor.
     */
    public WebhookResponse() {
    }

    /**
     * Initialization constructor.
     * @param  webhook  Webhook value for webhook.
     */
    public WebhookResponse(
            Webhook webhook) {
        this.webhook = webhook;
    }

    /**
     * Getter for Webhook.
     * @return Returns the Webhook
     */
    @JsonGetter("webhook")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Webhook getWebhook() {
        return webhook;
    }

    /**
     * Setter for Webhook.
     * @param webhook Value for Webhook
     */
    @JsonSetter("webhook")
    public void setWebhook(Webhook webhook) {
        this.webhook = webhook;
    }

    /**
     * Converts this WebhookResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WebhookResponse [" + "webhook=" + webhook + "]";
    }

    /**
     * Builds a new {@link WebhookResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WebhookResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .webhook(getWebhook());
        return builder;
    }

    /**
     * Class to build instances of {@link WebhookResponse}.
     */
    public static class Builder {
        private Webhook webhook;



        /**
         * Setter for webhook.
         * @param  webhook  Webhook value for webhook.
         * @return Builder
         */
        public Builder webhook(Webhook webhook) {
            this.webhook = webhook;
            return this;
        }

        /**
         * Builds a new {@link WebhookResponse} object using the set fields.
         * @return {@link WebhookResponse}
         */
        public WebhookResponse build() {
            return new WebhookResponse(webhook);
        }
    }
}
