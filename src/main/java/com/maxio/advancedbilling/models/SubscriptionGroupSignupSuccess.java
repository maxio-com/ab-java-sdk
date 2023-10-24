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
 * This is a model class for SubscriptionGroupSignupSuccess type.
 */
public class SubscriptionGroupSignupSuccess {
    private SubscriptionGroupSignupSuccessData subscriptionGroup;
    private Customer customer;

    /**
     * Default constructor.
     */
    public SubscriptionGroupSignupSuccess() {
    }

    /**
     * Initialization constructor.
     * @param  subscriptionGroup  SubscriptionGroupSignupSuccessData value for subscriptionGroup.
     * @param  customer  Customer value for customer.
     */
    @JsonCreator
    public SubscriptionGroupSignupSuccess(
            @JsonProperty("subscription_group") SubscriptionGroupSignupSuccessData subscriptionGroup,
            @JsonProperty("customer") Customer customer) {
        this.subscriptionGroup = subscriptionGroup;
        this.customer = customer;
    }

    /**
     * Getter for SubscriptionGroup.
     * @return Returns the SubscriptionGroupSignupSuccessData
     */
    @JsonGetter("subscription_group")
    public SubscriptionGroupSignupSuccessData getSubscriptionGroup() {
        return subscriptionGroup;
    }

    /**
     * Setter for SubscriptionGroup.
     * @param subscriptionGroup Value for SubscriptionGroupSignupSuccessData
     */
    @JsonSetter("subscription_group")
    public void setSubscriptionGroup(SubscriptionGroupSignupSuccessData subscriptionGroup) {
        this.subscriptionGroup = subscriptionGroup;
    }

    /**
     * Getter for Customer.
     * @return Returns the Customer
     */
    @JsonGetter("customer")
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * @param customer Value for Customer
     */
    @JsonSetter("customer")
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Converts this SubscriptionGroupSignupSuccess into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupSignupSuccess [" + "subscriptionGroup=" + subscriptionGroup
                + ", customer=" + customer + "]";
    }

    /**
     * Builds a new {@link SubscriptionGroupSignupSuccess.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionGroupSignupSuccess.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscriptionGroup, customer);
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupSignupSuccess}.
     */
    public static class Builder {
        private SubscriptionGroupSignupSuccessData subscriptionGroup;
        private Customer customer;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  subscriptionGroup  SubscriptionGroupSignupSuccessData value for
         *         subscriptionGroup.
         * @param  customer  Customer value for customer.
         */
        public Builder(SubscriptionGroupSignupSuccessData subscriptionGroup, Customer customer) {
            this.subscriptionGroup = subscriptionGroup;
            this.customer = customer;
        }

        /**
         * Setter for subscriptionGroup.
         * @param  subscriptionGroup  SubscriptionGroupSignupSuccessData value for
         *         subscriptionGroup.
         * @return Builder
         */
        public Builder subscriptionGroup(SubscriptionGroupSignupSuccessData subscriptionGroup) {
            this.subscriptionGroup = subscriptionGroup;
            return this;
        }

        /**
         * Setter for customer.
         * @param  customer  Customer value for customer.
         * @return Builder
         */
        public Builder customer(Customer customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroupSignupSuccess} object using the set fields.
         * @return {@link SubscriptionGroupSignupSuccess}
         */
        public SubscriptionGroupSignupSuccess build() {
            return new SubscriptionGroupSignupSuccess(subscriptionGroup, customer);
        }
    }
}
