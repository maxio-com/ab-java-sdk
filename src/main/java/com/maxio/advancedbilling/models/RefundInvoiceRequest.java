/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.RefundInvoiceRequestRefund;

/**
 * This is a model class for RefundInvoiceRequest type.
 */
public class RefundInvoiceRequest {
    private RefundInvoiceRequestRefund refund;

    /**
     * Default constructor.
     */
    public RefundInvoiceRequest() {
    }

    /**
     * Initialization constructor.
     * @param  refund  RefundInvoiceRequestRefund value for refund.
     */
    public RefundInvoiceRequest(
            RefundInvoiceRequestRefund refund) {
        this.refund = refund;
    }

    /**
     * Getter for Refund.
     * @return Returns the RefundInvoiceRequestRefund
     */
    @JsonGetter("refund")
    public RefundInvoiceRequestRefund getRefund() {
        return refund;
    }

    /**
     * Setter for Refund.
     * @param refund Value for RefundInvoiceRequestRefund
     */
    @JsonSetter("refund")
    public void setRefund(RefundInvoiceRequestRefund refund) {
        this.refund = refund;
    }

    /**
     * Converts this RefundInvoiceRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RefundInvoiceRequest [" + "refund=" + refund + "]";
    }

    /**
     * Builds a new {@link RefundInvoiceRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RefundInvoiceRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(refund);
        return builder;
    }

    /**
     * Class to build instances of {@link RefundInvoiceRequest}.
     */
    public static class Builder {
        private RefundInvoiceRequestRefund refund;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  refund  RefundInvoiceRequestRefund value for refund.
         */
        public Builder(RefundInvoiceRequestRefund refund) {
            this.refund = refund;
        }

        /**
         * Setter for refund.
         * @param  refund  RefundInvoiceRequestRefund value for refund.
         * @return Builder
         */
        public Builder refund(RefundInvoiceRequestRefund refund) {
            this.refund = refund;
            return this;
        }

        /**
         * Builds a new {@link RefundInvoiceRequest} object using the set fields.
         * @return {@link RefundInvoiceRequest}
         */
        public RefundInvoiceRequest build() {
            return new RefundInvoiceRequest(refund);
        }
    }
}
