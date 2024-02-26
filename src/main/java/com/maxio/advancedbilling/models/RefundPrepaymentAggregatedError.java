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
 * This is a model class for RefundPrepaymentAggregatedError type.
 */
public class RefundPrepaymentAggregatedError {
    private PrepaymentAggregatedError refund;

    /**
     * Default constructor.
     */
    public RefundPrepaymentAggregatedError() {
    }

    /**
     * Initialization constructor.
     * @param  refund  PrepaymentAggregatedError value for refund.
     */
    public RefundPrepaymentAggregatedError(
            PrepaymentAggregatedError refund) {
        this.refund = refund;
    }

    /**
     * Getter for Refund.
     * @return Returns the PrepaymentAggregatedError
     */
    @JsonGetter("refund")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PrepaymentAggregatedError getRefund() {
        return refund;
    }

    /**
     * Setter for Refund.
     * @param refund Value for PrepaymentAggregatedError
     */
    @JsonSetter("refund")
    public void setRefund(PrepaymentAggregatedError refund) {
        this.refund = refund;
    }

    /**
     * Converts this RefundPrepaymentAggregatedError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RefundPrepaymentAggregatedError [" + "refund=" + refund + "]";
    }

    /**
     * Builds a new {@link RefundPrepaymentAggregatedError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RefundPrepaymentAggregatedError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .refund(getRefund());
        return builder;
    }

    /**
     * Class to build instances of {@link RefundPrepaymentAggregatedError}.
     */
    public static class Builder {
        private PrepaymentAggregatedError refund;



        /**
         * Setter for refund.
         * @param  refund  PrepaymentAggregatedError value for refund.
         * @return Builder
         */
        public Builder refund(PrepaymentAggregatedError refund) {
            this.refund = refund;
            return this;
        }

        /**
         * Builds a new {@link RefundPrepaymentAggregatedError} object using the set fields.
         * @return {@link RefundPrepaymentAggregatedError}
         */
        public RefundPrepaymentAggregatedError build() {
            return new RefundPrepaymentAggregatedError(refund);
        }
    }
}
