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

/**
 * This is a model class for ListProductsFilter type.
 */
public class ListProductsFilter
        extends BaseModel {
    private PrepaidProductPricePointFilter prepaidProductPricePoint;
    private Boolean useSiteExchangeRate;

    /**
     * Default constructor.
     */
    public ListProductsFilter() {
    }

    /**
     * Initialization constructor.
     * @param  prepaidProductPricePoint  PrepaidProductPricePointFilter value for
     *         prepaidProductPricePoint.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     */
    public ListProductsFilter(
            PrepaidProductPricePointFilter prepaidProductPricePoint,
            Boolean useSiteExchangeRate) {
        this.prepaidProductPricePoint = prepaidProductPricePoint;
        this.useSiteExchangeRate = useSiteExchangeRate;
    }

    /**
     * Getter for PrepaidProductPricePoint.
     * Allows fetching products only if a prepaid product price point is present or not. To use this
     * filter you also have to include the following param in the request
     * `include=prepaid_product_price_point`. Use in query
     * `filter[prepaid_product_price_point][product_price_point_id]=not_null`.
     * @return Returns the PrepaidProductPricePointFilter
     */
    @JsonGetter("prepaid_product_price_point")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PrepaidProductPricePointFilter getPrepaidProductPricePoint() {
        return prepaidProductPricePoint;
    }

    /**
     * Setter for PrepaidProductPricePoint.
     * Allows fetching products only if a prepaid product price point is present or not. To use this
     * filter you also have to include the following param in the request
     * `include=prepaid_product_price_point`. Use in query
     * `filter[prepaid_product_price_point][product_price_point_id]=not_null`.
     * @param prepaidProductPricePoint Value for PrepaidProductPricePointFilter
     */
    @JsonSetter("prepaid_product_price_point")
    public void setPrepaidProductPricePoint(PrepaidProductPricePointFilter prepaidProductPricePoint) {
        this.prepaidProductPricePoint = prepaidProductPricePoint;
    }

    /**
     * Getter for UseSiteExchangeRate.
     * Allows fetching products with matching use_site_exchange_rate based on provided value (refers
     * to default price point). Use in query `filter[use_site_exchange_rate]=true`.
     * @return Returns the Boolean
     */
    @JsonGetter("use_site_exchange_rate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getUseSiteExchangeRate() {
        return useSiteExchangeRate;
    }

    /**
     * Setter for UseSiteExchangeRate.
     * Allows fetching products with matching use_site_exchange_rate based on provided value (refers
     * to default price point). Use in query `filter[use_site_exchange_rate]=true`.
     * @param useSiteExchangeRate Value for Boolean
     */
    @JsonSetter("use_site_exchange_rate")
    public void setUseSiteExchangeRate(Boolean useSiteExchangeRate) {
        this.useSiteExchangeRate = useSiteExchangeRate;
    }

    /**
     * Converts this ListProductsFilter into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListProductsFilter [" + "prepaidProductPricePoint=" + prepaidProductPricePoint
                + ", useSiteExchangeRate=" + useSiteExchangeRate + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ListProductsFilter.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListProductsFilter.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .prepaidProductPricePoint(getPrepaidProductPricePoint())
                .useSiteExchangeRate(getUseSiteExchangeRate());
        return builder;
    }

    /**
     * Class to build instances of {@link ListProductsFilter}.
     */
    public static class Builder {
        private PrepaidProductPricePointFilter prepaidProductPricePoint;
        private Boolean useSiteExchangeRate;



        /**
         * Setter for prepaidProductPricePoint.
         * @param  prepaidProductPricePoint  PrepaidProductPricePointFilter value for
         *         prepaidProductPricePoint.
         * @return Builder
         */
        public Builder prepaidProductPricePoint(
                PrepaidProductPricePointFilter prepaidProductPricePoint) {
            this.prepaidProductPricePoint = prepaidProductPricePoint;
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
         * Builds a new {@link ListProductsFilter} object using the set fields.
         * @return {@link ListProductsFilter}
         */
        public ListProductsFilter build() {
            return new ListProductsFilter(prepaidProductPricePoint, useSiteExchangeRate);
        }
    }
}
