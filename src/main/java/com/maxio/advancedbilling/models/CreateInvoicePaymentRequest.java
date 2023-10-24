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
 * This is a model class for CreateInvoicePaymentRequest type.
 */
public class CreateInvoicePaymentRequest {
    private CreateInvoicePayment payment;
    private InvoicePaymentType type;

    /**
     * Default constructor.
     */
    public CreateInvoicePaymentRequest() {
        type = InvoicePaymentType.EXTERNAL;
    }

    /**
     * Initialization constructor.
     * @param  payment  CreateInvoicePayment value for payment.
     * @param  type  InvoicePaymentType value for type.
     */
    public CreateInvoicePaymentRequest(
            CreateInvoicePayment payment,
            InvoicePaymentType type) {
        this.payment = payment;
        this.type = type;
    }

    /**
     * Getter for Payment.
     * @return Returns the CreateInvoicePayment
     */
    @JsonGetter("payment")
    public CreateInvoicePayment getPayment() {
        return payment;
    }

    /**
     * Setter for Payment.
     * @param payment Value for CreateInvoicePayment
     */
    @JsonSetter("payment")
    public void setPayment(CreateInvoicePayment payment) {
        this.payment = payment;
    }

    /**
     * Getter for Type.
     * The type of payment to be applied to an Invoice.
     * @return Returns the InvoicePaymentType
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoicePaymentType getType() {
        return type;
    }

    /**
     * Setter for Type.
     * The type of payment to be applied to an Invoice.
     * @param type Value for InvoicePaymentType
     */
    @JsonSetter("type")
    public void setType(InvoicePaymentType type) {
        this.type = type;
    }

    /**
     * Converts this CreateInvoicePaymentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateInvoicePaymentRequest [" + "payment=" + payment + ", type=" + type + "]";
    }

    /**
     * Builds a new {@link CreateInvoicePaymentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateInvoicePaymentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(payment)
                .type(getType());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateInvoicePaymentRequest}.
     */
    public static class Builder {
        private CreateInvoicePayment payment;
        private InvoicePaymentType type = InvoicePaymentType.EXTERNAL;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  payment  CreateInvoicePayment value for payment.
         */
        public Builder(CreateInvoicePayment payment) {
            this.payment = payment;
        }

        /**
         * Setter for payment.
         * @param  payment  CreateInvoicePayment value for payment.
         * @return Builder
         */
        public Builder payment(CreateInvoicePayment payment) {
            this.payment = payment;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  InvoicePaymentType value for type.
         * @return Builder
         */
        public Builder type(InvoicePaymentType type) {
            this.type = type;
            return this;
        }

        /**
         * Builds a new {@link CreateInvoicePaymentRequest} object using the set fields.
         * @return {@link CreateInvoicePaymentRequest}
         */
        public CreateInvoicePaymentRequest build() {
            return new CreateInvoicePaymentRequest(payment, type);
        }
    }
}
