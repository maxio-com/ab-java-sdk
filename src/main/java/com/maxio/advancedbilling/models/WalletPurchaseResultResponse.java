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
 * This is a model class for WalletPurchaseResultResponse type.
 */
public class WalletPurchaseResultResponse
        extends BaseModel {
    private List<WalletPurchase> walletPurchases;
    private String balance;

    /**
     * Default constructor.
     */
    public WalletPurchaseResultResponse() {
    }

    /**
     * Initialization constructor.
     * @param  walletPurchases  List of WalletPurchase value for walletPurchases.
     * @param  balance  String value for balance.
     */
    public WalletPurchaseResultResponse(
            List<WalletPurchase> walletPurchases,
            String balance) {
        this.walletPurchases = walletPurchases;
        this.balance = balance;
    }

    /**
     * Getter for WalletPurchases.
     * @return Returns the List of WalletPurchase
     */
    @JsonGetter("wallet_purchases")
    public List<WalletPurchase> getWalletPurchases() {
        return walletPurchases;
    }

    /**
     * Setter for WalletPurchases.
     * @param walletPurchases Value for List of WalletPurchase
     */
    @JsonSetter("wallet_purchases")
    public void setWalletPurchases(List<WalletPurchase> walletPurchases) {
        this.walletPurchases = walletPurchases;
    }

    /**
     * Getter for Balance.
     * The wallet's new balance, as a decimal string.
     * @return Returns the String
     */
    @JsonGetter("balance")
    public String getBalance() {
        return balance;
    }

    /**
     * Setter for Balance.
     * The wallet's new balance, as a decimal string.
     * @param balance Value for String
     */
    @JsonSetter("balance")
    public void setBalance(String balance) {
        this.balance = balance;
    }

    /**
     * Converts this WalletPurchaseResultResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WalletPurchaseResultResponse [" + "walletPurchases=" + walletPurchases
                + ", balance=" + balance + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link WalletPurchaseResultResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WalletPurchaseResultResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(walletPurchases, balance);
        return builder;
    }

    /**
     * Class to build instances of {@link WalletPurchaseResultResponse}.
     */
    public static class Builder {
        private List<WalletPurchase> walletPurchases;
        private String balance;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  walletPurchases  List of WalletPurchase value for walletPurchases.
         * @param  balance  String value for balance.
         */
        public Builder(List<WalletPurchase> walletPurchases, String balance) {
            this.walletPurchases = walletPurchases;
            this.balance = balance;
        }

        /**
         * Setter for walletPurchases.
         * @param  walletPurchases  List of WalletPurchase value for walletPurchases.
         * @return Builder
         */
        public Builder walletPurchases(List<WalletPurchase> walletPurchases) {
            this.walletPurchases = walletPurchases;
            return this;
        }

        /**
         * Setter for balance.
         * @param  balance  String value for balance.
         * @return Builder
         */
        public Builder balance(String balance) {
            this.balance = balance;
            return this;
        }

        /**
         * Builds a new {@link WalletPurchaseResultResponse} object using the set fields.
         * @return {@link WalletPurchaseResultResponse}
         */
        public WalletPurchaseResultResponse build() {
            return new WalletPurchaseResultResponse(walletPurchases, balance);
        }
    }
}
