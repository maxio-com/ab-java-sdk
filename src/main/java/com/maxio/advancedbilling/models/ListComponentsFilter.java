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
 * This is a model class for ListComponentsFilter type.
 */
public class ListComponentsFilter
        extends BaseModel {
    private List<Integer> ids;
    private Boolean useSiteExchangeRate;

    /**
     * Default constructor.
     */
    public ListComponentsFilter() {
    }

    /**
     * Initialization constructor.
     * @param  ids  List of Integer value for ids.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     */
    public ListComponentsFilter(
            List<Integer> ids,
            Boolean useSiteExchangeRate) {
        this.ids = ids;
        this.useSiteExchangeRate = useSiteExchangeRate;
    }

    /**
     * Getter for Ids.
     * Allows fetching components with matching id based on provided value. Use in query
     * `filter[ids]=1,2,3`.
     * @return Returns the List of Integer
     */
    @JsonGetter("ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getIds() {
        return ids;
    }

    /**
     * Setter for Ids.
     * Allows fetching components with matching id based on provided value. Use in query
     * `filter[ids]=1,2,3`.
     * @param ids Value for List of Integer
     */
    @JsonSetter("ids")
    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    /**
     * Getter for UseSiteExchangeRate.
     * Allows fetching components with matching use_site_exchange_rate based on provided value
     * (refers to default price point). Use in query `filter[use_site_exchange_rate]=true`.
     * @return Returns the Boolean
     */
    @JsonGetter("use_site_exchange_rate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getUseSiteExchangeRate() {
        return useSiteExchangeRate;
    }

    /**
     * Setter for UseSiteExchangeRate.
     * Allows fetching components with matching use_site_exchange_rate based on provided value
     * (refers to default price point). Use in query `filter[use_site_exchange_rate]=true`.
     * @param useSiteExchangeRate Value for Boolean
     */
    @JsonSetter("use_site_exchange_rate")
    public void setUseSiteExchangeRate(Boolean useSiteExchangeRate) {
        this.useSiteExchangeRate = useSiteExchangeRate;
    }

    /**
     * Converts this ListComponentsFilter into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListComponentsFilter [" + "ids=" + ids + ", useSiteExchangeRate="
                + useSiteExchangeRate + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .ids(getIds())
                .useSiteExchangeRate(getUseSiteExchangeRate());
        return builder;
    }

    /**
     * Class to build instances of {@link ListComponentsFilter}.
     */
    public static class Builder {
        private List<Integer> ids;
        private Boolean useSiteExchangeRate;



        /**
         * Setter for ids.
         * @param  ids  List of Integer value for ids.
         * @return Builder
         */
        public Builder ids(List<Integer> ids) {
            this.ids = ids;
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
         * Builds a new {@link ListComponentsFilter} object using the set fields.
         * @return {@link ListComponentsFilter}
         */
        public ListComponentsFilter build() {
            return new ListComponentsFilter(ids, useSiteExchangeRate);
        }
    }
}
