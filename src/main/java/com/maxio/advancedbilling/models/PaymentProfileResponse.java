/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for PaymentProfileResponse type.
 */
public class PaymentProfileResponse {
    private PaymentProfile paymentProfile;

    /**
     * Default constructor.
     */
    public PaymentProfileResponse() {
    }

    /**
     * Initialization constructor.
     * @param  paymentProfile  PaymentProfile value for paymentProfile.
     */
    public PaymentProfileResponse(
            PaymentProfile paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    /**
     * Getter for PaymentProfile.
     * @return Returns the PaymentProfile
     */
    @JsonGetter("payment_profile")
    public PaymentProfile getPaymentProfile() {
        return paymentProfile;
    }

    /**
     * Setter for PaymentProfile.
     * @param paymentProfile Value for PaymentProfile
     */
    @JsonSetter("payment_profile")
    public void setPaymentProfile(PaymentProfile paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    /**
     * Converts this PaymentProfileResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentProfileResponse [" + "paymentProfile=" + paymentProfile + "]";
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
        private PaymentProfile paymentProfile;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentProfile  PaymentProfile value for paymentProfile.
         */
        public Builder(PaymentProfile paymentProfile) {
            this.paymentProfile = paymentProfile;
        }

        /**
         * Setter for paymentProfile.
         * @param  paymentProfile  PaymentProfile value for paymentProfile.
         * @return Builder
         */
        public Builder paymentProfile(PaymentProfile paymentProfile) {
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
