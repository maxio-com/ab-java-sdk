/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreateProductCurrencyPrice type.
 */
public class CreateProductCurrencyPrice {
    private String currency;
    private int price;
    private CurrencyPriceRole role;

    /**
     * Default constructor.
     */
    public CreateProductCurrencyPrice() {
    }

    /**
     * Initialization constructor.
     * @param  currency  String value for currency.
     * @param  price  int value for price.
     * @param  role  CurrencyPriceRole value for role.
     */
    public CreateProductCurrencyPrice(
            String currency,
            int price,
            CurrencyPriceRole role) {
        this.currency = currency;
        this.price = price;
        this.role = role;
    }

    /**
     * Getter for Currency.
     * ISO code for one of the site level currencies.
     * @return Returns the String
     */
    @JsonGetter("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * ISO code for one of the site level currencies.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for Price.
     * Price for the given role.
     * @return Returns the int
     */
    @JsonGetter("price")
    public int getPrice() {
        return price;
    }

    /**
     * Setter for Price.
     * Price for the given role.
     * @param price Value for int
     */
    @JsonSetter("price")
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Getter for Role.
     * Role for the price.
     * @return Returns the CurrencyPriceRole
     */
    @JsonGetter("role")
    public CurrencyPriceRole getRole() {
        return role;
    }

    /**
     * Setter for Role.
     * Role for the price.
     * @param role Value for CurrencyPriceRole
     */
    @JsonSetter("role")
    public void setRole(CurrencyPriceRole role) {
        this.role = role;
    }

    /**
     * Converts this CreateProductCurrencyPrice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateProductCurrencyPrice [" + "currency=" + currency + ", price=" + price
                + ", role=" + role + "]";
    }

    /**
     * Builds a new {@link CreateProductCurrencyPrice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateProductCurrencyPrice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(currency, price, role);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateProductCurrencyPrice}.
     */
    public static class Builder {
        private String currency;
        private int price;
        private CurrencyPriceRole role;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  currency  String value for currency.
         * @param  price  int value for price.
         * @param  role  CurrencyPriceRole value for role.
         */
        public Builder(String currency, int price, CurrencyPriceRole role) {
            this.currency = currency;
            this.price = price;
            this.role = role;
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
         * Setter for price.
         * @param  price  int value for price.
         * @return Builder
         */
        public Builder price(int price) {
            this.price = price;
            return this;
        }

        /**
         * Setter for role.
         * @param  role  CurrencyPriceRole value for role.
         * @return Builder
         */
        public Builder role(CurrencyPriceRole role) {
            this.role = role;
            return this;
        }

        /**
         * Builds a new {@link CreateProductCurrencyPrice} object using the set fields.
         * @return {@link CreateProductCurrencyPrice}
         */
        public CreateProductCurrencyPrice build() {
            return new CreateProductCurrencyPrice(currency, price, role);
        }
    }
}
