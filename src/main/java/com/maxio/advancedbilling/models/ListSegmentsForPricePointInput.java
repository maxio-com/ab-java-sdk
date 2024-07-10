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
 * This is a model class for ListSegmentsForPricePointInput type.
 */
public class ListSegmentsForPricePointInput {
    private String componentId;
    private String pricePointId;
    private Integer page;
    private Integer perPage;
    private ListSegmentsFilter filter;

    /**
     * Default constructor.
     */
    public ListSegmentsForPricePointInput() {
        page = 1;
        perPage = 30;
    }

    /**
     * Initialization constructor.
     * @param  componentId  String value for componentId.
     * @param  pricePointId  String value for pricePointId.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  filter  ListSegmentsFilter value for filter.
     */
    public ListSegmentsForPricePointInput(
            String componentId,
            String pricePointId,
            Integer page,
            Integer perPage,
            ListSegmentsFilter filter) {
        this.componentId = componentId;
        this.pricePointId = pricePointId;
        this.page = page;
        this.perPage = perPage;
        this.filter = filter;
    }

    /**
     * Getter for ComponentId.
     * ID or Handle for the Component
     * @return Returns the String
     */
    @JsonGetter("component_id")
    public String getComponentId() {
        return componentId;
    }

    /**
     * Setter for ComponentId.
     * ID or Handle for the Component
     * @param componentId Value for String
     */
    @JsonSetter("component_id")
    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    /**
     * Getter for PricePointId.
     * ID or Handle for the Price Point belonging to the Component
     * @return Returns the String
     */
    @JsonGetter("price_point_id")
    public String getPricePointId() {
        return pricePointId;
    }

    /**
     * Setter for PricePointId.
     * ID or Handle for the Price Point belonging to the Component
     * @param pricePointId Value for String
     */
    @JsonSetter("price_point_id")
    public void setPricePointId(String pricePointId) {
        this.pricePointId = pricePointId;
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
     * This parameter indicates how many records to fetch in each request. Default value is 30. The
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
     * This parameter indicates how many records to fetch in each request. Default value is 30. The
     * maximum allowed values is 200; any per_page value over 200 will be changed to 200. Use in
     * query `per_page=200`.
     * @param perPage Value for Integer
     */
    @JsonSetter("per_page")
    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    /**
     * Getter for Filter.
     * Filter to use for List Segments for a Price Point operation
     * @return Returns the ListSegmentsFilter
     */
    @JsonGetter("filter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListSegmentsFilter getFilter() {
        return filter;
    }

    /**
     * Setter for Filter.
     * Filter to use for List Segments for a Price Point operation
     * @param filter Value for ListSegmentsFilter
     */
    @JsonSetter("filter")
    public void setFilter(ListSegmentsFilter filter) {
        this.filter = filter;
    }

    /**
     * Converts this ListSegmentsForPricePointInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListSegmentsForPricePointInput [" + "componentId=" + componentId + ", pricePointId="
                + pricePointId + ", page=" + page + ", perPage=" + perPage + ", filter=" + filter
                + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(componentId, pricePointId)
                .page(getPage())
                .perPage(getPerPage())
                .filter(getFilter());
        return builder;
    }

    /**
     * Class to build instances of {@link ListSegmentsForPricePointInput}.
     */
    public static class Builder {
        private String componentId;
        private String pricePointId;
        private Integer page = 1;
        private Integer perPage = 30;
        private ListSegmentsFilter filter;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  componentId  String value for componentId.
         * @param  pricePointId  String value for pricePointId.
         */
        public Builder(String componentId, String pricePointId) {
            this.componentId = componentId;
            this.pricePointId = pricePointId;
        }

        /**
         * Setter for componentId.
         * @param  componentId  String value for componentId.
         * @return Builder
         */
        public Builder componentId(String componentId) {
            this.componentId = componentId;
            return this;
        }

        /**
         * Setter for pricePointId.
         * @param  pricePointId  String value for pricePointId.
         * @return Builder
         */
        public Builder pricePointId(String pricePointId) {
            this.pricePointId = pricePointId;
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
         * Setter for filter.
         * @param  filter  ListSegmentsFilter value for filter.
         * @return Builder
         */
        public Builder filter(ListSegmentsFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Builds a new {@link ListSegmentsForPricePointInput} object using the set fields.
         * @return {@link ListSegmentsForPricePointInput}
         */
        public ListSegmentsForPricePointInput build() {
            return new ListSegmentsForPricePointInput(componentId, pricePointId, page, perPage,
                    filter);
        }
    }
}
