/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.ZonedDateTime;

/**
 * This is a model class for VoidRemainderEventData type.
 */
public class VoidRemainderEventData
        extends BaseModel {
    private CreditNote creditNoteAttributes;
    private String memo;
    private String appliedAmount;
    private ZonedDateTime transactionTime;

    /**
     * Default constructor.
     */
    public VoidRemainderEventData() {
    }

    /**
     * Initialization constructor.
     * @param  creditNoteAttributes  CreditNote value for creditNoteAttributes.
     * @param  memo  String value for memo.
     * @param  appliedAmount  String value for appliedAmount.
     * @param  transactionTime  ZonedDateTime value for transactionTime.
     */
    public VoidRemainderEventData(
            CreditNote creditNoteAttributes,
            String memo,
            String appliedAmount,
            ZonedDateTime transactionTime) {
        this.creditNoteAttributes = creditNoteAttributes;
        this.memo = memo;
        this.appliedAmount = appliedAmount;
        this.transactionTime = transactionTime;
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
     * The memo provided during invoice remainder voiding.
     * @return Returns the String
     */
    @JsonGetter("memo")
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * The memo provided during invoice remainder voiding.
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
     * Converts this VoidRemainderEventData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "VoidRemainderEventData [" + "creditNoteAttributes=" + creditNoteAttributes
                + ", memo=" + memo + ", appliedAmount=" + appliedAmount + ", transactionTime="
                + transactionTime + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(creditNoteAttributes, memo, appliedAmount, transactionTime);
        return builder;
    }

    /**
     * Class to build instances of {@link VoidRemainderEventData}.
     */
    public static class Builder {
        private CreditNote creditNoteAttributes;
        private String memo;
        private String appliedAmount;
        private ZonedDateTime transactionTime;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  creditNoteAttributes  CreditNote value for creditNoteAttributes.
         * @param  memo  String value for memo.
         * @param  appliedAmount  String value for appliedAmount.
         * @param  transactionTime  ZonedDateTime value for transactionTime.
         */
        public Builder(CreditNote creditNoteAttributes, String memo, String appliedAmount,
                ZonedDateTime transactionTime) {
            this.creditNoteAttributes = creditNoteAttributes;
            this.memo = memo;
            this.appliedAmount = appliedAmount;
            this.transactionTime = transactionTime;
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
         * Builds a new {@link VoidRemainderEventData} object using the set fields.
         * @return {@link VoidRemainderEventData}
         */
        public VoidRemainderEventData build() {
            return new VoidRemainderEventData(creditNoteAttributes, memo, appliedAmount,
                    transactionTime);
        }
    }
}
