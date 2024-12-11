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
 * This is a model class for InvoiceDebit type.
 */
public class InvoiceDebit
        extends BaseModel {
    private String uid;
    private String debitNoteNumber;
    private String debitNoteUid;
    private DebitNoteRole role;
    private ZonedDateTime transactionTime;
    private String memo;
    private String originalAmount;
    private String appliedAmount;

    /**
     * Default constructor.
     */
    public InvoiceDebit() {
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  debitNoteNumber  String value for debitNoteNumber.
     * @param  debitNoteUid  String value for debitNoteUid.
     * @param  role  DebitNoteRole value for role.
     * @param  transactionTime  ZonedDateTime value for transactionTime.
     * @param  memo  String value for memo.
     * @param  originalAmount  String value for originalAmount.
     * @param  appliedAmount  String value for appliedAmount.
     */
    public InvoiceDebit(
            String uid,
            String debitNoteNumber,
            String debitNoteUid,
            DebitNoteRole role,
            ZonedDateTime transactionTime,
            String memo,
            String originalAmount,
            String appliedAmount) {
        this.uid = uid;
        this.debitNoteNumber = debitNoteNumber;
        this.debitNoteUid = debitNoteUid;
        this.role = role;
        this.transactionTime = transactionTime;
        this.memo = memo;
        this.originalAmount = originalAmount;
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
     * Getter for DebitNoteNumber.
     * @return Returns the String
     */
    @JsonGetter("debit_note_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDebitNoteNumber() {
        return debitNoteNumber;
    }

    /**
     * Setter for DebitNoteNumber.
     * @param debitNoteNumber Value for String
     */
    @JsonSetter("debit_note_number")
    public void setDebitNoteNumber(String debitNoteNumber) {
        this.debitNoteNumber = debitNoteNumber;
    }

    /**
     * Getter for DebitNoteUid.
     * @return Returns the String
     */
    @JsonGetter("debit_note_uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDebitNoteUid() {
        return debitNoteUid;
    }

    /**
     * Setter for DebitNoteUid.
     * @param debitNoteUid Value for String
     */
    @JsonSetter("debit_note_uid")
    public void setDebitNoteUid(String debitNoteUid) {
        this.debitNoteUid = debitNoteUid;
    }

    /**
     * Getter for Role.
     * The role of the debit note.
     * @return Returns the DebitNoteRole
     */
    @JsonGetter("role")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DebitNoteRole getRole() {
        return role;
    }

    /**
     * Setter for Role.
     * The role of the debit note.
     * @param role Value for DebitNoteRole
     */
    @JsonSetter("role")
    public void setRole(DebitNoteRole role) {
        this.role = role;
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
     * Converts this InvoiceDebit into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoiceDebit [" + "uid=" + uid + ", debitNoteNumber=" + debitNoteNumber
                + ", debitNoteUid=" + debitNoteUid + ", role=" + role + ", transactionTime="
                + transactionTime + ", memo=" + memo + ", originalAmount=" + originalAmount
                + ", appliedAmount=" + appliedAmount + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link InvoiceDebit.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoiceDebit.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .debitNoteNumber(getDebitNoteNumber())
                .debitNoteUid(getDebitNoteUid())
                .role(getRole())
                .transactionTime(getTransactionTime())
                .memo(getMemo())
                .originalAmount(getOriginalAmount())
                .appliedAmount(getAppliedAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link InvoiceDebit}.
     */
    public static class Builder {
        private String uid;
        private String debitNoteNumber;
        private String debitNoteUid;
        private DebitNoteRole role;
        private ZonedDateTime transactionTime;
        private String memo;
        private String originalAmount;
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
         * Setter for debitNoteNumber.
         * @param  debitNoteNumber  String value for debitNoteNumber.
         * @return Builder
         */
        public Builder debitNoteNumber(String debitNoteNumber) {
            this.debitNoteNumber = debitNoteNumber;
            return this;
        }

        /**
         * Setter for debitNoteUid.
         * @param  debitNoteUid  String value for debitNoteUid.
         * @return Builder
         */
        public Builder debitNoteUid(String debitNoteUid) {
            this.debitNoteUid = debitNoteUid;
            return this;
        }

        /**
         * Setter for role.
         * @param  role  DebitNoteRole value for role.
         * @return Builder
         */
        public Builder role(DebitNoteRole role) {
            this.role = role;
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
         * Builds a new {@link InvoiceDebit} object using the set fields.
         * @return {@link InvoiceDebit}
         */
        public InvoiceDebit build() {
            return new InvoiceDebit(uid, debitNoteNumber, debitNoteUid, role, transactionTime, memo,
                    originalAmount, appliedAmount);
        }
    }
}
