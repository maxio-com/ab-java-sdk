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
 * This is a model class for CouponCurrencyRequest type.
 */
public class CouponCurrencyRequest {
    private List<UpdateCouponCurrency> currencyPrices;

    /**
     * Default constructor.
     */
    public CouponCurrencyRequest() {
    }

    /**
     * Initialization constructor.
     * @param  currencyPrices  List of UpdateCouponCurrency value for currencyPrices.
     */
    public CouponCurrencyRequest(
            List<UpdateCouponCurrency> currencyPrices) {
        this.currencyPrices = currencyPrices;
    }

    /**
     * Getter for CurrencyPrices.
     * @return Returns the List of UpdateCouponCurrency
     */
    @JsonGetter("currency_prices")
    public List<UpdateCouponCurrency> getCurrencyPrices() {
        return currencyPrices;
    }

    /**
     * Setter for CurrencyPrices.
     * @param currencyPrices Value for List of UpdateCouponCurrency
     */
    @JsonSetter("currency_prices")
    public void setCurrencyPrices(List<UpdateCouponCurrency> currencyPrices) {
        this.currencyPrices = currencyPrices;
    }

    /**
     * Converts this CouponCurrencyRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CouponCurrencyRequest [" + "currencyPrices=" + currencyPrices + "]";
    }

    /**
     * Builds a new {@link CouponCurrencyRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CouponCurrencyRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(currencyPrices);
        return builder;
    }

    /**
     * Class to build instances of {@link CouponCurrencyRequest}.
     */
    public static class Builder {
        private List<UpdateCouponCurrency> currencyPrices;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  currencyPrices  List of UpdateCouponCurrency value for currencyPrices.
         */
        public Builder(List<UpdateCouponCurrency> currencyPrices) {
            this.currencyPrices = currencyPrices;
        }

        /**
         * Setter for currencyPrices.
         * @param  currencyPrices  List of UpdateCouponCurrency value for currencyPrices.
         * @return Builder
         */
        public Builder currencyPrices(List<UpdateCouponCurrency> currencyPrices) {
            this.currencyPrices = currencyPrices;
            return this;
        }

        /**
         * Builds a new {@link CouponCurrencyRequest} object using the set fields.
         * @return {@link CouponCurrencyRequest}
         */
        public CouponCurrencyRequest build() {
            return new CouponCurrencyRequest(currencyPrices);
        }
    }
}
