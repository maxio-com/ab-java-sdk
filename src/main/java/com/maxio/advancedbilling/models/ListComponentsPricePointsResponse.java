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
 * This is a model class for ListComponentsPricePointsResponse type.
 */
public class ListComponentsPricePointsResponse {
    private List<ComponentPricePoint> pricePoints;

    /**
     * Default constructor.
     */
    public ListComponentsPricePointsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  pricePoints  List of ComponentPricePoint value for pricePoints.
     */
    public ListComponentsPricePointsResponse(
            List<ComponentPricePoint> pricePoints) {
        this.pricePoints = pricePoints;
    }

    /**
     * Getter for PricePoints.
     * @return Returns the List of ComponentPricePoint
     */
    @JsonGetter("price_points")
    public List<ComponentPricePoint> getPricePoints() {
        return pricePoints;
    }

    /**
     * Setter for PricePoints.
     * @param pricePoints Value for List of ComponentPricePoint
     */
    @JsonSetter("price_points")
    public void setPricePoints(List<ComponentPricePoint> pricePoints) {
        this.pricePoints = pricePoints;
    }

    /**
     * Converts this ListComponentsPricePointsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListComponentsPricePointsResponse [" + "pricePoints=" + pricePoints + "]";
    }

    /**
     * Builds a new {@link ListComponentsPricePointsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListComponentsPricePointsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(pricePoints);
        return builder;
    }

    /**
     * Class to build instances of {@link ListComponentsPricePointsResponse}.
     */
    public static class Builder {
        private List<ComponentPricePoint> pricePoints;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  pricePoints  List of ComponentPricePoint value for pricePoints.
         */
        public Builder(List<ComponentPricePoint> pricePoints) {
            this.pricePoints = pricePoints;
        }

        /**
         * Setter for pricePoints.
         * @param  pricePoints  List of ComponentPricePoint value for pricePoints.
         * @return Builder
         */
        public Builder pricePoints(List<ComponentPricePoint> pricePoints) {
            this.pricePoints = pricePoints;
            return this;
        }

        /**
         * Builds a new {@link ListComponentsPricePointsResponse} object using the set fields.
         * @return {@link ListComponentsPricePointsResponse}
         */
        public ListComponentsPricePointsResponse build() {
            return new ListComponentsPricePointsResponse(pricePoints);
        }
    }
}
