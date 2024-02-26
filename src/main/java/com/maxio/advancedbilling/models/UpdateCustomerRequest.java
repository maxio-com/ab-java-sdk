/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UpdateCustomerRequest type.
 */
public class UpdateCustomerRequest {
    private UpdateCustomer customer;

    /**
     * Default constructor.
     */
    public UpdateCustomerRequest() {
    }

    /**
     * Initialization constructor.
     * @param  customer  UpdateCustomer value for customer.
     */
    public UpdateCustomerRequest(
            UpdateCustomer customer) {
        this.customer = customer;
    }

    /**
     * Getter for Customer.
     * @return Returns the UpdateCustomer
     */
    @JsonGetter("customer")
    public UpdateCustomer getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * @param customer Value for UpdateCustomer
     */
    @JsonSetter("customer")
    public void setCustomer(UpdateCustomer customer) {
        this.customer = customer;
    }

    /**
     * Converts this UpdateCustomerRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateCustomerRequest [" + "customer=" + customer + "]";
    }

    /**
     * Builds a new {@link UpdateCustomerRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateCustomerRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(customer);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateCustomerRequest}.
     */
    public static class Builder {
        private UpdateCustomer customer;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  customer  UpdateCustomer value for customer.
         */
        public Builder(UpdateCustomer customer) {
            this.customer = customer;
        }

        /**
         * Setter for customer.
         * @param  customer  UpdateCustomer value for customer.
         * @return Builder
         */
        public Builder customer(UpdateCustomer customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Builds a new {@link UpdateCustomerRequest} object using the set fields.
         * @return {@link UpdateCustomerRequest}
         */
        public UpdateCustomerRequest build() {
            return new UpdateCustomerRequest(customer);
        }
    }
}
