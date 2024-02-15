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
import com.maxio.advancedbilling.models.containers.RecordPaymentResponsePrepayment;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for RecordPaymentResponse type.
 */
public class RecordPaymentResponse {
    private List<PaidInvoice> paidInvoices;
    private OptionalNullable<RecordPaymentResponsePrepayment> prepayment;

    /**
     * Default constructor.
     */
    public RecordPaymentResponse() {
    }

    /**
     * Initialization constructor.
     * @param  paidInvoices  List of PaidInvoice value for paidInvoices.
     * @param  prepayment  RecordPaymentResponsePrepayment value for prepayment.
     */
    public RecordPaymentResponse(
            List<PaidInvoice> paidInvoices,
            RecordPaymentResponsePrepayment prepayment) {
        this.paidInvoices = paidInvoices;
        this.prepayment = OptionalNullable.of(prepayment);
    }

    /**
     * Initialization constructor.
     * @param  paidInvoices  List of PaidInvoice value for paidInvoices.
     * @param  prepayment  RecordPaymentResponsePrepayment value for prepayment.
     */

    protected RecordPaymentResponse(List<PaidInvoice> paidInvoices,
            OptionalNullable<RecordPaymentResponsePrepayment> prepayment) {
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
     * @return Returns the Internal RecordPaymentResponsePrepayment
     */
    @JsonGetter("prepayment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<RecordPaymentResponsePrepayment> internalGetPrepayment() {
        return this.prepayment;
    }

    /**
     * Getter for Prepayment.
     * @return Returns the RecordPaymentResponsePrepayment
     */
    public RecordPaymentResponsePrepayment getPrepayment() {
        return OptionalNullable.getFrom(prepayment);
    }

    /**
     * Setter for Prepayment.
     * @param prepayment Value for RecordPaymentResponsePrepayment
     */
    @JsonSetter("prepayment")
    public void setPrepayment(RecordPaymentResponsePrepayment prepayment) {
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
                + prepayment + "]";
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
        private OptionalNullable<RecordPaymentResponsePrepayment> prepayment;



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
         * @param  prepayment  RecordPaymentResponsePrepayment value for prepayment.
         * @return Builder
         */
        public Builder prepayment(RecordPaymentResponsePrepayment prepayment) {
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
