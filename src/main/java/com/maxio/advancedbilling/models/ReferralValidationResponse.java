/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ReferralValidationResponse type.
 */
public class ReferralValidationResponse {
    private ReferralCode referralCode;

    /**
     * Default constructor.
     */
    public ReferralValidationResponse() {
    }

    /**
     * Initialization constructor.
     * @param  referralCode  ReferralCode value for referralCode.
     */
    public ReferralValidationResponse(
            ReferralCode referralCode) {
        this.referralCode = referralCode;
    }

    /**
     * Getter for ReferralCode.
     * @return Returns the ReferralCode
     */
    @JsonGetter("referral_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ReferralCode getReferralCode() {
        return referralCode;
    }

    /**
     * Setter for ReferralCode.
     * @param referralCode Value for ReferralCode
     */
    @JsonSetter("referral_code")
    public void setReferralCode(ReferralCode referralCode) {
        this.referralCode = referralCode;
    }

    /**
     * Converts this ReferralValidationResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReferralValidationResponse [" + "referralCode=" + referralCode + "]";
    }

    /**
     * Builds a new {@link ReferralValidationResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReferralValidationResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .referralCode(getReferralCode());
        return builder;
    }

    /**
     * Class to build instances of {@link ReferralValidationResponse}.
     */
    public static class Builder {
        private ReferralCode referralCode;



        /**
         * Setter for referralCode.
         * @param  referralCode  ReferralCode value for referralCode.
         * @return Builder
         */
        public Builder referralCode(ReferralCode referralCode) {
            this.referralCode = referralCode;
            return this;
        }

        /**
         * Builds a new {@link ReferralValidationResponse} object using the set fields.
         * @return {@link ReferralValidationResponse}
         */
        public ReferralValidationResponse build() {
            return new ReferralValidationResponse(referralCode);
        }
    }
}
