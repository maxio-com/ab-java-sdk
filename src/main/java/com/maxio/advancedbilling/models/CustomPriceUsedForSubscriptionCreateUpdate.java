/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.CustomPriceUsedForSubscriptionCreateUpdateExpirationInterval;
import com.maxio.advancedbilling.models.containers.CustomPriceUsedForSubscriptionCreateUpdateExpirationIntervalUnit;
import com.maxio.advancedbilling.models.containers.CustomPriceUsedForSubscriptionCreateUpdateInitialChargeInCents;
import com.maxio.advancedbilling.models.containers.CustomPriceUsedForSubscriptionCreateUpdateInterval;
import com.maxio.advancedbilling.models.containers.CustomPriceUsedForSubscriptionCreateUpdateIntervalUnit;
import com.maxio.advancedbilling.models.containers.CustomPriceUsedForSubscriptionCreateUpdatePriceInCents;
import com.maxio.advancedbilling.models.containers.CustomPriceUsedForSubscriptionCreateUpdateTrialInterval;
import com.maxio.advancedbilling.models.containers.CustomPriceUsedForSubscriptionCreateUpdateTrialIntervalUnit;
import com.maxio.advancedbilling.models.containers.CustomPriceUsedForSubscriptionCreateUpdateTrialPriceInCents;

/**
 * This is a model class for CustomPriceUsedForSubscriptionCreateUpdate type.
 */
public class CustomPriceUsedForSubscriptionCreateUpdate {
    private String name;
    private String handle;
    private CustomPriceUsedForSubscriptionCreateUpdatePriceInCents priceInCents;
    private CustomPriceUsedForSubscriptionCreateUpdateInterval interval;
    private CustomPriceUsedForSubscriptionCreateUpdateIntervalUnit intervalUnit;
    private CustomPriceUsedForSubscriptionCreateUpdateTrialPriceInCents trialPriceInCents;
    private CustomPriceUsedForSubscriptionCreateUpdateTrialInterval trialInterval;
    private CustomPriceUsedForSubscriptionCreateUpdateTrialIntervalUnit trialIntervalUnit;
    private CustomPriceUsedForSubscriptionCreateUpdateInitialChargeInCents initialChargeInCents;
    private Boolean initialChargeAfterTrial;
    private CustomPriceUsedForSubscriptionCreateUpdateExpirationInterval expirationInterval;
    private CustomPriceUsedForSubscriptionCreateUpdateExpirationIntervalUnit expirationIntervalUnit;
    private Boolean taxIncluded;

