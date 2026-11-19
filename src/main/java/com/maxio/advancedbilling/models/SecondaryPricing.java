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
 * This is a model class for SecondaryPricing type.
 */
public class SecondaryPricing
        extends BaseModel {
    private PricingScheme pricingScheme;
    private List<Price> prices;

    /**
     * Default constructor.
     */
    public SecondaryPricing() {
    }

    /**
     * Initialization constructor.
     * @param  pricingScheme  PricingScheme value for pricingScheme.
     * @param  prices  List of Price value for prices.
     */
    public SecondaryPricing(
            PricingScheme pricingScheme,
            List<Price> prices) {
        this.pricingScheme = pricingScheme;
        this.prices = prices;
    }

    /**
     * Getter for PricingScheme.
     * Required, unless you send the top-level `secondary_pricing_scheme` instead (Create and Update
     * Component Price Point only). A block with neither returns `422` (`Secondary pricing scheme
     * must be defined`).
     * @return Returns the PricingScheme
     */
    @JsonGetter("pricing_scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PricingScheme getPricingScheme() {
        return pricingScheme;
    }

    /**
     * Setter for PricingScheme.
     * Required, unless you send the top-level `secondary_pricing_scheme` instead (Create and Update
     * Component Price Point only). A block with neither returns `422` (`Secondary pricing scheme
     * must be defined`).
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
     * Converts this SecondaryPricing into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SecondaryPricing [" + "pricingScheme=" + pricingScheme + ", prices=" + prices
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link SecondaryPricing.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SecondaryPricing.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .pricingScheme(getPricingScheme())
                .prices(getPrices());
        return builder;
    }

    /**
     * Class to build instances of {@link SecondaryPricing}.
     */
    public static class Builder {
        private PricingScheme pricingScheme;
        private List<Price> prices;



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
         * Builds a new {@link SecondaryPricing} object using the set fields.
         * @return {@link SecondaryPricing}
         */
        public SecondaryPricing build() {
            return new SecondaryPricing(pricingScheme, prices);
        }
    }
}
