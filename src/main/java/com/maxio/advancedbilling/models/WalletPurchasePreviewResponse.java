/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for WalletPurchasePreviewResponse type.
 */
public class WalletPurchasePreviewResponse
        extends BaseModel {
    private List<WalletPurchasePreview> walletPurchasePreviews;

    /**
     * Default constructor.
     */
    public WalletPurchasePreviewResponse() {
    }

    /**
     * Initialization constructor.
     * @param  walletPurchasePreviews  List of WalletPurchasePreview value for
     *         walletPurchasePreviews.
     */
    public WalletPurchasePreviewResponse(
            List<WalletPurchasePreview> walletPurchasePreviews) {
        this.walletPurchasePreviews = walletPurchasePreviews;
    }

    /**
     * Getter for WalletPurchasePreviews.
     * @return Returns the List of WalletPurchasePreview
     */
    @JsonGetter("wallet_purchase_previews")
    public List<WalletPurchasePreview> getWalletPurchasePreviews() {
        return walletPurchasePreviews;
    }

    /**
     * Setter for WalletPurchasePreviews.
     * @param walletPurchasePreviews Value for List of WalletPurchasePreview
     */
    @JsonSetter("wallet_purchase_previews")
    public void setWalletPurchasePreviews(List<WalletPurchasePreview> walletPurchasePreviews) {
        this.walletPurchasePreviews = walletPurchasePreviews;
    }

    /**
     * Converts this WalletPurchasePreviewResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WalletPurchasePreviewResponse [" + "walletPurchasePreviews="
                + walletPurchasePreviews + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link WalletPurchasePreviewResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WalletPurchasePreviewResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(walletPurchasePreviews);
        return builder;
    }

    /**
     * Class to build instances of {@link WalletPurchasePreviewResponse}.
     */
    public static class Builder {
        private List<WalletPurchasePreview> walletPurchasePreviews;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  walletPurchasePreviews  List of WalletPurchasePreview value for
         *         walletPurchasePreviews.
         */
        public Builder(List<WalletPurchasePreview> walletPurchasePreviews) {
            this.walletPurchasePreviews = walletPurchasePreviews;
        }

        /**
         * Setter for walletPurchasePreviews.
         * @param  walletPurchasePreviews  List of WalletPurchasePreview value for
         *         walletPurchasePreviews.
         * @return Builder
         */
        public Builder walletPurchasePreviews(
                List<WalletPurchasePreview> walletPurchasePreviews) {
            this.walletPurchasePreviews = walletPurchasePreviews;
            return this;
        }

        /**
         * Builds a new {@link WalletPurchasePreviewResponse} object using the set fields.
         * @return {@link WalletPurchasePreviewResponse}
         */
        public WalletPurchasePreviewResponse build() {
            return new WalletPurchasePreviewResponse(walletPurchasePreviews);
        }
    }
}
