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
 * This is a model class for PaymentResponse type.
 */
public class PaymentResponse {
    private List<Payment> paidInvoices;
    private PrePayment prepayment;

    /**
     * Default constructor.
     */
    public PaymentResponse() {
    }

    /**
     * Initialization constructor.
     * @param  paidInvoices  List of Payment value for paidInvoices.
     * @param  prepayment  PrePayment value for prepayment.
     */
    public PaymentResponse(
            List<Payment> paidInvoices,
            PrePayment prepayment) {
        this.paidInvoices = paidInvoices;
        this.prepayment = prepayment;
    }

    /**
     * Getter for PaidInvoices.
     * @return Returns the List of Payment
     */
    @JsonGetter("paid_invoices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Payment> getPaidInvoices() {
        return paidInvoices;
    }

    /**
     * Setter for PaidInvoices.
     * @param paidInvoices Value for List of Payment
     */
    @JsonSetter("paid_invoices")
    public void setPaidInvoices(List<Payment> paidInvoices) {
        this.paidInvoices = paidInvoices;
    }

    /**
     * Getter for Prepayment.
     * @return Returns the PrePayment
     */
    @JsonGetter("prepayment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PrePayment getPrepayment() {
        return prepayment;
    }

    /**
     * Setter for Prepayment.
     * @param prepayment Value for PrePayment
     */
    @JsonSetter("prepayment")
    public void setPrepayment(PrePayment prepayment) {
        this.prepayment = prepayment;
    }

    /**
     * Converts this PaymentResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentResponse [" + "paidInvoices=" + paidInvoices + ", prepayment=" + prepayment
                + "]";
    }

    /**
     * Builds a new {@link PaymentResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .paidInvoices(getPaidInvoices())
                .prepayment(getPrepayment());
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentResponse}.
     */
    public static class Builder {
        private List<Payment> paidInvoices;
        private PrePayment prepayment;



        /**
         * Setter for paidInvoices.
         * @param  paidInvoices  List of Payment value for paidInvoices.
         * @return Builder
         */
        public Builder paidInvoices(List<Payment> paidInvoices) {
            this.paidInvoices = paidInvoices;
            return this;
        }

        /**
         * Setter for prepayment.
         * @param  prepayment  PrePayment value for prepayment.
         * @return Builder
         */
        public Builder prepayment(PrePayment prepayment) {
            this.prepayment = prepayment;
            return this;
        }

        /**
         * Builds a new {@link PaymentResponse} object using the set fields.
         * @return {@link PaymentResponse}
         */
        public PaymentResponse build() {
            return new PaymentResponse(paidInvoices, prepayment);
        }
    }
}
