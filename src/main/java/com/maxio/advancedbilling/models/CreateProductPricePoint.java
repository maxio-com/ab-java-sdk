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
    private long priceInCents;
    private int interval;
    private IntervalUnit intervalUnit;
    private Long trialPriceInCents;
    private Integer trialInterval;
    private IntervalUnit trialIntervalUnit;
    private String trialType;
    private Long initialChargeInCents;
    private Boolean initialChargeAfterTrial;
    private Integer expirationInterval;
    private IntervalUnit expirationIntervalUnit;
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
     * @param  priceInCents  long value for priceInCents.
     * @param  interval  int value for interval.
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     * @param  handle  String value for handle.
     * @param  trialPriceInCents  Long value for trialPriceInCents.
     * @param  trialInterval  Integer value for trialInterval.
     * @param  trialIntervalUnit  IntervalUnit value for trialIntervalUnit.
     * @param  trialType  String value for trialType.
     * @param  initialChargeInCents  Long value for initialChargeInCents.
     * @param  initialChargeAfterTrial  Boolean value for initialChargeAfterTrial.
     * @param  expirationInterval  Integer value for expirationInterval.
     * @param  expirationIntervalUnit  IntervalUnit value for expirationIntervalUnit.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     */
    public CreateProductPricePoint(
            String name,
            long priceInCents,
            int interval,
            IntervalUnit intervalUnit,
            String handle,
            Long trialPriceInCents,
            Integer trialInterval,
            IntervalUnit trialIntervalUnit,
            String trialType,
            Long initialChargeInCents,
            Boolean initialChargeAfterTrial,
            Integer expirationInterval,
            IntervalUnit expirationIntervalUnit,
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
     * The product price point name
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The product price point name
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Handle.
     * The product price point API handle
     * @return Returns the String
     */
    @JsonGetter("handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHandle() {
        return handle;
    }

    /**
     * Setter for Handle.
     * The product price point API handle
     * @param handle Value for String
     */
    @JsonSetter("handle")
    public void setHandle(String handle) {
        this.handle = handle;
    }

    /**
     * Getter for PriceInCents.
     * The product price point price, in integer cents
     * @return Returns the long
     */
    @JsonGetter("price_in_cents")
    public long getPriceInCents() {
        return priceInCents;
    }

    /**
     * Setter for PriceInCents.
     * The product price point price, in integer cents
     * @param priceInCents Value for long
     */
    @JsonSetter("price_in_cents")
    public void setPriceInCents(long priceInCents) {
        this.priceInCents = priceInCents;
    }

    /**
     * Getter for Interval.
     * The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would
     * mean this product price point would renew every 30 days
     * @return Returns the int
     */
    @JsonGetter("interval")
    public int getInterval() {
        return interval;
    }

    /**
     * Setter for Interval.
     * The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would
     * mean this product price point would renew every 30 days
     * @param interval Value for int
     */
    @JsonSetter("interval")
    public void setInterval(int interval) {
        this.interval = interval;
    }

    /**
     * Getter for IntervalUnit.
     * A string representing the interval unit for this product price point, either month or day
     * @return Returns the IntervalUnit
     */
    @JsonGetter("interval_unit")
    public IntervalUnit getIntervalUnit() {
        return intervalUnit;
    }

    /**
     * Setter for IntervalUnit.
     * A string representing the interval unit for this product price point, either month or day
     * @param intervalUnit Value for IntervalUnit
     */
    @JsonSetter("interval_unit")
    public void setIntervalUnit(IntervalUnit intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    /**
     * Getter for TrialPriceInCents.
     * The product price point trial price, in integer cents
     * @return Returns the Long
     */
    @JsonGetter("trial_price_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getTrialPriceInCents() {
        return trialPriceInCents;
    }

    /**
     * Setter for TrialPriceInCents.
     * The product price point trial price, in integer cents
     * @param trialPriceInCents Value for Long
     */
    @JsonSetter("trial_price_in_cents")
    public void setTrialPriceInCents(Long trialPriceInCents) {
        this.trialPriceInCents = trialPriceInCents;
    }

    /**
     * Getter for TrialInterval.
     * The numerical trial interval. i.e. an interval of ‘30’ coupled with a trial_interval_unit of
     * day would mean this product price point trial would last 30 days.
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
     * day would mean this product price point trial would last 30 days.
     * @param trialInterval Value for Integer
     */
    @JsonSetter("trial_interval")
    public void setTrialInterval(Integer trialInterval) {
        this.trialInterval = trialInterval;
    }

    /**
     * Getter for TrialIntervalUnit.
     * A string representing the trial interval unit for this product price point, either month or
     * day
     * @return Returns the IntervalUnit
     */
    @JsonGetter("trial_interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IntervalUnit getTrialIntervalUnit() {
        return trialIntervalUnit;
    }

    /**
     * Setter for TrialIntervalUnit.
     * A string representing the trial interval unit for this product price point, either month or
     * day
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
     * Getter for InitialChargeInCents.
     * The product price point initial charge, in integer cents
     * @return Returns the Long
     */
    @JsonGetter("initial_charge_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getInitialChargeInCents() {
        return initialChargeInCents;
    }

    /**
     * Setter for InitialChargeInCents.
     * The product price point initial charge, in integer cents
     * @param initialChargeInCents Value for Long
     */
    @JsonSetter("initial_charge_in_cents")
    public void setInitialChargeInCents(Long initialChargeInCents) {
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
     * The numerical expiration interval. i.e. an expiration_interval of ‘30’ coupled with an
     * expiration_interval_unit of day would mean this product price point would expire after 30
     * days.
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
     * expiration_interval_unit of day would mean this product price point would expire after 30
     * days.
     * @param expirationInterval Value for Integer
     */
    @JsonSetter("expiration_interval")
    public void setExpirationInterval(Integer expirationInterval) {
        this.expirationInterval = expirationInterval;
    }

    /**
     * Getter for ExpirationIntervalUnit.
     * A string representing the expiration interval unit for this product price point, either month
     * or day
     * @return Returns the IntervalUnit
     */
    @JsonGetter("expiration_interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IntervalUnit getExpirationIntervalUnit() {
        return expirationIntervalUnit;
    }

    /**
     * Setter for ExpirationIntervalUnit.
     * A string representing the expiration interval unit for this product price point, either month
     * or day
     * @param expirationIntervalUnit Value for IntervalUnit
     */
    @JsonSetter("expiration_interval_unit")
    public void setExpirationIntervalUnit(IntervalUnit expirationIntervalUnit) {
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
        private long priceInCents;
        private int interval;
        private IntervalUnit intervalUnit;
        private String handle;
        private Long trialPriceInCents;
        private Integer trialInterval;
        private IntervalUnit trialIntervalUnit;
        private String trialType;
        private Long initialChargeInCents;
        private Boolean initialChargeAfterTrial;
        private Integer expirationInterval;
        private IntervalUnit expirationIntervalUnit;
        private Boolean useSiteExchangeRate = true;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  priceInCents  long value for priceInCents.
         * @param  interval  int value for interval.
         * @param  intervalUnit  IntervalUnit value for intervalUnit.
         */
        public Builder(String name, long priceInCents, int interval, IntervalUnit intervalUnit) {
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
         * Setter for initialChargeInCents.
         * @param  initialChargeInCents  Long value for initialChargeInCents.
         * @return Builder
         */
        public Builder initialChargeInCents(Long initialChargeInCents) {
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
         * @param  expirationIntervalUnit  IntervalUnit value for expirationIntervalUnit.
         * @return Builder
         */
        public Builder expirationIntervalUnit(IntervalUnit expirationIntervalUnit) {
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
