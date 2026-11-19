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
 * This is a model class for WalletTransactionsListResponse type.
 */
public class WalletTransactionsListResponse
        extends BaseModel {
    private List<WalletTransaction> walletTransactions;
    private ListPublicKeysMeta meta;

    /**
     * Default constructor.
     */
    public WalletTransactionsListResponse() {
    }

    /**
     * Initialization constructor.
     * @param  walletTransactions  List of WalletTransaction value for walletTransactions.
     * @param  meta  ListPublicKeysMeta value for meta.
     */
    public WalletTransactionsListResponse(
            List<WalletTransaction> walletTransactions,
            ListPublicKeysMeta meta) {
        this.walletTransactions = walletTransactions;
        this.meta = meta;
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
     * Getter for Meta.
     * @return Returns the ListPublicKeysMeta
     */
    @JsonGetter("meta")
    public ListPublicKeysMeta getMeta() {
        return meta;
    }

    /**
     * Setter for Meta.
     * @param meta Value for ListPublicKeysMeta
     */
    @JsonSetter("meta")
    public void setMeta(ListPublicKeysMeta meta) {
        this.meta = meta;
    }

    /**
     * Converts this WalletTransactionsListResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WalletTransactionsListResponse [" + "walletTransactions=" + walletTransactions
                + ", meta=" + meta + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link WalletTransactionsListResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WalletTransactionsListResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(walletTransactions, meta);
        return builder;
    }

    /**
     * Class to build instances of {@link WalletTransactionsListResponse}.
     */
    public static class Builder {
        private List<WalletTransaction> walletTransactions;
        private ListPublicKeysMeta meta;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  walletTransactions  List of WalletTransaction value for walletTransactions.
         * @param  meta  ListPublicKeysMeta value for meta.
         */
        public Builder(List<WalletTransaction> walletTransactions, ListPublicKeysMeta meta) {
            this.walletTransactions = walletTransactions;
            this.meta = meta;
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
         * Setter for meta.
         * @param  meta  ListPublicKeysMeta value for meta.
         * @return Builder
         */
        public Builder meta(ListPublicKeysMeta meta) {
            this.meta = meta;
            return this;
        }

        /**
         * Builds a new {@link WalletTransactionsListResponse} object using the set fields.
         * @return {@link WalletTransactionsListResponse}
         */
        public WalletTransactionsListResponse build() {
            return new WalletTransactionsListResponse(walletTransactions, meta);
        }
    }
}
