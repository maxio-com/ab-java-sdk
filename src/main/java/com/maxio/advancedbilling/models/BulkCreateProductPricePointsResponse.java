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
 * This is a model class for BulkCreateProductPricePointsResponse type.
 */
public class BulkCreateProductPricePointsResponse {
    private List<ProductPricePoint> pricePoints;

    /**
     * Default constructor.
     */
    public BulkCreateProductPricePointsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  pricePoints  List of ProductPricePoint value for pricePoints.
     */
    public BulkCreateProductPricePointsResponse(
            List<ProductPricePoint> pricePoints) {
        this.pricePoints = pricePoints;
    }

    /**
     * Getter for PricePoints.
     * @return Returns the List of ProductPricePoint
     */
    @JsonGetter("price_points")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ProductPricePoint> getPricePoints() {
        return pricePoints;
    }

    /**
     * Setter for PricePoints.
     * @param pricePoints Value for List of ProductPricePoint
     */
    @JsonSetter("price_points")
    public void setPricePoints(List<ProductPricePoint> pricePoints) {
        this.pricePoints = pricePoints;
    }

    /**
     * Converts this BulkCreateProductPricePointsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BulkCreateProductPricePointsResponse [" + "pricePoints=" + pricePoints + "]";
    }

    /**
     * Builds a new {@link BulkCreateProductPricePointsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BulkCreateProductPricePointsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .pricePoints(getPricePoints());
        return builder;
    }

    /**
     * Class to build instances of {@link BulkCreateProductPricePointsResponse}.
     */
    public static class Builder {
        private List<ProductPricePoint> pricePoints;



        /**
         * Setter for pricePoints.
         * @param  pricePoints  List of ProductPricePoint value for pricePoints.
         * @return Builder
         */
        public Builder pricePoints(List<ProductPricePoint> pricePoints) {
            this.pricePoints = pricePoints;
            return this;
        }

        /**
         * Builds a new {@link BulkCreateProductPricePointsResponse} object using the set fields.
         * @return {@link BulkCreateProductPricePointsResponse}
         */
        public BulkCreateProductPricePointsResponse build() {
            return new BulkCreateProductPricePointsResponse(pricePoints);
        }
    }
}
