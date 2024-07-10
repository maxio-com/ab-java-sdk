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
 * This is a model class for ListProductsForProductFamilyInput type.
 */
public class ListProductsForProductFamilyInput {
    private String productFamilyId;
    private Integer page;
    private Integer perPage;
    private BasicDateField dateField;
    private ListProductsFilter filter;
    private String startDate;
    private String endDate;
    private String startDatetime;
    private String endDatetime;
    private Boolean includeArchived;
    private ListProductsInclude include;

    /**
     * Default constructor.
     */
    public ListProductsForProductFamilyInput() {
        page = 1;
        perPage = 20;
    }

    /**
     * Initialization constructor.
     * @param  productFamilyId  String value for productFamilyId.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  dateField  BasicDateField value for dateField.
     * @param  filter  ListProductsFilter value for filter.
     * @param  startDate  String value for startDate.
     * @param  endDate  String value for endDate.
     * @param  startDatetime  String value for startDatetime.
     * @param  endDatetime  String value for endDatetime.
     * @param  includeArchived  Boolean value for includeArchived.
     * @param  include  ListProductsInclude value for include.
     */
    public ListProductsForProductFamilyInput(
            String productFamilyId,
            Integer page,
            Integer perPage,
            BasicDateField dateField,
            ListProductsFilter filter,
            String startDate,
            String endDate,
            String startDatetime,
            String endDatetime,
            Boolean includeArchived,
            ListProductsInclude include) {
        this.productFamilyId = productFamilyId;
        this.page = page;
        this.perPage = perPage;
        this.dateField = dateField;
        this.filter = filter;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startDatetime = startDatetime;
        this.endDatetime = endDatetime;
        this.includeArchived = includeArchived;
        this.include = include;
    }

    /**
     * Getter for ProductFamilyId.
     * Either the product family's id or its handle prefixed with `handle:`
     * @return Returns the String
     */
    @JsonGetter("product_family_id")
    public String getProductFamilyId() {
        return productFamilyId;
    }

