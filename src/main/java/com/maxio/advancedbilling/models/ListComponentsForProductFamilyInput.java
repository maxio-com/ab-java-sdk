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
 * This is a model class for ListComponentsForProductFamilyInput type.
 */
public class ListComponentsForProductFamilyInput {
    private int productFamilyId;
    private Boolean includeArchived;
    private Integer page;
    private Integer perPage;
    private ListComponentsFilter filter;
    private BasicDateField dateField;
    private String endDate;
    private String endDatetime;
    private String startDate;
    private String startDatetime;

    /**
     * Default constructor.
     */
    public ListComponentsForProductFamilyInput() {
        page = 1;
        perPage = 20;
    }

    /**
     * Initialization constructor.
     * @param  productFamilyId  int value for productFamilyId.
     * @param  includeArchived  Boolean value for includeArchived.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  filter  ListComponentsFilter value for filter.
     * @param  dateField  BasicDateField value for dateField.
     * @param  endDate  String value for endDate.
     * @param  endDatetime  String value for endDatetime.
     * @param  startDate  String value for startDate.
     * @param  startDatetime  String value for startDatetime.
     */
    public ListComponentsForProductFamilyInput(
            int productFamilyId,
            Boolean includeArchived,
            Integer page,
            Integer perPage,
            ListComponentsFilter filter,
            BasicDateField dateField,
            String endDate,
            String endDatetime,
            String startDate,
            String startDatetime) {
        this.productFamilyId = productFamilyId;
        this.includeArchived = includeArchived;
        this.page = page;
        this.perPage = perPage;
        this.filter = filter;
        this.dateField = dateField;
        this.endDate = endDate;
        this.endDatetime = endDatetime;
        this.startDate = startDate;
        this.startDatetime = startDatetime;
    }

    /**
     * Getter for ProductFamilyId.
     * The Advanced Billing id of the product family
     * @return Returns the int
     */
    @JsonGetter("product_family_id")
    public int getProductFamilyId() {
        return productFamilyId;
    }

    /**
     * Setter for ProductFamilyId.
     * The Advanced Billing id of the product family
     * @param productFamilyId Value for int
     */
    @JsonSetter("product_family_id")
    public void setProductFamilyId(int productFamilyId) {
        this.productFamilyId = productFamilyId;
    }

    /**
     * Getter for IncludeArchived.
     * Include archived items.
     * @return Returns the Boolean
     */
    @JsonGetter("include_archived")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIncludeArchived() {
        return includeArchived;
    }

    /**
     * Setter for IncludeArchived.
     * Include archived items.
     * @param includeArchived Value for Boolean
     */
    @JsonSetter("include_archived")
    public void setIncludeArchived(Boolean includeArchived) {
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
     * Getter for Filter.
     * Filter to use for List Components operations
     * @return Returns the ListComponentsFilter
     */
    @JsonGetter("filter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListComponentsFilter getFilter() {
        return filter;
    }

    /**
     * Setter for Filter.
     * Filter to use for List Components operations
     * @param filter Value for ListComponentsFilter
     */
    @JsonSetter("filter")
    public void setFilter(ListComponentsFilter filter) {
        this.filter = filter;
    }

    /**
     * Getter for DateField.
     * The type of filter you would like to apply to your search. Use in query
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
     * The type of filter you would like to apply to your search. Use in query
     * `date_field=created_at`.
     * @param dateField Value for BasicDateField
     */
    @JsonSetter("date_field")
    public void setDateField(BasicDateField dateField) {
        this.dateField = dateField;
    }

    /**
     * Getter for EndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns components with
     * a timestamp up to and including 11:59:59PM in your site’s time zone on the date specified.
     * @return Returns the String
     */
    @JsonGetter("end_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEndDate() {
        return endDate;
    }

    /**
     * Setter for EndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns components with
     * a timestamp up to and including 11:59:59PM in your site’s time zone on the date specified.
     * @param endDate Value for String
     */
    @JsonSetter("end_date")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * Getter for EndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns components with a timestamp at or before exact time provided in query. You can
     * specify timezone in query - otherwise your site's time zone will be used. If provided, this
     * parameter will be used instead of end_date. optional.
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
     * Returns components with a timestamp at or before exact time provided in query. You can
     * specify timezone in query - otherwise your site's time zone will be used. If provided, this
     * parameter will be used instead of end_date. optional.
     * @param endDatetime Value for String
     */
    @JsonSetter("end_datetime")
    public void setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
    }

    /**
     * Getter for StartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns components
     * with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
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
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns components
     * with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified.
     * @param startDate Value for String
     */
    @JsonSetter("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter for StartDatetime.
     * The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns components with a timestamp at or after exact time provided in query. You can specify
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
     * Returns components with a timestamp at or after exact time provided in query. You can specify
     * timezone in query - otherwise your site's time zone will be used. If provided, this parameter
     * will be used instead of start_date.
     * @param startDatetime Value for String
     */
    @JsonSetter("start_datetime")
    public void setStartDatetime(String startDatetime) {
        this.startDatetime = startDatetime;
    }

    /**
     * Converts this ListComponentsForProductFamilyInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListComponentsForProductFamilyInput [" + "productFamilyId=" + productFamilyId
                + ", includeArchived=" + includeArchived + ", page=" + page + ", perPage=" + perPage
                + ", filter=" + filter + ", dateField=" + dateField + ", endDate=" + endDate
                + ", endDatetime=" + endDatetime + ", startDate=" + startDate + ", startDatetime="
                + startDatetime + "]";
    }

    /**
     * Builds a new {@link ListComponentsForProductFamilyInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListComponentsForProductFamilyInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(productFamilyId)
                .includeArchived(getIncludeArchived())
                .page(getPage())
                .perPage(getPerPage())
                .filter(getFilter())
                .dateField(getDateField())
                .endDate(getEndDate())
                .endDatetime(getEndDatetime())
                .startDate(getStartDate())
                .startDatetime(getStartDatetime());
        return builder;
    }

    /**
     * Class to build instances of {@link ListComponentsForProductFamilyInput}.
     */
    public static class Builder {
        private int productFamilyId;
        private Boolean includeArchived;
        private Integer page = 1;
        private Integer perPage = 20;
        private ListComponentsFilter filter;
        private BasicDateField dateField;
        private String endDate;
        private String endDatetime;
        private String startDate;
        private String startDatetime;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  productFamilyId  int value for productFamilyId.
         */
        public Builder(int productFamilyId) {
            this.productFamilyId = productFamilyId;
        }

        /**
         * Setter for productFamilyId.
         * @param  productFamilyId  int value for productFamilyId.
         * @return Builder
         */
        public Builder productFamilyId(int productFamilyId) {
            this.productFamilyId = productFamilyId;
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
         * @param  filter  ListComponentsFilter value for filter.
         * @return Builder
         */
        public Builder filter(ListComponentsFilter filter) {
            this.filter = filter;
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
         * Setter for endDate.
         * @param  endDate  String value for endDate.
         * @return Builder
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
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
         * Setter for startDate.
         * @param  startDate  String value for startDate.
         * @return Builder
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
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
         * Builds a new {@link ListComponentsForProductFamilyInput} object using the set fields.
         * @return {@link ListComponentsForProductFamilyInput}
         */
        public ListComponentsForProductFamilyInput build() {
            return new ListComponentsForProductFamilyInput(productFamilyId, includeArchived, page,
                    perPage, filter, dateField, endDate, endDatetime, startDate, startDatetime);
        }
    }
}
