/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreateProductPricePointRequest type.
 */
public class CreateProductPricePointRequest {
    private CreateProductPricePoint pricePoint;

    /**
     * Default constructor.
     */
    public CreateProductPricePointRequest() {
    }

    /**
     * Initialization constructor.
     * @param  pricePoint  CreateProductPricePoint value for pricePoint.
     */
    public CreateProductPricePointRequest(
            CreateProductPricePoint pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Getter for PricePoint.
     * @return Returns the CreateProductPricePoint
     */
    @JsonGetter("price_point")
    public CreateProductPricePoint getPricePoint() {
        return pricePoint;
    }

    /**
     * Setter for PricePoint.
     * @param pricePoint Value for CreateProductPricePoint
     */
    @JsonSetter("price_point")
    public void setPricePoint(CreateProductPricePoint pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Converts this CreateProductPricePointRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateProductPricePointRequest [" + "pricePoint=" + pricePoint + "]";
    }

    /**
     * Builds a new {@link CreateProductPricePointRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateProductPricePointRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(pricePoint);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateProductPricePointRequest}.
     */
    public static class Builder {
        private CreateProductPricePoint pricePoint;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  pricePoint  CreateProductPricePoint value for pricePoint.
         */
        public Builder(CreateProductPricePoint pricePoint) {
            this.pricePoint = pricePoint;
        }

        /**
         * Setter for pricePoint.
         * @param  pricePoint  CreateProductPricePoint value for pricePoint.
         * @return Builder
         */
        public Builder pricePoint(CreateProductPricePoint pricePoint) {
            this.pricePoint = pricePoint;
            return this;
        }

        /**
         * Builds a new {@link CreateProductPricePointRequest} object using the set fields.
         * @return {@link CreateProductPricePointRequest}
         */
        public CreateProductPricePointRequest build() {
            return new CreateProductPricePointRequest(pricePoint);
        }
    }
}
