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
 * This is a model class for PaymentMethodPaypalType type.
 */
public class PaymentMethodPaypalType {
    private String email;
    private String type;

    /**
     * Default constructor.
     */
    public PaymentMethodPaypalType() {
        type = "paypal_account";
    }

    /**
     * Initialization constructor.
     * @param  email  String value for email.
     * @param  type  String value for type.
     */
    public PaymentMethodPaypalType(
            String email,
            String type) {
        this.email = email;
        this.type = type;
    }

    /**
     * Getter for Email.
     * @return Returns the String
     */
    @JsonGetter("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Converts this PaymentMethodPaypalType into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentMethodPaypalType [" + "email=" + email + ", type=" + type + "]";
    }

    /**
     * Builds a new {@link PaymentMethodPaypalType.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentMethodPaypalType.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .email(getEmail())
                .type(getType());
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentMethodPaypalType}.
     */
    public static class Builder {
        private String email;
        private String type = "paypal_account";



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
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds a new {@link PaymentMethodPaypalType} object using the set fields.
         * @return {@link PaymentMethodPaypalType}
         */
        public PaymentMethodPaypalType build() {
            return new PaymentMethodPaypalType(email, type);
        }
    }
}
