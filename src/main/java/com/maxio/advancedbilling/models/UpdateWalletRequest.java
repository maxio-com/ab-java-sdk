/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for UpdateWalletRequest type.
 */
public class UpdateWalletRequest
        extends BaseModel {
    private Wallet2 wallet;

    /**
     * Default constructor.
     */
    public UpdateWalletRequest() {
    }

    /**
     * Initialization constructor.
     * @param  wallet  Wallet2 value for wallet.
     */
    public UpdateWalletRequest(
            Wallet2 wallet) {
        this.wallet = wallet;
    }

    /**
     * Getter for Wallet.
     * @return Returns the Wallet2
     */
    @JsonGetter("wallet")
    public Wallet2 getWallet() {
        return wallet;
    }

    /**
     * Setter for Wallet.
     * @param wallet Value for Wallet2
     */
    @JsonSetter("wallet")
    public void setWallet(Wallet2 wallet) {
        this.wallet = wallet;
    }

    /**
     * Converts this UpdateWalletRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateWalletRequest [" + "wallet=" + wallet + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link UpdateWalletRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateWalletRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(wallet);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateWalletRequest}.
     */
    public static class Builder {
        private Wallet2 wallet;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  wallet  Wallet2 value for wallet.
         */
        public Builder(Wallet2 wallet) {
            this.wallet = wallet;
        }

        /**
         * Setter for wallet.
         * @param  wallet  Wallet2 value for wallet.
         * @return Builder
         */
        public Builder wallet(Wallet2 wallet) {
            this.wallet = wallet;
            return this;
        }

        /**
         * Builds a new {@link UpdateWalletRequest} object using the set fields.
         * @return {@link UpdateWalletRequest}
         */
        public UpdateWalletRequest build() {
            return new UpdateWalletRequest(wallet);
        }
    }
}
