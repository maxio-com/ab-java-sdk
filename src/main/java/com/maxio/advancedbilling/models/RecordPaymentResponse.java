/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for RecordPaymentResponse type.
 */
public class RecordPaymentResponse
        extends BaseModel {
    private List<PaidInvoice> paidInvoices;
    private OptionalNullable<InvoicePrePayment> prepayment;

    /**
     * Default constructor.
     */
    public RecordPaymentResponse() {
    }

    /**
     * Initialization constructor.
     * @param  paidInvoices  List of PaidInvoice value for paidInvoices.
     * @param  prepayment  InvoicePrePayment value for prepayment.
     */
    public RecordPaymentResponse(
            List<PaidInvoice> paidInvoices,
            InvoicePrePayment prepayment) {
        this.paidInvoices = paidInvoices;
        this.prepayment = OptionalNullable.of(prepayment);
    }

    /**
     * Initialization constructor.
     * @param  paidInvoices  List of PaidInvoice value for paidInvoices.
     * @param  prepayment  InvoicePrePayment value for prepayment.
     */

    protected RecordPaymentResponse(List<PaidInvoice> paidInvoices,
            OptionalNullable<InvoicePrePayment> prepayment) {
        this.paidInvoices = paidInvoices;
        this.prepayment = prepayment;
    }

    /**
     * Getter for PaidInvoices.
     * @return Returns the List of PaidInvoice
     */
    @JsonGetter("paid_invoices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PaidInvoice> getPaidInvoices() {
        return paidInvoices;
    }

    /**
     * Setter for PaidInvoices.
     * @param paidInvoices Value for List of PaidInvoice
     */
    @JsonSetter("paid_invoices")
    public void setPaidInvoices(List<PaidInvoice> paidInvoices) {
        this.paidInvoices = paidInvoices;
    }

    /**
     * Internal Getter for Prepayment.
     * @return Returns the Internal InvoicePrePayment
     */
    @JsonGetter("prepayment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<InvoicePrePayment> internalGetPrepayment() {
        return this.prepayment;
    }

    /**
     * Getter for Prepayment.
     * @return Returns the InvoicePrePayment
     */
    public InvoicePrePayment getPrepayment() {
        return OptionalNullable.getFrom(prepayment);
    }

    /**
     * Setter for Prepayment.
     * @param prepayment Value for InvoicePrePayment
     */
    @JsonSetter("prepayment")
    public void setPrepayment(InvoicePrePayment prepayment) {
        this.prepayment = OptionalNullable.of(prepayment);
    }

    /**
     * UnSetter for Prepayment.
     */
    public void unsetPrepayment() {
        prepayment = null;
    }

    /**
     * Converts this RecordPaymentResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RecordPaymentResponse [" + "paidInvoices=" + paidInvoices + ", prepayment="
                + prepayment + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link RecordPaymentResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RecordPaymentResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .paidInvoices(getPaidInvoices());
        builder.prepayment = internalGetPrepayment();
        return builder;
    }

    /**
     * Class to build instances of {@link RecordPaymentResponse}.
     */
    public static class Builder {
        private List<PaidInvoice> paidInvoices;
        private OptionalNullable<InvoicePrePayment> prepayment;



        /**
         * Setter for paidInvoices.
         * @param  paidInvoices  List of PaidInvoice value for paidInvoices.
         * @return Builder
         */
        public Builder paidInvoices(List<PaidInvoice> paidInvoices) {
            this.paidInvoices = paidInvoices;
            return this;
        }

        /**
         * Setter for prepayment.
         * @param  prepayment  InvoicePrePayment value for prepayment.
         * @return Builder
         */
        public Builder prepayment(InvoicePrePayment prepayment) {
            this.prepayment = OptionalNullable.of(prepayment);
            return this;
        }

        /**
         * UnSetter for prepayment.
         * @return Builder
         */
        public Builder unsetPrepayment() {
            prepayment = null;
            return this;
        }

        /**
         * Builds a new {@link RecordPaymentResponse} object using the set fields.
         * @return {@link RecordPaymentResponse}
         */
        public RecordPaymentResponse build() {
            return new RecordPaymentResponse(paidInvoices, prepayment);
        }
    }
}
