/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UpdateProductPricePointRequest type.
 */
public class UpdateProductPricePointRequest {
    private UpdateProductPricePoint pricePoint;

    /**
     * Default constructor.
     */
    public UpdateProductPricePointRequest() {
    }

    /**
     * Initialization constructor.
     * @param  pricePoint  UpdateProductPricePoint value for pricePoint.
     */
    public UpdateProductPricePointRequest(
            UpdateProductPricePoint pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Getter for PricePoint.
     * @return Returns the UpdateProductPricePoint
     */
    @JsonGetter("price_point")
    public UpdateProductPricePoint getPricePoint() {
        return pricePoint;
    }

    /**
     * Setter for PricePoint.
     * @param pricePoint Value for UpdateProductPricePoint
     */
    @JsonSetter("price_point")
    public void setPricePoint(UpdateProductPricePoint pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Converts this UpdateProductPricePointRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateProductPricePointRequest [" + "pricePoint=" + pricePoint + "]";
    }

    /**
     * Builds a new {@link UpdateProductPricePointRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateProductPricePointRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(pricePoint);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateProductPricePointRequest}.
     */
    public static class Builder {
        private UpdateProductPricePoint pricePoint;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  pricePoint  UpdateProductPricePoint value for pricePoint.
         */
        public Builder(UpdateProductPricePoint pricePoint) {
            this.pricePoint = pricePoint;
        }

        /**
         * Setter for pricePoint.
         * @param  pricePoint  UpdateProductPricePoint value for pricePoint.
         * @return Builder
         */
        public Builder pricePoint(UpdateProductPricePoint pricePoint) {
            this.pricePoint = pricePoint;
            return this;
        }

        /**
         * Builds a new {@link UpdateProductPricePointRequest} object using the set fields.
         * @return {@link UpdateProductPricePointRequest}
         */
        public UpdateProductPricePointRequest build() {
            return new UpdateProductPricePointRequest(pricePoint);
        }
    }
}
