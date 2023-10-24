/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreateCustomerRequest type.
 */
public class CreateCustomerRequest {
    private CreateCustomer customer;

    /**
     * Default constructor.
     */
    public CreateCustomerRequest() {
    }

    /**
     * Initialization constructor.
     * @param  customer  CreateCustomer value for customer.
     */
    public CreateCustomerRequest(
            CreateCustomer customer) {
        this.customer = customer;
    }

    /**
     * Getter for Customer.
     * @return Returns the CreateCustomer
     */
    @JsonGetter("customer")
    public CreateCustomer getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * @param customer Value for CreateCustomer
     */
    @JsonSetter("customer")
    public void setCustomer(CreateCustomer customer) {
        this.customer = customer;
    }

    /**
     * Converts this CreateCustomerRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateCustomerRequest [" + "customer=" + customer + "]";
    }

    /**
     * Builds a new {@link CreateCustomerRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateCustomerRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(customer);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateCustomerRequest}.
     */
    public static class Builder {
        private CreateCustomer customer;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  customer  CreateCustomer value for customer.
         */
        public Builder(CreateCustomer customer) {
            this.customer = customer;
        }

        /**
         * Setter for customer.
         * @param  customer  CreateCustomer value for customer.
         * @return Builder
         */
        public Builder customer(CreateCustomer customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Builds a new {@link CreateCustomerRequest} object using the set fields.
         * @return {@link CreateCustomerRequest}
         */
        public CreateCustomerRequest build() {
            return new CreateCustomerRequest(customer);
        }
    }
}
