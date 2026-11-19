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
 * This is a model class for CreateWalletProductRequest type.
 */
public class CreateWalletProductRequest
        extends BaseModel {
    private WalletProduct walletProduct;

    /**
     * Default constructor.
     */
    public CreateWalletProductRequest() {
    }

    /**
     * Initialization constructor.
     * @param  walletProduct  WalletProduct value for walletProduct.
     */
    public CreateWalletProductRequest(
            WalletProduct walletProduct) {
        this.walletProduct = walletProduct;
    }

    /**
     * Getter for WalletProduct.
     * @return Returns the WalletProduct
     */
    @JsonGetter("wallet_product")
    public WalletProduct getWalletProduct() {
        return walletProduct;
    }

    /**
     * Setter for WalletProduct.
     * @param walletProduct Value for WalletProduct
     */
    @JsonSetter("wallet_product")
    public void setWalletProduct(WalletProduct walletProduct) {
        this.walletProduct = walletProduct;
    }

    /**
     * Converts this CreateWalletProductRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateWalletProductRequest [" + "walletProduct=" + walletProduct
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CreateWalletProductRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateWalletProductRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(walletProduct);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateWalletProductRequest}.
     */
    public static class Builder {
        private WalletProduct walletProduct;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  walletProduct  WalletProduct value for walletProduct.
         */
        public Builder(WalletProduct walletProduct) {
            this.walletProduct = walletProduct;
        }

        /**
         * Setter for walletProduct.
         * @param  walletProduct  WalletProduct value for walletProduct.
         * @return Builder
         */
        public Builder walletProduct(WalletProduct walletProduct) {
            this.walletProduct = walletProduct;
            return this;
        }

        /**
         * Builds a new {@link CreateWalletProductRequest} object using the set fields.
         * @return {@link CreateWalletProductRequest}
         */
        public CreateWalletProductRequest build() {
            return new CreateWalletProductRequest(walletProduct);
        }
    }
}
