/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;



/**
 * This is a model class for Coupon type.
 */
public class Coupon {

    /**
     * Default constructor.
     */
    public Coupon() {
    }

    /**
     * Converts this Coupon into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Coupon [" + "]";
    }

    /**
     * Builds a new {@link Coupon.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Coupon.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        return builder;
    }

    /**
     * Class to build instances of {@link Coupon}.
     */
    public static class Builder {






        /**
         * Builds a new {@link Coupon} object using the set fields.
         * @return {@link Coupon}
         */
        public Coupon build() {
            return new Coupon();
        }
    }
}
