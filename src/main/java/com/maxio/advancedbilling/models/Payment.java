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
 * This is a model class for Payment type.
 */
public class Payment {
    private String invoiceUid;
    private Status status;
    private String dueAmount;
    private String paidAmount;

    /**
     * Default constructor.
     */
    public Payment() {
    }

    /**
     * Initialization constructor.
     * @param  invoiceUid  String value for invoiceUid.
     * @param  status  Status value for status.
     * @param  dueAmount  String value for dueAmount.
     * @param  paidAmount  String value for paidAmount.
     */
    public Payment(
            String invoiceUid,
            Status status,
            String dueAmount,
            String paidAmount) {
        this.invoiceUid = invoiceUid;
        this.status = status;
        this.dueAmount = dueAmount;
        this.paidAmount = paidAmount;
    }

    /**
     * Getter for InvoiceUid.
     * The uid of the paid invoice
     * @return Returns the String
     */
    @JsonGetter("invoice_uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInvoiceUid() {
        return invoiceUid;
    }

    /**
     * Setter for InvoiceUid.
     * The uid of the paid invoice
     * @param invoiceUid Value for String
     */
    @JsonSetter("invoice_uid")
    public void setInvoiceUid(String invoiceUid) {
        this.invoiceUid = invoiceUid;
    }

    /**
     * Getter for Status.
     * The current status of the invoice. See [Invoice
     * Statuses](https://chargify.zendesk.com/hc/en-us/articles/4407737494171#line-item-breakdowns)
     * for more.
     * @return Returns the Status
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Status getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * The current status of the invoice. See [Invoice
     * Statuses](https://chargify.zendesk.com/hc/en-us/articles/4407737494171#line-item-breakdowns)
     * for more.
     * @param status Value for Status
     */
    @JsonSetter("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Getter for DueAmount.
     * The remaining due amount on the invoice
     * @return Returns the String
     */
    @JsonGetter("due_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDueAmount() {
        return dueAmount;
    }

    /**
     * Setter for DueAmount.
     * The remaining due amount on the invoice
     * @param dueAmount Value for String
     */
    @JsonSetter("due_amount")
    public void setDueAmount(String dueAmount) {
        this.dueAmount = dueAmount;
    }

    /**
     * Getter for PaidAmount.
     * The total amount paid on this invoice (including any prior payments)
     * @return Returns the String
     */
    @JsonGetter("paid_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaidAmount() {
        return paidAmount;
    }

    /**
     * Setter for PaidAmount.
     * The total amount paid on this invoice (including any prior payments)
     * @param paidAmount Value for String
     */
    @JsonSetter("paid_amount")
    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    /**
     * Converts this Payment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Payment [" + "invoiceUid=" + invoiceUid + ", status=" + status + ", dueAmount="
                + dueAmount + ", paidAmount=" + paidAmount + "]";
    }

    /**
     * Builds a new {@link Payment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Payment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .invoiceUid(getInvoiceUid())
                .status(getStatus())
                .dueAmount(getDueAmount())
                .paidAmount(getPaidAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link Payment}.
     */
    public static class Builder {
        private String invoiceUid;
        private Status status;
        private String dueAmount;
        private String paidAmount;



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
         * Setter for status.
         * @param  status  Status value for status.
         * @return Builder
         */
        public Builder status(Status status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for dueAmount.
         * @param  dueAmount  String value for dueAmount.
         * @return Builder
         */
        public Builder dueAmount(String dueAmount) {
            this.dueAmount = dueAmount;
            return this;
        }

        /**
         * Setter for paidAmount.
         * @param  paidAmount  String value for paidAmount.
         * @return Builder
         */
        public Builder paidAmount(String paidAmount) {
            this.paidAmount = paidAmount;
            return this;
        }

        /**
         * Builds a new {@link Payment} object using the set fields.
         * @return {@link Payment}
         */
        public Payment build() {
            return new Payment(invoiceUid, status, dueAmount, paidAmount);
        }
    }
}
