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
import io.apimatic.core.types.OptionalNullable;
import java.time.ZonedDateTime;

/**
 * This is a model class for ApplyPaymentEventData type.
 */
public class ApplyPaymentEventData
        extends BaseModel {
    private String memo;
    private String originalAmount;
    private String appliedAmount;
    private ZonedDateTime transactionTime;
    private InvoiceEventPayment paymentMethod;
    private Integer transactionId;
    private OptionalNullable<Integer> parentInvoiceNumber;
    private OptionalNullable<String> remainingPrepaymentAmount;
    private Boolean prepayment;
    private Boolean external;

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
     * @param  transactionTime  ZonedDateTime value for transactionTime.
     * @param  paymentMethod  InvoiceEventPayment value for paymentMethod.
     * @param  transactionId  Integer value for transactionId.
     * @param  parentInvoiceNumber  Integer value for parentInvoiceNumber.
     * @param  remainingPrepaymentAmount  String value for remainingPrepaymentAmount.
     * @param  prepayment  Boolean value for prepayment.
     * @param  external  Boolean value for external.
     */
    public ApplyPaymentEventData(
            String memo,
            String originalAmount,
            String appliedAmount,
            ZonedDateTime transactionTime,
            InvoiceEventPayment paymentMethod,
            Integer transactionId,
            Integer parentInvoiceNumber,
            String remainingPrepaymentAmount,
            Boolean prepayment,
            Boolean external) {
        this.memo = memo;
        this.originalAmount = originalAmount;
        this.appliedAmount = appliedAmount;
        this.transactionTime = transactionTime;
        this.paymentMethod = paymentMethod;
        this.transactionId = transactionId;
        this.parentInvoiceNumber = OptionalNullable.of(parentInvoiceNumber);
        this.remainingPrepaymentAmount = OptionalNullable.of(remainingPrepaymentAmount);
        this.prepayment = prepayment;
        this.external = external;
    }

    /**
     * Initialization constructor.
     * @param  memo  String value for memo.
     * @param  originalAmount  String value for originalAmount.
     * @param  appliedAmount  String value for appliedAmount.
     * @param  transactionTime  ZonedDateTime value for transactionTime.
     * @param  paymentMethod  InvoiceEventPayment value for paymentMethod.
     * @param  transactionId  Integer value for transactionId.
     * @param  parentInvoiceNumber  Integer value for parentInvoiceNumber.
     * @param  remainingPrepaymentAmount  String value for remainingPrepaymentAmount.
     * @param  prepayment  Boolean value for prepayment.
     * @param  external  Boolean value for external.
     */

    protected ApplyPaymentEventData(String memo, String originalAmount, String appliedAmount,
            ZonedDateTime transactionTime, InvoiceEventPayment paymentMethod, Integer transactionId,
            OptionalNullable<Integer> parentInvoiceNumber,
            OptionalNullable<String> remainingPrepaymentAmount, Boolean prepayment,
            Boolean external) {
        this.memo = memo;
        this.originalAmount = originalAmount;
        this.appliedAmount = appliedAmount;
        this.transactionTime = transactionTime;
        this.paymentMethod = paymentMethod;
        this.transactionId = transactionId;
        this.parentInvoiceNumber = parentInvoiceNumber;
        this.remainingPrepaymentAmount = remainingPrepaymentAmount;
        this.prepayment = prepayment;
        this.external = external;
    }

    /**
     * Initialization constructor.
     * @param  memo  String value for memo.
     * @param  originalAmount  String value for originalAmount.
     * @param  appliedAmount  String value for appliedAmount.
     * @param  transactionTime  ZonedDateTime value for transactionTime.
     * @param  paymentMethod  InvoiceEventPayment value for paymentMethod.
     */
    @JsonCreator
    protected ApplyPaymentEventData(
            @JsonProperty("memo") String memo,
            @JsonProperty("original_amount") String originalAmount,
            @JsonProperty("applied_amount") String appliedAmount,
            @JsonProperty("transaction_time") ZonedDateTime transactionTime,
            @JsonProperty("payment_method") InvoiceEventPayment paymentMethod) {
        this(memo, originalAmount, appliedAmount, transactionTime, paymentMethod, null,
                OptionalNullable.of(null), OptionalNullable.of(null), null, null);
        unsetParentInvoiceNumber();
        unsetRemainingPrepaymentAmount();
    }

    /**
     * Getter for Memo.
     * The payment memo
     * @return Returns the String
     */
    @JsonGetter("memo")
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
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("transaction_time")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getTransactionTime() {
        return transactionTime;
    }

    /**
     * Setter for TransactionTime.
     * The time the payment was applied, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z"
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
     * Internal Getter for ParentInvoiceNumber.
     * @return Returns the Internal Integer
     */
    @JsonGetter("parent_invoice_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetParentInvoiceNumber() {
        return this.parentInvoiceNumber;
    }

    /**
     * Getter for ParentInvoiceNumber.
     * @return Returns the Integer
     */
    public Integer getParentInvoiceNumber() {
        return OptionalNullable.getFrom(parentInvoiceNumber);
    }

    /**
     * Setter for ParentInvoiceNumber.
     * @param parentInvoiceNumber Value for Integer
     */
    @JsonSetter("parent_invoice_number")
    public void setParentInvoiceNumber(Integer parentInvoiceNumber) {
        this.parentInvoiceNumber = OptionalNullable.of(parentInvoiceNumber);
    }

    /**
     * UnSetter for ParentInvoiceNumber.
     */
    public void unsetParentInvoiceNumber() {
        parentInvoiceNumber = null;
    }

    /**
     * Internal Getter for RemainingPrepaymentAmount.
     * @return Returns the Internal String
     */
    @JsonGetter("remaining_prepayment_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetRemainingPrepaymentAmount() {
        return this.remainingPrepaymentAmount;
    }

    /**
     * Getter for RemainingPrepaymentAmount.
     * @return Returns the String
     */
    public String getRemainingPrepaymentAmount() {
        return OptionalNullable.getFrom(remainingPrepaymentAmount);
    }

    /**
     * Setter for RemainingPrepaymentAmount.
     * @param remainingPrepaymentAmount Value for String
     */
    @JsonSetter("remaining_prepayment_amount")
    public void setRemainingPrepaymentAmount(String remainingPrepaymentAmount) {
        this.remainingPrepaymentAmount = OptionalNullable.of(remainingPrepaymentAmount);
    }

    /**
     * UnSetter for RemainingPrepaymentAmount.
     */
    public void unsetRemainingPrepaymentAmount() {
        remainingPrepaymentAmount = null;
    }

    /**
     * Getter for Prepayment.
     * @return Returns the Boolean
     */
    @JsonGetter("prepayment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPrepayment() {
        return prepayment;
    }

    /**
     * Setter for Prepayment.
     * @param prepayment Value for Boolean
     */
    @JsonSetter("prepayment")
    public void setPrepayment(Boolean prepayment) {
        this.prepayment = prepayment;
    }

    /**
     * Getter for External.
     * @return Returns the Boolean
     */
    @JsonGetter("external")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getExternal() {
        return external;
    }

    /**
     * Setter for External.
     * @param external Value for Boolean
     */
    @JsonSetter("external")
    public void setExternal(Boolean external) {
        this.external = external;
    }

    /**
     * Converts this ApplyPaymentEventData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApplyPaymentEventData [" + "memo=" + memo + ", originalAmount=" + originalAmount
                + ", appliedAmount=" + appliedAmount + ", transactionTime=" + transactionTime
                + ", paymentMethod=" + paymentMethod + ", transactionId=" + transactionId
                + ", parentInvoiceNumber=" + parentInvoiceNumber + ", remainingPrepaymentAmount="
                + remainingPrepaymentAmount + ", prepayment=" + prepayment + ", external="
                + external + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ApplyPaymentEventData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApplyPaymentEventData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(memo, originalAmount, appliedAmount, transactionTime,
                paymentMethod)
                .transactionId(getTransactionId())
                .prepayment(getPrepayment())
                .external(getExternal());
        builder.parentInvoiceNumber = internalGetParentInvoiceNumber();
        builder.remainingPrepaymentAmount = internalGetRemainingPrepaymentAmount();
        return builder;
    }

    /**
     * Class to build instances of {@link ApplyPaymentEventData}.
     */
    public static class Builder {
        private String memo;
        private String originalAmount;
        private String appliedAmount;
        private ZonedDateTime transactionTime;
        private InvoiceEventPayment paymentMethod;
        private Integer transactionId;
        private OptionalNullable<Integer> parentInvoiceNumber;
        private OptionalNullable<String> remainingPrepaymentAmount;
        private Boolean prepayment;
        private Boolean external;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  memo  String value for memo.
         * @param  originalAmount  String value for originalAmount.
         * @param  appliedAmount  String value for appliedAmount.
         * @param  transactionTime  ZonedDateTime value for transactionTime.
         * @param  paymentMethod  InvoiceEventPayment value for paymentMethod.
         */
        public Builder(String memo, String originalAmount, String appliedAmount,
                ZonedDateTime transactionTime, InvoiceEventPayment paymentMethod) {
            this.memo = memo;
            this.originalAmount = originalAmount;
            this.appliedAmount = appliedAmount;
            this.transactionTime = transactionTime;
            this.paymentMethod = paymentMethod;
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
         * Setter for transactionId.
         * @param  transactionId  Integer value for transactionId.
         * @return Builder
         */
        public Builder transactionId(Integer transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        /**
         * Setter for parentInvoiceNumber.
         * @param  parentInvoiceNumber  Integer value for parentInvoiceNumber.
         * @return Builder
         */
        public Builder parentInvoiceNumber(Integer parentInvoiceNumber) {
            this.parentInvoiceNumber = OptionalNullable.of(parentInvoiceNumber);
            return this;
        }

        /**
         * UnSetter for parentInvoiceNumber.
         * @return Builder
         */
        public Builder unsetParentInvoiceNumber() {
            parentInvoiceNumber = null;
            return this;
        }

        /**
         * Setter for remainingPrepaymentAmount.
         * @param  remainingPrepaymentAmount  String value for remainingPrepaymentAmount.
         * @return Builder
         */
        public Builder remainingPrepaymentAmount(String remainingPrepaymentAmount) {
            this.remainingPrepaymentAmount = OptionalNullable.of(remainingPrepaymentAmount);
            return this;
        }

        /**
         * UnSetter for remainingPrepaymentAmount.
         * @return Builder
         */
        public Builder unsetRemainingPrepaymentAmount() {
            remainingPrepaymentAmount = null;
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
         * Setter for external.
         * @param  external  Boolean value for external.
         * @return Builder
         */
        public Builder external(Boolean external) {
            this.external = external;
            return this;
        }

        /**
         * Builds a new {@link ApplyPaymentEventData} object using the set fields.
         * @return {@link ApplyPaymentEventData}
         */
        public ApplyPaymentEventData build() {
            return new ApplyPaymentEventData(memo, originalAmount, appliedAmount, transactionTime,
                    paymentMethod, transactionId, parentInvoiceNumber, remainingPrepaymentAmount,
                    prepayment, external);
        }
    }
}
