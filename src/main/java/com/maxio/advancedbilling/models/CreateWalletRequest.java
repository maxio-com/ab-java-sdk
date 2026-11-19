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
 * This is a model class for CreateWalletRequest type.
 */
public class CreateWalletRequest
        extends BaseModel {
    private Wallet1 wallet;

    /**
     * Default constructor.
     */
    public CreateWalletRequest() {
    }

    /**
     * Initialization constructor.
     * @param  wallet  Wallet1 value for wallet.
     */
    public CreateWalletRequest(
            Wallet1 wallet) {
        this.wallet = wallet;
    }

    /**
     * Getter for Wallet.
     * @return Returns the Wallet1
     */
    @JsonGetter("wallet")
    public Wallet1 getWallet() {
        return wallet;
    }

    /**
     * Setter for Wallet.
     * @param wallet Value for Wallet1
     */
    @JsonSetter("wallet")
    public void setWallet(Wallet1 wallet) {
        this.wallet = wallet;
    }

    /**
     * Converts this CreateWalletRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateWalletRequest [" + "wallet=" + wallet + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CreateWalletRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateWalletRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(wallet);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateWalletRequest}.
     */
    public static class Builder {
        private Wallet1 wallet;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  wallet  Wallet1 value for wallet.
         */
        public Builder(Wallet1 wallet) {
            this.wallet = wallet;
        }

        /**
         * Setter for wallet.
         * @param  wallet  Wallet1 value for wallet.
         * @return Builder
         */
        public Builder wallet(Wallet1 wallet) {
            this.wallet = wallet;
            return this;
        }

        /**
         * Builds a new {@link CreateWalletRequest} object using the set fields.
         * @return {@link CreateWalletRequest}
         */
        public CreateWalletRequest build() {
            return new CreateWalletRequest(wallet);
        }
    }
}
