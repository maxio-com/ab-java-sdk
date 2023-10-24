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
 * This is a model class for PaymentRelatedEvents type.
 */
public class PaymentRelatedEvents {
    private int productId;
    private int accountTransactionId;

    /**
     * Default constructor.
     */
    public PaymentRelatedEvents() {
    }

    /**
     * Initialization constructor.
     * @param  productId  int value for productId.
     * @param  accountTransactionId  int value for accountTransactionId.
     */
    @JsonCreator
    public PaymentRelatedEvents(
            @JsonProperty("product_id") int productId,
            @JsonProperty("account_transaction_id") int accountTransactionId) {
        this.productId = productId;
        this.accountTransactionId = accountTransactionId;
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
     * Getter for AccountTransactionId.
     * @return Returns the int
     */
    @JsonGetter("account_transaction_id")
    public int getAccountTransactionId() {
        return accountTransactionId;
    }

    /**
     * Setter for AccountTransactionId.
     * @param accountTransactionId Value for int
     */
    @JsonSetter("account_transaction_id")
    public void setAccountTransactionId(int accountTransactionId) {
        this.accountTransactionId = accountTransactionId;
    }

    /**
     * Converts this PaymentRelatedEvents into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentRelatedEvents [" + "productId=" + productId + ", accountTransactionId="
                + accountTransactionId + "]";
    }

    /**
     * Builds a new {@link PaymentRelatedEvents.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentRelatedEvents.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(productId, accountTransactionId);
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentRelatedEvents}.
     */
    public static class Builder {
        private int productId;
        private int accountTransactionId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  productId  int value for productId.
         * @param  accountTransactionId  int value for accountTransactionId.
         */
        public Builder(int productId, int accountTransactionId) {
            this.productId = productId;
            this.accountTransactionId = accountTransactionId;
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
         * Setter for accountTransactionId.
         * @param  accountTransactionId  int value for accountTransactionId.
         * @return Builder
         */
        public Builder accountTransactionId(int accountTransactionId) {
            this.accountTransactionId = accountTransactionId;
            return this;
        }

        /**
         * Builds a new {@link PaymentRelatedEvents} object using the set fields.
         * @return {@link PaymentRelatedEvents}
         */
        public PaymentRelatedEvents build() {
            return new PaymentRelatedEvents(productId, accountTransactionId);
        }
    }
}
