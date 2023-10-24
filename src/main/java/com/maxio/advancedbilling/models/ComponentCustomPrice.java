/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.ComponentCustomPricePricingScheme;
import java.util.List;

/**
 * This is a model class for ComponentCustomPrice type.
 */
public class ComponentCustomPrice {
    private ComponentCustomPricePricingScheme pricingScheme;
    private List<Price> prices;

    /**
     * Default constructor.
     */
    public ComponentCustomPrice() {
    }

    /**
     * Initialization constructor.
     * @param  pricingScheme  ComponentCustomPricePricingScheme value for pricingScheme.
     * @param  prices  List of Price value for prices.
     */
    public ComponentCustomPrice(
            ComponentCustomPricePricingScheme pricingScheme,
            List<Price> prices) {
        this.pricingScheme = pricingScheme;
        this.prices = prices;
    }

    /**
     * Getter for PricingScheme.
     * Omit for On/Off components
     * @return Returns the ComponentCustomPricePricingScheme
     */
    @JsonGetter("pricing_scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ComponentCustomPricePricingScheme getPricingScheme() {
        return pricingScheme;
    }

    /**
     * Setter for PricingScheme.
     * Omit for On/Off components
     * @param pricingScheme Value for ComponentCustomPricePricingScheme
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(ComponentCustomPricePricingScheme pricingScheme) {
        this.pricingScheme = pricingScheme;
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
        return "ComponentCustomPrice [" + "pricingScheme=" + pricingScheme + ", prices=" + prices
                + "]";
    }

    /**
     * Builds a new {@link ComponentCustomPrice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ComponentCustomPrice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .pricingScheme(getPricingScheme())
                .prices(getPrices());
        return builder;
    }

    /**
     * Class to build instances of {@link ComponentCustomPrice}.
     */
    public static class Builder {
        private ComponentCustomPricePricingScheme pricingScheme;
        private List<Price> prices;



        /**
         * Setter for pricingScheme.
         * @param  pricingScheme  ComponentCustomPricePricingScheme value for pricingScheme.
         * @return Builder
         */
        public Builder pricingScheme(ComponentCustomPricePricingScheme pricingScheme) {
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
         * Builds a new {@link ComponentCustomPrice} object using the set fields.
         * @return {@link ComponentCustomPrice}
         */
        public ComponentCustomPrice build() {
            return new ComponentCustomPrice(pricingScheme, prices);
        }
    }
}
