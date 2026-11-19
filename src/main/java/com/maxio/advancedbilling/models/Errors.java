/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for Errors type.
 */
public class Errors
        extends BaseModel {
    private List<String> pricePoint;

    /**
     * Default constructor.
     */
    public Errors() {
    }

    /**
     * Initialization constructor.
     * @param  pricePoint  List of String value for pricePoint.
     */
    public Errors(
            List<String> pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Getter for PricePoint.
     * @return Returns the List of String
     */
    @JsonGetter("price_point")
    public List<String> getPricePoint() {
        return pricePoint;
    }

    /**
     * Setter for PricePoint.
     * @param pricePoint Value for List of String
     */
    @JsonSetter("price_point")
    public void setPricePoint(List<String> pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Converts this Errors into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Errors [" + "pricePoint=" + pricePoint + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Errors.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Errors.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(pricePoint);
        return builder;
    }

    /**
     * Class to build instances of {@link Errors}.
     */
    public static class Builder {
        private List<String> pricePoint;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  pricePoint  List of String value for pricePoint.
         */
        public Builder(List<String> pricePoint) {
            this.pricePoint = pricePoint;
        }

        /**
         * Setter for pricePoint.
         * @param  pricePoint  List of String value for pricePoint.
         * @return Builder
         */
        public Builder pricePoint(List<String> pricePoint) {
            this.pricePoint = pricePoint;
            return this;
        }

        /**
         * Builds a new {@link Errors} object using the set fields.
         * @return {@link Errors}
         */
        public Errors build() {
            return new Errors(pricePoint);
        }
    }
}
