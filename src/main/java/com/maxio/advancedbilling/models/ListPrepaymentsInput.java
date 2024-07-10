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
 * This is a model class for ListPrepaymentsInput type.
 */
public class ListPrepaymentsInput {
    private int subscriptionId;
    private Integer page;
    private Integer perPage;
    private ListPrepaymentsFilter filter;

    /**
     * Default constructor.
     */
    public ListPrepaymentsInput() {
        page = 1;
        perPage = 20;
    }

    /**
     * Initialization constructor.
     * @param  subscriptionId  int value for subscriptionId.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  filter  ListPrepaymentsFilter value for filter.
     */
    public ListPrepaymentsInput(
            int subscriptionId,
            Integer page,
            Integer perPage,
            ListPrepaymentsFilter filter) {
        this.subscriptionId = subscriptionId;
        this.page = page;
        this.perPage = perPage;
        this.filter = filter;
    }

    /**
     * Getter for SubscriptionId.
     * The Chargify id of the subscription
     * @return Returns the int
     */
    @JsonGetter("subscription_id")
    public int getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * The Chargify id of the subscription
     * @param subscriptionId Value for int
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
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
     * Converts this ListPrepaymentsInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListPrepaymentsInput [" + "subscriptionId=" + subscriptionId + ", page=" + page
                + ", perPage=" + perPage + ", filter=" + filter + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscriptionId)
                .page(getPage())
                .perPage(getPerPage())
                .filter(getFilter());
        return builder;
    }

    /**
     * Class to build instances of {@link ListPrepaymentsInput}.
     */
    public static class Builder {
        private int subscriptionId;
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
         * @param  subscriptionId  int value for subscriptionId.
         */
        public Builder(int subscriptionId) {
            this.subscriptionId = subscriptionId;
        }

        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  int value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(int subscriptionId) {
            this.subscriptionId = subscriptionId;
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
         * Builds a new {@link ListPrepaymentsInput} object using the set fields.
         * @return {@link ListPrepaymentsInput}
         */
        public ListPrepaymentsInput build() {
            return new ListPrepaymentsInput(subscriptionId, page, perPage, filter);
        }
    }
}
