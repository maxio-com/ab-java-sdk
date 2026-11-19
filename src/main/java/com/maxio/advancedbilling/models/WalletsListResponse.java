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
 * This is a model class for WalletsListResponse type.
 */
public class WalletsListResponse
        extends BaseModel {
    private List<Wallet> wallets;
    private ListPublicKeysMeta meta;

    /**
     * Default constructor.
     */
    public WalletsListResponse() {
    }

    /**
     * Initialization constructor.
     * @param  wallets  List of Wallet value for wallets.
     * @param  meta  ListPublicKeysMeta value for meta.
     */
    public WalletsListResponse(
            List<Wallet> wallets,
            ListPublicKeysMeta meta) {
        this.wallets = wallets;
        this.meta = meta;
    }

    /**
     * Getter for Wallets.
     * @return Returns the List of Wallet
     */
    @JsonGetter("wallets")
    public List<Wallet> getWallets() {
        return wallets;
    }

    /**
     * Setter for Wallets.
     * @param wallets Value for List of Wallet
     */
    @JsonSetter("wallets")
    public void setWallets(List<Wallet> wallets) {
        this.wallets = wallets;
    }

    /**
     * Getter for Meta.
     * @return Returns the ListPublicKeysMeta
     */
    @JsonGetter("meta")
    public ListPublicKeysMeta getMeta() {
        return meta;
    }

    /**
     * Setter for Meta.
     * @param meta Value for ListPublicKeysMeta
     */
    @JsonSetter("meta")
    public void setMeta(ListPublicKeysMeta meta) {
        this.meta = meta;
    }

    /**
     * Converts this WalletsListResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WalletsListResponse [" + "wallets=" + wallets + ", meta=" + meta
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link WalletsListResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WalletsListResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(wallets, meta);
        return builder;
    }

    /**
     * Class to build instances of {@link WalletsListResponse}.
     */
    public static class Builder {
        private List<Wallet> wallets;
        private ListPublicKeysMeta meta;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  wallets  List of Wallet value for wallets.
         * @param  meta  ListPublicKeysMeta value for meta.
         */
        public Builder(List<Wallet> wallets, ListPublicKeysMeta meta) {
            this.wallets = wallets;
            this.meta = meta;
        }

        /**
         * Setter for wallets.
         * @param  wallets  List of Wallet value for wallets.
         * @return Builder
         */
        public Builder wallets(List<Wallet> wallets) {
            this.wallets = wallets;
            return this;
        }

        /**
         * Setter for meta.
         * @param  meta  ListPublicKeysMeta value for meta.
         * @return Builder
         */
        public Builder meta(ListPublicKeysMeta meta) {
            this.meta = meta;
            return this;
        }

        /**
         * Builds a new {@link WalletsListResponse} object using the set fields.
         * @return {@link WalletsListResponse}
         */
        public WalletsListResponse build() {
            return new WalletsListResponse(wallets, meta);
        }
    }
}
