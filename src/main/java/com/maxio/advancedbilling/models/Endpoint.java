/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for Endpoint type.
 */
public class Endpoint {
    private Integer id;
    private String url;
    private Integer siteId;
    private String status;
    private List<String> webhookSubscriptions;

    /**
     * Default constructor.
     */
    public Endpoint() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  url  String value for url.
     * @param  siteId  Integer value for siteId.
     * @param  status  String value for status.
     * @param  webhookSubscriptions  List of String value for webhookSubscriptions.
     */
    public Endpoint(
            Integer id,
            String url,
            Integer siteId,
            String status,
            List<String> webhookSubscriptions) {
        this.id = id;
        this.url = url;
        this.siteId = siteId;
        this.status = status;
        this.webhookSubscriptions = webhookSubscriptions;
    }

    /**
     * Getter for Id.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for SiteId.
     * @return Returns the Integer
     */
    @JsonGetter("site_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSiteId() {
        return siteId;
    }

    /**
     * Setter for SiteId.
     * @param siteId Value for Integer
     */
    @JsonSetter("site_id")
    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
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
     * Getter for WebhookSubscriptions.
     * @return Returns the List of String
     */
    @JsonGetter("webhook_subscriptions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getWebhookSubscriptions() {
        return webhookSubscriptions;
    }

    /**
     * Setter for WebhookSubscriptions.
     * @param webhookSubscriptions Value for List of String
     */
    @JsonSetter("webhook_subscriptions")
    public void setWebhookSubscriptions(List<String> webhookSubscriptions) {
        this.webhookSubscriptions = webhookSubscriptions;
    }

    /**
     * Converts this Endpoint into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Endpoint [" + "id=" + id + ", url=" + url + ", siteId=" + siteId + ", status="
                + status + ", webhookSubscriptions=" + webhookSubscriptions + "]";
    }

    /**
     * Builds a new {@link Endpoint.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Endpoint.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .url(getUrl())
                .siteId(getSiteId())
                .status(getStatus())
                .webhookSubscriptions(getWebhookSubscriptions());
        return builder;
    }

    /**
     * Class to build instances of {@link Endpoint}.
     */
    public static class Builder {
        private Integer id;
        private String url;
        private Integer siteId;
        private String status;
        private List<String> webhookSubscriptions;



        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
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
         * Setter for siteId.
         * @param  siteId  Integer value for siteId.
         * @return Builder
         */
        public Builder siteId(Integer siteId) {
            this.siteId = siteId;
            return this;
        }

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
         * Setter for webhookSubscriptions.
         * @param  webhookSubscriptions  List of String value for webhookSubscriptions.
         * @return Builder
         */
        public Builder webhookSubscriptions(List<String> webhookSubscriptions) {
            this.webhookSubscriptions = webhookSubscriptions;
            return this;
        }

        /**
         * Builds a new {@link Endpoint} object using the set fields.
         * @return {@link Endpoint}
         */
        public Endpoint build() {
            return new Endpoint(id, url, siteId, status, webhookSubscriptions);
        }
    }
}
