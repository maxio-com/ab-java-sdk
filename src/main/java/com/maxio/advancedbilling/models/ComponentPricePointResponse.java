/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ComponentPricePointResponse type.
 */
public class ComponentPricePointResponse {
    private ComponentPricePoint pricePoint;

    /**
     * Default constructor.
     */
    public ComponentPricePointResponse() {
    }

    /**
     * Initialization constructor.
     * @param  pricePoint  ComponentPricePoint value for pricePoint.
     */
    public ComponentPricePointResponse(
            ComponentPricePoint pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Getter for PricePoint.
     * @return Returns the ComponentPricePoint
     */
    @JsonGetter("price_point")
    public ComponentPricePoint getPricePoint() {
        return pricePoint;
    }

    /**
     * Setter for PricePoint.
     * @param pricePoint Value for ComponentPricePoint
     */
    @JsonSetter("price_point")
    public void setPricePoint(ComponentPricePoint pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Converts this ComponentPricePointResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ComponentPricePointResponse [" + "pricePoint=" + pricePoint + "]";
    }

    /**
     * Builds a new {@link ComponentPricePointResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ComponentPricePointResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(pricePoint);
        return builder;
    }

    /**
     * Class to build instances of {@link ComponentPricePointResponse}.
     */
    public static class Builder {
        private ComponentPricePoint pricePoint;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  pricePoint  ComponentPricePoint value for pricePoint.
         */
        public Builder(ComponentPricePoint pricePoint) {
            this.pricePoint = pricePoint;
        }

        /**
         * Setter for pricePoint.
         * @param  pricePoint  ComponentPricePoint value for pricePoint.
         * @return Builder
         */
        public Builder pricePoint(ComponentPricePoint pricePoint) {
            this.pricePoint = pricePoint;
            return this;
        }

        /**
         * Builds a new {@link ComponentPricePointResponse} object using the set fields.
         * @return {@link ComponentPricePointResponse}
         */
        public ComponentPricePointResponse build() {
            return new ComponentPricePointResponse(pricePoint);
        }
    }
}
