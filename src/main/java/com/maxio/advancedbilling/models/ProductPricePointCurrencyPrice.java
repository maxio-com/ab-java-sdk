/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for ProductPricePointCurrencyPrice type.
 */
public class ProductPricePointCurrencyPrice {
    private List<CurrencyPrice> currencyPrices;

    /**
     * Default constructor.
     */
    public ProductPricePointCurrencyPrice() {
    }

    /**
     * Initialization constructor.
     * @param  currencyPrices  List of CurrencyPrice value for currencyPrices.
     */
    public ProductPricePointCurrencyPrice(
            List<CurrencyPrice> currencyPrices) {
        this.currencyPrices = currencyPrices;
    }

    /**
     * Getter for CurrencyPrices.
     * @return Returns the List of CurrencyPrice
     */
    @JsonGetter("currency_prices")
    public List<CurrencyPrice> getCurrencyPrices() {
        return currencyPrices;
    }

    /**
     * Setter for CurrencyPrices.
     * @param currencyPrices Value for List of CurrencyPrice
     */
    @JsonSetter("currency_prices")
    public void setCurrencyPrices(List<CurrencyPrice> currencyPrices) {
        this.currencyPrices = currencyPrices;
    }

    /**
     * Converts this ProductPricePointCurrencyPrice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProductPricePointCurrencyPrice [" + "currencyPrices=" + currencyPrices + "]";
    }

    /**
     * Builds a new {@link ProductPricePointCurrencyPrice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProductPricePointCurrencyPrice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(currencyPrices);
        return builder;
    }

    /**
     * Class to build instances of {@link ProductPricePointCurrencyPrice}.
     */
    public static class Builder {
        private List<CurrencyPrice> currencyPrices;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  currencyPrices  List of CurrencyPrice value for currencyPrices.
         */
        public Builder(List<CurrencyPrice> currencyPrices) {
            this.currencyPrices = currencyPrices;
        }

        /**
         * Setter for currencyPrices.
         * @param  currencyPrices  List of CurrencyPrice value for currencyPrices.
         * @return Builder
         */
        public Builder currencyPrices(List<CurrencyPrice> currencyPrices) {
            this.currencyPrices = currencyPrices;
            return this;
        }

        /**
         * Builds a new {@link ProductPricePointCurrencyPrice} object using the set fields.
         * @return {@link ProductPricePointCurrencyPrice}
         */
        public ProductPricePointCurrencyPrice build() {
            return new ProductPricePointCurrencyPrice(currencyPrices);
        }
    }
}
