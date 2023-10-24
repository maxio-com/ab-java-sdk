/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.CreateComponentPricePointRequestPricePoint;

/**
 * This is a model class for CreateComponentPricePointRequest type.
 */
public class CreateComponentPricePointRequest {
    private CreateComponentPricePointRequestPricePoint pricePoint;

    /**
     * Default constructor.
     */
    public CreateComponentPricePointRequest() {
    }

    /**
     * Initialization constructor.
     * @param  pricePoint  CreateComponentPricePointRequestPricePoint value for pricePoint.
     */
    public CreateComponentPricePointRequest(
            CreateComponentPricePointRequestPricePoint pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Getter for PricePoint.
     * @return Returns the CreateComponentPricePointRequestPricePoint
     */
    @JsonGetter("price_point")
    public CreateComponentPricePointRequestPricePoint getPricePoint() {
        return pricePoint;
    }

    /**
     * Setter for PricePoint.
     * @param pricePoint Value for CreateComponentPricePointRequestPricePoint
     */
    @JsonSetter("price_point")
    public void setPricePoint(CreateComponentPricePointRequestPricePoint pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Converts this CreateComponentPricePointRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateComponentPricePointRequest [" + "pricePoint=" + pricePoint + "]";
    }

    /**
     * Builds a new {@link CreateComponentPricePointRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateComponentPricePointRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(pricePoint);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateComponentPricePointRequest}.
     */
    public static class Builder {
        private CreateComponentPricePointRequestPricePoint pricePoint;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  pricePoint  CreateComponentPricePointRequestPricePoint value for pricePoint.
         */
        public Builder(CreateComponentPricePointRequestPricePoint pricePoint) {
            this.pricePoint = pricePoint;
        }

        /**
         * Setter for pricePoint.
         * @param  pricePoint  CreateComponentPricePointRequestPricePoint value for pricePoint.
         * @return Builder
         */
        public Builder pricePoint(CreateComponentPricePointRequestPricePoint pricePoint) {
            this.pricePoint = pricePoint;
            return this;
        }

        /**
         * Builds a new {@link CreateComponentPricePointRequest} object using the set fields.
         * @return {@link CreateComponentPricePointRequest}
         */
        public CreateComponentPricePointRequest build() {
            return new CreateComponentPricePointRequest(pricePoint);
        }
    }
}
