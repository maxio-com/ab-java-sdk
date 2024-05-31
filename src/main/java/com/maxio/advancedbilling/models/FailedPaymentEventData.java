/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for FailedPaymentEventData type.
 */
public class FailedPaymentEventData
        extends BaseModel {
    private int amountInCents;
    private int appliedAmount;
    private OptionalNullable<String> memo;
    private InvoicePaymentMethodType paymentMethod;
    private int transactionId;

    /**
     * Default constructor.
     */
    public FailedPaymentEventData() {
    }

    /**
     * Initialization constructor.
     * @param  amountInCents  int value for amountInCents.
     * @param  appliedAmount  int value for appliedAmount.
     * @param  paymentMethod  InvoicePaymentMethodType value for paymentMethod.
     * @param  transactionId  int value for transactionId.
     * @param  memo  String value for memo.
     */
    public FailedPaymentEventData(
            int amountInCents,
            int appliedAmount,
            InvoicePaymentMethodType paymentMethod,
            int transactionId,
            String memo) {
        this.amountInCents = amountInCents;
        this.appliedAmount = appliedAmount;
        this.memo = OptionalNullable.of(memo);
        this.paymentMethod = paymentMethod;
        this.transactionId = transactionId;
    }

    /**
     * Initialization constructor.
     * @param  amountInCents  int value for amountInCents.
     * @param  appliedAmount  int value for appliedAmount.
     * @param  paymentMethod  InvoicePaymentMethodType value for paymentMethod.
     * @param  transactionId  int value for transactionId.
     * @param  memo  String value for memo.
     */

    protected FailedPaymentEventData(int amountInCents, int appliedAmount,
            InvoicePaymentMethodType paymentMethod, int transactionId,
            OptionalNullable<String> memo) {
        this.amountInCents = amountInCents;
        this.appliedAmount = appliedAmount;
        this.memo = memo;
        this.paymentMethod = paymentMethod;
        this.transactionId = transactionId;
    }

    /**
     * Getter for AmountInCents.
     * The monetary value of the payment, expressed in cents.
     * @return Returns the int
     */
    @JsonGetter("amount_in_cents")
    public int getAmountInCents() {
        return amountInCents;
    }

    /**
     * Setter for AmountInCents.
     * The monetary value of the payment, expressed in cents.
     * @param amountInCents Value for int
     */
    @JsonSetter("amount_in_cents")
    public void setAmountInCents(int amountInCents) {
        this.amountInCents = amountInCents;
    }

    /**
     * Getter for AppliedAmount.
     * The monetary value of the payment, expressed in dollars.
     * @return Returns the int
     */
    @JsonGetter("applied_amount")
    public int getAppliedAmount() {
        return appliedAmount;
    }

    /**
     * Setter for AppliedAmount.
     * The monetary value of the payment, expressed in dollars.
     * @param appliedAmount Value for int
     */
    @JsonSetter("applied_amount")
    public void setAppliedAmount(int appliedAmount) {
        this.appliedAmount = appliedAmount;
    }

    /**
     * Internal Getter for Memo.
     * The memo passed when the payment was created.
     * @return Returns the Internal String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetMemo() {
        return this.memo;
    }

    /**
     * Getter for Memo.
     * The memo passed when the payment was created.
     * @return Returns the String
     */
    public String getMemo() {
        return OptionalNullable.getFrom(memo);
    }

    /**
     * Setter for Memo.
     * The memo passed when the payment was created.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = OptionalNullable.of(memo);
    }

    /**
     * UnSetter for Memo.
     * The memo passed when the payment was created.
     */
    public void unsetMemo() {
        memo = null;
    }

    /**
     * Getter for PaymentMethod.
     * @return Returns the InvoicePaymentMethodType
     */
    @JsonGetter("payment_method")
    public InvoicePaymentMethodType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Setter for PaymentMethod.
     * @param paymentMethod Value for InvoicePaymentMethodType
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod(InvoicePaymentMethodType paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Getter for TransactionId.
     * The transaction ID of the failed payment.
     * @return Returns the int
     */
    @JsonGetter("transaction_id")
    public int getTransactionId() {
        return transactionId;
    }

    /**
     * Setter for TransactionId.
     * The transaction ID of the failed payment.
     * @param transactionId Value for int
     */
    @JsonSetter("transaction_id")
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Converts this FailedPaymentEventData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FailedPaymentEventData [" + "amountInCents=" + amountInCents + ", appliedAmount="
                + appliedAmount + ", paymentMethod=" + paymentMethod + ", transactionId="
                + transactionId + ", memo=" + memo + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link FailedPaymentEventData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FailedPaymentEventData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amountInCents, appliedAmount, paymentMethod, transactionId);
        builder.memo = internalGetMemo();
        return builder;
    }

    /**
     * Class to build instances of {@link FailedPaymentEventData}.
     */
    public static class Builder {
        private int amountInCents;
        private int appliedAmount;
        private InvoicePaymentMethodType paymentMethod;
        private int transactionId;
        private OptionalNullable<String> memo;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  amountInCents  int value for amountInCents.
         * @param  appliedAmount  int value for appliedAmount.
         * @param  paymentMethod  InvoicePaymentMethodType value for paymentMethod.
         * @param  transactionId  int value for transactionId.
         */
        public Builder(int amountInCents, int appliedAmount, InvoicePaymentMethodType paymentMethod,
                int transactionId) {
            this.amountInCents = amountInCents;
            this.appliedAmount = appliedAmount;
            this.paymentMethod = paymentMethod;
            this.transactionId = transactionId;
        }

        /**
         * Setter for amountInCents.
         * @param  amountInCents  int value for amountInCents.
         * @return Builder
         */
        public Builder amountInCents(int amountInCents) {
            this.amountInCents = amountInCents;
            return this;
        }

        /**
         * Setter for appliedAmount.
         * @param  appliedAmount  int value for appliedAmount.
         * @return Builder
         */
        public Builder appliedAmount(int appliedAmount) {
            this.appliedAmount = appliedAmount;
            return this;
        }

        /**
         * Setter for paymentMethod.
         * @param  paymentMethod  InvoicePaymentMethodType value for paymentMethod.
         * @return Builder
         */
        public Builder paymentMethod(InvoicePaymentMethodType paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        /**
         * Setter for transactionId.
         * @param  transactionId  int value for transactionId.
         * @return Builder
         */
        public Builder transactionId(int transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        /**
         * Setter for memo.
         * @param  memo  String value for memo.
         * @return Builder
         */
        public Builder memo(String memo) {
            this.memo = OptionalNullable.of(memo);
            return this;
        }

        /**
         * UnSetter for memo.
         * @return Builder
         */
        public Builder unsetMemo() {
            memo = null;
            return this;
        }

        /**
         * Builds a new {@link FailedPaymentEventData} object using the set fields.
         * @return {@link FailedPaymentEventData}
         */
        public FailedPaymentEventData build() {
            return new FailedPaymentEventData(amountInCents, appliedAmount, paymentMethod,
                    transactionId, memo);
        }
    }
}
