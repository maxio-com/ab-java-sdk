/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for ConsolidatedInvoice type.
 */
public class ConsolidatedInvoice {
    private List<Invoice> invoices;

    /**
     * Default constructor.
     */
    public ConsolidatedInvoice() {
    }

    /**
     * Initialization constructor.
     * @param  invoices  List of Invoice value for invoices.
     */
    public ConsolidatedInvoice(
            List<Invoice> invoices) {
        this.invoices = invoices;
    }

    /**
     * Getter for Invoices.
     * @return Returns the List of Invoice
     */
    @JsonGetter("invoices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Invoice> getInvoices() {
        return invoices;
    }

    /**
     * Setter for Invoices.
     * @param invoices Value for List of Invoice
     */
    @JsonSetter("invoices")
    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    /**
     * Converts this ConsolidatedInvoice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ConsolidatedInvoice [" + "invoices=" + invoices + "]";
    }

    /**
     * Builds a new {@link ConsolidatedInvoice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ConsolidatedInvoice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .invoices(getInvoices());
        return builder;
    }

    /**
     * Class to build instances of {@link ConsolidatedInvoice}.
     */
    public static class Builder {
        private List<Invoice> invoices;



        /**
         * Setter for invoices.
         * @param  invoices  List of Invoice value for invoices.
         * @return Builder
         */
        public Builder invoices(List<Invoice> invoices) {
            this.invoices = invoices;
            return this;
        }

        /**
         * Builds a new {@link ConsolidatedInvoice} object using the set fields.
         * @return {@link ConsolidatedInvoice}
         */
        public ConsolidatedInvoice build() {
            return new ConsolidatedInvoice(invoices);
        }
    }
}
