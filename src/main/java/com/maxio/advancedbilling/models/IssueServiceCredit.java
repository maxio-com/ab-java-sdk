/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.IssueServiceCreditAmount;

/**
 * This is a model class for IssueServiceCredit type.
 */
public class IssueServiceCredit {
    private IssueServiceCreditAmount amount;
    private String memo;

    /**
     * Default constructor.
     */
    public IssueServiceCredit() {
    }

    /**
     * Initialization constructor.
     * @param  amount  IssueServiceCreditAmount value for amount.
     * @param  memo  String value for memo.
     */
    public IssueServiceCredit(
            IssueServiceCreditAmount amount,
            String memo) {
        this.amount = amount;
        this.memo = memo;
    }

    /**
     * Getter for Amount.
     * @return Returns the IssueServiceCreditAmount
     */
    @JsonGetter("amount")
    public IssueServiceCreditAmount getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * @param amount Value for IssueServiceCreditAmount
     */
    @JsonSetter("amount")
    public void setAmount(IssueServiceCreditAmount amount) {
        this.amount = amount;
    }

    /**
     * Getter for Memo.
     * @return Returns the String
     */
    @JsonGetter("memo")
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Converts this IssueServiceCredit into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IssueServiceCredit [" + "amount=" + amount + ", memo=" + memo + "]";
    }

    /**
     * Builds a new {@link IssueServiceCredit.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IssueServiceCredit.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amount, memo);
        return builder;
    }

    /**
     * Class to build instances of {@link IssueServiceCredit}.
     */
    public static class Builder {
        private IssueServiceCreditAmount amount;
        private String memo;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  amount  IssueServiceCreditAmount value for amount.
         * @param  memo  String value for memo.
         */
        public Builder(IssueServiceCreditAmount amount, String memo) {
            this.amount = amount;
            this.memo = memo;
        }

        /**
         * Setter for amount.
         * @param  amount  IssueServiceCreditAmount value for amount.
         * @return Builder
         */
        public Builder amount(IssueServiceCreditAmount amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for memo.
         * @param  memo  String value for memo.
         * @return Builder
         */
        public Builder memo(String memo) {
            this.memo = memo;
            return this;
        }

        /**
         * Builds a new {@link IssueServiceCredit} object using the set fields.
         * @return {@link IssueServiceCredit}
         */
        public IssueServiceCredit build() {
            return new IssueServiceCredit(amount, memo);
        }
    }
}
