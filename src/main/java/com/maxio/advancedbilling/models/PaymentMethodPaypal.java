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
 * This is a model class for PaymentMethodPaypal type.
 */
public class PaymentMethodPaypal
        extends BaseModel {
    private String email;
    private InvoiceEventPaymentMethod type;

    /**
     * Default constructor.
     */
    public PaymentMethodPaypal() {
    }

    /**
     * Initialization constructor.
     * @param  email  String value for email.
     * @param  type  InvoiceEventPaymentMethod value for type.
     */
    @JsonCreator
    public PaymentMethodPaypal(
            @JsonProperty("email") String email,
            @JsonProperty("type") InvoiceEventPaymentMethod type) {
        this.email = email;
        this.type = type;
    }

    /**
     * Getter for Email.
     * @return Returns the String
     */
    @JsonGetter("email")
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
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
     * Converts this PaymentMethodPaypal into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentMethodPaypal [" + "email=" + email + ", type=" + type
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(email, type);
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentMethodPaypal}.
     */
    public static class Builder {
        private String email;
        private InvoiceEventPaymentMethod type;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  email  String value for email.
         * @param  type  InvoiceEventPaymentMethod value for type.
         */
        public Builder(String email, InvoiceEventPaymentMethod type) {
            this.email = email;
            this.type = type;
        }

        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
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
         * Builds a new {@link PaymentMethodPaypal} object using the set fields.
         * @return {@link PaymentMethodPaypal}
         */
        public PaymentMethodPaypal build() {
            return new PaymentMethodPaypal(email, type);
        }
    }
}