    /**
     * Default constructor.
     */
    public CustomPriceUsedForSubscriptionCreateUpdate() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     * @param  priceInCents  CustomPriceUsedForSubscriptionCreateUpdatePriceInCents value for
     *         priceInCents.
     * @param  interval  CustomPriceUsedForSubscriptionCreateUpdateInterval value for interval.
     * @param  intervalUnit  CustomPriceUsedForSubscriptionCreateUpdateIntervalUnit value for
     *         intervalUnit.
     * @param  trialPriceInCents  CustomPriceUsedForSubscriptionCreateUpdateTrialPriceInCents value
     *         for trialPriceInCents.
     * @param  trialInterval  CustomPriceUsedForSubscriptionCreateUpdateTrialInterval value for
     *         trialInterval.
     * @param  trialIntervalUnit  CustomPriceUsedForSubscriptionCreateUpdateTrialIntervalUnit value
     *         for trialIntervalUnit.
     * @param  initialChargeInCents  CustomPriceUsedForSubscriptionCreateUpdateInitialChargeInCents
     *         value for initialChargeInCents.
     * @param  initialChargeAfterTrial  Boolean value for initialChargeAfterTrial.
     * @param  expirationInterval  CustomPriceUsedForSubscriptionCreateUpdateExpirationInterval
     *         value for expirationInterval.
     * @param  expirationIntervalUnit
     *         CustomPriceUsedForSubscriptionCreateUpdateExpirationIntervalUnit value for
     *         expirationIntervalUnit.
     * @param  taxIncluded  Boolean value for taxIncluded.
     */
    public CustomPriceUsedForSubscriptionCreateUpdate(
            String name,
            String handle,
            CustomPriceUsedForSubscriptionCreateUpdatePriceInCents priceInCents,
            CustomPriceUsedForSubscriptionCreateUpdateInterval interval,
            CustomPriceUsedForSubscriptionCreateUpdateIntervalUnit intervalUnit,
            CustomPriceUsedForSubscriptionCreateUpdateTrialPriceInCents trialPriceInCents,
            CustomPriceUsedForSubscriptionCreateUpdateTrialInterval trialInterval,
            CustomPriceUsedForSubscriptionCreateUpdateTrialIntervalUnit trialIntervalUnit,
            CustomPriceUsedForSubscriptionCreateUpdateInitialChargeInCents initialChargeInCents,
            Boolean initialChargeAfterTrial,
            CustomPriceUsedForSubscriptionCreateUpdateExpirationInterval expirationInterval,
            CustomPriceUsedForSubscriptionCreateUpdateExpirationIntervalUnit expirationIntervalUnit,
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
     * @return Returns the CustomPriceUsedForSubscriptionCreateUpdatePriceInCents
     */
    @JsonGetter("price_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomPriceUsedForSubscriptionCreateUpdatePriceInCents getPriceInCents() {
        return priceInCents;
    }

    /**
     * Setter for PriceInCents.
     * Required if using `custom_price` attribute.
     * @param priceInCents Value for CustomPriceUsedForSubscriptionCreateUpdatePriceInCents
     */
    @JsonSetter("price_in_cents")
    public void setPriceInCents(CustomPriceUsedForSubscriptionCreateUpdatePriceInCents priceInCents) {
        this.priceInCents = priceInCents;
    }

    /**
     * Getter for Interval.
     * Required if using `custom_price` attribute.
     * @return Returns the CustomPriceUsedForSubscriptionCreateUpdateInterval
     */
    @JsonGetter("interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomPriceUsedForSubscriptionCreateUpdateInterval getInterval() {
        return interval;
    }

    /**
     * Setter for Interval.
     * Required if using `custom_price` attribute.
     * @param interval Value for CustomPriceUsedForSubscriptionCreateUpdateInterval
     */
    @JsonSetter("interval")
    public void setInterval(CustomPriceUsedForSubscriptionCreateUpdateInterval interval) {
        this.interval = interval;
    }

    /**
     * Getter for IntervalUnit.
     * Required if using `custom_price` attribute.
     * @return Returns the CustomPriceUsedForSubscriptionCreateUpdateIntervalUnit
     */
    @JsonGetter("interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomPriceUsedForSubscriptionCreateUpdateIntervalUnit getIntervalUnit() {
        return intervalUnit;
    }

    /**
     * Setter for IntervalUnit.
     * Required if using `custom_price` attribute.
     * @param intervalUnit Value for CustomPriceUsedForSubscriptionCreateUpdateIntervalUnit
     */
    @JsonSetter("interval_unit")
    public void setIntervalUnit(CustomPriceUsedForSubscriptionCreateUpdateIntervalUnit intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    /**
     * Getter for TrialPriceInCents.
     * (Optional)
     * @return Returns the CustomPriceUsedForSubscriptionCreateUpdateTrialPriceInCents
     */
    @JsonGetter("trial_price_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomPriceUsedForSubscriptionCreateUpdateTrialPriceInCents getTrialPriceInCents() {
        return trialPriceInCents;
    }

    /**
     * Setter for TrialPriceInCents.
     * (Optional)
     * @param trialPriceInCents Value for CustomPriceUsedForSubscriptionCreateUpdateTrialPriceInCents
     */
    @JsonSetter("trial_price_in_cents")
    public void setTrialPriceInCents(CustomPriceUsedForSubscriptionCreateUpdateTrialPriceInCents trialPriceInCents) {
        this.trialPriceInCents = trialPriceInCents;
    }

    /**
     * Getter for TrialInterval.
     * (Optional)
     * @return Returns the CustomPriceUsedForSubscriptionCreateUpdateTrialInterval
     */
    @JsonGetter("trial_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomPriceUsedForSubscriptionCreateUpdateTrialInterval getTrialInterval() {
        return trialInterval;
    }

    /**
     * Setter for TrialInterval.
     * (Optional)
     * @param trialInterval Value for CustomPriceUsedForSubscriptionCreateUpdateTrialInterval
     */
    @JsonSetter("trial_interval")
    public void setTrialInterval(CustomPriceUsedForSubscriptionCreateUpdateTrialInterval trialInterval) {
        this.trialInterval = trialInterval;
    }

    /**
     * Getter for TrialIntervalUnit.
     * (Optional)
     * @return Returns the CustomPriceUsedForSubscriptionCreateUpdateTrialIntervalUnit
     */
    @JsonGetter("trial_interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomPriceUsedForSubscriptionCreateUpdateTrialIntervalUnit getTrialIntervalUnit() {
        return trialIntervalUnit;
    }

    /**
     * Setter for TrialIntervalUnit.
     * (Optional)
     * @param trialIntervalUnit Value for CustomPriceUsedForSubscriptionCreateUpdateTrialIntervalUnit
     */
    @JsonSetter("trial_interval_unit")
    public void setTrialIntervalUnit(CustomPriceUsedForSubscriptionCreateUpdateTrialIntervalUnit trialIntervalUnit) {
        this.trialIntervalUnit = trialIntervalUnit;
    }

    /**
     * Getter for InitialChargeInCents.
     * (Optional)
     * @return Returns the CustomPriceUsedForSubscriptionCreateUpdateInitialChargeInCents
     */
    @JsonGetter("initial_charge_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomPriceUsedForSubscriptionCreateUpdateInitialChargeInCents getInitialChargeInCents() {
        return initialChargeInCents;
    }

    /**
     * Setter for InitialChargeInCents.
     * (Optional)
     * @param initialChargeInCents Value for CustomPriceUsedForSubscriptionCreateUpdateInitialChargeInCents
     */
    @JsonSetter("initial_charge_in_cents")
    public void setInitialChargeInCents(CustomPriceUsedForSubscriptionCreateUpdateInitialChargeInCents initialChargeInCents) {
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
     * @return Returns the CustomPriceUsedForSubscriptionCreateUpdateExpirationInterval
     */
    @JsonGetter("expiration_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomPriceUsedForSubscriptionCreateUpdateExpirationInterval getExpirationInterval() {
        return expirationInterval;
    }

    /**
     * Setter for ExpirationInterval.
     * (Optional)
     * @param expirationInterval Value for CustomPriceUsedForSubscriptionCreateUpdateExpirationInterval
     */
    @JsonSetter("expiration_interval")
    public void setExpirationInterval(CustomPriceUsedForSubscriptionCreateUpdateExpirationInterval expirationInterval) {
        this.expirationInterval = expirationInterval;
    }

    /**
     * Getter for ExpirationIntervalUnit.
     * (Optional)
     * @return Returns the CustomPriceUsedForSubscriptionCreateUpdateExpirationIntervalUnit
     */
    @JsonGetter("expiration_interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomPriceUsedForSubscriptionCreateUpdateExpirationIntervalUnit getExpirationIntervalUnit() {
        return expirationIntervalUnit;
    }

    /**
     * Setter for ExpirationIntervalUnit.
     * (Optional)
     * @param expirationIntervalUnit Value for CustomPriceUsedForSubscriptionCreateUpdateExpirationIntervalUnit
     */
    @JsonSetter("expiration_interval_unit")
    public void setExpirationIntervalUnit(CustomPriceUsedForSubscriptionCreateUpdateExpirationIntervalUnit expirationIntervalUnit) {
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
     * Converts this CustomPriceUsedForSubscriptionCreateUpdate into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomPriceUsedForSubscriptionCreateUpdate [" + "name=" + name + ", handle="
                + handle + ", priceInCents=" + priceInCents + ", interval=" + interval
                + ", intervalUnit=" + intervalUnit + ", trialPriceInCents=" + trialPriceInCents
                + ", trialInterval=" + trialInterval + ", trialIntervalUnit=" + trialIntervalUnit
                + ", initialChargeInCents=" + initialChargeInCents + ", initialChargeAfterTrial="
                + initialChargeAfterTrial + ", expirationInterval=" + expirationInterval
                + ", expirationIntervalUnit=" + expirationIntervalUnit + ", taxIncluded="
                + taxIncluded + "]";
    }

    /**
     * Builds a new {@link CustomPriceUsedForSubscriptionCreateUpdate.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomPriceUsedForSubscriptionCreateUpdate.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .handle(getHandle())
                .priceInCents(getPriceInCents())
                .interval(getInterval())
                .intervalUnit(getIntervalUnit())
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
     * Class to build instances of {@link CustomPriceUsedForSubscriptionCreateUpdate}.
     */
    public static class Builder {
        private String name;
        private String handle;
        private CustomPriceUsedForSubscriptionCreateUpdatePriceInCents priceInCents;
        private CustomPriceUsedForSubscriptionCreateUpdateInterval interval;
        private CustomPriceUsedForSubscriptionCreateUpdateIntervalUnit intervalUnit;
        private CustomPriceUsedForSubscriptionCreateUpdateTrialPriceInCents trialPriceInCents;
        private CustomPriceUsedForSubscriptionCreateUpdateTrialInterval trialInterval;
        private CustomPriceUsedForSubscriptionCreateUpdateTrialIntervalUnit trialIntervalUnit;
        private CustomPriceUsedForSubscriptionCreateUpdateInitialChargeInCents initialChargeInCents;
        private Boolean initialChargeAfterTrial;
        private CustomPriceUsedForSubscriptionCreateUpdateExpirationInterval expirationInterval;
        private CustomPriceUsedForSubscriptionCreateUpdateExpirationIntervalUnit expirationIntervalUnit;
        private Boolean taxIncluded;



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
         * Setter for priceInCents.
         * @param  priceInCents  CustomPriceUsedForSubscriptionCreateUpdatePriceInCents value for
         *         priceInCents.
         * @return Builder
         */
        public Builder priceInCents(
                CustomPriceUsedForSubscriptionCreateUpdatePriceInCents priceInCents) {
            this.priceInCents = priceInCents;
            return this;
        }

        /**
         * Setter for interval.
         * @param  interval  CustomPriceUsedForSubscriptionCreateUpdateInterval value for interval.
         * @return Builder
         */
        public Builder interval(CustomPriceUsedForSubscriptionCreateUpdateInterval interval) {
            this.interval = interval;
            return this;
        }

        /**
         * Setter for intervalUnit.
         * @param  intervalUnit  CustomPriceUsedForSubscriptionCreateUpdateIntervalUnit value for
         *         intervalUnit.
         * @return Builder
         */
        public Builder intervalUnit(
                CustomPriceUsedForSubscriptionCreateUpdateIntervalUnit intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }

        /**
         * Setter for trialPriceInCents.
         * @param  trialPriceInCents  CustomPriceUsedForSubscriptionCreateUpdateTrialPriceInCents
         *         value for trialPriceInCents.
         * @return Builder
         */
        public Builder trialPriceInCents(
                CustomPriceUsedForSubscriptionCreateUpdateTrialPriceInCents trialPriceInCents) {
            this.trialPriceInCents = trialPriceInCents;
            return this;
        }

        /**
         * Setter for trialInterval.
         * @param  trialInterval  CustomPriceUsedForSubscriptionCreateUpdateTrialInterval value for
         *         trialInterval.
         * @return Builder
         */
        public Builder trialInterval(
                CustomPriceUsedForSubscriptionCreateUpdateTrialInterval trialInterval) {
            this.trialInterval = trialInterval;
            return this;
        }

        /**
         * Setter for trialIntervalUnit.
         * @param  trialIntervalUnit  CustomPriceUsedForSubscriptionCreateUpdateTrialIntervalUnit
         *         value for trialIntervalUnit.
         * @return Builder
         */
        public Builder trialIntervalUnit(
                CustomPriceUsedForSubscriptionCreateUpdateTrialIntervalUnit trialIntervalUnit) {
            this.trialIntervalUnit = trialIntervalUnit;
            return this;
        }

        /**
         * Setter for initialChargeInCents.
         * @param  initialChargeInCents
         *         CustomPriceUsedForSubscriptionCreateUpdateInitialChargeInCents value for
         *         initialChargeInCents.
         * @return Builder
         */
        public Builder initialChargeInCents(
                CustomPriceUsedForSubscriptionCreateUpdateInitialChargeInCents initialChargeInCents) {
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
         * @param  expirationInterval  CustomPriceUsedForSubscriptionCreateUpdateExpirationInterval
         *         value for expirationInterval.
         * @return Builder
         */
        public Builder expirationInterval(
                CustomPriceUsedForSubscriptionCreateUpdateExpirationInterval expirationInterval) {
            this.expirationInterval = expirationInterval;
            return this;
        }

        /**
         * Setter for expirationIntervalUnit.
         * @param  expirationIntervalUnit
         *         CustomPriceUsedForSubscriptionCreateUpdateExpirationIntervalUnit value for
         *         expirationIntervalUnit.
         * @return Builder
         */
        public Builder expirationIntervalUnit(
                CustomPriceUsedForSubscriptionCreateUpdateExpirationIntervalUnit expirationIntervalUnit) {
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
         * Builds a new {@link CustomPriceUsedForSubscriptionCreateUpdate} object using the set
         * fields.
         * @return {@link CustomPriceUsedForSubscriptionCreateUpdate}
         */
        public CustomPriceUsedForSubscriptionCreateUpdate build() {
            return new CustomPriceUsedForSubscriptionCreateUpdate(name, handle, priceInCents,
                    interval, intervalUnit, trialPriceInCents, trialInterval, trialIntervalUnit,
                    initialChargeInCents, initialChargeAfterTrial, expirationInterval,
                    expirationIntervalUnit, taxIncluded);
        }
    }
}
