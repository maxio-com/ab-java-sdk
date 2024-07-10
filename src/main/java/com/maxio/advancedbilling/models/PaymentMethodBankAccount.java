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
 * This is a model class for PaymentMethodBankAccount type.
 */
public class PaymentMethodBankAccount
        extends BaseModel {
    private String maskedAccountNumber;
    private String maskedRoutingNumber;
    private InvoiceEventPaymentMethod type;

    /**
     * Default constructor.
     */
    public PaymentMethodBankAccount() {
    }

    /**
     * Initialization constructor.
     * @param  maskedAccountNumber  String value for maskedAccountNumber.
     * @param  maskedRoutingNumber  String value for maskedRoutingNumber.
     * @param  type  InvoiceEventPaymentMethod value for type.
     */
    @JsonCreator
    public PaymentMethodBankAccount(
            @JsonProperty("masked_account_number") String maskedAccountNumber,
            @JsonProperty("masked_routing_number") String maskedRoutingNumber,
            @JsonProperty("type") InvoiceEventPaymentMethod type) {
        this.maskedAccountNumber = maskedAccountNumber;
        this.maskedRoutingNumber = maskedRoutingNumber;
        this.type = type;
    }

    /**
     * Getter for MaskedAccountNumber.
     * @return Returns the String
     */
    @JsonGetter("masked_account_number")
    public String getMaskedAccountNumber() {
        return maskedAccountNumber;
    }

    /**
     * Setter for MaskedAccountNumber.
     * @param maskedAccountNumber Value for String
     */
    @JsonSetter("masked_account_number")
    public void setMaskedAccountNumber(String maskedAccountNumber) {
        this.maskedAccountNumber = maskedAccountNumber;
    }

    /**
     * Getter for MaskedRoutingNumber.
     * @return Returns the String
     */
    @JsonGetter("masked_routing_number")
    public String getMaskedRoutingNumber() {
        return maskedRoutingNumber;
    }

    /**
     * Setter for MaskedRoutingNumber.
     * @param maskedRoutingNumber Value for String
     */
    @JsonSetter("masked_routing_number")
    public void setMaskedRoutingNumber(String maskedRoutingNumber) {
        this.maskedRoutingNumber = maskedRoutingNumber;
    }

    /**
     * Getter for Type.
     * @return Returns the InvoiceEventPaymentMethod
     */
    @JsonGetter("type")
    public InvoiceEventPaymentMethod getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for InvoiceEventPaymentMethod
     */
    @JsonSetter("type")
    public void setType(InvoiceEventPaymentMethod type) {
        this.type = type;
    }

    /**
     * Converts this PaymentMethodBankAccount into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentMethodBankAccount [" + "maskedAccountNumber=" + maskedAccountNumber
                + ", maskedRoutingNumber=" + maskedRoutingNumber + ", type=" + type
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(maskedAccountNumber, maskedRoutingNumber, type);
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentMethodBankAccount}.
     */
    public static class Builder {
        private String maskedAccountNumber;
        private String maskedRoutingNumber;
        private InvoiceEventPaymentMethod type;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  maskedAccountNumber  String value for maskedAccountNumber.
         * @param  maskedRoutingNumber  String value for maskedRoutingNumber.
         * @param  type  InvoiceEventPaymentMethod value for type.
         */
        public Builder(String maskedAccountNumber, String maskedRoutingNumber,
                InvoiceEventPaymentMethod type) {
            this.maskedAccountNumber = maskedAccountNumber;
            this.maskedRoutingNumber = maskedRoutingNumber;
            this.type = type;
        }

        /**
         * Setter for maskedAccountNumber.
         * @param  maskedAccountNumber  String value for maskedAccountNumber.
         * @return Builder
         */
        public Builder maskedAccountNumber(String maskedAccountNumber) {
            this.maskedAccountNumber = maskedAccountNumber;
            return this;
        }

        /**
         * Setter for maskedRoutingNumber.
         * @param  maskedRoutingNumber  String value for maskedRoutingNumber.
         * @return Builder
         */
        public Builder maskedRoutingNumber(String maskedRoutingNumber) {
            this.maskedRoutingNumber = maskedRoutingNumber;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  InvoiceEventPaymentMethod value for type.
         * @return Builder
         */
        public Builder type(InvoiceEventPaymentMethod type) {
            this.type = type;
            return this;
        }

        /**
         * Builds a new {@link PaymentMethodBankAccount} object using the set fields.
         * @return {@link PaymentMethodBankAccount}
         */
        public PaymentMethodBankAccount build() {
            return new PaymentMethodBankAccount(maskedAccountNumber, maskedRoutingNumber, type);
        }
    }
}
