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
 * This is a model class for UpdateWalletProductRequest type.
 */
public class UpdateWalletProductRequest
        extends BaseModel {
    private WalletProduct1 walletProduct;

    /**
     * Default constructor.
     */
    public UpdateWalletProductRequest() {
    }

    /**
     * Initialization constructor.
     * @param  walletProduct  WalletProduct1 value for walletProduct.
     */
    public UpdateWalletProductRequest(
            WalletProduct1 walletProduct) {
        this.walletProduct = walletProduct;
    }

    /**
     * Getter for WalletProduct.
     * @return Returns the WalletProduct1
     */
    @JsonGetter("wallet_product")
    public WalletProduct1 getWalletProduct() {
        return walletProduct;
    }

    /**
     * Setter for WalletProduct.
     * @param walletProduct Value for WalletProduct1
     */
    @JsonSetter("wallet_product")
    public void setWalletProduct(WalletProduct1 walletProduct) {
        this.walletProduct = walletProduct;
    }

    /**
     * Converts this UpdateWalletProductRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateWalletProductRequest [" + "walletProduct=" + walletProduct
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link UpdateWalletProductRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateWalletProductRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(walletProduct);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateWalletProductRequest}.
     */
    public static class Builder {
        private WalletProduct1 walletProduct;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  walletProduct  WalletProduct1 value for walletProduct.
         */
        public Builder(WalletProduct1 walletProduct) {
            this.walletProduct = walletProduct;
        }

        /**
         * Setter for walletProduct.
         * @param  walletProduct  WalletProduct1 value for walletProduct.
         * @return Builder
         */
        public Builder walletProduct(WalletProduct1 walletProduct) {
            this.walletProduct = walletProduct;
            return this;
        }

        /**
         * Builds a new {@link UpdateWalletProductRequest} object using the set fields.
         * @return {@link UpdateWalletProductRequest}
         */
        public UpdateWalletProductRequest build() {
            return new UpdateWalletProductRequest(walletProduct);
        }
    }
}
