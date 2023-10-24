/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;



/**
 * This is a model class for EndingQuantity type.
 */
public class EndingQuantity {

    /**
     * Default constructor.
     */
    public EndingQuantity() {
    }

    /**
     * Converts this EndingQuantity into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EndingQuantity [" + "]";
    }

    /**
     * Builds a new {@link EndingQuantity.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EndingQuantity.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        return builder;
    }

    /**
     * Class to build instances of {@link EndingQuantity}.
     */
    public static class Builder {






        /**
         * Builds a new {@link EndingQuantity} object using the set fields.
         * @return {@link EndingQuantity}
         */
        public EndingQuantity build() {
            return new EndingQuantity();
        }
    }
}
