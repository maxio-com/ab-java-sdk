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
 * This is a model class for SubscriptionGroupSignupFailure type.
 */
public class SubscriptionGroupSignupFailure {
    private SubscriptionGroupSignupFailureData subscriptionGroup;
    private String customer;

    /**
     * Default constructor.
     */
    public SubscriptionGroupSignupFailure() {
    }

    /**
     * Initialization constructor.
     * @param  subscriptionGroup  SubscriptionGroupSignupFailureData value for subscriptionGroup.
     * @param  customer  String value for customer.
     */
    @JsonCreator
    public SubscriptionGroupSignupFailure(
            @JsonProperty("subscription_group") SubscriptionGroupSignupFailureData subscriptionGroup,
            @JsonProperty("customer") String customer) {
        this.subscriptionGroup = subscriptionGroup;
        this.customer = customer;
    }

    /**
     * Getter for SubscriptionGroup.
     * @return Returns the SubscriptionGroupSignupFailureData
     */
    @JsonGetter("subscription_group")
    public SubscriptionGroupSignupFailureData getSubscriptionGroup() {
        return subscriptionGroup;
    }

    /**
     * Setter for SubscriptionGroup.
     * @param subscriptionGroup Value for SubscriptionGroupSignupFailureData
     */
    @JsonSetter("subscription_group")
    public void setSubscriptionGroup(SubscriptionGroupSignupFailureData subscriptionGroup) {
        this.subscriptionGroup = subscriptionGroup;
    }

    /**
     * Getter for Customer.
     * @return Returns the String
     */
    @JsonGetter("customer")
    public String getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * @param customer Value for String
     */
    @JsonSetter("customer")
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * Converts this SubscriptionGroupSignupFailure into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupSignupFailure [" + "subscriptionGroup=" + subscriptionGroup
                + ", customer=" + customer + "]";
    }

    /**
     * Builds a new {@link SubscriptionGroupSignupFailure.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionGroupSignupFailure.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscriptionGroup, customer);
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupSignupFailure}.
     */
    public static class Builder {
        private SubscriptionGroupSignupFailureData subscriptionGroup;
        private String customer;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  subscriptionGroup  SubscriptionGroupSignupFailureData value for
         *         subscriptionGroup.
         * @param  customer  String value for customer.
         */
        public Builder(SubscriptionGroupSignupFailureData subscriptionGroup, String customer) {
            this.subscriptionGroup = subscriptionGroup;
            this.customer = customer;
        }

        /**
         * Setter for subscriptionGroup.
         * @param  subscriptionGroup  SubscriptionGroupSignupFailureData value for
         *         subscriptionGroup.
         * @return Builder
         */
        public Builder subscriptionGroup(SubscriptionGroupSignupFailureData subscriptionGroup) {
            this.subscriptionGroup = subscriptionGroup;
            return this;
        }

        /**
         * Setter for customer.
         * @param  customer  String value for customer.
         * @return Builder
         */
        public Builder customer(String customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroupSignupFailure} object using the set fields.
         * @return {@link SubscriptionGroupSignupFailure}
         */
        public SubscriptionGroupSignupFailure build() {
            return new SubscriptionGroupSignupFailure(subscriptionGroup, customer);
        }
    }
}
