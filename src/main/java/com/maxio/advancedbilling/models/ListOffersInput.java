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
 * This is a model class for ListOffersInput type.
 */
public class ListOffersInput {
    private Integer page;
    private Integer perPage;
    private Boolean includeArchived;

    /**
     * Default constructor.
     */
    public ListOffersInput() {
        page = 1;
        perPage = 20;
    }

    /**
     * Initialization constructor.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  includeArchived  Boolean value for includeArchived.
     */
    public ListOffersInput(
            Integer page,
            Integer perPage,
            Boolean includeArchived) {
        this.page = page;
        this.perPage = perPage;
        this.includeArchived = includeArchived;
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
     * Getter for IncludeArchived.
     * Include archived products. Use in query: `include_archived=true`.
     * @return Returns the Boolean
     */
    @JsonGetter("include_archived")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIncludeArchived() {
        return includeArchived;
    }

    /**
     * Setter for IncludeArchived.
     * Include archived products. Use in query: `include_archived=true`.
     * @param includeArchived Value for Boolean
     */
    @JsonSetter("include_archived")
    public void setIncludeArchived(Boolean includeArchived) {
        this.includeArchived = includeArchived;
    }

    /**
     * Converts this ListOffersInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListOffersInput [" + "page=" + page + ", perPage=" + perPage + ", includeArchived="
                + includeArchived + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .page(getPage())
                .perPage(getPerPage())
                .includeArchived(getIncludeArchived());
        return builder;
    }

    /**
     * Class to build instances of {@link ListOffersInput}.
     */
    public static class Builder {
        private Integer page = 1;
        private Integer perPage = 20;
        private Boolean includeArchived;



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
         * Setter for includeArchived.
         * @param  includeArchived  Boolean value for includeArchived.
         * @return Builder
         */
        public Builder includeArchived(Boolean includeArchived) {
            this.includeArchived = includeArchived;
            return this;
        }

        /**
         * Builds a new {@link ListOffersInput} object using the set fields.
         * @return {@link ListOffersInput}
         */
        public ListOffersInput build() {
            return new ListOffersInput(page, perPage, includeArchived);
        }
    }
}
