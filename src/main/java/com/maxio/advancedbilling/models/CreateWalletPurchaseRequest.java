/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for CreateWalletPurchaseRequest type.
 */
public class CreateWalletPurchaseRequest
        extends BaseModel {
    private Purchase purchase;

    /**
     * Default constructor.
     */
    public CreateWalletPurchaseRequest() {
    }

    /**
     * Initialization constructor.
     * @param  purchase  Purchase value for purchase.
     */
    public CreateWalletPurchaseRequest(
            Purchase purchase) {
        this.purchase = purchase;
    }

    /**
     * Getter for Purchase.
     * @return Returns the Purchase
     */
    @JsonGetter("purchase")
    public Purchase getPurchase() {
        return purchase;
    }

    /**
     * Setter for Purchase.
     * @param purchase Value for Purchase
     */
    @JsonSetter("purchase")
    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    /**
     * Converts this CreateWalletPurchaseRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateWalletPurchaseRequest [" + "purchase=" + purchase + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CreateWalletPurchaseRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateWalletPurchaseRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(purchase);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateWalletPurchaseRequest}.
     */
    public static class Builder {
        private Purchase purchase;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  purchase  Purchase value for purchase.
         */
        public Builder(Purchase purchase) {
            this.purchase = purchase;
        }

        /**
         * Setter for purchase.
         * @param  purchase  Purchase value for purchase.
         * @return Builder
         */
        public Builder purchase(Purchase purchase) {
            this.purchase = purchase;
            return this;
        }

        /**
         * Builds a new {@link CreateWalletPurchaseRequest} object using the set fields.
         * @return {@link CreateWalletPurchaseRequest}
         */
        public CreateWalletPurchaseRequest build() {
            return new CreateWalletPurchaseRequest(purchase);
        }
    }
}
