/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreatePaymentProfileResponse type.
 */
public class CreatePaymentProfileResponse {
    private CreatedPaymentProfile paymentProfile;

    /**
     * Default constructor.
     */
    public CreatePaymentProfileResponse() {
    }

    /**
     * Initialization constructor.
     * @param  paymentProfile  CreatedPaymentProfile value for paymentProfile.
     */
    public CreatePaymentProfileResponse(
            CreatedPaymentProfile paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    /**
     * Getter for PaymentProfile.
     * @return Returns the CreatedPaymentProfile
     */
    @JsonGetter("payment_profile")
    public CreatedPaymentProfile getPaymentProfile() {
        return paymentProfile;
    }

    /**
     * Setter for PaymentProfile.
     * @param paymentProfile Value for CreatedPaymentProfile
     */
    @JsonSetter("payment_profile")
    public void setPaymentProfile(CreatedPaymentProfile paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    /**
     * Converts this CreatePaymentProfileResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreatePaymentProfileResponse [" + "paymentProfile=" + paymentProfile + "]";
    }

    /**
     * Builds a new {@link CreatePaymentProfileResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreatePaymentProfileResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paymentProfile);
        return builder;
    }

    /**
     * Class to build instances of {@link CreatePaymentProfileResponse}.
     */
    public static class Builder {
        private CreatedPaymentProfile paymentProfile;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentProfile  CreatedPaymentProfile value for paymentProfile.
         */
        public Builder(CreatedPaymentProfile paymentProfile) {
            this.paymentProfile = paymentProfile;
        }

        /**
         * Setter for paymentProfile.
         * @param  paymentProfile  CreatedPaymentProfile value for paymentProfile.
         * @return Builder
         */
        public Builder paymentProfile(CreatedPaymentProfile paymentProfile) {
            this.paymentProfile = paymentProfile;
            return this;
        }

        /**
         * Builds a new {@link CreatePaymentProfileResponse} object using the set fields.
         * @return {@link CreatePaymentProfileResponse}
         */
        public CreatePaymentProfileResponse build() {
            return new CreatePaymentProfileResponse(paymentProfile);
        }
    }
}
