/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for GetOneTimeTokenRequest type.
 */
public class GetOneTimeTokenRequest {
    private GetOneTimeTokenPaymentProfile paymentProfile;

    /**
     * Default constructor.
     */
    public GetOneTimeTokenRequest() {
    }

    /**
     * Initialization constructor.
     * @param  paymentProfile  GetOneTimeTokenPaymentProfile value for paymentProfile.
     */
    public GetOneTimeTokenRequest(
            GetOneTimeTokenPaymentProfile paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    /**
     * Getter for PaymentProfile.
     * @return Returns the GetOneTimeTokenPaymentProfile
     */
    @JsonGetter("payment_profile")
    public GetOneTimeTokenPaymentProfile getPaymentProfile() {
        return paymentProfile;
    }

    /**
     * Setter for PaymentProfile.
     * @param paymentProfile Value for GetOneTimeTokenPaymentProfile
     */
    @JsonSetter("payment_profile")
    public void setPaymentProfile(GetOneTimeTokenPaymentProfile paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    /**
     * Converts this GetOneTimeTokenRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetOneTimeTokenRequest [" + "paymentProfile=" + paymentProfile + "]";
    }

    /**
     * Builds a new {@link GetOneTimeTokenRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetOneTimeTokenRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paymentProfile);
        return builder;
    }

    /**
     * Class to build instances of {@link GetOneTimeTokenRequest}.
     */
    public static class Builder {
        private GetOneTimeTokenPaymentProfile paymentProfile;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentProfile  GetOneTimeTokenPaymentProfile value for paymentProfile.
         */
        public Builder(GetOneTimeTokenPaymentProfile paymentProfile) {
            this.paymentProfile = paymentProfile;
        }

        /**
         * Setter for paymentProfile.
         * @param  paymentProfile  GetOneTimeTokenPaymentProfile value for paymentProfile.
         * @return Builder
         */
        public Builder paymentProfile(GetOneTimeTokenPaymentProfile paymentProfile) {
            this.paymentProfile = paymentProfile;
            return this;
        }

        /**
         * Builds a new {@link GetOneTimeTokenRequest} object using the set fields.
         * @return {@link GetOneTimeTokenRequest}
         */
        public GetOneTimeTokenRequest build() {
            return new GetOneTimeTokenRequest(paymentProfile);
        }
    }
}
