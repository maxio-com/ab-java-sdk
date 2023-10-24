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
 * This is a model class for CustomerError type.
 */
public class CustomerError {
    private String customer;

    /**
     * Default constructor.
     */
    public CustomerError() {
    }

    /**
     * Initialization constructor.
     * @param  customer  String value for customer.
     */
    public CustomerError(
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
     * Converts this CustomerError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomerError [" + "customer=" + customer + "]";
    }

    /**
     * Builds a new {@link CustomerError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomerError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .customer(getCustomer());
        return builder;
    }

    /**
     * Class to build instances of {@link CustomerError}.
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
         * Builds a new {@link CustomerError} object using the set fields.
         * @return {@link CustomerError}
         */
        public CustomerError build() {
            return new CustomerError(customer);
        }
    }
}
