/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;



/**
 * This is a model class for AmountCreateInvoiceCoupon type.
 */
public class AmountCreateInvoiceCoupon {

    /**
     * Default constructor.
     */
    public AmountCreateInvoiceCoupon() {
    }

    /**
     * Converts this AmountCreateInvoiceCoupon into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AmountCreateInvoiceCoupon [" + "]";
    }

    /**
     * Builds a new {@link AmountCreateInvoiceCoupon.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AmountCreateInvoiceCoupon.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        return builder;
    }

    /**
     * Class to build instances of {@link AmountCreateInvoiceCoupon}.
     */
    public static class Builder {






        /**
         * Builds a new {@link AmountCreateInvoiceCoupon} object using the set fields.
         * @return {@link AmountCreateInvoiceCoupon}
         */
        public AmountCreateInvoiceCoupon build() {
            return new AmountCreateInvoiceCoupon();
        }
    }
}
