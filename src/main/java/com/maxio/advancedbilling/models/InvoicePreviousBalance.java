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
 * This is a model class for InvoicePreviousBalance type.
 */
public class InvoicePreviousBalance {
    private String captureDate;
    private List<InvoiceBalanceItem> invoices;

    /**
     * Default constructor.
     */
    public InvoicePreviousBalance() {
    }

    /**
     * Initialization constructor.
     * @param  captureDate  String value for captureDate.
     * @param  invoices  List of InvoiceBalanceItem value for invoices.
     */
    public InvoicePreviousBalance(
            String captureDate,
            List<InvoiceBalanceItem> invoices) {
        this.captureDate = captureDate;
        this.invoices = invoices;
    }

    /**
     * Getter for CaptureDate.
     * @return Returns the String
     */
    @JsonGetter("capture_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCaptureDate() {
        return captureDate;
    }

    /**
     * Setter for CaptureDate.
     * @param captureDate Value for String
     */
    @JsonSetter("capture_date")
    public void setCaptureDate(String captureDate) {
        this.captureDate = captureDate;
    }

    /**
     * Getter for Invoices.
     * @return Returns the List of InvoiceBalanceItem
     */
    @JsonGetter("invoices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InvoiceBalanceItem> getInvoices() {
        return invoices;
    }

    /**
     * Setter for Invoices.
     * @param invoices Value for List of InvoiceBalanceItem
     */
    @JsonSetter("invoices")
    public void setInvoices(List<InvoiceBalanceItem> invoices) {
        this.invoices = invoices;
    }

    /**
     * Converts this InvoicePreviousBalance into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoicePreviousBalance [" + "captureDate=" + captureDate + ", invoices=" + invoices
                + "]";
    }

    /**
     * Builds a new {@link InvoicePreviousBalance.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoicePreviousBalance.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .captureDate(getCaptureDate())
                .invoices(getInvoices());
        return builder;
    }

    /**
     * Class to build instances of {@link InvoicePreviousBalance}.
     */
    public static class Builder {
        private String captureDate;
        private List<InvoiceBalanceItem> invoices;



        /**
         * Setter for captureDate.
         * @param  captureDate  String value for captureDate.
         * @return Builder
         */
        public Builder captureDate(String captureDate) {
            this.captureDate = captureDate;
            return this;
        }

        /**
         * Setter for invoices.
         * @param  invoices  List of InvoiceBalanceItem value for invoices.
         * @return Builder
         */
        public Builder invoices(List<InvoiceBalanceItem> invoices) {
            this.invoices = invoices;
            return this;
        }

        /**
         * Builds a new {@link InvoicePreviousBalance} object using the set fields.
         * @return {@link InvoicePreviousBalance}
         */
        public InvoicePreviousBalance build() {
            return new InvoicePreviousBalance(captureDate, invoices);
        }
    }
}
