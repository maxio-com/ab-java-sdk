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
 * This is a model class for UpdateCurrencyPrice type.
 */
public class UpdateCurrencyPrice
        extends BaseModel {
    private int id;
    private double price;

    /**
     * Default constructor.
     */
    public UpdateCurrencyPrice() {
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  price  double value for price.
     */
    public UpdateCurrencyPrice(
            int id,
            double price) {
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
     * @return Returns the double
     */
    @JsonGetter("price")
    public double getPrice() {
        return price;
    }

    /**
     * Setter for Price.
     * New price for the given currency
     * @param price Value for double
     */
    @JsonSetter("price")
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Converts this UpdateCurrencyPrice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateCurrencyPrice [" + "id=" + id + ", price=" + price + ", additionalProperties="
                + getAdditionalProperties() + "]";
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
        private double price;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  int value for id.
         * @param  price  double value for price.
         */
        public Builder(int id, double price) {
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
         * @param  price  double value for price.
         * @return Builder
         */
        public Builder price(double price) {
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
