/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for CouponCurrencyResponse type.
 */
public class CouponCurrencyResponse
        extends BaseModel {
    private List<CouponCurrency> currencyPrices;

    /**
     * Default constructor.
     */
    public CouponCurrencyResponse() {
    }

    /**
     * Initialization constructor.
     * @param  currencyPrices  List of CouponCurrency value for currencyPrices.
     */
    public CouponCurrencyResponse(
            List<CouponCurrency> currencyPrices) {
        this.currencyPrices = currencyPrices;
    }

    /**
     * Getter for CurrencyPrices.
     * @return Returns the List of CouponCurrency
     */
    @JsonGetter("currency_prices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CouponCurrency> getCurrencyPrices() {
        return currencyPrices;
    }

    /**
     * Setter for CurrencyPrices.
     * @param currencyPrices Value for List of CouponCurrency
     */
    @JsonSetter("currency_prices")
    public void setCurrencyPrices(List<CouponCurrency> currencyPrices) {
        this.currencyPrices = currencyPrices;
    }

    /**
     * Converts this CouponCurrencyResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CouponCurrencyResponse [" + "currencyPrices=" + currencyPrices
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .currencyPrices(getCurrencyPrices());
        return builder;
    }

    /**
     * Class to build instances of {@link CouponCurrencyResponse}.
     */
    public static class Builder {
        private List<CouponCurrency> currencyPrices;



        /**
         * Setter for currencyPrices.
         * @param  currencyPrices  List of CouponCurrency value for currencyPrices.
         * @return Builder
         */
        public Builder currencyPrices(List<CouponCurrency> currencyPrices) {
            this.currencyPrices = currencyPrices;
            return this;
        }

        /**
         * Builds a new {@link CouponCurrencyResponse} object using the set fields.
         * @return {@link CouponCurrencyResponse}
         */
        public CouponCurrencyResponse build() {
            return new CouponCurrencyResponse(currencyPrices);
        }
    }
}
