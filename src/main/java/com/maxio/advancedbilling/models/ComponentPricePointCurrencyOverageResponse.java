/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for ComponentPricePointCurrencyOverageResponse type.
 */
public class ComponentPricePointCurrencyOverageResponse
        extends BaseModel {
    private CurrencyOveragePrices pricePoint;

    /**
     * Default constructor.
     */
    public ComponentPricePointCurrencyOverageResponse() {
    }

    /**
     * Initialization constructor.
     * @param  pricePoint  CurrencyOveragePrices value for pricePoint.
     */
    public ComponentPricePointCurrencyOverageResponse(
            CurrencyOveragePrices pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Getter for PricePoint.
     * Extends a component price point with currency overage prices.
     * @return Returns the CurrencyOveragePrices
     */
    @JsonGetter("price_point")
    public CurrencyOveragePrices getPricePoint() {
        return pricePoint;
    }

    /**
     * Setter for PricePoint.
     * Extends a component price point with currency overage prices.
     * @param pricePoint Value for CurrencyOveragePrices
     */
    @JsonSetter("price_point")
    public void setPricePoint(CurrencyOveragePrices pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Converts this ComponentPricePointCurrencyOverageResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ComponentPricePointCurrencyOverageResponse [" + "pricePoint=" + pricePoint
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ComponentPricePointCurrencyOverageResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ComponentPricePointCurrencyOverageResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(pricePoint);
        return builder;
    }

    /**
     * Class to build instances of {@link ComponentPricePointCurrencyOverageResponse}.
     */
    public static class Builder {
        private CurrencyOveragePrices pricePoint;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  pricePoint  CurrencyOveragePrices value for pricePoint.
         */
        public Builder(CurrencyOveragePrices pricePoint) {
            this.pricePoint = pricePoint;
        }

        /**
         * Setter for pricePoint.
         * @param  pricePoint  CurrencyOveragePrices value for pricePoint.
         * @return Builder
         */
        public Builder pricePoint(CurrencyOveragePrices pricePoint) {
            this.pricePoint = pricePoint;
            return this;
        }

        /**
         * Builds a new {@link ComponentPricePointCurrencyOverageResponse} object using the set
         * fields.
         * @return {@link ComponentPricePointCurrencyOverageResponse}
         */
        public ComponentPricePointCurrencyOverageResponse build() {
            return new ComponentPricePointCurrencyOverageResponse(pricePoint);
        }
    }
}
