/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;



/**
 * This is a model class for Quantity type.
 */
public class Quantity {

    /**
     * Default constructor.
     */
    public Quantity() {
    }

    /**
     * Converts this Quantity into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Quantity [" + "]";
    }

    /**
     * Builds a new {@link Quantity.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Quantity.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        return builder;
    }

    /**
     * Class to build instances of {@link Quantity}.
     */
    public static class Builder {






        /**
         * Builds a new {@link Quantity} object using the set fields.
         * @return {@link Quantity}
         */
        public Quantity build() {
            return new Quantity();
        }
    }
}
