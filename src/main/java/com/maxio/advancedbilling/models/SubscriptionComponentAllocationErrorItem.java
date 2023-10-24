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
 * This is a model class for SubscriptionComponentAllocationErrorItem type.
 */
public class SubscriptionComponentAllocationErrorItem {
    private String kind;
    private String message;

    /**
     * Default constructor.
     */
    public SubscriptionComponentAllocationErrorItem() {
    }

    /**
     * Initialization constructor.
     * @param  kind  String value for kind.
     * @param  message  String value for message.
     */
    public SubscriptionComponentAllocationErrorItem(
            String kind,
            String message) {
        this.kind = kind;
        this.message = message;
    }

    /**
     * Getter for Kind.
     * @return Returns the String
     */
    @JsonGetter("kind")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getKind() {
        return kind;
    }

    /**
     * Setter for Kind.
     * @param kind Value for String
     */
    @JsonSetter("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Getter for Message.
     * @return Returns the String
     */
    @JsonGetter("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Converts this SubscriptionComponentAllocationErrorItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionComponentAllocationErrorItem [" + "kind=" + kind + ", message="
                + message + "]";
    }

    /**
     * Builds a new {@link SubscriptionComponentAllocationErrorItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionComponentAllocationErrorItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .kind(getKind())
                .message(getMessage());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionComponentAllocationErrorItem}.
     */
    public static class Builder {
        private String kind;
        private String message;



        /**
         * Setter for kind.
         * @param  kind  String value for kind.
         * @return Builder
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionComponentAllocationErrorItem} object using the set
         * fields.
         * @return {@link SubscriptionComponentAllocationErrorItem}
         */
        public SubscriptionComponentAllocationErrorItem build() {
            return new SubscriptionComponentAllocationErrorItem(kind, message);
        }
    }
}
