/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UpdatePaymentProfileResponse type.
 */
public class UpdatePaymentProfileResponse {
    private UpdatedPaymentProfile paymentProfile;

    /**
     * Default constructor.
     */
    public UpdatePaymentProfileResponse() {
    }

    /**
     * Initialization constructor.
     * @param  paymentProfile  UpdatedPaymentProfile value for paymentProfile.
     */
    public UpdatePaymentProfileResponse(
            UpdatedPaymentProfile paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    /**
     * Getter for PaymentProfile.
     * @return Returns the UpdatedPaymentProfile
     */
    @JsonGetter("payment_profile")
    public UpdatedPaymentProfile getPaymentProfile() {
        return paymentProfile;
    }

    /**
     * Setter for PaymentProfile.
     * @param paymentProfile Value for UpdatedPaymentProfile
     */
    @JsonSetter("payment_profile")
    public void setPaymentProfile(UpdatedPaymentProfile paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    /**
     * Converts this UpdatePaymentProfileResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdatePaymentProfileResponse [" + "paymentProfile=" + paymentProfile + "]";
    }

    /**
     * Builds a new {@link UpdatePaymentProfileResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdatePaymentProfileResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paymentProfile);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdatePaymentProfileResponse}.
     */
    public static class Builder {
        private UpdatedPaymentProfile paymentProfile;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentProfile  UpdatedPaymentProfile value for paymentProfile.
         */
        public Builder(UpdatedPaymentProfile paymentProfile) {
            this.paymentProfile = paymentProfile;
        }

        /**
         * Setter for paymentProfile.
         * @param  paymentProfile  UpdatedPaymentProfile value for paymentProfile.
         * @return Builder
         */
        public Builder paymentProfile(UpdatedPaymentProfile paymentProfile) {
            this.paymentProfile = paymentProfile;
            return this;
        }

        /**
         * Builds a new {@link UpdatePaymentProfileResponse} object using the set fields.
         * @return {@link UpdatePaymentProfileResponse}
         */
        public UpdatePaymentProfileResponse build() {
            return new UpdatePaymentProfileResponse(paymentProfile);
        }
    }
}
