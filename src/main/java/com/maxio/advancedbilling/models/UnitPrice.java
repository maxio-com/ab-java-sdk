/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;



/**
 * This is a model class for UnitPrice type.
 */
public class UnitPrice {

    /**
     * Default constructor.
     */
    public UnitPrice() {
    }

    /**
     * Converts this UnitPrice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UnitPrice [" + "]";
    }

    /**
     * Builds a new {@link UnitPrice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UnitPrice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        return builder;
    }

    /**
     * Class to build instances of {@link UnitPrice}.
     */
    public static class Builder {






        /**
         * Builds a new {@link UnitPrice} object using the set fields.
         * @return {@link UnitPrice}
         */
        public UnitPrice build() {
            return new UnitPrice();
        }
    }
}
