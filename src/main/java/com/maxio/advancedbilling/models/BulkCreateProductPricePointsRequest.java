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
 * This is a model class for BulkCreateProductPricePointsRequest type.
 */
public class BulkCreateProductPricePointsRequest {
    private List<CreateProductPricePoint> pricePoints;

    /**
     * Default constructor.
     */
    public BulkCreateProductPricePointsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  pricePoints  List of CreateProductPricePoint value for pricePoints.
     */
    public BulkCreateProductPricePointsRequest(
            List<CreateProductPricePoint> pricePoints) {
        this.pricePoints = pricePoints;
    }

    /**
     * Getter for PricePoints.
     * @return Returns the List of CreateProductPricePoint
     */
    @JsonGetter("price_points")
    public List<CreateProductPricePoint> getPricePoints() {
        return pricePoints;
    }

    /**
     * Setter for PricePoints.
     * @param pricePoints Value for List of CreateProductPricePoint
     */
    @JsonSetter("price_points")
    public void setPricePoints(List<CreateProductPricePoint> pricePoints) {
        this.pricePoints = pricePoints;
    }

    /**
     * Converts this BulkCreateProductPricePointsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BulkCreateProductPricePointsRequest [" + "pricePoints=" + pricePoints + "]";
    }

    /**
     * Builds a new {@link BulkCreateProductPricePointsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BulkCreateProductPricePointsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(pricePoints);
        return builder;
    }

    /**
     * Class to build instances of {@link BulkCreateProductPricePointsRequest}.
     */
    public static class Builder {
        private List<CreateProductPricePoint> pricePoints;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  pricePoints  List of CreateProductPricePoint value for pricePoints.
         */
        public Builder(List<CreateProductPricePoint> pricePoints) {
            this.pricePoints = pricePoints;
        }

        /**
         * Setter for pricePoints.
         * @param  pricePoints  List of CreateProductPricePoint value for pricePoints.
         * @return Builder
         */
        public Builder pricePoints(List<CreateProductPricePoint> pricePoints) {
            this.pricePoints = pricePoints;
            return this;
        }

        /**
         * Builds a new {@link BulkCreateProductPricePointsRequest} object using the set fields.
         * @return {@link BulkCreateProductPricePointsRequest}
         */
        public BulkCreateProductPricePointsRequest build() {
            return new BulkCreateProductPricePointsRequest(pricePoints);
        }
    }
}
