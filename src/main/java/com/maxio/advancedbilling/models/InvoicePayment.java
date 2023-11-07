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
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for InvoicePayment type.
 */
public class InvoicePayment {
    private String transactionTime;
    private String memo;
    private String originalAmount;
    private String appliedAmount;
    private InvoicePaymentMethod paymentMethod;
    private Integer transactionId;
    private Boolean prepayment;
    private OptionalNullable<String> gatewayHandle;
    private String gatewayUsed;
    private OptionalNullable<String> gatewayTransactionId;

    /**
     * Default constructor.
     */
    public InvoicePayment() {
    }

    /**
     * Initialization constructor.
     * @param  transactionTime  String value for transactionTime.
     * @param  memo  String value for memo.
     * @param  originalAmount  String value for originalAmount.
     * @param  appliedAmount  String value for appliedAmount.
     * @param  paymentMethod  InvoicePaymentMethod value for paymentMethod.
     * @param  transactionId  Integer value for transactionId.
     * @param  prepayment  Boolean value for prepayment.
     * @param  gatewayHandle  String value for gatewayHandle.
     * @param  gatewayUsed  String value for gatewayUsed.
     * @param  gatewayTransactionId  String value for gatewayTransactionId.
     */
    public InvoicePayment(
            String transactionTime,
            String memo,
            String originalAmount,
            String appliedAmount,
            InvoicePaymentMethod paymentMethod,
            Integer transactionId,
            Boolean prepayment,
            String gatewayHandle,
            String gatewayUsed,
            String gatewayTransactionId) {
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
    }

    /**
     * Initialization constructor.
     * @param  transactionTime  String value for transactionTime.
     * @param  memo  String value for memo.
     * @param  originalAmount  String value for originalAmount.
     * @param  appliedAmount  String value for appliedAmount.
     * @param  paymentMethod  InvoicePaymentMethod value for paymentMethod.
     * @param  transactionId  Integer value for transactionId.
     * @param  prepayment  Boolean value for prepayment.
     * @param  gatewayHandle  String value for gatewayHandle.
     * @param  gatewayUsed  String value for gatewayUsed.
     * @param  gatewayTransactionId  String value for gatewayTransactionId.
     */

    protected InvoicePayment(String transactionTime, String memo, String originalAmount,
            String appliedAmount, InvoicePaymentMethod paymentMethod, Integer transactionId,
            Boolean prepayment, OptionalNullable<String> gatewayHandle, String gatewayUsed,
            OptionalNullable<String> gatewayTransactionId) {
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
    }

    /**
     * Getter for TransactionTime.
     * @return Returns the String
     */
    @JsonGetter("transaction_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTransactionTime() {
        return transactionTime;
    }

    /**
     * Setter for TransactionTime.
     * @param transactionTime Value for String
     */
    @JsonSetter("transaction_time")
    public void setTransactionTime(String transactionTime) {
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
                + "]";
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
                .gatewayUsed(getGatewayUsed());
        builder.gatewayHandle = internalGetGatewayHandle();
        builder.gatewayTransactionId = internalGetGatewayTransactionId();
        return builder;
    }

    /**
     * Class to build instances of {@link InvoicePayment}.
     */
    public static class Builder {
        private String transactionTime;
        private String memo;
        private String originalAmount;
        private String appliedAmount;
        private InvoicePaymentMethod paymentMethod;
        private Integer transactionId;
        private Boolean prepayment;
        private OptionalNullable<String> gatewayHandle;
        private String gatewayUsed;
        private OptionalNullable<String> gatewayTransactionId;



        /**
         * Setter for transactionTime.
         * @param  transactionTime  String value for transactionTime.
         * @return Builder
         */
        public Builder transactionTime(String transactionTime) {
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
         * Builds a new {@link InvoicePayment} object using the set fields.
         * @return {@link InvoicePayment}
         */
        public InvoicePayment build() {
            return new InvoicePayment(transactionTime, memo, originalAmount, appliedAmount,
                    paymentMethod, transactionId, prepayment, gatewayHandle, gatewayUsed,
                    gatewayTransactionId);
        }
    }
}
