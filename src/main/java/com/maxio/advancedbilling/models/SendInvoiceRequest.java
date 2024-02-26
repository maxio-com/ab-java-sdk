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
 * This is a model class for SendInvoiceRequest type.
 */
public class SendInvoiceRequest {
    private List<String> recipientEmails;
    private List<String> ccRecipientEmails;
    private List<String> bccRecipientEmails;

    /**
     * Default constructor.
     */
    public SendInvoiceRequest() {
    }

    /**
     * Initialization constructor.
     * @param  recipientEmails  List of String value for recipientEmails.
     * @param  ccRecipientEmails  List of String value for ccRecipientEmails.
     * @param  bccRecipientEmails  List of String value for bccRecipientEmails.
     */
    public SendInvoiceRequest(
            List<String> recipientEmails,
            List<String> ccRecipientEmails,
            List<String> bccRecipientEmails) {
        this.recipientEmails = recipientEmails;
        this.ccRecipientEmails = ccRecipientEmails;
        this.bccRecipientEmails = bccRecipientEmails;
    }

    /**
     * Getter for RecipientEmails.
     * @return Returns the List of String
     */
    @JsonGetter("recipient_emails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getRecipientEmails() {
        return recipientEmails;
    }

    /**
     * Setter for RecipientEmails.
     * @param recipientEmails Value for List of String
     */
    @JsonSetter("recipient_emails")
    public void setRecipientEmails(List<String> recipientEmails) {
        this.recipientEmails = recipientEmails;
    }

    /**
     * Getter for CcRecipientEmails.
     * @return Returns the List of String
     */
    @JsonGetter("cc_recipient_emails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getCcRecipientEmails() {
        return ccRecipientEmails;
    }

    /**
     * Setter for CcRecipientEmails.
     * @param ccRecipientEmails Value for List of String
     */
    @JsonSetter("cc_recipient_emails")
    public void setCcRecipientEmails(List<String> ccRecipientEmails) {
        this.ccRecipientEmails = ccRecipientEmails;
    }

    /**
     * Getter for BccRecipientEmails.
     * @return Returns the List of String
     */
    @JsonGetter("bcc_recipient_emails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getBccRecipientEmails() {
        return bccRecipientEmails;
    }

    /**
     * Setter for BccRecipientEmails.
     * @param bccRecipientEmails Value for List of String
     */
    @JsonSetter("bcc_recipient_emails")
    public void setBccRecipientEmails(List<String> bccRecipientEmails) {
        this.bccRecipientEmails = bccRecipientEmails;
    }

    /**
     * Converts this SendInvoiceRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SendInvoiceRequest [" + "recipientEmails=" + recipientEmails
                + ", ccRecipientEmails=" + ccRecipientEmails + ", bccRecipientEmails="
                + bccRecipientEmails + "]";
    }

    /**
     * Builds a new {@link SendInvoiceRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SendInvoiceRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .recipientEmails(getRecipientEmails())
                .ccRecipientEmails(getCcRecipientEmails())
                .bccRecipientEmails(getBccRecipientEmails());
        return builder;
    }

    /**
     * Class to build instances of {@link SendInvoiceRequest}.
     */
    public static class Builder {
        private List<String> recipientEmails;
        private List<String> ccRecipientEmails;
        private List<String> bccRecipientEmails;



        /**
         * Setter for recipientEmails.
         * @param  recipientEmails  List of String value for recipientEmails.
         * @return Builder
         */
        public Builder recipientEmails(List<String> recipientEmails) {
            this.recipientEmails = recipientEmails;
            return this;
        }

        /**
         * Setter for ccRecipientEmails.
         * @param  ccRecipientEmails  List of String value for ccRecipientEmails.
         * @return Builder
         */
        public Builder ccRecipientEmails(List<String> ccRecipientEmails) {
            this.ccRecipientEmails = ccRecipientEmails;
            return this;
        }

        /**
         * Setter for bccRecipientEmails.
         * @param  bccRecipientEmails  List of String value for bccRecipientEmails.
         * @return Builder
         */
        public Builder bccRecipientEmails(List<String> bccRecipientEmails) {
            this.bccRecipientEmails = bccRecipientEmails;
            return this;
        }

        /**
         * Builds a new {@link SendInvoiceRequest} object using the set fields.
         * @return {@link SendInvoiceRequest}
         */
        public SendInvoiceRequest build() {
            return new SendInvoiceRequest(recipientEmails, ccRecipientEmails, bccRecipientEmails);
        }
    }
}
