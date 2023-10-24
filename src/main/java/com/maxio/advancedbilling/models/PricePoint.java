/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.PricePointExpirationIntervalUnit;
import java.util.List;

/**
 * This is a model class for PricePoint type.
 */
public class PricePoint {
    private String name;
    private String handle;
    private String pricingScheme;
    private List<Price> prices;
    private Boolean useSiteExchangeRate;
    private OveragePricing overagePricing;
    private Boolean rolloverPrepaidRemainder;
    private Boolean renewPrepaidAllocation;
    private Double expirationInterval;
    private PricePointExpirationIntervalUnit expirationIntervalUnit;

    /**
     * Default constructor.
     */
    public PricePoint() {
        useSiteExchangeRate = true;
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     * @param  pricingScheme  String value for pricingScheme.
     * @param  prices  List of Price value for prices.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  overagePricing  OveragePricing value for overagePricing.
     * @param  rolloverPrepaidRemainder  Boolean value for rolloverPrepaidRemainder.
     * @param  renewPrepaidAllocation  Boolean value for renewPrepaidAllocation.
     * @param  expirationInterval  Double value for expirationInterval.
     * @param  expirationIntervalUnit  PricePointExpirationIntervalUnit value for
     *         expirationIntervalUnit.
     */
    public PricePoint(
            String name,
            String handle,
            String pricingScheme,
            List<Price> prices,
            Boolean useSiteExchangeRate,
            OveragePricing overagePricing,
            Boolean rolloverPrepaidRemainder,
            Boolean renewPrepaidAllocation,
            Double expirationInterval,
            PricePointExpirationIntervalUnit expirationIntervalUnit) {
        this.name = name;
        this.handle = handle;
        this.pricingScheme = pricingScheme;
        this.prices = prices;
        this.useSiteExchangeRate = useSiteExchangeRate;
        this.overagePricing = overagePricing;
        this.rolloverPrepaidRemainder = rolloverPrepaidRemainder;
        this.renewPrepaidAllocation = renewPrepaidAllocation;
        this.expirationInterval = expirationInterval;
        this.expirationIntervalUnit = expirationIntervalUnit;
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
     * @return Returns the String
     */
    @JsonGetter("pricing_scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPricingScheme() {
        return pricingScheme;
    }

    /**
     * Setter for PricingScheme.
     * @param pricingScheme Value for String
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(String pricingScheme) {
        this.pricingScheme = pricingScheme;
    }

    /**
     * Getter for Prices.
     * @return Returns the List of Price
     */
    @JsonGetter("prices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for OveragePricing.
     * @return Returns the OveragePricing
     */
    @JsonGetter("overage_pricing")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for ExpirationIntervalUnit.
     * @return Returns the PricePointExpirationIntervalUnit
     */
    @JsonGetter("expiration_interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PricePointExpirationIntervalUnit getExpirationIntervalUnit() {
        return expirationIntervalUnit;
    }

    /**
     * Setter for ExpirationIntervalUnit.
     * @param expirationIntervalUnit Value for PricePointExpirationIntervalUnit
     */
    @JsonSetter("expiration_interval_unit")
    public void setExpirationIntervalUnit(PricePointExpirationIntervalUnit expirationIntervalUnit) {
        this.expirationIntervalUnit = expirationIntervalUnit;
    }

    /**
     * Converts this PricePoint into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PricePoint [" + "name=" + name + ", handle=" + handle + ", pricingScheme="
                + pricingScheme + ", prices=" + prices + ", useSiteExchangeRate="
                + useSiteExchangeRate + ", overagePricing=" + overagePricing
                + ", rolloverPrepaidRemainder=" + rolloverPrepaidRemainder
                + ", renewPrepaidAllocation=" + renewPrepaidAllocation + ", expirationInterval="
                + expirationInterval + ", expirationIntervalUnit=" + expirationIntervalUnit + "]";
    }

    /**
     * Builds a new {@link PricePoint.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PricePoint.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .handle(getHandle())
                .pricingScheme(getPricingScheme())
                .prices(getPrices())
                .useSiteExchangeRate(getUseSiteExchangeRate())
                .overagePricing(getOveragePricing())
                .rolloverPrepaidRemainder(getRolloverPrepaidRemainder())
                .renewPrepaidAllocation(getRenewPrepaidAllocation())
                .expirationInterval(getExpirationInterval())
                .expirationIntervalUnit(getExpirationIntervalUnit());
        return builder;
    }

    /**
     * Class to build instances of {@link PricePoint}.
     */
    public static class Builder {
        private String name;
        private String handle;
        private String pricingScheme;
        private List<Price> prices;
        private Boolean useSiteExchangeRate = true;
        private OveragePricing overagePricing;
        private Boolean rolloverPrepaidRemainder;
        private Boolean renewPrepaidAllocation;
        private Double expirationInterval;
        private PricePointExpirationIntervalUnit expirationIntervalUnit;



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
         * @param  pricingScheme  String value for pricingScheme.
         * @return Builder
         */
        public Builder pricingScheme(String pricingScheme) {
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
         * Setter for useSiteExchangeRate.
         * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
         * @return Builder
         */
        public Builder useSiteExchangeRate(Boolean useSiteExchangeRate) {
            this.useSiteExchangeRate = useSiteExchangeRate;
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
         * @param  expirationIntervalUnit  PricePointExpirationIntervalUnit value for
         *         expirationIntervalUnit.
         * @return Builder
         */
        public Builder expirationIntervalUnit(
                PricePointExpirationIntervalUnit expirationIntervalUnit) {
            this.expirationIntervalUnit = expirationIntervalUnit;
            return this;
        }

        /**
         * Builds a new {@link PricePoint} object using the set fields.
         * @return {@link PricePoint}
         */
        public PricePoint build() {
            return new PricePoint(name, handle, pricingScheme, prices, useSiteExchangeRate,
                    overagePricing, rolloverPrepaidRemainder, renewPrepaidAllocation,
                    expirationInterval, expirationIntervalUnit);
        }
    }
}
