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
 * This is a model class for IssueInvoiceRequest type.
 */
public class IssueInvoiceRequest {
    private FailedPaymentAction onFailedPayment;

    /**
     * Default constructor.
     */
    public IssueInvoiceRequest() {
        onFailedPayment = FailedPaymentAction.LEAVE_OPEN_INVOICE;
    }

    /**
     * Initialization constructor.
     * @param  onFailedPayment  FailedPaymentAction value for onFailedPayment.
     */
    public IssueInvoiceRequest(
            FailedPaymentAction onFailedPayment) {
        this.onFailedPayment = onFailedPayment;
    }

    /**
     * Getter for OnFailedPayment.
     * Action taken when payment for an invoice fails: - `leave_open_invoice` - prepayments and
     * credits applied to invoice; invoice status set to "open"; email sent to the customer for the
     * issued invoice (if setting applies); payment failure recorded in the invoice history. This is
     * the default option. - `rollback_to_pending` - prepayments and credits not applied; invoice
     * remains in "pending" status; no email sent to the customer; payment failure recorded in the
     * invoice history. - `initiate_dunning` - prepayments and credits applied to the invoice;
     * invoice status set to "open"; email sent to the customer for the issued invoice (if setting
     * applies); payment failure recorded in the invoice history; subscription will most likely go
     * into "past_due" or "canceled" state (depending upon net terms and dunning settings).
     * @return Returns the FailedPaymentAction
     */
    @JsonGetter("on_failed_payment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FailedPaymentAction getOnFailedPayment() {
        return onFailedPayment;
    }

    /**
     * Setter for OnFailedPayment.
     * Action taken when payment for an invoice fails: - `leave_open_invoice` - prepayments and
     * credits applied to invoice; invoice status set to "open"; email sent to the customer for the
     * issued invoice (if setting applies); payment failure recorded in the invoice history. This is
     * the default option. - `rollback_to_pending` - prepayments and credits not applied; invoice
     * remains in "pending" status; no email sent to the customer; payment failure recorded in the
     * invoice history. - `initiate_dunning` - prepayments and credits applied to the invoice;
     * invoice status set to "open"; email sent to the customer for the issued invoice (if setting
     * applies); payment failure recorded in the invoice history; subscription will most likely go
     * into "past_due" or "canceled" state (depending upon net terms and dunning settings).
     * @param onFailedPayment Value for FailedPaymentAction
     */
    @JsonSetter("on_failed_payment")
    public void setOnFailedPayment(FailedPaymentAction onFailedPayment) {
        this.onFailedPayment = onFailedPayment;
    }

    /**
     * Converts this IssueInvoiceRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IssueInvoiceRequest [" + "onFailedPayment=" + onFailedPayment + "]";
    }

    /**
     * Builds a new {@link IssueInvoiceRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IssueInvoiceRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .onFailedPayment(getOnFailedPayment());
        return builder;
    }

    /**
     * Class to build instances of {@link IssueInvoiceRequest}.
     */
    public static class Builder {
        private FailedPaymentAction onFailedPayment = FailedPaymentAction.LEAVE_OPEN_INVOICE;



        /**
         * Setter for onFailedPayment.
         * @param  onFailedPayment  FailedPaymentAction value for onFailedPayment.
         * @return Builder
         */
        public Builder onFailedPayment(FailedPaymentAction onFailedPayment) {
            this.onFailedPayment = onFailedPayment;
            return this;
        }

        /**
         * Builds a new {@link IssueInvoiceRequest} object using the set fields.
         * @return {@link IssueInvoiceRequest}
         */
        public IssueInvoiceRequest build() {
            return new IssueInvoiceRequest(onFailedPayment);
        }
    }
}
