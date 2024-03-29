/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for RefundPrepaymentBaseRefundError type.
 */
public class RefundPrepaymentBaseRefundError
        extends BaseModel {
    private BaseRefundError refund;

    /**
     * Default constructor.
     */
    public RefundPrepaymentBaseRefundError() {
    }

    /**
     * Initialization constructor.
     * @param  refund  BaseRefundError value for refund.
     */
    public RefundPrepaymentBaseRefundError(
            BaseRefundError refund) {
        this.refund = refund;
    }

    /**
     * Getter for Refund.
     * @return Returns the BaseRefundError
     */
    @JsonGetter("refund")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BaseRefundError getRefund() {
        return refund;
    }

    /**
     * Setter for Refund.
     * @param refund Value for BaseRefundError
     */
    @JsonSetter("refund")
    public void setRefund(BaseRefundError refund) {
        this.refund = refund;
    }

    /**
     * Converts this RefundPrepaymentBaseRefundError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RefundPrepaymentBaseRefundError [" + "refund=" + refund + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link RefundPrepaymentBaseRefundError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RefundPrepaymentBaseRefundError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .refund(getRefund());
        return builder;
    }

    /**
     * Class to build instances of {@link RefundPrepaymentBaseRefundError}.
     */
    public static class Builder {
        private BaseRefundError refund;



        /**
         * Setter for refund.
         * @param  refund  BaseRefundError value for refund.
         * @return Builder
         */
        public Builder refund(BaseRefundError refund) {
            this.refund = refund;
            return this;
        }

        /**
         * Builds a new {@link RefundPrepaymentBaseRefundError} object using the set fields.
         * @return {@link RefundPrepaymentBaseRefundError}
         */
        public RefundPrepaymentBaseRefundError build() {
            return new RefundPrepaymentBaseRefundError(refund);
        }
    }
}
