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
 * This is a model class for VoidInvoiceEventData type.
 */
public class VoidInvoiceEventData {
    private CreditNote creditNoteAttributes;
    private String memo;
    private String appliedAmount;
    private LocalDateTime transactionTime;
    private Boolean isAdvanceInvoice;

    /**
     * Default constructor.
     */
    public VoidInvoiceEventData() {
    }

    /**
     * Initialization constructor.
     * @param  creditNoteAttributes  CreditNote value for creditNoteAttributes.
     * @param  memo  String value for memo.
     * @param  appliedAmount  String value for appliedAmount.
     * @param  transactionTime  LocalDateTime value for transactionTime.
     * @param  isAdvanceInvoice  Boolean value for isAdvanceInvoice.
     */
    public VoidInvoiceEventData(
            CreditNote creditNoteAttributes,
            String memo,
            String appliedAmount,
            LocalDateTime transactionTime,
            Boolean isAdvanceInvoice) {
        this.creditNoteAttributes = creditNoteAttributes;
        this.memo = memo;
        this.appliedAmount = appliedAmount;
        this.transactionTime = transactionTime;
        this.isAdvanceInvoice = isAdvanceInvoice;
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
     * The memo provided during invoice voiding.
     * @return Returns the String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * The memo provided during invoice voiding.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter for AppliedAmount.
     * The amount of the void.
     * @return Returns the String
     */
    @JsonGetter("applied_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAppliedAmount() {
        return appliedAmount;
    }

    /**
     * Setter for AppliedAmount.
     * The amount of the void.
     * @param appliedAmount Value for String
     */
    @JsonSetter("applied_amount")
    public void setAppliedAmount(String appliedAmount) {
        this.appliedAmount = appliedAmount;
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
     * Getter for IsAdvanceInvoice.
     * If true, the invoice is an advance invoice.
     * @return Returns the Boolean
     */
    @JsonGetter("is_advance_invoice")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsAdvanceInvoice() {
        return isAdvanceInvoice;
    }

    /**
     * Setter for IsAdvanceInvoice.
     * If true, the invoice is an advance invoice.
     * @param isAdvanceInvoice Value for Boolean
     */
    @JsonSetter("is_advance_invoice")
    public void setIsAdvanceInvoice(Boolean isAdvanceInvoice) {
        this.isAdvanceInvoice = isAdvanceInvoice;
    }

    /**
     * Converts this VoidInvoiceEventData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "VoidInvoiceEventData [" + "creditNoteAttributes=" + creditNoteAttributes + ", memo="
                + memo + ", appliedAmount=" + appliedAmount + ", transactionTime=" + transactionTime
                + ", isAdvanceInvoice=" + isAdvanceInvoice + "]";
    }

    /**
     * Builds a new {@link VoidInvoiceEventData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link VoidInvoiceEventData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .creditNoteAttributes(getCreditNoteAttributes())
                .memo(getMemo())
                .appliedAmount(getAppliedAmount())
                .transactionTime(getTransactionTime())
                .isAdvanceInvoice(getIsAdvanceInvoice());
        return builder;
    }

    /**
     * Class to build instances of {@link VoidInvoiceEventData}.
     */
    public static class Builder {
        private CreditNote creditNoteAttributes;
        private String memo;
        private String appliedAmount;
        private LocalDateTime transactionTime;
        private Boolean isAdvanceInvoice;



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
         * Setter for isAdvanceInvoice.
         * @param  isAdvanceInvoice  Boolean value for isAdvanceInvoice.
         * @return Builder
         */
        public Builder isAdvanceInvoice(Boolean isAdvanceInvoice) {
            this.isAdvanceInvoice = isAdvanceInvoice;
            return this;
        }

        /**
         * Builds a new {@link VoidInvoiceEventData} object using the set fields.
         * @return {@link VoidInvoiceEventData}
         */
        public VoidInvoiceEventData build() {
            return new VoidInvoiceEventData(creditNoteAttributes, memo, appliedAmount,
                    transactionTime, isAdvanceInvoice);
        }
    }
}
