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
import java.util.List;

/**
 * This is a model class for UpdateComponentPricePoint type.
 */
public class UpdateComponentPricePoint
        extends BaseModel {
    private String name;
    private String handle;
    private PricingScheme pricingScheme;
    private Boolean useSiteExchangeRate;
    private Boolean taxIncluded;
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
     * @param  handle  String value for handle.
     * @param  pricingScheme  PricingScheme value for pricingScheme.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  taxIncluded  Boolean value for taxIncluded.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     * @param  prices  List of UpdatePrice value for prices.
     */
    public UpdateComponentPricePoint(
            String name,
            String handle,
            PricingScheme pricingScheme,
            Boolean useSiteExchangeRate,
            Boolean taxIncluded,
            Integer interval,
            IntervalUnit intervalUnit,
            List<UpdatePrice> prices) {
        this.name = name;
        this.handle = handle;
        this.pricingScheme = pricingScheme;
        this.useSiteExchangeRate = useSiteExchangeRate;
        this.taxIncluded = taxIncluded;
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
     * Getter for PricingScheme.
     * The identifier for the pricing scheme. See [Product
     * Components](https://help.chargify.com/products/product-components.html) for an overview of
     * pricing schemes.
     * @return Returns the PricingScheme
     */
    @JsonGetter("pricing_scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PricingScheme getPricingScheme() {
        return pricingScheme;
    }

    /**
     * Setter for PricingScheme.
     * The identifier for the pricing scheme. See [Product
     * Components](https://help.chargify.com/products/product-components.html) for an overview of
     * pricing schemes.
     * @param pricingScheme Value for PricingScheme
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(PricingScheme pricingScheme) {
        this.pricingScheme = pricingScheme;
    }

    /**
     * Getter for UseSiteExchangeRate.
     * Whether to use the site level exchange rate or define your own prices for each currency if
     * you have multiple currencies defined on the site.
     * @return Returns the Boolean
     */
    @JsonGetter("use_site_exchange_rate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getUseSiteExchangeRate() {
        return useSiteExchangeRate;
    }

    /**
     * Setter for UseSiteExchangeRate.
     * Whether to use the site level exchange rate or define your own prices for each currency if
     * you have multiple currencies defined on the site.
     * @param useSiteExchangeRate Value for Boolean
     */
    @JsonSetter("use_site_exchange_rate")
    public void setUseSiteExchangeRate(Boolean useSiteExchangeRate) {
        this.useSiteExchangeRate = useSiteExchangeRate;
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
        return "UpdateComponentPricePoint [" + "name=" + name + ", handle=" + handle
                + ", pricingScheme=" + pricingScheme + ", useSiteExchangeRate="
                + useSiteExchangeRate + ", taxIncluded=" + taxIncluded + ", interval=" + interval
                + ", intervalUnit=" + intervalUnit + ", prices=" + prices
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .handle(getHandle())
                .pricingScheme(getPricingScheme())
                .useSiteExchangeRate(getUseSiteExchangeRate())
                .taxIncluded(getTaxIncluded())
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
        private String handle;
        private PricingScheme pricingScheme;
        private Boolean useSiteExchangeRate;
        private Boolean taxIncluded;
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
         * Setter for handle.
         * @param  handle  String value for handle.
         * @return Builder
         */
        public Builder handle(String handle) {
            this.handle = handle;
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
         * Setter for useSiteExchangeRate.
         * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
         * @return Builder
         */
        public Builder useSiteExchangeRate(Boolean useSiteExchangeRate) {
            this.useSiteExchangeRate = useSiteExchangeRate;
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
            return new UpdateComponentPricePoint(name, handle, pricingScheme, useSiteExchangeRate,
                    taxIncluded, interval, intervalUnit, prices);
        }
    }
}
