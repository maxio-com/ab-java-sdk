/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.RefundPrepaymentAmount;

/**
 * This is a model class for RefundPrepayment type.
 */
public class RefundPrepayment {
    private double amountInCents;
    private RefundPrepaymentAmount amount;
    private String memo;
    private Boolean external;

    /**
     * Default constructor.
     */
    public RefundPrepayment() {
    }

    /**
     * Initialization constructor.
     * @param  amountInCents  double value for amountInCents.
     * @param  amount  RefundPrepaymentAmount value for amount.
     * @param  memo  String value for memo.
     * @param  external  Boolean value for external.
     */
    public RefundPrepayment(
            double amountInCents,
            RefundPrepaymentAmount amount,
            String memo,
            Boolean external) {
        this.amountInCents = amountInCents;
        this.amount = amount;
        this.memo = memo;
        this.external = external;
    }

    /**
     * Getter for AmountInCents.
     * `amount` is not required if you pass `amount_in_cents`.
     * @return Returns the double
     */
    @JsonGetter("amount_in_cents")
    public double getAmountInCents() {
        return amountInCents;
    }

    /**
     * Setter for AmountInCents.
     * `amount` is not required if you pass `amount_in_cents`.
     * @param amountInCents Value for double
     */
    @JsonSetter("amount_in_cents")
    public void setAmountInCents(double amountInCents) {
        this.amountInCents = amountInCents;
    }

    /**
     * Getter for Amount.
     * `amount_in_cents` is not required if you pass `amount`.
     * @return Returns the RefundPrepaymentAmount
     */
    @JsonGetter("amount")
    public RefundPrepaymentAmount getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * `amount_in_cents` is not required if you pass `amount`.
     * @param amount Value for RefundPrepaymentAmount
     */
    @JsonSetter("amount")
    public void setAmount(RefundPrepaymentAmount amount) {
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
     * Getter for External.
     * Specify the type of refund you wish to initiate. When the prepayment is external, the
     * `external` flag is optional. But if the prepayment was made through a payment profile, the
     * `external` flag is required.
     * @return Returns the Boolean
     */
    @JsonGetter("external")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getExternal() {
        return external;
    }

    /**
     * Setter for External.
     * Specify the type of refund you wish to initiate. When the prepayment is external, the
     * `external` flag is optional. But if the prepayment was made through a payment profile, the
     * `external` flag is required.
     * @param external Value for Boolean
     */
    @JsonSetter("external")
    public void setExternal(Boolean external) {
        this.external = external;
    }

    /**
     * Converts this RefundPrepayment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RefundPrepayment [" + "amountInCents=" + amountInCents + ", amount=" + amount
                + ", memo=" + memo + ", external=" + external + "]";
    }

    /**
     * Builds a new {@link RefundPrepayment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RefundPrepayment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amountInCents, amount, memo)
                .external(getExternal());
        return builder;
    }

    /**
     * Class to build instances of {@link RefundPrepayment}.
     */
    public static class Builder {
        private double amountInCents;
        private RefundPrepaymentAmount amount;
        private String memo;
        private Boolean external;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  amountInCents  double value for amountInCents.
         * @param  amount  RefundPrepaymentAmount value for amount.
         * @param  memo  String value for memo.
         */
        public Builder(double amountInCents, RefundPrepaymentAmount amount, String memo) {
            this.amountInCents = amountInCents;
            this.amount = amount;
            this.memo = memo;
        }

        /**
         * Setter for amountInCents.
         * @param  amountInCents  double value for amountInCents.
         * @return Builder
         */
        public Builder amountInCents(double amountInCents) {
            this.amountInCents = amountInCents;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  RefundPrepaymentAmount value for amount.
         * @return Builder
         */
        public Builder amount(RefundPrepaymentAmount amount) {
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
         * Setter for external.
         * @param  external  Boolean value for external.
         * @return Builder
         */
        public Builder external(Boolean external) {
            this.external = external;
            return this;
        }

        /**
         * Builds a new {@link RefundPrepayment} object using the set fields.
         * @return {@link RefundPrepayment}
         */
        public RefundPrepayment build() {
            return new RefundPrepayment(amountInCents, amount, memo, external);
        }
    }
}
