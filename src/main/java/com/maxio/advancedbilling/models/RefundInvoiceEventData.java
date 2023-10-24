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
import java.time.LocalDateTime;

/**
 * This is a model class for RefundInvoiceEventData type.
 */
public class RefundInvoiceEventData {
    private Boolean applyCredit;
    private InvoiceConsolidationLevel consolidationLevel;
    private CreditNote creditNoteAttributes;
    private String memo;
    private String originalAmount;
    private Integer paymentId;
    private String refundAmount;
    private Integer refundId;
    private LocalDateTime transactionTime;

    /**
     * Default constructor.
     */
    public RefundInvoiceEventData() {
    }

    /**
     * Initialization constructor.
     * @param  applyCredit  Boolean value for applyCredit.
     * @param  consolidationLevel  InvoiceConsolidationLevel value for consolidationLevel.
     * @param  creditNoteAttributes  CreditNote value for creditNoteAttributes.
     * @param  memo  String value for memo.
     * @param  originalAmount  String value for originalAmount.
     * @param  paymentId  Integer value for paymentId.
     * @param  refundAmount  String value for refundAmount.
     * @param  refundId  Integer value for refundId.
     * @param  transactionTime  LocalDateTime value for transactionTime.
     */
    public RefundInvoiceEventData(
            Boolean applyCredit,
            InvoiceConsolidationLevel consolidationLevel,
            CreditNote creditNoteAttributes,
            String memo,
            String originalAmount,
            Integer paymentId,
            String refundAmount,
            Integer refundId,
            LocalDateTime transactionTime) {
        this.applyCredit = applyCredit;
        this.consolidationLevel = consolidationLevel;
        this.creditNoteAttributes = creditNoteAttributes;
        this.memo = memo;
        this.originalAmount = originalAmount;
        this.paymentId = paymentId;
        this.refundAmount = refundAmount;
        this.refundId = refundId;
        this.transactionTime = transactionTime;
    }

    /**
     * Getter for ApplyCredit.
     * If true, credit was created and applied it to the invoice.
     * @return Returns the Boolean
     */
    @JsonGetter("apply_credit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getApplyCredit() {
        return applyCredit;
    }

    /**
     * Setter for ApplyCredit.
     * If true, credit was created and applied it to the invoice.
     * @param applyCredit Value for Boolean
     */
    @JsonSetter("apply_credit")
    public void setApplyCredit(Boolean applyCredit) {
        this.applyCredit = applyCredit;
    }

    /**
     * Getter for ConsolidationLevel.
     * Consolidation level of the invoice, which is applicable to invoice consolidation. It will
     * hold one of the following values: * "none": A normal invoice with no consolidation. *
     * "child": An invoice segment which has been combined into a consolidated invoice. * "parent":
     * A consolidated invoice, whose contents are composed of invoice segments. "Parent" invoices do
     * not have lines of their own, but they have subtotals and totals which aggregate the member
     * invoice segments. See also the [invoice consolidation
     * documentation](https://chargify.zendesk.com/hc/en-us/articles/4407746391835).
     * @return Returns the InvoiceConsolidationLevel
     */
    @JsonGetter("consolidation_level")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceConsolidationLevel getConsolidationLevel() {
        return consolidationLevel;
    }

    /**
     * Setter for ConsolidationLevel.
     * Consolidation level of the invoice, which is applicable to invoice consolidation. It will
     * hold one of the following values: * "none": A normal invoice with no consolidation. *
     * "child": An invoice segment which has been combined into a consolidated invoice. * "parent":
     * A consolidated invoice, whose contents are composed of invoice segments. "Parent" invoices do
     * not have lines of their own, but they have subtotals and totals which aggregate the member
     * invoice segments. See also the [invoice consolidation
     * documentation](https://chargify.zendesk.com/hc/en-us/articles/4407746391835).
     * @param consolidationLevel Value for InvoiceConsolidationLevel
     */
    @JsonSetter("consolidation_level")
    public void setConsolidationLevel(InvoiceConsolidationLevel consolidationLevel) {
        this.consolidationLevel = consolidationLevel;
    }

    /**
     * Getter for CreditNoteAttributes.
     * @return Returns the CreditNote
     */
    @JsonGetter("credit_note_attributes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreditNote getCreditNoteAttributes() {
        return creditNoteAttributes;
    }

    /**
     * Setter for CreditNoteAttributes.
     * @param creditNoteAttributes Value for CreditNote
     */
    @JsonSetter("credit_note_attributes")
    public void setCreditNoteAttributes(CreditNote creditNoteAttributes) {
        this.creditNoteAttributes = creditNoteAttributes;
    }

    /**
     * Getter for Memo.
     * The refund memo.
     * @return Returns the String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * The refund memo.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter for OriginalAmount.
     * The full, original amount of the refund.
     * @return Returns the String
     */
    @JsonGetter("original_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOriginalAmount() {
        return originalAmount;
    }

