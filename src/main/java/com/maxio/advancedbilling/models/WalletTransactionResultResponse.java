/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for WalletTransactionResultResponse type.
 */
public class WalletTransactionResultResponse
        extends BaseModel {
    private List<WalletTransaction> walletTransactions;
    private String requestedAmount;
    private String drainedAmount;
    private String rejectedAmount;
    private String balance;

    /**
     * Default constructor.
     */
    public WalletTransactionResultResponse() {
    }

    /**
     * Initialization constructor.
     * @param  walletTransactions  List of WalletTransaction value for walletTransactions.
     * @param  balance  String value for balance.
     * @param  requestedAmount  String value for requestedAmount.
     * @param  drainedAmount  String value for drainedAmount.
     * @param  rejectedAmount  String value for rejectedAmount.
     */
    public WalletTransactionResultResponse(
            List<WalletTransaction> walletTransactions,
            String balance,
            String requestedAmount,
            String drainedAmount,
            String rejectedAmount) {
        this.walletTransactions = walletTransactions;
        this.requestedAmount = requestedAmount;
        this.drainedAmount = drainedAmount;
        this.rejectedAmount = rejectedAmount;
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
     * Getter for RequestedAmount.
     * `kind: debit` only. The amount that was requested, as a decimal string.
     * @return Returns the String
     */
    @JsonGetter("requested_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRequestedAmount() {
        return requestedAmount;
    }

    /**
     * Setter for RequestedAmount.
     * `kind: debit` only. The amount that was requested, as a decimal string.
     * @param requestedAmount Value for String
     */
    @JsonSetter("requested_amount")
    public void setRequestedAmount(String requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    /**
     * Getter for DrainedAmount.
     * `kind: debit` only. The amount actually drained from the wallet's grants, as a decimal
     * string.
     * @return Returns the String
     */
    @JsonGetter("drained_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDrainedAmount() {
        return drainedAmount;
    }

    /**
     * Setter for DrainedAmount.
     * `kind: debit` only. The amount actually drained from the wallet's grants, as a decimal
     * string.
     * @param drainedAmount Value for String
     */
    @JsonSetter("drained_amount")
    public void setDrainedAmount(String drainedAmount) {
        this.drainedAmount = drainedAmount;
    }

    /**
     * Getter for RejectedAmount.
     * `kind: debit` only, as a decimal string. Under `hard_stop_overflow: discard`, this is the
     * requested amount minus what the wallet could cover (`"0.0"` on a full drain). Always `"0.0"`
     * under `allow_negative`; nothing is rejected, and the balance goes negative instead.
     * @return Returns the String
     */
    @JsonGetter("rejected_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRejectedAmount() {
        return rejectedAmount;
    }

    /**
     * Setter for RejectedAmount.
     * `kind: debit` only, as a decimal string. Under `hard_stop_overflow: discard`, this is the
     * requested amount minus what the wallet could cover (`"0.0"` on a full drain). Always `"0.0"`
     * under `allow_negative`; nothing is rejected, and the balance goes negative instead.
     * @param rejectedAmount Value for String
     */
    @JsonSetter("rejected_amount")
    public void setRejectedAmount(String rejectedAmount) {
        this.rejectedAmount = rejectedAmount;
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
     * Converts this WalletTransactionResultResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WalletTransactionResultResponse [" + "walletTransactions=" + walletTransactions
                + ", balance=" + balance + ", requestedAmount=" + requestedAmount
                + ", drainedAmount=" + drainedAmount + ", rejectedAmount=" + rejectedAmount
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link WalletTransactionResultResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WalletTransactionResultResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(walletTransactions, balance)
                .requestedAmount(getRequestedAmount())
                .drainedAmount(getDrainedAmount())
                .rejectedAmount(getRejectedAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link WalletTransactionResultResponse}.
     */
    public static class Builder {
        private List<WalletTransaction> walletTransactions;
        private String balance;
        private String requestedAmount;
        private String drainedAmount;
        private String rejectedAmount;

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
         * Setter for requestedAmount.
         * @param  requestedAmount  String value for requestedAmount.
         * @return Builder
         */
        public Builder requestedAmount(String requestedAmount) {
            this.requestedAmount = requestedAmount;
            return this;
        }

        /**
         * Setter for drainedAmount.
         * @param  drainedAmount  String value for drainedAmount.
         * @return Builder
         */
        public Builder drainedAmount(String drainedAmount) {
            this.drainedAmount = drainedAmount;
            return this;
        }

        /**
         * Setter for rejectedAmount.
         * @param  rejectedAmount  String value for rejectedAmount.
         * @return Builder
         */
        public Builder rejectedAmount(String rejectedAmount) {
            this.rejectedAmount = rejectedAmount;
            return this;
        }

        /**
         * Builds a new {@link WalletTransactionResultResponse} object using the set fields.
         * @return {@link WalletTransactionResultResponse}
         */
        public WalletTransactionResultResponse build() {
            return new WalletTransactionResultResponse(walletTransactions, balance, requestedAmount,
                    drainedAmount, rejectedAmount);
        }
    }
}
