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
 * This is a model class for WalletGrantResultResponse type.
 */
public class WalletGrantResultResponse
        extends BaseModel {
    private List<WalletTransaction> walletTransactions;
    private String balance;

    /**
     * Default constructor.
     */
    public WalletGrantResultResponse() {
    }

    /**
     * Initialization constructor.
     * @param  walletTransactions  List of WalletTransaction value for walletTransactions.
     * @param  balance  String value for balance.
     */
    public WalletGrantResultResponse(
            List<WalletTransaction> walletTransactions,
            String balance) {
        this.walletTransactions = walletTransactions;
        this.balance = balance;
    }

    /**
     * Getter for WalletTransactions.
     * @return Returns the List of WalletTransaction
     */
    @JsonGetter("wallet_transactions")
    public List<WalletTransaction> getWalletTransactions() {
        return walletTransactions;
    }

    /**
     * Setter for WalletTransactions.
     * @param walletTransactions Value for List of WalletTransaction
     */
    @JsonSetter("wallet_transactions")
    public void setWalletTransactions(List<WalletTransaction> walletTransactions) {
        this.walletTransactions = walletTransactions;
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
     * Converts this WalletGrantResultResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WalletGrantResultResponse [" + "walletTransactions=" + walletTransactions
                + ", balance=" + balance + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link WalletGrantResultResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WalletGrantResultResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(walletTransactions, balance);
        return builder;
    }

    /**
     * Class to build instances of {@link WalletGrantResultResponse}.
     */
    public static class Builder {
        private List<WalletTransaction> walletTransactions;
        private String balance;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  walletTransactions  List of WalletTransaction value for walletTransactions.
         * @param  balance  String value for balance.
         */
        public Builder(List<WalletTransaction> walletTransactions, String balance) {
            this.walletTransactions = walletTransactions;
            this.balance = balance;
        }

        /**
         * Setter for walletTransactions.
         * @param  walletTransactions  List of WalletTransaction value for walletTransactions.
         * @return Builder
         */
        public Builder walletTransactions(List<WalletTransaction> walletTransactions) {
            this.walletTransactions = walletTransactions;
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
         * Builds a new {@link WalletGrantResultResponse} object using the set fields.
         * @return {@link WalletGrantResultResponse}
         */
        public WalletGrantResultResponse build() {
            return new WalletGrantResultResponse(walletTransactions, balance);
        }
    }
}
