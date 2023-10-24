/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for ProformaInvoiceTax type.
 */
public class ProformaInvoiceTax {
    private String uid;
    private String title;
    private String sourceType;
    private String percentage;
    private String taxableAmount;
    private String taxAmount;
    private List<ProformaInvoiceTaxBreakout> lineItemBreakouts;

    /**
     * Default constructor.
     */
    public ProformaInvoiceTax() {
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  title  String value for title.
     * @param  sourceType  String value for sourceType.
     * @param  percentage  String value for percentage.
     * @param  taxableAmount  String value for taxableAmount.
     * @param  taxAmount  String value for taxAmount.
     * @param  lineItemBreakouts  List of ProformaInvoiceTaxBreakout value for lineItemBreakouts.
     */
    public ProformaInvoiceTax(
            String uid,
            String title,
            String sourceType,
            String percentage,
            String taxableAmount,
            String taxAmount,
            List<ProformaInvoiceTaxBreakout> lineItemBreakouts) {
        this.uid = uid;
        this.title = title;
        this.sourceType = sourceType;
        this.percentage = percentage;
        this.taxableAmount = taxableAmount;
        this.taxAmount = taxAmount;
        this.lineItemBreakouts = lineItemBreakouts;
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
     * Getter for Title.
     * @return Returns the String
     */
    @JsonGetter("title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTitle() {
        return title;
    }

    /**
     * Setter for Title.
     * @param title Value for String
     */
    @JsonSetter("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for SourceType.
     * @return Returns the String
     */
    @JsonGetter("source_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSourceType() {
        return sourceType;
    }

    /**
     * Setter for SourceType.
     * @param sourceType Value for String
     */
    @JsonSetter("source_type")
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * Getter for Percentage.
     * @return Returns the String
     */
    @JsonGetter("percentage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPercentage() {
        return percentage;
    }

    /**
     * Setter for Percentage.
     * @param percentage Value for String
     */
    @JsonSetter("percentage")
    public void setPercentage(String percentage) {
        this.percentage = percentage;
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
     * Getter for LineItemBreakouts.
     * @return Returns the List of ProformaInvoiceTaxBreakout
     */
    @JsonGetter("line_item_breakouts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ProformaInvoiceTaxBreakout> getLineItemBreakouts() {
        return lineItemBreakouts;
    }

    /**
     * Setter for LineItemBreakouts.
     * @param lineItemBreakouts Value for List of ProformaInvoiceTaxBreakout
     */
    @JsonSetter("line_item_breakouts")
    public void setLineItemBreakouts(List<ProformaInvoiceTaxBreakout> lineItemBreakouts) {
        this.lineItemBreakouts = lineItemBreakouts;
    }

    /**
     * Converts this ProformaInvoiceTax into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProformaInvoiceTax [" + "uid=" + uid + ", title=" + title + ", sourceType="
                + sourceType + ", percentage=" + percentage + ", taxableAmount=" + taxableAmount
                + ", taxAmount=" + taxAmount + ", lineItemBreakouts=" + lineItemBreakouts + "]";
    }

    /**
     * Builds a new {@link ProformaInvoiceTax.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProformaInvoiceTax.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .title(getTitle())
                .sourceType(getSourceType())
                .percentage(getPercentage())
                .taxableAmount(getTaxableAmount())
                .taxAmount(getTaxAmount())
                .lineItemBreakouts(getLineItemBreakouts());
        return builder;
    }

    /**
     * Class to build instances of {@link ProformaInvoiceTax}.
     */
    public static class Builder {
        private String uid;
        private String title;
        private String sourceType;
        private String percentage;
        private String taxableAmount;
        private String taxAmount;
        private List<ProformaInvoiceTaxBreakout> lineItemBreakouts;



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
         * Setter for title.
         * @param  title  String value for title.
         * @return Builder
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * Setter for sourceType.
         * @param  sourceType  String value for sourceType.
         * @return Builder
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * Setter for percentage.
         * @param  percentage  String value for percentage.
         * @return Builder
         */
        public Builder percentage(String percentage) {
            this.percentage = percentage;
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
         * Setter for lineItemBreakouts.
         * @param  lineItemBreakouts  List of ProformaInvoiceTaxBreakout value for
         *         lineItemBreakouts.
         * @return Builder
         */
        public Builder lineItemBreakouts(List<ProformaInvoiceTaxBreakout> lineItemBreakouts) {
            this.lineItemBreakouts = lineItemBreakouts;
            return this;
        }

        /**
         * Builds a new {@link ProformaInvoiceTax} object using the set fields.
         * @return {@link ProformaInvoiceTax}
         */
        public ProformaInvoiceTax build() {
            return new ProformaInvoiceTax(uid, title, sourceType, percentage, taxableAmount,
                    taxAmount, lineItemBreakouts);
        }
    }
}