    /**
     * Setter for ProductFamilyId.
     * Either the product family's id or its handle prefixed with `handle:`
     * @param productFamilyId Value for String
     */
    @JsonSetter("product_family_id")
    public void setProductFamilyId(String productFamilyId) {
        this.productFamilyId = productFamilyId;
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
     * Getter for DateField.
     * The type of filter you would like to apply to your search. Use in query:
     * `date_field=created_at`.
     * @return Returns the BasicDateField
     */
    @JsonGetter("date_field")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BasicDateField getDateField() {
        return dateField;
    }

    /**
     * Setter for DateField.
     * The type of filter you would like to apply to your search. Use in query:
     * `date_field=created_at`.
     * @param dateField Value for BasicDateField
     */
    @JsonSetter("date_field")
    public void setDateField(BasicDateField dateField) {
        this.dateField = dateField;
    }

    /**
     * Getter for Filter.
     * Filter to use for List Products operations
     * @return Returns the ListProductsFilter
     */
    @JsonGetter("filter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListProductsFilter getFilter() {
        return filter;
    }

    /**
     * Setter for Filter.
     * Filter to use for List Products operations
     * @param filter Value for ListProductsFilter
     */
    @JsonSetter("filter")
    public void setFilter(ListProductsFilter filter) {
        this.filter = filter;
    }

    /**
     * Getter for StartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns products with
     * a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified.
     * @return Returns the String
     */
    @JsonGetter("start_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStartDate() {
        return startDate;
    }

    /**
     * Setter for StartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns products with
     * a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified.
     * @param startDate Value for String
     */
    @JsonSetter("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter for EndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns products with a
     * timestamp up to and including 11:59:59PM in your site’s time zone on the date specified.
     * @return Returns the String
     */
    @JsonGetter("end_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEndDate() {
        return endDate;
    }

    /**
     * Setter for EndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns products with a
     * timestamp up to and including 11:59:59PM in your site’s time zone on the date specified.
     * @param endDate Value for String
     */
    @JsonSetter("end_date")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * Getter for StartDatetime.
     * The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns products with a timestamp at or after exact time provided in query. You can specify
     * timezone in query - otherwise your site's time zone will be used. If provided, this parameter
     * will be used instead of start_date.
     * @return Returns the String
     */
    @JsonGetter("start_datetime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStartDatetime() {
        return startDatetime;
    }

    /**
     * Setter for StartDatetime.
     * The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns products with a timestamp at or after exact time provided in query. You can specify
     * timezone in query - otherwise your site's time zone will be used. If provided, this parameter
     * will be used instead of start_date.
     * @param startDatetime Value for String
     */
    @JsonSetter("start_datetime")
    public void setStartDatetime(String startDatetime) {
        this.startDatetime = startDatetime;
    }

    /**
     * Getter for EndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns products with a timestamp at or before exact time provided in query. You can specify
     * timezone in query - otherwise your site's time zone will be used. If provided, this parameter
     * will be used instead of end_date.
     * @return Returns the String
     */
    @JsonGetter("end_datetime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEndDatetime() {
        return endDatetime;
    }

    /**
     * Setter for EndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns products with a timestamp at or before exact time provided in query. You can specify
     * timezone in query - otherwise your site's time zone will be used. If provided, this parameter
     * will be used instead of end_date.
     * @param endDatetime Value for String
     */
    @JsonSetter("end_datetime")
    public void setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
    }

    /**
     * Getter for IncludeArchived.
     * Include archived products
     * @return Returns the Boolean
     */
    @JsonGetter("include_archived")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIncludeArchived() {
        return includeArchived;
    }

    /**
     * Setter for IncludeArchived.
     * Include archived products
     * @param includeArchived Value for Boolean
     */
    @JsonSetter("include_archived")
    public void setIncludeArchived(Boolean includeArchived) {
        this.includeArchived = includeArchived;
    }

    /**
     * Getter for Include.
     * Allows including additional data in the response. Use in query
     * `include=prepaid_product_price_point`.
     * @return Returns the ListProductsInclude
     */
    @JsonGetter("include")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListProductsInclude getInclude() {
        return include;
    }

    /**
     * Setter for Include.
     * Allows including additional data in the response. Use in query
     * `include=prepaid_product_price_point`.
     * @param include Value for ListProductsInclude
     */
    @JsonSetter("include")
    public void setInclude(ListProductsInclude include) {
        this.include = include;
    }

    /**
     * Converts this ListProductsForProductFamilyInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListProductsForProductFamilyInput [" + "productFamilyId=" + productFamilyId
                + ", page=" + page + ", perPage=" + perPage + ", dateField=" + dateField
                + ", filter=" + filter + ", startDate=" + startDate + ", endDate=" + endDate
                + ", startDatetime=" + startDatetime + ", endDatetime=" + endDatetime
                + ", includeArchived=" + includeArchived + ", include=" + include + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(productFamilyId)
                .page(getPage())
                .perPage(getPerPage())
                .dateField(getDateField())
                .filter(getFilter())
                .startDate(getStartDate())
                .endDate(getEndDate())
                .startDatetime(getStartDatetime())
                .endDatetime(getEndDatetime())
                .includeArchived(getIncludeArchived())
                .include(getInclude());
        return builder;
    }

    /**
     * Class to build instances of {@link ListProductsForProductFamilyInput}.
     */
    public static class Builder {
        private String productFamilyId;
        private Integer page = 1;
        private Integer perPage = 20;
        private BasicDateField dateField;
        private ListProductsFilter filter;
        private String startDate;
        private String endDate;
        private String startDatetime;
        private String endDatetime;
        private Boolean includeArchived;
        private ListProductsInclude include;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  productFamilyId  String value for productFamilyId.
         */
        public Builder(String productFamilyId) {
            this.productFamilyId = productFamilyId;
        }

        /**
         * Setter for productFamilyId.
         * @param  productFamilyId  String value for productFamilyId.
         * @return Builder
         */
        public Builder productFamilyId(String productFamilyId) {
            this.productFamilyId = productFamilyId;
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
         * Setter for dateField.
         * @param  dateField  BasicDateField value for dateField.
         * @return Builder
         */
        public Builder dateField(BasicDateField dateField) {
            this.dateField = dateField;
            return this;
        }

        /**
         * Setter for filter.
         * @param  filter  ListProductsFilter value for filter.
         * @return Builder
         */
        public Builder filter(ListProductsFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Setter for startDate.
         * @param  startDate  String value for startDate.
         * @return Builder
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * Setter for endDate.
         * @param  endDate  String value for endDate.
         * @return Builder
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * Setter for startDatetime.
         * @param  startDatetime  String value for startDatetime.
         * @return Builder
         */
        public Builder startDatetime(String startDatetime) {
            this.startDatetime = startDatetime;
            return this;
        }

        /**
         * Setter for endDatetime.
         * @param  endDatetime  String value for endDatetime.
         * @return Builder
         */
        public Builder endDatetime(String endDatetime) {
            this.endDatetime = endDatetime;
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
         * Setter for include.
         * @param  include  ListProductsInclude value for include.
         * @return Builder
         */
        public Builder include(ListProductsInclude include) {
            this.include = include;
            return this;
        }

        /**
         * Builds a new {@link ListProductsForProductFamilyInput} object using the set fields.
         * @return {@link ListProductsForProductFamilyInput}
         */
        public ListProductsForProductFamilyInput build() {
            return new ListProductsForProductFamilyInput(productFamilyId, page, perPage, dateField,
                    filter, startDate, endDate, startDatetime, endDatetime, includeArchived,
                    include);
        }
    }
}
