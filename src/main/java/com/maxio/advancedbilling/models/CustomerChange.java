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
 * This is a model class for CustomerChange type.
 */
public class CustomerChange {
    private CustomerPayerChange payer;
    private CustomerShippingAddressChange shippingAddress;
    private CustomerBillingAddressChange billingAddress;
    private CustomerCustomFieldsChange customFields;

    /**
     * Default constructor.
     */
    public CustomerChange() {
    }

    /**
     * Initialization constructor.
     * @param  payer  CustomerPayerChange value for payer.
     * @param  shippingAddress  CustomerShippingAddressChange value for shippingAddress.
     * @param  billingAddress  CustomerBillingAddressChange value for billingAddress.
     * @param  customFields  CustomerCustomFieldsChange value for customFields.
     */
    public CustomerChange(
            CustomerPayerChange payer,
            CustomerShippingAddressChange shippingAddress,
            CustomerBillingAddressChange billingAddress,
            CustomerCustomFieldsChange customFields) {
        this.payer = payer;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.customFields = customFields;
    }

    /**
     * Getter for Payer.
     * @return Returns the CustomerPayerChange
     */
    @JsonGetter("payer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomerPayerChange getPayer() {
        return payer;
    }

    /**
     * Setter for Payer.
     * @param payer Value for CustomerPayerChange
     */
    @JsonSetter("payer")
    public void setPayer(CustomerPayerChange payer) {
        this.payer = payer;
    }

    /**
     * Getter for ShippingAddress.
     * @return Returns the CustomerShippingAddressChange
     */
    @JsonGetter("shipping_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomerShippingAddressChange getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Setter for ShippingAddress.
     * @param shippingAddress Value for CustomerShippingAddressChange
     */
    @JsonSetter("shipping_address")
    public void setShippingAddress(CustomerShippingAddressChange shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * Getter for BillingAddress.
     * @return Returns the CustomerBillingAddressChange
     */
    @JsonGetter("billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomerBillingAddressChange getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * @param billingAddress Value for CustomerBillingAddressChange
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(CustomerBillingAddressChange billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Getter for CustomFields.
     * @return Returns the CustomerCustomFieldsChange
     */
    @JsonGetter("custom_fields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomerCustomFieldsChange getCustomFields() {
        return customFields;
    }

    /**
     * Setter for CustomFields.
     * @param customFields Value for CustomerCustomFieldsChange
     */
    @JsonSetter("custom_fields")
    public void setCustomFields(CustomerCustomFieldsChange customFields) {
        this.customFields = customFields;
    }

    /**
     * Converts this CustomerChange into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomerChange [" + "payer=" + payer + ", shippingAddress=" + shippingAddress
                + ", billingAddress=" + billingAddress + ", customFields=" + customFields + "]";
    }

    /**
     * Builds a new {@link CustomerChange.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomerChange.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .payer(getPayer())
                .shippingAddress(getShippingAddress())
                .billingAddress(getBillingAddress())
                .customFields(getCustomFields());
        return builder;
    }

    /**
     * Class to build instances of {@link CustomerChange}.
     */
    public static class Builder {
        private CustomerPayerChange payer;
        private CustomerShippingAddressChange shippingAddress;
        private CustomerBillingAddressChange billingAddress;
        private CustomerCustomFieldsChange customFields;



        /**
         * Setter for payer.
         * @param  payer  CustomerPayerChange value for payer.
         * @return Builder
         */
        public Builder payer(CustomerPayerChange payer) {
            this.payer = payer;
            return this;
        }

        /**
         * Setter for shippingAddress.
         * @param  shippingAddress  CustomerShippingAddressChange value for shippingAddress.
         * @return Builder
         */
        public Builder shippingAddress(CustomerShippingAddressChange shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        /**
         * Setter for billingAddress.
         * @param  billingAddress  CustomerBillingAddressChange value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(CustomerBillingAddressChange billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        /**
         * Setter for customFields.
         * @param  customFields  CustomerCustomFieldsChange value for customFields.
         * @return Builder
         */
        public Builder customFields(CustomerCustomFieldsChange customFields) {
            this.customFields = customFields;
            return this;
        }

        /**
         * Builds a new {@link CustomerChange} object using the set fields.
         * @return {@link CustomerChange}
         */
        public CustomerChange build() {
            return new CustomerChange(payer, shippingAddress, billingAddress, customFields);
        }
    }
}
