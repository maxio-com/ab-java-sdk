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
 * This is a model class for CreatePrepaidUsageComponentPricePoint type.
 */
public class CreatePrepaidUsageComponentPricePoint
        extends BaseModel {
    private String name;
    private String handle;
    private PricingScheme pricingScheme;
    private List<Price> prices;
    private OveragePricing overagePricing;
    private Boolean useSiteExchangeRate;
    private Boolean rolloverPrepaidRemainder;
    private Boolean renewPrepaidAllocation;
    private Double expirationInterval;
    private OptionalNullable<ExpirationIntervalUnit> expirationIntervalUnit;

    /**
     * Default constructor.
     */
    public CreatePrepaidUsageComponentPricePoint() {
        useSiteExchangeRate = true;
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  pricingScheme  PricingScheme value for pricingScheme.
     * @param  prices  List of Price value for prices.
     * @param  overagePricing  OveragePricing value for overagePricing.
     * @param  handle  String value for handle.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  rolloverPrepaidRemainder  Boolean value for rolloverPrepaidRemainder.
     * @param  renewPrepaidAllocation  Boolean value for renewPrepaidAllocation.
     * @param  expirationInterval  Double value for expirationInterval.
     * @param  expirationIntervalUnit  ExpirationIntervalUnit value for expirationIntervalUnit.
     */
    public CreatePrepaidUsageComponentPricePoint(
            String name,
            PricingScheme pricingScheme,
            List<Price> prices,
            OveragePricing overagePricing,
            String handle,
            Boolean useSiteExchangeRate,
            Boolean rolloverPrepaidRemainder,
            Boolean renewPrepaidAllocation,
            Double expirationInterval,
            ExpirationIntervalUnit expirationIntervalUnit) {
        this.name = name;
        this.handle = handle;
        this.pricingScheme = pricingScheme;
        this.prices = prices;
        this.overagePricing = overagePricing;
        this.useSiteExchangeRate = useSiteExchangeRate;
        this.rolloverPrepaidRemainder = rolloverPrepaidRemainder;
        this.renewPrepaidAllocation = renewPrepaidAllocation;
        this.expirationInterval = expirationInterval;
        this.expirationIntervalUnit = OptionalNullable.of(expirationIntervalUnit);
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  pricingScheme  PricingScheme value for pricingScheme.
     * @param  prices  List of Price value for prices.
     * @param  overagePricing  OveragePricing value for overagePricing.
     * @param  handle  String value for handle.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  rolloverPrepaidRemainder  Boolean value for rolloverPrepaidRemainder.
     * @param  renewPrepaidAllocation  Boolean value for renewPrepaidAllocation.
     * @param  expirationInterval  Double value for expirationInterval.
     * @param  expirationIntervalUnit  ExpirationIntervalUnit value for expirationIntervalUnit.
     */

    protected CreatePrepaidUsageComponentPricePoint(String name, PricingScheme pricingScheme,
            List<Price> prices, OveragePricing overagePricing, String handle,
            Boolean useSiteExchangeRate, Boolean rolloverPrepaidRemainder,
            Boolean renewPrepaidAllocation, Double expirationInterval,
            OptionalNullable<ExpirationIntervalUnit> expirationIntervalUnit) {
        this.name = name;
        this.handle = handle;
        this.pricingScheme = pricingScheme;
        this.prices = prices;
        this.overagePricing = overagePricing;
        this.useSiteExchangeRate = useSiteExchangeRate;
        this.rolloverPrepaidRemainder = rolloverPrepaidRemainder;
        this.renewPrepaidAllocation = renewPrepaidAllocation;
        this.expirationInterval = expirationInterval;
        this.expirationIntervalUnit = expirationIntervalUnit;
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  pricingScheme  PricingScheme value for pricingScheme.
     * @param  prices  List of Price value for prices.
     * @param  overagePricing  OveragePricing value for overagePricing.
     */
    @JsonCreator
    protected CreatePrepaidUsageComponentPricePoint(
            @JsonProperty("name") String name,
            @JsonProperty("pricing_scheme") PricingScheme pricingScheme,
            @JsonProperty("prices") List<Price> prices,
            @JsonProperty("overage_pricing") OveragePricing overagePricing) {
        this(name, pricingScheme, prices, overagePricing, null, null, null, null, null,
                OptionalNullable.of(null));
        unsetExpirationIntervalUnit();
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
     * Getter for OveragePricing.
     * @return Returns the OveragePricing
     */
    @JsonGetter("overage_pricing")
    public OveragePricing getOveragePricing() {
        return overagePricing;
    }

    /**
     * Setter for OveragePricing.
     * @param overagePricing Value for OveragePricing
     */
    @JsonSetter("overage_pricing")
    public void setOveragePricing(OveragePricing overagePricing) {
        this.overagePricing = overagePricing;
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
     * Getter for RolloverPrepaidRemainder.
     * Boolean which controls whether or not remaining units should be rolled over to the next
     * period
     * @return Returns the Boolean
     */
    @JsonGetter("rollover_prepaid_remainder")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRolloverPrepaidRemainder() {
        return rolloverPrepaidRemainder;
    }

    /**
     * Setter for RolloverPrepaidRemainder.
     * Boolean which controls whether or not remaining units should be rolled over to the next
     * period
     * @param rolloverPrepaidRemainder Value for Boolean
     */
    @JsonSetter("rollover_prepaid_remainder")
    public void setRolloverPrepaidRemainder(Boolean rolloverPrepaidRemainder) {
        this.rolloverPrepaidRemainder = rolloverPrepaidRemainder;
    }

    /**
     * Getter for RenewPrepaidAllocation.
     * Boolean which controls whether or not the allocated quantity should be renewed at the
     * beginning of each period
     * @return Returns the Boolean
     */
    @JsonGetter("renew_prepaid_allocation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRenewPrepaidAllocation() {
        return renewPrepaidAllocation;
    }

    /**
     * Setter for RenewPrepaidAllocation.
     * Boolean which controls whether or not the allocated quantity should be renewed at the
     * beginning of each period
     * @param renewPrepaidAllocation Value for Boolean
     */
    @JsonSetter("renew_prepaid_allocation")
    public void setRenewPrepaidAllocation(Boolean renewPrepaidAllocation) {
        this.renewPrepaidAllocation = renewPrepaidAllocation;
    }

    /**
     * Getter for ExpirationInterval.
     * (only for prepaid usage components where rollover_prepaid_remainder is true) The number of
     * `expiration_interval_unit`s after which rollover amounts should expire
     * @return Returns the Double
     */
    @JsonGetter("expiration_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getExpirationInterval() {
        return expirationInterval;
    }

    /**
     * Setter for ExpirationInterval.
     * (only for prepaid usage components where rollover_prepaid_remainder is true) The number of
     * `expiration_interval_unit`s after which rollover amounts should expire
     * @param expirationInterval Value for Double
     */
    @JsonSetter("expiration_interval")
    public void setExpirationInterval(Double expirationInterval) {
        this.expirationInterval = expirationInterval;
    }

    /**
     * Internal Getter for ExpirationIntervalUnit.
     * A string representing the expiration interval unit for this component, either month or day
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
     * A string representing the expiration interval unit for this component, either month or day
     * @return Returns the ExpirationIntervalUnit
     */
    public ExpirationIntervalUnit getExpirationIntervalUnit() {
        return OptionalNullable.getFrom(expirationIntervalUnit);
    }

    /**
     * Setter for ExpirationIntervalUnit.
     * A string representing the expiration interval unit for this component, either month or day
     * @param expirationIntervalUnit Value for ExpirationIntervalUnit
     */
    @JsonSetter("expiration_interval_unit")
    public void setExpirationIntervalUnit(ExpirationIntervalUnit expirationIntervalUnit) {
        this.expirationIntervalUnit = OptionalNullable.of(expirationIntervalUnit);
    }

    /**
     * UnSetter for ExpirationIntervalUnit.
     * A string representing the expiration interval unit for this component, either month or day
     */
    public void unsetExpirationIntervalUnit() {
        expirationIntervalUnit = null;
    }

    /**
     * Converts this CreatePrepaidUsageComponentPricePoint into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreatePrepaidUsageComponentPricePoint [" + "name=" + name + ", pricingScheme="
                + pricingScheme + ", prices=" + prices + ", overagePricing=" + overagePricing
                + ", handle=" + handle + ", useSiteExchangeRate=" + useSiteExchangeRate
                + ", rolloverPrepaidRemainder=" + rolloverPrepaidRemainder
                + ", renewPrepaidAllocation=" + renewPrepaidAllocation + ", expirationInterval="
                + expirationInterval + ", expirationIntervalUnit=" + expirationIntervalUnit
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CreatePrepaidUsageComponentPricePoint.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreatePrepaidUsageComponentPricePoint.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, pricingScheme, prices, overagePricing)
                .handle(getHandle())
                .useSiteExchangeRate(getUseSiteExchangeRate())
                .rolloverPrepaidRemainder(getRolloverPrepaidRemainder())
                .renewPrepaidAllocation(getRenewPrepaidAllocation())
                .expirationInterval(getExpirationInterval());
        builder.expirationIntervalUnit = internalGetExpirationIntervalUnit();
        return builder;
    }

    /**
     * Class to build instances of {@link CreatePrepaidUsageComponentPricePoint}.
     */
    public static class Builder {
        private String name;
        private PricingScheme pricingScheme;
        private List<Price> prices;
        private OveragePricing overagePricing;
        private String handle;
        private Boolean useSiteExchangeRate = true;
        private Boolean rolloverPrepaidRemainder;
        private Boolean renewPrepaidAllocation;
        private Double expirationInterval;
        private OptionalNullable<ExpirationIntervalUnit> expirationIntervalUnit;

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
         * @param  overagePricing  OveragePricing value for overagePricing.
         */
        public Builder(String name, PricingScheme pricingScheme, List<Price> prices,
                OveragePricing overagePricing) {
            this.name = name;
            this.pricingScheme = pricingScheme;
            this.prices = prices;
            this.overagePricing = overagePricing;
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
         * Setter for overagePricing.
         * @param  overagePricing  OveragePricing value for overagePricing.
         * @return Builder
         */
        public Builder overagePricing(OveragePricing overagePricing) {
            this.overagePricing = overagePricing;
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
         * Setter for useSiteExchangeRate.
         * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
         * @return Builder
         */
        public Builder useSiteExchangeRate(Boolean useSiteExchangeRate) {
            this.useSiteExchangeRate = useSiteExchangeRate;
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
         * Setter for renewPrepaidAllocation.
         * @param  renewPrepaidAllocation  Boolean value for renewPrepaidAllocation.
         * @return Builder
         */
        public Builder renewPrepaidAllocation(Boolean renewPrepaidAllocation) {
            this.renewPrepaidAllocation = renewPrepaidAllocation;
            return this;
        }

        /**
         * Setter for expirationInterval.
         * @param  expirationInterval  Double value for expirationInterval.
         * @return Builder
         */
        public Builder expirationInterval(Double expirationInterval) {
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
         * Builds a new {@link CreatePrepaidUsageComponentPricePoint} object using the set fields.
         * @return {@link CreatePrepaidUsageComponentPricePoint}
         */
        public CreatePrepaidUsageComponentPricePoint build() {
            return new CreatePrepaidUsageComponentPricePoint(name, pricingScheme, prices,
                    overagePricing, handle, useSiteExchangeRate, rolloverPrepaidRemainder,
                    renewPrepaidAllocation, expirationInterval, expirationIntervalUnit);
        }
    }
}
