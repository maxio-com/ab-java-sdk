/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreateInvoiceRequest type.
 */
public class CreateInvoiceRequest {
    private CreateInvoice invoice;

    /**
     * Default constructor.
     */
    public CreateInvoiceRequest() {
    }

    /**
     * Initialization constructor.
     * @param  invoice  CreateInvoice value for invoice.
     */
    public CreateInvoiceRequest(
            CreateInvoice invoice) {
        this.invoice = invoice;
    }

    /**
     * Getter for Invoice.
     * @return Returns the CreateInvoice
     */
    @JsonGetter("invoice")
    public CreateInvoice getInvoice() {
        return invoice;
    }

    /**
     * Setter for Invoice.
     * @param invoice Value for CreateInvoice
     */
    @JsonSetter("invoice")
    public void setInvoice(CreateInvoice invoice) {
        this.invoice = invoice;
    }

    /**
     * Converts this CreateInvoiceRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateInvoiceRequest [" + "invoice=" + invoice + "]";
    }

    /**
     * Builds a new {@link CreateInvoiceRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateInvoiceRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(invoice);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateInvoiceRequest}.
     */
    public static class Builder {
        private CreateInvoice invoice;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  invoice  CreateInvoice value for invoice.
         */
        public Builder(CreateInvoice invoice) {
            this.invoice = invoice;
        }

        /**
         * Setter for invoice.
         * @param  invoice  CreateInvoice value for invoice.
         * @return Builder
         */
        public Builder invoice(CreateInvoice invoice) {
            this.invoice = invoice;
            return this;
        }

        /**
         * Builds a new {@link CreateInvoiceRequest} object using the set fields.
         * @return {@link CreateInvoiceRequest}
         */
        public CreateInvoiceRequest build() {
            return new CreateInvoiceRequest(invoice);
        }
    }
}
