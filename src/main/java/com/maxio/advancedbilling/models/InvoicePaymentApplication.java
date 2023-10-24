/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for InvoicePaymentApplication type.
 */
public class InvoicePaymentApplication {
    private String invoiceUid;
    private String applicationUid;
    private String appliedAmount;

    /**
     * Default constructor.
     */
    public InvoicePaymentApplication() {
    }

    /**
     * Initialization constructor.
     * @param  invoiceUid  String value for invoiceUid.
     * @param  applicationUid  String value for applicationUid.
     * @param  appliedAmount  String value for appliedAmount.
     */
    public InvoicePaymentApplication(
            String invoiceUid,
            String applicationUid,
            String appliedAmount) {
        this.invoiceUid = invoiceUid;
        this.applicationUid = applicationUid;
        this.appliedAmount = appliedAmount;
    }

    /**
     * Getter for InvoiceUid.
     * Unique identifier for the paid invoice. It has the prefix "inv_" followed by alphanumeric
     * characters.
     * @return Returns the String
     */
    @JsonGetter("invoice_uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInvoiceUid() {
        return invoiceUid;
    }

    /**
     * Setter for InvoiceUid.
     * Unique identifier for the paid invoice. It has the prefix "inv_" followed by alphanumeric
     * characters.
     * @param invoiceUid Value for String
     */
    @JsonSetter("invoice_uid")
    public void setInvoiceUid(String invoiceUid) {
        this.invoiceUid = invoiceUid;
    }

    /**
     * Getter for ApplicationUid.
     * Unique identifier for the payment. It has the prefix "pmt_" followed by alphanumeric
     * characters.
     * @return Returns the String
     */
    @JsonGetter("application_uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getApplicationUid() {
        return applicationUid;
    }

    /**
     * Setter for ApplicationUid.
     * Unique identifier for the payment. It has the prefix "pmt_" followed by alphanumeric
     * characters.
     * @param applicationUid Value for String
     */
    @JsonSetter("application_uid")
    public void setApplicationUid(String applicationUid) {
        this.applicationUid = applicationUid;
    }

    /**
     * Getter for AppliedAmount.
     * Dollar amount of the paid invoice.
     * @return Returns the String
     */
    @JsonGetter("applied_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAppliedAmount() {
        return appliedAmount;
    }

    /**
     * Setter for AppliedAmount.
     * Dollar amount of the paid invoice.
     * @param appliedAmount Value for String
     */
    @JsonSetter("applied_amount")
    public void setAppliedAmount(String appliedAmount) {
        this.appliedAmount = appliedAmount;
    }

    /**
     * Converts this InvoicePaymentApplication into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoicePaymentApplication [" + "invoiceUid=" + invoiceUid + ", applicationUid="
                + applicationUid + ", appliedAmount=" + appliedAmount + "]";
    }

    /**
     * Builds a new {@link InvoicePaymentApplication.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoicePaymentApplication.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .invoiceUid(getInvoiceUid())
                .applicationUid(getApplicationUid())
                .appliedAmount(getAppliedAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link InvoicePaymentApplication}.
     */
    public static class Builder {
        private String invoiceUid;
        private String applicationUid;
        private String appliedAmount;



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
         * Setter for applicationUid.
         * @param  applicationUid  String value for applicationUid.
         * @return Builder
         */
        public Builder applicationUid(String applicationUid) {
            this.applicationUid = applicationUid;
            return this;
        }

        /**
         * Setter for appliedAmount.
         * @param  appliedAmount  String value for appliedAmount.
         * @return Builder
         */
        public Builder appliedAmount(String appliedAmount) {
            this.appliedAmount = appliedAmount;
            return this;
        }

        /**
         * Builds a new {@link InvoicePaymentApplication} object using the set fields.
         * @return {@link InvoicePaymentApplication}
         */
        public InvoicePaymentApplication build() {
            return new InvoicePaymentApplication(invoiceUid, applicationUid, appliedAmount);
        }
    }
}
