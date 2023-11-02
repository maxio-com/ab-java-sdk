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
 * This is a model class for Errors type.
 */
public class Errors {
    private String customer;

    /**
     * Default constructor.
     */
    public Errors() {
    }

    /**
     * Initialization constructor.
     * @param  customer  String value for customer.
     */
    public Errors(
            String customer) {
        this.customer = customer;
    }

    /**
     * Getter for Customer.
     * @return Returns the String
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Converts this Errors into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Errors [" + "customer=" + customer + "]";
    }

    /**
     * Builds a new {@link Errors.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Errors.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .customer(getCustomer());
        return builder;
    }

    /**
     * Class to build instances of {@link Errors}.
     */
    public static class Builder {
        private String customer;



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
         * Builds a new {@link Errors} object using the set fields.
         * @return {@link Errors}
         */
        public Errors build() {
            return new Errors(customer);
        }
    }
}
