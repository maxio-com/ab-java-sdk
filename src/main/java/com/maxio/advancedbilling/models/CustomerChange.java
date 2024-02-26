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
import com.maxio.advancedbilling.models.containers.CustomerChangeBillingAddress;
import com.maxio.advancedbilling.models.containers.CustomerChangeCustomFields;
import com.maxio.advancedbilling.models.containers.CustomerChangePayer;
import com.maxio.advancedbilling.models.containers.CustomerChangeShippingAddress;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for CustomerChange type.
 */
public class CustomerChange
        extends BaseModel {
    private OptionalNullable<CustomerChangePayer> payer;
    private OptionalNullable<CustomerChangeShippingAddress> shippingAddress;
    private OptionalNullable<CustomerChangeBillingAddress> billingAddress;
    private OptionalNullable<CustomerChangeCustomFields> customFields;

    /**
     * Default constructor.
     */
    public CustomerChange() {
    }

    /**
     * Initialization constructor.
     * @param  payer  CustomerChangePayer value for payer.
     * @param  shippingAddress  CustomerChangeShippingAddress value for shippingAddress.
     * @param  billingAddress  CustomerChangeBillingAddress value for billingAddress.
     * @param  customFields  CustomerChangeCustomFields value for customFields.
     */
    public CustomerChange(
            CustomerChangePayer payer,
            CustomerChangeShippingAddress shippingAddress,
            CustomerChangeBillingAddress billingAddress,
            CustomerChangeCustomFields customFields) {
        this.payer = OptionalNullable.of(payer);
        this.shippingAddress = OptionalNullable.of(shippingAddress);
        this.billingAddress = OptionalNullable.of(billingAddress);
        this.customFields = OptionalNullable.of(customFields);
    }

    /**
     * Initialization constructor.
     * @param  payer  CustomerChangePayer value for payer.
     * @param  shippingAddress  CustomerChangeShippingAddress value for shippingAddress.
     * @param  billingAddress  CustomerChangeBillingAddress value for billingAddress.
     * @param  customFields  CustomerChangeCustomFields value for customFields.
     */

    protected CustomerChange(OptionalNullable<CustomerChangePayer> payer,
            OptionalNullable<CustomerChangeShippingAddress> shippingAddress,
            OptionalNullable<CustomerChangeBillingAddress> billingAddress,
            OptionalNullable<CustomerChangeCustomFields> customFields) {
        this.payer = payer;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.customFields = customFields;
    }

    /**
     * Internal Getter for Payer.
     * @return Returns the Internal CustomerChangePayer
     */
    @JsonGetter("payer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<CustomerChangePayer> internalGetPayer() {
        return this.payer;
    }

    /**
     * Getter for Payer.
     * @return Returns the CustomerChangePayer
     */
    public CustomerChangePayer getPayer() {
        return OptionalNullable.getFrom(payer);
    }

    /**
     * Setter for Payer.
     * @param payer Value for CustomerChangePayer
     */
    @JsonSetter("payer")
    public void setPayer(CustomerChangePayer payer) {
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
     * @return Returns the Internal CustomerChangeShippingAddress
     */
    @JsonGetter("shipping_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<CustomerChangeShippingAddress> internalGetShippingAddress() {
        return this.shippingAddress;
    }

    /**
     * Getter for ShippingAddress.
     * @return Returns the CustomerChangeShippingAddress
     */
    public CustomerChangeShippingAddress getShippingAddress() {
        return OptionalNullable.getFrom(shippingAddress);
    }

    /**
     * Setter for ShippingAddress.
     * @param shippingAddress Value for CustomerChangeShippingAddress
     */
    @JsonSetter("shipping_address")
    public void setShippingAddress(CustomerChangeShippingAddress shippingAddress) {
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
     * @return Returns the Internal CustomerChangeBillingAddress
     */
    @JsonGetter("billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<CustomerChangeBillingAddress> internalGetBillingAddress() {
        return this.billingAddress;
    }

    /**
     * Getter for BillingAddress.
     * @return Returns the CustomerChangeBillingAddress
     */
    public CustomerChangeBillingAddress getBillingAddress() {
        return OptionalNullable.getFrom(billingAddress);
    }

    /**
     * Setter for BillingAddress.
     * @param billingAddress Value for CustomerChangeBillingAddress
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(CustomerChangeBillingAddress billingAddress) {
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
     * @return Returns the Internal CustomerChangeCustomFields
     */
    @JsonGetter("custom_fields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<CustomerChangeCustomFields> internalGetCustomFields() {
        return this.customFields;
    }

    /**
     * Getter for CustomFields.
     * @return Returns the CustomerChangeCustomFields
     */
    public CustomerChangeCustomFields getCustomFields() {
        return OptionalNullable.getFrom(customFields);
    }

    /**
     * Setter for CustomFields.
     * @param customFields Value for CustomerChangeCustomFields
     */
    @JsonSetter("custom_fields")
    public void setCustomFields(CustomerChangeCustomFields customFields) {
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
     * Builds a new {@link CustomerChange.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomerChange.Builder} object
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
        private OptionalNullable<CustomerChangePayer> payer;
        private OptionalNullable<CustomerChangeShippingAddress> shippingAddress;
        private OptionalNullable<CustomerChangeBillingAddress> billingAddress;
        private OptionalNullable<CustomerChangeCustomFields> customFields;



        /**
         * Setter for payer.
         * @param  payer  CustomerChangePayer value for payer.
         * @return Builder
         */
        public Builder payer(CustomerChangePayer payer) {
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
         * @param  shippingAddress  CustomerChangeShippingAddress value for shippingAddress.
         * @return Builder
         */
        public Builder shippingAddress(CustomerChangeShippingAddress shippingAddress) {
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
         * @param  billingAddress  CustomerChangeBillingAddress value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(CustomerChangeBillingAddress billingAddress) {
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
         * @param  customFields  CustomerChangeCustomFields value for customFields.
         * @return Builder
         */
        public Builder customFields(CustomerChangeCustomFields customFields) {
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
