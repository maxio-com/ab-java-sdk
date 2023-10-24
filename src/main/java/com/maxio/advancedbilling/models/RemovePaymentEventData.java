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
import com.maxio.advancedbilling.models.containers.RemovePaymentEventDataPaymentMethod;
import java.time.LocalDateTime;

/**
 * This is a model class for RemovePaymentEventData type.
 */
public class RemovePaymentEventData {
    private Integer transactionId;
    private String memo;
    private String originalAmount;
    private String appliedAmount;
    private LocalDateTime transactionTime;
    private RemovePaymentEventDataPaymentMethod paymentMethod;
    private Boolean prepayment;

    /**
     * Default constructor.
     */
    public RemovePaymentEventData() {
    }

    /**
     * Initialization constructor.
     * @param  transactionId  Integer value for transactionId.
     * @param  memo  String value for memo.
     * @param  originalAmount  String value for originalAmount.
     * @param  appliedAmount  String value for appliedAmount.
     * @param  transactionTime  LocalDateTime value for transactionTime.
     * @param  paymentMethod  RemovePaymentEventDataPaymentMethod value for paymentMethod.
     * @param  prepayment  Boolean value for prepayment.
     */
    public RemovePaymentEventData(
            Integer transactionId,
            String memo,
            String originalAmount,
            String appliedAmount,
            LocalDateTime transactionTime,
            RemovePaymentEventDataPaymentMethod paymentMethod,
            Boolean prepayment) {
        this.transactionId = transactionId;
        this.memo = memo;
        this.originalAmount = originalAmount;
        this.appliedAmount = appliedAmount;
        this.transactionTime = transactionTime;
        this.paymentMethod = paymentMethod;
        this.prepayment = prepayment;
    }

    /**
     * Getter for TransactionId.
     * Transaction ID of the original payment that was removed
     * @return Returns the Integer
     */
    @JsonGetter("transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTransactionId() {
        return transactionId;
    }

    /**
     * Setter for TransactionId.
     * Transaction ID of the original payment that was removed
     * @param transactionId Value for Integer
     */
    @JsonSetter("transaction_id")
    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Getter for Memo.
     * Memo of the original payment
     * @return Returns the String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * Memo of the original payment
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter for OriginalAmount.
     * Full amount of the original payment
     * @return Returns the String
     */
    @JsonGetter("original_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOriginalAmount() {
        return originalAmount;
    }

    /**
     * Setter for OriginalAmount.
     * Full amount of the original payment
     * @param originalAmount Value for String
     */
    @JsonSetter("original_amount")
    public void setOriginalAmount(String originalAmount) {
        this.originalAmount = originalAmount;
    }

    /**
     * Getter for AppliedAmount.
     * Applied amount of the original payment
     * @return Returns the String
     */
    @JsonGetter("applied_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAppliedAmount() {
        return appliedAmount;
    }

    /**
     * Setter for AppliedAmount.
     * Applied amount of the original payment
     * @param appliedAmount Value for String
     */
    @JsonSetter("applied_amount")
    public void setAppliedAmount(String appliedAmount) {
        this.appliedAmount = appliedAmount;
    }

    /**
     * Getter for TransactionTime.
     * Transaction time of the original payment, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z"
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
     * Transaction time of the original payment, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z"
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
     * @return Returns the RemovePaymentEventDataPaymentMethod
     */
    @JsonGetter("payment_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RemovePaymentEventDataPaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Setter for PaymentMethod.
     * A nested data structure detailing the method of payment
     * @param paymentMethod Value for RemovePaymentEventDataPaymentMethod
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod(RemovePaymentEventDataPaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Getter for Prepayment.
     * The flag that shows whether the original payment was a prepayment or not
     * @return Returns the Boolean
     */
    @JsonGetter("prepayment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPrepayment() {
        return prepayment;
    }

    /**
     * Setter for Prepayment.
     * The flag that shows whether the original payment was a prepayment or not
     * @param prepayment Value for Boolean
     */
    @JsonSetter("prepayment")
    public void setPrepayment(Boolean prepayment) {
        this.prepayment = prepayment;
    }

    /**
     * Converts this RemovePaymentEventData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RemovePaymentEventData [" + "transactionId=" + transactionId + ", memo=" + memo
                + ", originalAmount=" + originalAmount + ", appliedAmount=" + appliedAmount
                + ", transactionTime=" + transactionTime + ", paymentMethod=" + paymentMethod
                + ", prepayment=" + prepayment + "]";
    }

    /**
     * Builds a new {@link RemovePaymentEventData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RemovePaymentEventData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .transactionId(getTransactionId())
                .memo(getMemo())
                .originalAmount(getOriginalAmount())
                .appliedAmount(getAppliedAmount())
                .transactionTime(getTransactionTime())
                .paymentMethod(getPaymentMethod())
                .prepayment(getPrepayment());
        return builder;
    }

    /**
     * Class to build instances of {@link RemovePaymentEventData}.
     */
    public static class Builder {
        private Integer transactionId;
        private String memo;
        private String originalAmount;
        private String appliedAmount;
        private LocalDateTime transactionTime;
        private RemovePaymentEventDataPaymentMethod paymentMethod;
        private Boolean prepayment;



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
         * @param  paymentMethod  RemovePaymentEventDataPaymentMethod value for paymentMethod.
         * @return Builder
         */
        public Builder paymentMethod(RemovePaymentEventDataPaymentMethod paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        /**
         * Setter for prepayment.
         * @param  prepayment  Boolean value for prepayment.
         * @return Builder
         */
        public Builder prepayment(Boolean prepayment) {
            this.prepayment = prepayment;
            return this;
        }

        /**
         * Builds a new {@link RemovePaymentEventData} object using the set fields.
         * @return {@link RemovePaymentEventData}
         */
        public RemovePaymentEventData build() {
            return new RemovePaymentEventData(transactionId, memo, originalAmount, appliedAmount,
                    transactionTime, paymentMethod, prepayment);
        }
    }
}
