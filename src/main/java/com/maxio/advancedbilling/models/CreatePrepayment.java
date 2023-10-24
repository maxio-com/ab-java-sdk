/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreatePrepayment type.
 */
public class CreatePrepayment {
    private double amount;
    private String details;
    private String memo;
    private PrepaymentMethod method;
    private Integer paymentProfileId;

    /**
     * Default constructor.
     */
    public CreatePrepayment() {
    }

    /**
     * Initialization constructor.
     * @param  amount  double value for amount.
     * @param  details  String value for details.
     * @param  memo  String value for memo.
     * @param  method  PrepaymentMethod value for method.
     * @param  paymentProfileId  Integer value for paymentProfileId.
     */
    public CreatePrepayment(
            double amount,
            String details,
            String memo,
            PrepaymentMethod method,
            Integer paymentProfileId) {
        this.amount = amount;
        this.details = details;
        this.memo = memo;
        this.method = method;
        this.paymentProfileId = paymentProfileId;
    }

    /**
     * Getter for Amount.
     * @return Returns the double
     */
    @JsonGetter("amount")
    public double getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * @param amount Value for double
     */
    @JsonSetter("amount")
    public void setAmount(double amount) {
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
     * :- When the `method` specified is `"credit_card_on_file"`, the prepayment amount will be
     * collected using the default credit card payment profile and applied to the prepayment account
     * balance. This is especially useful for manual replenishment of prepaid subscriptions.
     * @return Returns the PrepaymentMethod
     */
    @JsonGetter("method")
    public PrepaymentMethod getMethod() {
        return method;
    }

    /**
     * Setter for Method.
     * :- When the `method` specified is `"credit_card_on_file"`, the prepayment amount will be
     * collected using the default credit card payment profile and applied to the prepayment account
     * balance. This is especially useful for manual replenishment of prepaid subscriptions.
     * @param method Value for PrepaymentMethod
     */
    @JsonSetter("method")
    public void setMethod(PrepaymentMethod method) {
        this.method = method;
    }

    /**
     * Getter for PaymentProfileId.
     * @return Returns the Integer
     */
    @JsonGetter("payment_profile_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPaymentProfileId() {
        return paymentProfileId;
    }

    /**
     * Setter for PaymentProfileId.
     * @param paymentProfileId Value for Integer
     */
    @JsonSetter("payment_profile_id")
    public void setPaymentProfileId(Integer paymentProfileId) {
        this.paymentProfileId = paymentProfileId;
    }

    /**
     * Converts this CreatePrepayment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreatePrepayment [" + "amount=" + amount + ", details=" + details + ", memo=" + memo
                + ", method=" + method + ", paymentProfileId=" + paymentProfileId + "]";
    }

    /**
     * Builds a new {@link CreatePrepayment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreatePrepayment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amount, details, memo, method)
                .paymentProfileId(getPaymentProfileId());
        return builder;
    }

    /**
     * Class to build instances of {@link CreatePrepayment}.
     */
    public static class Builder {
        private double amount;
        private String details;
        private String memo;
        private PrepaymentMethod method;
        private Integer paymentProfileId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  amount  double value for amount.
         * @param  details  String value for details.
         * @param  memo  String value for memo.
         * @param  method  PrepaymentMethod value for method.
         */
        public Builder(double amount, String details, String memo, PrepaymentMethod method) {
            this.amount = amount;
            this.details = details;
            this.memo = memo;
            this.method = method;
        }

        /**
         * Setter for amount.
         * @param  amount  double value for amount.
         * @return Builder
         */
        public Builder amount(double amount) {
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
         * @param  method  PrepaymentMethod value for method.
         * @return Builder
         */
        public Builder method(PrepaymentMethod method) {
            this.method = method;
            return this;
        }

        /**
         * Setter for paymentProfileId.
         * @param  paymentProfileId  Integer value for paymentProfileId.
         * @return Builder
         */
        public Builder paymentProfileId(Integer paymentProfileId) {
            this.paymentProfileId = paymentProfileId;
            return this;
        }

        /**
         * Builds a new {@link CreatePrepayment} object using the set fields.
         * @return {@link CreatePrepayment}
         */
        public CreatePrepayment build() {
            return new CreatePrepayment(amount, details, memo, method, paymentProfileId);
        }
    }
}
