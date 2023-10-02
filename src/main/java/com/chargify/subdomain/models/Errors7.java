/*
 * MaxioAdvancedBillingFormerlyChargifyAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.chargify.subdomain.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Errors7 type.
 */
public class Errors7 {
    private Object customer;
    private Object paymentProfile;
    private Object subscriptions;

    /**
     * Default constructor.
     */
    public Errors7() {
    }

    /**
     * Initialization constructor.
     * @param  customer  Object value for customer.
     * @param  paymentProfile  Object value for paymentProfile.
     * @param  subscriptions  Object value for subscriptions.
     */
    public Errors7(
            Object customer,
            Object paymentProfile,
            Object subscriptions) {
        this.customer = customer;
        this.paymentProfile = paymentProfile;
        this.subscriptions = subscriptions;
    }

    /**
     * Getter for Customer.
     * @return Returns the Object
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * @param customer Value for Object
     */
    @JsonSetter("customer")
    public void setCustomer(Object customer) {
        this.customer = customer;
    }

    /**
     * Getter for PaymentProfile.
     * @return Returns the Object
     */
    @JsonGetter("payment_profile")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getPaymentProfile() {
        return paymentProfile;
    }

    /**
     * Setter for PaymentProfile.
     * @param paymentProfile Value for Object
     */
    @JsonSetter("payment_profile")
    public void setPaymentProfile(Object paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    /**
     * Getter for Subscriptions.
     * @return Returns the Object
     */
    @JsonGetter("subscriptions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getSubscriptions() {
        return subscriptions;
    }

    /**
     * Setter for Subscriptions.
     * @param subscriptions Value for Object
     */
    @JsonSetter("subscriptions")
    public void setSubscriptions(Object subscriptions) {
        this.subscriptions = subscriptions;
    }

    /**
     * Converts this Errors7 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Errors7 [" + "customer=" + customer + ", paymentProfile=" + paymentProfile
                + ", subscriptions=" + subscriptions + "]";
    }

    /**
     * Builds a new {@link Errors7.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Errors7.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .customer(getCustomer())
                .paymentProfile(getPaymentProfile())
                .subscriptions(getSubscriptions());
        return builder;
    }

    /**
     * Class to build instances of {@link Errors7}.
     */
    public static class Builder {
        private Object customer;
        private Object paymentProfile;
        private Object subscriptions;



        /**
         * Setter for customer.
         * @param  customer  Object value for customer.
         * @return Builder
         */
        public Builder customer(Object customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Setter for paymentProfile.
         * @param  paymentProfile  Object value for paymentProfile.
         * @return Builder
         */
        public Builder paymentProfile(Object paymentProfile) {
            this.paymentProfile = paymentProfile;
            return this;
        }

        /**
         * Setter for subscriptions.
         * @param  subscriptions  Object value for subscriptions.
         * @return Builder
         */
        public Builder subscriptions(Object subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }

        /**
         * Builds a new {@link Errors7} object using the set fields.
         * @return {@link Errors7}
         */
        public Errors7 build() {
            return new Errors7(customer, paymentProfile, subscriptions);
        }
    }
}
