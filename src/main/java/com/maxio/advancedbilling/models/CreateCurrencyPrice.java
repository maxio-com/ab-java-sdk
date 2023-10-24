/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreateCurrencyPrice type.
 */
public class CreateCurrencyPrice {
    private String currency;
    private Integer price;
    private Integer priceId;

    /**
     * Default constructor.
     */
    public CreateCurrencyPrice() {
    }

    /**
     * Initialization constructor.
     * @param  currency  String value for currency.
     * @param  price  Integer value for price.
     * @param  priceId  Integer value for priceId.
     */
    public CreateCurrencyPrice(
            String currency,
            Integer price,
            Integer priceId) {
        this.currency = currency;
        this.price = price;
        this.priceId = priceId;
    }

    /**
     * Getter for Currency.
     * ISO code for a currency defined on the site level
     * @return Returns the String
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * ISO code for a currency defined on the site level
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for Price.
     * Price for the price level in this currency
     * @return Returns the Integer
     */
    @JsonGetter("price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPrice() {
        return price;
    }

    /**
     * Setter for Price.
     * Price for the price level in this currency
     * @param price Value for Integer
     */
    @JsonSetter("price")
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * Getter for PriceId.
     * ID of the price that this corresponds with
     * @return Returns the Integer
     */
    @JsonGetter("price_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPriceId() {
        return priceId;
    }

    /**
     * Setter for PriceId.
     * ID of the price that this corresponds with
     * @param priceId Value for Integer
     */
    @JsonSetter("price_id")
    public void setPriceId(Integer priceId) {
        this.priceId = priceId;
    }

    /**
     * Converts this CreateCurrencyPrice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateCurrencyPrice [" + "currency=" + currency + ", price=" + price + ", priceId="
                + priceId + "]";
    }

    /**
     * Builds a new {@link CreateCurrencyPrice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateCurrencyPrice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .currency(getCurrency())
                .price(getPrice())
                .priceId(getPriceId());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateCurrencyPrice}.
     */
    public static class Builder {
        private String currency;
        private Integer price;
        private Integer priceId;



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
         * @param  price  Integer value for price.
         * @return Builder
         */
        public Builder price(Integer price) {
            this.price = price;
            return this;
        }

        /**
         * Setter for priceId.
         * @param  priceId  Integer value for priceId.
         * @return Builder
         */
        public Builder priceId(Integer priceId) {
            this.priceId = priceId;
            return this;
        }

        /**
         * Builds a new {@link CreateCurrencyPrice} object using the set fields.
         * @return {@link CreateCurrencyPrice}
         */
        public CreateCurrencyPrice build() {
            return new CreateCurrencyPrice(currency, price, priceId);
        }
    }
}
