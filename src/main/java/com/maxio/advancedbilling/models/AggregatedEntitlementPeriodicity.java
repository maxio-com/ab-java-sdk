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
 * This is a model class for AggregatedEntitlementPeriodicity type.
 */
public class AggregatedEntitlementPeriodicity
        extends BaseModel {
    private Integer interval;
    private EntitlementPeriodicityUnit unit;

    /**
     * Default constructor.
     */
    public AggregatedEntitlementPeriodicity() {
    }

    /**
     * Initialization constructor.
     * @param  interval  Integer value for interval.
     * @param  unit  EntitlementPeriodicityUnit value for unit.
     */
    public AggregatedEntitlementPeriodicity(
            Integer interval,
            EntitlementPeriodicityUnit unit) {
        this.interval = interval;
        this.unit = unit;
    }

    /**
     * Getter for Interval.
     * @return Returns the Integer
     */
    @JsonGetter("interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getInterval() {
        return interval;
    }

    /**
     * Setter for Interval.
     * @param interval Value for Integer
     */
    @JsonSetter("interval")
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * Getter for Unit.
     * The recurring window over which a `usage_limit` feature's allowance resets.
     * @return Returns the EntitlementPeriodicityUnit
     */
    @JsonGetter("unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public EntitlementPeriodicityUnit getUnit() {
        return unit;
    }

    /**
     * Setter for Unit.
     * The recurring window over which a `usage_limit` feature's allowance resets.
     * @param unit Value for EntitlementPeriodicityUnit
     */
    @JsonSetter("unit")
    public void setUnit(EntitlementPeriodicityUnit unit) {
        this.unit = unit;
    }

    /**
     * Converts this AggregatedEntitlementPeriodicity into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AggregatedEntitlementPeriodicity [" + "interval=" + interval + ", unit=" + unit
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link AggregatedEntitlementPeriodicity.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AggregatedEntitlementPeriodicity.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .interval(getInterval())
                .unit(getUnit());
        return builder;
    }

    /**
     * Class to build instances of {@link AggregatedEntitlementPeriodicity}.
     */
    public static class Builder {
        private Integer interval;
        private EntitlementPeriodicityUnit unit;



        /**
         * Setter for interval.
         * @param  interval  Integer value for interval.
         * @return Builder
         */
        public Builder interval(Integer interval) {
            this.interval = interval;
            return this;
        }

        /**
         * Setter for unit.
         * @param  unit  EntitlementPeriodicityUnit value for unit.
         * @return Builder
         */
        public Builder unit(EntitlementPeriodicityUnit unit) {
            this.unit = unit;
            return this;
        }

        /**
         * Builds a new {@link AggregatedEntitlementPeriodicity} object using the set fields.
         * @return {@link AggregatedEntitlementPeriodicity}
         */
        public AggregatedEntitlementPeriodicity build() {
            return new AggregatedEntitlementPeriodicity(interval, unit);
        }
    }
}
