/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UpdateCouponCurrency type.
 */
public class UpdateCouponCurrency {
    private String currency;
    private int price;

    /**
     * Default constructor.
     */
    public UpdateCouponCurrency() {
    }

    /**
     * Initialization constructor.
     * @param  currency  String value for currency.
     * @param  price  int value for price.
     */
    public UpdateCouponCurrency(
            String currency,
            int price) {
        this.currency = currency;
        this.price = price;
    }

    /**
     * Getter for Currency.
     * ISO code for the site defined currency.
     * @return Returns the String
     */
    @JsonGetter("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * ISO code for the site defined currency.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for Price.
     * Price for the given currency.
     * @return Returns the int
     */
    @JsonGetter("price")
    public int getPrice() {
        return price;
    }

    /**
     * Setter for Price.
     * Price for the given currency.
     * @param price Value for int
     */
    @JsonSetter("price")
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Converts this UpdateCouponCurrency into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateCouponCurrency [" + "currency=" + currency + ", price=" + price + "]";
    }

    /**
     * Builds a new {@link UpdateCouponCurrency.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateCouponCurrency.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(currency, price);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateCouponCurrency}.
     */
    public static class Builder {
        private String currency;
        private int price;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  currency  String value for currency.
         * @param  price  int value for price.
         */
        public Builder(String currency, int price) {
            this.currency = currency;
            this.price = price;
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
         * Builds a new {@link UpdateCouponCurrency} object using the set fields.
         * @return {@link UpdateCouponCurrency}
         */
        public UpdateCouponCurrency build() {
            return new UpdateCouponCurrency(currency, price);
        }
    }
}
