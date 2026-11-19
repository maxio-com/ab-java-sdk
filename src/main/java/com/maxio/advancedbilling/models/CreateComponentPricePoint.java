/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for CreateComponentPricePoint type.
 */
public class CreateComponentPricePoint
        extends BaseModel {
    private String name;
    private String handle;
    private PricingScheme pricingScheme;
    private List<Price> prices;
    private SecondaryPricing secondaryPricing;
    private PricingScheme secondaryPricingScheme;
    private Boolean useSiteExchangeRate;
    private Boolean taxIncluded;
    private Integer interval;
    private OptionalNullable<IntervalUnit> intervalUnit;

    /**
     * Default constructor.
     */
    public CreateComponentPricePoint() {
        useSiteExchangeRate = true;
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  pricingScheme  PricingScheme value for pricingScheme.
     * @param  prices  List of Price value for prices.
     * @param  handle  String value for handle.
     * @param  secondaryPricing  SecondaryPricing value for secondaryPricing.
     * @param  secondaryPricingScheme  PricingScheme value for secondaryPricingScheme.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  taxIncluded  Boolean value for taxIncluded.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     */
    public CreateComponentPricePoint(
            String name,
            PricingScheme pricingScheme,
            List<Price> prices,
            String handle,
            SecondaryPricing secondaryPricing,
            PricingScheme secondaryPricingScheme,
            Boolean useSiteExchangeRate,
            Boolean taxIncluded,
            Integer interval,
            IntervalUnit intervalUnit) {
        this.name = name;
        this.handle = handle;
        this.pricingScheme = pricingScheme;
        this.prices = prices;
        this.secondaryPricing = secondaryPricing;
        this.secondaryPricingScheme = secondaryPricingScheme;
        this.useSiteExchangeRate = useSiteExchangeRate;
        this.taxIncluded = taxIncluded;
        this.interval = interval;
        this.intervalUnit = OptionalNullable.of(intervalUnit);
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  pricingScheme  PricingScheme value for pricingScheme.
     * @param  prices  List of Price value for prices.
     * @param  handle  String value for handle.
     * @param  secondaryPricing  SecondaryPricing value for secondaryPricing.
     * @param  secondaryPricingScheme  PricingScheme value for secondaryPricingScheme.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  taxIncluded  Boolean value for taxIncluded.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     */

    protected CreateComponentPricePoint(String name, PricingScheme pricingScheme,
            List<Price> prices, String handle, SecondaryPricing secondaryPricing,
            PricingScheme secondaryPricingScheme, Boolean useSiteExchangeRate, Boolean taxIncluded,
            Integer interval, OptionalNullable<IntervalUnit> intervalUnit) {
        this.name = name;
        this.handle = handle;
        this.pricingScheme = pricingScheme;
        this.prices = prices;
        this.secondaryPricing = secondaryPricing;
        this.secondaryPricingScheme = secondaryPricingScheme;
        this.useSiteExchangeRate = useSiteExchangeRate;
        this.taxIncluded = taxIncluded;
        this.interval = interval;
        this.intervalUnit = intervalUnit;
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  pricingScheme  PricingScheme value for pricingScheme.
     * @param  prices  List of Price value for prices.
     */
    @JsonCreator
    protected CreateComponentPricePoint(
            @JsonProperty("name") String name,
            @JsonProperty("pricing_scheme") PricingScheme pricingScheme,
            @JsonProperty("prices") List<Price> prices) {
        this(name, pricingScheme, prices, null, null, null, null, null, null,
                OptionalNullable.of(null));
        unsetIntervalUnit();
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
     * Getter for PricingScheme.
     * The identifier for the pricing scheme. See [Product
     * Components](https://help.chargify.com/products/product-components.html) for an overview of
     * pricing schemes.
     * @return Returns the PricingScheme
     */
    @JsonGetter("pricing_scheme")
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
     * Getter for Prices.
     * @return Returns the List of Price
     */
    @JsonGetter("prices")
    public List<Price> getPrices() {
        return prices;
    }

    /**
     * Setter for Prices.
     * @param prices Value for List of Price
     */
    @JsonSetter("prices")
    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    /**
     * Getter for SecondaryPricing.
     * Hybrid Pricing only. The secondary pricing model that takes over once usage passes the
     * primary model's included threshold. Applies to Quantity-Based and Metered Components on Sites
     * with Hybrid Pricing enabled; ignored otherwise. Its `prices` brackets start at `1`, not at
     * the primary model's highest `ending_quantity`. See [Hybrid
     * Pricing](page:introduction/basic-concepts/hybrid-pricing).
     * @return Returns the SecondaryPricing
     */
    @JsonGetter("secondary_pricing")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SecondaryPricing getSecondaryPricing() {
        return secondaryPricing;
    }

    /**
     * Setter for SecondaryPricing.
     * Hybrid Pricing only. The secondary pricing model that takes over once usage passes the
     * primary model's included threshold. Applies to Quantity-Based and Metered Components on Sites
     * with Hybrid Pricing enabled; ignored otherwise. Its `prices` brackets start at `1`, not at
     * the primary model's highest `ending_quantity`. See [Hybrid
     * Pricing](page:introduction/basic-concepts/hybrid-pricing).
     * @param secondaryPricing Value for SecondaryPricing
     */
    @JsonSetter("secondary_pricing")
    public void setSecondaryPricing(SecondaryPricing secondaryPricing) {
        this.secondaryPricing = secondaryPricing;
    }

    /**
     * Getter for SecondaryPricingScheme.
     * Hybrid Pricing only. Alternative to `secondary_pricing.pricing_scheme`; when both are sent,
     * `secondary_pricing.pricing_scheme` is used. Setting not supported when creating price points
     * in bulk.
     * @return Returns the PricingScheme
     */
    @JsonGetter("secondary_pricing_scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PricingScheme getSecondaryPricingScheme() {
        return secondaryPricingScheme;
    }

    /**
     * Setter for SecondaryPricingScheme.
     * Hybrid Pricing only. Alternative to `secondary_pricing.pricing_scheme`; when both are sent,
     * `secondary_pricing.pricing_scheme` is used. Setting not supported when creating price points
     * in bulk.
     * @param secondaryPricingScheme Value for PricingScheme
     */
    @JsonSetter("secondary_pricing_scheme")
    public void setSecondaryPricingScheme(PricingScheme secondaryPricingScheme) {
        this.secondaryPricingScheme = secondaryPricingScheme;
    }

    /**
     * Getter for UseSiteExchangeRate.
     * Whether to use the site level exchange rate or define your own prices for each currency if
     * you have multiple currencies defined on the site. Setting not supported when creating price
     * points in bulk.
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
     * you have multiple currencies defined on the site. Setting not supported when creating price
     * points in bulk.
     * @param useSiteExchangeRate Value for Boolean
     */
    @JsonSetter("use_site_exchange_rate")
    public void setUseSiteExchangeRate(Boolean useSiteExchangeRate) {
        this.useSiteExchangeRate = useSiteExchangeRate;
    }

    /**
     * Getter for TaxIncluded.
     * Whether or not the price point includes tax. Setting not supported when creating price points
     * in bulk.
     * @return Returns the Boolean
     */
    @JsonGetter("tax_included")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTaxIncluded() {
        return taxIncluded;
    }

    /**
     * Setter for TaxIncluded.
     * Whether or not the price point includes tax. Setting not supported when creating price points
     * in bulk.
     * @param taxIncluded Value for Boolean
     */
    @JsonSetter("tax_included")
    public void setTaxIncluded(Boolean taxIncluded) {
        this.taxIncluded = taxIncluded;
    }

    /**
     * Getter for Interval.
     * The numerical interval. e.g., an interval of ‘30’ coupled with an interval_unit of day would
     * mean this price point would renew every 30 days. This property is only available for sites
     * with Multifrequency enabled.
     * @return Returns the Integer
     */
    @JsonGetter("interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getInterval() {
        return interval;
    }

    /**
     * Setter for Interval.
     * The numerical interval. e.g., an interval of ‘30’ coupled with an interval_unit of day would
     * mean this price point would renew every 30 days. This property is only available for sites
     * with Multifrequency enabled.
     * @param interval Value for Integer
     */
    @JsonSetter("interval")
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * Internal Getter for IntervalUnit.
     * A string representing the interval unit for this price point, either month or day. This
     * property is only available for sites with Multifrequency enabled.
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
     * A string representing the interval unit for this price point, either month or day. This
     * property is only available for sites with Multifrequency enabled.
     * @return Returns the IntervalUnit
     */
    public IntervalUnit getIntervalUnit() {
        return OptionalNullable.getFrom(intervalUnit);
    }

    /**
     * Setter for IntervalUnit.
     * A string representing the interval unit for this price point, either month or day. This
     * property is only available for sites with Multifrequency enabled.
     * @param intervalUnit Value for IntervalUnit
     */
    @JsonSetter("interval_unit")
    public void setIntervalUnit(IntervalUnit intervalUnit) {
        this.intervalUnit = OptionalNullable.of(intervalUnit);
    }

    /**
     * UnSetter for IntervalUnit.
     * A string representing the interval unit for this price point, either month or day. This
     * property is only available for sites with Multifrequency enabled.
     */
    public void unsetIntervalUnit() {
        intervalUnit = null;
    }

    /**
     * Converts this CreateComponentPricePoint into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateComponentPricePoint [" + "name=" + name + ", pricingScheme=" + pricingScheme
                + ", prices=" + prices + ", handle=" + handle + ", secondaryPricing="
                + secondaryPricing + ", secondaryPricingScheme=" + secondaryPricingScheme
                + ", useSiteExchangeRate=" + useSiteExchangeRate + ", taxIncluded=" + taxIncluded
                + ", interval=" + interval + ", intervalUnit=" + intervalUnit
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CreateComponentPricePoint.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateComponentPricePoint.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, pricingScheme, prices)
                .handle(getHandle())
                .secondaryPricing(getSecondaryPricing())
                .secondaryPricingScheme(getSecondaryPricingScheme())
                .useSiteExchangeRate(getUseSiteExchangeRate())
                .taxIncluded(getTaxIncluded())
                .interval(getInterval());
        builder.intervalUnit = internalGetIntervalUnit();
        return builder;
    }

    /**
     * Class to build instances of {@link CreateComponentPricePoint}.
     */
    public static class Builder {
        private String name;
        private PricingScheme pricingScheme;
        private List<Price> prices;
        private String handle;
        private SecondaryPricing secondaryPricing;
        private PricingScheme secondaryPricingScheme;
        private Boolean useSiteExchangeRate = true;
        private Boolean taxIncluded;
        private Integer interval;
        private OptionalNullable<IntervalUnit> intervalUnit;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  pricingScheme  PricingScheme value for pricingScheme.
         * @param  prices  List of Price value for prices.
         */
        public Builder(String name, PricingScheme pricingScheme, List<Price> prices) {
            this.name = name;
            this.pricingScheme = pricingScheme;
            this.prices = prices;
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
         * Setter for pricingScheme.
         * @param  pricingScheme  PricingScheme value for pricingScheme.
         * @return Builder
         */
        public Builder pricingScheme(PricingScheme pricingScheme) {
            this.pricingScheme = pricingScheme;
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
         * Setter for handle.
         * @param  handle  String value for handle.
         * @return Builder
         */
        public Builder handle(String handle) {
            this.handle = handle;
            return this;
        }

        /**
         * Setter for secondaryPricing.
         * @param  secondaryPricing  SecondaryPricing value for secondaryPricing.
         * @return Builder
         */
        public Builder secondaryPricing(SecondaryPricing secondaryPricing) {
            this.secondaryPricing = secondaryPricing;
            return this;
        }

        /**
         * Setter for secondaryPricingScheme.
         * @param  secondaryPricingScheme  PricingScheme value for secondaryPricingScheme.
         * @return Builder
         */
        public Builder secondaryPricingScheme(PricingScheme secondaryPricingScheme) {
            this.secondaryPricingScheme = secondaryPricingScheme;
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
         * Builds a new {@link CreateComponentPricePoint} object using the set fields.
         * @return {@link CreateComponentPricePoint}
         */
        public CreateComponentPricePoint build() {
            return new CreateComponentPricePoint(name, pricingScheme, prices, handle,
                    secondaryPricing, secondaryPricingScheme, useSiteExchangeRate, taxIncluded,
                    interval, intervalUnit);
        }
    }
}
