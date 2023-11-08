/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for ListCouponsInput type.
 */
public class ListCouponsInput {
    private Integer page;
    private Integer perPage;
    private BasicDateField dateField;
    private String startDate;
    private String endDate;
    private String startDatetime;
    private String endDatetime;
    private List<Integer> filterIds;
    private List<String> filterCodes;
    private Boolean currencyPrices;
    private String filterEndDate;
    private String filterEndDatetime;
    private String filterStartDate;
    private String filterStartDatetime;
    private BasicDateField filterDateField;
    private Boolean filterUseSiteExchangeRate;

    /**
     * Default constructor.
     */
    public ListCouponsInput() {
        page = 1;
        perPage = 30;
    }

    /**
     * Initialization constructor.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  dateField  BasicDateField value for dateField.
     * @param  startDate  String value for startDate.
     * @param  endDate  String value for endDate.
     * @param  startDatetime  String value for startDatetime.
     * @param  endDatetime  String value for endDatetime.
     * @param  filterIds  List of Integer value for filterIds.
     * @param  filterCodes  List of String value for filterCodes.
     * @param  currencyPrices  Boolean value for currencyPrices.
     * @param  filterEndDate  String value for filterEndDate.
     * @param  filterEndDatetime  String value for filterEndDatetime.
     * @param  filterStartDate  String value for filterStartDate.
     * @param  filterStartDatetime  String value for filterStartDatetime.
     * @param  filterDateField  BasicDateField value for filterDateField.
     * @param  filterUseSiteExchangeRate  Boolean value for filterUseSiteExchangeRate.
     */
    public ListCouponsInput(
            Integer page,
            Integer perPage,
            BasicDateField dateField,
            String startDate,
            String endDate,
            String startDatetime,
            String endDatetime,
            List<Integer> filterIds,
            List<String> filterCodes,
            Boolean currencyPrices,
            String filterEndDate,
            String filterEndDatetime,
            String filterStartDate,
            String filterStartDatetime,
            BasicDateField filterDateField,
            Boolean filterUseSiteExchangeRate) {
        this.page = page;
        this.perPage = perPage;
        this.dateField = dateField;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startDatetime = startDatetime;
        this.endDatetime = endDatetime;
        this.filterIds = filterIds;
        this.filterCodes = filterCodes;
        this.currencyPrices = currencyPrices;
        this.filterEndDate = filterEndDate;
        this.filterEndDatetime = filterEndDatetime;
        this.filterStartDate = filterStartDate;
        this.filterStartDatetime = filterStartDatetime;
        this.filterDateField = filterDateField;
        this.filterUseSiteExchangeRate = filterUseSiteExchangeRate;
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
     * Getter for DateField.
     * The field was deprecated: on January 20, 2022. We recommend using filter[date_field] instead
     * to achieve the same result. The type of filter you would like to apply to your search.
     * @return Returns the BasicDateField
     */
    @JsonGetter("date_field")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BasicDateField getDateField() {
        return dateField;
    }

    /**
     * Setter for DateField.
     * The field was deprecated: on January 20, 2022. We recommend using filter[date_field] instead
     * to achieve the same result. The type of filter you would like to apply to your search.
     * @param dateField Value for BasicDateField
     */
    @JsonSetter("date_field")
    public void setDateField(BasicDateField dateField) {
        this.dateField = dateField;
    }

    /**
     * Getter for StartDate.
     * The field was deprecated: on January 20, 2022. We recommend using filter[start_date] instead
     * to achieve the same result. The start date (format YYYY-MM-DD) with which to filter the
     * date_field. Returns coupons with a timestamp at or after midnight (12:00:00 AM) in your
     * site’s time zone on the date specified.
     * @return Returns the String
     */
    @JsonGetter("start_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStartDate() {
        return startDate;
    }

    /**
     * Setter for StartDate.
     * The field was deprecated: on January 20, 2022. We recommend using filter[start_date] instead
     * to achieve the same result. The start date (format YYYY-MM-DD) with which to filter the
     * date_field. Returns coupons with a timestamp at or after midnight (12:00:00 AM) in your
     * site’s time zone on the date specified.
     * @param startDate Value for String
     */
    @JsonSetter("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter for EndDate.
     * The field was deprecated: on January 20, 2022. We recommend using filter[end_date] instead to
     * achieve the same result. The end date (format YYYY-MM-DD) with which to filter the
     * date_field. Returns coupons with a timestamp up to and including 11:59:59PM in your site’s
     * time zone on the date specified.
     * @return Returns the String
     */
    @JsonGetter("end_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEndDate() {
        return endDate;
    }

    /**
     * Setter for EndDate.
     * The field was deprecated: on January 20, 2022. We recommend using filter[end_date] instead to
     * achieve the same result. The end date (format YYYY-MM-DD) with which to filter the
     * date_field. Returns coupons with a timestamp up to and including 11:59:59PM in your site’s
     * time zone on the date specified.
     * @param endDate Value for String
     */
    @JsonSetter("end_date")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * Getter for StartDatetime.
     * The field was deprecated: on January 20, 2022. We recommend using filter[start_datetime]
     * instead to achieve the same result. The start date and time (format YYYY-MM-DD HH:MM:SS) with
     * which to filter the date_field. Returns coupons with a timestamp at or after exact time
     * provided in query. You can specify timezone in query - otherwise your site's time zone will
     * be used. If provided, this parameter will be used instead of start_date.
     * @return Returns the String
     */
    @JsonGetter("start_datetime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStartDatetime() {
        return startDatetime;
    }

    /**
     * Setter for StartDatetime.
     * The field was deprecated: on January 20, 2022. We recommend using filter[start_datetime]
     * instead to achieve the same result. The start date and time (format YYYY-MM-DD HH:MM:SS) with
     * which to filter the date_field. Returns coupons with a timestamp at or after exact time
     * provided in query. You can specify timezone in query - otherwise your site's time zone will
     * be used. If provided, this parameter will be used instead of start_date.
     * @param startDatetime Value for String
     */
    @JsonSetter("start_datetime")
    public void setStartDatetime(String startDatetime) {
        this.startDatetime = startDatetime;
    }

    /**
     * Getter for EndDatetime.
     * The field was deprecated: on January 20, 2022. We recommend using filter[end_datetime]
     * instead to achieve the same result. The end date and time (format YYYY-MM-DD HH:MM:SS) with
     * which to filter the date_field. Returns coupons with a timestamp at or before exact time
     * provided in query. You can specify timezone in query - otherwise your site's time zone will
     * be used. If provided, this parameter will be used instead of end_date.
     * @return Returns the String
     */
    @JsonGetter("end_datetime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEndDatetime() {
        return endDatetime;
    }

    /**
     * Setter for EndDatetime.
     * The field was deprecated: on January 20, 2022. We recommend using filter[end_datetime]
     * instead to achieve the same result. The end date and time (format YYYY-MM-DD HH:MM:SS) with
     * which to filter the date_field. Returns coupons with a timestamp at or before exact time
     * provided in query. You can specify timezone in query - otherwise your site's time zone will
     * be used. If provided, this parameter will be used instead of end_date.
     * @param endDatetime Value for String
     */
    @JsonSetter("end_datetime")
    public void setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
    }

    /**
     * Getter for FilterIds.
     * Allows fetching coupons with matching id based on provided values. Use in query
     * `filter[ids]=1,2,3`.
     * @return Returns the List of Integer
     */
    @JsonGetter("filter[ids]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getFilterIds() {
        return filterIds;
    }

    /**
     * Setter for FilterIds.
     * Allows fetching coupons with matching id based on provided values. Use in query
     * `filter[ids]=1,2,3`.
     * @param filterIds Value for List of Integer
     */
    @JsonSetter("filter[ids]")
    public void setFilterIds(List<Integer> filterIds) {
        this.filterIds = filterIds;
    }

    /**
     * Getter for FilterCodes.
     * Allows fetching coupons with matching code based on provided values. Use in query
     * `filter[ids]=1,2,3`.
     * @return Returns the List of String
     */
    @JsonGetter("filter[codes]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getFilterCodes() {
        return filterCodes;
    }

    /**
     * Setter for FilterCodes.
     * Allows fetching coupons with matching code based on provided values. Use in query
     * `filter[ids]=1,2,3`.
     * @param filterCodes Value for List of String
     */
    @JsonSetter("filter[codes]")
    public void setFilterCodes(List<String> filterCodes) {
        this.filterCodes = filterCodes;
    }

    /**
     * Getter for CurrencyPrices.
     * When fetching coupons, if you have defined multiple currencies at the site level, you can
     * optionally pass the `?currency_prices=true` query param to include an array of currency price
     * data in the response. Use in query `currency_prices=true`.
     * @return Returns the Boolean
     */
    @JsonGetter("currency_prices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getCurrencyPrices() {
        return currencyPrices;
    }

    /**
     * Setter for CurrencyPrices.
     * When fetching coupons, if you have defined multiple currencies at the site level, you can
     * optionally pass the `?currency_prices=true` query param to include an array of currency price
     * data in the response. Use in query `currency_prices=true`.
     * @param currencyPrices Value for Boolean
     */
    @JsonSetter("currency_prices")
    public void setCurrencyPrices(Boolean currencyPrices) {
        this.currencyPrices = currencyPrices;
    }

    /**
     * Getter for FilterEndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns coupons with a
     * timestamp up to and including 11:59:59PM in your site’s time zone on the date specified. Use
     * in query `filter[end_date]=2011-12-17`.
     * @return Returns the String
     */
    @JsonGetter("filter[end_date]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFilterEndDate() {
        return filterEndDate;
    }

    /**
     * Setter for FilterEndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns coupons with a
     * timestamp up to and including 11:59:59PM in your site’s time zone on the date specified. Use
     * in query `filter[end_date]=2011-12-17`.
     * @param filterEndDate Value for String
     */
    @JsonSetter("filter[end_date]")
    public void setFilterEndDate(String filterEndDate) {
        this.filterEndDate = filterEndDate;
    }

    /**
     * Getter for FilterEndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns coupons with a timestamp at or before exact time provided in query. You can specify
     * timezone in query - otherwise your site's time zone will be used. If provided, this parameter
     * will be used instead of end_date. Use in query
     * `filter[end_datetime]=2011-12-19T10:15:30+01:00`.
     * @return Returns the String
     */
    @JsonGetter("filter[end_datetime]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFilterEndDatetime() {
        return filterEndDatetime;
    }

    /**
     * Setter for FilterEndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns coupons with a timestamp at or before exact time provided in query. You can specify
     * timezone in query - otherwise your site's time zone will be used. If provided, this parameter
     * will be used instead of end_date. Use in query
     * `filter[end_datetime]=2011-12-19T10:15:30+01:00`.
     * @param filterEndDatetime Value for String
     */
    @JsonSetter("filter[end_datetime]")
    public void setFilterEndDatetime(String filterEndDatetime) {
        this.filterEndDatetime = filterEndDatetime;
    }

    /**
     * Getter for FilterStartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns coupons with
     * a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified. Use in query `filter[start_date]=2011-12-19`.
     * @return Returns the String
     */
    @JsonGetter("filter[start_date]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFilterStartDate() {
        return filterStartDate;
    }

    /**
     * Setter for FilterStartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns coupons with
     * a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified. Use in query `filter[start_date]=2011-12-19`.
     * @param filterStartDate Value for String
     */
    @JsonSetter("filter[start_date]")
    public void setFilterStartDate(String filterStartDate) {
        this.filterStartDate = filterStartDate;
    }

    /**
     * Getter for FilterStartDatetime.
     * The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns coupons with a timestamp at or after exact time provided in query. You can specify
     * timezone in query - otherwise your site's time zone will be used. If provided, this parameter
     * will be used instead of start_date. Use in query
     * `filter[start_datetime]=2011-12-19T10:15:30+01:00`.
     * @return Returns the String
     */
    @JsonGetter("filter[start_datetime]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFilterStartDatetime() {
        return filterStartDatetime;
    }

    /**
     * Setter for FilterStartDatetime.
     * The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns coupons with a timestamp at or after exact time provided in query. You can specify
     * timezone in query - otherwise your site's time zone will be used. If provided, this parameter
     * will be used instead of start_date. Use in query
     * `filter[start_datetime]=2011-12-19T10:15:30+01:00`.
     * @param filterStartDatetime Value for String
     */
    @JsonSetter("filter[start_datetime]")
    public void setFilterStartDatetime(String filterStartDatetime) {
        this.filterStartDatetime = filterStartDatetime;
    }

    /**
     * Getter for FilterDateField.
     * The type of filter you would like to apply to your search. Use in query
     * `filter[date_field]=updated_at`.
     * @return Returns the BasicDateField
     */
    @JsonGetter("filter[date_field]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BasicDateField getFilterDateField() {
        return filterDateField;
    }

    /**
     * Setter for FilterDateField.
     * The type of filter you would like to apply to your search. Use in query
     * `filter[date_field]=updated_at`.
     * @param filterDateField Value for BasicDateField
     */
    @JsonSetter("filter[date_field]")
    public void setFilterDateField(BasicDateField filterDateField) {
        this.filterDateField = filterDateField;
    }

    /**
     * Getter for FilterUseSiteExchangeRate.
     * Allows fetching coupons with matching use_site_exchange_rate based on provided value. Use in
     * query `filter[use_site_exchange_rate]=true`.
     * @return Returns the Boolean
     */
    @JsonGetter("filter[use_site_exchange_rate]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getFilterUseSiteExchangeRate() {
        return filterUseSiteExchangeRate;
    }

    /**
     * Setter for FilterUseSiteExchangeRate.
     * Allows fetching coupons with matching use_site_exchange_rate based on provided value. Use in
     * query `filter[use_site_exchange_rate]=true`.
     * @param filterUseSiteExchangeRate Value for Boolean
     */
    @JsonSetter("filter[use_site_exchange_rate]")
    public void setFilterUseSiteExchangeRate(Boolean filterUseSiteExchangeRate) {
        this.filterUseSiteExchangeRate = filterUseSiteExchangeRate;
    }

    /**
     * Converts this ListCouponsInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListCouponsInput [" + "page=" + page + ", perPage=" + perPage + ", dateField="
                + dateField + ", startDate=" + startDate + ", endDate=" + endDate
                + ", startDatetime=" + startDatetime + ", endDatetime=" + endDatetime
                + ", filterIds=" + filterIds + ", filterCodes=" + filterCodes + ", currencyPrices="
                + currencyPrices + ", filterEndDate=" + filterEndDate + ", filterEndDatetime="
                + filterEndDatetime + ", filterStartDate=" + filterStartDate
                + ", filterStartDatetime=" + filterStartDatetime + ", filterDateField="
                + filterDateField + ", filterUseSiteExchangeRate=" + filterUseSiteExchangeRate
                + "]";
    }

    /**
     * Builds a new {@link ListCouponsInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListCouponsInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .page(getPage())
                .perPage(getPerPage())
                .dateField(getDateField())
                .startDate(getStartDate())
                .endDate(getEndDate())
                .startDatetime(getStartDatetime())
                .endDatetime(getEndDatetime())
                .filterIds(getFilterIds())
                .filterCodes(getFilterCodes())
                .currencyPrices(getCurrencyPrices())
                .filterEndDate(getFilterEndDate())
                .filterEndDatetime(getFilterEndDatetime())
                .filterStartDate(getFilterStartDate())
                .filterStartDatetime(getFilterStartDatetime())
                .filterDateField(getFilterDateField())
                .filterUseSiteExchangeRate(getFilterUseSiteExchangeRate());
        return builder;
    }

    /**
     * Class to build instances of {@link ListCouponsInput}.
     */
    public static class Builder {
        private Integer page = 1;
        private Integer perPage = 30;
        private BasicDateField dateField;
        private String startDate;
        private String endDate;
        private String startDatetime;
        private String endDatetime;
        private List<Integer> filterIds;
        private List<String> filterCodes;
        private Boolean currencyPrices;
        private String filterEndDate;
        private String filterEndDatetime;
        private String filterStartDate;
        private String filterStartDatetime;
        private BasicDateField filterDateField;
        private Boolean filterUseSiteExchangeRate;



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
         * Setter for filterIds.
         * @param  filterIds  List of Integer value for filterIds.
         * @return Builder
         */
        public Builder filterIds(List<Integer> filterIds) {
            this.filterIds = filterIds;
            return this;
        }

        /**
         * Setter for filterCodes.
         * @param  filterCodes  List of String value for filterCodes.
         * @return Builder
         */
        public Builder filterCodes(List<String> filterCodes) {
            this.filterCodes = filterCodes;
            return this;
        }

        /**
         * Setter for currencyPrices.
         * @param  currencyPrices  Boolean value for currencyPrices.
         * @return Builder
         */
        public Builder currencyPrices(Boolean currencyPrices) {
            this.currencyPrices = currencyPrices;
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
         * Setter for filterEndDatetime.
         * @param  filterEndDatetime  String value for filterEndDatetime.
         * @return Builder
         */
        public Builder filterEndDatetime(String filterEndDatetime) {
            this.filterEndDatetime = filterEndDatetime;
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
         * Setter for filterStartDatetime.
         * @param  filterStartDatetime  String value for filterStartDatetime.
         * @return Builder
         */
        public Builder filterStartDatetime(String filterStartDatetime) {
            this.filterStartDatetime = filterStartDatetime;
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
         * Setter for filterUseSiteExchangeRate.
         * @param  filterUseSiteExchangeRate  Boolean value for filterUseSiteExchangeRate.
         * @return Builder
         */
        public Builder filterUseSiteExchangeRate(Boolean filterUseSiteExchangeRate) {
            this.filterUseSiteExchangeRate = filterUseSiteExchangeRate;
            return this;
        }

        /**
         * Builds a new {@link ListCouponsInput} object using the set fields.
         * @return {@link ListCouponsInput}
         */
        public ListCouponsInput build() {
            return new ListCouponsInput(page, perPage, dateField, startDate, endDate, startDatetime,
                    endDatetime, filterIds, filterCodes, currencyPrices, filterEndDate,
                    filterEndDatetime, filterStartDate, filterStartDatetime, filterDateField,
                    filterUseSiteExchangeRate);
        }
    }
}
