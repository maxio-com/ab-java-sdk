/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreateInvoicePaymentApplication type.
 */
public class CreateInvoicePaymentApplication {
    private String invoiceUid;
    private String amount;

    /**
     * Default constructor.
     */
    public CreateInvoicePaymentApplication() {
    }

    /**
     * Initialization constructor.
     * @param  invoiceUid  String value for invoiceUid.
     * @param  amount  String value for amount.
     */
    public CreateInvoicePaymentApplication(
            String invoiceUid,
            String amount) {
        this.invoiceUid = invoiceUid;
        this.amount = amount;
    }

    /**
     * Getter for InvoiceUid.
     * Unique identifier for the invoice. It has the prefix "inv_" followed by alphanumeric
     * characters.
     * @return Returns the String
     */
    @JsonGetter("invoice_uid")
    public String getInvoiceUid() {
        return invoiceUid;
    }

    /**
     * Setter for InvoiceUid.
     * Unique identifier for the invoice. It has the prefix "inv_" followed by alphanumeric
     * characters.
     * @param invoiceUid Value for String
     */
    @JsonSetter("invoice_uid")
    public void setInvoiceUid(String invoiceUid) {
        this.invoiceUid = invoiceUid;
    }

    /**
     * Getter for Amount.
     * Dollar amount of the invoice payment (eg. "10.50" =&gt; $10.50).
     * @return Returns the String
     */
    @JsonGetter("amount")
    public String getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Dollar amount of the invoice payment (eg. "10.50" =&gt; $10.50).
     * @param amount Value for String
     */
    @JsonSetter("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * Converts this CreateInvoicePaymentApplication into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateInvoicePaymentApplication [" + "invoiceUid=" + invoiceUid + ", amount="
                + amount + "]";
    }

    /**
     * Builds a new {@link CreateInvoicePaymentApplication.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateInvoicePaymentApplication.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(invoiceUid, amount);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateInvoicePaymentApplication}.
     */
    public static class Builder {
        private String invoiceUid;
        private String amount;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  invoiceUid  String value for invoiceUid.
         * @param  amount  String value for amount.
         */
        public Builder(String invoiceUid, String amount) {
            this.invoiceUid = invoiceUid;
            this.amount = amount;
        }

        /**
         * Setter for invoiceUid.
         * @param  invoiceUid  String value for invoiceUid.
         * @return Builder
         */
        public Builder invoiceUid(String invoiceUid) {
            this.invoiceUid = invoiceUid;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  String value for amount.
         * @return Builder
         */
        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Builds a new {@link CreateInvoicePaymentApplication} object using the set fields.
         * @return {@link CreateInvoicePaymentApplication}
         */
        public CreateInvoicePaymentApplication build() {
            return new CreateInvoicePaymentApplication(invoiceUid, amount);
        }
    }
}
