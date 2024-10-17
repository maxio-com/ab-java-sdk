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
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.time.LocalDate;
import java.time.ZonedDateTime;

/**
 * This is a model class for InvoicePayment type.
 */
public class InvoicePayment
        extends BaseModel {
    private ZonedDateTime transactionTime;
    private String memo;
    private String originalAmount;
    private String appliedAmount;
    private InvoicePaymentMethod paymentMethod;
    private Integer transactionId;
    private Boolean prepayment;
    private OptionalNullable<String> gatewayHandle;
    private String gatewayUsed;
    private OptionalNullable<String> gatewayTransactionId;
    private OptionalNullable<LocalDate> receivedOn;
    private String uid;

    /**
     * Default constructor.
     */
    public InvoicePayment() {
    }

    /**
     * Initialization constructor.
     * @param  transactionTime  ZonedDateTime value for transactionTime.
     * @param  memo  String value for memo.
     * @param  originalAmount  String value for originalAmount.
     * @param  appliedAmount  String value for appliedAmount.
     * @param  paymentMethod  InvoicePaymentMethod value for paymentMethod.
     * @param  transactionId  Integer value for transactionId.
     * @param  prepayment  Boolean value for prepayment.
     * @param  gatewayHandle  String value for gatewayHandle.
     * @param  gatewayUsed  String value for gatewayUsed.
     * @param  gatewayTransactionId  String value for gatewayTransactionId.
     * @param  receivedOn  LocalDate value for receivedOn.
     * @param  uid  String value for uid.
     */
    public InvoicePayment(
            ZonedDateTime transactionTime,
            String memo,
            String originalAmount,
            String appliedAmount,
            InvoicePaymentMethod paymentMethod,
            Integer transactionId,
            Boolean prepayment,
            String gatewayHandle,
            String gatewayUsed,
            String gatewayTransactionId,
            LocalDate receivedOn,
            String uid) {
        this.transactionTime = transactionTime;
        this.memo = memo;
        this.originalAmount = originalAmount;
        this.appliedAmount = appliedAmount;
        this.paymentMethod = paymentMethod;
        this.transactionId = transactionId;
        this.prepayment = prepayment;
        this.gatewayHandle = OptionalNullable.of(gatewayHandle);
        this.gatewayUsed = gatewayUsed;
        this.gatewayTransactionId = OptionalNullable.of(gatewayTransactionId);
        this.receivedOn = OptionalNullable.of(receivedOn);
        this.uid = uid;
    }

    /**
     * Initialization constructor.
     * @param  transactionTime  ZonedDateTime value for transactionTime.
     * @param  memo  String value for memo.
     * @param  originalAmount  String value for originalAmount.
     * @param  appliedAmount  String value for appliedAmount.
     * @param  paymentMethod  InvoicePaymentMethod value for paymentMethod.
     * @param  transactionId  Integer value for transactionId.
     * @param  prepayment  Boolean value for prepayment.
     * @param  gatewayHandle  String value for gatewayHandle.
     * @param  gatewayUsed  String value for gatewayUsed.
     * @param  gatewayTransactionId  String value for gatewayTransactionId.
     * @param  receivedOn  LocalDate value for receivedOn.
     * @param  uid  String value for uid.
     */

    protected InvoicePayment(ZonedDateTime transactionTime, String memo, String originalAmount,
            String appliedAmount, InvoicePaymentMethod paymentMethod, Integer transactionId,
            Boolean prepayment, OptionalNullable<String> gatewayHandle, String gatewayUsed,
            OptionalNullable<String> gatewayTransactionId, OptionalNullable<LocalDate> receivedOn,
            String uid) {
        this.transactionTime = transactionTime;
        this.memo = memo;
        this.originalAmount = originalAmount;
        this.appliedAmount = appliedAmount;
        this.paymentMethod = paymentMethod;
        this.transactionId = transactionId;
        this.prepayment = prepayment;
        this.gatewayHandle = gatewayHandle;
        this.gatewayUsed = gatewayUsed;
        this.gatewayTransactionId = gatewayTransactionId;
        this.receivedOn = receivedOn;
        this.uid = uid;
    }

    /**
     * Getter for TransactionTime.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("transaction_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getTransactionTime() {
        return transactionTime;
    }

    /**
     * Setter for TransactionTime.
     * @param transactionTime Value for ZonedDateTime
     */
    @JsonSetter("transaction_time")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setTransactionTime(ZonedDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }

    /**
     * Getter for Memo.
     * @return Returns the String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for OriginalAmount.
     * @return Returns the String
     */
    @JsonGetter("original_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOriginalAmount() {
        return originalAmount;
    }

    /**
     * Setter for OriginalAmount.
     * @param originalAmount Value for String
     */
    @JsonSetter("original_amount")
    public void setOriginalAmount(String originalAmount) {
        this.originalAmount = originalAmount;
    }

    /**
     * Getter for AppliedAmount.
     * @return Returns the String
     */
    @JsonGetter("applied_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAppliedAmount() {
        return appliedAmount;
    }

    /**
     * Setter for AppliedAmount.
     * @param appliedAmount Value for String
     */
    @JsonSetter("applied_amount")
    public void setAppliedAmount(String appliedAmount) {
        this.appliedAmount = appliedAmount;
    }

    /**
     * Getter for PaymentMethod.
     * @return Returns the InvoicePaymentMethod
     */
    @JsonGetter("payment_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoicePaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Setter for PaymentMethod.
     * @param paymentMethod Value for InvoicePaymentMethod
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod(InvoicePaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Getter for TransactionId.
     * @return Returns the Integer
     */
    @JsonGetter("transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTransactionId() {
        return transactionId;
    }

    /**
     * Setter for TransactionId.
     * @param transactionId Value for Integer
     */
    @JsonSetter("transaction_id")
    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
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
     * Internal Getter for GatewayHandle.
     * @return Returns the Internal String
     */
    @JsonGetter("gateway_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetGatewayHandle() {
        return this.gatewayHandle;
    }

    /**
     * Getter for GatewayHandle.
     * @return Returns the String
     */
    public String getGatewayHandle() {
        return OptionalNullable.getFrom(gatewayHandle);
    }

    /**
     * Setter for GatewayHandle.
     * @param gatewayHandle Value for String
     */
    @JsonSetter("gateway_handle")
    public void setGatewayHandle(String gatewayHandle) {
        this.gatewayHandle = OptionalNullable.of(gatewayHandle);
    }

    /**
     * UnSetter for GatewayHandle.
     */
    public void unsetGatewayHandle() {
        gatewayHandle = null;
    }

    /**
     * Getter for GatewayUsed.
     * @return Returns the String
     */
    @JsonGetter("gateway_used")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGatewayUsed() {
        return gatewayUsed;
    }

    /**
     * Setter for GatewayUsed.
     * @param gatewayUsed Value for String
     */
    @JsonSetter("gateway_used")
    public void setGatewayUsed(String gatewayUsed) {
        this.gatewayUsed = gatewayUsed;
    }

    /**
     * Internal Getter for GatewayTransactionId.
     * The transaction ID for the payment as returned from the payment gateway
     * @return Returns the Internal String
     */
    @JsonGetter("gateway_transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetGatewayTransactionId() {
        return this.gatewayTransactionId;
    }

    /**
     * Getter for GatewayTransactionId.
     * The transaction ID for the payment as returned from the payment gateway
     * @return Returns the String
     */
    public String getGatewayTransactionId() {
        return OptionalNullable.getFrom(gatewayTransactionId);
    }

    /**
     * Setter for GatewayTransactionId.
     * The transaction ID for the payment as returned from the payment gateway
     * @param gatewayTransactionId Value for String
     */
    @JsonSetter("gateway_transaction_id")
    public void setGatewayTransactionId(String gatewayTransactionId) {
        this.gatewayTransactionId = OptionalNullable.of(gatewayTransactionId);
    }

    /**
     * UnSetter for GatewayTransactionId.
     * The transaction ID for the payment as returned from the payment gateway
     */
    public void unsetGatewayTransactionId() {
        gatewayTransactionId = null;
    }

    /**
     * Internal Getter for ReceivedOn.
     * Date reflecting when the payment was received from a customer. Must be in the past.
     * Applicable only to `external` payments.
     * @return Returns the Internal LocalDate
     */
    @JsonGetter("received_on")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.SimpleDateSerializer.class)
    protected OptionalNullable<LocalDate> internalGetReceivedOn() {
        return this.receivedOn;
    }

    /**
     * Getter for ReceivedOn.
     * Date reflecting when the payment was received from a customer. Must be in the past.
     * Applicable only to `external` payments.
     * @return Returns the LocalDate
     */
    public LocalDate getReceivedOn() {
        return OptionalNullable.getFrom(receivedOn);
    }

    /**
     * Setter for ReceivedOn.
     * Date reflecting when the payment was received from a customer. Must be in the past.
     * Applicable only to `external` payments.
     * @param receivedOn Value for LocalDate
     */
    @JsonSetter("received_on")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setReceivedOn(LocalDate receivedOn) {
        this.receivedOn = OptionalNullable.of(receivedOn);
    }

    /**
     * UnSetter for ReceivedOn.
     * Date reflecting when the payment was received from a customer. Must be in the past.
     * Applicable only to `external` payments.
     */
    public void unsetReceivedOn() {
        receivedOn = null;
    }

    /**
     * Getter for Uid.
     * @return Returns the String
     */
    @JsonGetter("uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUid() {
        return uid;
    }

    /**
     * Setter for Uid.
     * @param uid Value for String
     */
    @JsonSetter("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Converts this InvoicePayment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoicePayment [" + "transactionTime=" + transactionTime + ", memo=" + memo
                + ", originalAmount=" + originalAmount + ", appliedAmount=" + appliedAmount
                + ", paymentMethod=" + paymentMethod + ", transactionId=" + transactionId
                + ", prepayment=" + prepayment + ", gatewayHandle=" + gatewayHandle
                + ", gatewayUsed=" + gatewayUsed + ", gatewayTransactionId=" + gatewayTransactionId
                + ", receivedOn=" + receivedOn + ", uid=" + uid + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link InvoicePayment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoicePayment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .transactionTime(getTransactionTime())
                .memo(getMemo())
                .originalAmount(getOriginalAmount())
                .appliedAmount(getAppliedAmount())
                .paymentMethod(getPaymentMethod())
                .transactionId(getTransactionId())
                .prepayment(getPrepayment())
                .gatewayUsed(getGatewayUsed())
                .uid(getUid());
        builder.gatewayHandle = internalGetGatewayHandle();
        builder.gatewayTransactionId = internalGetGatewayTransactionId();
        builder.receivedOn = internalGetReceivedOn();
        return builder;
    }

    /**
     * Class to build instances of {@link InvoicePayment}.
     */
    public static class Builder {
        private ZonedDateTime transactionTime;
        private String memo;
        private String originalAmount;
        private String appliedAmount;
        private InvoicePaymentMethod paymentMethod;
        private Integer transactionId;
        private Boolean prepayment;
        private OptionalNullable<String> gatewayHandle;
        private String gatewayUsed;
        private OptionalNullable<String> gatewayTransactionId;
        private OptionalNullable<LocalDate> receivedOn;
        private String uid;



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
         * Setter for paymentMethod.
         * @param  paymentMethod  InvoicePaymentMethod value for paymentMethod.
         * @return Builder
         */
        public Builder paymentMethod(InvoicePaymentMethod paymentMethod) {
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
         * Setter for prepayment.
         * @param  prepayment  Boolean value for prepayment.
         * @return Builder
         */
        public Builder prepayment(Boolean prepayment) {
            this.prepayment = prepayment;
            return this;
        }

        /**
         * Setter for gatewayHandle.
         * @param  gatewayHandle  String value for gatewayHandle.
         * @return Builder
         */
        public Builder gatewayHandle(String gatewayHandle) {
            this.gatewayHandle = OptionalNullable.of(gatewayHandle);
            return this;
        }

        /**
         * UnSetter for gatewayHandle.
         * @return Builder
         */
        public Builder unsetGatewayHandle() {
            gatewayHandle = null;
            return this;
        }

        /**
         * Setter for gatewayUsed.
         * @param  gatewayUsed  String value for gatewayUsed.
         * @return Builder
         */
        public Builder gatewayUsed(String gatewayUsed) {
            this.gatewayUsed = gatewayUsed;
            return this;
        }

        /**
         * Setter for gatewayTransactionId.
         * @param  gatewayTransactionId  String value for gatewayTransactionId.
         * @return Builder
         */
        public Builder gatewayTransactionId(String gatewayTransactionId) {
            this.gatewayTransactionId = OptionalNullable.of(gatewayTransactionId);
            return this;
        }

        /**
         * UnSetter for gatewayTransactionId.
         * @return Builder
         */
        public Builder unsetGatewayTransactionId() {
            gatewayTransactionId = null;
            return this;
        }

        /**
         * Setter for receivedOn.
         * @param  receivedOn  LocalDate value for receivedOn.
         * @return Builder
         */
        public Builder receivedOn(LocalDate receivedOn) {
            this.receivedOn = OptionalNullable.of(receivedOn);
            return this;
        }

        /**
         * UnSetter for receivedOn.
         * @return Builder
         */
        public Builder unsetReceivedOn() {
            receivedOn = null;
            return this;
        }

        /**
         * Setter for uid.
         * @param  uid  String value for uid.
         * @return Builder
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * Builds a new {@link InvoicePayment} object using the set fields.
         * @return {@link InvoicePayment}
         */
        public InvoicePayment build() {
            return new InvoicePayment(transactionTime, memo, originalAmount, appliedAmount,
                    paymentMethod, transactionId, prepayment, gatewayHandle, gatewayUsed,
                    gatewayTransactionId, receivedOn, uid);
        }
    }
}
