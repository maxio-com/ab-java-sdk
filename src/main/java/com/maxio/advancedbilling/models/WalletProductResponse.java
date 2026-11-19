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
 * This is a model class for WalletProductResponse type.
 */
public class WalletProductResponse
        extends BaseModel {
    private Component walletProduct;

    /**
     * Default constructor.
     */
    public WalletProductResponse() {
    }

    /**
     * Initialization constructor.
     * @param  walletProduct  Component value for walletProduct.
     */
    public WalletProductResponse(
            Component walletProduct) {
        this.walletProduct = walletProduct;
    }

    /**
     * Getter for WalletProduct.
     * @return Returns the Component
     */
    @JsonGetter("wallet_product")
    public Component getWalletProduct() {
        return walletProduct;
    }

    /**
     * Setter for WalletProduct.
     * @param walletProduct Value for Component
     */
    @JsonSetter("wallet_product")
    public void setWalletProduct(Component walletProduct) {
        this.walletProduct = walletProduct;
    }

    /**
     * Converts this WalletProductResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WalletProductResponse [" + "walletProduct=" + walletProduct
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link WalletProductResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WalletProductResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(walletProduct);
        return builder;
    }

    /**
     * Class to build instances of {@link WalletProductResponse}.
     */
    public static class Builder {
        private Component walletProduct;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  walletProduct  Component value for walletProduct.
         */
        public Builder(Component walletProduct) {
            this.walletProduct = walletProduct;
        }

        /**
         * Setter for walletProduct.
         * @param  walletProduct  Component value for walletProduct.
         * @return Builder
         */
        public Builder walletProduct(Component walletProduct) {
            this.walletProduct = walletProduct;
            return this;
        }

        /**
         * Builds a new {@link WalletProductResponse} object using the set fields.
         * @return {@link WalletProductResponse}
         */
        public WalletProductResponse build() {
            return new WalletProductResponse(walletProduct);
        }
    }
}
