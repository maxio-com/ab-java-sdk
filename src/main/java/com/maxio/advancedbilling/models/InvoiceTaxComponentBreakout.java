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
 * This is a model class for InvoiceTaxComponentBreakout type.
 */
public class InvoiceTaxComponentBreakout {
    private Integer taxRuleId;
    private String percentage;
    private String countryCode;
    private String subdivisionCode;

    /**
     * Default constructor.
     */
    public InvoiceTaxComponentBreakout() {
    }

    /**
     * Initialization constructor.
     * @param  taxRuleId  Integer value for taxRuleId.
     * @param  percentage  String value for percentage.
     * @param  countryCode  String value for countryCode.
     * @param  subdivisionCode  String value for subdivisionCode.
     */
    public InvoiceTaxComponentBreakout(
            Integer taxRuleId,
            String percentage,
            String countryCode,
            String subdivisionCode) {
        this.taxRuleId = taxRuleId;
        this.percentage = percentage;
        this.countryCode = countryCode;
        this.subdivisionCode = subdivisionCode;
    }

    /**
     * Getter for TaxRuleId.
     * @return Returns the Integer
     */
    @JsonGetter("tax_rule_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTaxRuleId() {
        return taxRuleId;
    }

    /**
     * Setter for TaxRuleId.
     * @param taxRuleId Value for Integer
     */
    @JsonSetter("tax_rule_id")
    public void setTaxRuleId(Integer taxRuleId) {
        this.taxRuleId = taxRuleId;
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
     * Getter for CountryCode.
     * @return Returns the String
     */
    @JsonGetter("country_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Setter for CountryCode.
     * @param countryCode Value for String
     */
    @JsonSetter("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Getter for SubdivisionCode.
     * @return Returns the String
     */
    @JsonGetter("subdivision_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSubdivisionCode() {
        return subdivisionCode;
    }

    /**
     * Setter for SubdivisionCode.
     * @param subdivisionCode Value for String
     */
    @JsonSetter("subdivision_code")
    public void setSubdivisionCode(String subdivisionCode) {
        this.subdivisionCode = subdivisionCode;
    }

    /**
     * Converts this InvoiceTaxComponentBreakout into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoiceTaxComponentBreakout [" + "taxRuleId=" + taxRuleId + ", percentage="
                + percentage + ", countryCode=" + countryCode + ", subdivisionCode="
                + subdivisionCode + "]";
    }

    /**
     * Builds a new {@link InvoiceTaxComponentBreakout.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoiceTaxComponentBreakout.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .taxRuleId(getTaxRuleId())
                .percentage(getPercentage())
                .countryCode(getCountryCode())
                .subdivisionCode(getSubdivisionCode());
        return builder;
    }

    /**
     * Class to build instances of {@link InvoiceTaxComponentBreakout}.
     */
    public static class Builder {
        private Integer taxRuleId;
        private String percentage;
        private String countryCode;
        private String subdivisionCode;



        /**
         * Setter for taxRuleId.
         * @param  taxRuleId  Integer value for taxRuleId.
         * @return Builder
         */
        public Builder taxRuleId(Integer taxRuleId) {
            this.taxRuleId = taxRuleId;
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
         * Setter for countryCode.
         * @param  countryCode  String value for countryCode.
         * @return Builder
         */
        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        /**
         * Setter for subdivisionCode.
         * @param  subdivisionCode  String value for subdivisionCode.
         * @return Builder
         */
        public Builder subdivisionCode(String subdivisionCode) {
            this.subdivisionCode = subdivisionCode;
            return this;
        }

        /**
         * Builds a new {@link InvoiceTaxComponentBreakout} object using the set fields.
         * @return {@link InvoiceTaxComponentBreakout}
         */
        public InvoiceTaxComponentBreakout build() {
            return new InvoiceTaxComponentBreakout(taxRuleId, percentage, countryCode,
                    subdivisionCode);
        }
    }
}
