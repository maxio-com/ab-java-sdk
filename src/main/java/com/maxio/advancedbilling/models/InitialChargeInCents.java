/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;



/**
 * This is a model class for InitialChargeInCents type.
 */
public class InitialChargeInCents {

    /**
     * Default constructor.
     */
    public InitialChargeInCents() {
    }

    /**
     * Converts this InitialChargeInCents into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InitialChargeInCents [" + "]";
    }

    /**
     * Builds a new {@link InitialChargeInCents.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InitialChargeInCents.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        return builder;
    }

    /**
     * Class to build instances of {@link InitialChargeInCents}.
     */
    public static class Builder {






        /**
         * Builds a new {@link InitialChargeInCents} object using the set fields.
         * @return {@link InitialChargeInCents}
         */
        public InitialChargeInCents build() {
            return new InitialChargeInCents();
        }
    }
}
