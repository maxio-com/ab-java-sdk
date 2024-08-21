/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for PaidInvoice type.
 */
public class PaidInvoice
        extends BaseModel {
    private String invoiceId;
    private InvoiceStatus status;
    private String dueAmount;
    private String paidAmount;

    /**
     * Default constructor.
     */
    public PaidInvoice() {
    }

    /**
     * Initialization constructor.
     * @param  invoiceId  String value for invoiceId.
     * @param  status  InvoiceStatus value for status.
     * @param  dueAmount  String value for dueAmount.
     * @param  paidAmount  String value for paidAmount.
     */
    public PaidInvoice(
            String invoiceId,
            InvoiceStatus status,
            String dueAmount,
            String paidAmount) {
        this.invoiceId = invoiceId;
        this.status = status;
        this.dueAmount = dueAmount;
        this.paidAmount = paidAmount;
    }

    /**
     * Getter for InvoiceId.
     * The uid of the paid invoice
     * @return Returns the String
     */
    @JsonGetter("invoice_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInvoiceId() {
        return invoiceId;
    }

    /**
     * Setter for InvoiceId.
     * The uid of the paid invoice
     * @param invoiceId Value for String
     */
    @JsonSetter("invoice_id")
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * Getter for Status.
     * The current status of the invoice. See [Invoice
     * Statuses](https://maxio.zendesk.com/hc/en-us/articles/24252287829645-Advanced-Billing-Invoices-Overview#invoice-statuses)
     * for more.
     * @return Returns the InvoiceStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * The current status of the invoice. See [Invoice
     * Statuses](https://maxio.zendesk.com/hc/en-us/articles/24252287829645-Advanced-Billing-Invoices-Overview#invoice-statuses)
     * for more.
     * @param status Value for InvoiceStatus
     */
    @JsonSetter("status")
    public void setStatus(InvoiceStatus status) {
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
     * Converts this PaidInvoice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaidInvoice [" + "invoiceId=" + invoiceId + ", status=" + status + ", dueAmount="
                + dueAmount + ", paidAmount=" + paidAmount + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PaidInvoice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaidInvoice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .invoiceId(getInvoiceId())
                .status(getStatus())
                .dueAmount(getDueAmount())
                .paidAmount(getPaidAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link PaidInvoice}.
     */
    public static class Builder {
        private String invoiceId;
        private InvoiceStatus status;
        private String dueAmount;
        private String paidAmount;



        /**
         * Setter for invoiceId.
         * @param  invoiceId  String value for invoiceId.
         * @return Builder
         */
        public Builder invoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  InvoiceStatus value for status.
         * @return Builder
         */
        public Builder status(InvoiceStatus status) {
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
         * Builds a new {@link PaidInvoice} object using the set fields.
         * @return {@link PaidInvoice}
         */
        public PaidInvoice build() {
            return new PaidInvoice(invoiceId, status, dueAmount, paidAmount);
        }
    }
}
