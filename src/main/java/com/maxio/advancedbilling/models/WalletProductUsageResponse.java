/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for WalletProductUsageResponse type.
 */
public class WalletProductUsageResponse
        extends BaseModel {
    private List<WalletProductUsageTemplate> walletTemplates;
    private List<WalletProductUsageTemplate> pricePointOverrides;
    private ActiveWallets activeWallets;

    /**
     * Default constructor.
     */
    public WalletProductUsageResponse() {
    }

    /**
     * Initialization constructor.
     * @param  walletTemplates  List of WalletProductUsageTemplate value for walletTemplates.
     * @param  pricePointOverrides  List of WalletProductUsageTemplate value for
     *         pricePointOverrides.
     * @param  activeWallets  ActiveWallets value for activeWallets.
     */
    public WalletProductUsageResponse(
            List<WalletProductUsageTemplate> walletTemplates,
            List<WalletProductUsageTemplate> pricePointOverrides,
            ActiveWallets activeWallets) {
        this.walletTemplates = walletTemplates;
        this.pricePointOverrides = pricePointOverrides;
        this.activeWallets = activeWallets;
    }

    /**
     * Getter for WalletTemplates.
     * Wallet templates billing through this product at its default price point.
     * @return Returns the List of WalletProductUsageTemplate
     */
    @JsonGetter("wallet_templates")
    public List<WalletProductUsageTemplate> getWalletTemplates() {
        return walletTemplates;
    }

    /**
     * Setter for WalletTemplates.
     * Wallet templates billing through this product at its default price point.
     * @param walletTemplates Value for List of WalletProductUsageTemplate
     */
    @JsonSetter("wallet_templates")
    public void setWalletTemplates(List<WalletProductUsageTemplate> walletTemplates) {
        this.walletTemplates = walletTemplates;
    }

    /**
     * Getter for PricePointOverrides.
     * Wallet templates billing through this product at a price point other than the default.
     * @return Returns the List of WalletProductUsageTemplate
     */
    @JsonGetter("price_point_overrides")
    public List<WalletProductUsageTemplate> getPricePointOverrides() {
        return pricePointOverrides;
    }

    /**
     * Setter for PricePointOverrides.
     * Wallet templates billing through this product at a price point other than the default.
     * @param pricePointOverrides Value for List of WalletProductUsageTemplate
     */
    @JsonSetter("price_point_overrides")
    public void setPricePointOverrides(List<WalletProductUsageTemplate> pricePointOverrides) {
        this.pricePointOverrides = pricePointOverrides;
    }

    /**
     * Getter for ActiveWallets.
     * @return Returns the ActiveWallets
     */
    @JsonGetter("active_wallets")
    public ActiveWallets getActiveWallets() {
        return activeWallets;
    }

    /**
     * Setter for ActiveWallets.
     * @param activeWallets Value for ActiveWallets
     */
    @JsonSetter("active_wallets")
    public void setActiveWallets(ActiveWallets activeWallets) {
        this.activeWallets = activeWallets;
    }

    /**
     * Converts this WalletProductUsageResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WalletProductUsageResponse [" + "walletTemplates=" + walletTemplates
                + ", pricePointOverrides=" + pricePointOverrides + ", activeWallets="
                + activeWallets + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link WalletProductUsageResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WalletProductUsageResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(walletTemplates, pricePointOverrides, activeWallets);
        return builder;
    }

    /**
     * Class to build instances of {@link WalletProductUsageResponse}.
     */
    public static class Builder {
        private List<WalletProductUsageTemplate> walletTemplates;
        private List<WalletProductUsageTemplate> pricePointOverrides;
        private ActiveWallets activeWallets;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  walletTemplates  List of WalletProductUsageTemplate value for walletTemplates.
         * @param  pricePointOverrides  List of WalletProductUsageTemplate value for
         *         pricePointOverrides.
         * @param  activeWallets  ActiveWallets value for activeWallets.
         */
        public Builder(List<WalletProductUsageTemplate> walletTemplates,
                List<WalletProductUsageTemplate> pricePointOverrides, ActiveWallets activeWallets) {
            this.walletTemplates = walletTemplates;
            this.pricePointOverrides = pricePointOverrides;
            this.activeWallets = activeWallets;
        }

        /**
         * Setter for walletTemplates.
         * @param  walletTemplates  List of WalletProductUsageTemplate value for walletTemplates.
         * @return Builder
         */
        public Builder walletTemplates(List<WalletProductUsageTemplate> walletTemplates) {
            this.walletTemplates = walletTemplates;
            return this;
        }

        /**
         * Setter for pricePointOverrides.
         * @param  pricePointOverrides  List of WalletProductUsageTemplate value for
         *         pricePointOverrides.
         * @return Builder
         */
        public Builder pricePointOverrides(List<WalletProductUsageTemplate> pricePointOverrides) {
            this.pricePointOverrides = pricePointOverrides;
            return this;
        }

        /**
         * Setter for activeWallets.
         * @param  activeWallets  ActiveWallets value for activeWallets.
         * @return Builder
         */
        public Builder activeWallets(ActiveWallets activeWallets) {
            this.activeWallets = activeWallets;
            return this;
        }

        /**
         * Builds a new {@link WalletProductUsageResponse} object using the set fields.
         * @return {@link WalletProductUsageResponse}
         */
        public WalletProductUsageResponse build() {
            return new WalletProductUsageResponse(walletTemplates, pricePointOverrides,
                    activeWallets);
        }
    }
}
