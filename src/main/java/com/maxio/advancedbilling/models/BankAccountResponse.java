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
    private BankAccount paymentProfile;

    /**
     * Default constructor.
     */
    public BankAccountResponse() {
    }

    /**
     * Initialization constructor.
     * @param  paymentProfile  BankAccount value for paymentProfile.
     */
    public BankAccountResponse(
            BankAccount paymentProfile) {
        this.paymentProfile = paymentProfile;
    }

    /**
     * Getter for PaymentProfile.
     * @return Returns the BankAccount
     */
    @JsonGetter("payment_profile")
    public BankAccount getPaymentProfile() {
        return paymentProfile;
    }

    /**
     * Setter for PaymentProfile.
     * @param paymentProfile Value for BankAccount
     */
    @JsonSetter("payment_profile")
    public void setPaymentProfile(BankAccount paymentProfile) {
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
        private BankAccount paymentProfile;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentProfile  BankAccount value for paymentProfile.
         */
        public Builder(BankAccount paymentProfile) {
            this.paymentProfile = paymentProfile;
        }

        /**
         * Setter for paymentProfile.
         * @param  paymentProfile  BankAccount value for paymentProfile.
         * @return Builder
         */
        public Builder paymentProfile(BankAccount paymentProfile) {
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
