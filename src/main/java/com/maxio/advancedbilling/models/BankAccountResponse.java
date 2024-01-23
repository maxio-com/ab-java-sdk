/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for BankAccountResponse type.
 */
public class BankAccountResponse {
    private BankAccountPaymentProfile paymentProfile;

    /**
     * Default constructor.
     */
    public BankAccountResponse() {
    }

    /**
     * Initialization constructor.
     * @param  paymentProfile  BankAccountPaymentProfile value for paymentProfile.
     */
    public BankAccountResponse(
            BankAccountPaymentProfile paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    /**
     * Getter for PaymentProfile.
     * @return Returns the BankAccountPaymentProfile
     */
    @JsonGetter("payment_profile")
    public BankAccountPaymentProfile getPaymentProfile() {
        return paymentProfile;
    }

    /**
     * Setter for PaymentProfile.
     * @param paymentProfile Value for BankAccountPaymentProfile
     */
    @JsonSetter("payment_profile")
    public void setPaymentProfile(BankAccountPaymentProfile paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    /**
     * Converts this BankAccountResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BankAccountResponse [" + "paymentProfile=" + paymentProfile + "]";
    }

    /**
     * Builds a new {@link BankAccountResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BankAccountResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paymentProfile);
        return builder;
    }

    /**
     * Class to build instances of {@link BankAccountResponse}.
     */
    public static class Builder {
        private BankAccountPaymentProfile paymentProfile;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentProfile  BankAccountPaymentProfile value for paymentProfile.
         */
        public Builder(BankAccountPaymentProfile paymentProfile) {
            this.paymentProfile = paymentProfile;
        }

        /**
         * Setter for paymentProfile.
         * @param  paymentProfile  BankAccountPaymentProfile value for paymentProfile.
         * @return Builder
         */
        public Builder paymentProfile(BankAccountPaymentProfile paymentProfile) {
            this.paymentProfile = paymentProfile;
            return this;
        }

        /**
         * Builds a new {@link BankAccountResponse} object using the set fields.
         * @return {@link BankAccountResponse}
         */
        public BankAccountResponse build() {
            return new BankAccountResponse(paymentProfile);
        }
    }
}
