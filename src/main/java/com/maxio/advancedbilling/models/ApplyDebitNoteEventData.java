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
import java.time.ZonedDateTime;

/**
 * This is a model class for ApplyDebitNoteEventData type.
 */
public class ApplyDebitNoteEventData
        extends BaseModel {
    private String debitNoteNumber;
    private String debitNoteUid;
    private String originalAmount;
    private String appliedAmount;
    private OptionalNullable<String> memo;
    private OptionalNullable<ZonedDateTime> transactionTime;

    /**
     * Default constructor.
     */
    public ApplyDebitNoteEventData() {
    }

    /**
     * Initialization constructor.
     * @param  debitNoteNumber  String value for debitNoteNumber.
     * @param  debitNoteUid  String value for debitNoteUid.
     * @param  originalAmount  String value for originalAmount.
     * @param  appliedAmount  String value for appliedAmount.
     * @param  memo  String value for memo.
     * @param  transactionTime  ZonedDateTime value for transactionTime.
     */
    public ApplyDebitNoteEventData(
            String debitNoteNumber,
            String debitNoteUid,
            String originalAmount,
            String appliedAmount,
            String memo,
            ZonedDateTime transactionTime) {
        this.debitNoteNumber = debitNoteNumber;
        this.debitNoteUid = debitNoteUid;
        this.originalAmount = originalAmount;
        this.appliedAmount = appliedAmount;
        this.memo = OptionalNullable.of(memo);
        this.transactionTime = OptionalNullable.of(transactionTime);
    }

    /**
     * Initialization constructor.
     * @param  debitNoteNumber  String value for debitNoteNumber.
     * @param  debitNoteUid  String value for debitNoteUid.
     * @param  originalAmount  String value for originalAmount.
     * @param  appliedAmount  String value for appliedAmount.
     * @param  memo  String value for memo.
     * @param  transactionTime  ZonedDateTime value for transactionTime.
     */

    protected ApplyDebitNoteEventData(String debitNoteNumber, String debitNoteUid,
            String originalAmount, String appliedAmount, OptionalNullable<String> memo,
            OptionalNullable<ZonedDateTime> transactionTime) {
        this.debitNoteNumber = debitNoteNumber;
        this.debitNoteUid = debitNoteUid;
        this.originalAmount = originalAmount;
        this.appliedAmount = appliedAmount;
        this.memo = memo;
        this.transactionTime = transactionTime;
    }

    /**
     * Getter for DebitNoteNumber.
     * A unique, identifying string that appears on the debit note and in places it is referenced.
     * @return Returns the String
     */
    @JsonGetter("debit_note_number")
    public String getDebitNoteNumber() {
        return debitNoteNumber;
    }

    /**
     * Setter for DebitNoteNumber.
     * A unique, identifying string that appears on the debit note and in places it is referenced.
     * @param debitNoteNumber Value for String
     */
    @JsonSetter("debit_note_number")
    public void setDebitNoteNumber(String debitNoteNumber) {
        this.debitNoteNumber = debitNoteNumber;
    }

    /**
     * Getter for DebitNoteUid.
     * Unique identifier for the debit note. It is generated automatically by Chargify and has the
     * prefix "db_" followed by alphanumeric characters.
     * @return Returns the String
     */
    @JsonGetter("debit_note_uid")
    public String getDebitNoteUid() {
        return debitNoteUid;
    }

    /**
     * Setter for DebitNoteUid.
     * Unique identifier for the debit note. It is generated automatically by Chargify and has the
     * prefix "db_" followed by alphanumeric characters.
     * @param debitNoteUid Value for String
     */
    @JsonSetter("debit_note_uid")
    public void setDebitNoteUid(String debitNoteUid) {
        this.debitNoteUid = debitNoteUid;
    }

    /**
     * Getter for OriginalAmount.
     * The full, original amount of the debit note.
     * @return Returns the String
     */
    @JsonGetter("original_amount")
    public String getOriginalAmount() {
        return originalAmount;
    }

    /**
     * Setter for OriginalAmount.
     * The full, original amount of the debit note.
     * @param originalAmount Value for String
     */
    @JsonSetter("original_amount")
    public void setOriginalAmount(String originalAmount) {
        this.originalAmount = originalAmount;
    }

    /**
     * Getter for AppliedAmount.
     * The amount of the debit note applied to invoice.
     * @return Returns the String
     */
    @JsonGetter("applied_amount")
    public String getAppliedAmount() {
        return appliedAmount;
    }

    /**
     * Setter for AppliedAmount.
     * The amount of the debit note applied to invoice.
     * @param appliedAmount Value for String
     */
    @JsonSetter("applied_amount")
    public void setAppliedAmount(String appliedAmount) {
        this.appliedAmount = appliedAmount;
    }

    /**
     * Internal Getter for Memo.
     * The debit note memo.
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
     * The debit note memo.
     * @return Returns the String
     */
    public String getMemo() {
        return OptionalNullable.getFrom(memo);
    }

    /**
     * Setter for Memo.
     * The debit note memo.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = OptionalNullable.of(memo);
    }

    /**
     * UnSetter for Memo.
     * The debit note memo.
     */
    public void unsetMemo() {
        memo = null;
    }

    /**
     * Internal Getter for TransactionTime.
     * The time the debit note was applied, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z"
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("transaction_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetTransactionTime() {
        return this.transactionTime;
    }

    /**
     * Getter for TransactionTime.
     * The time the debit note was applied, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z"
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getTransactionTime() {
        return OptionalNullable.getFrom(transactionTime);
    }

    /**
     * Setter for TransactionTime.
     * The time the debit note was applied, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z"
     * @param transactionTime Value for ZonedDateTime
     */
    @JsonSetter("transaction_time")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setTransactionTime(ZonedDateTime transactionTime) {
        this.transactionTime = OptionalNullable.of(transactionTime);
    }

    /**
     * UnSetter for TransactionTime.
     * The time the debit note was applied, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z"
     */
    public void unsetTransactionTime() {
        transactionTime = null;
    }

    /**
     * Converts this ApplyDebitNoteEventData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApplyDebitNoteEventData [" + "debitNoteNumber=" + debitNoteNumber
                + ", debitNoteUid=" + debitNoteUid + ", originalAmount=" + originalAmount
                + ", appliedAmount=" + appliedAmount + ", memo=" + memo + ", transactionTime="
                + transactionTime + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ApplyDebitNoteEventData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApplyDebitNoteEventData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(debitNoteNumber, debitNoteUid, originalAmount, appliedAmount);
        builder.memo = internalGetMemo();
        builder.transactionTime = internalGetTransactionTime();
        return builder;
    }

    /**
     * Class to build instances of {@link ApplyDebitNoteEventData}.
     */
    public static class Builder {
        private String debitNoteNumber;
        private String debitNoteUid;
        private String originalAmount;
        private String appliedAmount;
        private OptionalNullable<String> memo;
        private OptionalNullable<ZonedDateTime> transactionTime;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  debitNoteNumber  String value for debitNoteNumber.
         * @param  debitNoteUid  String value for debitNoteUid.
         * @param  originalAmount  String value for originalAmount.
         * @param  appliedAmount  String value for appliedAmount.
         */
        public Builder(String debitNoteNumber, String debitNoteUid, String originalAmount,
                String appliedAmount) {
            this.debitNoteNumber = debitNoteNumber;
            this.debitNoteUid = debitNoteUid;
            this.originalAmount = originalAmount;
            this.appliedAmount = appliedAmount;
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
         * Setter for transactionTime.
         * @param  transactionTime  ZonedDateTime value for transactionTime.
         * @return Builder
         */
        public Builder transactionTime(ZonedDateTime transactionTime) {
            this.transactionTime = OptionalNullable.of(transactionTime);
            return this;
        }

        /**
         * UnSetter for transactionTime.
         * @return Builder
         */
        public Builder unsetTransactionTime() {
            transactionTime = null;
            return this;
        }

        /**
         * Builds a new {@link ApplyDebitNoteEventData} object using the set fields.
         * @return {@link ApplyDebitNoteEventData}
         */
        public ApplyDebitNoteEventData build() {
            return new ApplyDebitNoteEventData(debitNoteNumber, debitNoteUid, originalAmount,
                    appliedAmount, memo, transactionTime);
        }
    }
}
