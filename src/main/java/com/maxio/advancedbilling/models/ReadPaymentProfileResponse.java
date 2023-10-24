/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.ReadPaymentProfileResponsePaymentProfile;

/**
 * This is a model class for ReadPaymentProfileResponse type.
 */
public class ReadPaymentProfileResponse {
    private ReadPaymentProfileResponsePaymentProfile paymentProfile;

    /**
     * Default constructor.
     */
    public ReadPaymentProfileResponse() {
    }

    /**
     * Initialization constructor.
     * @param  paymentProfile  ReadPaymentProfileResponsePaymentProfile value for paymentProfile.
     */
    public ReadPaymentProfileResponse(
            ReadPaymentProfileResponsePaymentProfile paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    /**
     * Getter for PaymentProfile.
     * @return Returns the ReadPaymentProfileResponsePaymentProfile
     */
    @JsonGetter("payment_profile")
    public ReadPaymentProfileResponsePaymentProfile getPaymentProfile() {
        return paymentProfile;
    }

    /**
     * Setter for PaymentProfile.
     * @param paymentProfile Value for ReadPaymentProfileResponsePaymentProfile
     */
    @JsonSetter("payment_profile")
    public void setPaymentProfile(ReadPaymentProfileResponsePaymentProfile paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    /**
     * Converts this ReadPaymentProfileResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReadPaymentProfileResponse [" + "paymentProfile=" + paymentProfile + "]";
    }

    /**
     * Builds a new {@link ReadPaymentProfileResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReadPaymentProfileResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paymentProfile);
        return builder;
    }

    /**
     * Class to build instances of {@link ReadPaymentProfileResponse}.
     */
    public static class Builder {
        private ReadPaymentProfileResponsePaymentProfile paymentProfile;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentProfile  ReadPaymentProfileResponsePaymentProfile value for
         *         paymentProfile.
         */
        public Builder(ReadPaymentProfileResponsePaymentProfile paymentProfile) {
            this.paymentProfile = paymentProfile;
        }

        /**
         * Setter for paymentProfile.
         * @param  paymentProfile  ReadPaymentProfileResponsePaymentProfile value for
         *         paymentProfile.
         * @return Builder
         */
        public Builder paymentProfile(ReadPaymentProfileResponsePaymentProfile paymentProfile) {
            this.paymentProfile = paymentProfile;
            return this;
        }

        /**
         * Builds a new {@link ReadPaymentProfileResponse} object using the set fields.
         * @return {@link ReadPaymentProfileResponse}
         */
        public ReadPaymentProfileResponse build() {
            return new ReadPaymentProfileResponse(paymentProfile);
        }
    }
}
