/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreditNoteApplication type.
 */
public class CreditNoteApplication {
    private String uid;
    private String transactionTime;
    private String invoiceUid;
    private String memo;
    private String appliedAmount;

    /**
     * Default constructor.
     */
    public CreditNoteApplication() {
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  transactionTime  String value for transactionTime.
     * @param  invoiceUid  String value for invoiceUid.
     * @param  memo  String value for memo.
     * @param  appliedAmount  String value for appliedAmount.
     */
    public CreditNoteApplication(
            String uid,
            String transactionTime,
            String invoiceUid,
            String memo,
            String appliedAmount) {
        this.uid = uid;
        this.transactionTime = transactionTime;
        this.invoiceUid = invoiceUid;
        this.memo = memo;
        this.appliedAmount = appliedAmount;
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
     * Getter for InvoiceUid.
     * @return Returns the String
     */
    @JsonGetter("invoice_uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInvoiceUid() {
        return invoiceUid;
    }

    /**
     * Setter for InvoiceUid.
     * @param invoiceUid Value for String
     */
    @JsonSetter("invoice_uid")
    public void setInvoiceUid(String invoiceUid) {
        this.invoiceUid = invoiceUid;
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
     * Converts this CreditNoteApplication into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreditNoteApplication [" + "uid=" + uid + ", transactionTime=" + transactionTime
                + ", invoiceUid=" + invoiceUid + ", memo=" + memo + ", appliedAmount="
                + appliedAmount + "]";
    }

    /**
     * Builds a new {@link CreditNoteApplication.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreditNoteApplication.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .transactionTime(getTransactionTime())
                .invoiceUid(getInvoiceUid())
                .memo(getMemo())
                .appliedAmount(getAppliedAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link CreditNoteApplication}.
     */
    public static class Builder {
        private String uid;
        private String transactionTime;
        private String invoiceUid;
        private String memo;
        private String appliedAmount;



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
         * Setter for transactionTime.
         * @param  transactionTime  String value for transactionTime.
         * @return Builder
         */
        public Builder transactionTime(String transactionTime) {
            this.transactionTime = transactionTime;
            return this;
        }

        /**
         * Setter for invoiceUid.
         * @param  invoiceUid  String value for invoiceUid.
         * @return Builder
         */
        public Builder invoiceUid(String invoiceUid) {
            this.invoiceUid = invoiceUid;
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
         * Builds a new {@link CreditNoteApplication} object using the set fields.
         * @return {@link CreditNoteApplication}
         */
        public CreditNoteApplication build() {
            return new CreditNoteApplication(uid, transactionTime, invoiceUid, memo, appliedAmount);
        }
    }
}
