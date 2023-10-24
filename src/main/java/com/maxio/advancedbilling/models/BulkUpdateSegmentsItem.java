/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for BulkUpdateSegmentsItem type.
 */
public class BulkUpdateSegmentsItem {
    private int id;
    private String pricingScheme;
    private List<CreateOrUpdateSegmentPrice> prices;

    /**
     * Default constructor.
     */
    public BulkUpdateSegmentsItem() {
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  pricingScheme  String value for pricingScheme.
     * @param  prices  List of CreateOrUpdateSegmentPrice value for prices.
     */
    public BulkUpdateSegmentsItem(
            int id,
            String pricingScheme,
            List<CreateOrUpdateSegmentPrice> prices) {
        this.id = id;
        this.pricingScheme = pricingScheme;
        this.prices = prices;
    }

    /**
     * Getter for Id.
     * The ID of the segment you want to update.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The ID of the segment you want to update.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for PricingScheme.
     * The handle for the pricing scheme. Available options: per_unit, volume, tiered, stairstep.
     * See [Price Bracket
     * Rules](https://help.chargify.com/products/product-components.html#price-bracket-rules) for an
     * overview of pricing schemes.
     * @return Returns the String
     */
    @JsonGetter("pricing_scheme")
    public String getPricingScheme() {
        return pricingScheme;
    }

    /**
     * Setter for PricingScheme.
     * The handle for the pricing scheme. Available options: per_unit, volume, tiered, stairstep.
     * See [Price Bracket
     * Rules](https://help.chargify.com/products/product-components.html#price-bracket-rules) for an
     * overview of pricing schemes.
     * @param pricingScheme Value for String
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(String pricingScheme) {
        this.pricingScheme = pricingScheme;
    }

    /**
     * Getter for Prices.
     * @return Returns the List of CreateOrUpdateSegmentPrice
     */
    @JsonGetter("prices")
    public List<CreateOrUpdateSegmentPrice> getPrices() {
        return prices;
    }

    /**
     * Setter for Prices.
     * @param prices Value for List of CreateOrUpdateSegmentPrice
     */
    @JsonSetter("prices")
    public void setPrices(List<CreateOrUpdateSegmentPrice> prices) {
        this.prices = prices;
    }

    /**
     * Converts this BulkUpdateSegmentsItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BulkUpdateSegmentsItem [" + "id=" + id + ", pricingScheme=" + pricingScheme
                + ", prices=" + prices + "]";
    }

    /**
     * Builds a new {@link BulkUpdateSegmentsItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BulkUpdateSegmentsItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, pricingScheme, prices);
        return builder;
    }

    /**
     * Class to build instances of {@link BulkUpdateSegmentsItem}.
     */
    public static class Builder {
        private int id;
        private String pricingScheme;
        private List<CreateOrUpdateSegmentPrice> prices;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  int value for id.
         * @param  pricingScheme  String value for pricingScheme.
         * @param  prices  List of CreateOrUpdateSegmentPrice value for prices.
         */
        public Builder(int id, String pricingScheme, List<CreateOrUpdateSegmentPrice> prices) {
            this.id = id;
            this.pricingScheme = pricingScheme;
            this.prices = prices;
        }

        /**
         * Setter for id.
         * @param  id  int value for id.
         * @return Builder
         */
        public Builder id(int id) {
            this.id = id;
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
         * @param  prices  List of CreateOrUpdateSegmentPrice value for prices.
         * @return Builder
         */
        public Builder prices(List<CreateOrUpdateSegmentPrice> prices) {
            this.prices = prices;
            return this;
        }

        /**
         * Builds a new {@link BulkUpdateSegmentsItem} object using the set fields.
         * @return {@link BulkUpdateSegmentsItem}
         */
        public BulkUpdateSegmentsItem build() {
            return new BulkUpdateSegmentsItem(id, pricingScheme, prices);
        }
    }
}
