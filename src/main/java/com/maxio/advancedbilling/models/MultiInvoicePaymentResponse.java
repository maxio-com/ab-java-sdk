/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for MultiInvoicePaymentResponse type.
 */
public class MultiInvoicePaymentResponse {
    private MultiInvoicePayment payment;

    /**
     * Default constructor.
     */
    public MultiInvoicePaymentResponse() {
    }

    /**
     * Initialization constructor.
     * @param  payment  MultiInvoicePayment value for payment.
     */
    public MultiInvoicePaymentResponse(
            MultiInvoicePayment payment) {
        this.payment = payment;
    }

    /**
     * Getter for Payment.
     * @return Returns the MultiInvoicePayment
     */
    @JsonGetter("payment")
    public MultiInvoicePayment getPayment() {
        return payment;
    }

    /**
     * Setter for Payment.
     * @param payment Value for MultiInvoicePayment
     */
    @JsonSetter("payment")
    public void setPayment(MultiInvoicePayment payment) {
        this.payment = payment;
    }

    /**
     * Converts this MultiInvoicePaymentResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MultiInvoicePaymentResponse [" + "payment=" + payment + "]";
    }

    /**
     * Builds a new {@link MultiInvoicePaymentResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MultiInvoicePaymentResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(payment);
        return builder;
    }

    /**
     * Class to build instances of {@link MultiInvoicePaymentResponse}.
     */
    public static class Builder {
        private MultiInvoicePayment payment;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  payment  MultiInvoicePayment value for payment.
         */
        public Builder(MultiInvoicePayment payment) {
            this.payment = payment;
        }

        /**
         * Setter for payment.
         * @param  payment  MultiInvoicePayment value for payment.
         * @return Builder
         */
        public Builder payment(MultiInvoicePayment payment) {
            this.payment = payment;
            return this;
        }

        /**
         * Builds a new {@link MultiInvoicePaymentResponse} object using the set fields.
         * @return {@link MultiInvoicePaymentResponse}
         */
        public MultiInvoicePaymentResponse build() {
            return new MultiInvoicePaymentResponse(payment);
        }
    }
}
