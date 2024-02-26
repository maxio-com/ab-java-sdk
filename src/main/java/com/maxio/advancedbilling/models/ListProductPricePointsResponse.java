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
 * This is a model class for ListProductPricePointsResponse type.
 */
public class ListProductPricePointsResponse {
    private List<ProductPricePoint> pricePoints;

    /**
     * Default constructor.
     */
    public ListProductPricePointsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  pricePoints  List of ProductPricePoint value for pricePoints.
     */
    public ListProductPricePointsResponse(
            List<ProductPricePoint> pricePoints) {
        this.pricePoints = pricePoints;
    }

    /**
     * Getter for PricePoints.
     * @return Returns the List of ProductPricePoint
     */
    @JsonGetter("price_points")
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
     * Converts this ListProductPricePointsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListProductPricePointsResponse [" + "pricePoints=" + pricePoints + "]";
    }

    /**
     * Builds a new {@link ListProductPricePointsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListProductPricePointsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(pricePoints);
        return builder;
    }

    /**
     * Class to build instances of {@link ListProductPricePointsResponse}.
     */
    public static class Builder {
        private List<ProductPricePoint> pricePoints;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  pricePoints  List of ProductPricePoint value for pricePoints.
         */
        public Builder(List<ProductPricePoint> pricePoints) {
            this.pricePoints = pricePoints;
        }

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
         * Builds a new {@link ListProductPricePointsResponse} object using the set fields.
         * @return {@link ListProductPricePointsResponse}
         */
        public ListProductPricePointsResponse build() {
            return new ListProductPricePointsResponse(pricePoints);
        }
    }
}
