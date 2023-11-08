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
    private ListSubscriptionGroupPrepaymentDateField filterDateField;
    private String filterEndDate;
    private String filterStartDate;
    private Integer page;
    private Integer perPage;

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
     * @param  filterDateField  ListSubscriptionGroupPrepaymentDateField value for filterDateField.
     * @param  filterEndDate  String value for filterEndDate.
     * @param  filterStartDate  String value for filterStartDate.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     */
    public ListPrepaymentsForSubscriptionGroupInput(
            String uid,
            ListSubscriptionGroupPrepaymentDateField filterDateField,
            String filterEndDate,
            String filterStartDate,
            Integer page,
            Integer perPage) {
        this.uid = uid;
        this.filterDateField = filterDateField;
        this.filterEndDate = filterEndDate;
        this.filterStartDate = filterStartDate;
        this.page = page;
        this.perPage = perPage;
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
     * Getter for FilterDateField.
     * The type of filter you would like to apply to your search. Use in query:
     * `filter[date_field]=created_at`.
     * @return Returns the ListSubscriptionGroupPrepaymentDateField
     */
    @JsonGetter("filter[date_field]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListSubscriptionGroupPrepaymentDateField getFilterDateField() {
        return filterDateField;
    }

    /**
     * Setter for FilterDateField.
     * The type of filter you would like to apply to your search. Use in query:
     * `filter[date_field]=created_at`.
     * @param filterDateField Value for ListSubscriptionGroupPrepaymentDateField
     */
    @JsonSetter("filter[date_field]")
    public void setFilterDateField(ListSubscriptionGroupPrepaymentDateField filterDateField) {
        this.filterDateField = filterDateField;
    }

    /**
     * Getter for FilterEndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns prepayments
     * with a timestamp up to and including 11:59:59PM in your site's time zone on the date
     * specified. Use in query: `filter[end_date]=2011-12-15`.
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
     * with a timestamp up to and including 11:59:59PM in your site's time zone on the date
     * specified. Use in query: `filter[end_date]=2011-12-15`.
     * @param filterEndDate Value for String
     */
    @JsonSetter("filter[end_date]")
    public void setFilterEndDate(String filterEndDate) {
        this.filterEndDate = filterEndDate;
    }

    /**
     * Getter for FilterStartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns prepayments
     * with a timestamp at or after midnight (12:00:00 AM) in your site's time zone on the date
     * specified. Use in query: `filter[start_date]=2011-12-15`.
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
     * with a timestamp at or after midnight (12:00:00 AM) in your site's time zone on the date
     * specified. Use in query: `filter[start_date]=2011-12-15`.
     * @param filterStartDate Value for String
     */
    @JsonSetter("filter[start_date]")
    public void setFilterStartDate(String filterStartDate) {
        this.filterStartDate = filterStartDate;
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
     * Converts this ListPrepaymentsForSubscriptionGroupInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListPrepaymentsForSubscriptionGroupInput [" + "uid=" + uid + ", filterDateField="
                + filterDateField + ", filterEndDate=" + filterEndDate + ", filterStartDate="
                + filterStartDate + ", page=" + page + ", perPage=" + perPage + "]";
    }

    /**
     * Builds a new {@link ListPrepaymentsForSubscriptionGroupInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListPrepaymentsForSubscriptionGroupInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(uid)
                .filterDateField(getFilterDateField())
                .filterEndDate(getFilterEndDate())
                .filterStartDate(getFilterStartDate())
                .page(getPage())
                .perPage(getPerPage());
        return builder;
    }

    /**
     * Class to build instances of {@link ListPrepaymentsForSubscriptionGroupInput}.
     */
    public static class Builder {
        private String uid;
        private ListSubscriptionGroupPrepaymentDateField filterDateField;
        private String filterEndDate;
        private String filterStartDate;
        private Integer page = 1;
        private Integer perPage = 20;

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
         * Setter for filterDateField.
         * @param  filterDateField  ListSubscriptionGroupPrepaymentDateField value for
         *         filterDateField.
         * @return Builder
         */
        public Builder filterDateField(ListSubscriptionGroupPrepaymentDateField filterDateField) {
            this.filterDateField = filterDateField;
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
         * Setter for filterStartDate.
         * @param  filterStartDate  String value for filterStartDate.
         * @return Builder
         */
        public Builder filterStartDate(String filterStartDate) {
            this.filterStartDate = filterStartDate;
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
         * Builds a new {@link ListPrepaymentsForSubscriptionGroupInput} object using the set
         * fields.
         * @return {@link ListPrepaymentsForSubscriptionGroupInput}
         */
        public ListPrepaymentsForSubscriptionGroupInput build() {
            return new ListPrepaymentsForSubscriptionGroupInput(uid, filterDateField, filterEndDate,
                    filterStartDate, page, perPage);
        }
    }
}
