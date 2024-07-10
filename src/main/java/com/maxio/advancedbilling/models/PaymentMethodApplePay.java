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
 * This is a model class for PaymentMethodApplePay type.
 */
public class PaymentMethodApplePay
        extends BaseModel {
    private InvoiceEventPaymentMethod type;

    /**
     * Default constructor.
     */
    public PaymentMethodApplePay() {
    }

    /**
     * Initialization constructor.
     * @param  type  InvoiceEventPaymentMethod value for type.
     */
    @JsonCreator
    public PaymentMethodApplePay(
            @JsonProperty("type") InvoiceEventPaymentMethod type) {
        this.type = type;
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
     * Converts this PaymentMethodApplePay into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentMethodApplePay [" + "type=" + type + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type);
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentMethodApplePay}.
     */
    public static class Builder {
        private InvoiceEventPaymentMethod type;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  InvoiceEventPaymentMethod value for type.
         */
        public Builder(InvoiceEventPaymentMethod type) {
            this.type = type;
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
         * Builds a new {@link PaymentMethodApplePay} object using the set fields.
         * @return {@link PaymentMethodApplePay}
         */
        public PaymentMethodApplePay build() {
            return new PaymentMethodApplePay(type);
        }
    }
}
