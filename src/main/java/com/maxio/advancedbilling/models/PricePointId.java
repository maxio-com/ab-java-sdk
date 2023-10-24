/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;



/**
 * This is a model class for PricePointId type.
 */
public class PricePointId {

    /**
     * Default constructor.
     */
    public PricePointId() {
    }

    /**
     * Converts this PricePointId into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PricePointId [" + "]";
    }

    /**
     * Builds a new {@link PricePointId.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PricePointId.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        return builder;
    }

    /**
     * Class to build instances of {@link PricePointId}.
     */
    public static class Builder {






        /**
         * Builds a new {@link PricePointId} object using the set fields.
         * @return {@link PricePointId}
         */
        public PricePointId build() {
            return new PricePointId();
        }
    }
}
