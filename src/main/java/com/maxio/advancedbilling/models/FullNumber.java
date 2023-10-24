/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;



/**
 * This is a model class for FullNumber type.
 */
public class FullNumber {

    /**
     * Default constructor.
     */
    public FullNumber() {
    }

    /**
     * Converts this FullNumber into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FullNumber [" + "]";
    }

    /**
     * Builds a new {@link FullNumber.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FullNumber.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        return builder;
    }

    /**
     * Class to build instances of {@link FullNumber}.
     */
    public static class Builder {






        /**
         * Builds a new {@link FullNumber} object using the set fields.
         * @return {@link FullNumber}
         */
        public FullNumber build() {
            return new FullNumber();
        }
    }
}
