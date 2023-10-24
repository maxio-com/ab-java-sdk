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
 * This is a model class for CreateCurrencyPricesRequest type.
 */
public class CreateCurrencyPricesRequest {
    private List<CreateCurrencyPrice> currencyPrices;

    /**
     * Default constructor.
     */
    public CreateCurrencyPricesRequest() {
    }

    /**
     * Initialization constructor.
     * @param  currencyPrices  List of CreateCurrencyPrice value for currencyPrices.
     */
    public CreateCurrencyPricesRequest(
            List<CreateCurrencyPrice> currencyPrices) {
        this.currencyPrices = currencyPrices;
    }

    /**
     * Getter for CurrencyPrices.
     * @return Returns the List of CreateCurrencyPrice
     */
    @JsonGetter("currency_prices")
    public List<CreateCurrencyPrice> getCurrencyPrices() {
        return currencyPrices;
    }

    /**
     * Setter for CurrencyPrices.
     * @param currencyPrices Value for List of CreateCurrencyPrice
     */
    @JsonSetter("currency_prices")
    public void setCurrencyPrices(List<CreateCurrencyPrice> currencyPrices) {
        this.currencyPrices = currencyPrices;
    }

    /**
     * Converts this CreateCurrencyPricesRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateCurrencyPricesRequest [" + "currencyPrices=" + currencyPrices + "]";
    }

    /**
     * Builds a new {@link CreateCurrencyPricesRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateCurrencyPricesRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(currencyPrices);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateCurrencyPricesRequest}.
     */
    public static class Builder {
        private List<CreateCurrencyPrice> currencyPrices;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  currencyPrices  List of CreateCurrencyPrice value for currencyPrices.
         */
        public Builder(List<CreateCurrencyPrice> currencyPrices) {
            this.currencyPrices = currencyPrices;
        }

        /**
         * Setter for currencyPrices.
         * @param  currencyPrices  List of CreateCurrencyPrice value for currencyPrices.
         * @return Builder
         */
        public Builder currencyPrices(List<CreateCurrencyPrice> currencyPrices) {
            this.currencyPrices = currencyPrices;
            return this;
        }

        /**
         * Builds a new {@link CreateCurrencyPricesRequest} object using the set fields.
         * @return {@link CreateCurrencyPricesRequest}
         */
        public CreateCurrencyPricesRequest build() {
            return new CreateCurrencyPricesRequest(currencyPrices);
        }
    }
}
