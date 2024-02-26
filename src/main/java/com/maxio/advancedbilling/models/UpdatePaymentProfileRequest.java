/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UpdatePaymentProfileRequest type.
 */
public class UpdatePaymentProfileRequest {
    private UpdatePaymentProfile paymentProfile;

    /**
     * Default constructor.
     */
    public UpdatePaymentProfileRequest() {
    }

    /**
     * Initialization constructor.
     * @param  paymentProfile  UpdatePaymentProfile value for paymentProfile.
     */
    public UpdatePaymentProfileRequest(
            UpdatePaymentProfile paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    /**
     * Getter for PaymentProfile.
     * @return Returns the UpdatePaymentProfile
     */
    @JsonGetter("payment_profile")
    public UpdatePaymentProfile getPaymentProfile() {
        return paymentProfile;
    }

    /**
     * Setter for PaymentProfile.
     * @param paymentProfile Value for UpdatePaymentProfile
     */
    @JsonSetter("payment_profile")
    public void setPaymentProfile(UpdatePaymentProfile paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    /**
     * Converts this UpdatePaymentProfileRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdatePaymentProfileRequest [" + "paymentProfile=" + paymentProfile + "]";
    }

    /**
     * Builds a new {@link UpdatePaymentProfileRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdatePaymentProfileRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paymentProfile);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdatePaymentProfileRequest}.
     */
    public static class Builder {
        private UpdatePaymentProfile paymentProfile;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentProfile  UpdatePaymentProfile value for paymentProfile.
         */
        public Builder(UpdatePaymentProfile paymentProfile) {
            this.paymentProfile = paymentProfile;
        }

        /**
         * Setter for paymentProfile.
         * @param  paymentProfile  UpdatePaymentProfile value for paymentProfile.
         * @return Builder
         */
        public Builder paymentProfile(UpdatePaymentProfile paymentProfile) {
            this.paymentProfile = paymentProfile;
            return this;
        }

        /**
         * Builds a new {@link UpdatePaymentProfileRequest} object using the set fields.
         * @return {@link UpdatePaymentProfileRequest}
         */
        public UpdatePaymentProfileRequest build() {
            return new UpdatePaymentProfileRequest(paymentProfile);
        }
    }
}
