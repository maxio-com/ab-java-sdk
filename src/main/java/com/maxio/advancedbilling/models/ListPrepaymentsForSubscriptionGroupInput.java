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
 * This is a model class for ListPrepaymentsForSubscriptionGroupInput type.
 */
public class ListPrepaymentsForSubscriptionGroupInput {
    private String uid;
    private Integer page;
    private Integer perPage;
    private ListPrepaymentsFilter filter;

    /**
     * Default constructor.
     */
    public ListPrepaymentsForSubscriptionGroupInput() {
        page = 1;
        perPage = 20;
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  filter  ListPrepaymentsFilter value for filter.
     */
    public ListPrepaymentsForSubscriptionGroupInput(
            String uid,
            Integer page,
            Integer perPage,
            ListPrepaymentsFilter filter) {
        this.uid = uid;
        this.page = page;
        this.perPage = perPage;
        this.filter = filter;
    }

    /**
     * Getter for Uid.
     * The uid of the subscription group
     * @return Returns the String
     */
    @JsonGetter("uid")
    public String getUid() {
        return uid;
    }

    /**
     * Setter for Uid.
     * The uid of the subscription group
     * @param uid Value for String
     */
    @JsonSetter("uid")
    public void setUid(String uid) {
        this.uid = uid;
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
     * Getter for Filter.
     * Filter to use for List Prepayments operations
     * @return Returns the ListPrepaymentsFilter
     */
    @JsonGetter("filter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListPrepaymentsFilter getFilter() {
        return filter;
    }

    /**
     * Setter for Filter.
     * Filter to use for List Prepayments operations
     * @param filter Value for ListPrepaymentsFilter
     */
    @JsonSetter("filter")
    public void setFilter(ListPrepaymentsFilter filter) {
        this.filter = filter;
    }

    /**
     * Converts this ListPrepaymentsForSubscriptionGroupInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListPrepaymentsForSubscriptionGroupInput [" + "uid=" + uid + ", page=" + page
                + ", perPage=" + perPage + ", filter=" + filter + "]";
    }

    /**
     * Builds a new {@link ListPrepaymentsForSubscriptionGroupInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListPrepaymentsForSubscriptionGroupInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(uid)
                .page(getPage())
                .perPage(getPerPage())
                .filter(getFilter());
        return builder;
    }

    /**
     * Class to build instances of {@link ListPrepaymentsForSubscriptionGroupInput}.
     */
    public static class Builder {
        private String uid;
        private Integer page = 1;
        private Integer perPage = 20;
        private ListPrepaymentsFilter filter;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  uid  String value for uid.
         */
        public Builder(String uid) {
            this.uid = uid;
        }

        /**
         * Setter for uid.
         * @param  uid  String value for uid.
         * @return Builder
         */
        public Builder uid(String uid) {
            this.uid = uid;
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
         * @param  filter  ListPrepaymentsFilter value for filter.
         * @return Builder
         */
        public Builder filter(ListPrepaymentsFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Builds a new {@link ListPrepaymentsForSubscriptionGroupInput} object using the set
         * fields.
         * @return {@link ListPrepaymentsForSubscriptionGroupInput}
         */
        public ListPrepaymentsForSubscriptionGroupInput build() {
            return new ListPrepaymentsForSubscriptionGroupInput(uid, page, perPage, filter);
        }
    }
}
