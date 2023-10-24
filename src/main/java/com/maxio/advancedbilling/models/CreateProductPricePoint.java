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
 * This is a model class for CreateProductPricePoint type.
 */
public class CreateProductPricePoint {
    private String name;
    private String handle;
    private int priceInCents;
    private int interval;
    private String intervalUnit;
    private Integer trialPriceInCents;
    private Integer trialInterval;
    private String trialIntervalUnit;
    private String trialType;
    private Integer initialChargeInCents;
    private Boolean initialChargeAfterTrial;
    private Integer expirationInterval;
    private String expirationIntervalUnit;
    private Boolean useSiteExchangeRate;

    /**
     * Default constructor.
     */
    public CreateProductPricePoint() {
        useSiteExchangeRate = true;
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  priceInCents  int value for priceInCents.
     * @param  interval  int value for interval.
     * @param  intervalUnit  String value for intervalUnit.
     * @param  handle  String value for handle.
     * @param  trialPriceInCents  Integer value for trialPriceInCents.
     * @param  trialInterval  Integer value for trialInterval.
     * @param  trialIntervalUnit  String value for trialIntervalUnit.
     * @param  trialType  String value for trialType.
     * @param  initialChargeInCents  Integer value for initialChargeInCents.
     * @param  initialChargeAfterTrial  Boolean value for initialChargeAfterTrial.
     * @param  expirationInterval  Integer value for expirationInterval.
     * @param  expirationIntervalUnit  String value for expirationIntervalUnit.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     */
    public CreateProductPricePoint(
            String name,
            int priceInCents,
            int interval,
            String intervalUnit,
            String handle,
            Integer trialPriceInCents,
            Integer trialInterval,
            String trialIntervalUnit,
            String trialType,
            Integer initialChargeInCents,
            Boolean initialChargeAfterTrial,
            Integer expirationInterval,
            String expirationIntervalUnit,
            Boolean useSiteExchangeRate) {
        this.name = name;
        this.handle = handle;
        this.priceInCents = priceInCents;
        this.interval = interval;
        this.intervalUnit = intervalUnit;
        this.trialPriceInCents = trialPriceInCents;
        this.trialInterval = trialInterval;
        this.trialIntervalUnit = trialIntervalUnit;
        this.trialType = trialType;
        this.initialChargeInCents = initialChargeInCents;
        this.initialChargeAfterTrial = initialChargeAfterTrial;
        this.expirationInterval = expirationInterval;
        this.expirationIntervalUnit = expirationIntervalUnit;
        this.useSiteExchangeRate = useSiteExchangeRate;
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
     * Getter for TrialPriceInCents.
     * @return Returns the Integer
     */
    @JsonGetter("trial_price_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTrialPriceInCents() {
        return trialPriceInCents;
    }

    /**
     * Setter for TrialPriceInCents.
     * @param trialPriceInCents Value for Integer
     */
    @JsonSetter("trial_price_in_cents")
    public void setTrialPriceInCents(Integer trialPriceInCents) {
        this.trialPriceInCents = trialPriceInCents;
    }

    /**
     * Getter for TrialInterval.
     * @return Returns the Integer
     */
    @JsonGetter("trial_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTrialInterval() {
        return trialInterval;
    }

    /**
     * Setter for TrialInterval.
     * @param trialInterval Value for Integer
     */
    @JsonSetter("trial_interval")
    public void setTrialInterval(Integer trialInterval) {
        this.trialInterval = trialInterval;
    }

    /**
     * Getter for TrialIntervalUnit.
     * @return Returns the String
     */
    @JsonGetter("trial_interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTrialIntervalUnit() {
        return trialIntervalUnit;
    }

    /**
     * Setter for TrialIntervalUnit.
     * @param trialIntervalUnit Value for String
     */
    @JsonSetter("trial_interval_unit")
    public void setTrialIntervalUnit(String trialIntervalUnit) {
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
     * Getter for InitialChargeInCents.
     * @return Returns the Integer
     */
    @JsonGetter("initial_charge_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getInitialChargeInCents() {
        return initialChargeInCents;
    }

    /**
     * Setter for InitialChargeInCents.
     * @param initialChargeInCents Value for Integer
     */
    @JsonSetter("initial_charge_in_cents")
    public void setInitialChargeInCents(Integer initialChargeInCents) {
        this.initialChargeInCents = initialChargeInCents;
    }

    /**
     * Getter for InitialChargeAfterTrial.
     * @return Returns the Boolean
     */
    @JsonGetter("initial_charge_after_trial")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getInitialChargeAfterTrial() {
        return initialChargeAfterTrial;
    }

    /**
     * Setter for InitialChargeAfterTrial.
     * @param initialChargeAfterTrial Value for Boolean
     */
    @JsonSetter("initial_charge_after_trial")
    public void setInitialChargeAfterTrial(Boolean initialChargeAfterTrial) {
        this.initialChargeAfterTrial = initialChargeAfterTrial;
    }

    /**
     * Getter for ExpirationInterval.
     * @return Returns the Integer
     */
    @JsonGetter("expiration_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getExpirationInterval() {
        return expirationInterval;
    }

    /**
     * Setter for ExpirationInterval.
     * @param expirationInterval Value for Integer
     */
    @JsonSetter("expiration_interval")
    public void setExpirationInterval(Integer expirationInterval) {
        this.expirationInterval = expirationInterval;
    }

    /**
     * Getter for ExpirationIntervalUnit.
     * @return Returns the String
     */
    @JsonGetter("expiration_interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpirationIntervalUnit() {
        return expirationIntervalUnit;
    }

    /**
     * Setter for ExpirationIntervalUnit.
     * @param expirationIntervalUnit Value for String
     */
    @JsonSetter("expiration_interval_unit")
    public void setExpirationIntervalUnit(String expirationIntervalUnit) {
        this.expirationIntervalUnit = expirationIntervalUnit;
    }

    /**
     * Getter for UseSiteExchangeRate.
     * Whether or not to use the site's exchange rate or define your own pricing when your site has
     * multiple currencies defined.
     * @return Returns the Boolean
     */
    @JsonGetter("use_site_exchange_rate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getUseSiteExchangeRate() {
        return useSiteExchangeRate;
    }

    /**
     * Setter for UseSiteExchangeRate.
     * Whether or not to use the site's exchange rate or define your own pricing when your site has
     * multiple currencies defined.
     * @param useSiteExchangeRate Value for Boolean
     */
    @JsonSetter("use_site_exchange_rate")
    public void setUseSiteExchangeRate(Boolean useSiteExchangeRate) {
        this.useSiteExchangeRate = useSiteExchangeRate;
    }

    /**
     * Converts this CreateProductPricePoint into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateProductPricePoint [" + "name=" + name + ", priceInCents=" + priceInCents
                + ", interval=" + interval + ", intervalUnit=" + intervalUnit + ", handle=" + handle
                + ", trialPriceInCents=" + trialPriceInCents + ", trialInterval=" + trialInterval
                + ", trialIntervalUnit=" + trialIntervalUnit + ", trialType=" + trialType
                + ", initialChargeInCents=" + initialChargeInCents + ", initialChargeAfterTrial="
                + initialChargeAfterTrial + ", expirationInterval=" + expirationInterval
                + ", expirationIntervalUnit=" + expirationIntervalUnit + ", useSiteExchangeRate="
                + useSiteExchangeRate + "]";
    }

    /**
     * Builds a new {@link CreateProductPricePoint.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateProductPricePoint.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, priceInCents, interval, intervalUnit)
                .handle(getHandle())
                .trialPriceInCents(getTrialPriceInCents())
                .trialInterval(getTrialInterval())
                .trialIntervalUnit(getTrialIntervalUnit())
                .trialType(getTrialType())
                .initialChargeInCents(getInitialChargeInCents())
                .initialChargeAfterTrial(getInitialChargeAfterTrial())
                .expirationInterval(getExpirationInterval())
                .expirationIntervalUnit(getExpirationIntervalUnit())
                .useSiteExchangeRate(getUseSiteExchangeRate());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateProductPricePoint}.
     */
    public static class Builder {
        private String name;
        private int priceInCents;
        private int interval;
        private String intervalUnit;
        private String handle;
        private Integer trialPriceInCents;
        private Integer trialInterval;
        private String trialIntervalUnit;
        private String trialType;
        private Integer initialChargeInCents;
        private Boolean initialChargeAfterTrial;
        private Integer expirationInterval;
        private String expirationIntervalUnit;
        private Boolean useSiteExchangeRate = true;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  priceInCents  int value for priceInCents.
         * @param  interval  int value for interval.
         * @param  intervalUnit  String value for intervalUnit.
         */
        public Builder(String name, int priceInCents, int interval, String intervalUnit) {
            this.name = name;
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
         * Setter for trialPriceInCents.
         * @param  trialPriceInCents  Integer value for trialPriceInCents.
         * @return Builder
         */
        public Builder trialPriceInCents(Integer trialPriceInCents) {
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
         * @param  trialIntervalUnit  String value for trialIntervalUnit.
         * @return Builder
         */
        public Builder trialIntervalUnit(String trialIntervalUnit) {
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
         * Setter for initialChargeInCents.
         * @param  initialChargeInCents  Integer value for initialChargeInCents.
         * @return Builder
         */
        public Builder initialChargeInCents(Integer initialChargeInCents) {
            this.initialChargeInCents = initialChargeInCents;
            return this;
        }

        /**
         * Setter for initialChargeAfterTrial.
         * @param  initialChargeAfterTrial  Boolean value for initialChargeAfterTrial.
         * @return Builder
         */
        public Builder initialChargeAfterTrial(Boolean initialChargeAfterTrial) {
            this.initialChargeAfterTrial = initialChargeAfterTrial;
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
         * @param  expirationIntervalUnit  String value for expirationIntervalUnit.
         * @return Builder
         */
        public Builder expirationIntervalUnit(String expirationIntervalUnit) {
            this.expirationIntervalUnit = expirationIntervalUnit;
            return this;
        }

        /**
         * Setter for useSiteExchangeRate.
         * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
         * @return Builder
         */
        public Builder useSiteExchangeRate(Boolean useSiteExchangeRate) {
            this.useSiteExchangeRate = useSiteExchangeRate;
            return this;
        }

        /**
         * Builds a new {@link CreateProductPricePoint} object using the set fields.
         * @return {@link CreateProductPricePoint}
         */
        public CreateProductPricePoint build() {
            return new CreateProductPricePoint(name, priceInCents, interval, intervalUnit, handle,
                    trialPriceInCents, trialInterval, trialIntervalUnit, trialType,
                    initialChargeInCents, initialChargeAfterTrial, expirationInterval,
                    expirationIntervalUnit, useSiteExchangeRate);
        }
    }
}
