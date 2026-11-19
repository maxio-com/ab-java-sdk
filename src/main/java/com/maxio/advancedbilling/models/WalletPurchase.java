/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.ZonedDateTime;

/**
 * This is a model class for WalletPurchase type.
 */
public class WalletPurchase
        extends BaseModel {
    private int id;
    private int pricePointId;
    private String invoiceUid;
    private String quantity;
    private ZonedDateTime expiresAt;

    /**
     * Default constructor.
     */
    public WalletPurchase() {
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  pricePointId  int value for pricePointId.
     * @param  invoiceUid  String value for invoiceUid.
     * @param  quantity  String value for quantity.
     * @param  expiresAt  ZonedDateTime value for expiresAt.
     */
    public WalletPurchase(
            int id,
            int pricePointId,
            String invoiceUid,
            String quantity,
            ZonedDateTime expiresAt) {
        this.id = id;
        this.pricePointId = pricePointId;
        this.invoiceUid = invoiceUid;
        this.quantity = quantity;
        this.expiresAt = expiresAt;
    }

    /**
     * Getter for Id.
     * The id of the grant this purchase created. When the wallet was overdrawn by at least the
     * purchased quantity, the units repay the debt and the grant is still created, with `remaining`
     * of `0` and `original` equal to the purchased quantity.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The id of the grant this purchase created. When the wallet was overdrawn by at least the
     * purchased quantity, the units repay the debt and the grant is still created, with `remaining`
     * of `0` and `original` equal to the purchased quantity.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for PricePointId.
     * The price point the purchase was priced at.
     * @return Returns the int
     */
    @JsonGetter("price_point_id")
    public int getPricePointId() {
        return pricePointId;
    }

    /**
     * Setter for PricePointId.
     * The price point the purchase was priced at.
     * @param pricePointId Value for int
     */
    @JsonSetter("price_point_id")
    public void setPricePointId(int pricePointId) {
        this.pricePointId = pricePointId;
    }

    /**
     * Getter for InvoiceUid.
     * The uid of the invoice created to collect payment for this purchase.
     * @return Returns the String
     */
    @JsonGetter("invoice_uid")
    public String getInvoiceUid() {
        return invoiceUid;
    }

    /**
     * Setter for InvoiceUid.
     * The uid of the invoice created to collect payment for this purchase.
     * @param invoiceUid Value for String
     */
    @JsonSetter("invoice_uid")
    public void setInvoiceUid(String invoiceUid) {
        this.invoiceUid = invoiceUid;
    }

    /**
     * Getter for Quantity.
     * The number of units purchased, as a decimal string.
     * @return Returns the String
     */
    @JsonGetter("quantity")
    public String getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * The number of units purchased, as a decimal string.
     * @param quantity Value for String
     */
    @JsonSetter("quantity")
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for ExpiresAt.
     * When the purchased units expire, following the funding entitlement's grant expiration policy.
     * `null` when the wallet has no funding entitlement or its entitlements disagree on an
     * expiration policy.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("expires_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getExpiresAt() {
        return expiresAt;
    }

    /**
     * Setter for ExpiresAt.
     * When the purchased units expire, following the funding entitlement's grant expiration policy.
     * `null` when the wallet has no funding entitlement or its entitlements disagree on an
     * expiration policy.
     * @param expiresAt Value for ZonedDateTime
     */
    @JsonSetter("expires_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setExpiresAt(ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * Converts this WalletPurchase into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WalletPurchase [" + "id=" + id + ", pricePointId=" + pricePointId + ", invoiceUid="
                + invoiceUid + ", quantity=" + quantity + ", expiresAt=" + expiresAt
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link WalletPurchase.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WalletPurchase.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, pricePointId, invoiceUid, quantity, expiresAt);
        return builder;
    }

    /**
     * Class to build instances of {@link WalletPurchase}.
     */
    public static class Builder {
        private int id;
        private int pricePointId;
        private String invoiceUid;
        private String quantity;
        private ZonedDateTime expiresAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  int value for id.
         * @param  pricePointId  int value for pricePointId.
         * @param  invoiceUid  String value for invoiceUid.
         * @param  quantity  String value for quantity.
         * @param  expiresAt  ZonedDateTime value for expiresAt.
         */
        public Builder(int id, int pricePointId, String invoiceUid, String quantity,
                ZonedDateTime expiresAt) {
            this.id = id;
            this.pricePointId = pricePointId;
            this.invoiceUid = invoiceUid;
            this.quantity = quantity;
            this.expiresAt = expiresAt;
        }

        /**
         * Setter for id.
         * @param  id  int value for id.
         * @return Builder
         */
        public Builder id(int id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for pricePointId.
         * @param  pricePointId  int value for pricePointId.
         * @return Builder
         */
        public Builder pricePointId(int pricePointId) {
            this.pricePointId = pricePointId;
            return this;
        }

        /**
         * Setter for invoiceUid.
         * @param  invoiceUid  String value for invoiceUid.
         * @return Builder
         */
        public Builder invoiceUid(String invoiceUid) {
            this.invoiceUid = invoiceUid;
            return this;
        }

        /**
         * Setter for quantity.
         * @param  quantity  String value for quantity.
         * @return Builder
         */
        public Builder quantity(String quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Setter for expiresAt.
         * @param  expiresAt  ZonedDateTime value for expiresAt.
         * @return Builder
         */
        public Builder expiresAt(ZonedDateTime expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * Builds a new {@link WalletPurchase} object using the set fields.
         * @return {@link WalletPurchase}
         */
        public WalletPurchase build() {
            return new WalletPurchase(id, pricePointId, invoiceUid, quantity, expiresAt);
        }
    }
}
