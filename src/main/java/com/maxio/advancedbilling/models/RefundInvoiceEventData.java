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
import java.time.ZonedDateTime;

/**
 * This is a model class for RefundInvoiceEventData type.
 */
public class RefundInvoiceEventData
        extends BaseModel {
    private boolean applyCredit;
    private InvoiceConsolidationLevel consolidationLevel;
    private CreditNote creditNoteAttributes;
    private String memo;
    private String originalAmount;
    private int paymentId;
    private String refundAmount;
    private int refundId;
    private ZonedDateTime transactionTime;

    /**
     * Default constructor.
     */
    public RefundInvoiceEventData() {
    }

    /**
     * Initialization constructor.
     * @param  applyCredit  boolean value for applyCredit.
     * @param  creditNoteAttributes  CreditNote value for creditNoteAttributes.
     * @param  paymentId  int value for paymentId.
     * @param  refundAmount  String value for refundAmount.
     * @param  refundId  int value for refundId.
     * @param  transactionTime  ZonedDateTime value for transactionTime.
     * @param  consolidationLevel  InvoiceConsolidationLevel value for consolidationLevel.
     * @param  memo  String value for memo.
     * @param  originalAmount  String value for originalAmount.
     */
    public RefundInvoiceEventData(
            boolean applyCredit,
            CreditNote creditNoteAttributes,
            int paymentId,
            String refundAmount,
            int refundId,
            ZonedDateTime transactionTime,
            InvoiceConsolidationLevel consolidationLevel,
            String memo,
            String originalAmount) {
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
     * @return Returns the boolean
     */
    @JsonGetter("apply_credit")
    public boolean getApplyCredit() {
        return applyCredit;
    }

    /**
     * Setter for ApplyCredit.
     * If true, credit was created and applied it to the invoice.
     * @param applyCredit Value for boolean
     */
    @JsonSetter("apply_credit")
    public void setApplyCredit(boolean applyCredit) {
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
     * documentation](https://maxio.zendesk.com/hc/en-us/articles/24252269909389-Invoice-Consolidation).
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
     * documentation](https://maxio.zendesk.com/hc/en-us/articles/24252269909389-Invoice-Consolidation).
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
     * @return Returns the int
     */
    @JsonGetter("payment_id")
    public int getPaymentId() {
        return paymentId;
    }

    /**
     * Setter for PaymentId.
     * The ID of the payment transaction to be refunded.
     * @param paymentId Value for int
     */
    @JsonSetter("payment_id")
    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * Getter for RefundAmount.
     * The amount of the refund.
     * @return Returns the String
     */
    @JsonGetter("refund_amount")
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
     * @return Returns the int
     */
    @JsonGetter("refund_id")
    public int getRefundId() {
        return refundId;
    }

    /**
     * Setter for RefundId.
     * The ID of the refund transaction.
     * @param refundId Value for int
     */
    @JsonSetter("refund_id")
    public void setRefundId(int refundId) {
        this.refundId = refundId;
    }

    /**
     * Getter for TransactionTime.
     * The time the refund was applied, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z"
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("transaction_time")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getTransactionTime() {
        return transactionTime;
    }

    /**
     * Setter for TransactionTime.
     * The time the refund was applied, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z"
     * @param transactionTime Value for ZonedDateTime
     */
    @JsonSetter("transaction_time")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setTransactionTime(ZonedDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }

    /**
     * Converts this RefundInvoiceEventData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RefundInvoiceEventData [" + "applyCredit=" + applyCredit + ", creditNoteAttributes="
                + creditNoteAttributes + ", paymentId=" + paymentId + ", refundAmount="
                + refundAmount + ", refundId=" + refundId + ", transactionTime=" + transactionTime
                + ", consolidationLevel=" + consolidationLevel + ", memo=" + memo
                + ", originalAmount=" + originalAmount + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link RefundInvoiceEventData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RefundInvoiceEventData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(applyCredit, creditNoteAttributes, paymentId, refundAmount,
                refundId, transactionTime)
                .consolidationLevel(getConsolidationLevel())
                .memo(getMemo())
                .originalAmount(getOriginalAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link RefundInvoiceEventData}.
     */
    public static class Builder {
        private boolean applyCredit;
        private CreditNote creditNoteAttributes;
        private int paymentId;
        private String refundAmount;
        private int refundId;
        private ZonedDateTime transactionTime;
        private InvoiceConsolidationLevel consolidationLevel;
        private String memo;
        private String originalAmount;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  applyCredit  boolean value for applyCredit.
         * @param  creditNoteAttributes  CreditNote value for creditNoteAttributes.
         * @param  paymentId  int value for paymentId.
         * @param  refundAmount  String value for refundAmount.
         * @param  refundId  int value for refundId.
         * @param  transactionTime  ZonedDateTime value for transactionTime.
         */
        public Builder(boolean applyCredit, CreditNote creditNoteAttributes, int paymentId,
                String refundAmount, int refundId, ZonedDateTime transactionTime) {
            this.applyCredit = applyCredit;
            this.creditNoteAttributes = creditNoteAttributes;
            this.paymentId = paymentId;
            this.refundAmount = refundAmount;
            this.refundId = refundId;
            this.transactionTime = transactionTime;
        }

        /**
         * Setter for applyCredit.
         * @param  applyCredit  boolean value for applyCredit.
         * @return Builder
         */
        public Builder applyCredit(boolean applyCredit) {
            this.applyCredit = applyCredit;
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
         * Setter for paymentId.
         * @param  paymentId  int value for paymentId.
         * @return Builder
         */
        public Builder paymentId(int paymentId) {
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
         * @param  refundId  int value for refundId.
         * @return Builder
         */
        public Builder refundId(int refundId) {
            this.refundId = refundId;
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
         * Setter for consolidationLevel.
         * @param  consolidationLevel  InvoiceConsolidationLevel value for consolidationLevel.
         * @return Builder
         */
        public Builder consolidationLevel(InvoiceConsolidationLevel consolidationLevel) {
            this.consolidationLevel = consolidationLevel;
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
         * Builds a new {@link RefundInvoiceEventData} object using the set fields.
         * @return {@link RefundInvoiceEventData}
         */
        public RefundInvoiceEventData build() {
            return new RefundInvoiceEventData(applyCredit, creditNoteAttributes, paymentId,
                    refundAmount, refundId, transactionTime, consolidationLevel, memo,
                    originalAmount);
        }
    }
}
