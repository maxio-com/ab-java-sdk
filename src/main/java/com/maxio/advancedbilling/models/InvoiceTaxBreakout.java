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
 * This is a model class for InvoiceTaxBreakout type.
 */
public class InvoiceTaxBreakout {
    private String uid;
    private String taxableAmount;
    private String taxAmount;

    /**
     * Default constructor.
     */
    public InvoiceTaxBreakout() {
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  taxableAmount  String value for taxableAmount.
     * @param  taxAmount  String value for taxAmount.
     */
    public InvoiceTaxBreakout(
            String uid,
            String taxableAmount,
            String taxAmount) {
        this.uid = uid;
        this.taxableAmount = taxableAmount;
        this.taxAmount = taxAmount;
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
     * Getter for TaxableAmount.
     * @return Returns the String
     */
    @JsonGetter("taxable_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTaxableAmount() {
        return taxableAmount;
    }

    /**
     * Setter for TaxableAmount.
     * @param taxableAmount Value for String
     */
    @JsonSetter("taxable_amount")
    public void setTaxableAmount(String taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    /**
     * Getter for TaxAmount.
     * @return Returns the String
     */
    @JsonGetter("tax_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Setter for TaxAmount.
     * @param taxAmount Value for String
     */
    @JsonSetter("tax_amount")
    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }

    /**
     * Converts this InvoiceTaxBreakout into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoiceTaxBreakout [" + "uid=" + uid + ", taxableAmount=" + taxableAmount
                + ", taxAmount=" + taxAmount + "]";
    }

    /**
     * Builds a new {@link InvoiceTaxBreakout.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoiceTaxBreakout.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .taxableAmount(getTaxableAmount())
                .taxAmount(getTaxAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link InvoiceTaxBreakout}.
     */
    public static class Builder {
        private String uid;
        private String taxableAmount;
        private String taxAmount;



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
         * Setter for taxableAmount.
         * @param  taxableAmount  String value for taxableAmount.
         * @return Builder
         */
        public Builder taxableAmount(String taxableAmount) {
            this.taxableAmount = taxableAmount;
            return this;
        }

        /**
         * Setter for taxAmount.
         * @param  taxAmount  String value for taxAmount.
         * @return Builder
         */
        public Builder taxAmount(String taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }

        /**
         * Builds a new {@link InvoiceTaxBreakout} object using the set fields.
         * @return {@link InvoiceTaxBreakout}
         */
        public InvoiceTaxBreakout build() {
            return new InvoiceTaxBreakout(uid, taxableAmount, taxAmount);
        }
    }
}
