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
 * This is a model class for InvoiceRefund type.
 */
public class InvoiceRefund
        extends BaseModel {
    private Integer transactionId;
    private Integer paymentId;
    private String memo;
    private String originalAmount;
    private String appliedAmount;
    private OptionalNullable<String> gatewayTransactionId;
    private String gatewayUsed;
    private OptionalNullable<String> gatewayHandle;
    private OptionalNullable<Boolean> achLateReject;

    /**
     * Default constructor.
     */
    public InvoiceRefund() {
    }

    /**
     * Initialization constructor.
     * @param  transactionId  Integer value for transactionId.
     * @param  paymentId  Integer value for paymentId.
     * @param  memo  String value for memo.
     * @param  originalAmount  String value for originalAmount.
     * @param  appliedAmount  String value for appliedAmount.
     * @param  gatewayTransactionId  String value for gatewayTransactionId.
     * @param  gatewayUsed  String value for gatewayUsed.
     * @param  gatewayHandle  String value for gatewayHandle.
     * @param  achLateReject  Boolean value for achLateReject.
     */
    public InvoiceRefund(
            Integer transactionId,
            Integer paymentId,
            String memo,
            String originalAmount,
            String appliedAmount,
            String gatewayTransactionId,
            String gatewayUsed,
            String gatewayHandle,
            Boolean achLateReject) {
        this.transactionId = transactionId;
        this.paymentId = paymentId;
        this.memo = memo;
        this.originalAmount = originalAmount;
        this.appliedAmount = appliedAmount;
        this.gatewayTransactionId = OptionalNullable.of(gatewayTransactionId);
        this.gatewayUsed = gatewayUsed;
        this.gatewayHandle = OptionalNullable.of(gatewayHandle);
        this.achLateReject = OptionalNullable.of(achLateReject);
    }

    /**
     * Initialization constructor.
     * @param  transactionId  Integer value for transactionId.
     * @param  paymentId  Integer value for paymentId.
     * @param  memo  String value for memo.
     * @param  originalAmount  String value for originalAmount.
     * @param  appliedAmount  String value for appliedAmount.
     * @param  gatewayTransactionId  String value for gatewayTransactionId.
     * @param  gatewayUsed  String value for gatewayUsed.
     * @param  gatewayHandle  String value for gatewayHandle.
     * @param  achLateReject  Boolean value for achLateReject.
     */

    protected InvoiceRefund(Integer transactionId, Integer paymentId, String memo,
            String originalAmount, String appliedAmount,
            OptionalNullable<String> gatewayTransactionId, String gatewayUsed,
            OptionalNullable<String> gatewayHandle, OptionalNullable<Boolean> achLateReject) {
        this.transactionId = transactionId;
        this.paymentId = paymentId;
        this.memo = memo;
        this.originalAmount = originalAmount;
        this.appliedAmount = appliedAmount;
        this.gatewayTransactionId = gatewayTransactionId;
        this.gatewayUsed = gatewayUsed;
        this.gatewayHandle = gatewayHandle;
        this.achLateReject = achLateReject;
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
     * Getter for PaymentId.
     * @return Returns the Integer
     */
    @JsonGetter("payment_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPaymentId() {
        return paymentId;
    }

    /**
     * Setter for PaymentId.
     * @param paymentId Value for Integer
     */
    @JsonSetter("payment_id")
    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
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
     * Internal Getter for GatewayTransactionId.
     * The transaction ID for the refund as returned from the payment gateway
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
     * The transaction ID for the refund as returned from the payment gateway
     * @return Returns the String
     */
    public String getGatewayTransactionId() {
        return OptionalNullable.getFrom(gatewayTransactionId);
    }

    /**
     * Setter for GatewayTransactionId.
     * The transaction ID for the refund as returned from the payment gateway
     * @param gatewayTransactionId Value for String
     */
    @JsonSetter("gateway_transaction_id")
    public void setGatewayTransactionId(String gatewayTransactionId) {
        this.gatewayTransactionId = OptionalNullable.of(gatewayTransactionId);
    }

    /**
     * UnSetter for GatewayTransactionId.
     * The transaction ID for the refund as returned from the payment gateway
     */
    public void unsetGatewayTransactionId() {
        gatewayTransactionId = null;
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
     * Internal Getter for AchLateReject.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("ach_late_reject")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetAchLateReject() {
        return this.achLateReject;
    }

    /**
     * Getter for AchLateReject.
     * @return Returns the Boolean
     */
    public Boolean getAchLateReject() {
        return OptionalNullable.getFrom(achLateReject);
    }

    /**
     * Setter for AchLateReject.
     * @param achLateReject Value for Boolean
     */
    @JsonSetter("ach_late_reject")
    public void setAchLateReject(Boolean achLateReject) {
        this.achLateReject = OptionalNullable.of(achLateReject);
    }

    /**
     * UnSetter for AchLateReject.
     */
    public void unsetAchLateReject() {
        achLateReject = null;
    }

    /**
     * Converts this InvoiceRefund into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoiceRefund [" + "transactionId=" + transactionId + ", paymentId=" + paymentId
                + ", memo=" + memo + ", originalAmount=" + originalAmount + ", appliedAmount="
                + appliedAmount + ", gatewayTransactionId=" + gatewayTransactionId
                + ", gatewayUsed=" + gatewayUsed + ", gatewayHandle=" + gatewayHandle
                + ", achLateReject=" + achLateReject + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link InvoiceRefund.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoiceRefund.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .transactionId(getTransactionId())
                .paymentId(getPaymentId())
                .memo(getMemo())
                .originalAmount(getOriginalAmount())
                .appliedAmount(getAppliedAmount())
                .gatewayUsed(getGatewayUsed());
        builder.gatewayTransactionId = internalGetGatewayTransactionId();
        builder.gatewayHandle = internalGetGatewayHandle();
        builder.achLateReject = internalGetAchLateReject();
        return builder;
    }

    /**
     * Class to build instances of {@link InvoiceRefund}.
     */
    public static class Builder {
        private Integer transactionId;
        private Integer paymentId;
        private String memo;
        private String originalAmount;
        private String appliedAmount;
        private OptionalNullable<String> gatewayTransactionId;
        private String gatewayUsed;
        private OptionalNullable<String> gatewayHandle;
        private OptionalNullable<Boolean> achLateReject;



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
         * Setter for paymentId.
         * @param  paymentId  Integer value for paymentId.
         * @return Builder
         */
        public Builder paymentId(Integer paymentId) {
            this.paymentId = paymentId;
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
         * Setter for gatewayUsed.
         * @param  gatewayUsed  String value for gatewayUsed.
         * @return Builder
         */
        public Builder gatewayUsed(String gatewayUsed) {
            this.gatewayUsed = gatewayUsed;
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
         * Setter for achLateReject.
         * @param  achLateReject  Boolean value for achLateReject.
         * @return Builder
         */
        public Builder achLateReject(Boolean achLateReject) {
            this.achLateReject = OptionalNullable.of(achLateReject);
            return this;
        }

        /**
         * UnSetter for achLateReject.
         * @return Builder
         */
        public Builder unsetAchLateReject() {
            achLateReject = null;
            return this;
        }

        /**
         * Builds a new {@link InvoiceRefund} object using the set fields.
         * @return {@link InvoiceRefund}
         */
        public InvoiceRefund build() {
            return new InvoiceRefund(transactionId, paymentId, memo, originalAmount, appliedAmount,
                    gatewayTransactionId, gatewayUsed, gatewayHandle, achLateReject);
        }
    }
}
