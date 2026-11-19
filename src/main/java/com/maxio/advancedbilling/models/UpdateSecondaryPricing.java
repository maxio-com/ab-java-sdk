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
 * This is a model class for UpdateSecondaryPricing type.
 */
public class UpdateSecondaryPricing
        extends BaseModel {
    private PricingScheme pricingScheme;
    private List<UpdatePrice> prices;

    /**
     * Default constructor.
     */
    public UpdateSecondaryPricing() {
    }

    /**
     * Initialization constructor.
     * @param  pricingScheme  PricingScheme value for pricingScheme.
     * @param  prices  List of UpdatePrice value for prices.
     */
    public UpdateSecondaryPricing(
            PricingScheme pricingScheme,
            List<UpdatePrice> prices) {
        this.pricingScheme = pricingScheme;
        this.prices = prices;
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
     * Converts this UpdateSecondaryPricing into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateSecondaryPricing [" + "pricingScheme=" + pricingScheme + ", prices=" + prices
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link UpdateSecondaryPricing.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateSecondaryPricing.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .pricingScheme(getPricingScheme())
                .prices(getPrices());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateSecondaryPricing}.
     */
    public static class Builder {
        private PricingScheme pricingScheme;
        private List<UpdatePrice> prices;



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
         * @param  prices  List of UpdatePrice value for prices.
         * @return Builder
         */
        public Builder prices(List<UpdatePrice> prices) {
            this.prices = prices;
            return this;
        }

        /**
         * Builds a new {@link UpdateSecondaryPricing} object using the set fields.
         * @return {@link UpdateSecondaryPricing}
         */
        public UpdateSecondaryPricing build() {
            return new UpdateSecondaryPricing(pricingScheme, prices);
        }
    }
}
