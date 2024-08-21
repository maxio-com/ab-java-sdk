/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for InvoiceTaxComponentBreakout type.
 */
public class InvoiceTaxComponentBreakout
        extends BaseModel {
    private Integer taxRuleId;
    private String percentage;
    private String countryCode;
    private String subdivisionCode;
    private String taxAmount;
    private String taxableAmount;
    private String taxExemptAmount;
    private String nonTaxableAmount;
    private String taxName;
    private String taxType;
    private String rateType;
    private Integer taxAuthorityType;
    private String stateAssignedNo;
    private String taxSubType;

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
     * @param  taxAmount  String value for taxAmount.
     * @param  taxableAmount  String value for taxableAmount.
     * @param  taxExemptAmount  String value for taxExemptAmount.
     * @param  nonTaxableAmount  String value for nonTaxableAmount.
     * @param  taxName  String value for taxName.
     * @param  taxType  String value for taxType.
     * @param  rateType  String value for rateType.
     * @param  taxAuthorityType  Integer value for taxAuthorityType.
     * @param  stateAssignedNo  String value for stateAssignedNo.
     * @param  taxSubType  String value for taxSubType.
     */
    public InvoiceTaxComponentBreakout(
            Integer taxRuleId,
            String percentage,
            String countryCode,
            String subdivisionCode,
            String taxAmount,
            String taxableAmount,
            String taxExemptAmount,
            String nonTaxableAmount,
            String taxName,
            String taxType,
            String rateType,
            Integer taxAuthorityType,
            String stateAssignedNo,
            String taxSubType) {
        this.taxRuleId = taxRuleId;
        this.percentage = percentage;
        this.countryCode = countryCode;
        this.subdivisionCode = subdivisionCode;
        this.taxAmount = taxAmount;
        this.taxableAmount = taxableAmount;
        this.taxExemptAmount = taxExemptAmount;
        this.nonTaxableAmount = nonTaxableAmount;
        this.taxName = taxName;
        this.taxType = taxType;
        this.rateType = rateType;
        this.taxAuthorityType = taxAuthorityType;
        this.stateAssignedNo = stateAssignedNo;
        this.taxSubType = taxSubType;
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
     * Getter for TaxExemptAmount.
     * @return Returns the String
     */
    @JsonGetter("tax_exempt_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTaxExemptAmount() {
        return taxExemptAmount;
    }

    /**
     * Setter for TaxExemptAmount.
     * @param taxExemptAmount Value for String
     */
    @JsonSetter("tax_exempt_amount")
    public void setTaxExemptAmount(String taxExemptAmount) {
        this.taxExemptAmount = taxExemptAmount;
    }

    /**
     * Getter for NonTaxableAmount.
     * @return Returns the String
     */
    @JsonGetter("non_taxable_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNonTaxableAmount() {
        return nonTaxableAmount;
    }

    /**
     * Setter for NonTaxableAmount.
     * @param nonTaxableAmount Value for String
     */
    @JsonSetter("non_taxable_amount")
    public void setNonTaxableAmount(String nonTaxableAmount) {
        this.nonTaxableAmount = nonTaxableAmount;
    }

    /**
     * Getter for TaxName.
     * @return Returns the String
     */
    @JsonGetter("tax_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTaxName() {
        return taxName;
    }

    /**
     * Setter for TaxName.
     * @param taxName Value for String
     */
    @JsonSetter("tax_name")
    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    /**
     * Getter for TaxType.
     * @return Returns the String
     */
    @JsonGetter("tax_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTaxType() {
        return taxType;
    }

    /**
     * Setter for TaxType.
     * @param taxType Value for String
     */
    @JsonSetter("tax_type")
    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    /**
     * Getter for RateType.
     * @return Returns the String
     */
    @JsonGetter("rate_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRateType() {
        return rateType;
    }

    /**
     * Setter for RateType.
     * @param rateType Value for String
     */
    @JsonSetter("rate_type")
    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    /**
     * Getter for TaxAuthorityType.
     * @return Returns the Integer
     */
    @JsonGetter("tax_authority_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTaxAuthorityType() {
        return taxAuthorityType;
    }

    /**
     * Setter for TaxAuthorityType.
     * @param taxAuthorityType Value for Integer
     */
    @JsonSetter("tax_authority_type")
    public void setTaxAuthorityType(Integer taxAuthorityType) {
        this.taxAuthorityType = taxAuthorityType;
    }

    /**
     * Getter for StateAssignedNo.
     * @return Returns the String
     */
    @JsonGetter("state_assigned_no")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStateAssignedNo() {
        return stateAssignedNo;
    }

    /**
     * Setter for StateAssignedNo.
     * @param stateAssignedNo Value for String
     */
    @JsonSetter("state_assigned_no")
    public void setStateAssignedNo(String stateAssignedNo) {
        this.stateAssignedNo = stateAssignedNo;
    }

    /**
     * Getter for TaxSubType.
     * @return Returns the String
     */
    @JsonGetter("tax_sub_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTaxSubType() {
        return taxSubType;
    }

    /**
     * Setter for TaxSubType.
     * @param taxSubType Value for String
     */
    @JsonSetter("tax_sub_type")
    public void setTaxSubType(String taxSubType) {
        this.taxSubType = taxSubType;
    }

    /**
     * Converts this InvoiceTaxComponentBreakout into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoiceTaxComponentBreakout [" + "taxRuleId=" + taxRuleId + ", percentage="
                + percentage + ", countryCode=" + countryCode + ", subdivisionCode="
                + subdivisionCode + ", taxAmount=" + taxAmount + ", taxableAmount=" + taxableAmount
                + ", taxExemptAmount=" + taxExemptAmount + ", nonTaxableAmount=" + nonTaxableAmount
                + ", taxName=" + taxName + ", taxType=" + taxType + ", rateType=" + rateType
                + ", taxAuthorityType=" + taxAuthorityType + ", stateAssignedNo=" + stateAssignedNo
                + ", taxSubType=" + taxSubType + ", additionalProperties="
                + getAdditionalProperties() + "]";
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
                .subdivisionCode(getSubdivisionCode())
                .taxAmount(getTaxAmount())
                .taxableAmount(getTaxableAmount())
                .taxExemptAmount(getTaxExemptAmount())
                .nonTaxableAmount(getNonTaxableAmount())
                .taxName(getTaxName())
                .taxType(getTaxType())
                .rateType(getRateType())
                .taxAuthorityType(getTaxAuthorityType())
                .stateAssignedNo(getStateAssignedNo())
                .taxSubType(getTaxSubType());
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
        private String taxAmount;
        private String taxableAmount;
        private String taxExemptAmount;
        private String nonTaxableAmount;
        private String taxName;
        private String taxType;
        private String rateType;
        private Integer taxAuthorityType;
        private String stateAssignedNo;
        private String taxSubType;



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
         * Setter for taxAmount.
         * @param  taxAmount  String value for taxAmount.
         * @return Builder
         */
        public Builder taxAmount(String taxAmount) {
            this.taxAmount = taxAmount;
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
         * Setter for taxExemptAmount.
         * @param  taxExemptAmount  String value for taxExemptAmount.
         * @return Builder
         */
        public Builder taxExemptAmount(String taxExemptAmount) {
            this.taxExemptAmount = taxExemptAmount;
            return this;
        }

        /**
         * Setter for nonTaxableAmount.
         * @param  nonTaxableAmount  String value for nonTaxableAmount.
         * @return Builder
         */
        public Builder nonTaxableAmount(String nonTaxableAmount) {
            this.nonTaxableAmount = nonTaxableAmount;
            return this;
        }

        /**
         * Setter for taxName.
         * @param  taxName  String value for taxName.
         * @return Builder
         */
        public Builder taxName(String taxName) {
            this.taxName = taxName;
            return this;
        }

        /**
         * Setter for taxType.
         * @param  taxType  String value for taxType.
         * @return Builder
         */
        public Builder taxType(String taxType) {
            this.taxType = taxType;
            return this;
        }

        /**
         * Setter for rateType.
         * @param  rateType  String value for rateType.
         * @return Builder
         */
        public Builder rateType(String rateType) {
            this.rateType = rateType;
            return this;
        }

        /**
         * Setter for taxAuthorityType.
         * @param  taxAuthorityType  Integer value for taxAuthorityType.
         * @return Builder
         */
        public Builder taxAuthorityType(Integer taxAuthorityType) {
            this.taxAuthorityType = taxAuthorityType;
            return this;
        }

        /**
         * Setter for stateAssignedNo.
         * @param  stateAssignedNo  String value for stateAssignedNo.
         * @return Builder
         */
        public Builder stateAssignedNo(String stateAssignedNo) {
            this.stateAssignedNo = stateAssignedNo;
            return this;
        }

        /**
         * Setter for taxSubType.
         * @param  taxSubType  String value for taxSubType.
         * @return Builder
         */
        public Builder taxSubType(String taxSubType) {
            this.taxSubType = taxSubType;
            return this;
        }

        /**
         * Builds a new {@link InvoiceTaxComponentBreakout} object using the set fields.
         * @return {@link InvoiceTaxComponentBreakout}
         */
        public InvoiceTaxComponentBreakout build() {
            return new InvoiceTaxComponentBreakout(taxRuleId, percentage, countryCode,
                    subdivisionCode, taxAmount, taxableAmount, taxExemptAmount, nonTaxableAmount,
                    taxName, taxType, rateType, taxAuthorityType, stateAssignedNo, taxSubType);
        }
    }
}
