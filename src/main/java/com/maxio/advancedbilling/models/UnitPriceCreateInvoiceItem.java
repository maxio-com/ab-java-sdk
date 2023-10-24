/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;



/**
 * This is a model class for UnitPriceCreateInvoiceItem type.
 */
public class UnitPriceCreateInvoiceItem {

    /**
     * Default constructor.
     */
    public UnitPriceCreateInvoiceItem() {
    }

    /**
     * Converts this UnitPriceCreateInvoiceItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UnitPriceCreateInvoiceItem [" + "]";
    }

    /**
     * Builds a new {@link UnitPriceCreateInvoiceItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UnitPriceCreateInvoiceItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        return builder;
    }

    /**
     * Class to build instances of {@link UnitPriceCreateInvoiceItem}.
     */
    public static class Builder {






        /**
         * Builds a new {@link UnitPriceCreateInvoiceItem} object using the set fields.
         * @return {@link UnitPriceCreateInvoiceItem}
         */
        public UnitPriceCreateInvoiceItem build() {
            return new UnitPriceCreateInvoiceItem();
        }
    }
}
