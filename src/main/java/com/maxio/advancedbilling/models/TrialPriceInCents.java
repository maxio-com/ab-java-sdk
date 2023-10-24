/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;



/**
 * This is a model class for TrialPriceInCents type.
 */
public class TrialPriceInCents {

    /**
     * Default constructor.
     */
    public TrialPriceInCents() {
    }

    /**
     * Converts this TrialPriceInCents into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TrialPriceInCents [" + "]";
    }

    /**
     * Builds a new {@link TrialPriceInCents.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TrialPriceInCents.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        return builder;
    }

    /**
     * Class to build instances of {@link TrialPriceInCents}.
     */
    public static class Builder {






        /**
         * Builds a new {@link TrialPriceInCents} object using the set fields.
         * @return {@link TrialPriceInCents}
         */
        public TrialPriceInCents build() {
            return new TrialPriceInCents();
        }
    }
}
