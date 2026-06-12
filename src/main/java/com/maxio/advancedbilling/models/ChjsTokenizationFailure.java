/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for ChjsTokenizationFailure type.
 */
public class ChjsTokenizationFailure
        extends BaseModel {
    private String errors;
    private PaymentProfileParams paymentProfileParams;

    /**
     * Default constructor.
     */
    public ChjsTokenizationFailure() {
    }

    /**
     * Initialization constructor.
     * @param  errors  String value for errors.
     * @param  paymentProfileParams  PaymentProfileParams value for paymentProfileParams.
     */
    public ChjsTokenizationFailure(
            String errors,
            PaymentProfileParams paymentProfileParams) {
        this.errors = errors;
        this.paymentProfileParams = paymentProfileParams;
    }

    /**
     * Initialization constructor.
     * @param  errors  String value for errors.
     */
    @JsonCreator
    protected ChjsTokenizationFailure(
            @JsonProperty("errors") String errors) {
        this(errors, null);
    }

    /**
     * Getter for Errors.
     * @return Returns the String
     */
    @JsonGetter("errors")
    public String getErrors() {
        return errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for String
     */
    @JsonSetter("errors")
    public void setErrors(String errors) {
        this.errors = errors;
    }

    /**
     * Getter for PaymentProfileParams.
     * PCI-safe cardholder fields only. Full card numbers, CVV, and billing address are never
     * included.
     * @return Returns the PaymentProfileParams
     */
    @JsonGetter("payment_profile_params")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentProfileParams getPaymentProfileParams() {
        return paymentProfileParams;
    }

    /**
     * Setter for PaymentProfileParams.
     * PCI-safe cardholder fields only. Full card numbers, CVV, and billing address are never
     * included.
     * @param paymentProfileParams Value for PaymentProfileParams
     */
    @JsonSetter("payment_profile_params")
    public void setPaymentProfileParams(PaymentProfileParams paymentProfileParams) {
        this.paymentProfileParams = paymentProfileParams;
    }

    /**
     * Converts this ChjsTokenizationFailure into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ChjsTokenizationFailure [" + "errors=" + errors + ", paymentProfileParams="
                + paymentProfileParams + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link ChjsTokenizationFailure.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ChjsTokenizationFailure.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(errors)
                .paymentProfileParams(getPaymentProfileParams());
        return builder;
    }

    /**
     * Class to build instances of {@link ChjsTokenizationFailure}.
     */
    public static class Builder {
        private String errors;
        private PaymentProfileParams paymentProfileParams;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  errors  String value for errors.
         */
        public Builder(String errors) {
            this.errors = errors;
        }

        /**
         * Setter for errors.
         * @param  errors  String value for errors.
         * @return Builder
         */
        public Builder errors(String errors) {
            this.errors = errors;
            return this;
        }

        /**
         * Setter for paymentProfileParams.
         * @param  paymentProfileParams  PaymentProfileParams value for paymentProfileParams.
         * @return Builder
         */
        public Builder paymentProfileParams(PaymentProfileParams paymentProfileParams) {
            this.paymentProfileParams = paymentProfileParams;
            return this;
        }

        /**
         * Builds a new {@link ChjsTokenizationFailure} object using the set fields.
         * @return {@link ChjsTokenizationFailure}
         */
        public ChjsTokenizationFailure build() {
            return new ChjsTokenizationFailure(errors, paymentProfileParams);
        }
    }
}
