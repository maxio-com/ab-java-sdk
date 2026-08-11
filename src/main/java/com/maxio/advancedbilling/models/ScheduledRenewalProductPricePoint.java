/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.models.containers.ScheduledRenewalProductPricePointInterval;
import com.maxio.advancedbilling.models.containers.ScheduledRenewalProductPricePointPriceInCents;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for ScheduledRenewalProductPricePoint type.
 */
public class ScheduledRenewalProductPricePoint
        extends BaseModel {
    private String name;
    private String handle;
    private ScheduledRenewalProductPricePointPriceInCents priceInCents;
    private ScheduledRenewalProductPricePointInterval interval;
    private IntervalUnit intervalUnit;
    private Boolean taxIncluded;
    private Long initialChargeInCents;
    private Integer expirationInterval;
    private OptionalNullable<ExpirationIntervalUnit> expirationIntervalUnit;

    /**
     * Default constructor.
     */
    public ScheduledRenewalProductPricePoint() {
    }

    /**
     * Initialization constructor.
     * @param  priceInCents  ScheduledRenewalProductPricePointPriceInCents value for priceInCents.
     * @param  interval  ScheduledRenewalProductPricePointInterval value for interval.
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     * @param  taxIncluded  Boolean value for taxIncluded.
     * @param  initialChargeInCents  Long value for initialChargeInCents.
     * @param  expirationInterval  Integer value for expirationInterval.
     * @param  expirationIntervalUnit  ExpirationIntervalUnit value for expirationIntervalUnit.
     */
    public ScheduledRenewalProductPricePoint(
            ScheduledRenewalProductPricePointPriceInCents priceInCents,
            ScheduledRenewalProductPricePointInterval interval,
            IntervalUnit intervalUnit,
            String name,
            String handle,
            Boolean taxIncluded,
            Long initialChargeInCents,
            Integer expirationInterval,
            ExpirationIntervalUnit expirationIntervalUnit) {
        this.name = name;
        this.handle = handle;
        this.priceInCents = priceInCents;
        this.interval = interval;
        this.intervalUnit = intervalUnit;
        this.taxIncluded = taxIncluded;
        this.initialChargeInCents = initialChargeInCents;
        this.expirationInterval = expirationInterval;
        this.expirationIntervalUnit = OptionalNullable.of(expirationIntervalUnit);
    }

    /**
     * Initialization constructor.
     * @param  priceInCents  ScheduledRenewalProductPricePointPriceInCents value for priceInCents.
     * @param  interval  ScheduledRenewalProductPricePointInterval value for interval.
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     * @param  taxIncluded  Boolean value for taxIncluded.
     * @param  initialChargeInCents  Long value for initialChargeInCents.
     * @param  expirationInterval  Integer value for expirationInterval.
     * @param  expirationIntervalUnit  ExpirationIntervalUnit value for expirationIntervalUnit.
     */

    protected ScheduledRenewalProductPricePoint(
            ScheduledRenewalProductPricePointPriceInCents priceInCents,
            ScheduledRenewalProductPricePointInterval interval, IntervalUnit intervalUnit,
            String name, String handle, Boolean taxIncluded, Long initialChargeInCents,
            Integer expirationInterval,
            OptionalNullable<ExpirationIntervalUnit> expirationIntervalUnit) {
        this.name = name;
        this.handle = handle;
        this.priceInCents = priceInCents;
        this.interval = interval;
        this.intervalUnit = intervalUnit;
        this.taxIncluded = taxIncluded;
        this.initialChargeInCents = initialChargeInCents;
        this.expirationInterval = expirationInterval;
        this.expirationIntervalUnit = expirationIntervalUnit;
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
     * @return Returns the ScheduledRenewalProductPricePointPriceInCents
     */
    @JsonGetter("price_in_cents")
    public ScheduledRenewalProductPricePointPriceInCents getPriceInCents() {
        return priceInCents;
    }

    /**
     * Setter for PriceInCents.
     * Required if using `custom_price` attribute.
     * @param priceInCents Value for ScheduledRenewalProductPricePointPriceInCents
     */
    @JsonSetter("price_in_cents")
    public void setPriceInCents(ScheduledRenewalProductPricePointPriceInCents priceInCents) {
        this.priceInCents = priceInCents;
    }

    /**
     * Getter for Interval.
     * Required if using `custom_price` attribute.
     * @return Returns the ScheduledRenewalProductPricePointInterval
     */
    @JsonGetter("interval")
    public ScheduledRenewalProductPricePointInterval getInterval() {
        return interval;
    }

    /**
     * Setter for Interval.
     * Required if using `custom_price` attribute.
     * @param interval Value for ScheduledRenewalProductPricePointInterval
     */
    @JsonSetter("interval")
    public void setInterval(ScheduledRenewalProductPricePointInterval interval) {
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
     * Getter for InitialChargeInCents.
     * The product price point initial charge, in integer cents.
     * @return Returns the Long
     */
    @JsonGetter("initial_charge_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getInitialChargeInCents() {
        return initialChargeInCents;
    }

    /**
     * Setter for InitialChargeInCents.
     * The product price point initial charge, in integer cents.
     * @param initialChargeInCents Value for Long
     */
    @JsonSetter("initial_charge_in_cents")
    public void setInitialChargeInCents(Long initialChargeInCents) {
        this.initialChargeInCents = initialChargeInCents;
    }

    /**
     * Getter for ExpirationInterval.
     * The numerical expiration interval. e.g., an expiration_interval of ‘30’ coupled with an
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
     * The numerical expiration interval. e.g., an expiration_interval of ‘30’ coupled with an
     * expiration_interval_unit of day would mean this product price point would expire after 30
     * days.
     * @param expirationInterval Value for Integer
     */
    @JsonSetter("expiration_interval")
    public void setExpirationInterval(Integer expirationInterval) {
        this.expirationInterval = expirationInterval;
    }

    /**
     * Internal Getter for ExpirationIntervalUnit.
     * A string representing the expiration interval unit for this product price point, either
     * month, day or never
     * @return Returns the Internal ExpirationIntervalUnit
     */
    @JsonGetter("expiration_interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<ExpirationIntervalUnit> internalGetExpirationIntervalUnit() {
        return this.expirationIntervalUnit;
    }

    /**
     * Getter for ExpirationIntervalUnit.
     * A string representing the expiration interval unit for this product price point, either
     * month, day or never
     * @return Returns the ExpirationIntervalUnit
     */
    public ExpirationIntervalUnit getExpirationIntervalUnit() {
        return OptionalNullable.getFrom(expirationIntervalUnit);
    }

    /**
     * Setter for ExpirationIntervalUnit.
     * A string representing the expiration interval unit for this product price point, either
     * month, day or never
     * @param expirationIntervalUnit Value for ExpirationIntervalUnit
     */
    @JsonSetter("expiration_interval_unit")
    public void setExpirationIntervalUnit(ExpirationIntervalUnit expirationIntervalUnit) {
        this.expirationIntervalUnit = OptionalNullable.of(expirationIntervalUnit);
    }

    /**
     * UnSetter for ExpirationIntervalUnit.
     * A string representing the expiration interval unit for this product price point, either
     * month, day or never
     */
    public void unsetExpirationIntervalUnit() {
        expirationIntervalUnit = null;
    }

    /**
     * Converts this ScheduledRenewalProductPricePoint into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ScheduledRenewalProductPricePoint [" + "priceInCents=" + priceInCents
                + ", interval=" + interval + ", intervalUnit=" + intervalUnit + ", name=" + name
                + ", handle=" + handle + ", taxIncluded=" + taxIncluded + ", initialChargeInCents="
                + initialChargeInCents + ", expirationInterval=" + expirationInterval
                + ", expirationIntervalUnit=" + expirationIntervalUnit + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ScheduledRenewalProductPricePoint.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ScheduledRenewalProductPricePoint.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(priceInCents, interval, intervalUnit)
                .name(getName())
                .handle(getHandle())
                .taxIncluded(getTaxIncluded())
                .initialChargeInCents(getInitialChargeInCents())
                .expirationInterval(getExpirationInterval());
        builder.expirationIntervalUnit = internalGetExpirationIntervalUnit();
        return builder;
    }

    /**
     * Class to build instances of {@link ScheduledRenewalProductPricePoint}.
     */
    public static class Builder {
        private ScheduledRenewalProductPricePointPriceInCents priceInCents;
        private ScheduledRenewalProductPricePointInterval interval;
        private IntervalUnit intervalUnit;
        private String name;
        private String handle;
        private Boolean taxIncluded;
        private Long initialChargeInCents;
        private Integer expirationInterval;
        private OptionalNullable<ExpirationIntervalUnit> expirationIntervalUnit;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  priceInCents  ScheduledRenewalProductPricePointPriceInCents value for
         *         priceInCents.
         * @param  interval  ScheduledRenewalProductPricePointInterval value for interval.
         * @param  intervalUnit  IntervalUnit value for intervalUnit.
         */
        public Builder(ScheduledRenewalProductPricePointPriceInCents priceInCents,
                ScheduledRenewalProductPricePointInterval interval, IntervalUnit intervalUnit) {
            this.priceInCents = priceInCents;
            this.interval = interval;
            this.intervalUnit = intervalUnit;
        }

        /**
         * Setter for priceInCents.
         * @param  priceInCents  ScheduledRenewalProductPricePointPriceInCents value for
         *         priceInCents.
         * @return Builder
         */
        public Builder priceInCents(ScheduledRenewalProductPricePointPriceInCents priceInCents) {
            this.priceInCents = priceInCents;
            return this;
        }

        /**
         * Setter for interval.
         * @param  interval  ScheduledRenewalProductPricePointInterval value for interval.
         * @return Builder
         */
        public Builder interval(ScheduledRenewalProductPricePointInterval interval) {
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
         * Setter for taxIncluded.
         * @param  taxIncluded  Boolean value for taxIncluded.
         * @return Builder
         */
        public Builder taxIncluded(Boolean taxIncluded) {
            this.taxIncluded = taxIncluded;
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
         * @param  expirationIntervalUnit  ExpirationIntervalUnit value for expirationIntervalUnit.
         * @return Builder
         */
        public Builder expirationIntervalUnit(ExpirationIntervalUnit expirationIntervalUnit) {
            this.expirationIntervalUnit = OptionalNullable.of(expirationIntervalUnit);
            return this;
        }

        /**
         * UnSetter for expirationIntervalUnit.
         * @return Builder
         */
        public Builder unsetExpirationIntervalUnit() {
            expirationIntervalUnit = null;
            return this;
        }

        /**
         * Builds a new {@link ScheduledRenewalProductPricePoint} object using the set fields.
         * @return {@link ScheduledRenewalProductPricePoint}
         */
        public ScheduledRenewalProductPricePoint build() {
            return new ScheduledRenewalProductPricePoint(priceInCents, interval, intervalUnit, name,
                    handle, taxIncluded, initialChargeInCents, expirationInterval,
                    expirationIntervalUnit);
        }
    }
}
