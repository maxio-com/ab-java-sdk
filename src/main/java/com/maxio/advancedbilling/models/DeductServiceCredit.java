/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.DeductServiceCreditAmount;

/**
 * This is a model class for DeductServiceCredit type.
 */
public class DeductServiceCredit {
    private DeductServiceCreditAmount amount;
    private String memo;

    /**
     * Default constructor.
     */
    public DeductServiceCredit() {
    }

    /**
     * Initialization constructor.
     * @param  amount  DeductServiceCreditAmount value for amount.
     * @param  memo  String value for memo.
     */
    public DeductServiceCredit(
            DeductServiceCreditAmount amount,
            String memo) {
        this.amount = amount;
        this.memo = memo;
    }

    /**
     * Getter for Amount.
     * @return Returns the DeductServiceCreditAmount
     */
    @JsonGetter("amount")
    public DeductServiceCreditAmount getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * @param amount Value for DeductServiceCreditAmount
     */
    @JsonSetter("amount")
    public void setAmount(DeductServiceCreditAmount amount) {
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
     * Converts this DeductServiceCredit into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeductServiceCredit [" + "amount=" + amount + ", memo=" + memo + "]";
    }

    /**
     * Builds a new {@link DeductServiceCredit.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeductServiceCredit.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amount, memo);
        return builder;
    }

    /**
     * Class to build instances of {@link DeductServiceCredit}.
     */
    public static class Builder {
        private DeductServiceCreditAmount amount;
        private String memo;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  amount  DeductServiceCreditAmount value for amount.
         * @param  memo  String value for memo.
         */
        public Builder(DeductServiceCreditAmount amount, String memo) {
            this.amount = amount;
            this.memo = memo;
        }

        /**
         * Setter for amount.
         * @param  amount  DeductServiceCreditAmount value for amount.
         * @return Builder
         */
        public Builder amount(DeductServiceCreditAmount amount) {
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
         * Builds a new {@link DeductServiceCredit} object using the set fields.
         * @return {@link DeductServiceCredit}
         */
        public DeductServiceCredit build() {
            return new DeductServiceCredit(amount, memo);
        }
    }
}
