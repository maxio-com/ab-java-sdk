/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for RecordPaymentRequest type.
 */
public class RecordPaymentRequest {
    private CreatePayment payment;

    /**
     * Default constructor.
     */
    public RecordPaymentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  payment  CreatePayment value for payment.
     */
    public RecordPaymentRequest(
            CreatePayment payment) {
        this.payment = payment;
    }

    /**
     * Getter for Payment.
     * @return Returns the CreatePayment
     */
    @JsonGetter("payment")
    public CreatePayment getPayment() {
        return payment;
    }

    /**
     * Setter for Payment.
     * @param payment Value for CreatePayment
     */
    @JsonSetter("payment")
    public void setPayment(CreatePayment payment) {
        this.payment = payment;
    }

    /**
     * Converts this RecordPaymentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RecordPaymentRequest [" + "payment=" + payment + "]";
    }

    /**
     * Builds a new {@link RecordPaymentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RecordPaymentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(payment);
        return builder;
    }

    /**
     * Class to build instances of {@link RecordPaymentRequest}.
     */
    public static class Builder {
        private CreatePayment payment;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  payment  CreatePayment value for payment.
         */
        public Builder(CreatePayment payment) {
            this.payment = payment;
        }

        /**
         * Setter for payment.
         * @param  payment  CreatePayment value for payment.
         * @return Builder
         */
        public Builder payment(CreatePayment payment) {
            this.payment = payment;
            return this;
        }

        /**
         * Builds a new {@link RecordPaymentRequest} object using the set fields.
         * @return {@link RecordPaymentRequest}
         */
        public RecordPaymentRequest build() {
            return new RecordPaymentRequest(payment);
        }
    }
}
