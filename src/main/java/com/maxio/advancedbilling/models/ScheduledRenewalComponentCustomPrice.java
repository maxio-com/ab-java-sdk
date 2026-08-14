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
 * This is a model class for ScheduledRenewalComponentCustomPrice type.
 */
public class ScheduledRenewalComponentCustomPrice
        extends BaseModel {
    private Boolean taxIncluded;
    private PricingScheme pricingScheme;
    private List<Price> prices;

    /**
     * Default constructor.
     */
    public ScheduledRenewalComponentCustomPrice() {
    }

    /**
     * Initialization constructor.
     * @param  pricingScheme  PricingScheme value for pricingScheme.
     * @param  prices  List of Price value for prices.
     * @param  taxIncluded  Boolean value for taxIncluded.
     */
    public ScheduledRenewalComponentCustomPrice(
            PricingScheme pricingScheme,
            List<Price> prices,
            Boolean taxIncluded) {
        this.taxIncluded = taxIncluded;
        this.pricingScheme = pricingScheme;
        this.prices = prices;
    }

    /**
     * Getter for TaxIncluded.
     * Whether or not the price point includes tax
     * @return Returns the Boolean
     */
    @JsonGetter("tax_included")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTaxIncluded() {
        return taxIncluded;
    }

    /**
     * Setter for TaxIncluded.
     * Whether or not the price point includes tax
     * @param taxIncluded Value for Boolean
     */
    @JsonSetter("tax_included")
    public void setTaxIncluded(Boolean taxIncluded) {
        this.taxIncluded = taxIncluded;
    }

    /**
     * Getter for PricingScheme.
     * Omit for On/Off components.
     * @return Returns the PricingScheme
     */
    @JsonGetter("pricing_scheme")
    public PricingScheme getPricingScheme() {
        return pricingScheme;
    }

    /**
     * Setter for PricingScheme.
     * Omit for On/Off components.
     * @param pricingScheme Value for PricingScheme
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(PricingScheme pricingScheme) {
        this.pricingScheme = pricingScheme;
    }

    /**
     * Getter for Prices.
     * On/off components only need one price bracket starting at 1.
     * @return Returns the List of Price
     */
    @JsonGetter("prices")
    public List<Price> getPrices() {
        return prices;
    }

    /**
     * Setter for Prices.
     * On/off components only need one price bracket starting at 1.
     * @param prices Value for List of Price
     */
    @JsonSetter("prices")
    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    /**
     * Converts this ScheduledRenewalComponentCustomPrice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ScheduledRenewalComponentCustomPrice [" + "pricingScheme=" + pricingScheme
                + ", prices=" + prices + ", taxIncluded=" + taxIncluded + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ScheduledRenewalComponentCustomPrice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ScheduledRenewalComponentCustomPrice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(pricingScheme, prices)
                .taxIncluded(getTaxIncluded());
        return builder;
    }

    /**
     * Class to build instances of {@link ScheduledRenewalComponentCustomPrice}.
     */
    public static class Builder {
        private PricingScheme pricingScheme;
        private List<Price> prices;
        private Boolean taxIncluded;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  pricingScheme  PricingScheme value for pricingScheme.
         * @param  prices  List of Price value for prices.
         */
        public Builder(PricingScheme pricingScheme, List<Price> prices) {
            this.pricingScheme = pricingScheme;
            this.prices = prices;
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
         * Setter for taxIncluded.
         * @param  taxIncluded  Boolean value for taxIncluded.
         * @return Builder
         */
        public Builder taxIncluded(Boolean taxIncluded) {
            this.taxIncluded = taxIncluded;
            return this;
        }

        /**
         * Builds a new {@link ScheduledRenewalComponentCustomPrice} object using the set fields.
         * @return {@link ScheduledRenewalComponentCustomPrice}
         */
        public ScheduledRenewalComponentCustomPrice build() {
            return new ScheduledRenewalComponentCustomPrice(pricingScheme, prices, taxIncluded);
        }
    }
}
