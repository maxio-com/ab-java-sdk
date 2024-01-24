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
 * This is a model class for ComponentCurrencyPricesResponse type.
 */
public class ComponentCurrencyPricesResponse {
    private List<ComponentCurrencyPrice> currencyPrices;

    /**
     * Default constructor.
     */
    public ComponentCurrencyPricesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  currencyPrices  List of ComponentCurrencyPrice value for currencyPrices.
     */
    public ComponentCurrencyPricesResponse(
            List<ComponentCurrencyPrice> currencyPrices) {
        this.currencyPrices = currencyPrices;
    }

    /**
     * Getter for CurrencyPrices.
     * @return Returns the List of ComponentCurrencyPrice
     */
    @JsonGetter("currency_prices")
    public List<ComponentCurrencyPrice> getCurrencyPrices() {
        return currencyPrices;
    }

    /**
     * Setter for CurrencyPrices.
     * @param currencyPrices Value for List of ComponentCurrencyPrice
     */
    @JsonSetter("currency_prices")
    public void setCurrencyPrices(List<ComponentCurrencyPrice> currencyPrices) {
        this.currencyPrices = currencyPrices;
    }

    /**
     * Converts this ComponentCurrencyPricesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ComponentCurrencyPricesResponse [" + "currencyPrices=" + currencyPrices + "]";
    }

    /**
     * Builds a new {@link ComponentCurrencyPricesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ComponentCurrencyPricesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(currencyPrices);
        return builder;
    }

    /**
     * Class to build instances of {@link ComponentCurrencyPricesResponse}.
     */
    public static class Builder {
        private List<ComponentCurrencyPrice> currencyPrices;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  currencyPrices  List of ComponentCurrencyPrice value for currencyPrices.
         */
        public Builder(List<ComponentCurrencyPrice> currencyPrices) {
            this.currencyPrices = currencyPrices;
        }

        /**
         * Setter for currencyPrices.
         * @param  currencyPrices  List of ComponentCurrencyPrice value for currencyPrices.
         * @return Builder
         */
        public Builder currencyPrices(List<ComponentCurrencyPrice> currencyPrices) {
            this.currencyPrices = currencyPrices;
            return this;
        }

        /**
         * Builds a new {@link ComponentCurrencyPricesResponse} object using the set fields.
         * @return {@link ComponentCurrencyPricesResponse}
         */
        public ComponentCurrencyPricesResponse build() {
            return new ComponentCurrencyPricesResponse(currencyPrices);
        }
    }
}
