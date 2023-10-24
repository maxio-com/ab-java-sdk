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
 * This is a model class for CreateProductCurrencyPricesRequest type.
 */
public class CreateProductCurrencyPricesRequest {
    private List<CreateProductCurrencyPrice> currencyPrices;

    /**
     * Default constructor.
     */
    public CreateProductCurrencyPricesRequest() {
    }

    /**
     * Initialization constructor.
     * @param  currencyPrices  List of CreateProductCurrencyPrice value for currencyPrices.
     */
    public CreateProductCurrencyPricesRequest(
            List<CreateProductCurrencyPrice> currencyPrices) {
        this.currencyPrices = currencyPrices;
    }

    /**
     * Getter for CurrencyPrices.
     * @return Returns the List of CreateProductCurrencyPrice
     */
    @JsonGetter("currency_prices")
    public List<CreateProductCurrencyPrice> getCurrencyPrices() {
        return currencyPrices;
    }

    /**
     * Setter for CurrencyPrices.
     * @param currencyPrices Value for List of CreateProductCurrencyPrice
     */
    @JsonSetter("currency_prices")
    public void setCurrencyPrices(List<CreateProductCurrencyPrice> currencyPrices) {
        this.currencyPrices = currencyPrices;
    }

    /**
     * Converts this CreateProductCurrencyPricesRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateProductCurrencyPricesRequest [" + "currencyPrices=" + currencyPrices + "]";
    }

    /**
     * Builds a new {@link CreateProductCurrencyPricesRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateProductCurrencyPricesRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(currencyPrices);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateProductCurrencyPricesRequest}.
     */
    public static class Builder {
        private List<CreateProductCurrencyPrice> currencyPrices;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  currencyPrices  List of CreateProductCurrencyPrice value for currencyPrices.
         */
        public Builder(List<CreateProductCurrencyPrice> currencyPrices) {
            this.currencyPrices = currencyPrices;
        }

        /**
         * Setter for currencyPrices.
         * @param  currencyPrices  List of CreateProductCurrencyPrice value for currencyPrices.
         * @return Builder
         */
        public Builder currencyPrices(List<CreateProductCurrencyPrice> currencyPrices) {
            this.currencyPrices = currencyPrices;
            return this;
        }

        /**
         * Builds a new {@link CreateProductCurrencyPricesRequest} object using the set fields.
         * @return {@link CreateProductCurrencyPricesRequest}
         */
        public CreateProductCurrencyPricesRequest build() {
            return new CreateProductCurrencyPricesRequest(currencyPrices);
        }
    }
}
