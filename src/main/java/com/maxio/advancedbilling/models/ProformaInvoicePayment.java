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
 * This is a model class for ProformaInvoicePayment type.
 */
public class ProformaInvoicePayment {
    private String memo;
    private String originalAmount;
    private String appliedAmount;
    private Boolean prepayment;

    /**
     * Default constructor.
     */
    public ProformaInvoicePayment() {
    }

    /**
     * Initialization constructor.
     * @param  memo  String value for memo.
     * @param  originalAmount  String value for originalAmount.
     * @param  appliedAmount  String value for appliedAmount.
     * @param  prepayment  Boolean value for prepayment.
     */
    public ProformaInvoicePayment(
            String memo,
            String originalAmount,
            String appliedAmount,
            Boolean prepayment) {
        this.memo = memo;
        this.originalAmount = originalAmount;
        this.appliedAmount = appliedAmount;
        this.prepayment = prepayment;
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
     * Getter for Prepayment.
     * @return Returns the Boolean
     */
    @JsonGetter("prepayment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPrepayment() {
        return prepayment;
    }

    /**
     * Setter for Prepayment.
     * @param prepayment Value for Boolean
     */
    @JsonSetter("prepayment")
    public void setPrepayment(Boolean prepayment) {
        this.prepayment = prepayment;
    }

    /**
     * Converts this ProformaInvoicePayment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProformaInvoicePayment [" + "memo=" + memo + ", originalAmount=" + originalAmount
                + ", appliedAmount=" + appliedAmount + ", prepayment=" + prepayment + "]";
    }

    /**
     * Builds a new {@link ProformaInvoicePayment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProformaInvoicePayment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .memo(getMemo())
                .originalAmount(getOriginalAmount())
                .appliedAmount(getAppliedAmount())
                .prepayment(getPrepayment());
        return builder;
    }

    /**
     * Class to build instances of {@link ProformaInvoicePayment}.
     */
    public static class Builder {
        private String memo;
        private String originalAmount;
        private String appliedAmount;
        private Boolean prepayment;



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
         * Setter for prepayment.
         * @param  prepayment  Boolean value for prepayment.
         * @return Builder
         */
        public Builder prepayment(Boolean prepayment) {
            this.prepayment = prepayment;
            return this;
        }

        /**
         * Builds a new {@link ProformaInvoicePayment} object using the set fields.
         * @return {@link ProformaInvoicePayment}
         */
        public ProformaInvoicePayment build() {
            return new ProformaInvoicePayment(memo, originalAmount, appliedAmount, prepayment);
        }
    }
}
