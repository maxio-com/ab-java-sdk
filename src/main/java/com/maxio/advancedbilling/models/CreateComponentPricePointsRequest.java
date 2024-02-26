/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.CreateComponentPricePointsRequestPricePoints;
import java.util.List;

/**
 * This is a model class for CreateComponentPricePointsRequest type.
 */
public class CreateComponentPricePointsRequest {
    private List<CreateComponentPricePointsRequestPricePoints> pricePoints;

    /**
     * Default constructor.
     */
    public CreateComponentPricePointsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  pricePoints  List of CreateComponentPricePointsRequestPricePoints value for
     *         pricePoints.
     */
    public CreateComponentPricePointsRequest(
            List<CreateComponentPricePointsRequestPricePoints> pricePoints) {
        this.pricePoints = pricePoints;
    }

    /**
     * Getter for PricePoints.
     * @return Returns the List of CreateComponentPricePointsRequestPricePoints
     */
    @JsonGetter("price_points")
    public List<CreateComponentPricePointsRequestPricePoints> getPricePoints() {
        return pricePoints;
    }

    /**
     * Setter for PricePoints.
     * @param pricePoints Value for List of CreateComponentPricePointsRequestPricePoints
     */
    @JsonSetter("price_points")
    public void setPricePoints(List<CreateComponentPricePointsRequestPricePoints> pricePoints) {
        this.pricePoints = pricePoints;
    }

    /**
     * Converts this CreateComponentPricePointsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateComponentPricePointsRequest [" + "pricePoints=" + pricePoints + "]";
    }

    /**
     * Builds a new {@link CreateComponentPricePointsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateComponentPricePointsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(pricePoints);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateComponentPricePointsRequest}.
     */
    public static class Builder {
        private List<CreateComponentPricePointsRequestPricePoints> pricePoints;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  pricePoints  List of CreateComponentPricePointsRequestPricePoints value for
         *         pricePoints.
         */
        public Builder(List<CreateComponentPricePointsRequestPricePoints> pricePoints) {
            this.pricePoints = pricePoints;
        }

        /**
         * Setter for pricePoints.
         * @param  pricePoints  List of CreateComponentPricePointsRequestPricePoints value for
         *         pricePoints.
         * @return Builder
         */
        public Builder pricePoints(
                List<CreateComponentPricePointsRequestPricePoints> pricePoints) {
            this.pricePoints = pricePoints;
            return this;
        }

        /**
         * Builds a new {@link CreateComponentPricePointsRequest} object using the set fields.
         * @return {@link CreateComponentPricePointsRequest}
         */
        public CreateComponentPricePointsRequest build() {
            return new CreateComponentPricePointsRequest(pricePoints);
        }
    }
}
