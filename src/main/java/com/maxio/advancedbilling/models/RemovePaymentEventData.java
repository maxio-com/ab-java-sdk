/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.containers.InvoiceEventPayment;
import io.apimatic.core.types.BaseModel;
import java.time.ZonedDateTime;

/**
 * This is a model class for RemovePaymentEventData type.
 */
public class RemovePaymentEventData
        extends BaseModel {
    private int transactionId;
    private String memo;
    private String originalAmount;
    private String appliedAmount;
    private ZonedDateTime transactionTime;
    private InvoiceEventPayment paymentMethod;
    private boolean prepayment;

    /**
     * Default constructor.
     */
    public RemovePaymentEventData() {
    }

    /**
     * Initialization constructor.
     * @param  transactionId  int value for transactionId.
     * @param  memo  String value for memo.
     * @param  appliedAmount  String value for appliedAmount.
     * @param  transactionTime  ZonedDateTime value for transactionTime.
     * @param  paymentMethod  InvoiceEventPayment value for paymentMethod.
     * @param  prepayment  boolean value for prepayment.
     * @param  originalAmount  String value for originalAmount.
     */
    public RemovePaymentEventData(
            int transactionId,
            String memo,
            String appliedAmount,
            ZonedDateTime transactionTime,
            InvoiceEventPayment paymentMethod,
            boolean prepayment,
            String originalAmount) {
        this.transactionId = transactionId;
        this.memo = memo;
        this.originalAmount = originalAmount;
        this.appliedAmount = appliedAmount;
        this.transactionTime = transactionTime;
        this.paymentMethod = paymentMethod;
        this.prepayment = prepayment;
    }

    /**
     * Initialization constructor.
     * @param  transactionId  int value for transactionId.
     * @param  memo  String value for memo.
     * @param  appliedAmount  String value for appliedAmount.
     * @param  transactionTime  ZonedDateTime value for transactionTime.
     * @param  paymentMethod  InvoiceEventPayment value for paymentMethod.
     * @param  prepayment  boolean value for prepayment.
     */
    @JsonCreator
    protected RemovePaymentEventData(
            @JsonProperty("transaction_id") int transactionId,
            @JsonProperty("memo") String memo,
            @JsonProperty("applied_amount") String appliedAmount,
            @JsonProperty("transaction_time") ZonedDateTime transactionTime,
            @JsonProperty("payment_method") InvoiceEventPayment paymentMethod,
            @JsonProperty("prepayment") boolean prepayment) {
        this(transactionId, memo, appliedAmount, transactionTime, paymentMethod, prepayment,
                null);
    }

    /**
     * Getter for TransactionId.
     * Transaction ID of the original payment that was removed
     * @return Returns the int
     */
    @JsonGetter("transaction_id")
    public int getTransactionId() {
        return transactionId;
    }

    /**
     * Setter for TransactionId.
     * Transaction ID of the original payment that was removed
     * @param transactionId Value for int
     */
    @JsonSetter("transaction_id")
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Getter for Memo.
     * Memo of the original payment
     * @return Returns the String
     */
    @JsonGetter("memo")
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
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("transaction_time")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getTransactionTime() {
        return transactionTime;
    }

    /**
     * Setter for TransactionTime.
     * Transaction time of the original payment, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z"
     * @param transactionTime Value for ZonedDateTime
     */
    @JsonSetter("transaction_time")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setTransactionTime(ZonedDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }

    /**
     * Getter for PaymentMethod.
     * A nested data structure detailing the method of payment
     * @return Returns the InvoiceEventPayment
     */
    @JsonGetter("payment_method")
    public InvoiceEventPayment getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Setter for PaymentMethod.
     * A nested data structure detailing the method of payment
     * @param paymentMethod Value for InvoiceEventPayment
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod(InvoiceEventPayment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Getter for Prepayment.
     * The flag that shows whether the original payment was a prepayment or not
     * @return Returns the boolean
     */
    @JsonGetter("prepayment")
    public boolean getPrepayment() {
        return prepayment;
    }

    /**
     * Setter for Prepayment.
     * The flag that shows whether the original payment was a prepayment or not
     * @param prepayment Value for boolean
     */
    @JsonSetter("prepayment")
    public void setPrepayment(boolean prepayment) {
        this.prepayment = prepayment;
    }

    /**
     * Converts this RemovePaymentEventData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RemovePaymentEventData [" + "transactionId=" + transactionId + ", memo=" + memo
                + ", appliedAmount=" + appliedAmount + ", transactionTime=" + transactionTime
                + ", paymentMethod=" + paymentMethod + ", prepayment=" + prepayment
                + ", originalAmount=" + originalAmount + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link RemovePaymentEventData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RemovePaymentEventData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(transactionId, memo, appliedAmount, transactionTime,
                paymentMethod, prepayment)
                .originalAmount(getOriginalAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link RemovePaymentEventData}.
     */
    public static class Builder {
        private int transactionId;
        private String memo;
        private String appliedAmount;
        private ZonedDateTime transactionTime;
        private InvoiceEventPayment paymentMethod;
        private boolean prepayment;
        private String originalAmount;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  transactionId  int value for transactionId.
         * @param  memo  String value for memo.
         * @param  appliedAmount  String value for appliedAmount.
         * @param  transactionTime  ZonedDateTime value for transactionTime.
         * @param  paymentMethod  InvoiceEventPayment value for paymentMethod.
         * @param  prepayment  boolean value for prepayment.
         */
        public Builder(int transactionId, String memo, String appliedAmount,
                ZonedDateTime transactionTime, InvoiceEventPayment paymentMethod,
                boolean prepayment) {
            this.transactionId = transactionId;
            this.memo = memo;
            this.appliedAmount = appliedAmount;
            this.transactionTime = transactionTime;
            this.paymentMethod = paymentMethod;
            this.prepayment = prepayment;
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
            this.memo = memo;
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
         * @param  transactionTime  ZonedDateTime value for transactionTime.
         * @return Builder
         */
        public Builder transactionTime(ZonedDateTime transactionTime) {
            this.transactionTime = transactionTime;
            return this;
        }

        /**
         * Setter for paymentMethod.
         * @param  paymentMethod  InvoiceEventPayment value for paymentMethod.
         * @return Builder
         */
        public Builder paymentMethod(InvoiceEventPayment paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        /**
         * Setter for prepayment.
         * @param  prepayment  boolean value for prepayment.
         * @return Builder
         */
        public Builder prepayment(boolean prepayment) {
            this.prepayment = prepayment;
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
         * Builds a new {@link RemovePaymentEventData} object using the set fields.
         * @return {@link RemovePaymentEventData}
         */
        public RemovePaymentEventData build() {
            return new RemovePaymentEventData(transactionId, memo, appliedAmount, transactionTime,
                    paymentMethod, prepayment, originalAmount);
        }
    }
}
