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
    private String subscriptionId;
    private Integer page;
    private Integer perPage;
    private BasicDateField filterDateField;
    private String filterStartDate;
    private String filterEndDate;

    /**
     * Default constructor.
     */
    public ListPrepaymentsInput() {
        page = 1;
        perPage = 20;
    }

    /**
     * Initialization constructor.
     * @param  subscriptionId  String value for subscriptionId.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  filterDateField  BasicDateField value for filterDateField.
     * @param  filterStartDate  String value for filterStartDate.
     * @param  filterEndDate  String value for filterEndDate.
     */
    public ListPrepaymentsInput(
            String subscriptionId,
            Integer page,
            Integer perPage,
            BasicDateField filterDateField,
            String filterStartDate,
            String filterEndDate) {
        this.subscriptionId = subscriptionId;
        this.page = page;
        this.perPage = perPage;
        this.filterDateField = filterDateField;
        this.filterStartDate = filterStartDate;
        this.filterEndDate = filterEndDate;
    }

    /**
     * Getter for SubscriptionId.
     * The Chargify id of the subscription
     * @return Returns the String
     */
    @JsonGetter("subscription_id")
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * The Chargify id of the subscription
     * @param subscriptionId Value for String
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(String subscriptionId) {
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
     * Getter for FilterDateField.
     * The type of filter you would like to apply to your search. created_at - Time when prepayment
     * was created. application_at - Time when prepayment was applied to invoice. Use in query
     * `filter[date_field]=created_at`.
     * @return Returns the BasicDateField
     */
    @JsonGetter("filter[date_field]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BasicDateField getFilterDateField() {
        return filterDateField;
    }

    /**
     * Setter for FilterDateField.
     * The type of filter you would like to apply to your search. created_at - Time when prepayment
     * was created. application_at - Time when prepayment was applied to invoice. Use in query
     * `filter[date_field]=created_at`.
     * @param filterDateField Value for BasicDateField
     */
    @JsonSetter("filter[date_field]")
    public void setFilterDateField(BasicDateField filterDateField) {
        this.filterDateField = filterDateField;
    }

    /**
     * Getter for FilterStartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns prepayments
     * with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified. Use in query `filter[start_date]=2011-12-15`.
     * @return Returns the String
     */
    @JsonGetter("filter[start_date]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFilterStartDate() {
        return filterStartDate;
    }

    /**
     * Setter for FilterStartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns prepayments
     * with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified. Use in query `filter[start_date]=2011-12-15`.
     * @param filterStartDate Value for String
     */
    @JsonSetter("filter[start_date]")
    public void setFilterStartDate(String filterStartDate) {
        this.filterStartDate = filterStartDate;
    }

    /**
     * Getter for FilterEndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns prepayments
     * with a timestamp up to and including 11:59:59PM in your site’s time zone on the date
     * specified. Use in query `filter[end_date]=2011-12-15`.
     * @return Returns the String
     */
    @JsonGetter("filter[end_date]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFilterEndDate() {
        return filterEndDate;
    }

    /**
     * Setter for FilterEndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns prepayments
     * with a timestamp up to and including 11:59:59PM in your site’s time zone on the date
     * specified. Use in query `filter[end_date]=2011-12-15`.
     * @param filterEndDate Value for String
     */
    @JsonSetter("filter[end_date]")
    public void setFilterEndDate(String filterEndDate) {
        this.filterEndDate = filterEndDate;
    }

    /**
     * Converts this ListPrepaymentsInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListPrepaymentsInput [" + "subscriptionId=" + subscriptionId + ", page=" + page
                + ", perPage=" + perPage + ", filterDateField=" + filterDateField
                + ", filterStartDate=" + filterStartDate + ", filterEndDate=" + filterEndDate + "]";
    }

    /**
     * Builds a new {@link ListPrepaymentsInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListPrepaymentsInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscriptionId)
                .page(getPage())
                .perPage(getPerPage())
                .filterDateField(getFilterDateField())
                .filterStartDate(getFilterStartDate())
                .filterEndDate(getFilterEndDate());
        return builder;
    }

    /**
     * Class to build instances of {@link ListPrepaymentsInput}.
     */
    public static class Builder {
        private String subscriptionId;
        private Integer page = 1;
        private Integer perPage = 20;
        private BasicDateField filterDateField;
        private String filterStartDate;
        private String filterEndDate;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  subscriptionId  String value for subscriptionId.
         */
        public Builder(String subscriptionId) {
            this.subscriptionId = subscriptionId;
        }

        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  String value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(String subscriptionId) {
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
         * Setter for filterDateField.
         * @param  filterDateField  BasicDateField value for filterDateField.
         * @return Builder
         */
        public Builder filterDateField(BasicDateField filterDateField) {
            this.filterDateField = filterDateField;
            return this;
        }

        /**
         * Setter for filterStartDate.
         * @param  filterStartDate  String value for filterStartDate.
         * @return Builder
         */
        public Builder filterStartDate(String filterStartDate) {
            this.filterStartDate = filterStartDate;
            return this;
        }

        /**
         * Setter for filterEndDate.
         * @param  filterEndDate  String value for filterEndDate.
         * @return Builder
         */
        public Builder filterEndDate(String filterEndDate) {
            this.filterEndDate = filterEndDate;
            return this;
        }

        /**
         * Builds a new {@link ListPrepaymentsInput} object using the set fields.
         * @return {@link ListPrepaymentsInput}
         */
        public ListPrepaymentsInput build() {
            return new ListPrepaymentsInput(subscriptionId, page, perPage, filterDateField,
                    filterStartDate, filterEndDate);
        }
    }
}
