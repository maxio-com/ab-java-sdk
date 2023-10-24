/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;



/**
 * This is a model class for QuantityCreateInvoiceItem type.
 */
public class QuantityCreateInvoiceItem {

    /**
     * Default constructor.
     */
    public QuantityCreateInvoiceItem() {
    }

    /**
     * Converts this QuantityCreateInvoiceItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "QuantityCreateInvoiceItem [" + "]";
    }

    /**
     * Builds a new {@link QuantityCreateInvoiceItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link QuantityCreateInvoiceItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        return builder;
    }

    /**
     * Class to build instances of {@link QuantityCreateInvoiceItem}.
     */
    public static class Builder {






        /**
         * Builds a new {@link QuantityCreateInvoiceItem} object using the set fields.
         * @return {@link QuantityCreateInvoiceItem}
         */
        public QuantityCreateInvoiceItem build() {
            return new QuantityCreateInvoiceItem();
        }
    }
}
