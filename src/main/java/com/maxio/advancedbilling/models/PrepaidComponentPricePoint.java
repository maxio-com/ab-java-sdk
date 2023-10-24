/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for PrepaidComponentPricePoint type.
 */
public class PrepaidComponentPricePoint {
    private String name;
    private String handle;
    private String pricingScheme;
    private List<Price> prices;
    private OveragePricing overagePricing;

    /**
     * Default constructor.
     */
    public PrepaidComponentPricePoint() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     * @param  pricingScheme  String value for pricingScheme.
     * @param  prices  List of Price value for prices.
     * @param  overagePricing  OveragePricing value for overagePricing.
     */
    public PrepaidComponentPricePoint(
            String name,
            String handle,
            String pricingScheme,
            List<Price> prices,
            OveragePricing overagePricing) {
        this.name = name;
        this.handle = handle;
        this.pricingScheme = pricingScheme;
        this.prices = prices;
        this.overagePricing = overagePricing;
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
     * Converts this PrepaidComponentPricePoint into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrepaidComponentPricePoint [" + "name=" + name + ", handle=" + handle
                + ", pricingScheme=" + pricingScheme + ", prices=" + prices + ", overagePricing="
                + overagePricing + "]";
    }

    /**
     * Builds a new {@link PrepaidComponentPricePoint.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PrepaidComponentPricePoint.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .handle(getHandle())
                .pricingScheme(getPricingScheme())
                .prices(getPrices())
                .overagePricing(getOveragePricing());
        return builder;
    }

    /**
     * Class to build instances of {@link PrepaidComponentPricePoint}.
     */
    public static class Builder {
        private String name;
        private String handle;
        private String pricingScheme;
        private List<Price> prices;
        private OveragePricing overagePricing;



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
         * Setter for overagePricing.
         * @param  overagePricing  OveragePricing value for overagePricing.
         * @return Builder
         */
        public Builder overagePricing(OveragePricing overagePricing) {
            this.overagePricing = overagePricing;
            return this;
        }

        /**
         * Builds a new {@link PrepaidComponentPricePoint} object using the set fields.
         * @return {@link PrepaidComponentPricePoint}
         */
        public PrepaidComponentPricePoint build() {
            return new PrepaidComponentPricePoint(name, handle, pricingScheme, prices,
                    overagePricing);
        }
    }
}
