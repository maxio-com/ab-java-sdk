/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import java.time.ZonedDateTime;

/**
 * This is a model class for SubscriptionNote type.
 */
public class SubscriptionNote {
    private Integer id;
    private String body;
    private Integer subscriptionId;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
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
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  updatedAt  ZonedDateTime value for updatedAt.
     * @param  sticky  Boolean value for sticky.
     */
    public SubscriptionNote(
            Integer id,
            String body,
            Integer subscriptionId,
            ZonedDateTime createdAt,
            ZonedDateTime updatedAt,
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
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for ZonedDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("updated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for ZonedDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(ZonedDateTime updatedAt) {
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
        private ZonedDateTime createdAt;
        private ZonedDateTime updatedAt;
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
         * @param  createdAt  ZonedDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  ZonedDateTime value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(ZonedDateTime updatedAt) {
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
