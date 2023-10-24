/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;



/**
 * This is a model class for PriceInCents type.
 */
public class PriceInCents {

    /**
     * Default constructor.
     */
    public PriceInCents() {
    }

    /**
     * Converts this PriceInCents into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PriceInCents [" + "]";
    }

    /**
     * Builds a new {@link PriceInCents.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PriceInCents.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        return builder;
    }

    /**
     * Class to build instances of {@link PriceInCents}.
     */
    public static class Builder {






        /**
         * Builds a new {@link PriceInCents} object using the set fields.
         * @return {@link PriceInCents}
         */
        public PriceInCents build() {
            return new PriceInCents();
        }
    }
}
