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
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for SubscriptionGroupSignupEventData type.
 */
public class SubscriptionGroupSignupEventData
        extends BaseModel {
    private SubscriptionGroupSignupFailureData subscriptionGroup;
    private Customer customer;

    /**
     * Default constructor.
     */
    public SubscriptionGroupSignupEventData() {
    }

    /**
     * Initialization constructor.
     * @param  subscriptionGroup  SubscriptionGroupSignupFailureData value for subscriptionGroup.
     * @param  customer  Customer value for customer.
     */
    @JsonCreator
    public SubscriptionGroupSignupEventData(
            @JsonProperty("subscription_group") SubscriptionGroupSignupFailureData subscriptionGroup,
            @JsonProperty("customer") Customer customer) {
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
     * Converts this SubscriptionGroupSignupEventData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupSignupEventData [" + "subscriptionGroup=" + subscriptionGroup
                + ", customer=" + customer + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link SubscriptionGroupSignupEventData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionGroupSignupEventData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscriptionGroup, customer);
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupSignupEventData}.
     */
    public static class Builder {
        private SubscriptionGroupSignupFailureData subscriptionGroup;
        private Customer customer;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  subscriptionGroup  SubscriptionGroupSignupFailureData value for
         *         subscriptionGroup.
         * @param  customer  Customer value for customer.
         */
        public Builder(SubscriptionGroupSignupFailureData subscriptionGroup, Customer customer) {
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
         * @param  customer  Customer value for customer.
         * @return Builder
         */
        public Builder customer(Customer customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroupSignupEventData} object using the set fields.
         * @return {@link SubscriptionGroupSignupEventData}
         */
        public SubscriptionGroupSignupEventData build() {
            return new SubscriptionGroupSignupEventData(subscriptionGroup, customer);
        }
    }
}
