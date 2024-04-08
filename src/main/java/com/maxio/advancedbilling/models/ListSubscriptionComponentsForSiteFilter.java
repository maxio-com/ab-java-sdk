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
 * This is a model class for ListSubscriptionComponentsForSiteFilter type.
 */
public class ListSubscriptionComponentsForSiteFilter
        extends BaseModel {
    private List<String> currencies;
    private Boolean useSiteExchangeRate;
    private SubscriptionFilter subscription;

    /**
     * Default constructor.
     */
    public ListSubscriptionComponentsForSiteFilter() {
    }

    /**
     * Initialization constructor.
     * @param  currencies  List of String value for currencies.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  subscription  SubscriptionFilter value for subscription.
     */
    public ListSubscriptionComponentsForSiteFilter(
            List<String> currencies,
            Boolean useSiteExchangeRate,
            SubscriptionFilter subscription) {
        this.currencies = currencies;
        this.useSiteExchangeRate = useSiteExchangeRate;
        this.subscription = subscription;
    }

    /**
     * Getter for Currencies.
     * Allows fetching components allocation with matching currency based on provided values. Use in
     * query `filter[currencies]=USD,EUR`.
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
     * query `filter[currencies]=USD,EUR`.
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
     * Getter for Subscription.
     * Nested filter used for List Subscription Components For Site Filter
     * @return Returns the SubscriptionFilter
     */
    @JsonGetter("subscription")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionFilter getSubscription() {
        return subscription;
    }

    /**
     * Setter for Subscription.
     * Nested filter used for List Subscription Components For Site Filter
     * @param subscription Value for SubscriptionFilter
     */
    @JsonSetter("subscription")
    public void setSubscription(SubscriptionFilter subscription) {
        this.subscription = subscription;
    }

    /**
     * Converts this ListSubscriptionComponentsForSiteFilter into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListSubscriptionComponentsForSiteFilter [" + "currencies=" + currencies
                + ", useSiteExchangeRate=" + useSiteExchangeRate + ", subscription=" + subscription
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ListSubscriptionComponentsForSiteFilter.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListSubscriptionComponentsForSiteFilter.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .currencies(getCurrencies())
                .useSiteExchangeRate(getUseSiteExchangeRate())
                .subscription(getSubscription());
        return builder;
    }

    /**
     * Class to build instances of {@link ListSubscriptionComponentsForSiteFilter}.
     */
    public static class Builder {
        private List<String> currencies;
        private Boolean useSiteExchangeRate;
        private SubscriptionFilter subscription;



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
         * Setter for subscription.
         * @param  subscription  SubscriptionFilter value for subscription.
         * @return Builder
         */
        public Builder subscription(SubscriptionFilter subscription) {
            this.subscription = subscription;
            return this;
        }

        /**
         * Builds a new {@link ListSubscriptionComponentsForSiteFilter} object using the set fields.
         * @return {@link ListSubscriptionComponentsForSiteFilter}
         */
        public ListSubscriptionComponentsForSiteFilter build() {
            return new ListSubscriptionComponentsForSiteFilter(currencies, useSiteExchangeRate,
                    subscription);
        }
    }
}
