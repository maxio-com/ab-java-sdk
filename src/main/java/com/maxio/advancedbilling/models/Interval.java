/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;



/**
 * This is a model class for Interval type.
 */
public class Interval {

    /**
     * Default constructor.
     */
    public Interval() {
    }

    /**
     * Converts this Interval into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Interval [" + "]";
    }

    /**
     * Builds a new {@link Interval.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Interval.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        return builder;
    }

    /**
     * Class to build instances of {@link Interval}.
     */
    public static class Builder {






        /**
         * Builds a new {@link Interval} object using the set fields.
         * @return {@link Interval}
         */
        public Interval build() {
            return new Interval();
        }
    }
}
