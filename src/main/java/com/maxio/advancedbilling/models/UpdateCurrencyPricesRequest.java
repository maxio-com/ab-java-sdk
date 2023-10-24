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
 * This is a model class for UpdateCurrencyPricesRequest type.
 */
public class UpdateCurrencyPricesRequest {
    private List<UpdateCurrencyPrice> currencyPrices;

    /**
     * Default constructor.
     */
    public UpdateCurrencyPricesRequest() {
    }

    /**
     * Initialization constructor.
     * @param  currencyPrices  List of UpdateCurrencyPrice value for currencyPrices.
     */
    public UpdateCurrencyPricesRequest(
            List<UpdateCurrencyPrice> currencyPrices) {
        this.currencyPrices = currencyPrices;
    }

    /**
     * Getter for CurrencyPrices.
     * @return Returns the List of UpdateCurrencyPrice
     */
    @JsonGetter("currency_prices")
    public List<UpdateCurrencyPrice> getCurrencyPrices() {
        return currencyPrices;
    }

    /**
     * Setter for CurrencyPrices.
     * @param currencyPrices Value for List of UpdateCurrencyPrice
     */
    @JsonSetter("currency_prices")
    public void setCurrencyPrices(List<UpdateCurrencyPrice> currencyPrices) {
        this.currencyPrices = currencyPrices;
    }

    /**
     * Converts this UpdateCurrencyPricesRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateCurrencyPricesRequest [" + "currencyPrices=" + currencyPrices + "]";
    }

    /**
     * Builds a new {@link UpdateCurrencyPricesRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateCurrencyPricesRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(currencyPrices);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateCurrencyPricesRequest}.
     */
    public static class Builder {
        private List<UpdateCurrencyPrice> currencyPrices;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  currencyPrices  List of UpdateCurrencyPrice value for currencyPrices.
         */
        public Builder(List<UpdateCurrencyPrice> currencyPrices) {
            this.currencyPrices = currencyPrices;
        }

        /**
         * Setter for currencyPrices.
         * @param  currencyPrices  List of UpdateCurrencyPrice value for currencyPrices.
         * @return Builder
         */
        public Builder currencyPrices(List<UpdateCurrencyPrice> currencyPrices) {
            this.currencyPrices = currencyPrices;
            return this;
        }

        /**
         * Builds a new {@link UpdateCurrencyPricesRequest} object using the set fields.
         * @return {@link UpdateCurrencyPricesRequest}
         */
        public UpdateCurrencyPricesRequest build() {
            return new UpdateCurrencyPricesRequest(currencyPrices);
        }
    }
}
