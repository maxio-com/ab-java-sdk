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
 * This is a model class for WalletResponse type.
 */
public class WalletResponse
        extends BaseModel {
    private Wallet wallet;

    /**
     * Default constructor.
     */
    public WalletResponse() {
    }

    /**
     * Initialization constructor.
     * @param  wallet  Wallet value for wallet.
     */
    public WalletResponse(
            Wallet wallet) {
        this.wallet = wallet;
    }

    /**
     * Getter for Wallet.
     * A balance, denominated in the unit of a Wallet Product, owned by a subscription. Grants and
     * recurring funding schedules are embedded so a single read shows the full balance breakdown.
     * @return Returns the Wallet
     */
    @JsonGetter("wallet")
    public Wallet getWallet() {
        return wallet;
    }

    /**
     * Setter for Wallet.
     * A balance, denominated in the unit of a Wallet Product, owned by a subscription. Grants and
     * recurring funding schedules are embedded so a single read shows the full balance breakdown.
     * @param wallet Value for Wallet
     */
    @JsonSetter("wallet")
    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    /**
     * Converts this WalletResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WalletResponse [" + "wallet=" + wallet + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link WalletResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WalletResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(wallet);
        return builder;
    }

    /**
     * Class to build instances of {@link WalletResponse}.
     */
    public static class Builder {
        private Wallet wallet;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  wallet  Wallet value for wallet.
         */
        public Builder(Wallet wallet) {
            this.wallet = wallet;
        }

        /**
         * Setter for wallet.
         * @param  wallet  Wallet value for wallet.
         * @return Builder
         */
        public Builder wallet(Wallet wallet) {
            this.wallet = wallet;
            return this;
        }

        /**
         * Builds a new {@link WalletResponse} object using the set fields.
         * @return {@link WalletResponse}
         */
        public WalletResponse build() {
            return new WalletResponse(wallet);
        }
    }
}
