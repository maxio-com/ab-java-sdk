/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreatePaymentProfileRequest type.
 */
public class CreatePaymentProfileRequest {
    private CreatePaymentProfile paymentProfile;

    /**
     * Default constructor.
     */
    public CreatePaymentProfileRequest() {
    }

    /**
     * Initialization constructor.
     * @param  paymentProfile  CreatePaymentProfile value for paymentProfile.
     */
    public CreatePaymentProfileRequest(
            CreatePaymentProfile paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    /**
     * Getter for PaymentProfile.
     * @return Returns the CreatePaymentProfile
     */
    @JsonGetter("payment_profile")
    public CreatePaymentProfile getPaymentProfile() {
        return paymentProfile;
    }

    /**
     * Setter for PaymentProfile.
     * @param paymentProfile Value for CreatePaymentProfile
     */
    @JsonSetter("payment_profile")
    public void setPaymentProfile(CreatePaymentProfile paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    /**
     * Converts this CreatePaymentProfileRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreatePaymentProfileRequest [" + "paymentProfile=" + paymentProfile + "]";
    }

    /**
     * Builds a new {@link CreatePaymentProfileRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreatePaymentProfileRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paymentProfile);
        return builder;
    }

    /**
     * Class to build instances of {@link CreatePaymentProfileRequest}.
     */
    public static class Builder {
        private CreatePaymentProfile paymentProfile;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentProfile  CreatePaymentProfile value for paymentProfile.
         */
        public Builder(CreatePaymentProfile paymentProfile) {
            this.paymentProfile = paymentProfile;
        }

        /**
         * Setter for paymentProfile.
         * @param  paymentProfile  CreatePaymentProfile value for paymentProfile.
         * @return Builder
         */
        public Builder paymentProfile(CreatePaymentProfile paymentProfile) {
            this.paymentProfile = paymentProfile;
            return this;
        }

        /**
         * Builds a new {@link CreatePaymentProfileRequest} object using the set fields.
         * @return {@link CreatePaymentProfileRequest}
         */
        public CreatePaymentProfileRequest build() {
            return new CreatePaymentProfileRequest(paymentProfile);
        }
    }
}
