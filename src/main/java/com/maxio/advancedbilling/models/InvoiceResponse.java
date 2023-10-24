/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for InvoiceResponse type.
 */
public class InvoiceResponse {
    private Invoice invoice;

    /**
     * Default constructor.
     */
    public InvoiceResponse() {
    }

    /**
     * Initialization constructor.
     * @param  invoice  Invoice value for invoice.
     */
    public InvoiceResponse(
            Invoice invoice) {
        this.invoice = invoice;
    }

    /**
     * Getter for Invoice.
     * @return Returns the Invoice
     */
    @JsonGetter("invoice")
    public Invoice getInvoice() {
        return invoice;
    }

    /**
     * Setter for Invoice.
     * @param invoice Value for Invoice
     */
    @JsonSetter("invoice")
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    /**
     * Converts this InvoiceResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoiceResponse [" + "invoice=" + invoice + "]";
    }

    /**
     * Builds a new {@link InvoiceResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoiceResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(invoice);
        return builder;
    }

    /**
     * Class to build instances of {@link InvoiceResponse}.
     */
    public static class Builder {
        private Invoice invoice;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  invoice  Invoice value for invoice.
         */
        public Builder(Invoice invoice) {
            this.invoice = invoice;
        }

        /**
         * Setter for invoice.
         * @param  invoice  Invoice value for invoice.
         * @return Builder
         */
        public Builder invoice(Invoice invoice) {
            this.invoice = invoice;
            return this;
        }

        /**
         * Builds a new {@link InvoiceResponse} object using the set fields.
         * @return {@link InvoiceResponse}
         */
        public InvoiceResponse build() {
            return new InvoiceResponse(invoice);
        }
    }
}
