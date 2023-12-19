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
 * This is a model class for UpdateComponentPricePoint type.
 */
public class UpdateComponentPricePoint {
    private String name;
    private Integer interval;
    private IntervalUnit intervalUnit;
    private List<UpdatePrice> prices;

    /**
     * Default constructor.
     */
    public UpdateComponentPricePoint() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     * @param  prices  List of UpdatePrice value for prices.
     */
    public UpdateComponentPricePoint(
            String name,
            Integer interval,
            IntervalUnit intervalUnit,
            List<UpdatePrice> prices) {
        this.name = name;
        this.interval = interval;
        this.intervalUnit = intervalUnit;
        this.prices = prices;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * @return Returns the List of UpdatePrice
     */
    @JsonGetter("prices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<UpdatePrice> getPrices() {
        return prices;
    }

    /**
     * Setter for Prices.
     * @param prices Value for List of UpdatePrice
     */
    @JsonSetter("prices")
    public void setPrices(List<UpdatePrice> prices) {
        this.prices = prices;
    }

    /**
     * Converts this UpdateComponentPricePoint into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateComponentPricePoint [" + "name=" + name + ", interval=" + interval
                + ", intervalUnit=" + intervalUnit + ", prices=" + prices + "]";
    }

    /**
     * Builds a new {@link UpdateComponentPricePoint.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateComponentPricePoint.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .interval(getInterval())
                .intervalUnit(getIntervalUnit())
                .prices(getPrices());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateComponentPricePoint}.
     */
    public static class Builder {
        private String name;
        private Integer interval;
        private IntervalUnit intervalUnit;
        private List<UpdatePrice> prices;



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
         * @param  prices  List of UpdatePrice value for prices.
         * @return Builder
         */
        public Builder prices(List<UpdatePrice> prices) {
            this.prices = prices;
            return this;
        }

        /**
         * Builds a new {@link UpdateComponentPricePoint} object using the set fields.
         * @return {@link UpdateComponentPricePoint}
         */
        public UpdateComponentPricePoint build() {
            return new UpdateComponentPricePoint(name, interval, intervalUnit, prices);
        }
    }
}