    /**
     * Setter for OriginalAmount.
     * The full, original amount of the refund.
     * @param originalAmount Value for String
     */
    @JsonSetter("original_amount")
    public void setOriginalAmount(String originalAmount) {
        this.originalAmount = originalAmount;
    }

    /**
     * Getter for PaymentId.
     * The ID of the payment transaction to be refunded.
     * @return Returns the Integer
     */
    @JsonGetter("payment_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPaymentId() {
        return paymentId;
    }

    /**
     * Setter for PaymentId.
     * The ID of the payment transaction to be refunded.
     * @param paymentId Value for Integer
     */
    @JsonSetter("payment_id")
    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * Getter for RefundAmount.
     * The amount of the refund.
     * @return Returns the String
     */
    @JsonGetter("refund_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRefundAmount() {
        return refundAmount;
    }

    /**
     * Setter for RefundAmount.
     * The amount of the refund.
     * @param refundAmount Value for String
     */
    @JsonSetter("refund_amount")
    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * Getter for RefundId.
     * The ID of the refund transaction.
     * @return Returns the Integer
     */
    @JsonGetter("refund_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getRefundId() {
        return refundId;
    }

    /**
     * Setter for RefundId.
     * The ID of the refund transaction.
     * @param refundId Value for Integer
     */
    @JsonSetter("refund_id")
    public void setRefundId(Integer refundId) {
        this.refundId = refundId;
    }

    /**
     * Getter for TransactionTime.
     * The time the refund was applied, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z"
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
     * The time the refund was applied, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z"
     * @param transactionTime Value for LocalDateTime
     */
    @JsonSetter("transaction_time")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setTransactionTime(LocalDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }

    /**
     * Converts this RefundInvoiceEventData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RefundInvoiceEventData [" + "applyCredit=" + applyCredit + ", consolidationLevel="
                + consolidationLevel + ", creditNoteAttributes=" + creditNoteAttributes + ", memo="
                + memo + ", originalAmount=" + originalAmount + ", paymentId=" + paymentId
                + ", refundAmount=" + refundAmount + ", refundId=" + refundId + ", transactionTime="
                + transactionTime + "]";
    }

    /**
     * Builds a new {@link RefundInvoiceEventData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RefundInvoiceEventData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .applyCredit(getApplyCredit())
                .consolidationLevel(getConsolidationLevel())
                .creditNoteAttributes(getCreditNoteAttributes())
                .memo(getMemo())
                .originalAmount(getOriginalAmount())
                .paymentId(getPaymentId())
                .refundAmount(getRefundAmount())
                .refundId(getRefundId())
                .transactionTime(getTransactionTime());
        return builder;
    }

    /**
     * Class to build instances of {@link RefundInvoiceEventData}.
     */
    public static class Builder {
        private Boolean applyCredit;
        private InvoiceConsolidationLevel consolidationLevel;
        private CreditNote creditNoteAttributes;
        private String memo;
        private String originalAmount;
        private Integer paymentId;
        private String refundAmount;
        private Integer refundId;
        private LocalDateTime transactionTime;



        /**
         * Setter for applyCredit.
         * @param  applyCredit  Boolean value for applyCredit.
         * @return Builder
         */
        public Builder applyCredit(Boolean applyCredit) {
            this.applyCredit = applyCredit;
            return this;
        }

        /**
         * Setter for consolidationLevel.
         * @param  consolidationLevel  InvoiceConsolidationLevel value for consolidationLevel.
         * @return Builder
         */
        public Builder consolidationLevel(InvoiceConsolidationLevel consolidationLevel) {
            this.consolidationLevel = consolidationLevel;
            return this;
        }

        /**
         * Setter for creditNoteAttributes.
         * @param  creditNoteAttributes  CreditNote value for creditNoteAttributes.
         * @return Builder
         */
        public Builder creditNoteAttributes(CreditNote creditNoteAttributes) {
            this.creditNoteAttributes = creditNoteAttributes;
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
         * Setter for paymentId.
         * @param  paymentId  Integer value for paymentId.
         * @return Builder
         */
        public Builder paymentId(Integer paymentId) {
            this.paymentId = paymentId;
            return this;
        }

        /**
         * Setter for refundAmount.
         * @param  refundAmount  String value for refundAmount.
         * @return Builder
         */
        public Builder refundAmount(String refundAmount) {
            this.refundAmount = refundAmount;
            return this;
        }

        /**
         * Setter for refundId.
         * @param  refundId  Integer value for refundId.
         * @return Builder
         */
        public Builder refundId(Integer refundId) {
            this.refundId = refundId;
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
         * Builds a new {@link RefundInvoiceEventData} object using the set fields.
         * @return {@link RefundInvoiceEventData}
         */
        public RefundInvoiceEventData build() {
            return new RefundInvoiceEventData(applyCredit, consolidationLevel, creditNoteAttributes,
                    memo, originalAmount, paymentId, refundAmount, refundId, transactionTime);
        }
    }
}
