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
import java.util.List;

/**
 * This is a model class for ListAllProductPricePointsInput type.
 */
public class ListAllProductPricePointsInput {
    private SortingDirection direction;
    private IncludeNotNull filterArchivedAt;
    private BasicDateField filterDateField;
    private LocalDate filterEndDate;
    private ZonedDateTime filterEndDatetime;
    private List<Integer> filterIds;
    private LocalDate filterStartDate;
    private ZonedDateTime filterStartDatetime;
    private List<PricePointType> filterType;
    private ListProductsPricePointsInclude include;
    private Integer page;
    private Integer perPage;

    /**
     * Default constructor.
     */
    public ListAllProductPricePointsInput() {
        page = 1;
        perPage = 20;
    }

    /**
     * Initialization constructor.
     * @param  direction  SortingDirection value for direction.
     * @param  filterArchivedAt  IncludeNotNull value for filterArchivedAt.
     * @param  filterDateField  BasicDateField value for filterDateField.
     * @param  filterEndDate  LocalDate value for filterEndDate.
     * @param  filterEndDatetime  ZonedDateTime value for filterEndDatetime.
     * @param  filterIds  List of Integer value for filterIds.
     * @param  filterStartDate  LocalDate value for filterStartDate.
     * @param  filterStartDatetime  ZonedDateTime value for filterStartDatetime.
     * @param  filterType  List of PricePointType value for filterType.
     * @param  include  ListProductsPricePointsInclude value for include.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     */
    public ListAllProductPricePointsInput(
            SortingDirection direction,
            IncludeNotNull filterArchivedAt,
            BasicDateField filterDateField,
            LocalDate filterEndDate,
            ZonedDateTime filterEndDatetime,
            List<Integer> filterIds,
            LocalDate filterStartDate,
            ZonedDateTime filterStartDatetime,
            List<PricePointType> filterType,
            ListProductsPricePointsInclude include,
            Integer page,
            Integer perPage) {
        this.direction = direction;
        this.filterArchivedAt = filterArchivedAt;
        this.filterDateField = filterDateField;
        this.filterEndDate = filterEndDate;
        this.filterEndDatetime = filterEndDatetime;
        this.filterIds = filterIds;
        this.filterStartDate = filterStartDate;
        this.filterStartDatetime = filterStartDatetime;
        this.filterType = filterType;
        this.include = include;
        this.page = page;
        this.perPage = perPage;
    }

    /**
     * Getter for Direction.
     * Controls the order in which results are returned. Use in query `direction=asc`.
     * @return Returns the SortingDirection
     */
    @JsonGetter("direction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SortingDirection getDirection() {
        return direction;
    }

    /**
     * Setter for Direction.
     * Controls the order in which results are returned. Use in query `direction=asc`.
     * @param direction Value for SortingDirection
     */
    @JsonSetter("direction")
    public void setDirection(SortingDirection direction) {
        this.direction = direction;
    }

    /**
     * Getter for FilterArchivedAt.
     * Allows fetching price points only if archived_at is present or not. Use in query:
     * `filter[archived_at]=not_null`.
     * @return Returns the IncludeNotNull
     */
    @JsonGetter("filter[archived_at]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IncludeNotNull getFilterArchivedAt() {
        return filterArchivedAt;
    }

    /**
     * Setter for FilterArchivedAt.
     * Allows fetching price points only if archived_at is present or not. Use in query:
     * `filter[archived_at]=not_null`.
     * @param filterArchivedAt Value for IncludeNotNull
     */
    @JsonSetter("filter[archived_at]")
    public void setFilterArchivedAt(IncludeNotNull filterArchivedAt) {
        this.filterArchivedAt = filterArchivedAt;
    }

    /**
     * Getter for FilterDateField.
     * The type of filter you would like to apply to your search. Use in query:
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
     * The type of filter you would like to apply to your search. Use in query:
     * `filter[date_field]=created_at`.
     * @param filterDateField Value for BasicDateField
     */
    @JsonSetter("filter[date_field]")
    public void setFilterDateField(BasicDateField filterDateField) {
        this.filterDateField = filterDateField;
    }

    /**
     * Getter for FilterEndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns price points
     * with a timestamp up to and including 11:59:59PM in your site’s time zone on the date
     * specified.
     * @return Returns the LocalDate
     */
    @JsonGetter("filter[end_date]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getFilterEndDate() {
        return filterEndDate;
    }

