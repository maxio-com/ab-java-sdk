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
 * This is a model class for PaymentMethodBankAccountType type.
 */
public class PaymentMethodBankAccountType {
    private String maskedAccountNumber;
    private String maskedRoutingNumber;
    private String type;

    /**
     * Default constructor.
     */
    public PaymentMethodBankAccountType() {
        type = "bank_account";
    }

    /**
     * Initialization constructor.
     * @param  maskedAccountNumber  String value for maskedAccountNumber.
     * @param  maskedRoutingNumber  String value for maskedRoutingNumber.
     * @param  type  String value for type.
     */
    public PaymentMethodBankAccountType(
            String maskedAccountNumber,
            String maskedRoutingNumber,
            String type) {
        this.maskedAccountNumber = maskedAccountNumber;
        this.maskedRoutingNumber = maskedRoutingNumber;
        this.type = type;
    }

    /**
     * Getter for MaskedAccountNumber.
     * @return Returns the String
     */
    @JsonGetter("masked_account_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * @return Returns the String
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Converts this PaymentMethodBankAccountType into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentMethodBankAccountType [" + "maskedAccountNumber=" + maskedAccountNumber
                + ", maskedRoutingNumber=" + maskedRoutingNumber + ", type=" + type + "]";
    }

    /**
     * Builds a new {@link PaymentMethodBankAccountType.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentMethodBankAccountType.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .maskedAccountNumber(getMaskedAccountNumber())
                .maskedRoutingNumber(getMaskedRoutingNumber())
                .type(getType());
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentMethodBankAccountType}.
     */
    public static class Builder {
        private String maskedAccountNumber;
        private String maskedRoutingNumber;
        private String type = "bank_account";



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
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds a new {@link PaymentMethodBankAccountType} object using the set fields.
         * @return {@link PaymentMethodBankAccountType}
         */
        public PaymentMethodBankAccountType build() {
            return new PaymentMethodBankAccountType(maskedAccountNumber, maskedRoutingNumber, type);
        }
    }
}
