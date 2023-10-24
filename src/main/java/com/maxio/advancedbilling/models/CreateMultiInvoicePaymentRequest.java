/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreateMultiInvoicePaymentRequest type.
 */
public class CreateMultiInvoicePaymentRequest {
    private CreateMultiInvoicePayment payment;

    /**
     * Default constructor.
     */
    public CreateMultiInvoicePaymentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  payment  CreateMultiInvoicePayment value for payment.
     */
    public CreateMultiInvoicePaymentRequest(
            CreateMultiInvoicePayment payment) {
        this.payment = payment;
    }

    /**
     * Getter for Payment.
     * @return Returns the CreateMultiInvoicePayment
     */
    @JsonGetter("payment")
    public CreateMultiInvoicePayment getPayment() {
        return payment;
    }

    /**
     * Setter for Payment.
     * @param payment Value for CreateMultiInvoicePayment
     */
    @JsonSetter("payment")
    public void setPayment(CreateMultiInvoicePayment payment) {
        this.payment = payment;
    }

    /**
     * Converts this CreateMultiInvoicePaymentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateMultiInvoicePaymentRequest [" + "payment=" + payment + "]";
    }

    /**
     * Builds a new {@link CreateMultiInvoicePaymentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateMultiInvoicePaymentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(payment);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateMultiInvoicePaymentRequest}.
     */
    public static class Builder {
        private CreateMultiInvoicePayment payment;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  payment  CreateMultiInvoicePayment value for payment.
         */
        public Builder(CreateMultiInvoicePayment payment) {
            this.payment = payment;
        }

        /**
         * Setter for payment.
         * @param  payment  CreateMultiInvoicePayment value for payment.
         * @return Builder
         */
        public Builder payment(CreateMultiInvoicePayment payment) {
            this.payment = payment;
            return this;
        }

        /**
         * Builds a new {@link CreateMultiInvoicePaymentRequest} object using the set fields.
         * @return {@link CreateMultiInvoicePaymentRequest}
         */
        public CreateMultiInvoicePaymentRequest build() {
            return new CreateMultiInvoicePaymentRequest(payment);
        }
    }
}
