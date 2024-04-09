/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ListAllComponentPricePointsInput type.
 */
public class ListAllComponentPricePointsInput {
    private ListComponentsPricePointsInclude include;
    private Integer page;
    private Integer perPage;
    private SortingDirection direction;
    private ListPricePointsFilter filter;

    /**
     * Default constructor.
     */
    public ListAllComponentPricePointsInput() {
        page = 1;
        perPage = 20;
    }

    /**
     * Initialization constructor.
     * @param  include  ListComponentsPricePointsInclude value for include.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  direction  SortingDirection value for direction.
     * @param  filter  ListPricePointsFilter value for filter.
     */
    public ListAllComponentPricePointsInput(
            ListComponentsPricePointsInclude include,
            Integer page,
            Integer perPage,
            SortingDirection direction,
            ListPricePointsFilter filter) {
        this.include = include;
        this.page = page;
        this.perPage = perPage;
        this.direction = direction;
        this.filter = filter;
    }

    /**
     * Getter for Include.
     * Allows including additional data in the response. Use in query: `include=currency_prices`.
     * @return Returns the ListComponentsPricePointsInclude
     */
    @JsonGetter("include")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListComponentsPricePointsInclude getInclude() {
        return include;
    }

    /**
     * Setter for Include.
     * Allows including additional data in the response. Use in query: `include=currency_prices`.
     * @param include Value for ListComponentsPricePointsInclude
     */
    @JsonSetter("include")
    public void setInclude(ListComponentsPricePointsInclude include) {
        this.include = include;
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
     * Getter for Direction.
     * Controls the order in which results are returned. Use in query `direction=asc`.
     * @return Returns the SortingDirection
     */
    @JsonGetter("direction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SortingDirection getDirection() {
        return direction;
    }

    /**
     * Setter for Direction.
     * Controls the order in which results are returned. Use in query `direction=asc`.
     * @param direction Value for SortingDirection
     */
    @JsonSetter("direction")
    public void setDirection(SortingDirection direction) {
        this.direction = direction;
    }

    /**
     * Getter for Filter.
     * Filter to use for List PricePoints operations
     * @return Returns the ListPricePointsFilter
     */
    @JsonGetter("filter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListPricePointsFilter getFilter() {
        return filter;
    }

    /**
     * Setter for Filter.
     * Filter to use for List PricePoints operations
     * @param filter Value for ListPricePointsFilter
     */
    @JsonSetter("filter")
    public void setFilter(ListPricePointsFilter filter) {
        this.filter = filter;
    }

    /**
     * Converts this ListAllComponentPricePointsInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListAllComponentPricePointsInput [" + "include=" + include + ", page=" + page
                + ", perPage=" + perPage + ", direction=" + direction + ", filter=" + filter + "]";
    }

    /**
     * Builds a new {@link ListAllComponentPricePointsInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListAllComponentPricePointsInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .include(getInclude())
                .page(getPage())
                .perPage(getPerPage())
                .direction(getDirection())
                .filter(getFilter());
        return builder;
    }

    /**
     * Class to build instances of {@link ListAllComponentPricePointsInput}.
     */
    public static class Builder {
        private ListComponentsPricePointsInclude include;
        private Integer page = 1;
        private Integer perPage = 20;
        private SortingDirection direction;
        private ListPricePointsFilter filter;



        /**
         * Setter for include.
         * @param  include  ListComponentsPricePointsInclude value for include.
         * @return Builder
         */
        public Builder include(ListComponentsPricePointsInclude include) {
            this.include = include;
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
         * Setter for direction.
         * @param  direction  SortingDirection value for direction.
         * @return Builder
         */
        public Builder direction(SortingDirection direction) {
            this.direction = direction;
            return this;
        }

        /**
         * Setter for filter.
         * @param  filter  ListPricePointsFilter value for filter.
         * @return Builder
         */
        public Builder filter(ListPricePointsFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Builds a new {@link ListAllComponentPricePointsInput} object using the set fields.
         * @return {@link ListAllComponentPricePointsInput}
         */
        public ListAllComponentPricePointsInput build() {
            return new ListAllComponentPricePointsInput(include, page, perPage, direction, filter);
        }
    }
}
