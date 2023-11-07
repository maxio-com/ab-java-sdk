/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for ListComponentPricePointsInput type.
 */
public class ListComponentPricePointsInput {
    private int componentId;
    private Boolean currencyPrices;
    private Integer page;
    private Integer perPage;
    private List<PricePointType> filterType;

    /**
     * Default constructor.
     */
    public ListComponentPricePointsInput() {
        page = 1;
        perPage = 20;
    }

    /**
     * Initialization constructor.
     * @param  componentId  int value for componentId.
     * @param  currencyPrices  Boolean value for currencyPrices.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  filterType  List of PricePointType value for filterType.
     */
    public ListComponentPricePointsInput(
            int componentId,
            Boolean currencyPrices,
            Integer page,
            Integer perPage,
            List<PricePointType> filterType) {
        this.componentId = componentId;
        this.currencyPrices = currencyPrices;
        this.page = page;
        this.perPage = perPage;
        this.filterType = filterType;
    }

    /**
     * Getter for ComponentId.
     * The Chargify id of the component
     * @return Returns the int
     */
    @JsonGetter("component_id")
    public int getComponentId() {
        return componentId;
    }

    /**
     * Setter for ComponentId.
     * The Chargify id of the component
     * @param componentId Value for int
     */
    @JsonSetter("component_id")
    public void setComponentId(int componentId) {
        this.componentId = componentId;
    }

    /**
     * Getter for CurrencyPrices.
     * Include an array of currency price data
     * @return Returns the Boolean
     */
    @JsonGetter("currency_prices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getCurrencyPrices() {
        return currencyPrices;
    }

    /**
     * Setter for CurrencyPrices.
     * Include an array of currency price data
     * @param currencyPrices Value for Boolean
     */
    @JsonSetter("currency_prices")
    public void setCurrencyPrices(Boolean currencyPrices) {
        this.currencyPrices = currencyPrices;
    }

    /**
     * Getter for Page.
     * Result records are organized in pages. By default, the first page of results is displayed.
     * The page parameter specifies a page number of results to fetch. You can start navigating
     * through the pages to consume the results. You do this by passing in a page parameter.
     * Retrieve the next page by adding ?page=2 to the query string. If there are no results to
     * return, then an empty result set will be returned. Use in query `page=1`.
     * @return Returns the Integer
     */
    @JsonGetter("page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPage() {
        return page;
    }

    /**
     * Setter for Page.
     * Result records are organized in pages. By default, the first page of results is displayed.
     * The page parameter specifies a page number of results to fetch. You can start navigating
     * through the pages to consume the results. You do this by passing in a page parameter.
     * Retrieve the next page by adding ?page=2 to the query string. If there are no results to
     * return, then an empty result set will be returned. Use in query `page=1`.
     * @param page Value for Integer
     */
    @JsonSetter("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * Getter for PerPage.
     * This parameter indicates how many records to fetch in each request. Default value is 20. The
     * maximum allowed values is 200; any per_page value over 200 will be changed to 200. Use in
     * query `per_page=200`.
     * @return Returns the Integer
     */
    @JsonGetter("per_page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPerPage() {
        return perPage;
    }

    /**
     * Setter for PerPage.
     * This parameter indicates how many records to fetch in each request. Default value is 20. The
     * maximum allowed values is 200; any per_page value over 200 will be changed to 200. Use in
     * query `per_page=200`.
     * @param perPage Value for Integer
     */
    @JsonSetter("per_page")
    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    /**
     * Getter for FilterType.
     * Use in query: `filter[type]=catalog,default`.
     * @return Returns the List of PricePointType
     */
    @JsonGetter("filter[type]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PricePointType> getFilterType() {
        return filterType;
    }

    /**
     * Setter for FilterType.
     * Use in query: `filter[type]=catalog,default`.
     * @param filterType Value for List of PricePointType
     */
    @JsonSetter("filter[type]")
    public void setFilterType(List<PricePointType> filterType) {
        this.filterType = filterType;
    }

    /**
     * Converts this ListComponentPricePointsInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListComponentPricePointsInput [" + "componentId=" + componentId
                + ", currencyPrices=" + currencyPrices + ", page=" + page + ", perPage=" + perPage
                + ", filterType=" + filterType + "]";
    }

    /**
     * Builds a new {@link ListComponentPricePointsInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListComponentPricePointsInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(componentId)
                .currencyPrices(getCurrencyPrices())
                .page(getPage())
                .perPage(getPerPage())
                .filterType(getFilterType());
        return builder;
    }

    /**
     * Class to build instances of {@link ListComponentPricePointsInput}.
     */
    public static class Builder {
        private int componentId;
        private Boolean currencyPrices;
        private Integer page = 1;
        private Integer perPage = 20;
        private List<PricePointType> filterType;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  componentId  int value for componentId.
         */
        public Builder(int componentId) {
            this.componentId = componentId;
        }

        /**
         * Setter for componentId.
         * @param  componentId  int value for componentId.
         * @return Builder
         */
        public Builder componentId(int componentId) {
            this.componentId = componentId;
            return this;
        }

        /**
         * Setter for currencyPrices.
         * @param  currencyPrices  Boolean value for currencyPrices.
         * @return Builder
         */
        public Builder currencyPrices(Boolean currencyPrices) {
            this.currencyPrices = currencyPrices;
            return this;
        }

        /**
         * Setter for page.
         * @param  page  Integer value for page.
         * @return Builder
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Setter for perPage.
         * @param  perPage  Integer value for perPage.
         * @return Builder
         */
        public Builder perPage(Integer perPage) {
            this.perPage = perPage;
            return this;
        }

        /**
         * Setter for filterType.
         * @param  filterType  List of PricePointType value for filterType.
         * @return Builder
         */
        public Builder filterType(List<PricePointType> filterType) {
            this.filterType = filterType;
            return this;
        }

        /**
         * Builds a new {@link ListComponentPricePointsInput} object using the set fields.
         * @return {@link ListComponentPricePointsInput}
         */
        public ListComponentPricePointsInput build() {
            return new ListComponentPricePointsInput(componentId, currencyPrices, page, perPage,
                    filterType);
        }
    }
}
