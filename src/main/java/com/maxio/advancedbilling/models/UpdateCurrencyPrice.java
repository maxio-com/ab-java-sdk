/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UpdateCurrencyPrice type.
 */
public class UpdateCurrencyPrice {
    private int id;
    private int price;

    /**
     * Default constructor.
     */
    public UpdateCurrencyPrice() {
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  price  int value for price.
     */
    public UpdateCurrencyPrice(
            int id,
            int price) {
        this.id = id;
        this.price = price;
    }

    /**
     * Getter for Id.
     * ID of the currency price record being updated
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * ID of the currency price record being updated
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for Price.
     * New price for the given currency
     * @return Returns the int
     */
    @JsonGetter("price")
    public int getPrice() {
        return price;
    }

    /**
     * Setter for Price.
     * New price for the given currency
     * @param price Value for int
     */
    @JsonSetter("price")
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Converts this UpdateCurrencyPrice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateCurrencyPrice [" + "id=" + id + ", price=" + price + "]";
    }

    /**
     * Builds a new {@link UpdateCurrencyPrice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateCurrencyPrice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, price);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateCurrencyPrice}.
     */
    public static class Builder {
        private int id;
        private int price;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  int value for id.
         * @param  price  int value for price.
         */
        public Builder(int id, int price) {
            this.id = id;
            this.price = price;
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
         * Setter for price.
         * @param  price  int value for price.
         * @return Builder
         */
        public Builder price(int price) {
            this.price = price;
            return this;
        }

        /**
         * Builds a new {@link UpdateCurrencyPrice} object using the set fields.
         * @return {@link UpdateCurrencyPrice}
         */
        public UpdateCurrencyPrice build() {
            return new UpdateCurrencyPrice(id, price);
        }
    }
}
