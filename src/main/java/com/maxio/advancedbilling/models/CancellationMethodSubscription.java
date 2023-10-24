/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;



/**
 * This is a model class for CancellationMethodSubscription type.
 */
public class CancellationMethodSubscription {

    /**
     * Default constructor.
     */
    public CancellationMethodSubscription() {
    }

    /**
     * Converts this CancellationMethodSubscription into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CancellationMethodSubscription [" + "]";
    }

    /**
     * Builds a new {@link CancellationMethodSubscription.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CancellationMethodSubscription.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        return builder;
    }

    /**
     * Class to build instances of {@link CancellationMethodSubscription}.
     */
    public static class Builder {






        /**
         * Builds a new {@link CancellationMethodSubscription} object using the set fields.
         * @return {@link CancellationMethodSubscription}
         */
        public CancellationMethodSubscription build() {
            return new CancellationMethodSubscription();
        }
    }
}
