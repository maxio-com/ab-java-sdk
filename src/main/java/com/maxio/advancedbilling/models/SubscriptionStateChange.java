/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SubscriptionStateChange type.
 */
public class SubscriptionStateChange {
    private String previousSubscriptionState;
    private String newSubscriptionState;

    /**
     * Default constructor.
     */
    public SubscriptionStateChange() {
    }

    /**
     * Initialization constructor.
     * @param  previousSubscriptionState  String value for previousSubscriptionState.
     * @param  newSubscriptionState  String value for newSubscriptionState.
     */
    @JsonCreator
    public SubscriptionStateChange(
            @JsonProperty("previous_subscription_state") String previousSubscriptionState,
            @JsonProperty("new_subscription_state") String newSubscriptionState) {
        this.previousSubscriptionState = previousSubscriptionState;
        this.newSubscriptionState = newSubscriptionState;
    }

    /**
     * Getter for PreviousSubscriptionState.
     * @return Returns the String
     */
    @JsonGetter("previous_subscription_state")
    public String getPreviousSubscriptionState() {
        return previousSubscriptionState;
    }

    /**
     * Setter for PreviousSubscriptionState.
     * @param previousSubscriptionState Value for String
     */
    @JsonSetter("previous_subscription_state")
    public void setPreviousSubscriptionState(String previousSubscriptionState) {
        this.previousSubscriptionState = previousSubscriptionState;
    }

    /**
     * Getter for NewSubscriptionState.
     * @return Returns the String
     */
    @JsonGetter("new_subscription_state")
    public String getNewSubscriptionState() {
        return newSubscriptionState;
    }

    /**
     * Setter for NewSubscriptionState.
     * @param newSubscriptionState Value for String
     */
    @JsonSetter("new_subscription_state")
    public void setNewSubscriptionState(String newSubscriptionState) {
        this.newSubscriptionState = newSubscriptionState;
    }

    /**
     * Converts this SubscriptionStateChange into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionStateChange [" + "previousSubscriptionState="
                + previousSubscriptionState + ", newSubscriptionState=" + newSubscriptionState
                + "]";
    }

    /**
     * Builds a new {@link SubscriptionStateChange.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionStateChange.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(previousSubscriptionState, newSubscriptionState);
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionStateChange}.
     */
    public static class Builder {
        private String previousSubscriptionState;
        private String newSubscriptionState;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  previousSubscriptionState  String value for previousSubscriptionState.
         * @param  newSubscriptionState  String value for newSubscriptionState.
         */
        public Builder(String previousSubscriptionState, String newSubscriptionState) {
            this.previousSubscriptionState = previousSubscriptionState;
            this.newSubscriptionState = newSubscriptionState;
        }

        /**
         * Setter for previousSubscriptionState.
         * @param  previousSubscriptionState  String value for previousSubscriptionState.
         * @return Builder
         */
        public Builder previousSubscriptionState(String previousSubscriptionState) {
            this.previousSubscriptionState = previousSubscriptionState;
            return this;
        }

        /**
         * Setter for newSubscriptionState.
         * @param  newSubscriptionState  String value for newSubscriptionState.
         * @return Builder
         */
        public Builder newSubscriptionState(String newSubscriptionState) {
            this.newSubscriptionState = newSubscriptionState;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionStateChange} object using the set fields.
         * @return {@link SubscriptionStateChange}
         */
        public SubscriptionStateChange build() {
            return new SubscriptionStateChange(previousSubscriptionState, newSubscriptionState);
        }
    }
}
