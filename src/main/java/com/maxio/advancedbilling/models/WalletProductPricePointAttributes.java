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
 * This is a model class for WalletProductPricePointAttributes type.
 */
public class WalletProductPricePointAttributes
        extends BaseModel {
    private String name;
    private String handle;
    private PricingScheme pricingScheme;
    private OptionalNullable<String> unitPrice;
    private Boolean taxIncluded;
    private Integer interval;
    private IntervalUnit intervalUnit;
    private Boolean useSiteExchangeRate;
    private List<Price1> prices;

    /**
     * Default constructor.
     */
    public WalletProductPricePointAttributes() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     * @param  pricingScheme  PricingScheme value for pricingScheme.
     * @param  unitPrice  String value for unitPrice.
     * @param  taxIncluded  Boolean value for taxIncluded.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  prices  List of Price1 value for prices.
     */
    public WalletProductPricePointAttributes(
            String name,
            String handle,
            PricingScheme pricingScheme,
            String unitPrice,
            Boolean taxIncluded,
            Integer interval,
            IntervalUnit intervalUnit,
            Boolean useSiteExchangeRate,
            List<Price1> prices) {
        this.name = name;
        this.handle = handle;
        this.pricingScheme = pricingScheme;
        this.unitPrice = OptionalNullable.of(unitPrice);
        this.taxIncluded = taxIncluded;
        this.interval = interval;
        this.intervalUnit = intervalUnit;
        this.useSiteExchangeRate = useSiteExchangeRate;
        this.prices = prices;
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     * @param  pricingScheme  PricingScheme value for pricingScheme.
     * @param  unitPrice  String value for unitPrice.
     * @param  taxIncluded  Boolean value for taxIncluded.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  prices  List of Price1 value for prices.
     */

    protected WalletProductPricePointAttributes(String name, String handle,
            PricingScheme pricingScheme, OptionalNullable<String> unitPrice, Boolean taxIncluded,
            Integer interval, IntervalUnit intervalUnit, Boolean useSiteExchangeRate,
            List<Price1> prices) {
        this.name = name;
        this.handle = handle;
        this.pricingScheme = pricingScheme;
        this.unitPrice = unitPrice;
        this.taxIncluded = taxIncluded;
        this.interval = interval;
        this.intervalUnit = intervalUnit;
        this.useSiteExchangeRate = useSiteExchangeRate;
        this.prices = prices;
    }

    /**
     * Getter for Name.
     * The price point's name. Required. Omitting it fails validation with a message that reads
     * `Name: cannot be blank.`, not naming the price point.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The price point's name. Required. Omitting it fails validation with a message that reads
     * `Name: cannot be blank.`, not naming the price point.
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
     * Internal Getter for UnitPrice.
     * Required when `pricing_scheme` is `per_unit`.
     * @return Returns the Internal String
     */
    @JsonGetter("unit_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetUnitPrice() {
        return this.unitPrice;
    }

    /**
     * Getter for UnitPrice.
     * Required when `pricing_scheme` is `per_unit`.
     * @return Returns the String
     */
    public String getUnitPrice() {
        return OptionalNullable.getFrom(unitPrice);
    }

    /**
     * Setter for UnitPrice.
     * Required when `pricing_scheme` is `per_unit`.
     * @param unitPrice Value for String
     */
    @JsonSetter("unit_price")
    public void setUnitPrice(String unitPrice) {
        this.unitPrice = OptionalNullable.of(unitPrice);
    }

    /**
     * UnSetter for UnitPrice.
     * Required when `pricing_scheme` is `per_unit`.
     */
    public void unsetUnitPrice() {
        unitPrice = null;
    }

    /**
     * Getter for TaxIncluded.
     * @return Returns the Boolean
     */
    @JsonGetter("tax_included")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTaxIncluded() {
        return taxIncluded;
    }

    /**
     * Setter for TaxIncluded.
     * @param taxIncluded Value for Boolean
     */
    @JsonSetter("tax_included")
    public void setTaxIncluded(Boolean taxIncluded) {
        this.taxIncluded = taxIncluded;
    }

    /**
     * Getter for Interval.
     * Requires Multifrequency to be enabled on the site.
     * @return Returns the Integer
     */
    @JsonGetter("interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getInterval() {
        return interval;
    }

    /**
     * Setter for Interval.
     * Requires Multifrequency to be enabled on the site.
     * @param interval Value for Integer
     */
    @JsonSetter("interval")
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * Getter for IntervalUnit.
     * @return Returns the IntervalUnit
     */
    @JsonGetter("interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IntervalUnit getIntervalUnit() {
        return intervalUnit;
    }

    /**
     * Setter for IntervalUnit.
     * @param intervalUnit Value for IntervalUnit
     */
    @JsonSetter("interval_unit")
    public void setIntervalUnit(IntervalUnit intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    /**
     * Getter for UseSiteExchangeRate.
     * @return Returns the Boolean
     */
    @JsonGetter("use_site_exchange_rate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getUseSiteExchangeRate() {
        return useSiteExchangeRate;
    }

    /**
     * Setter for UseSiteExchangeRate.
     * @param useSiteExchangeRate Value for Boolean
     */
    @JsonSetter("use_site_exchange_rate")
    public void setUseSiteExchangeRate(Boolean useSiteExchangeRate) {
        this.useSiteExchangeRate = useSiteExchangeRate;
    }

    /**
     * Getter for Prices.
     * Required for every `pricing_scheme` other than `per_unit`.
     * @return Returns the List of Price1
     */
    @JsonGetter("prices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Price1> getPrices() {
        return prices;
    }

    /**
     * Setter for Prices.
     * Required for every `pricing_scheme` other than `per_unit`.
     * @param prices Value for List of Price1
     */
    @JsonSetter("prices")
    public void setPrices(List<Price1> prices) {
        this.prices = prices;
    }

    /**
     * Converts this WalletProductPricePointAttributes into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WalletProductPricePointAttributes [" + "name=" + name + ", handle=" + handle
                + ", pricingScheme=" + pricingScheme + ", unitPrice=" + unitPrice + ", taxIncluded="
                + taxIncluded + ", interval=" + interval + ", intervalUnit=" + intervalUnit
                + ", useSiteExchangeRate=" + useSiteExchangeRate + ", prices=" + prices
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link WalletProductPricePointAttributes.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WalletProductPricePointAttributes.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name)
                .handle(getHandle())
                .pricingScheme(getPricingScheme())
                .taxIncluded(getTaxIncluded())
                .interval(getInterval())
                .intervalUnit(getIntervalUnit())
                .useSiteExchangeRate(getUseSiteExchangeRate())
                .prices(getPrices());
        builder.unitPrice = internalGetUnitPrice();
        return builder;
    }

    /**
     * Class to build instances of {@link WalletProductPricePointAttributes}.
     */
    public static class Builder {
        private String name;
        private String handle;
        private PricingScheme pricingScheme;
        private OptionalNullable<String> unitPrice;
        private Boolean taxIncluded;
        private Integer interval;
        private IntervalUnit intervalUnit;
        private Boolean useSiteExchangeRate;
        private List<Price1> prices;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         */
        public Builder(String name) {
            this.name = name;
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
         * Setter for pricingScheme.
         * @param  pricingScheme  PricingScheme value for pricingScheme.
         * @return Builder
         */
        public Builder pricingScheme(PricingScheme pricingScheme) {
            this.pricingScheme = pricingScheme;
            return this;
        }

        /**
         * Setter for unitPrice.
         * @param  unitPrice  String value for unitPrice.
         * @return Builder
         */
        public Builder unitPrice(String unitPrice) {
            this.unitPrice = OptionalNullable.of(unitPrice);
            return this;
        }

        /**
         * UnSetter for unitPrice.
         * @return Builder
         */
        public Builder unsetUnitPrice() {
            unitPrice = null;
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
         * Setter for useSiteExchangeRate.
         * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
         * @return Builder
         */
        public Builder useSiteExchangeRate(Boolean useSiteExchangeRate) {
            this.useSiteExchangeRate = useSiteExchangeRate;
            return this;
        }

        /**
         * Setter for prices.
         * @param  prices  List of Price1 value for prices.
         * @return Builder
         */
        public Builder prices(List<Price1> prices) {
            this.prices = prices;
            return this;
        }

        /**
         * Builds a new {@link WalletProductPricePointAttributes} object using the set fields.
         * @return {@link WalletProductPricePointAttributes}
         */
        public WalletProductPricePointAttributes build() {
            return new WalletProductPricePointAttributes(name, handle, pricingScheme, unitPrice,
                    taxIncluded, interval, intervalUnit, useSiteExchangeRate, prices);
        }
    }
}
