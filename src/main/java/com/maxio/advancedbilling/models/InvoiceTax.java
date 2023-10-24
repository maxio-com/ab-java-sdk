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
 * This is a model class for InvoiceTax type.
 */
public class InvoiceTax {
    private String uid;
    private String title;
    private String sourceType;
    private Integer sourceId;
    private String percentage;
    private String taxableAmount;
    private String taxAmount;
    private List<InvoiceTaxBreakout> lineItemBreakouts;

    /**
     * Default constructor.
     */
    public InvoiceTax() {
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  title  String value for title.
     * @param  sourceType  String value for sourceType.
     * @param  sourceId  Integer value for sourceId.
     * @param  percentage  String value for percentage.
     * @param  taxableAmount  String value for taxableAmount.
     * @param  taxAmount  String value for taxAmount.
     * @param  lineItemBreakouts  List of InvoiceTaxBreakout value for lineItemBreakouts.
     */
    public InvoiceTax(
            String uid,
            String title,
            String sourceType,
            Integer sourceId,
            String percentage,
            String taxableAmount,
            String taxAmount,
            List<InvoiceTaxBreakout> lineItemBreakouts) {
        this.uid = uid;
        this.title = title;
        this.sourceType = sourceType;
        this.sourceId = sourceId;
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
     * Getter for SourceId.
     * @return Returns the Integer
     */
    @JsonGetter("source_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSourceId() {
        return sourceId;
    }

    /**
     * Setter for SourceId.
     * @param sourceId Value for Integer
     */
    @JsonSetter("source_id")
    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
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
     * @return Returns the List of InvoiceTaxBreakout
     */
    @JsonGetter("line_item_breakouts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InvoiceTaxBreakout> getLineItemBreakouts() {
        return lineItemBreakouts;
    }

    /**
     * Setter for LineItemBreakouts.
     * @param lineItemBreakouts Value for List of InvoiceTaxBreakout
     */
    @JsonSetter("line_item_breakouts")
    public void setLineItemBreakouts(List<InvoiceTaxBreakout> lineItemBreakouts) {
        this.lineItemBreakouts = lineItemBreakouts;
    }

    /**
     * Converts this InvoiceTax into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoiceTax [" + "uid=" + uid + ", title=" + title + ", sourceType=" + sourceType
                + ", sourceId=" + sourceId + ", percentage=" + percentage + ", taxableAmount="
                + taxableAmount + ", taxAmount=" + taxAmount + ", lineItemBreakouts="
                + lineItemBreakouts + "]";
    }

    /**
     * Builds a new {@link InvoiceTax.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoiceTax.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .title(getTitle())
                .sourceType(getSourceType())
                .sourceId(getSourceId())
                .percentage(getPercentage())
                .taxableAmount(getTaxableAmount())
                .taxAmount(getTaxAmount())
                .lineItemBreakouts(getLineItemBreakouts());
        return builder;
    }

    /**
     * Class to build instances of {@link InvoiceTax}.
     */
    public static class Builder {
        private String uid;
        private String title;
        private String sourceType;
        private Integer sourceId;
        private String percentage;
        private String taxableAmount;
        private String taxAmount;
        private List<InvoiceTaxBreakout> lineItemBreakouts;



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
         * Setter for sourceId.
         * @param  sourceId  Integer value for sourceId.
         * @return Builder
         */
        public Builder sourceId(Integer sourceId) {
            this.sourceId = sourceId;
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
         * @param  lineItemBreakouts  List of InvoiceTaxBreakout value for lineItemBreakouts.
         * @return Builder
         */
        public Builder lineItemBreakouts(List<InvoiceTaxBreakout> lineItemBreakouts) {
            this.lineItemBreakouts = lineItemBreakouts;
            return this;
        }

        /**
         * Builds a new {@link InvoiceTax} object using the set fields.
         * @return {@link InvoiceTax}
         */
        public InvoiceTax build() {
            return new InvoiceTax(uid, title, sourceType, sourceId, percentage, taxableAmount,
                    taxAmount, lineItemBreakouts);
        }
    }
}
