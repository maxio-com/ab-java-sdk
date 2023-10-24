/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.OveragePricingPricingScheme;
import java.util.List;

/**
 * This is a model class for OveragePricing type.
 */
public class OveragePricing {
    private OveragePricingPricingScheme pricingScheme;
    private List<Price> prices;

    /**
     * Default constructor.
     */
    public OveragePricing() {
    }

    /**
     * Initialization constructor.
     * @param  pricingScheme  OveragePricingPricingScheme value for pricingScheme.
     * @param  prices  List of Price value for prices.
     */
    public OveragePricing(
            OveragePricingPricingScheme pricingScheme,
            List<Price> prices) {
        this.pricingScheme = pricingScheme;
        this.prices = prices;
    }

    /**
     * Getter for PricingScheme.
     * The identifier for the pricing scheme. See [Product
     * Components](https://help.chargify.com/products/product-components.html) for an overview of
     * pricing schemes.
     * @return Returns the OveragePricingPricingScheme
     */
    @JsonGetter("pricing_scheme")
    public OveragePricingPricingScheme getPricingScheme() {
        return pricingScheme;
    }

    /**
     * Setter for PricingScheme.
     * The identifier for the pricing scheme. See [Product
     * Components](https://help.chargify.com/products/product-components.html) for an overview of
     * pricing schemes.
     * @param pricingScheme Value for OveragePricingPricingScheme
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(OveragePricingPricingScheme pricingScheme) {
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
     * Converts this OveragePricing into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OveragePricing [" + "pricingScheme=" + pricingScheme + ", prices=" + prices + "]";
    }

    /**
     * Builds a new {@link OveragePricing.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OveragePricing.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(pricingScheme)
                .prices(getPrices());
        return builder;
    }

    /**
     * Class to build instances of {@link OveragePricing}.
     */
    public static class Builder {
        private OveragePricingPricingScheme pricingScheme;
        private List<Price> prices;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  pricingScheme  OveragePricingPricingScheme value for pricingScheme.
         */
        public Builder(OveragePricingPricingScheme pricingScheme) {
            this.pricingScheme = pricingScheme;
        }

        /**
         * Setter for pricingScheme.
         * @param  pricingScheme  OveragePricingPricingScheme value for pricingScheme.
         * @return Builder
         */
        public Builder pricingScheme(OveragePricingPricingScheme pricingScheme) {
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
         * Builds a new {@link OveragePricing} object using the set fields.
         * @return {@link OveragePricing}
         */
        public OveragePricing build() {
            return new OveragePricing(pricingScheme, prices);
        }
    }
}
