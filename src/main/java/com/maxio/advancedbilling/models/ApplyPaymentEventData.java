/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.containers.ApplyPaymentEventDataPaymentMethod;
import java.time.LocalDateTime;

/**
 * This is a model class for ApplyPaymentEventData type.
 */
public class ApplyPaymentEventData {
    private String memo;
    private String originalAmount;
    private String appliedAmount;
    private LocalDateTime transactionTime;
    private ApplyPaymentEventDataPaymentMethod paymentMethod;
    private Integer transactionId;

    /**
     * Default constructor.
     */
    public ApplyPaymentEventData() {
    }

    /**
     * Initialization constructor.
     * @param  memo  String value for memo.
     * @param  originalAmount  String value for originalAmount.
     * @param  appliedAmount  String value for appliedAmount.
     * @param  transactionTime  LocalDateTime value for transactionTime.
     * @param  paymentMethod  ApplyPaymentEventDataPaymentMethod value for paymentMethod.
     * @param  transactionId  Integer value for transactionId.
     */
    public ApplyPaymentEventData(
            String memo,
            String originalAmount,
            String appliedAmount,
            LocalDateTime transactionTime,
            ApplyPaymentEventDataPaymentMethod paymentMethod,
            Integer transactionId) {
        this.memo = memo;
        this.originalAmount = originalAmount;
        this.appliedAmount = appliedAmount;
        this.transactionTime = transactionTime;
        this.paymentMethod = paymentMethod;
        this.transactionId = transactionId;
    }

    /**
     * Getter for Memo.
     * The payment memo
     * @return Returns the String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * The payment memo
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter for OriginalAmount.
     * The full, original amount of the payment transaction as a string in full units. Incoming
     * payments can be split amongst several invoices, which will result in a `applied_amount` less
     * than the `original_amount`. Example: A $100.99 payment, of which $40.11 is applied to this
     * invoice, will have an `original_amount` of `"100.99"`.
     * @return Returns the String
     */
    @JsonGetter("original_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOriginalAmount() {
        return originalAmount;
    }

    /**
     * Setter for OriginalAmount.
     * The full, original amount of the payment transaction as a string in full units. Incoming
     * payments can be split amongst several invoices, which will result in a `applied_amount` less
     * than the `original_amount`. Example: A $100.99 payment, of which $40.11 is applied to this
     * invoice, will have an `original_amount` of `"100.99"`.
     * @param originalAmount Value for String
     */
    @JsonSetter("original_amount")
    public void setOriginalAmount(String originalAmount) {
        this.originalAmount = originalAmount;
    }

    /**
     * Getter for AppliedAmount.
     * The amount of the payment applied to this invoice. Incoming payments can be split amongst
     * several invoices, which will result in a `applied_amount` less than the `original_amount`.
     * Example: A $100.99 payment, of which $40.11 is applied to this invoice, will have an
     * `applied_amount` of `"40.11"`.
     * @return Returns the String
     */
    @JsonGetter("applied_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAppliedAmount() {
        return appliedAmount;
    }

    /**
     * Setter for AppliedAmount.
     * The amount of the payment applied to this invoice. Incoming payments can be split amongst
     * several invoices, which will result in a `applied_amount` less than the `original_amount`.
     * Example: A $100.99 payment, of which $40.11 is applied to this invoice, will have an
     * `applied_amount` of `"40.11"`.
     * @param appliedAmount Value for String
     */
    @JsonSetter("applied_amount")
    public void setAppliedAmount(String appliedAmount) {
        this.appliedAmount = appliedAmount;
    }

    /**
     * Getter for TransactionTime.
     * The time the payment was applied, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z"
     * @return Returns the LocalDateTime
     */
    @JsonGetter("transaction_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }

    /**
     * Setter for TransactionTime.
     * The time the payment was applied, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z"
     * @param transactionTime Value for LocalDateTime
     */
    @JsonSetter("transaction_time")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setTransactionTime(LocalDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }

    /**
     * Getter for PaymentMethod.
     * A nested data structure detailing the method of payment
     * @return Returns the ApplyPaymentEventDataPaymentMethod
     */
    @JsonGetter("payment_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ApplyPaymentEventDataPaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Setter for PaymentMethod.
     * A nested data structure detailing the method of payment
     * @param paymentMethod Value for ApplyPaymentEventDataPaymentMethod
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod(ApplyPaymentEventDataPaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Getter for TransactionId.
     * The Chargify id of the original payment
     * @return Returns the Integer
     */
    @JsonGetter("transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTransactionId() {
        return transactionId;
    }

    /**
     * Setter for TransactionId.
     * The Chargify id of the original payment
     * @param transactionId Value for Integer
     */
    @JsonSetter("transaction_id")
    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Converts this ApplyPaymentEventData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApplyPaymentEventData [" + "memo=" + memo + ", originalAmount=" + originalAmount
                + ", appliedAmount=" + appliedAmount + ", transactionTime=" + transactionTime
                + ", paymentMethod=" + paymentMethod + ", transactionId=" + transactionId + "]";
    }

    /**
     * Builds a new {@link ApplyPaymentEventData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApplyPaymentEventData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .memo(getMemo())
                .originalAmount(getOriginalAmount())
                .appliedAmount(getAppliedAmount())
                .transactionTime(getTransactionTime())
                .paymentMethod(getPaymentMethod())
                .transactionId(getTransactionId());
        return builder;
    }

    /**
     * Class to build instances of {@link ApplyPaymentEventData}.
     */
    public static class Builder {
        private String memo;
        private String originalAmount;
        private String appliedAmount;
        private LocalDateTime transactionTime;
        private ApplyPaymentEventDataPaymentMethod paymentMethod;
        private Integer transactionId;



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
         * Setter for originalAmount.
         * @param  originalAmount  String value for originalAmount.
         * @return Builder
         */
        public Builder originalAmount(String originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }

        /**
         * Setter for appliedAmount.
         * @param  appliedAmount  String value for appliedAmount.
         * @return Builder
         */
        public Builder appliedAmount(String appliedAmount) {
            this.appliedAmount = appliedAmount;
            return this;
        }

        /**
         * Setter for transactionTime.
         * @param  transactionTime  LocalDateTime value for transactionTime.
         * @return Builder
         */
        public Builder transactionTime(LocalDateTime transactionTime) {
            this.transactionTime = transactionTime;
            return this;
        }

        /**
         * Setter for paymentMethod.
         * @param  paymentMethod  ApplyPaymentEventDataPaymentMethod value for paymentMethod.
         * @return Builder
         */
        public Builder paymentMethod(ApplyPaymentEventDataPaymentMethod paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        /**
         * Setter for transactionId.
         * @param  transactionId  Integer value for transactionId.
         * @return Builder
         */
        public Builder transactionId(Integer transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        /**
         * Builds a new {@link ApplyPaymentEventData} object using the set fields.
         * @return {@link ApplyPaymentEventData}
         */
        public ApplyPaymentEventData build() {
            return new ApplyPaymentEventData(memo, originalAmount, appliedAmount, transactionTime,
                    paymentMethod, transactionId);
        }
    }
}
