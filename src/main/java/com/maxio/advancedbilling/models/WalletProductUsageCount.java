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
 * This is a model class for WalletProductUsageCount type.
 */
public class WalletProductUsageCount
        extends BaseModel {
    private int walletConfigurations;
    private int activeWallets;

    /**
     * Default constructor.
     */
    public WalletProductUsageCount() {
    }

    /**
     * Initialization constructor.
     * @param  walletConfigurations  int value for walletConfigurations.
     * @param  activeWallets  int value for activeWallets.
     */
    public WalletProductUsageCount(
            int walletConfigurations,
            int activeWallets) {
        this.walletConfigurations = walletConfigurations;
        this.activeWallets = activeWallets;
    }

    /**
     * Getter for WalletConfigurations.
     * Number of wallet templates billing through this product, whether or not any wallet has been
     * created from them yet.
     * @return Returns the int
     */
    @JsonGetter("wallet_configurations")
    public int getWalletConfigurations() {
        return walletConfigurations;
    }

    /**
     * Setter for WalletConfigurations.
     * Number of wallet templates billing through this product, whether or not any wallet has been
     * created from them yet.
     * @param walletConfigurations Value for int
     */
    @JsonSetter("wallet_configurations")
    public void setWalletConfigurations(int walletConfigurations) {
        this.walletConfigurations = walletConfigurations;
    }

    /**
     * Getter for ActiveWallets.
     * Number of active (non-archived) wallets currently denominated by this product.
     * @return Returns the int
     */
    @JsonGetter("active_wallets")
    public int getActiveWallets() {
        return activeWallets;
    }

    /**
     * Setter for ActiveWallets.
     * Number of active (non-archived) wallets currently denominated by this product.
     * @param activeWallets Value for int
     */
    @JsonSetter("active_wallets")
    public void setActiveWallets(int activeWallets) {
        this.activeWallets = activeWallets;
    }

    /**
     * Converts this WalletProductUsageCount into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WalletProductUsageCount [" + "walletConfigurations=" + walletConfigurations
                + ", activeWallets=" + activeWallets + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link WalletProductUsageCount.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WalletProductUsageCount.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(walletConfigurations, activeWallets);
        return builder;
    }

    /**
     * Class to build instances of {@link WalletProductUsageCount}.
     */
    public static class Builder {
        private int walletConfigurations;
        private int activeWallets;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  walletConfigurations  int value for walletConfigurations.
         * @param  activeWallets  int value for activeWallets.
         */
        public Builder(int walletConfigurations, int activeWallets) {
            this.walletConfigurations = walletConfigurations;
            this.activeWallets = activeWallets;
        }

        /**
         * Setter for walletConfigurations.
         * @param  walletConfigurations  int value for walletConfigurations.
         * @return Builder
         */
        public Builder walletConfigurations(int walletConfigurations) {
            this.walletConfigurations = walletConfigurations;
            return this;
        }

        /**
         * Setter for activeWallets.
         * @param  activeWallets  int value for activeWallets.
         * @return Builder
         */
        public Builder activeWallets(int activeWallets) {
            this.activeWallets = activeWallets;
            return this;
        }

        /**
         * Builds a new {@link WalletProductUsageCount} object using the set fields.
         * @return {@link WalletProductUsageCount}
         */
        public WalletProductUsageCount build() {
            return new WalletProductUsageCount(walletConfigurations, activeWallets);
        }
    }
}
