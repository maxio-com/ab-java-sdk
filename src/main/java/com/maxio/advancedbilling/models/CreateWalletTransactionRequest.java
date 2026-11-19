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
 * This is a model class for CreateWalletTransactionRequest type.
 */
public class CreateWalletTransactionRequest
        extends BaseModel {
    private WalletTransaction1 walletTransaction;

    /**
     * Default constructor.
     */
    public CreateWalletTransactionRequest() {
    }

    /**
     * Initialization constructor.
     * @param  walletTransaction  WalletTransaction1 value for walletTransaction.
     */
    public CreateWalletTransactionRequest(
            WalletTransaction1 walletTransaction) {
        this.walletTransaction = walletTransaction;
    }

    /**
     * Getter for WalletTransaction.
     * @return Returns the WalletTransaction1
     */
    @JsonGetter("wallet_transaction")
    public WalletTransaction1 getWalletTransaction() {
        return walletTransaction;
    }

    /**
     * Setter for WalletTransaction.
     * @param walletTransaction Value for WalletTransaction1
     */
    @JsonSetter("wallet_transaction")
    public void setWalletTransaction(WalletTransaction1 walletTransaction) {
        this.walletTransaction = walletTransaction;
    }

    /**
     * Converts this CreateWalletTransactionRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateWalletTransactionRequest [" + "walletTransaction=" + walletTransaction
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CreateWalletTransactionRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateWalletTransactionRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(walletTransaction);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateWalletTransactionRequest}.
     */
    public static class Builder {
        private WalletTransaction1 walletTransaction;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  walletTransaction  WalletTransaction1 value for walletTransaction.
         */
        public Builder(WalletTransaction1 walletTransaction) {
            this.walletTransaction = walletTransaction;
        }

        /**
         * Setter for walletTransaction.
         * @param  walletTransaction  WalletTransaction1 value for walletTransaction.
         * @return Builder
         */
        public Builder walletTransaction(WalletTransaction1 walletTransaction) {
            this.walletTransaction = walletTransaction;
            return this;
        }

        /**
         * Builds a new {@link CreateWalletTransactionRequest} object using the set fields.
         * @return {@link CreateWalletTransactionRequest}
         */
        public CreateWalletTransactionRequest build() {
            return new CreateWalletTransactionRequest(walletTransaction);
        }
    }
}
