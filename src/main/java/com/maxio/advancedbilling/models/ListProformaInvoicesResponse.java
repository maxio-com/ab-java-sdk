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
 * This is a model class for ListProformaInvoicesResponse type.
 */
public class ListProformaInvoicesResponse {
    private List<ProformaInvoice> proformaInvoices;
    private ListProformaInvoicesMeta meta;

    /**
     * Default constructor.
     */
    public ListProformaInvoicesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  proformaInvoices  List of ProformaInvoice value for proformaInvoices.
     * @param  meta  ListProformaInvoicesMeta value for meta.
     */
    public ListProformaInvoicesResponse(
            List<ProformaInvoice> proformaInvoices,
            ListProformaInvoicesMeta meta) {
        this.proformaInvoices = proformaInvoices;
        this.meta = meta;
    }

    /**
     * Getter for ProformaInvoices.
     * @return Returns the List of ProformaInvoice
     */
    @JsonGetter("proforma_invoices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ProformaInvoice> getProformaInvoices() {
        return proformaInvoices;
    }

    /**
     * Setter for ProformaInvoices.
     * @param proformaInvoices Value for List of ProformaInvoice
     */
    @JsonSetter("proforma_invoices")
    public void setProformaInvoices(List<ProformaInvoice> proformaInvoices) {
        this.proformaInvoices = proformaInvoices;
    }

    /**
     * Getter for Meta.
     * @return Returns the ListProformaInvoicesMeta
     */
    @JsonGetter("meta")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListProformaInvoicesMeta getMeta() {
        return meta;
    }

    /**
     * Setter for Meta.
     * @param meta Value for ListProformaInvoicesMeta
     */
    @JsonSetter("meta")
    public void setMeta(ListProformaInvoicesMeta meta) {
        this.meta = meta;
    }

    /**
     * Converts this ListProformaInvoicesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListProformaInvoicesResponse [" + "proformaInvoices=" + proformaInvoices + ", meta="
                + meta + "]";
    }

    /**
     * Builds a new {@link ListProformaInvoicesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListProformaInvoicesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .proformaInvoices(getProformaInvoices())
                .meta(getMeta());
        return builder;
    }

    /**
     * Class to build instances of {@link ListProformaInvoicesResponse}.
     */
    public static class Builder {
        private List<ProformaInvoice> proformaInvoices;
        private ListProformaInvoicesMeta meta;



        /**
         * Setter for proformaInvoices.
         * @param  proformaInvoices  List of ProformaInvoice value for proformaInvoices.
         * @return Builder
         */
        public Builder proformaInvoices(List<ProformaInvoice> proformaInvoices) {
            this.proformaInvoices = proformaInvoices;
            return this;
        }

        /**
         * Setter for meta.
         * @param  meta  ListProformaInvoicesMeta value for meta.
         * @return Builder
         */
        public Builder meta(ListProformaInvoicesMeta meta) {
            this.meta = meta;
            return this;
        }

        /**
         * Builds a new {@link ListProformaInvoicesResponse} object using the set fields.
         * @return {@link ListProformaInvoicesResponse}
         */
        public ListProformaInvoicesResponse build() {
            return new ListProformaInvoicesResponse(proformaInvoices, meta);
        }
    }
}
