/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for RefundSuccess type.
 */
public class RefundSuccess {
    private int refundId;
    private int gatewayTransactionId;
    private int productId;

    /**
     * Default constructor.
     */
    public RefundSuccess() {
    }

    /**
     * Initialization constructor.
     * @param  refundId  int value for refundId.
     * @param  gatewayTransactionId  int value for gatewayTransactionId.
     * @param  productId  int value for productId.
     */
    @JsonCreator
    public RefundSuccess(
            @JsonProperty("refund_id") int refundId,
            @JsonProperty("gateway_transaction_id") int gatewayTransactionId,
            @JsonProperty("product_id") int productId) {
        this.refundId = refundId;
        this.gatewayTransactionId = gatewayTransactionId;
        this.productId = productId;
    }

    /**
     * Getter for RefundId.
     * @return Returns the int
     */
    @JsonGetter("refund_id")
    public int getRefundId() {
        return refundId;
    }

    /**
     * Setter for RefundId.
     * @param refundId Value for int
     */
    @JsonSetter("refund_id")
    public void setRefundId(int refundId) {
        this.refundId = refundId;
    }

    /**
     * Getter for GatewayTransactionId.
     * @return Returns the int
     */
    @JsonGetter("gateway_transaction_id")
    public int getGatewayTransactionId() {
        return gatewayTransactionId;
    }

    /**
     * Setter for GatewayTransactionId.
     * @param gatewayTransactionId Value for int
     */
    @JsonSetter("gateway_transaction_id")
    public void setGatewayTransactionId(int gatewayTransactionId) {
        this.gatewayTransactionId = gatewayTransactionId;
    }

    /**
     * Getter for ProductId.
     * @return Returns the int
     */
    @JsonGetter("product_id")
    public int getProductId() {
        return productId;
    }

    /**
     * Setter for ProductId.
     * @param productId Value for int
     */
    @JsonSetter("product_id")
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * Converts this RefundSuccess into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RefundSuccess [" + "refundId=" + refundId + ", gatewayTransactionId="
                + gatewayTransactionId + ", productId=" + productId + "]";
    }

    /**
     * Builds a new {@link RefundSuccess.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RefundSuccess.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(refundId, gatewayTransactionId, productId);
        return builder;
    }

    /**
     * Class to build instances of {@link RefundSuccess}.
     */
    public static class Builder {
        private int refundId;
        private int gatewayTransactionId;
        private int productId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  refundId  int value for refundId.
         * @param  gatewayTransactionId  int value for gatewayTransactionId.
         * @param  productId  int value for productId.
         */
        public Builder(int refundId, int gatewayTransactionId, int productId) {
            this.refundId = refundId;
            this.gatewayTransactionId = gatewayTransactionId;
            this.productId = productId;
        }

        /**
         * Setter for refundId.
         * @param  refundId  int value for refundId.
         * @return Builder
         */
        public Builder refundId(int refundId) {
            this.refundId = refundId;
            return this;
        }

        /**
         * Setter for gatewayTransactionId.
         * @param  gatewayTransactionId  int value for gatewayTransactionId.
         * @return Builder
         */
        public Builder gatewayTransactionId(int gatewayTransactionId) {
            this.gatewayTransactionId = gatewayTransactionId;
            return this;
        }

        /**
         * Setter for productId.
         * @param  productId  int value for productId.
         * @return Builder
         */
        public Builder productId(int productId) {
            this.productId = productId;
            return this;
        }

        /**
         * Builds a new {@link RefundSuccess} object using the set fields.
         * @return {@link RefundSuccess}
         */
        public RefundSuccess build() {
            return new RefundSuccess(refundId, gatewayTransactionId, productId);
        }
    }
}
