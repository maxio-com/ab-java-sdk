/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;



/**
 * This is a model class for AmountCreateMultiInvoicePayment type.
 */
public class AmountCreateMultiInvoicePayment {

    /**
     * Default constructor.
     */
    public AmountCreateMultiInvoicePayment() {
    }

    /**
     * Converts this AmountCreateMultiInvoicePayment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AmountCreateMultiInvoicePayment [" + "]";
    }

    /**
     * Builds a new {@link AmountCreateMultiInvoicePayment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AmountCreateMultiInvoicePayment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        return builder;
    }

    /**
     * Class to build instances of {@link AmountCreateMultiInvoicePayment}.
     */
    public static class Builder {






        /**
         * Builds a new {@link AmountCreateMultiInvoicePayment} object using the set fields.
         * @return {@link AmountCreateMultiInvoicePayment}
         */
        public AmountCreateMultiInvoicePayment build() {
            return new AmountCreateMultiInvoicePayment();
        }
    }
}
