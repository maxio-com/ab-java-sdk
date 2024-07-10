/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for CustomerChange type.
 */
public class CustomerChange
        extends BaseModel {
    private OptionalNullable<CustomerPayerChange> payer;
    private OptionalNullable<AddressChange> shippingAddress;
    private OptionalNullable<AddressChange> billingAddress;
    private OptionalNullable<CustomerCustomFieldsChange> customFields;

    /**
     * Default constructor.
     */
    public CustomerChange() {
    }

    /**
     * Initialization constructor.
     * @param  payer  CustomerPayerChange value for payer.
     * @param  shippingAddress  AddressChange value for shippingAddress.
     * @param  billingAddress  AddressChange value for billingAddress.
     * @param  customFields  CustomerCustomFieldsChange value for customFields.
     */
    public CustomerChange(
            CustomerPayerChange payer,
            AddressChange shippingAddress,
            AddressChange billingAddress,
            CustomerCustomFieldsChange customFields) {
        this.payer = OptionalNullable.of(payer);
        this.shippingAddress = OptionalNullable.of(shippingAddress);
        this.billingAddress = OptionalNullable.of(billingAddress);
        this.customFields = OptionalNullable.of(customFields);
    }

    /**
     * Initialization constructor.
     * @param  payer  CustomerPayerChange value for payer.
     * @param  shippingAddress  AddressChange value for shippingAddress.
     * @param  billingAddress  AddressChange value for billingAddress.
     * @param  customFields  CustomerCustomFieldsChange value for customFields.
     */

    protected CustomerChange(OptionalNullable<CustomerPayerChange> payer,
            OptionalNullable<AddressChange> shippingAddress,
            OptionalNullable<AddressChange> billingAddress,
            OptionalNullable<CustomerCustomFieldsChange> customFields) {
        this.payer = payer;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.customFields = customFields;
    }

    /**
     * Internal Getter for Payer.
     * @return Returns the Internal CustomerPayerChange
     */
    @JsonGetter("payer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<CustomerPayerChange> internalGetPayer() {
        return this.payer;
    }

    /**
     * Getter for Payer.
     * @return Returns the CustomerPayerChange
     */
    public CustomerPayerChange getPayer() {
        return OptionalNullable.getFrom(payer);
    }

    /**
     * Setter for Payer.
     * @param payer Value for CustomerPayerChange
     */
    @JsonSetter("payer")
    public void setPayer(CustomerPayerChange payer) {
        this.payer = OptionalNullable.of(payer);
    }

    /**
     * UnSetter for Payer.
     */
    public void unsetPayer() {
        payer = null;
    }

    /**
     * Internal Getter for ShippingAddress.
     * @return Returns the Internal AddressChange
     */
    @JsonGetter("shipping_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<AddressChange> internalGetShippingAddress() {
        return this.shippingAddress;
    }

    /**
     * Getter for ShippingAddress.
     * @return Returns the AddressChange
     */
    public AddressChange getShippingAddress() {
        return OptionalNullable.getFrom(shippingAddress);
    }

    /**
     * Setter for ShippingAddress.
     * @param shippingAddress Value for AddressChange
     */
    @JsonSetter("shipping_address")
    public void setShippingAddress(AddressChange shippingAddress) {
        this.shippingAddress = OptionalNullable.of(shippingAddress);
    }

    /**
     * UnSetter for ShippingAddress.
     */
    public void unsetShippingAddress() {
        shippingAddress = null;
    }

    /**
     * Internal Getter for BillingAddress.
     * @return Returns the Internal AddressChange
     */
    @JsonGetter("billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<AddressChange> internalGetBillingAddress() {
        return this.billingAddress;
    }

    /**
     * Getter for BillingAddress.
     * @return Returns the AddressChange
     */
    public AddressChange getBillingAddress() {
        return OptionalNullable.getFrom(billingAddress);
    }

    /**
     * Setter for BillingAddress.
     * @param billingAddress Value for AddressChange
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(AddressChange billingAddress) {
        this.billingAddress = OptionalNullable.of(billingAddress);
    }

    /**
     * UnSetter for BillingAddress.
     */
    public void unsetBillingAddress() {
        billingAddress = null;
    }

    /**
     * Internal Getter for CustomFields.
     * @return Returns the Internal CustomerCustomFieldsChange
     */
    @JsonGetter("custom_fields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<CustomerCustomFieldsChange> internalGetCustomFields() {
        return this.customFields;
    }

    /**
     * Getter for CustomFields.
     * @return Returns the CustomerCustomFieldsChange
     */
    public CustomerCustomFieldsChange getCustomFields() {
        return OptionalNullable.getFrom(customFields);
    }

    /**
     * Setter for CustomFields.
     * @param customFields Value for CustomerCustomFieldsChange
     */
    @JsonSetter("custom_fields")
    public void setCustomFields(CustomerCustomFieldsChange customFields) {
        this.customFields = OptionalNullable.of(customFields);
    }

    /**
     * UnSetter for CustomFields.
     */
    public void unsetCustomFields() {
        customFields = null;
    }

    /**
     * Converts this CustomerChange into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomerChange [" + "payer=" + payer + ", shippingAddress=" + shippingAddress
                + ", billingAddress=" + billingAddress + ", customFields=" + customFields
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.payer = internalGetPayer();
        builder.shippingAddress = internalGetShippingAddress();
        builder.billingAddress = internalGetBillingAddress();
        builder.customFields = internalGetCustomFields();
        return builder;
    }

    /**
     * Class to build instances of {@link CustomerChange}.
     */
    public static class Builder {
        private OptionalNullable<CustomerPayerChange> payer;
        private OptionalNullable<AddressChange> shippingAddress;
        private OptionalNullable<AddressChange> billingAddress;
        private OptionalNullable<CustomerCustomFieldsChange> customFields;



        /**
         * Setter for payer.
         * @param  payer  CustomerPayerChange value for payer.
         * @return Builder
         */
        public Builder payer(CustomerPayerChange payer) {
            this.payer = OptionalNullable.of(payer);
            return this;
        }

        /**
         * UnSetter for payer.
         * @return Builder
         */
        public Builder unsetPayer() {
            payer = null;
            return this;
        }

        /**
         * Setter for shippingAddress.
         * @param  shippingAddress  AddressChange value for shippingAddress.
         * @return Builder
         */
        public Builder shippingAddress(AddressChange shippingAddress) {
            this.shippingAddress = OptionalNullable.of(shippingAddress);
            return this;
        }

        /**
         * UnSetter for shippingAddress.
         * @return Builder
         */
        public Builder unsetShippingAddress() {
            shippingAddress = null;
            return this;
        }

        /**
         * Setter for billingAddress.
         * @param  billingAddress  AddressChange value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(AddressChange billingAddress) {
            this.billingAddress = OptionalNullable.of(billingAddress);
            return this;
        }

        /**
         * UnSetter for billingAddress.
         * @return Builder
         */
        public Builder unsetBillingAddress() {
            billingAddress = null;
            return this;
        }

        /**
         * Setter for customFields.
         * @param  customFields  CustomerCustomFieldsChange value for customFields.
         * @return Builder
         */
        public Builder customFields(CustomerCustomFieldsChange customFields) {
            this.customFields = OptionalNullable.of(customFields);
            return this;
        }

        /**
         * UnSetter for customFields.
         * @return Builder
         */
        public Builder unsetCustomFields() {
            customFields = null;
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
