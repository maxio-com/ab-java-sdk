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
import java.util.List;

/**
 * This is a model class for CreateComponentPricePoint type.
 */
public class CreateComponentPricePoint {
    private String name;
    private String handle;
    private String pricingScheme;
    private List<Price> prices;
    private Boolean useSiteExchangeRate;

    /**
     * Default constructor.
     */
    public CreateComponentPricePoint() {
        useSiteExchangeRate = true;
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  pricingScheme  String value for pricingScheme.
     * @param  prices  List of Price value for prices.
     * @param  handle  String value for handle.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     */
    public CreateComponentPricePoint(
            String name,
            String pricingScheme,
            List<Price> prices,
            String handle,
            Boolean useSiteExchangeRate) {
        this.name = name;
        this.handle = handle;
        this.pricingScheme = pricingScheme;
        this.prices = prices;
        this.useSiteExchangeRate = useSiteExchangeRate;
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  pricingScheme  String value for pricingScheme.
     * @param  prices  List of Price value for prices.
     */
    @JsonCreator
    protected CreateComponentPricePoint(
            @JsonProperty("name") String name,
            @JsonProperty("pricing_scheme") String pricingScheme,
            @JsonProperty("prices") List<Price> prices) {
        this(name, pricingScheme, prices, null, null);
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
     * @return Returns the String
     */
    @JsonGetter("pricing_scheme")
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
     * Converts this CreateComponentPricePoint into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateComponentPricePoint [" + "name=" + name + ", pricingScheme=" + pricingScheme
                + ", prices=" + prices + ", handle=" + handle + ", useSiteExchangeRate="
                + useSiteExchangeRate + "]";
    }

    /**
     * Builds a new {@link CreateComponentPricePoint.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateComponentPricePoint.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, pricingScheme, prices)
                .handle(getHandle())
                .useSiteExchangeRate(getUseSiteExchangeRate());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateComponentPricePoint}.
     */
    public static class Builder {
        private String name;
        private String pricingScheme;
        private List<Price> prices;
        private String handle;
        private Boolean useSiteExchangeRate = true;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  pricingScheme  String value for pricingScheme.
         * @param  prices  List of Price value for prices.
         */
        public Builder(String name, String pricingScheme, List<Price> prices) {
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
         * Builds a new {@link CreateComponentPricePoint} object using the set fields.
         * @return {@link CreateComponentPricePoint}
         */
        public CreateComponentPricePoint build() {
            return new CreateComponentPricePoint(name, pricingScheme, prices, handle,
                    useSiteExchangeRate);
        }
    }
}
