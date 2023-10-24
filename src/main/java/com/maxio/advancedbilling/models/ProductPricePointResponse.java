/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ProductPricePointResponse type.
 */
public class ProductPricePointResponse {
    private ProductPricePoint pricePoint;

    /**
     * Default constructor.
     */
    public ProductPricePointResponse() {
    }

    /**
     * Initialization constructor.
     * @param  pricePoint  ProductPricePoint value for pricePoint.
     */
    public ProductPricePointResponse(
            ProductPricePoint pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Getter for PricePoint.
     * @return Returns the ProductPricePoint
     */
    @JsonGetter("price_point")
    public ProductPricePoint getPricePoint() {
        return pricePoint;
    }

    /**
     * Setter for PricePoint.
     * @param pricePoint Value for ProductPricePoint
     */
    @JsonSetter("price_point")
    public void setPricePoint(ProductPricePoint pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Converts this ProductPricePointResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProductPricePointResponse [" + "pricePoint=" + pricePoint + "]";
    }

    /**
     * Builds a new {@link ProductPricePointResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProductPricePointResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(pricePoint);
        return builder;
    }

    /**
     * Class to build instances of {@link ProductPricePointResponse}.
     */
    public static class Builder {
        private ProductPricePoint pricePoint;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  pricePoint  ProductPricePoint value for pricePoint.
         */
        public Builder(ProductPricePoint pricePoint) {
            this.pricePoint = pricePoint;
        }

        /**
         * Setter for pricePoint.
         * @param  pricePoint  ProductPricePoint value for pricePoint.
         * @return Builder
         */
        public Builder pricePoint(ProductPricePoint pricePoint) {
            this.pricePoint = pricePoint;
            return this;
        }

        /**
         * Builds a new {@link ProductPricePointResponse} object using the set fields.
         * @return {@link ProductPricePointResponse}
         */
        public ProductPricePointResponse build() {
            return new ProductPricePointResponse(pricePoint);
        }
    }
}
