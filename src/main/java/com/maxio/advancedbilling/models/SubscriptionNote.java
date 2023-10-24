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
 * This is a model class for SubscriptionNote type.
 */
public class SubscriptionNote {
    private Integer id;
    private String body;
    private Integer subscriptionId;
    private String createdAt;
    private String updatedAt;
    private Boolean sticky;

    /**
     * Default constructor.
     */
    public SubscriptionNote() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  body  String value for body.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     * @param  sticky  Boolean value for sticky.
     */
    public SubscriptionNote(
            Integer id,
            String body,
            Integer subscriptionId,
            String createdAt,
            String updatedAt,
            Boolean sticky) {
        this.id = id;
        this.body = body;
        this.subscriptionId = subscriptionId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.sticky = sticky;
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
     * Getter for Body.
     * @return Returns the String
     */
    @JsonGetter("body")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * @param body Value for String
     */
    @JsonSetter("body")
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Getter for SubscriptionId.
     * @return Returns the Integer
     */
    @JsonGetter("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * @param subscriptionId Value for Integer
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for String
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for Sticky.
     * @return Returns the Boolean
     */
    @JsonGetter("sticky")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getSticky() {
        return sticky;
    }

    /**
     * Setter for Sticky.
     * @param sticky Value for Boolean
     */
    @JsonSetter("sticky")
    public void setSticky(Boolean sticky) {
        this.sticky = sticky;
    }

    /**
     * Converts this SubscriptionNote into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionNote [" + "id=" + id + ", body=" + body + ", subscriptionId="
                + subscriptionId + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
                + ", sticky=" + sticky + "]";
    }

    /**
     * Builds a new {@link SubscriptionNote.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionNote.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .body(getBody())
                .subscriptionId(getSubscriptionId())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt())
                .sticky(getSticky());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionNote}.
     */
    public static class Builder {
        private Integer id;
        private String body;
        private Integer subscriptionId;
        private String createdAt;
        private String updatedAt;
        private Boolean sticky;



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
         * Setter for body.
         * @param  body  String value for body.
         * @return Builder
         */
        public Builder body(String body) {
            this.body = body;
            return this;
        }

        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  Integer value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(Integer subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for sticky.
         * @param  sticky  Boolean value for sticky.
         * @return Builder
         */
        public Builder sticky(Boolean sticky) {
            this.sticky = sticky;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionNote} object using the set fields.
         * @return {@link SubscriptionNote}
         */
        public SubscriptionNote build() {
            return new SubscriptionNote(id, body, subscriptionId, createdAt, updatedAt, sticky);
        }
    }
}