    /**
     * Setter for FilterEndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns price points
     * with a timestamp up to and including 11:59:59PM in your site’s time zone on the date
     * specified.
     * @param filterEndDate Value for LocalDate
     */
    @JsonSetter("filter[end_date]")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setFilterEndDate(LocalDate filterEndDate) {
        this.filterEndDate = filterEndDate;
    }

    /**
     * Getter for FilterEndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns price points with a timestamp at or before exact time provided in query. You can
     * specify timezone in query - otherwise your site's time zone will be used. If provided, this
     * parameter will be used instead of end_date.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("filter[end_datetime]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getFilterEndDatetime() {
        return filterEndDatetime;
    }

    /**
     * Setter for FilterEndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns price points with a timestamp at or before exact time provided in query. You can
     * specify timezone in query - otherwise your site's time zone will be used. If provided, this
     * parameter will be used instead of end_date.
     * @param filterEndDatetime Value for ZonedDateTime
     */
    @JsonSetter("filter[end_datetime]")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setFilterEndDatetime(ZonedDateTime filterEndDatetime) {
        this.filterEndDatetime = filterEndDatetime;
    }

    /**
     * Getter for FilterIds.
     * Allows fetching price points with matching id based on provided values. Use in query:
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
     * Allows fetching price points with matching id based on provided values. Use in query:
     * `filter[ids]=1,2,3`.
     * @param filterIds Value for List of Integer
     */
    @JsonSetter("filter[ids]")
    public void setFilterIds(List<Integer> filterIds) {
        this.filterIds = filterIds;
    }

    /**
     * Getter for FilterStartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns price points
     * with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified.
     * @return Returns the LocalDate
     */
    @JsonGetter("filter[start_date]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getFilterStartDate() {
        return filterStartDate;
    }

    /**
     * Setter for FilterStartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns price points
     * with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified.
     * @param filterStartDate Value for LocalDate
     */
    @JsonSetter("filter[start_date]")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setFilterStartDate(LocalDate filterStartDate) {
        this.filterStartDate = filterStartDate;
    }

    /**
     * Getter for FilterStartDatetime.
     * The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns price points with a timestamp at or after exact time provided in query. You can
     * specify timezone in query - otherwise your site's time zone will be used. If provided, this
     * parameter will be used instead of start_date.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("filter[start_datetime]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getFilterStartDatetime() {
        return filterStartDatetime;
    }

    /**
     * Setter for FilterStartDatetime.
     * The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns price points with a timestamp at or after exact time provided in query. You can
     * specify timezone in query - otherwise your site's time zone will be used. If provided, this
     * parameter will be used instead of start_date.
     * @param filterStartDatetime Value for ZonedDateTime
     */
    @JsonSetter("filter[start_datetime]")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setFilterStartDatetime(ZonedDateTime filterStartDatetime) {
        this.filterStartDatetime = filterStartDatetime;
    }

    /**
     * Getter for FilterType.
     * Allows fetching price points with matching type. Use in query: `filter[type]=catalog,custom`.
     * @return Returns the List of PricePointType
     */
    @JsonGetter("filter[type]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PricePointType> getFilterType() {
        return filterType;
    }

    /**
     * Setter for FilterType.
     * Allows fetching price points with matching type. Use in query: `filter[type]=catalog,custom`.
     * @param filterType Value for List of PricePointType
     */
    @JsonSetter("filter[type]")
    public void setFilterType(List<PricePointType> filterType) {
        this.filterType = filterType;
    }

    /**
     * Getter for Include.
     * Allows including additional data in the response. Use in query: `include=currency_prices`.
     * @return Returns the ListProductsPricePointsInclude
     */
    @JsonGetter("include")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListProductsPricePointsInclude getInclude() {
        return include;
    }

