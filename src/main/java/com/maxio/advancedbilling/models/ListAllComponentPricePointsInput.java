/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.ListAllComponentPricePointsInputDirection;
import java.util.List;

/**
 * This is a model class for ListAllComponentPricePointsInput type.
 */
public class ListAllComponentPricePointsInput {
    private BasicDateField filterDateField;
    private String filterEndDate;
    private String filterEndDatetime;
    private ListComponentsPricePointsInclude include;
    private Integer page;
    private Integer perPage;
    private String filterStartDate;
    private String filterStartDatetime;
    private PricePointType filterType;
    private ListAllComponentPricePointsInputDirection direction;
    private List<Integer> filterIds;
    private IncludeNotNull filterArchivedAt;

    /**
     * Default constructor.
     */
    public ListAllComponentPricePointsInput() {
        page = 1;
        perPage = 20;
    }

    /**
     * Initialization constructor.
     * @param  filterDateField  BasicDateField value for filterDateField.
     * @param  filterEndDate  String value for filterEndDate.
     * @param  filterEndDatetime  String value for filterEndDatetime.
     * @param  include  ListComponentsPricePointsInclude value for include.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  filterStartDate  String value for filterStartDate.
     * @param  filterStartDatetime  String value for filterStartDatetime.
     * @param  filterType  PricePointType value for filterType.
     * @param  direction  ListAllComponentPricePointsInputDirection value for direction.
     * @param  filterIds  List of Integer value for filterIds.
     * @param  filterArchivedAt  IncludeNotNull value for filterArchivedAt.
     */
    public ListAllComponentPricePointsInput(
            BasicDateField filterDateField,
            String filterEndDate,
            String filterEndDatetime,
            ListComponentsPricePointsInclude include,
            Integer page,
            Integer perPage,
            String filterStartDate,
            String filterStartDatetime,
            PricePointType filterType,
            ListAllComponentPricePointsInputDirection direction,
            List<Integer> filterIds,
            IncludeNotNull filterArchivedAt) {
        this.filterDateField = filterDateField;
        this.filterEndDate = filterEndDate;
        this.filterEndDatetime = filterEndDatetime;
        this.include = include;
        this.page = page;
        this.perPage = perPage;
        this.filterStartDate = filterStartDate;
        this.filterStartDatetime = filterStartDatetime;
        this.filterType = filterType;
        this.direction = direction;
        this.filterIds = filterIds;
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
     * @return Returns the String
     */
    @JsonGetter("filter[end_date]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFilterEndDate() {
        return filterEndDate;
    }

    /**
     * Setter for FilterEndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns price points
     * with a timestamp up to and including 11:59:59PM in your site’s time zone on the date
     * specified.
     * @param filterEndDate Value for String
     */
    @JsonSetter("filter[end_date]")
    public void setFilterEndDate(String filterEndDate) {
        this.filterEndDate = filterEndDate;
    }

    /**
     * Getter for FilterEndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns price points with a timestamp at or before exact time provided in query. You can
     * specify timezone in query - otherwise your site's time zone will be used. If provided, this
     * parameter will be used instead of end_date.
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
     * Returns price points with a timestamp at or before exact time provided in query. You can
     * specify timezone in query - otherwise your site's time zone will be used. If provided, this
     * parameter will be used instead of end_date.
     * @param filterEndDatetime Value for String
     */
    @JsonSetter("filter[end_datetime]")
    public void setFilterEndDatetime(String filterEndDatetime) {
        this.filterEndDatetime = filterEndDatetime;
    }

    /**
     * Getter for Include.
     * Allows including additional data in the response. Use in query: `include=currency_prices`.
     * @return Returns the ListComponentsPricePointsInclude
     */
    @JsonGetter("include")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListComponentsPricePointsInclude getInclude() {
        return include;
    }

    /**
     * Setter for Include.
     * Allows including additional data in the response. Use in query: `include=currency_prices`.
     * @param include Value for ListComponentsPricePointsInclude
     */
    @JsonSetter("include")
    public void setInclude(ListComponentsPricePointsInclude include) {
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
     * Getter for FilterStartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns price points
     * with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified.
     * @return Returns the String
     */
    @JsonGetter("filter[start_date]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFilterStartDate() {
        return filterStartDate;
    }

    /**
     * Setter for FilterStartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns price points
     * with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified.
     * @param filterStartDate Value for String
     */
    @JsonSetter("filter[start_date]")
    public void setFilterStartDate(String filterStartDate) {
        this.filterStartDate = filterStartDate;
    }

    /**
     * Getter for FilterStartDatetime.
     * The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns price points with a timestamp at or after exact time provided in query. You can
     * specify timezone in query - otherwise your site's time zone will be used. If provided, this
     * parameter will be used instead of start_date.
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
     * Returns price points with a timestamp at or after exact time provided in query. You can
     * specify timezone in query - otherwise your site's time zone will be used. If provided, this
     * parameter will be used instead of start_date.
     * @param filterStartDatetime Value for String
     */
    @JsonSetter("filter[start_datetime]")
    public void setFilterStartDatetime(String filterStartDatetime) {
        this.filterStartDatetime = filterStartDatetime;
    }

    /**
     * Getter for FilterType.
     * Allows fetching price points with matching type. Use in query: `filter[type]=custom,catalog`.
     * @return Returns the PricePointType
     */
    @JsonGetter("filter[type]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PricePointType getFilterType() {
        return filterType;
    }

    /**
     * Setter for FilterType.
     * Allows fetching price points with matching type. Use in query: `filter[type]=custom,catalog`.
     * @param filterType Value for PricePointType
     */
    @JsonSetter("filter[type]")
    public void setFilterType(PricePointType filterType) {
        this.filterType = filterType;
    }

    /**
     * Getter for Direction.
     * Controls the order in which results are returned. Use in query `direction=asc`.
     * @return Returns the ListAllComponentPricePointsInputDirection
     */
    @JsonGetter("direction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListAllComponentPricePointsInputDirection getDirection() {
        return direction;
    }

    /**
     * Setter for Direction.
     * Controls the order in which results are returned. Use in query `direction=asc`.
     * @param direction Value for ListAllComponentPricePointsInputDirection
     */
    @JsonSetter("direction")
    public void setDirection(ListAllComponentPricePointsInputDirection direction) {
        this.direction = direction;
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
     * Converts this ListAllComponentPricePointsInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListAllComponentPricePointsInput [" + "filterDateField=" + filterDateField
                + ", filterEndDate=" + filterEndDate + ", filterEndDatetime=" + filterEndDatetime
                + ", include=" + include + ", page=" + page + ", perPage=" + perPage
                + ", filterStartDate=" + filterStartDate + ", filterStartDatetime="
                + filterStartDatetime + ", filterType=" + filterType + ", direction=" + direction
                + ", filterIds=" + filterIds + ", filterArchivedAt=" + filterArchivedAt + "]";
    }

    /**
     * Builds a new {@link ListAllComponentPricePointsInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListAllComponentPricePointsInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .filterDateField(getFilterDateField())
                .filterEndDate(getFilterEndDate())
                .filterEndDatetime(getFilterEndDatetime())
                .include(getInclude())
                .page(getPage())
                .perPage(getPerPage())
                .filterStartDate(getFilterStartDate())
                .filterStartDatetime(getFilterStartDatetime())
                .filterType(getFilterType())
                .direction(getDirection())
                .filterIds(getFilterIds())
                .filterArchivedAt(getFilterArchivedAt());
        return builder;
    }

    /**
     * Class to build instances of {@link ListAllComponentPricePointsInput}.
     */
    public static class Builder {
        private BasicDateField filterDateField;
        private String filterEndDate;
        private String filterEndDatetime;
        private ListComponentsPricePointsInclude include;
        private Integer page = 1;
        private Integer perPage = 20;
        private String filterStartDate;
        private String filterStartDatetime;
        private PricePointType filterType;
        private ListAllComponentPricePointsInputDirection direction;
        private List<Integer> filterIds;
        private IncludeNotNull filterArchivedAt;



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
         * Setter for include.
         * @param  include  ListComponentsPricePointsInclude value for include.
         * @return Builder
         */
        public Builder include(ListComponentsPricePointsInclude include) {
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
         * Setter for filterType.
         * @param  filterType  PricePointType value for filterType.
         * @return Builder
         */
        public Builder filterType(PricePointType filterType) {
            this.filterType = filterType;
            return this;
        }

        /**
         * Setter for direction.
         * @param  direction  ListAllComponentPricePointsInputDirection value for direction.
         * @return Builder
         */
        public Builder direction(ListAllComponentPricePointsInputDirection direction) {
            this.direction = direction;
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
         * Setter for filterArchivedAt.
         * @param  filterArchivedAt  IncludeNotNull value for filterArchivedAt.
         * @return Builder
         */
        public Builder filterArchivedAt(IncludeNotNull filterArchivedAt) {
            this.filterArchivedAt = filterArchivedAt;
            return this;
        }

        /**
         * Builds a new {@link ListAllComponentPricePointsInput} object using the set fields.
         * @return {@link ListAllComponentPricePointsInput}
         */
        public ListAllComponentPricePointsInput build() {
            return new ListAllComponentPricePointsInput(filterDateField, filterEndDate,
                    filterEndDatetime, include, page, perPage, filterStartDate, filterStartDatetime,
                    filterType, direction, filterIds, filterArchivedAt);
        }
    }
}
