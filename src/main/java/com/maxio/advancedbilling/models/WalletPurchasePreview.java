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
 * This is a model class for WalletPurchasePreview type.
 */
public class WalletPurchasePreview
        extends BaseModel {
    private int pricePointId;
    private String currency;
    private String quantity;
    private String amount;

    /**
     * Default constructor.
     */
    public WalletPurchasePreview() {
    }

    /**
     * Initialization constructor.
     * @param  pricePointId  int value for pricePointId.
     * @param  currency  String value for currency.
     * @param  quantity  String value for quantity.
     * @param  amount  String value for amount.
     */
    public WalletPurchasePreview(
            int pricePointId,
            String currency,
            String quantity,
            String amount) {
        this.pricePointId = pricePointId;
        this.currency = currency;
        this.quantity = quantity;
        this.amount = amount;
    }

    /**
     * Getter for PricePointId.
     * @return Returns the int
     */
    @JsonGetter("price_point_id")
    public int getPricePointId() {
        return pricePointId;
    }

    /**
     * Setter for PricePointId.
     * @param pricePointId Value for int
     */
    @JsonSetter("price_point_id")
    public void setPricePointId(int pricePointId) {
        this.pricePointId = pricePointId;
    }

    /**
     * Getter for Currency.
     * The three-letter currency code the `amount` is denominated in, matching the subscription's
     * currency.
     * @return Returns the String
     */
    @JsonGetter("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * The three-letter currency code the `amount` is denominated in, matching the subscription's
     * currency.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for Quantity.
     * The number of units the quote is for, as a decimal string.
     * @return Returns the String
     */
    @JsonGetter("quantity")
    public String getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * The number of units the quote is for, as a decimal string.
     * @param quantity Value for String
     */
    @JsonSetter("quantity")
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for Amount.
     * The price for `quantity` units at this price point, as a decimal string.
     * @return Returns the String
     */
    @JsonGetter("amount")
    public String getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * The price for `quantity` units at this price point, as a decimal string.
     * @param amount Value for String
     */
    @JsonSetter("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * Converts this WalletPurchasePreview into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WalletPurchasePreview [" + "pricePointId=" + pricePointId + ", currency=" + currency
                + ", quantity=" + quantity + ", amount=" + amount + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link WalletPurchasePreview.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WalletPurchasePreview.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(pricePointId, currency, quantity, amount);
        return builder;
    }

    /**
     * Class to build instances of {@link WalletPurchasePreview}.
     */
    public static class Builder {
        private int pricePointId;
        private String currency;
        private String quantity;
        private String amount;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  pricePointId  int value for pricePointId.
         * @param  currency  String value for currency.
         * @param  quantity  String value for quantity.
         * @param  amount  String value for amount.
         */
        public Builder(int pricePointId, String currency, String quantity, String amount) {
            this.pricePointId = pricePointId;
            this.currency = currency;
            this.quantity = quantity;
            this.amount = amount;
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
         * Setter for currency.
         * @param  currency  String value for currency.
         * @return Builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
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
         * Setter for amount.
         * @param  amount  String value for amount.
         * @return Builder
         */
        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Builds a new {@link WalletPurchasePreview} object using the set fields.
         * @return {@link WalletPurchasePreview}
         */
        public WalletPurchasePreview build() {
            return new WalletPurchasePreview(pricePointId, currency, quantity, amount);
        }
    }
}
