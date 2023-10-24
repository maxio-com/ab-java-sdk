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
 * This is a model class for PaymentMethodApplePayType type.
 */
public class PaymentMethodApplePayType {
    private String type;

    /**
     * Default constructor.
     */
    public PaymentMethodApplePayType() {
        type = "apple_pay";
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     */
    public PaymentMethodApplePayType(
            String type) {
        this.type = type;
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
     * Converts this PaymentMethodApplePayType into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentMethodApplePayType [" + "type=" + type + "]";
    }

    /**
     * Builds a new {@link PaymentMethodApplePayType.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentMethodApplePayType.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .type(getType());
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentMethodApplePayType}.
     */
    public static class Builder {
        private String type = "apple_pay";



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
         * Builds a new {@link PaymentMethodApplePayType} object using the set fields.
         * @return {@link PaymentMethodApplePayType}
         */
        public PaymentMethodApplePayType build() {
            return new PaymentMethodApplePayType(type);
        }
    }
}
