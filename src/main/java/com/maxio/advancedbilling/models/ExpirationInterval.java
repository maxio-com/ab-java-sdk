/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;



/**
 * This is a model class for ExpirationInterval type.
 */
public class ExpirationInterval {

    /**
     * Default constructor.
     */
    public ExpirationInterval() {
    }

    /**
     * Converts this ExpirationInterval into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ExpirationInterval [" + "]";
    }

    /**
     * Builds a new {@link ExpirationInterval.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ExpirationInterval.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        return builder;
    }

    /**
     * Class to build instances of {@link ExpirationInterval}.
     */
    public static class Builder {






        /**
         * Builds a new {@link ExpirationInterval} object using the set fields.
         * @return {@link ExpirationInterval}
         */
        public ExpirationInterval build() {
            return new ExpirationInterval();
        }
    }
}
