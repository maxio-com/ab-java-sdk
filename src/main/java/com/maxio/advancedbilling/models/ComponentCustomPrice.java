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
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for ComponentCustomPrice type.
 */
public class ComponentCustomPrice
        extends BaseModel {
    private Boolean taxIncluded;
    private PricingScheme pricingScheme;
    private Integer interval;
    private OptionalNullable<IntervalUnit> intervalUnit;
    private List<Price> prices;
    private Boolean renewPrepaidAllocation;
    private Boolean rolloverPrepaidRemainder;
    private OptionalNullable<Integer> expirationInterval;
    private OptionalNullable<ExpirationIntervalUnit> expirationIntervalUnit;

    /**
     * Default constructor.
     */
    public ComponentCustomPrice() {
    }

    /**
     * Initialization constructor.
     * @param  prices  List of Price value for prices.
     * @param  taxIncluded  Boolean value for taxIncluded.
     * @param  pricingScheme  PricingScheme value for pricingScheme.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     * @param  renewPrepaidAllocation  Boolean value for renewPrepaidAllocation.
     * @param  rolloverPrepaidRemainder  Boolean value for rolloverPrepaidRemainder.
     * @param  expirationInterval  Integer value for expirationInterval.
     * @param  expirationIntervalUnit  ExpirationIntervalUnit value for expirationIntervalUnit.
     */
    public ComponentCustomPrice(
            List<Price> prices,
            Boolean taxIncluded,
            PricingScheme pricingScheme,
            Integer interval,
            IntervalUnit intervalUnit,
            Boolean renewPrepaidAllocation,
            Boolean rolloverPrepaidRemainder,
            Integer expirationInterval,
            ExpirationIntervalUnit expirationIntervalUnit) {
        this.taxIncluded = taxIncluded;
        this.pricingScheme = pricingScheme;
        this.interval = interval;
        this.intervalUnit = OptionalNullable.of(intervalUnit);
        this.prices = prices;
        this.renewPrepaidAllocation = renewPrepaidAllocation;
        this.rolloverPrepaidRemainder = rolloverPrepaidRemainder;
        this.expirationInterval = OptionalNullable.of(expirationInterval);
        this.expirationIntervalUnit = OptionalNullable.of(expirationIntervalUnit);
    }

    /**
     * Initialization constructor.
     * @param  prices  List of Price value for prices.
     * @param  taxIncluded  Boolean value for taxIncluded.
     * @param  pricingScheme  PricingScheme value for pricingScheme.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     * @param  renewPrepaidAllocation  Boolean value for renewPrepaidAllocation.
     * @param  rolloverPrepaidRemainder  Boolean value for rolloverPrepaidRemainder.
     * @param  expirationInterval  Integer value for expirationInterval.
     * @param  expirationIntervalUnit  ExpirationIntervalUnit value for expirationIntervalUnit.
     */

    protected ComponentCustomPrice(List<Price> prices, Boolean taxIncluded,
            PricingScheme pricingScheme, Integer interval,
            OptionalNullable<IntervalUnit> intervalUnit, Boolean renewPrepaidAllocation,
            Boolean rolloverPrepaidRemainder, OptionalNullable<Integer> expirationInterval,
            OptionalNullable<ExpirationIntervalUnit> expirationIntervalUnit) {
        this.taxIncluded = taxIncluded;
        this.pricingScheme = pricingScheme;
        this.interval = interval;
        this.intervalUnit = intervalUnit;
        this.prices = prices;
        this.renewPrepaidAllocation = renewPrepaidAllocation;
        this.rolloverPrepaidRemainder = rolloverPrepaidRemainder;
        this.expirationInterval = expirationInterval;
        this.expirationIntervalUnit = expirationIntervalUnit;
    }

    /**
     * Getter for TaxIncluded.
     * Whether or not the price point includes tax
     * @return Returns the Boolean
     */
    @JsonGetter("tax_included")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTaxIncluded() {
        return taxIncluded;
    }

    /**
     * Setter for TaxIncluded.
     * Whether or not the price point includes tax
     * @param taxIncluded Value for Boolean
     */
    @JsonSetter("tax_included")
    public void setTaxIncluded(Boolean taxIncluded) {
        this.taxIncluded = taxIncluded;
    }

    /**
     * Getter for PricingScheme.
     * Omit for On/Off components
     * @return Returns the PricingScheme
     */
    @JsonGetter("pricing_scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PricingScheme getPricingScheme() {
        return pricingScheme;
    }

    /**
     * Setter for PricingScheme.
     * Omit for On/Off components
     * @param pricingScheme Value for PricingScheme
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(PricingScheme pricingScheme) {
        this.pricingScheme = pricingScheme;
    }

    /**
     * Getter for Interval.
     * The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would
     * mean this component price point would renew every 30 days. This property is only available
     * for sites with Multifrequency enabled.
     * @return Returns the Integer
     */
    @JsonGetter("interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getInterval() {
        return interval;
    }

    /**
     * Setter for Interval.
     * The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would
     * mean this component price point would renew every 30 days. This property is only available
     * for sites with Multifrequency enabled.
     * @param interval Value for Integer
     */
    @JsonSetter("interval")
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * Internal Getter for IntervalUnit.
     * A string representing the interval unit for this component price point, either month or day.
     * This property is only available for sites with Multifrequency enabled.
     * @return Returns the Internal IntervalUnit
     */
    @JsonGetter("interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<IntervalUnit> internalGetIntervalUnit() {
        return this.intervalUnit;
    }

    /**
     * Getter for IntervalUnit.
     * A string representing the interval unit for this component price point, either month or day.
     * This property is only available for sites with Multifrequency enabled.
     * @return Returns the IntervalUnit
     */
    public IntervalUnit getIntervalUnit() {
        return OptionalNullable.getFrom(intervalUnit);
    }

    /**
     * Setter for IntervalUnit.
     * A string representing the interval unit for this component price point, either month or day.
     * This property is only available for sites with Multifrequency enabled.
     * @param intervalUnit Value for IntervalUnit
     */
    @JsonSetter("interval_unit")
    public void setIntervalUnit(IntervalUnit intervalUnit) {
        this.intervalUnit = OptionalNullable.of(intervalUnit);
    }

    /**
     * UnSetter for IntervalUnit.
     * A string representing the interval unit for this component price point, either month or day.
     * This property is only available for sites with Multifrequency enabled.
     */
    public void unsetIntervalUnit() {
        intervalUnit = null;
    }

    /**
     * Getter for Prices.
     * On/off components only need one price bracket starting at 1
     * @return Returns the List of Price
     */
    @JsonGetter("prices")
    public List<Price> getPrices() {
        return prices;
    }

    /**
     * Setter for Prices.
     * On/off components only need one price bracket starting at 1
     * @param prices Value for List of Price
     */
    @JsonSetter("prices")
    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    /**
     * Getter for RenewPrepaidAllocation.
     * Applicable only to prepaid usage components. Controls whether the allocated quantity renews
     * each period.
     * @return Returns the Boolean
     */
    @JsonGetter("renew_prepaid_allocation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRenewPrepaidAllocation() {
        return renewPrepaidAllocation;
    }

    /**
     * Setter for RenewPrepaidAllocation.
     * Applicable only to prepaid usage components. Controls whether the allocated quantity renews
     * each period.
     * @param renewPrepaidAllocation Value for Boolean
     */
    @JsonSetter("renew_prepaid_allocation")
    public void setRenewPrepaidAllocation(Boolean renewPrepaidAllocation) {
        this.renewPrepaidAllocation = renewPrepaidAllocation;
    }

    /**
     * Getter for RolloverPrepaidRemainder.
     * Applicable only to prepaid usage components. Controls whether remaining units roll over to
     * the next period.
     * @return Returns the Boolean
     */
    @JsonGetter("rollover_prepaid_remainder")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRolloverPrepaidRemainder() {
        return rolloverPrepaidRemainder;
    }

    /**
     * Setter for RolloverPrepaidRemainder.
     * Applicable only to prepaid usage components. Controls whether remaining units roll over to
     * the next period.
     * @param rolloverPrepaidRemainder Value for Boolean
     */
    @JsonSetter("rollover_prepaid_remainder")
    public void setRolloverPrepaidRemainder(Boolean rolloverPrepaidRemainder) {
        this.rolloverPrepaidRemainder = rolloverPrepaidRemainder;
    }

    /**
     * Internal Getter for ExpirationInterval.
     * Applicable only when rollover is enabled. Number of `expiration_interval_unit`s after which
     * rollover amounts expire.
     * @return Returns the Internal Integer
     */
    @JsonGetter("expiration_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetExpirationInterval() {
        return this.expirationInterval;
    }

    /**
     * Getter for ExpirationInterval.
     * Applicable only when rollover is enabled. Number of `expiration_interval_unit`s after which
     * rollover amounts expire.
     * @return Returns the Integer
     */
    public Integer getExpirationInterval() {
        return OptionalNullable.getFrom(expirationInterval);
    }

    /**
     * Setter for ExpirationInterval.
     * Applicable only when rollover is enabled. Number of `expiration_interval_unit`s after which
     * rollover amounts expire.
     * @param expirationInterval Value for Integer
     */
    @JsonSetter("expiration_interval")
    public void setExpirationInterval(Integer expirationInterval) {
        this.expirationInterval = OptionalNullable.of(expirationInterval);
    }

    /**
     * UnSetter for ExpirationInterval.
     * Applicable only when rollover is enabled. Number of `expiration_interval_unit`s after which
     * rollover amounts expire.
     */
    public void unsetExpirationInterval() {
        expirationInterval = null;
    }

    /**
     * Internal Getter for ExpirationIntervalUnit.
     * Applicable only when rollover is enabled. Interval unit for rollover expiration (month or
     * day).
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
     * Applicable only when rollover is enabled. Interval unit for rollover expiration (month or
     * day).
     * @return Returns the ExpirationIntervalUnit
     */
    public ExpirationIntervalUnit getExpirationIntervalUnit() {
        return OptionalNullable.getFrom(expirationIntervalUnit);
    }

    /**
     * Setter for ExpirationIntervalUnit.
     * Applicable only when rollover is enabled. Interval unit for rollover expiration (month or
     * day).
     * @param expirationIntervalUnit Value for ExpirationIntervalUnit
     */
    @JsonSetter("expiration_interval_unit")
    public void setExpirationIntervalUnit(ExpirationIntervalUnit expirationIntervalUnit) {
        this.expirationIntervalUnit = OptionalNullable.of(expirationIntervalUnit);
    }

    /**
     * UnSetter for ExpirationIntervalUnit.
     * Applicable only when rollover is enabled. Interval unit for rollover expiration (month or
     * day).
     */
    public void unsetExpirationIntervalUnit() {
        expirationIntervalUnit = null;
    }

    /**
     * Converts this ComponentCustomPrice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ComponentCustomPrice [" + "prices=" + prices + ", taxIncluded=" + taxIncluded
                + ", pricingScheme=" + pricingScheme + ", interval=" + interval + ", intervalUnit="
                + intervalUnit + ", renewPrepaidAllocation=" + renewPrepaidAllocation
                + ", rolloverPrepaidRemainder=" + rolloverPrepaidRemainder + ", expirationInterval="
                + expirationInterval + ", expirationIntervalUnit=" + expirationIntervalUnit
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ComponentCustomPrice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ComponentCustomPrice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(prices)
                .taxIncluded(getTaxIncluded())
                .pricingScheme(getPricingScheme())
                .interval(getInterval())
                .renewPrepaidAllocation(getRenewPrepaidAllocation())
                .rolloverPrepaidRemainder(getRolloverPrepaidRemainder());
        builder.intervalUnit = internalGetIntervalUnit();
        builder.expirationInterval = internalGetExpirationInterval();
        builder.expirationIntervalUnit = internalGetExpirationIntervalUnit();
        return builder;
    }

    /**
     * Class to build instances of {@link ComponentCustomPrice}.
     */
    public static class Builder {
        private List<Price> prices;
        private Boolean taxIncluded;
        private PricingScheme pricingScheme;
        private Integer interval;
        private OptionalNullable<IntervalUnit> intervalUnit;
        private Boolean renewPrepaidAllocation;
        private Boolean rolloverPrepaidRemainder;
        private OptionalNullable<Integer> expirationInterval;
        private OptionalNullable<ExpirationIntervalUnit> expirationIntervalUnit;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  prices  List of Price value for prices.
         */
        public Builder(List<Price> prices) {
            this.prices = prices;
        }

        /**
         * Setter for prices.
         * @param  prices  List of Price value for prices.
         * @return Builder
         */
        public Builder prices(List<Price> prices) {
            this.prices = prices;
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
         * Setter for pricingScheme.
         * @param  pricingScheme  PricingScheme value for pricingScheme.
         * @return Builder
         */
        public Builder pricingScheme(PricingScheme pricingScheme) {
            this.pricingScheme = pricingScheme;
            return this;
        }

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
         * Setter for intervalUnit.
         * @param  intervalUnit  IntervalUnit value for intervalUnit.
         * @return Builder
         */
        public Builder intervalUnit(IntervalUnit intervalUnit) {
            this.intervalUnit = OptionalNullable.of(intervalUnit);
            return this;
        }

        /**
         * UnSetter for intervalUnit.
         * @return Builder
         */
        public Builder unsetIntervalUnit() {
            intervalUnit = null;
            return this;
        }

        /**
         * Setter for renewPrepaidAllocation.
         * @param  renewPrepaidAllocation  Boolean value for renewPrepaidAllocation.
         * @return Builder
         */
        public Builder renewPrepaidAllocation(Boolean renewPrepaidAllocation) {
            this.renewPrepaidAllocation = renewPrepaidAllocation;
            return this;
        }

        /**
         * Setter for rolloverPrepaidRemainder.
         * @param  rolloverPrepaidRemainder  Boolean value for rolloverPrepaidRemainder.
         * @return Builder
         */
        public Builder rolloverPrepaidRemainder(Boolean rolloverPrepaidRemainder) {
            this.rolloverPrepaidRemainder = rolloverPrepaidRemainder;
            return this;
        }

        /**
         * Setter for expirationInterval.
         * @param  expirationInterval  Integer value for expirationInterval.
         * @return Builder
         */
        public Builder expirationInterval(Integer expirationInterval) {
            this.expirationInterval = OptionalNullable.of(expirationInterval);
            return this;
        }

        /**
         * UnSetter for expirationInterval.
         * @return Builder
         */
        public Builder unsetExpirationInterval() {
            expirationInterval = null;
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
         * Builds a new {@link ComponentCustomPrice} object using the set fields.
         * @return {@link ComponentCustomPrice}
         */
        public ComponentCustomPrice build() {
            return new ComponentCustomPrice(prices, taxIncluded, pricingScheme, interval,
                    intervalUnit, renewPrepaidAllocation, rolloverPrepaidRemainder,
                    expirationInterval, expirationIntervalUnit);
        }
    }
}
