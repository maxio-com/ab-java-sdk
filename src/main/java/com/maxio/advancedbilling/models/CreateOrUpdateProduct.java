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
    private long priceInCents;
    private int interval;
    private IntervalUnit intervalUnit;
    private Long trialPriceInCents;
    private Integer trialInterval;
    private IntervalUnit trialIntervalUnit;
    private String trialType;
    private Integer expirationInterval;
    private IntervalUnit expirationIntervalUnit;
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
     * @param  priceInCents  long value for priceInCents.
     * @param  interval  int value for interval.
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     * @param  handle  String value for handle.
     * @param  accountingCode  String value for accountingCode.
     * @param  requireCreditCard  Boolean value for requireCreditCard.
     * @param  trialPriceInCents  Long value for trialPriceInCents.
     * @param  trialInterval  Integer value for trialInterval.
     * @param  trialIntervalUnit  IntervalUnit value for trialIntervalUnit.
     * @param  trialType  String value for trialType.
     * @param  expirationInterval  Integer value for expirationInterval.
     * @param  expirationIntervalUnit  IntervalUnit value for expirationIntervalUnit.
     * @param  autoCreateSignupPage  Boolean value for autoCreateSignupPage.
     * @param  taxCode  String value for taxCode.
     */
    public CreateOrUpdateProduct(
            String name,
            String description,
            long priceInCents,
            int interval,
            IntervalUnit intervalUnit,
            String handle,
            String accountingCode,
            Boolean requireCreditCard,
            Long trialPriceInCents,
            Integer trialInterval,
            IntervalUnit trialIntervalUnit,
            String trialType,
            Integer expirationInterval,
            IntervalUnit expirationIntervalUnit,
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
        this.trialPriceInCents = trialPriceInCents;
        this.trialInterval = trialInterval;
        this.trialIntervalUnit = trialIntervalUnit;
        this.trialType = trialType;
        this.expirationInterval = expirationInterval;
        this.expirationIntervalUnit = expirationIntervalUnit;
        this.autoCreateSignupPage = autoCreateSignupPage;
        this.taxCode = taxCode;
    }

    /**
     * Getter for Name.
     * The product name
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The product name
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Handle.
     * The product API handle
     * @return Returns the String
     */
    @JsonGetter("handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHandle() {
        return handle;
    }

    /**
     * Setter for Handle.
     * The product API handle
     * @param handle Value for String
     */
    @JsonSetter("handle")
    public void setHandle(String handle) {
        this.handle = handle;
    }

    /**
     * Getter for Description.
     * The product description
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * The product description
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for AccountingCode.
     * E.g. Internal ID or SKU Number
     * @return Returns the String
     */
    @JsonGetter("accounting_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccountingCode() {
        return accountingCode;
    }

    /**
     * Setter for AccountingCode.
     * E.g. Internal ID or SKU Number
     * @param accountingCode Value for String
     */
    @JsonSetter("accounting_code")
    public void setAccountingCode(String accountingCode) {
        this.accountingCode = accountingCode;
    }

    /**
     * Getter for RequireCreditCard.
     * Deprecated value that can be ignored unless you have legacy hosted pages. For Public Signup
     * Page users, please read this attribute from under the signup page.
     * @return Returns the Boolean
     */
    @JsonGetter("require_credit_card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRequireCreditCard() {
        return requireCreditCard;
    }

    /**
     * Setter for RequireCreditCard.
     * Deprecated value that can be ignored unless you have legacy hosted pages. For Public Signup
     * Page users, please read this attribute from under the signup page.
     * @param requireCreditCard Value for Boolean
     */
    @JsonSetter("require_credit_card")
    public void setRequireCreditCard(Boolean requireCreditCard) {
        this.requireCreditCard = requireCreditCard;
    }

    /**
     * Getter for PriceInCents.
     * The product price, in integer cents
     * @return Returns the long
     */
    @JsonGetter("price_in_cents")
    public long getPriceInCents() {
        return priceInCents;
    }

    /**
     * Setter for PriceInCents.
     * The product price, in integer cents
     * @param priceInCents Value for long
     */
    @JsonSetter("price_in_cents")
    public void setPriceInCents(long priceInCents) {
        this.priceInCents = priceInCents;
    }

    /**
     * Getter for Interval.
     * The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would
     * mean this product would renew every 30 days
     * @return Returns the int
     */
    @JsonGetter("interval")
    public int getInterval() {
        return interval;
    }

    /**
     * Setter for Interval.
     * The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would
     * mean this product would renew every 30 days
     * @param interval Value for int
     */
    @JsonSetter("interval")
    public void setInterval(int interval) {
        this.interval = interval;
    }

    /**
     * Getter for IntervalUnit.
     * A string representing the interval unit for this product, either month or day
     * @return Returns the IntervalUnit
     */
    @JsonGetter("interval_unit")
    public IntervalUnit getIntervalUnit() {
        return intervalUnit;
    }

    /**
     * Setter for IntervalUnit.
     * A string representing the interval unit for this product, either month or day
     * @param intervalUnit Value for IntervalUnit
     */
    @JsonSetter("interval_unit")
    public void setIntervalUnit(IntervalUnit intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    /**
     * Getter for TrialPriceInCents.
     * The product trial price, in integer cents
     * @return Returns the Long
     */
    @JsonGetter("trial_price_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getTrialPriceInCents() {
        return trialPriceInCents;
    }

    /**
     * Setter for TrialPriceInCents.
     * The product trial price, in integer cents
     * @param trialPriceInCents Value for Long
     */
    @JsonSetter("trial_price_in_cents")
    public void setTrialPriceInCents(Long trialPriceInCents) {
        this.trialPriceInCents = trialPriceInCents;
    }

    /**
     * Getter for TrialInterval.
     * The numerical trial interval. i.e. an interval of ‘30’ coupled with a trial_interval_unit of
     * day would mean this product trial would last 30 days.
     * @return Returns the Integer
     */
    @JsonGetter("trial_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTrialInterval() {
        return trialInterval;
    }

    /**
     * Setter for TrialInterval.
     * The numerical trial interval. i.e. an interval of ‘30’ coupled with a trial_interval_unit of
     * day would mean this product trial would last 30 days.
     * @param trialInterval Value for Integer
     */
    @JsonSetter("trial_interval")
    public void setTrialInterval(Integer trialInterval) {
        this.trialInterval = trialInterval;
    }

    /**
     * Getter for TrialIntervalUnit.
     * A string representing the trial interval unit for this product, either month or day
     * @return Returns the IntervalUnit
     */
    @JsonGetter("trial_interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IntervalUnit getTrialIntervalUnit() {
        return trialIntervalUnit;
    }

    /**
     * Setter for TrialIntervalUnit.
     * A string representing the trial interval unit for this product, either month or day
     * @param trialIntervalUnit Value for IntervalUnit
     */
    @JsonSetter("trial_interval_unit")
    public void setTrialIntervalUnit(IntervalUnit trialIntervalUnit) {
        this.trialIntervalUnit = trialIntervalUnit;
    }

    /**
     * Getter for TrialType.
     * @return Returns the String
     */
    @JsonGetter("trial_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTrialType() {
        return trialType;
    }

    /**
     * Setter for TrialType.
     * @param trialType Value for String
     */
    @JsonSetter("trial_type")
    public void setTrialType(String trialType) {
        this.trialType = trialType;
    }

    /**
     * Getter for ExpirationInterval.
     * The numerical expiration interval. i.e. an expiration_interval of ‘30’ coupled with an
     * expiration_interval_unit of day would mean this product would expire after 30 days.
     * @return Returns the Integer
     */
    @JsonGetter("expiration_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getExpirationInterval() {
        return expirationInterval;
    }

    /**
     * Setter for ExpirationInterval.
     * The numerical expiration interval. i.e. an expiration_interval of ‘30’ coupled with an
     * expiration_interval_unit of day would mean this product would expire after 30 days.
     * @param expirationInterval Value for Integer
     */
    @JsonSetter("expiration_interval")
    public void setExpirationInterval(Integer expirationInterval) {
        this.expirationInterval = expirationInterval;
    }

    /**
     * Getter for ExpirationIntervalUnit.
     * A string representing the expiration interval unit for this product, either month or day
     * @return Returns the IntervalUnit
     */
    @JsonGetter("expiration_interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IntervalUnit getExpirationIntervalUnit() {
        return expirationIntervalUnit;
    }

    /**
     * Setter for ExpirationIntervalUnit.
     * A string representing the expiration interval unit for this product, either month or day
     * @param expirationIntervalUnit Value for IntervalUnit
     */
    @JsonSetter("expiration_interval_unit")
    public void setExpirationIntervalUnit(IntervalUnit expirationIntervalUnit) {
        this.expirationIntervalUnit = expirationIntervalUnit;
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
     * A string representing the tax code related to the product type. This is especially important
     * when using the Avalara service to tax based on locale. This attribute has a max length of 10
     * characters.
     * @return Returns the String
     */
    @JsonGetter("tax_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * Setter for TaxCode.
     * A string representing the tax code related to the product type. This is especially important
     * when using the Avalara service to tax based on locale. This attribute has a max length of 10
     * characters.
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
                + ", requireCreditCard=" + requireCreditCard + ", trialPriceInCents="
                + trialPriceInCents + ", trialInterval=" + trialInterval + ", trialIntervalUnit="
                + trialIntervalUnit + ", trialType=" + trialType + ", expirationInterval="
                + expirationInterval + ", expirationIntervalUnit=" + expirationIntervalUnit
                + ", autoCreateSignupPage=" + autoCreateSignupPage + ", taxCode=" + taxCode + "]";
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
                .trialPriceInCents(getTrialPriceInCents())
                .trialInterval(getTrialInterval())
                .trialIntervalUnit(getTrialIntervalUnit())
                .trialType(getTrialType())
                .expirationInterval(getExpirationInterval())
                .expirationIntervalUnit(getExpirationIntervalUnit())
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
        private long priceInCents;
        private int interval;
        private IntervalUnit intervalUnit;
        private String handle;
        private String accountingCode;
        private Boolean requireCreditCard;
        private Long trialPriceInCents;
        private Integer trialInterval;
        private IntervalUnit trialIntervalUnit;
        private String trialType;
        private Integer expirationInterval;
        private IntervalUnit expirationIntervalUnit;
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
         * @param  priceInCents  long value for priceInCents.
         * @param  interval  int value for interval.
         * @param  intervalUnit  IntervalUnit value for intervalUnit.
         */
        public Builder(String name, String description, long priceInCents, int interval,
                IntervalUnit intervalUnit) {
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
         * @param  priceInCents  long value for priceInCents.
         * @return Builder
         */
        public Builder priceInCents(long priceInCents) {
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
         * @param  intervalUnit  IntervalUnit value for intervalUnit.
         * @return Builder
         */
        public Builder intervalUnit(IntervalUnit intervalUnit) {
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
         * Setter for trialPriceInCents.
         * @param  trialPriceInCents  Long value for trialPriceInCents.
         * @return Builder
         */
        public Builder trialPriceInCents(Long trialPriceInCents) {
            this.trialPriceInCents = trialPriceInCents;
            return this;
        }

        /**
         * Setter for trialInterval.
         * @param  trialInterval  Integer value for trialInterval.
         * @return Builder
         */
        public Builder trialInterval(Integer trialInterval) {
            this.trialInterval = trialInterval;
            return this;
        }

        /**
         * Setter for trialIntervalUnit.
         * @param  trialIntervalUnit  IntervalUnit value for trialIntervalUnit.
         * @return Builder
         */
        public Builder trialIntervalUnit(IntervalUnit trialIntervalUnit) {
            this.trialIntervalUnit = trialIntervalUnit;
            return this;
        }

        /**
         * Setter for trialType.
         * @param  trialType  String value for trialType.
         * @return Builder
         */
        public Builder trialType(String trialType) {
            this.trialType = trialType;
            return this;
        }

        /**
         * Setter for expirationInterval.
         * @param  expirationInterval  Integer value for expirationInterval.
         * @return Builder
         */
        public Builder expirationInterval(Integer expirationInterval) {
            this.expirationInterval = expirationInterval;
            return this;
        }

        /**
         * Setter for expirationIntervalUnit.
         * @param  expirationIntervalUnit  IntervalUnit value for expirationIntervalUnit.
         * @return Builder
         */
        public Builder expirationIntervalUnit(IntervalUnit expirationIntervalUnit) {
            this.expirationIntervalUnit = expirationIntervalUnit;
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
                    intervalUnit, handle, accountingCode, requireCreditCard, trialPriceInCents,
                    trialInterval, trialIntervalUnit, trialType, expirationInterval,
                    expirationIntervalUnit, autoCreateSignupPage, taxCode);
        }
    }
}
