/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;



/**
 * This is a model class for ProductId type.
 */
public class ProductId {

    /**
     * Default constructor.
     */
    public ProductId() {
    }

    /**
     * Converts this ProductId into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProductId [" + "]";
    }

    /**
     * Builds a new {@link ProductId.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProductId.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        return builder;
    }

    /**
     * Class to build instances of {@link ProductId}.
     */
    public static class Builder {






        /**
         * Builds a new {@link ProductId} object using the set fields.
         * @return {@link ProductId}
         */
        public ProductId build() {
            return new ProductId();
        }
    }
}
