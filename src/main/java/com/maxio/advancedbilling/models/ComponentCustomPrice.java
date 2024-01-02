/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for ComponentCustomPrice type.
 */
public class ComponentCustomPrice {
    private PricingScheme pricingScheme;
    private Integer interval;
    private IntervalUnit intervalUnit;
    private List<Price> prices;

    /**
     * Default constructor.
     */
    public ComponentCustomPrice() {
    }

    /**
     * Initialization constructor.
     * @param  pricingScheme  PricingScheme value for pricingScheme.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     * @param  prices  List of Price value for prices.
     */
    public ComponentCustomPrice(
            PricingScheme pricingScheme,
            Integer interval,
            IntervalUnit intervalUnit,
            List<Price> prices) {
        this.pricingScheme = pricingScheme;
        this.interval = interval;
        this.intervalUnit = intervalUnit;
        this.prices = prices;
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
     * Getter for IntervalUnit.
     * A string representing the interval unit for this component price point, either month or day.
     * This property is only available for sites with Multifrequency enabled.
     * @return Returns the IntervalUnit
     */
    @JsonGetter("interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IntervalUnit getIntervalUnit() {
        return intervalUnit;
    }

    /**
     * Setter for IntervalUnit.
     * A string representing the interval unit for this component price point, either month or day.
     * This property is only available for sites with Multifrequency enabled.
     * @param intervalUnit Value for IntervalUnit
     */
    @JsonSetter("interval_unit")
    public void setIntervalUnit(IntervalUnit intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    /**
     * Getter for Prices.
     * On/off components only need one price bracket starting at 1
     * @return Returns the List of Price
     */
    @JsonGetter("prices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Converts this ComponentCustomPrice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ComponentCustomPrice [" + "pricingScheme=" + pricingScheme + ", interval="
                + interval + ", intervalUnit=" + intervalUnit + ", prices=" + prices + "]";
    }

    /**
     * Builds a new {@link ComponentCustomPrice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ComponentCustomPrice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .pricingScheme(getPricingScheme())
                .interval(getInterval())
                .intervalUnit(getIntervalUnit())
                .prices(getPrices());
        return builder;
    }

    /**
     * Class to build instances of {@link ComponentCustomPrice}.
     */
    public static class Builder {
        private PricingScheme pricingScheme;
        private Integer interval;
        private IntervalUnit intervalUnit;
        private List<Price> prices;



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
            this.intervalUnit = intervalUnit;
            return this;
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
         * Builds a new {@link ComponentCustomPrice} object using the set fields.
         * @return {@link ComponentCustomPrice}
         */
        public ComponentCustomPrice build() {
            return new ComponentCustomPrice(pricingScheme, interval, intervalUnit, prices);
        }
    }
}
