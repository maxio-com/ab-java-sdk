/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SubscriptionGroupPrepayment type.
 */
public class SubscriptionGroupPrepayment {
    private int amount;
    private String details;
    private String memo;
    private SubscriptionGroupPrepaymentMethod method;

    /**
     * Default constructor.
     */
    public SubscriptionGroupPrepayment() {
    }

    /**
     * Initialization constructor.
     * @param  amount  int value for amount.
     * @param  details  String value for details.
     * @param  memo  String value for memo.
     * @param  method  SubscriptionGroupPrepaymentMethod value for method.
     */
    public SubscriptionGroupPrepayment(
            int amount,
            String details,
            String memo,
            SubscriptionGroupPrepaymentMethod method) {
        this.amount = amount;
        this.details = details;
        this.memo = memo;
        this.method = method;
    }

    /**
     * Getter for Amount.
     * @return Returns the int
     */
    @JsonGetter("amount")
    public int getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * @param amount Value for int
     */
    @JsonSetter("amount")
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Getter for Details.
     * @return Returns the String
     */
    @JsonGetter("details")
    public String getDetails() {
        return details;
    }

    /**
     * Setter for Details.
     * @param details Value for String
     */
    @JsonSetter("details")
    public void setDetails(String details) {
        this.details = details;
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
     * Getter for Method.
     * @return Returns the SubscriptionGroupPrepaymentMethod
     */
    @JsonGetter("method")
    public SubscriptionGroupPrepaymentMethod getMethod() {
        return method;
    }

    /**
     * Setter for Method.
     * @param method Value for SubscriptionGroupPrepaymentMethod
     */
    @JsonSetter("method")
    public void setMethod(SubscriptionGroupPrepaymentMethod method) {
        this.method = method;
    }

    /**
     * Converts this SubscriptionGroupPrepayment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupPrepayment [" + "amount=" + amount + ", details=" + details
                + ", memo=" + memo + ", method=" + method + "]";
    }

    /**
     * Builds a new {@link SubscriptionGroupPrepayment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionGroupPrepayment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amount, details, memo, method);
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupPrepayment}.
     */
    public static class Builder {
        private int amount;
        private String details;
        private String memo;
        private SubscriptionGroupPrepaymentMethod method;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  amount  int value for amount.
         * @param  details  String value for details.
         * @param  memo  String value for memo.
         * @param  method  SubscriptionGroupPrepaymentMethod value for method.
         */
        public Builder(int amount, String details, String memo,
                SubscriptionGroupPrepaymentMethod method) {
            this.amount = amount;
            this.details = details;
            this.memo = memo;
            this.method = method;
        }

        /**
         * Setter for amount.
         * @param  amount  int value for amount.
         * @return Builder
         */
        public Builder amount(int amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for details.
         * @param  details  String value for details.
         * @return Builder
         */
        public Builder details(String details) {
            this.details = details;
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
         * Setter for method.
         * @param  method  SubscriptionGroupPrepaymentMethod value for method.
         * @return Builder
         */
        public Builder method(SubscriptionGroupPrepaymentMethod method) {
            this.method = method;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroupPrepayment} object using the set fields.
         * @return {@link SubscriptionGroupPrepayment}
         */
        public SubscriptionGroupPrepayment build() {
            return new SubscriptionGroupPrepayment(amount, details, memo, method);
        }
    }
}
