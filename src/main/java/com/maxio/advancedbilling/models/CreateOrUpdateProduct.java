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
 * This is a model class for CreateOrUpdateProduct type.
 */
public class CreateOrUpdateProduct {
    private String name;
    private String handle;
    private String description;
    private String accountingCode;
    private Boolean requireCreditCard;
    private int priceInCents;
    private int interval;
    private String intervalUnit;
    private Boolean autoCreateSignupPage;
    private String taxCode;

    /**
     * Default constructor.
     */
    public CreateOrUpdateProduct() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  description  String value for description.
     * @param  priceInCents  int value for priceInCents.
     * @param  interval  int value for interval.
     * @param  intervalUnit  String value for intervalUnit.
     * @param  handle  String value for handle.
     * @param  accountingCode  String value for accountingCode.
     * @param  requireCreditCard  Boolean value for requireCreditCard.
     * @param  autoCreateSignupPage  Boolean value for autoCreateSignupPage.
     * @param  taxCode  String value for taxCode.
     */
    public CreateOrUpdateProduct(
            String name,
            String description,
            int priceInCents,
            int interval,
            String intervalUnit,
            String handle,
            String accountingCode,
            Boolean requireCreditCard,
            Boolean autoCreateSignupPage,
            String taxCode) {
        this.name = name;
        this.handle = handle;
        this.description = description;
        this.accountingCode = accountingCode;
        this.requireCreditCard = requireCreditCard;
        this.priceInCents = priceInCents;
        this.interval = interval;
        this.intervalUnit = intervalUnit;
        this.autoCreateSignupPage = autoCreateSignupPage;
        this.taxCode = taxCode;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Handle.
     * @return Returns the String
     */
    @JsonGetter("handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHandle() {
        return handle;
    }

    /**
     * Setter for Handle.
     * @param handle Value for String
     */
    @JsonSetter("handle")
    public void setHandle(String handle) {
        this.handle = handle;
    }

    /**
     * Getter for Description.
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for AccountingCode.
     * @return Returns the String
     */
    @JsonGetter("accounting_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccountingCode() {
        return accountingCode;
    }

    /**
     * Setter for AccountingCode.
     * @param accountingCode Value for String
     */
    @JsonSetter("accounting_code")
    public void setAccountingCode(String accountingCode) {
        this.accountingCode = accountingCode;
    }

    /**
     * Getter for RequireCreditCard.
     * @return Returns the Boolean
     */
    @JsonGetter("require_credit_card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRequireCreditCard() {
        return requireCreditCard;
    }

    /**
     * Setter for RequireCreditCard.
     * @param requireCreditCard Value for Boolean
     */
    @JsonSetter("require_credit_card")
    public void setRequireCreditCard(Boolean requireCreditCard) {
        this.requireCreditCard = requireCreditCard;
    }

    /**
     * Getter for PriceInCents.
     * @return Returns the int
     */
    @JsonGetter("price_in_cents")
    public int getPriceInCents() {
        return priceInCents;
    }

    /**
     * Setter for PriceInCents.
     * @param priceInCents Value for int
     */
    @JsonSetter("price_in_cents")
    public void setPriceInCents(int priceInCents) {
        this.priceInCents = priceInCents;
    }

    /**
     * Getter for Interval.
     * @return Returns the int
     */
    @JsonGetter("interval")
    public int getInterval() {
        return interval;
    }

    /**
     * Setter for Interval.
     * @param interval Value for int
     */
    @JsonSetter("interval")
    public void setInterval(int interval) {
        this.interval = interval;
    }

    /**
     * Getter for IntervalUnit.
     * @return Returns the String
     */
    @JsonGetter("interval_unit")
    public String getIntervalUnit() {
        return intervalUnit;
    }

    /**
     * Setter for IntervalUnit.
     * @param intervalUnit Value for String
     */
    @JsonSetter("interval_unit")
    public void setIntervalUnit(String intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    /**
     * Getter for AutoCreateSignupPage.
     * @return Returns the Boolean
     */
    @JsonGetter("auto_create_signup_page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAutoCreateSignupPage() {
        return autoCreateSignupPage;
    }

    /**
     * Setter for AutoCreateSignupPage.
     * @param autoCreateSignupPage Value for Boolean
     */
    @JsonSetter("auto_create_signup_page")
    public void setAutoCreateSignupPage(Boolean autoCreateSignupPage) {
        this.autoCreateSignupPage = autoCreateSignupPage;
    }

    /**
     * Getter for TaxCode.
     * @return Returns the String
     */
    @JsonGetter("tax_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * Setter for TaxCode.
     * @param taxCode Value for String
     */
    @JsonSetter("tax_code")
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    /**
     * Converts this CreateOrUpdateProduct into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateOrUpdateProduct [" + "name=" + name + ", description=" + description
                + ", priceInCents=" + priceInCents + ", interval=" + interval + ", intervalUnit="
                + intervalUnit + ", handle=" + handle + ", accountingCode=" + accountingCode
                + ", requireCreditCard=" + requireCreditCard + ", autoCreateSignupPage="
                + autoCreateSignupPage + ", taxCode=" + taxCode + "]";
    }

    /**
     * Builds a new {@link CreateOrUpdateProduct.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateOrUpdateProduct.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, description, priceInCents, interval, intervalUnit)
                .handle(getHandle())
                .accountingCode(getAccountingCode())
                .requireCreditCard(getRequireCreditCard())
                .autoCreateSignupPage(getAutoCreateSignupPage())
                .taxCode(getTaxCode());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateOrUpdateProduct}.
     */
    public static class Builder {
        private String name;
        private String description;
        private int priceInCents;
        private int interval;
        private String intervalUnit;
        private String handle;
        private String accountingCode;
        private Boolean requireCreditCard;
        private Boolean autoCreateSignupPage;
        private String taxCode;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  description  String value for description.
         * @param  priceInCents  int value for priceInCents.
         * @param  interval  int value for interval.
         * @param  intervalUnit  String value for intervalUnit.
         */
        public Builder(String name, String description, int priceInCents, int interval,
                String intervalUnit) {
            this.name = name;
            this.description = description;
            this.priceInCents = priceInCents;
            this.interval = interval;
            this.intervalUnit = intervalUnit;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for priceInCents.
         * @param  priceInCents  int value for priceInCents.
         * @return Builder
         */
        public Builder priceInCents(int priceInCents) {
            this.priceInCents = priceInCents;
            return this;
        }

        /**
         * Setter for interval.
         * @param  interval  int value for interval.
         * @return Builder
         */
        public Builder interval(int interval) {
            this.interval = interval;
            return this;
        }

        /**
         * Setter for intervalUnit.
         * @param  intervalUnit  String value for intervalUnit.
         * @return Builder
         */
        public Builder intervalUnit(String intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }

        /**
         * Setter for handle.
         * @param  handle  String value for handle.
         * @return Builder
         */
        public Builder handle(String handle) {
            this.handle = handle;
            return this;
        }

        /**
         * Setter for accountingCode.
         * @param  accountingCode  String value for accountingCode.
         * @return Builder
         */
        public Builder accountingCode(String accountingCode) {
            this.accountingCode = accountingCode;
            return this;
        }

        /**
         * Setter for requireCreditCard.
         * @param  requireCreditCard  Boolean value for requireCreditCard.
         * @return Builder
         */
        public Builder requireCreditCard(Boolean requireCreditCard) {
            this.requireCreditCard = requireCreditCard;
            return this;
        }

        /**
         * Setter for autoCreateSignupPage.
         * @param  autoCreateSignupPage  Boolean value for autoCreateSignupPage.
         * @return Builder
         */
        public Builder autoCreateSignupPage(Boolean autoCreateSignupPage) {
            this.autoCreateSignupPage = autoCreateSignupPage;
            return this;
        }

        /**
         * Setter for taxCode.
         * @param  taxCode  String value for taxCode.
         * @return Builder
         */
        public Builder taxCode(String taxCode) {
            this.taxCode = taxCode;
            return this;
        }

        /**
         * Builds a new {@link CreateOrUpdateProduct} object using the set fields.
         * @return {@link CreateOrUpdateProduct}
         */
        public CreateOrUpdateProduct build() {
            return new CreateOrUpdateProduct(name, description, priceInCents, interval,
                    intervalUnit, handle, accountingCode, requireCreditCard, autoCreateSignupPage,
                    taxCode);
        }
    }
}
