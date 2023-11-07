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
 * This is a model class for ListReasonCodesInput type.
 */
public class ListReasonCodesInput {
    private Integer page;
    private Integer perPage;

    /**
     * Default constructor.
     */
    public ListReasonCodesInput() {
        page = 1;
        perPage = 20;
    }

    /**
     * Initialization constructor.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     */
    public ListReasonCodesInput(
            Integer page,
            Integer perPage) {
        this.page = page;
        this.perPage = perPage;
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
     * Converts this ListReasonCodesInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListReasonCodesInput [" + "page=" + page + ", perPage=" + perPage + "]";
    }

    /**
     * Builds a new {@link ListReasonCodesInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListReasonCodesInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .page(getPage())
                .perPage(getPerPage());
        return builder;
    }

    /**
     * Class to build instances of {@link ListReasonCodesInput}.
     */
    public static class Builder {
        private Integer page = 1;
        private Integer perPage = 20;



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
         * Builds a new {@link ListReasonCodesInput} object using the set fields.
         * @return {@link ListReasonCodesInput}
         */
        public ListReasonCodesInput build() {
            return new ListReasonCodesInput(page, perPage);
        }
    }
}
