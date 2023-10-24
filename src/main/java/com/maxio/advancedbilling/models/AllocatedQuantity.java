/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;



/**
 * This is a model class for AllocatedQuantity type.
 */
public class AllocatedQuantity {

    /**
     * Default constructor.
     */
    public AllocatedQuantity() {
    }

    /**
     * Converts this AllocatedQuantity into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AllocatedQuantity [" + "]";
    }

    /**
     * Builds a new {@link AllocatedQuantity.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AllocatedQuantity.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        return builder;
    }

    /**
     * Class to build instances of {@link AllocatedQuantity}.
     */
    public static class Builder {






        /**
         * Builds a new {@link AllocatedQuantity} object using the set fields.
         * @return {@link AllocatedQuantity}
         */
        public AllocatedQuantity build() {
            return new AllocatedQuantity();
        }
    }
}
