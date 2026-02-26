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
 * This is a model class for CloneComponentPricePointRequest type.
 */
public class CloneComponentPricePointRequest
        extends BaseModel {
    private CloneComponentPricePoint pricePoint;

    /**
     * Default constructor.
     */
    public CloneComponentPricePointRequest() {
    }

    /**
     * Initialization constructor.
     * @param  pricePoint  CloneComponentPricePoint value for pricePoint.
     */
    public CloneComponentPricePointRequest(
            CloneComponentPricePoint pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Getter for PricePoint.
     * @return Returns the CloneComponentPricePoint
     */
    @JsonGetter("price_point")
    public CloneComponentPricePoint getPricePoint() {
        return pricePoint;
    }

    /**
     * Setter for PricePoint.
     * @param pricePoint Value for CloneComponentPricePoint
     */
    @JsonSetter("price_point")
    public void setPricePoint(CloneComponentPricePoint pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Converts this CloneComponentPricePointRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CloneComponentPricePointRequest [" + "pricePoint=" + pricePoint
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CloneComponentPricePointRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CloneComponentPricePointRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(pricePoint);
        return builder;
    }

    /**
     * Class to build instances of {@link CloneComponentPricePointRequest}.
     */
    public static class Builder {
        private CloneComponentPricePoint pricePoint;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  pricePoint  CloneComponentPricePoint value for pricePoint.
         */
        public Builder(CloneComponentPricePoint pricePoint) {
            this.pricePoint = pricePoint;
        }

        /**
         * Setter for pricePoint.
         * @param  pricePoint  CloneComponentPricePoint value for pricePoint.
         * @return Builder
         */
        public Builder pricePoint(CloneComponentPricePoint pricePoint) {
            this.pricePoint = pricePoint;
            return this;
        }

        /**
         * Builds a new {@link CloneComponentPricePointRequest} object using the set fields.
         * @return {@link CloneComponentPricePointRequest}
         */
        public CloneComponentPricePointRequest build() {
            return new CloneComponentPricePointRequest(pricePoint);
        }
    }
}
