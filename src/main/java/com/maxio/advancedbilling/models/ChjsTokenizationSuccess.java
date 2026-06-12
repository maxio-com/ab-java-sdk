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
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for ChjsTokenizationSuccess type.
 */
public class ChjsTokenizationSuccess
        extends BaseModel {
    private TokenizedPaymentProfile paymentProfile;
    private OptionalNullable<Integer> gatewayCustomerId;

    /**
     * Default constructor.
     */
    public ChjsTokenizationSuccess() {
    }

    /**
     * Initialization constructor.
     * @param  paymentProfile  TokenizedPaymentProfile value for paymentProfile.
     * @param  gatewayCustomerId  Integer value for gatewayCustomerId.
     */
    public ChjsTokenizationSuccess(
            TokenizedPaymentProfile paymentProfile,
            Integer gatewayCustomerId) {
        this.paymentProfile = paymentProfile;
        this.gatewayCustomerId = OptionalNullable.of(gatewayCustomerId);
    }

    /**
     * Initialization constructor.
     * @param  paymentProfile  TokenizedPaymentProfile value for paymentProfile.
     * @param  gatewayCustomerId  Integer value for gatewayCustomerId.
     */

    protected ChjsTokenizationSuccess(TokenizedPaymentProfile paymentProfile,
            OptionalNullable<Integer> gatewayCustomerId) {
        this.paymentProfile = paymentProfile;
        this.gatewayCustomerId = gatewayCustomerId;
    }

    /**
     * Initialization constructor.
     * @param  paymentProfile  TokenizedPaymentProfile value for paymentProfile.
     */
    @JsonCreator
    protected ChjsTokenizationSuccess(
            @JsonProperty("payment_profile") TokenizedPaymentProfile paymentProfile) {
        this(paymentProfile, OptionalNullable.of(null));
        unsetGatewayCustomerId();
    }

    /**
     * Getter for PaymentProfile.
     * @return Returns the TokenizedPaymentProfile
     */
    @JsonGetter("payment_profile")
    public TokenizedPaymentProfile getPaymentProfile() {
        return paymentProfile;
    }

    /**
     * Setter for PaymentProfile.
     * @param paymentProfile Value for TokenizedPaymentProfile
     */
    @JsonSetter("payment_profile")
    public void setPaymentProfile(TokenizedPaymentProfile paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    /**
     * Internal Getter for GatewayCustomerId.
     * @return Returns the Internal Integer
     */
    @JsonGetter("gateway_customer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetGatewayCustomerId() {
        return this.gatewayCustomerId;
    }

    /**
     * Getter for GatewayCustomerId.
     * @return Returns the Integer
     */
    public Integer getGatewayCustomerId() {
        return OptionalNullable.getFrom(gatewayCustomerId);
    }

    /**
     * Setter for GatewayCustomerId.
     * @param gatewayCustomerId Value for Integer
     */
    @JsonSetter("gateway_customer_id")
    public void setGatewayCustomerId(Integer gatewayCustomerId) {
        this.gatewayCustomerId = OptionalNullable.of(gatewayCustomerId);
    }

    /**
     * UnSetter for GatewayCustomerId.
     */
    public void unsetGatewayCustomerId() {
        gatewayCustomerId = null;
    }

    /**
     * Converts this ChjsTokenizationSuccess into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ChjsTokenizationSuccess [" + "paymentProfile=" + paymentProfile
                + ", gatewayCustomerId=" + gatewayCustomerId + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ChjsTokenizationSuccess.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ChjsTokenizationSuccess.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paymentProfile);
        builder.gatewayCustomerId = internalGetGatewayCustomerId();
        return builder;
    }

    /**
     * Class to build instances of {@link ChjsTokenizationSuccess}.
     */
    public static class Builder {
        private TokenizedPaymentProfile paymentProfile;
        private OptionalNullable<Integer> gatewayCustomerId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentProfile  TokenizedPaymentProfile value for paymentProfile.
         */
        public Builder(TokenizedPaymentProfile paymentProfile) {
            this.paymentProfile = paymentProfile;
        }

        /**
         * Setter for paymentProfile.
         * @param  paymentProfile  TokenizedPaymentProfile value for paymentProfile.
         * @return Builder
         */
        public Builder paymentProfile(TokenizedPaymentProfile paymentProfile) {
            this.paymentProfile = paymentProfile;
            return this;
        }

        /**
         * Setter for gatewayCustomerId.
         * @param  gatewayCustomerId  Integer value for gatewayCustomerId.
         * @return Builder
         */
        public Builder gatewayCustomerId(Integer gatewayCustomerId) {
            this.gatewayCustomerId = OptionalNullable.of(gatewayCustomerId);
            return this;
        }

        /**
         * UnSetter for gatewayCustomerId.
         * @return Builder
         */
        public Builder unsetGatewayCustomerId() {
            gatewayCustomerId = null;
            return this;
        }

        /**
         * Builds a new {@link ChjsTokenizationSuccess} object using the set fields.
         * @return {@link ChjsTokenizationSuccess}
         */
        public ChjsTokenizationSuccess build() {
            return new ChjsTokenizationSuccess(paymentProfile, gatewayCustomerId);
        }
    }
}