    /**
     * Setter for Include.
     * Allows including additional data in the response. Use in query: `include=currency_prices`.
     * @param include Value for ListProductsPricePointsInclude
     */
    @JsonSetter("include")
    public void setInclude(ListProductsPricePointsInclude include) {
        this.include = include;
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
     * Converts this ListAllProductPricePointsInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListAllProductPricePointsInput [" + "direction=" + direction + ", filterArchivedAt="
                + filterArchivedAt + ", filterDateField=" + filterDateField + ", filterEndDate="
                + filterEndDate + ", filterEndDatetime=" + filterEndDatetime + ", filterIds="
                + filterIds + ", filterStartDate=" + filterStartDate + ", filterStartDatetime="
                + filterStartDatetime + ", filterType=" + filterType + ", include=" + include
                + ", page=" + page + ", perPage=" + perPage + "]";
    }

    /**
     * Builds a new {@link ListAllProductPricePointsInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListAllProductPricePointsInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .direction(getDirection())
                .filterArchivedAt(getFilterArchivedAt())
                .filterDateField(getFilterDateField())
                .filterEndDate(getFilterEndDate())
                .filterEndDatetime(getFilterEndDatetime())
                .filterIds(getFilterIds())
                .filterStartDate(getFilterStartDate())
                .filterStartDatetime(getFilterStartDatetime())
                .filterType(getFilterType())
                .include(getInclude())
                .page(getPage())
                .perPage(getPerPage());
        return builder;
    }

    /**
     * Class to build instances of {@link ListAllProductPricePointsInput}.
     */
    public static class Builder {
        private SortingDirection direction;
        private IncludeNotNull filterArchivedAt;
        private BasicDateField filterDateField;
        private LocalDate filterEndDate;
        private ZonedDateTime filterEndDatetime;
        private List<Integer> filterIds;
        private LocalDate filterStartDate;
        private ZonedDateTime filterStartDatetime;
        private List<PricePointType> filterType;
        private ListProductsPricePointsInclude include;
        private Integer page = 1;
        private Integer perPage = 20;



        /**
         * Setter for direction.
         * @param  direction  SortingDirection value for direction.
         * @return Builder
         */
        public Builder direction(SortingDirection direction) {
            this.direction = direction;
            return this;
        }

        /**
         * Setter for filterArchivedAt.
         * @param  filterArchivedAt  IncludeNotNull value for filterArchivedAt.
         * @return Builder
         */
        public Builder filterArchivedAt(IncludeNotNull filterArchivedAt) {
            this.filterArchivedAt = filterArchivedAt;
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
         * Setter for filterEndDate.
         * @param  filterEndDate  LocalDate value for filterEndDate.
         * @return Builder
         */
        public Builder filterEndDate(LocalDate filterEndDate) {
            this.filterEndDate = filterEndDate;
            return this;
        }

        /**
         * Setter for filterEndDatetime.
         * @param  filterEndDatetime  ZonedDateTime value for filterEndDatetime.
         * @return Builder
         */
        public Builder filterEndDatetime(ZonedDateTime filterEndDatetime) {
            this.filterEndDatetime = filterEndDatetime;
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
         * Setter for filterStartDate.
         * @param  filterStartDate  LocalDate value for filterStartDate.
         * @return Builder
         */
        public Builder filterStartDate(LocalDate filterStartDate) {
            this.filterStartDate = filterStartDate;
            return this;
        }

        /**
         * Setter for filterStartDatetime.
         * @param  filterStartDatetime  ZonedDateTime value for filterStartDatetime.
         * @return Builder
         */
        public Builder filterStartDatetime(ZonedDateTime filterStartDatetime) {
            this.filterStartDatetime = filterStartDatetime;
            return this;
        }

        /**
         * Setter for filterType.
         * @param  filterType  List of PricePointType value for filterType.
         * @return Builder
         */
        public Builder filterType(List<PricePointType> filterType) {
            this.filterType = filterType;
            return this;
        }

        /**
         * Setter for include.
         * @param  include  ListProductsPricePointsInclude value for include.
         * @return Builder
         */
        public Builder include(ListProductsPricePointsInclude include) {
            this.include = include;
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
         * Builds a new {@link ListAllProductPricePointsInput} object using the set fields.
         * @return {@link ListAllProductPricePointsInput}
         */
        public ListAllProductPricePointsInput build() {
            return new ListAllProductPricePointsInput(direction, filterArchivedAt, filterDateField,
                    filterEndDate, filterEndDatetime, filterIds, filterStartDate,
                    filterStartDatetime, filterType, include, page, perPage);
        }
    }
}
