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
 * This is a model class for ApplyDebitNoteEventData type.
 */
public class ApplyDebitNoteEventData {
    private String debitNoteNumber;
    private String debitNoteUid;
    private String originalAmount;
    private String appliedAmount;

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
     */
    public ApplyDebitNoteEventData(
            String debitNoteNumber,
            String debitNoteUid,
            String originalAmount,
            String appliedAmount) {
        this.debitNoteNumber = debitNoteNumber;
        this.debitNoteUid = debitNoteUid;
        this.originalAmount = originalAmount;
        this.appliedAmount = appliedAmount;
    }

    /**
     * Getter for DebitNoteNumber.
     * A unique, identifying string that appears on the debit note and in places it is referenced.
     * @return Returns the String
     */
    @JsonGetter("debit_note_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Converts this ApplyDebitNoteEventData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApplyDebitNoteEventData [" + "debitNoteNumber=" + debitNoteNumber
                + ", debitNoteUid=" + debitNoteUid + ", originalAmount=" + originalAmount
                + ", appliedAmount=" + appliedAmount + "]";
    }

    /**
     * Builds a new {@link ApplyDebitNoteEventData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApplyDebitNoteEventData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .debitNoteNumber(getDebitNoteNumber())
                .debitNoteUid(getDebitNoteUid())
                .originalAmount(getOriginalAmount())
                .appliedAmount(getAppliedAmount());
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
         * Builds a new {@link ApplyDebitNoteEventData} object using the set fields.
         * @return {@link ApplyDebitNoteEventData}
         */
        public ApplyDebitNoteEventData build() {
            return new ApplyDebitNoteEventData(debitNoteNumber, debitNoteUid, originalAmount,
                    appliedAmount);
        }
    }
}
