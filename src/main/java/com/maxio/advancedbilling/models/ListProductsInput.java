/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import java.time.LocalDate;
import java.time.ZonedDateTime;

/**
 * This is a model class for ListProductsInput type.
 */
public class ListProductsInput {
    private BasicDateField dateField;
    private ListProductsFilter filter;
    private LocalDate endDate;
    private ZonedDateTime endDatetime;
    private LocalDate startDate;
    private ZonedDateTime startDatetime;
    private Integer page;
    private Integer perPage;
    private Boolean includeArchived;
    private ListProductsInclude include;

    /**
     * Default constructor.
     */
    public ListProductsInput() {
        page = 1;
        perPage = 20;
    }

    /**
     * Initialization constructor.
     * @param  dateField  BasicDateField value for dateField.
     * @param  filter  ListProductsFilter value for filter.
     * @param  endDate  LocalDate value for endDate.
     * @param  endDatetime  ZonedDateTime value for endDatetime.
     * @param  startDate  LocalDate value for startDate.
     * @param  startDatetime  ZonedDateTime value for startDatetime.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  includeArchived  Boolean value for includeArchived.
     * @param  include  ListProductsInclude value for include.
     */
    public ListProductsInput(
            BasicDateField dateField,
            ListProductsFilter filter,
            LocalDate endDate,
            ZonedDateTime endDatetime,
            LocalDate startDate,
            ZonedDateTime startDatetime,
            Integer page,
            Integer perPage,
            Boolean includeArchived,
            ListProductsInclude include) {
        this.dateField = dateField;
        this.filter = filter;
        this.endDate = endDate;
        this.endDatetime = endDatetime;
        this.startDate = startDate;
        this.startDatetime = startDatetime;
        this.page = page;
        this.perPage = perPage;
        this.includeArchived = includeArchived;
        this.include = include;
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
     * Getter for EndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns products with a
     * timestamp up to and including 11:59:59PM in your site’s time zone on the date specified.
     * @return Returns the LocalDate
     */
    @JsonGetter("end_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * Setter for EndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns products with a
     * timestamp up to and including 11:59:59PM in your site’s time zone on the date specified.
     * @param endDate Value for LocalDate
     */
    @JsonSetter("end_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /**
     * Getter for EndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns products with a timestamp at or before exact time provided in query. You can specify
     * timezone in query - otherwise your site''s time zone will be used. If provided, this
     * parameter will be used instead of end_date.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("end_datetime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getEndDatetime() {
        return endDatetime;
    }

    /**
     * Setter for EndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns products with a timestamp at or before exact time provided in query. You can specify
     * timezone in query - otherwise your site''s time zone will be used. If provided, this
     * parameter will be used instead of end_date.
     * @param endDatetime Value for ZonedDateTime
     */
    @JsonSetter("end_datetime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setEndDatetime(ZonedDateTime endDatetime) {
        this.endDatetime = endDatetime;
    }

    /**
     * Getter for StartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns products with
     * a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified.
     * @return Returns the LocalDate
     */
    @JsonGetter("start_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * Setter for StartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns products with
     * a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified.
     * @param startDate Value for LocalDate
     */
    @JsonSetter("start_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter for StartDatetime.
     * The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns products with a timestamp at or after exact time provided in query. You can specify
     * timezone in query - otherwise your site''s time zone will be used. If provided, this
     * parameter will be used instead of start_date.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("start_datetime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getStartDatetime() {
        return startDatetime;
    }

    /**
     * Setter for StartDatetime.
     * The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns products with a timestamp at or after exact time provided in query. You can specify
     * timezone in query - otherwise your site''s time zone will be used. If provided, this
     * parameter will be used instead of start_date.
     * @param startDatetime Value for ZonedDateTime
     */
    @JsonSetter("start_datetime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setStartDatetime(ZonedDateTime startDatetime) {
        this.startDatetime = startDatetime;
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
     * Converts this ListProductsInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListProductsInput [" + "dateField=" + dateField + ", filter=" + filter
                + ", endDate=" + endDate + ", endDatetime=" + endDatetime + ", startDate="
                + startDate + ", startDatetime=" + startDatetime + ", page=" + page + ", perPage="
                + perPage + ", includeArchived=" + includeArchived + ", include=" + include + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .dateField(getDateField())
                .filter(getFilter())
                .endDate(getEndDate())
                .endDatetime(getEndDatetime())
                .startDate(getStartDate())
                .startDatetime(getStartDatetime())
                .page(getPage())
                .perPage(getPerPage())
                .includeArchived(getIncludeArchived())
                .include(getInclude());
        return builder;
    }

    /**
     * Class to build instances of {@link ListProductsInput}.
     */
    public static class Builder {
        private BasicDateField dateField;
        private ListProductsFilter filter;
        private LocalDate endDate;
        private ZonedDateTime endDatetime;
        private LocalDate startDate;
        private ZonedDateTime startDatetime;
        private Integer page = 1;
        private Integer perPage = 20;
        private Boolean includeArchived;
        private ListProductsInclude include;



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
         * Setter for endDate.
         * @param  endDate  LocalDate value for endDate.
         * @return Builder
         */
        public Builder endDate(LocalDate endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * Setter for endDatetime.
         * @param  endDatetime  ZonedDateTime value for endDatetime.
         * @return Builder
         */
        public Builder endDatetime(ZonedDateTime endDatetime) {
            this.endDatetime = endDatetime;
            return this;
        }

        /**
         * Setter for startDate.
         * @param  startDate  LocalDate value for startDate.
         * @return Builder
         */
        public Builder startDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * Setter for startDatetime.
         * @param  startDatetime  ZonedDateTime value for startDatetime.
         * @return Builder
         */
        public Builder startDatetime(ZonedDateTime startDatetime) {
            this.startDatetime = startDatetime;
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
         * Builds a new {@link ListProductsInput} object using the set fields.
         * @return {@link ListProductsInput}
         */
        public ListProductsInput build() {
            return new ListProductsInput(dateField, filter, endDate, endDatetime, startDate,
                    startDatetime, page, perPage, includeArchived, include);
        }
    }
}
