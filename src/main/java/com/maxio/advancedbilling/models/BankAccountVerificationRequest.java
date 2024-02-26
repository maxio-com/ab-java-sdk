/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for BankAccountVerificationRequest type.
 */
public class BankAccountVerificationRequest {
    private BankAccountVerification bankAccountVerification;

    /**
     * Default constructor.
     */
    public BankAccountVerificationRequest() {
    }

    /**
     * Initialization constructor.
     * @param  bankAccountVerification  BankAccountVerification value for bankAccountVerification.
     */
    public BankAccountVerificationRequest(
            BankAccountVerification bankAccountVerification) {
        this.bankAccountVerification = bankAccountVerification;
    }

    /**
     * Getter for BankAccountVerification.
     * @return Returns the BankAccountVerification
     */
    @JsonGetter("bank_account_verification")
    public BankAccountVerification getBankAccountVerification() {
        return bankAccountVerification;
    }

    /**
     * Setter for BankAccountVerification.
     * @param bankAccountVerification Value for BankAccountVerification
     */
    @JsonSetter("bank_account_verification")
    public void setBankAccountVerification(BankAccountVerification bankAccountVerification) {
        this.bankAccountVerification = bankAccountVerification;
    }

    /**
     * Converts this BankAccountVerificationRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BankAccountVerificationRequest [" + "bankAccountVerification="
                + bankAccountVerification + "]";
    }

    /**
     * Builds a new {@link BankAccountVerificationRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BankAccountVerificationRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(bankAccountVerification);
        return builder;
    }

    /**
     * Class to build instances of {@link BankAccountVerificationRequest}.
     */
    public static class Builder {
        private BankAccountVerification bankAccountVerification;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  bankAccountVerification  BankAccountVerification value for
         *         bankAccountVerification.
         */
        public Builder(BankAccountVerification bankAccountVerification) {
            this.bankAccountVerification = bankAccountVerification;
        }

        /**
         * Setter for bankAccountVerification.
         * @param  bankAccountVerification  BankAccountVerification value for
         *         bankAccountVerification.
         * @return Builder
         */
        public Builder bankAccountVerification(BankAccountVerification bankAccountVerification) {
            this.bankAccountVerification = bankAccountVerification;
            return this;
        }

        /**
         * Builds a new {@link BankAccountVerificationRequest} object using the set fields.
         * @return {@link BankAccountVerificationRequest}
         */
        public BankAccountVerificationRequest build() {
            return new BankAccountVerificationRequest(bankAccountVerification);
        }
    }
}
