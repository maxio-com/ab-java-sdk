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
 * This is a model class for WalletProductsListResponse type.
 */
public class WalletProductsListResponse
        extends BaseModel {
    private List<WalletProductListItem> walletProducts;
    private int totalCount;
    private int archivedCount;

    /**
     * Default constructor.
     */
    public WalletProductsListResponse() {
    }

    /**
     * Initialization constructor.
     * @param  walletProducts  List of WalletProductListItem value for walletProducts.
     * @param  totalCount  int value for totalCount.
     * @param  archivedCount  int value for archivedCount.
     */
    public WalletProductsListResponse(
            List<WalletProductListItem> walletProducts,
            int totalCount,
            int archivedCount) {
        this.walletProducts = walletProducts;
        this.totalCount = totalCount;
        this.archivedCount = archivedCount;
    }

    /**
     * Getter for WalletProducts.
     * @return Returns the List of WalletProductListItem
     */
    @JsonGetter("wallet_products")
    public List<WalletProductListItem> getWalletProducts() {
        return walletProducts;
    }

    /**
     * Setter for WalletProducts.
     * @param walletProducts Value for List of WalletProductListItem
     */
    @JsonSetter("wallet_products")
    public void setWalletProducts(List<WalletProductListItem> walletProducts) {
        this.walletProducts = walletProducts;
    }

    /**
     * Getter for TotalCount.
     * Total number of Wallet Products matching the filters, across all pages.
     * @return Returns the int
     */
    @JsonGetter("total_count")
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Setter for TotalCount.
     * Total number of Wallet Products matching the filters, across all pages.
     * @param totalCount Value for int
     */
    @JsonSetter("total_count")
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * Getter for ArchivedCount.
     * Not a simple count of archived products matching the filters. With `status=archived`, equals
     * `total_count` (there's nothing else to report). With any other `status`, it's `0` whenever
     * `total_count` is non-zero, and only when `total_count` is `0` does it become the number of
     * archived Wallet Products matching the same `q` search term (ignoring `status`): an
     * empty-state hint, not a running total.
     * @return Returns the int
     */
    @JsonGetter("archived_count")
    public int getArchivedCount() {
        return archivedCount;
    }

    /**
     * Setter for ArchivedCount.
     * Not a simple count of archived products matching the filters. With `status=archived`, equals
     * `total_count` (there's nothing else to report). With any other `status`, it's `0` whenever
     * `total_count` is non-zero, and only when `total_count` is `0` does it become the number of
     * archived Wallet Products matching the same `q` search term (ignoring `status`): an
     * empty-state hint, not a running total.
     * @param archivedCount Value for int
     */
    @JsonSetter("archived_count")
    public void setArchivedCount(int archivedCount) {
        this.archivedCount = archivedCount;
    }

    /**
     * Converts this WalletProductsListResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WalletProductsListResponse [" + "walletProducts=" + walletProducts + ", totalCount="
                + totalCount + ", archivedCount=" + archivedCount + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link WalletProductsListResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WalletProductsListResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(walletProducts, totalCount, archivedCount);
        return builder;
    }

    /**
     * Class to build instances of {@link WalletProductsListResponse}.
     */
    public static class Builder {
        private List<WalletProductListItem> walletProducts;
        private int totalCount;
        private int archivedCount;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  walletProducts  List of WalletProductListItem value for walletProducts.
         * @param  totalCount  int value for totalCount.
         * @param  archivedCount  int value for archivedCount.
         */
        public Builder(List<WalletProductListItem> walletProducts, int totalCount,
                int archivedCount) {
            this.walletProducts = walletProducts;
            this.totalCount = totalCount;
            this.archivedCount = archivedCount;
        }

        /**
         * Setter for walletProducts.
         * @param  walletProducts  List of WalletProductListItem value for walletProducts.
         * @return Builder
         */
        public Builder walletProducts(List<WalletProductListItem> walletProducts) {
            this.walletProducts = walletProducts;
            return this;
        }

        /**
         * Setter for totalCount.
         * @param  totalCount  int value for totalCount.
         * @return Builder
         */
        public Builder totalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Setter for archivedCount.
         * @param  archivedCount  int value for archivedCount.
         * @return Builder
         */
        public Builder archivedCount(int archivedCount) {
            this.archivedCount = archivedCount;
            return this;
        }

        /**
         * Builds a new {@link WalletProductsListResponse} object using the set fields.
         * @return {@link WalletProductsListResponse}
         */
        public WalletProductsListResponse build() {
            return new WalletProductsListResponse(walletProducts, totalCount, archivedCount);
        }
    }
}
