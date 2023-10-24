/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.SubscriptionGroupComponentCustomPricePricingScheme;
import java.util.List;

/**
 * This is a model class for SubscriptionGroupComponentCustomPrice type.
 */
public class SubscriptionGroupComponentCustomPrice {
    private SubscriptionGroupComponentCustomPricePricingScheme pricingScheme;
    private List<Price> prices;
    private List<ComponentCustomPrice> overagePricing;

    /**
     * Default constructor.
     */
    public SubscriptionGroupComponentCustomPrice() {
    }

    /**
     * Initialization constructor.
     * @param  pricingScheme  SubscriptionGroupComponentCustomPricePricingScheme value for
     *         pricingScheme.
     * @param  prices  List of Price value for prices.
     * @param  overagePricing  List of ComponentCustomPrice value for overagePricing.
     */
    public SubscriptionGroupComponentCustomPrice(
            SubscriptionGroupComponentCustomPricePricingScheme pricingScheme,
            List<Price> prices,
            List<ComponentCustomPrice> overagePricing) {
        this.pricingScheme = pricingScheme;
        this.prices = prices;
        this.overagePricing = overagePricing;
    }

    /**
     * Getter for PricingScheme.
     * The identifier for the pricing scheme. See [Product
     * Components](https://help.chargify.com/products/product-components.html) for an overview of
     * pricing schemes.
     * @return Returns the SubscriptionGroupComponentCustomPricePricingScheme
     */
    @JsonGetter("pricing_scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionGroupComponentCustomPricePricingScheme getPricingScheme() {
        return pricingScheme;
    }

    /**
     * Setter for PricingScheme.
     * The identifier for the pricing scheme. See [Product
     * Components](https://help.chargify.com/products/product-components.html) for an overview of
     * pricing schemes.
     * @param pricingScheme Value for SubscriptionGroupComponentCustomPricePricingScheme
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(SubscriptionGroupComponentCustomPricePricingScheme pricingScheme) {
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
     * Getter for OveragePricing.
     * @return Returns the List of ComponentCustomPrice
     */
    @JsonGetter("overage_pricing")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ComponentCustomPrice> getOveragePricing() {
        return overagePricing;
    }

    /**
     * Setter for OveragePricing.
     * @param overagePricing Value for List of ComponentCustomPrice
     */
    @JsonSetter("overage_pricing")
    public void setOveragePricing(List<ComponentCustomPrice> overagePricing) {
        this.overagePricing = overagePricing;
    }

    /**
     * Converts this SubscriptionGroupComponentCustomPrice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupComponentCustomPrice [" + "pricingScheme=" + pricingScheme
                + ", prices=" + prices + ", overagePricing=" + overagePricing + "]";
    }

    /**
     * Builds a new {@link SubscriptionGroupComponentCustomPrice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionGroupComponentCustomPrice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .pricingScheme(getPricingScheme())
                .prices(getPrices())
                .overagePricing(getOveragePricing());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupComponentCustomPrice}.
     */
    public static class Builder {
        private SubscriptionGroupComponentCustomPricePricingScheme pricingScheme;
        private List<Price> prices;
        private List<ComponentCustomPrice> overagePricing;



        /**
         * Setter for pricingScheme.
         * @param  pricingScheme  SubscriptionGroupComponentCustomPricePricingScheme value for
         *         pricingScheme.
         * @return Builder
         */
        public Builder pricingScheme(
                SubscriptionGroupComponentCustomPricePricingScheme pricingScheme) {
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
         * @param  overagePricing  List of ComponentCustomPrice value for overagePricing.
         * @return Builder
         */
        public Builder overagePricing(List<ComponentCustomPrice> overagePricing) {
            this.overagePricing = overagePricing;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroupComponentCustomPrice} object using the set fields.
         * @return {@link SubscriptionGroupComponentCustomPrice}
         */
        public SubscriptionGroupComponentCustomPrice build() {
            return new SubscriptionGroupComponentCustomPrice(pricingScheme, prices, overagePricing);
        }
    }
}
