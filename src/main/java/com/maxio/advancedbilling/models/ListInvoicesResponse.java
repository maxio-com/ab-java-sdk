/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for ListInvoicesResponse type.
 */
public class ListInvoicesResponse {
    private List<Invoice> invoices;

    /**
     * Default constructor.
     */
    public ListInvoicesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  invoices  List of Invoice value for invoices.
     */
    public ListInvoicesResponse(
            List<Invoice> invoices) {
        this.invoices = invoices;
    }

    /**
     * Getter for Invoices.
     * @return Returns the List of Invoice
     */
    @JsonGetter("invoices")
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
     * Converts this ListInvoicesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListInvoicesResponse [" + "invoices=" + invoices + "]";
    }

    /**
     * Builds a new {@link ListInvoicesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListInvoicesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(invoices);
        return builder;
    }

    /**
     * Class to build instances of {@link ListInvoicesResponse}.
     */
    public static class Builder {
        private List<Invoice> invoices;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  invoices  List of Invoice value for invoices.
         */
        public Builder(List<Invoice> invoices) {
            this.invoices = invoices;
        }

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
         * Builds a new {@link ListInvoicesResponse} object using the set fields.
         * @return {@link ListInvoicesResponse}
         */
        public ListInvoicesResponse build() {
            return new ListInvoicesResponse(invoices);
        }
    }
}
