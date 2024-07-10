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
 * This is a model class for ListAllProductPricePointsInput type.
 */
public class ListAllProductPricePointsInput {
    private SortingDirection direction;
    private ListPricePointsFilter filter;
    private ListProductsPricePointsInclude include;
    private Integer page;
    private Integer perPage;

    /**
     * Default constructor.
     */
    public ListAllProductPricePointsInput() {
        page = 1;
        perPage = 20;
    }

    /**
     * Initialization constructor.
     * @param  direction  SortingDirection value for direction.
     * @param  filter  ListPricePointsFilter value for filter.
     * @param  include  ListProductsPricePointsInclude value for include.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     */
    public ListAllProductPricePointsInput(
            SortingDirection direction,
            ListPricePointsFilter filter,
            ListProductsPricePointsInclude include,
            Integer page,
            Integer perPage) {
        this.direction = direction;
        this.filter = filter;
        this.include = include;
        this.page = page;
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
     * Getter for Include.
     * Allows including additional data in the response. Use in query: `include=currency_prices`.
     * @return Returns the ListProductsPricePointsInclude
     */
    @JsonGetter("include")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListProductsPricePointsInclude getInclude() {
        return include;
    }

    /**
     * Setter for Include.
     * Allows including additional data in the response. Use in query: `include=currency_prices`.
     * @param include Value for ListProductsPricePointsInclude
     */
    @JsonSetter("include")
    public void setInclude(ListProductsPricePointsInclude include) {
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
     * Converts this ListAllProductPricePointsInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListAllProductPricePointsInput [" + "direction=" + direction + ", filter=" + filter
                + ", include=" + include + ", page=" + page + ", perPage=" + perPage + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .direction(getDirection())
                .filter(getFilter())
                .include(getInclude())
                .page(getPage())
                .perPage(getPerPage());
        return builder;
    }

    /**
     * Class to build instances of {@link ListAllProductPricePointsInput}.
     */
    public static class Builder {
        private SortingDirection direction;
        private ListPricePointsFilter filter;
        private ListProductsPricePointsInclude include;
        private Integer page = 1;
        private Integer perPage = 20;



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
         * Setter for include.
         * @param  include  ListProductsPricePointsInclude value for include.
         * @return Builder
         */
        public Builder include(ListProductsPricePointsInclude include) {
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
         * Builds a new {@link ListAllProductPricePointsInput} object using the set fields.
         * @return {@link ListAllProductPricePointsInput}
         */
        public ListAllProductPricePointsInput build() {
            return new ListAllProductPricePointsInput(direction, filter, include, page, perPage);
        }
    }
}
