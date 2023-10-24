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
 * This is a model class for ChargifyEBB type.
 */
public class ChargifyEBB {
    private String timestamp;
    private String id;
    private String createdAt;
    private String uniquenessToken;
    private Integer subscriptionId;
    private String subscriptionReference;

    /**
     * Default constructor.
     */
    public ChargifyEBB() {
    }

    /**
     * Initialization constructor.
     * @param  timestamp  String value for timestamp.
     * @param  id  String value for id.
     * @param  createdAt  String value for createdAt.
     * @param  uniquenessToken  String value for uniquenessToken.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  subscriptionReference  String value for subscriptionReference.
     */
    public ChargifyEBB(
            String timestamp,
            String id,
            String createdAt,
            String uniquenessToken,
            Integer subscriptionId,
            String subscriptionReference) {
        this.timestamp = timestamp;
        this.id = id;
        this.createdAt = createdAt;
        this.uniquenessToken = uniquenessToken;
        this.subscriptionId = subscriptionId;
        this.subscriptionReference = subscriptionReference;
    }

    /**
     * Getter for Timestamp.
     * This timestamp determines what billing period the event will be billed in. If your request
     * payload does not include it, Chargify will add `chargify.timestamp` to the event payload and
     * set the value to `now`.
     * @return Returns the String
     */
    @JsonGetter("timestamp")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Setter for Timestamp.
     * This timestamp determines what billing period the event will be billed in. If your request
     * payload does not include it, Chargify will add `chargify.timestamp` to the event payload and
     * set the value to `now`.
     * @param timestamp Value for String
     */
    @JsonSetter("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Getter for Id.
     * A unique ID set by Chargify. Please note that this field is reserved. If `chargify.id` is
     * present in the request payload, it will be overwritten.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * A unique ID set by Chargify. Please note that this field is reserved. If `chargify.id` is
     * present in the request payload, it will be overwritten.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for CreatedAt.
     * An ISO-8601 timestamp, set by Chargify at the time each event is recorded. Please note that
     * this field is reserved. If `chargify.created_at` is present in the request payload, it will
     * be overwritten.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * An ISO-8601 timestamp, set by Chargify at the time each event is recorded. Please note that
     * this field is reserved. If `chargify.created_at` is present in the request payload, it will
     * be overwritten.
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UniquenessToken.
     * User-defined string scoped per-stream. Duplicate events within a stream will be silently
     * ignored. Tokens expire after 31 days.
     * @return Returns the String
     */
    @JsonGetter("uniqueness_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUniquenessToken() {
        return uniquenessToken;
    }

    /**
     * Setter for UniquenessToken.
     * User-defined string scoped per-stream. Duplicate events within a stream will be silently
     * ignored. Tokens expire after 31 days.
     * @param uniquenessToken Value for String
     */
    @JsonSetter("uniqueness_token")
    public void setUniquenessToken(String uniquenessToken) {
        this.uniquenessToken = uniquenessToken;
    }

    /**
     * Getter for SubscriptionId.
     * Id of Maxio Advanced Billing Subscription which is connected to this event. Provide
     * `subscription_id` if you configured `chargify.subscription_id` as Subscription Identifier in
     * your Event Stream.
     * @return Returns the Integer
     */
    @JsonGetter("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * Id of Maxio Advanced Billing Subscription which is connected to this event. Provide
     * `subscription_id` if you configured `chargify.subscription_id` as Subscription Identifier in
     * your Event Stream.
     * @param subscriptionId Value for Integer
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for SubscriptionReference.
     * Reference of Maxio Advanced Billing Subscription which is connected to this event. Provide
     * `subscription_reference` if you configured `chargify.subscription_reference` as Subscription
     * Identifier in your Event Stream.
     * @return Returns the String
     */
    @JsonGetter("subscription_reference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSubscriptionReference() {
        return subscriptionReference;
    }

    /**
     * Setter for SubscriptionReference.
     * Reference of Maxio Advanced Billing Subscription which is connected to this event. Provide
     * `subscription_reference` if you configured `chargify.subscription_reference` as Subscription
     * Identifier in your Event Stream.
     * @param subscriptionReference Value for String
     */
    @JsonSetter("subscription_reference")
    public void setSubscriptionReference(String subscriptionReference) {
        this.subscriptionReference = subscriptionReference;
    }

    /**
     * Converts this ChargifyEBB into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ChargifyEBB [" + "timestamp=" + timestamp + ", id=" + id + ", createdAt="
                + createdAt + ", uniquenessToken=" + uniquenessToken + ", subscriptionId="
                + subscriptionId + ", subscriptionReference=" + subscriptionReference + "]";
    }

    /**
     * Builds a new {@link ChargifyEBB.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ChargifyEBB.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .timestamp(getTimestamp())
                .id(getId())
                .createdAt(getCreatedAt())
                .uniquenessToken(getUniquenessToken())
                .subscriptionId(getSubscriptionId())
                .subscriptionReference(getSubscriptionReference());
        return builder;
    }

    /**
     * Class to build instances of {@link ChargifyEBB}.
     */
    public static class Builder {
        private String timestamp;
        private String id;
        private String createdAt;
        private String uniquenessToken;
        private Integer subscriptionId;
        private String subscriptionReference;



        /**
         * Setter for timestamp.
         * @param  timestamp  String value for timestamp.
         * @return Builder
         */
        public Builder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
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
         * Setter for uniquenessToken.
         * @param  uniquenessToken  String value for uniquenessToken.
         * @return Builder
         */
        public Builder uniquenessToken(String uniquenessToken) {
            this.uniquenessToken = uniquenessToken;
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
         * Setter for subscriptionReference.
         * @param  subscriptionReference  String value for subscriptionReference.
         * @return Builder
         */
        public Builder subscriptionReference(String subscriptionReference) {
            this.subscriptionReference = subscriptionReference;
            return this;
        }

        /**
         * Builds a new {@link ChargifyEBB} object using the set fields.
         * @return {@link ChargifyEBB}
         */
        public ChargifyEBB build() {
            return new ChargifyEBB(timestamp, id, createdAt, uniquenessToken, subscriptionId,
                    subscriptionReference);
        }
    }
}
