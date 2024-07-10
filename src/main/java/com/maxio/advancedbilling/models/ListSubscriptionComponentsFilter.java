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
 * This is a model class for ListSubscriptionComponentsFilter type.
 */
public class ListSubscriptionComponentsFilter
        extends BaseModel {
    private List<String> currencies;
    private Boolean useSiteExchangeRate;

    /**
     * Default constructor.
     */
    public ListSubscriptionComponentsFilter() {
    }

    /**
     * Initialization constructor.
     * @param  currencies  List of String value for currencies.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     */
    public ListSubscriptionComponentsFilter(
            List<String> currencies,
            Boolean useSiteExchangeRate) {
        this.currencies = currencies;
        this.useSiteExchangeRate = useSiteExchangeRate;
    }

    /**
     * Getter for Currencies.
     * Allows fetching components allocation with matching currency based on provided values. Use in
     * query `filter[currencies]=EUR,USD`.
     * @return Returns the List of String
     */
    @JsonGetter("currencies")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getCurrencies() {
        return currencies;
    }

    /**
     * Setter for Currencies.
     * Allows fetching components allocation with matching currency based on provided values. Use in
     * query `filter[currencies]=EUR,USD`.
     * @param currencies Value for List of String
     */
    @JsonSetter("currencies")
    public void setCurrencies(List<String> currencies) {
        this.currencies = currencies;
    }

    /**
     * Getter for UseSiteExchangeRate.
     * Allows fetching components allocation with matching use_site_exchange_rate based on provided
     * value. Use in query `filter[use_site_exchange_rate]=true`.
     * @return Returns the Boolean
     */
    @JsonGetter("use_site_exchange_rate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getUseSiteExchangeRate() {
        return useSiteExchangeRate;
    }

    /**
     * Setter for UseSiteExchangeRate.
     * Allows fetching components allocation with matching use_site_exchange_rate based on provided
     * value. Use in query `filter[use_site_exchange_rate]=true`.
     * @param useSiteExchangeRate Value for Boolean
     */
    @JsonSetter("use_site_exchange_rate")
    public void setUseSiteExchangeRate(Boolean useSiteExchangeRate) {
        this.useSiteExchangeRate = useSiteExchangeRate;
    }

    /**
     * Converts this ListSubscriptionComponentsFilter into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListSubscriptionComponentsFilter [" + "currencies=" + currencies
                + ", useSiteExchangeRate=" + useSiteExchangeRate + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .currencies(getCurrencies())
                .useSiteExchangeRate(getUseSiteExchangeRate());
        return builder;
    }

    /**
     * Class to build instances of {@link ListSubscriptionComponentsFilter}.
     */
    public static class Builder {
        private List<String> currencies;
        private Boolean useSiteExchangeRate;



        /**
         * Setter for currencies.
         * @param  currencies  List of String value for currencies.
         * @return Builder
         */
        public Builder currencies(List<String> currencies) {
            this.currencies = currencies;
            return this;
        }

        /**
         * Setter for useSiteExchangeRate.
         * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
         * @return Builder
         */
        public Builder useSiteExchangeRate(Boolean useSiteExchangeRate) {
            this.useSiteExchangeRate = useSiteExchangeRate;
            return this;
        }

        /**
         * Builds a new {@link ListSubscriptionComponentsFilter} object using the set fields.
         * @return {@link ListSubscriptionComponentsFilter}
         */
        public ListSubscriptionComponentsFilter build() {
            return new ListSubscriptionComponentsFilter(currencies, useSiteExchangeRate);
        }
    }
}
