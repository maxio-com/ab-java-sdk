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
 * This is a model class for ProformaInvoiceCredit type.
 */
public class ProformaInvoiceCredit {
    private String uid;
    private String memo;
    private String originalAmount;
    private String appliedAmount;

    /**
     * Default constructor.
     */
    public ProformaInvoiceCredit() {
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  memo  String value for memo.
     * @param  originalAmount  String value for originalAmount.
     * @param  appliedAmount  String value for appliedAmount.
     */
    public ProformaInvoiceCredit(
            String uid,
            String memo,
            String originalAmount,
            String appliedAmount) {
        this.uid = uid;
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
     * Converts this ProformaInvoiceCredit into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProformaInvoiceCredit [" + "uid=" + uid + ", memo=" + memo + ", originalAmount="
                + originalAmount + ", appliedAmount=" + appliedAmount + "]";
    }

    /**
     * Builds a new {@link ProformaInvoiceCredit.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProformaInvoiceCredit.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .memo(getMemo())
                .originalAmount(getOriginalAmount())
                .appliedAmount(getAppliedAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link ProformaInvoiceCredit}.
     */
    public static class Builder {
        private String uid;
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
         * Builds a new {@link ProformaInvoiceCredit} object using the set fields.
         * @return {@link ProformaInvoiceCredit}
         */
        public ProformaInvoiceCredit build() {
            return new ProformaInvoiceCredit(uid, memo, originalAmount, appliedAmount);
        }
    }
}
