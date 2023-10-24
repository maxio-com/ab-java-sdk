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
 * This is a model class for SubscriptionComponentSubscription type.
 */
public class SubscriptionComponentSubscription {
    private String state;
    private String updatedAt;

    /**
     * Default constructor.
     */
    public SubscriptionComponentSubscription() {
    }

    /**
     * Initialization constructor.
     * @param  state  String value for state.
     * @param  updatedAt  String value for updatedAt.
     */
    public SubscriptionComponentSubscription(
            String state,
            String updatedAt) {
        this.state = state;
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for State.
     * @return Returns the String
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for String
     */
    @JsonSetter("state")
    public void setState(String state) {
        this.state = state;
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
     * Converts this SubscriptionComponentSubscription into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionComponentSubscription [" + "state=" + state + ", updatedAt=" + updatedAt
                + "]";
    }

    /**
     * Builds a new {@link SubscriptionComponentSubscription.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionComponentSubscription.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .state(getState())
                .updatedAt(getUpdatedAt());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionComponentSubscription}.
     */
    public static class Builder {
        private String state;
        private String updatedAt;



        /**
         * Setter for state.
         * @param  state  String value for state.
         * @return Builder
         */
        public Builder state(String state) {
            this.state = state;
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
         * Builds a new {@link SubscriptionComponentSubscription} object using the set fields.
         * @return {@link SubscriptionComponentSubscription}
         */
        public SubscriptionComponentSubscription build() {
            return new SubscriptionComponentSubscription(state, updatedAt);
        }
    }
}
