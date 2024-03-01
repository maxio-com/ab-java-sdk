/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.SubscriptionCustomPriceExpirationInterval;
import com.maxio.advancedbilling.models.containers.SubscriptionCustomPriceInitialChargeInCents;
import com.maxio.advancedbilling.models.containers.SubscriptionCustomPriceInterval;
import com.maxio.advancedbilling.models.containers.SubscriptionCustomPricePriceInCents;
import com.maxio.advancedbilling.models.containers.SubscriptionCustomPriceTrialInterval;
import com.maxio.advancedbilling.models.containers.SubscriptionCustomPriceTrialPriceInCents;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for SubscriptionCustomPrice type.
 */
public class SubscriptionCustomPrice
        extends BaseModel {
    private String name;
    private String handle;
    private SubscriptionCustomPricePriceInCents priceInCents;
    private SubscriptionCustomPriceInterval interval;
    private IntervalUnit intervalUnit;
    private SubscriptionCustomPriceTrialPriceInCents trialPriceInCents;
    private SubscriptionCustomPriceTrialInterval trialInterval;
    private IntervalUnit trialIntervalUnit;
    private SubscriptionCustomPriceInitialChargeInCents initialChargeInCents;
    private Boolean initialChargeAfterTrial;
    private SubscriptionCustomPriceExpirationInterval expirationInterval;
    private IntervalUnit expirationIntervalUnit;
    private Boolean taxIncluded;

    /**
     * Default constructor.
     */
    public SubscriptionCustomPrice() {
    }

    /**
     * Initialization constructor.
     * @param  priceInCents  SubscriptionCustomPricePriceInCents value for priceInCents.
     * @param  interval  SubscriptionCustomPriceInterval value for interval.
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     * @param  trialPriceInCents  SubscriptionCustomPriceTrialPriceInCents value for
     *         trialPriceInCents.
     * @param  trialInterval  SubscriptionCustomPriceTrialInterval value for trialInterval.
     * @param  trialIntervalUnit  IntervalUnit value for trialIntervalUnit.
     * @param  initialChargeInCents  SubscriptionCustomPriceInitialChargeInCents value for
     *         initialChargeInCents.
     * @param  initialChargeAfterTrial  Boolean value for initialChargeAfterTrial.
     * @param  expirationInterval  SubscriptionCustomPriceExpirationInterval value for
     *         expirationInterval.
     * @param  expirationIntervalUnit  IntervalUnit value for expirationIntervalUnit.
     * @param  taxIncluded  Boolean value for taxIncluded.
     */
    public SubscriptionCustomPrice(
            SubscriptionCustomPricePriceInCents priceInCents,
            SubscriptionCustomPriceInterval interval,
            IntervalUnit intervalUnit,
            String name,
            String handle,
            SubscriptionCustomPriceTrialPriceInCents trialPriceInCents,
            SubscriptionCustomPriceTrialInterval trialInterval,
            IntervalUnit trialIntervalUnit,
            SubscriptionCustomPriceInitialChargeInCents initialChargeInCents,
            Boolean initialChargeAfterTrial,
            SubscriptionCustomPriceExpirationInterval expirationInterval,
            IntervalUnit expirationIntervalUnit,
            Boolean taxIncluded) {
        this.name = name;
        this.handle = handle;
        this.priceInCents = priceInCents;
        this.interval = interval;
        this.intervalUnit = intervalUnit;
        this.trialPriceInCents = trialPriceInCents;
        this.trialInterval = trialInterval;
        this.trialIntervalUnit = trialIntervalUnit;
        this.initialChargeInCents = initialChargeInCents;
        this.initialChargeAfterTrial = initialChargeAfterTrial;
        this.expirationInterval = expirationInterval;
        this.expirationIntervalUnit = expirationIntervalUnit;
        this.taxIncluded = taxIncluded;
    }

    /**
     * Getter for Name.
     * (Optional)
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * (Optional)
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Handle.
     * (Optional)
     * @return Returns the String
     */
    @JsonGetter("handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHandle() {
        return handle;
    }

    /**
     * Setter for Handle.
     * (Optional)
     * @param handle Value for String
     */
    @JsonSetter("handle")
    public void setHandle(String handle) {
        this.handle = handle;
    }

    /**
     * Getter for PriceInCents.
     * Required if using `custom_price` attribute.
     * @return Returns the SubscriptionCustomPricePriceInCents
     */
    @JsonGetter("price_in_cents")
    public SubscriptionCustomPricePriceInCents getPriceInCents() {
        return priceInCents;
    }

    /**
     * Setter for PriceInCents.
     * Required if using `custom_price` attribute.
     * @param priceInCents Value for SubscriptionCustomPricePriceInCents
     */
    @JsonSetter("price_in_cents")
    public void setPriceInCents(SubscriptionCustomPricePriceInCents priceInCents) {
        this.priceInCents = priceInCents;
    }

    /**
     * Getter for Interval.
     * Required if using `custom_price` attribute.
     * @return Returns the SubscriptionCustomPriceInterval
     */
    @JsonGetter("interval")
    public SubscriptionCustomPriceInterval getInterval() {
        return interval;
    }

    /**
     * Setter for Interval.
     * Required if using `custom_price` attribute.
     * @param interval Value for SubscriptionCustomPriceInterval
     */
    @JsonSetter("interval")
    public void setInterval(SubscriptionCustomPriceInterval interval) {
        this.interval = interval;
    }

    /**
     * Getter for IntervalUnit.
     * Required if using `custom_price` attribute.
     * @return Returns the IntervalUnit
     */
    @JsonGetter("interval_unit")
    public IntervalUnit getIntervalUnit() {
        return intervalUnit;
    }

    /**
     * Setter for IntervalUnit.
     * Required if using `custom_price` attribute.
     * @param intervalUnit Value for IntervalUnit
     */
    @JsonSetter("interval_unit")
    public void setIntervalUnit(IntervalUnit intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    /**
     * Getter for TrialPriceInCents.
     * (Optional)
     * @return Returns the SubscriptionCustomPriceTrialPriceInCents
     */
    @JsonGetter("trial_price_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionCustomPriceTrialPriceInCents getTrialPriceInCents() {
        return trialPriceInCents;
    }

    /**
     * Setter for TrialPriceInCents.
     * (Optional)
     * @param trialPriceInCents Value for SubscriptionCustomPriceTrialPriceInCents
     */
    @JsonSetter("trial_price_in_cents")
    public void setTrialPriceInCents(SubscriptionCustomPriceTrialPriceInCents trialPriceInCents) {
        this.trialPriceInCents = trialPriceInCents;
    }

    /**
     * Getter for TrialInterval.
     * (Optional)
     * @return Returns the SubscriptionCustomPriceTrialInterval
     */
    @JsonGetter("trial_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionCustomPriceTrialInterval getTrialInterval() {
        return trialInterval;
    }

    /**
     * Setter for TrialInterval.
     * (Optional)
     * @param trialInterval Value for SubscriptionCustomPriceTrialInterval
     */
    @JsonSetter("trial_interval")
    public void setTrialInterval(SubscriptionCustomPriceTrialInterval trialInterval) {
        this.trialInterval = trialInterval;
    }

    /**
     * Getter for TrialIntervalUnit.
     * (Optional)
     * @return Returns the IntervalUnit
     */
    @JsonGetter("trial_interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IntervalUnit getTrialIntervalUnit() {
        return trialIntervalUnit;
    }

    /**
     * Setter for TrialIntervalUnit.
     * (Optional)
     * @param trialIntervalUnit Value for IntervalUnit
     */
    @JsonSetter("trial_interval_unit")
    public void setTrialIntervalUnit(IntervalUnit trialIntervalUnit) {
        this.trialIntervalUnit = trialIntervalUnit;
    }

    /**
     * Getter for InitialChargeInCents.
     * (Optional)
     * @return Returns the SubscriptionCustomPriceInitialChargeInCents
     */
    @JsonGetter("initial_charge_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionCustomPriceInitialChargeInCents getInitialChargeInCents() {
        return initialChargeInCents;
    }

    /**
     * Setter for InitialChargeInCents.
     * (Optional)
     * @param initialChargeInCents Value for SubscriptionCustomPriceInitialChargeInCents
     */
    @JsonSetter("initial_charge_in_cents")
    public void setInitialChargeInCents(SubscriptionCustomPriceInitialChargeInCents initialChargeInCents) {
        this.initialChargeInCents = initialChargeInCents;
    }

    /**
     * Getter for InitialChargeAfterTrial.
     * (Optional)
     * @return Returns the Boolean
     */
    @JsonGetter("initial_charge_after_trial")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getInitialChargeAfterTrial() {
        return initialChargeAfterTrial;
    }

    /**
     * Setter for InitialChargeAfterTrial.
     * (Optional)
     * @param initialChargeAfterTrial Value for Boolean
     */
    @JsonSetter("initial_charge_after_trial")
    public void setInitialChargeAfterTrial(Boolean initialChargeAfterTrial) {
        this.initialChargeAfterTrial = initialChargeAfterTrial;
    }

    /**
     * Getter for ExpirationInterval.
     * (Optional)
     * @return Returns the SubscriptionCustomPriceExpirationInterval
     */
    @JsonGetter("expiration_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionCustomPriceExpirationInterval getExpirationInterval() {
        return expirationInterval;
    }

    /**
     * Setter for ExpirationInterval.
     * (Optional)
     * @param expirationInterval Value for SubscriptionCustomPriceExpirationInterval
     */
    @JsonSetter("expiration_interval")
    public void setExpirationInterval(SubscriptionCustomPriceExpirationInterval expirationInterval) {
        this.expirationInterval = expirationInterval;
    }

    /**
     * Getter for ExpirationIntervalUnit.
     * (Optional)
     * @return Returns the IntervalUnit
     */
    @JsonGetter("expiration_interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IntervalUnit getExpirationIntervalUnit() {
        return expirationIntervalUnit;
    }

    /**
     * Setter for ExpirationIntervalUnit.
     * (Optional)
     * @param expirationIntervalUnit Value for IntervalUnit
     */
    @JsonSetter("expiration_interval_unit")
    public void setExpirationIntervalUnit(IntervalUnit expirationIntervalUnit) {
        this.expirationIntervalUnit = expirationIntervalUnit;
    }

    /**
     * Getter for TaxIncluded.
     * (Optional)
     * @return Returns the Boolean
     */
    @JsonGetter("tax_included")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTaxIncluded() {
        return taxIncluded;
    }

    /**
     * Setter for TaxIncluded.
     * (Optional)
     * @param taxIncluded Value for Boolean
     */
    @JsonSetter("tax_included")
    public void setTaxIncluded(Boolean taxIncluded) {
        this.taxIncluded = taxIncluded;
    }

    /**
     * Converts this SubscriptionCustomPrice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionCustomPrice [" + "priceInCents=" + priceInCents + ", interval="
                + interval + ", intervalUnit=" + intervalUnit + ", name=" + name + ", handle="
                + handle + ", trialPriceInCents=" + trialPriceInCents + ", trialInterval="
                + trialInterval + ", trialIntervalUnit=" + trialIntervalUnit
                + ", initialChargeInCents=" + initialChargeInCents + ", initialChargeAfterTrial="
                + initialChargeAfterTrial + ", expirationInterval=" + expirationInterval
                + ", expirationIntervalUnit=" + expirationIntervalUnit + ", taxIncluded="
                + taxIncluded + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link SubscriptionCustomPrice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionCustomPrice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(priceInCents, interval, intervalUnit)
                .name(getName())
                .handle(getHandle())
                .trialPriceInCents(getTrialPriceInCents())
                .trialInterval(getTrialInterval())
                .trialIntervalUnit(getTrialIntervalUnit())
                .initialChargeInCents(getInitialChargeInCents())
                .initialChargeAfterTrial(getInitialChargeAfterTrial())
                .expirationInterval(getExpirationInterval())
                .expirationIntervalUnit(getExpirationIntervalUnit())
                .taxIncluded(getTaxIncluded());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionCustomPrice}.
     */
    public static class Builder {
        private SubscriptionCustomPricePriceInCents priceInCents;
        private SubscriptionCustomPriceInterval interval;
        private IntervalUnit intervalUnit;
        private String name;
        private String handle;
        private SubscriptionCustomPriceTrialPriceInCents trialPriceInCents;
        private SubscriptionCustomPriceTrialInterval trialInterval;
        private IntervalUnit trialIntervalUnit;
        private SubscriptionCustomPriceInitialChargeInCents initialChargeInCents;
        private Boolean initialChargeAfterTrial;
        private SubscriptionCustomPriceExpirationInterval expirationInterval;
        private IntervalUnit expirationIntervalUnit;
        private Boolean taxIncluded;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  priceInCents  SubscriptionCustomPricePriceInCents value for priceInCents.
         * @param  interval  SubscriptionCustomPriceInterval value for interval.
         * @param  intervalUnit  IntervalUnit value for intervalUnit.
         */
        public Builder(SubscriptionCustomPricePriceInCents priceInCents,
                SubscriptionCustomPriceInterval interval, IntervalUnit intervalUnit) {
            this.priceInCents = priceInCents;
            this.interval = interval;
            this.intervalUnit = intervalUnit;
        }

        /**
         * Setter for priceInCents.
         * @param  priceInCents  SubscriptionCustomPricePriceInCents value for priceInCents.
         * @return Builder
         */
        public Builder priceInCents(SubscriptionCustomPricePriceInCents priceInCents) {
            this.priceInCents = priceInCents;
            return this;
        }

        /**
         * Setter for interval.
         * @param  interval  SubscriptionCustomPriceInterval value for interval.
         * @return Builder
         */
        public Builder interval(SubscriptionCustomPriceInterval interval) {
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
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
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
         * @param  trialPriceInCents  SubscriptionCustomPriceTrialPriceInCents value for
         *         trialPriceInCents.
         * @return Builder
         */
        public Builder trialPriceInCents(
                SubscriptionCustomPriceTrialPriceInCents trialPriceInCents) {
            this.trialPriceInCents = trialPriceInCents;
            return this;
        }

        /**
         * Setter for trialInterval.
         * @param  trialInterval  SubscriptionCustomPriceTrialInterval value for trialInterval.
         * @return Builder
         */
        public Builder trialInterval(SubscriptionCustomPriceTrialInterval trialInterval) {
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
         * Setter for initialChargeInCents.
         * @param  initialChargeInCents  SubscriptionCustomPriceInitialChargeInCents value for
         *         initialChargeInCents.
         * @return Builder
         */
        public Builder initialChargeInCents(
                SubscriptionCustomPriceInitialChargeInCents initialChargeInCents) {
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
         * @param  expirationInterval  SubscriptionCustomPriceExpirationInterval value for
         *         expirationInterval.
         * @return Builder
         */
        public Builder expirationInterval(
                SubscriptionCustomPriceExpirationInterval expirationInterval) {
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
         * Setter for taxIncluded.
         * @param  taxIncluded  Boolean value for taxIncluded.
         * @return Builder
         */
        public Builder taxIncluded(Boolean taxIncluded) {
            this.taxIncluded = taxIncluded;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionCustomPrice} object using the set fields.
         * @return {@link SubscriptionCustomPrice}
         */
        public SubscriptionCustomPrice build() {
            return new SubscriptionCustomPrice(priceInCents, interval, intervalUnit, name, handle,
                    trialPriceInCents, trialInterval, trialIntervalUnit, initialChargeInCents,
                    initialChargeAfterTrial, expirationInterval, expirationIntervalUnit,
                    taxIncluded);
        }
    }
}
