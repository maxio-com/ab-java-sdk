/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for ListPublicKeysResponse type.
 */
public class ListPublicKeysResponse {
    private List<PublicKey> chargifyJsKeys;
    private ListPublicKeysMeta meta;

    /**
     * Default constructor.
     */
    public ListPublicKeysResponse() {
    }

    /**
     * Initialization constructor.
     * @param  chargifyJsKeys  List of PublicKey value for chargifyJsKeys.
     * @param  meta  ListPublicKeysMeta value for meta.
     */
    public ListPublicKeysResponse(
            List<PublicKey> chargifyJsKeys,
            ListPublicKeysMeta meta) {
        this.chargifyJsKeys = chargifyJsKeys;
        this.meta = meta;
    }

    /**
     * Getter for ChargifyJsKeys.
     * @return Returns the List of PublicKey
     */
    @JsonGetter("chargify_js_keys")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PublicKey> getChargifyJsKeys() {
        return chargifyJsKeys;
    }

    /**
     * Setter for ChargifyJsKeys.
     * @param chargifyJsKeys Value for List of PublicKey
     */
    @JsonSetter("chargify_js_keys")
    public void setChargifyJsKeys(List<PublicKey> chargifyJsKeys) {
        this.chargifyJsKeys = chargifyJsKeys;
    }

    /**
     * Getter for Meta.
     * @return Returns the ListPublicKeysMeta
     */
    @JsonGetter("meta")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Converts this ListPublicKeysResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListPublicKeysResponse [" + "chargifyJsKeys=" + chargifyJsKeys + ", meta=" + meta
                + "]";
    }

    /**
     * Builds a new {@link ListPublicKeysResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListPublicKeysResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .chargifyJsKeys(getChargifyJsKeys())
                .meta(getMeta());
        return builder;
    }

    /**
     * Class to build instances of {@link ListPublicKeysResponse}.
     */
    public static class Builder {
        private List<PublicKey> chargifyJsKeys;
        private ListPublicKeysMeta meta;



        /**
         * Setter for chargifyJsKeys.
         * @param  chargifyJsKeys  List of PublicKey value for chargifyJsKeys.
         * @return Builder
         */
        public Builder chargifyJsKeys(List<PublicKey> chargifyJsKeys) {
            this.chargifyJsKeys = chargifyJsKeys;
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
         * Builds a new {@link ListPublicKeysResponse} object using the set fields.
         * @return {@link ListPublicKeysResponse}
         */
        public ListPublicKeysResponse build() {
            return new ListPublicKeysResponse(chargifyJsKeys, meta);
        }
    }
}
