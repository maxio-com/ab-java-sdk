/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for RefundPrepaymentRequest type.
 */
public class RefundPrepaymentRequest {
    private RefundPrepayment refund;

    /**
     * Default constructor.
     */
    public RefundPrepaymentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  refund  RefundPrepayment value for refund.
     */
    public RefundPrepaymentRequest(
            RefundPrepayment refund) {
        this.refund = refund;
    }

    /**
     * Getter for Refund.
     * @return Returns the RefundPrepayment
     */
    @JsonGetter("refund")
    public RefundPrepayment getRefund() {
        return refund;
    }

    /**
     * Setter for Refund.
     * @param refund Value for RefundPrepayment
     */
    @JsonSetter("refund")
    public void setRefund(RefundPrepayment refund) {
        this.refund = refund;
    }

    /**
     * Converts this RefundPrepaymentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RefundPrepaymentRequest [" + "refund=" + refund + "]";
    }

    /**
     * Builds a new {@link RefundPrepaymentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RefundPrepaymentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(refund);
        return builder;
    }

    /**
     * Class to build instances of {@link RefundPrepaymentRequest}.
     */
    public static class Builder {
        private RefundPrepayment refund;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  refund  RefundPrepayment value for refund.
         */
        public Builder(RefundPrepayment refund) {
            this.refund = refund;
        }

        /**
         * Setter for refund.
         * @param  refund  RefundPrepayment value for refund.
         * @return Builder
         */
        public Builder refund(RefundPrepayment refund) {
            this.refund = refund;
            return this;
        }

        /**
         * Builds a new {@link RefundPrepaymentRequest} object using the set fields.
         * @return {@link RefundPrepaymentRequest}
         */
        public RefundPrepaymentRequest build() {
            return new RefundPrepaymentRequest(refund);
        }
    }
}
