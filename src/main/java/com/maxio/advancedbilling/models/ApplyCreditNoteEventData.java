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
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * This is a model class for ApplyCreditNoteEventData type.
 */
public class ApplyCreditNoteEventData
        extends BaseModel {
    private String uid;
    private String creditNoteNumber;
    private String creditNoteUid;
    private String originalAmount;
    private String appliedAmount;
    private ZonedDateTime transactionTime;
    private OptionalNullable<String> memo;
    private String role;
    private Boolean consolidatedInvoice;
    private List<AppliedCreditNoteData> appliedCreditNotes;

    /**
     * Default constructor.
     */
    public ApplyCreditNoteEventData() {
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  creditNoteNumber  String value for creditNoteNumber.
     * @param  creditNoteUid  String value for creditNoteUid.
     * @param  originalAmount  String value for originalAmount.
     * @param  appliedAmount  String value for appliedAmount.
     * @param  transactionTime  ZonedDateTime value for transactionTime.
     * @param  memo  String value for memo.
     * @param  role  String value for role.
     * @param  consolidatedInvoice  Boolean value for consolidatedInvoice.
     * @param  appliedCreditNotes  List of AppliedCreditNoteData value for appliedCreditNotes.
     */
    public ApplyCreditNoteEventData(
            String uid,
            String creditNoteNumber,
            String creditNoteUid,
            String originalAmount,
            String appliedAmount,
            ZonedDateTime transactionTime,
            String memo,
            String role,
            Boolean consolidatedInvoice,
            List<AppliedCreditNoteData> appliedCreditNotes) {
        this.uid = uid;
        this.creditNoteNumber = creditNoteNumber;
        this.creditNoteUid = creditNoteUid;
        this.originalAmount = originalAmount;
        this.appliedAmount = appliedAmount;
        this.transactionTime = transactionTime;
        this.memo = OptionalNullable.of(memo);
        this.role = role;
        this.consolidatedInvoice = consolidatedInvoice;
        this.appliedCreditNotes = appliedCreditNotes;
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  creditNoteNumber  String value for creditNoteNumber.
     * @param  creditNoteUid  String value for creditNoteUid.
     * @param  originalAmount  String value for originalAmount.
     * @param  appliedAmount  String value for appliedAmount.
     * @param  transactionTime  ZonedDateTime value for transactionTime.
     * @param  memo  String value for memo.
     * @param  role  String value for role.
     * @param  consolidatedInvoice  Boolean value for consolidatedInvoice.
     * @param  appliedCreditNotes  List of AppliedCreditNoteData value for appliedCreditNotes.
     */

    protected ApplyCreditNoteEventData(String uid, String creditNoteNumber, String creditNoteUid,
            String originalAmount, String appliedAmount, ZonedDateTime transactionTime,
            OptionalNullable<String> memo, String role, Boolean consolidatedInvoice,
            List<AppliedCreditNoteData> appliedCreditNotes) {
        this.uid = uid;
        this.creditNoteNumber = creditNoteNumber;
        this.creditNoteUid = creditNoteUid;
        this.originalAmount = originalAmount;
        this.appliedAmount = appliedAmount;
        this.transactionTime = transactionTime;
        this.memo = memo;
        this.role = role;
        this.consolidatedInvoice = consolidatedInvoice;
        this.appliedCreditNotes = appliedCreditNotes;
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  creditNoteNumber  String value for creditNoteNumber.
     * @param  creditNoteUid  String value for creditNoteUid.
     * @param  originalAmount  String value for originalAmount.
     * @param  appliedAmount  String value for appliedAmount.
     */
    @JsonCreator
    protected ApplyCreditNoteEventData(
            @JsonProperty("uid") String uid,
            @JsonProperty("credit_note_number") String creditNoteNumber,
            @JsonProperty("credit_note_uid") String creditNoteUid,
            @JsonProperty("original_amount") String originalAmount,
            @JsonProperty("applied_amount") String appliedAmount) {
        this(uid, creditNoteNumber, creditNoteUid, originalAmount, appliedAmount, null,
                OptionalNullable.of(null), null, null, null);
        unsetMemo();
    }

    /**
     * Getter for Uid.
     * Unique identifier for the credit note application. It is generated automatically by Chargify
     * and has the prefix "cdt_" followed by alphanumeric characters.
     * @return Returns the String
     */
    @JsonGetter("uid")
    public String getUid() {
        return uid;
    }

    /**
     * Setter for Uid.
     * Unique identifier for the credit note application. It is generated automatically by Chargify
     * and has the prefix "cdt_" followed by alphanumeric characters.
     * @param uid Value for String
     */
    @JsonSetter("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Getter for CreditNoteNumber.
     * A unique, identifying string that appears on the credit note and in places it is referenced.
     * @return Returns the String
     */
    @JsonGetter("credit_note_number")
    public String getCreditNoteNumber() {
        return creditNoteNumber;
    }

    /**
     * Setter for CreditNoteNumber.
     * A unique, identifying string that appears on the credit note and in places it is referenced.
     * @param creditNoteNumber Value for String
     */
    @JsonSetter("credit_note_number")
    public void setCreditNoteNumber(String creditNoteNumber) {
        this.creditNoteNumber = creditNoteNumber;
    }

    /**
     * Getter for CreditNoteUid.
     * Unique identifier for the credit note. It is generated automatically by Chargify and has the
     * prefix "cn_" followed by alphanumeric characters.
     * @return Returns the String
     */
    @JsonGetter("credit_note_uid")
    public String getCreditNoteUid() {
        return creditNoteUid;
    }

    /**
     * Setter for CreditNoteUid.
     * Unique identifier for the credit note. It is generated automatically by Chargify and has the
     * prefix "cn_" followed by alphanumeric characters.
     * @param creditNoteUid Value for String
     */
    @JsonSetter("credit_note_uid")
    public void setCreditNoteUid(String creditNoteUid) {
        this.creditNoteUid = creditNoteUid;
    }

    /**
     * Getter for OriginalAmount.
     * The full, original amount of the credit note.
     * @return Returns the String
     */
    @JsonGetter("original_amount")
    public String getOriginalAmount() {
        return originalAmount;
    }

    /**
     * Setter for OriginalAmount.
     * The full, original amount of the credit note.
     * @param originalAmount Value for String
     */
    @JsonSetter("original_amount")
    public void setOriginalAmount(String originalAmount) {
        this.originalAmount = originalAmount;
    }

    /**
     * Getter for AppliedAmount.
     * The amount of the credit note applied to invoice.
     * @return Returns the String
     */
    @JsonGetter("applied_amount")
    public String getAppliedAmount() {
        return appliedAmount;
    }

    /**
     * Setter for AppliedAmount.
     * The amount of the credit note applied to invoice.
     * @param appliedAmount Value for String
     */
    @JsonSetter("applied_amount")
    public void setAppliedAmount(String appliedAmount) {
        this.appliedAmount = appliedAmount;
    }

    /**
     * Getter for TransactionTime.
     * The time the credit note was applied, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z"
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
     * The time the credit note was applied, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z"
     * @param transactionTime Value for ZonedDateTime
     */
    @JsonSetter("transaction_time")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setTransactionTime(ZonedDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }

    /**
     * Internal Getter for Memo.
     * The credit note memo.
     * @return Returns the Internal String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetMemo() {
        return this.memo;
    }

    /**
     * Getter for Memo.
     * The credit note memo.
     * @return Returns the String
     */
    public String getMemo() {
        return OptionalNullable.getFrom(memo);
    }

    /**
     * Setter for Memo.
     * The credit note memo.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = OptionalNullable.of(memo);
    }

    /**
     * UnSetter for Memo.
     * The credit note memo.
     */
    public void unsetMemo() {
        memo = null;
    }

    /**
     * Getter for Role.
     * The role of the credit note (e.g. 'general')
     * @return Returns the String
     */
    @JsonGetter("role")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRole() {
        return role;
    }

    /**
     * Setter for Role.
     * The role of the credit note (e.g. 'general')
     * @param role Value for String
     */
    @JsonSetter("role")
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Getter for ConsolidatedInvoice.
     * Shows whether it was applied to consolidated invoice or not
     * @return Returns the Boolean
     */
    @JsonGetter("consolidated_invoice")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getConsolidatedInvoice() {
        return consolidatedInvoice;
    }

    /**
     * Setter for ConsolidatedInvoice.
     * Shows whether it was applied to consolidated invoice or not
     * @param consolidatedInvoice Value for Boolean
     */
    @JsonSetter("consolidated_invoice")
    public void setConsolidatedInvoice(Boolean consolidatedInvoice) {
        this.consolidatedInvoice = consolidatedInvoice;
    }

    /**
     * Getter for AppliedCreditNotes.
     * List of credit notes applied to children invoices (if consolidated invoice)
     * @return Returns the List of AppliedCreditNoteData
     */
    @JsonGetter("applied_credit_notes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<AppliedCreditNoteData> getAppliedCreditNotes() {
        return appliedCreditNotes;
    }

    /**
     * Setter for AppliedCreditNotes.
     * List of credit notes applied to children invoices (if consolidated invoice)
     * @param appliedCreditNotes Value for List of AppliedCreditNoteData
     */
    @JsonSetter("applied_credit_notes")
    public void setAppliedCreditNotes(List<AppliedCreditNoteData> appliedCreditNotes) {
        this.appliedCreditNotes = appliedCreditNotes;
    }

    /**
     * Converts this ApplyCreditNoteEventData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApplyCreditNoteEventData [" + "uid=" + uid + ", creditNoteNumber="
                + creditNoteNumber + ", creditNoteUid=" + creditNoteUid + ", originalAmount="
                + originalAmount + ", appliedAmount=" + appliedAmount + ", transactionTime="
                + transactionTime + ", memo=" + memo + ", role=" + role + ", consolidatedInvoice="
                + consolidatedInvoice + ", appliedCreditNotes=" + appliedCreditNotes
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ApplyCreditNoteEventData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApplyCreditNoteEventData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(uid, creditNoteNumber, creditNoteUid, originalAmount,
                appliedAmount)
                .transactionTime(getTransactionTime())
                .role(getRole())
                .consolidatedInvoice(getConsolidatedInvoice())
                .appliedCreditNotes(getAppliedCreditNotes());
        builder.memo = internalGetMemo();
        return builder;
    }

    /**
     * Class to build instances of {@link ApplyCreditNoteEventData}.
     */
    public static class Builder {
        private String uid;
        private String creditNoteNumber;
        private String creditNoteUid;
        private String originalAmount;
        private String appliedAmount;
        private ZonedDateTime transactionTime;
        private OptionalNullable<String> memo;
        private String role;
        private Boolean consolidatedInvoice;
        private List<AppliedCreditNoteData> appliedCreditNotes;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  uid  String value for uid.
         * @param  creditNoteNumber  String value for creditNoteNumber.
         * @param  creditNoteUid  String value for creditNoteUid.
         * @param  originalAmount  String value for originalAmount.
         * @param  appliedAmount  String value for appliedAmount.
         */
        public Builder(String uid, String creditNoteNumber, String creditNoteUid,
                String originalAmount, String appliedAmount) {
            this.uid = uid;
            this.creditNoteNumber = creditNoteNumber;
            this.creditNoteUid = creditNoteUid;
            this.originalAmount = originalAmount;
            this.appliedAmount = appliedAmount;
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
         * Setter for creditNoteNumber.
         * @param  creditNoteNumber  String value for creditNoteNumber.
         * @return Builder
         */
        public Builder creditNoteNumber(String creditNoteNumber) {
            this.creditNoteNumber = creditNoteNumber;
            return this;
        }

        /**
         * Setter for creditNoteUid.
         * @param  creditNoteUid  String value for creditNoteUid.
         * @return Builder
         */
        public Builder creditNoteUid(String creditNoteUid) {
            this.creditNoteUid = creditNoteUid;
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
         * Setter for memo.
         * @param  memo  String value for memo.
         * @return Builder
         */
        public Builder memo(String memo) {
            this.memo = OptionalNullable.of(memo);
            return this;
        }

        /**
         * UnSetter for memo.
         * @return Builder
         */
        public Builder unsetMemo() {
            memo = null;
            return this;
        }

        /**
         * Setter for role.
         * @param  role  String value for role.
         * @return Builder
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * Setter for consolidatedInvoice.
         * @param  consolidatedInvoice  Boolean value for consolidatedInvoice.
         * @return Builder
         */
        public Builder consolidatedInvoice(Boolean consolidatedInvoice) {
            this.consolidatedInvoice = consolidatedInvoice;
            return this;
        }

        /**
         * Setter for appliedCreditNotes.
         * @param  appliedCreditNotes  List of AppliedCreditNoteData value for appliedCreditNotes.
         * @return Builder
         */
        public Builder appliedCreditNotes(List<AppliedCreditNoteData> appliedCreditNotes) {
            this.appliedCreditNotes = appliedCreditNotes;
            return this;
        }

        /**
         * Builds a new {@link ApplyCreditNoteEventData} object using the set fields.
         * @return {@link ApplyCreditNoteEventData}
         */
        public ApplyCreditNoteEventData build() {
            return new ApplyCreditNoteEventData(uid, creditNoteNumber, creditNoteUid,
                    originalAmount, appliedAmount, transactionTime, memo, role, consolidatedInvoice,
                    appliedCreditNotes);
        }
    }
}
