/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.PaymentProfileResponsePaymentProfile;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for PaymentProfileResponse type.
 */
public class PaymentProfileResponse
        extends BaseModel {
    private PaymentProfileResponsePaymentProfile paymentProfile;

    /**
     * Default constructor.
     */
    public PaymentProfileResponse() {
    }

    /**
     * Initialization constructor.
     * @param  paymentProfile  PaymentProfileResponsePaymentProfile value for paymentProfile.
     */
    public PaymentProfileResponse(
            PaymentProfileResponsePaymentProfile paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    /**
     * Getter for PaymentProfile.
     * @return Returns the PaymentProfileResponsePaymentProfile
     */
    @JsonGetter("payment_profile")
    public PaymentProfileResponsePaymentProfile getPaymentProfile() {
        return paymentProfile;
    }

    /**
     * Setter for PaymentProfile.
     * @param paymentProfile Value for PaymentProfileResponsePaymentProfile
     */
    @JsonSetter("payment_profile")
    public void setPaymentProfile(PaymentProfileResponsePaymentProfile paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    /**
     * Converts this PaymentProfileResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentProfileResponse [" + "paymentProfile=" + paymentProfile
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PaymentProfileResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentProfileResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paymentProfile);
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentProfileResponse}.
     */
    public static class Builder {
        private PaymentProfileResponsePaymentProfile paymentProfile;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentProfile  PaymentProfileResponsePaymentProfile value for paymentProfile.
         */
        public Builder(PaymentProfileResponsePaymentProfile paymentProfile) {
            this.paymentProfile = paymentProfile;
        }

        /**
         * Setter for paymentProfile.
         * @param  paymentProfile  PaymentProfileResponsePaymentProfile value for paymentProfile.
         * @return Builder
         */
        public Builder paymentProfile(PaymentProfileResponsePaymentProfile paymentProfile) {
            this.paymentProfile = paymentProfile;
            return this;
        }

        /**
         * Builds a new {@link PaymentProfileResponse} object using the set fields.
         * @return {@link PaymentProfileResponse}
         */
        public PaymentProfileResponse build() {
            return new PaymentProfileResponse(paymentProfile);
        }
    }
}
