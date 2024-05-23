/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for CustomerResponse type.
 */
public class CustomerResponse
        extends BaseModel {
    private Customer1 customer;

    /**
     * Default constructor.
     */
    public CustomerResponse() {
    }

    /**
     * Initialization constructor.
     * @param  customer  Customer1 value for customer.
     */
    public CustomerResponse(
            Customer1 customer) {
        this.customer = customer;
    }

    /**
     * Getter for Customer.
     * @return Returns the Customer1
     */
    @JsonGetter("customer")
    public Customer1 getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * @param customer Value for Customer1
     */
    @JsonSetter("customer")
    public void setCustomer(Customer1 customer) {
        this.customer = customer;
    }

    /**
     * Converts this CustomerResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomerResponse [" + "customer=" + customer + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CustomerResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomerResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(customer);
        return builder;
    }

    /**
     * Class to build instances of {@link CustomerResponse}.
     */
    public static class Builder {
        private Customer1 customer;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  customer  Customer1 value for customer.
         */
        public Builder(Customer1 customer) {
            this.customer = customer;
        }

        /**
         * Setter for customer.
         * @param  customer  Customer1 value for customer.
         * @return Builder
         */
        public Builder customer(Customer1 customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Builds a new {@link CustomerResponse} object using the set fields.
         * @return {@link CustomerResponse}
         */
        public CustomerResponse build() {
            return new CustomerResponse(customer);
        }
    }
}
