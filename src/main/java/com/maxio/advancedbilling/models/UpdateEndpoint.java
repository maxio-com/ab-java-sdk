/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for UpdateEndpoint type.
 */
public class UpdateEndpoint {
    private String url;
    private List<WebhookSubscription> webhookSubscriptions;

    /**
     * Default constructor.
     */
    public UpdateEndpoint() {
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     * @param  webhookSubscriptions  List of WebhookSubscription value for webhookSubscriptions.
     */
    public UpdateEndpoint(
            String url,
            List<WebhookSubscription> webhookSubscriptions) {
        this.url = url;
        this.webhookSubscriptions = webhookSubscriptions;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for WebhookSubscriptions.
     * @return Returns the List of WebhookSubscription
     */
    @JsonGetter("webhook_subscriptions")
    public List<WebhookSubscription> getWebhookSubscriptions() {
        return webhookSubscriptions;
    }

    /**
     * Setter for WebhookSubscriptions.
     * @param webhookSubscriptions Value for List of WebhookSubscription
     */
    @JsonSetter("webhook_subscriptions")
    public void setWebhookSubscriptions(List<WebhookSubscription> webhookSubscriptions) {
        this.webhookSubscriptions = webhookSubscriptions;
    }

    /**
     * Converts this UpdateEndpoint into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateEndpoint [" + "url=" + url + ", webhookSubscriptions=" + webhookSubscriptions
                + "]";
    }

    /**
     * Builds a new {@link UpdateEndpoint.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateEndpoint.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(url, webhookSubscriptions);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateEndpoint}.
     */
    public static class Builder {
        private String url;
        private List<WebhookSubscription> webhookSubscriptions;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  url  String value for url.
         * @param  webhookSubscriptions  List of WebhookSubscription value for webhookSubscriptions.
         */
        public Builder(String url, List<WebhookSubscription> webhookSubscriptions) {
            this.url = url;
            this.webhookSubscriptions = webhookSubscriptions;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Setter for webhookSubscriptions.
         * @param  webhookSubscriptions  List of WebhookSubscription value for webhookSubscriptions.
         * @return Builder
         */
        public Builder webhookSubscriptions(List<WebhookSubscription> webhookSubscriptions) {
            this.webhookSubscriptions = webhookSubscriptions;
            return this;
        }

        /**
         * Builds a new {@link UpdateEndpoint} object using the set fields.
         * @return {@link UpdateEndpoint}
         */
        public UpdateEndpoint build() {
            return new UpdateEndpoint(url, webhookSubscriptions);
        }
    }
}
