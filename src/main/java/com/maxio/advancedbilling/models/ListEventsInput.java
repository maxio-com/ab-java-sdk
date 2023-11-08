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
 * This is a model class for ListEventsInput type.
 */
public class ListEventsInput {
    private Integer page;
    private Integer perPage;
    private Integer sinceId;
    private Integer maxId;
    private Direction direction;
    private List<EventType> filter;
    private ListEventsDateField dateField;
    private String startDate;
    private String endDate;
    private String startDatetime;
    private String endDatetime;

    /**
     * Default constructor.
     */
    public ListEventsInput() {
        page = 1;
        perPage = 20;
        direction = Direction.DESC;
    }

    /**
     * Initialization constructor.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  sinceId  Integer value for sinceId.
     * @param  maxId  Integer value for maxId.
     * @param  direction  Direction value for direction.
     * @param  filter  List of EventType value for filter.
     * @param  dateField  ListEventsDateField value for dateField.
     * @param  startDate  String value for startDate.
     * @param  endDate  String value for endDate.
     * @param  startDatetime  String value for startDatetime.
     * @param  endDatetime  String value for endDatetime.
     */
    public ListEventsInput(
            Integer page,
            Integer perPage,
            Integer sinceId,
            Integer maxId,
            Direction direction,
            List<EventType> filter,
            ListEventsDateField dateField,
            String startDate,
            String endDate,
            String startDatetime,
            String endDatetime) {
        this.page = page;
        this.perPage = perPage;
        this.sinceId = sinceId;
        this.maxId = maxId;
        this.direction = direction;
        this.filter = filter;
        this.dateField = dateField;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startDatetime = startDatetime;
        this.endDatetime = endDatetime;
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
     * Getter for SinceId.
     * Returns events with an id greater than or equal to the one specified
     * @return Returns the Integer
     */
    @JsonGetter("since_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSinceId() {
        return sinceId;
    }

    /**
     * Setter for SinceId.
     * Returns events with an id greater than or equal to the one specified
     * @param sinceId Value for Integer
     */
    @JsonSetter("since_id")
    public void setSinceId(Integer sinceId) {
        this.sinceId = sinceId;
    }

    /**
     * Getter for MaxId.
     * Returns events with an id less than or equal to the one specified
     * @return Returns the Integer
     */
    @JsonGetter("max_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getMaxId() {
        return maxId;
    }

    /**
     * Setter for MaxId.
     * Returns events with an id less than or equal to the one specified
     * @param maxId Value for Integer
     */
    @JsonSetter("max_id")
    public void setMaxId(Integer maxId) {
        this.maxId = maxId;
    }

    /**
     * Getter for Direction.
     * The sort direction of the returned events.
     * @return Returns the Direction
     */
    @JsonGetter("direction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Direction getDirection() {
        return direction;
    }

    /**
     * Setter for Direction.
     * The sort direction of the returned events.
     * @param direction Value for Direction
     */
    @JsonSetter("direction")
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    /**
     * Getter for Filter.
     * You can pass multiple event keys after comma. Use in query
     * `filter=signup_success,payment_success`.
     * @return Returns the List of EventType
     */
    @JsonGetter("filter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<EventType> getFilter() {
        return filter;
    }

    /**
     * Setter for Filter.
     * You can pass multiple event keys after comma. Use in query
     * `filter=signup_success,payment_success`.
     * @param filter Value for List of EventType
     */
    @JsonSetter("filter")
    public void setFilter(List<EventType> filter) {
        this.filter = filter;
    }

    /**
     * Getter for DateField.
     * The type of filter you would like to apply to your search.
     * @return Returns the ListEventsDateField
     */
    @JsonGetter("date_field")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListEventsDateField getDateField() {
        return dateField;
    }

    /**
     * Setter for DateField.
     * The type of filter you would like to apply to your search.
     * @param dateField Value for ListEventsDateField
     */
    @JsonSetter("date_field")
    public void setDateField(ListEventsDateField dateField) {
        this.dateField = dateField;
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
     * Getter for EndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns components with a timestamp at or before exact time provided in query. You can
     * specify timezone in query - otherwise your site's time zone will be used. If provided, this
     * parameter will be used instead of end_date.
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
     * parameter will be used instead of end_date.
     * @param endDatetime Value for String
     */
    @JsonSetter("end_datetime")
    public void setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
    }

    /**
     * Converts this ListEventsInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListEventsInput [" + "page=" + page + ", perPage=" + perPage + ", sinceId="
                + sinceId + ", maxId=" + maxId + ", direction=" + direction + ", filter=" + filter
                + ", dateField=" + dateField + ", startDate=" + startDate + ", endDate=" + endDate
                + ", startDatetime=" + startDatetime + ", endDatetime=" + endDatetime + "]";
    }

    /**
     * Builds a new {@link ListEventsInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListEventsInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .page(getPage())
                .perPage(getPerPage())
                .sinceId(getSinceId())
                .maxId(getMaxId())
                .direction(getDirection())
                .filter(getFilter())
                .dateField(getDateField())
                .startDate(getStartDate())
                .endDate(getEndDate())
                .startDatetime(getStartDatetime())
                .endDatetime(getEndDatetime());
        return builder;
    }

    /**
     * Class to build instances of {@link ListEventsInput}.
     */
    public static class Builder {
        private Integer page = 1;
        private Integer perPage = 20;
        private Integer sinceId;
        private Integer maxId;
        private Direction direction = Direction.DESC;
        private List<EventType> filter;
        private ListEventsDateField dateField;
        private String startDate;
        private String endDate;
        private String startDatetime;
        private String endDatetime;



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
         * Setter for sinceId.
         * @param  sinceId  Integer value for sinceId.
         * @return Builder
         */
        public Builder sinceId(Integer sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        /**
         * Setter for maxId.
         * @param  maxId  Integer value for maxId.
         * @return Builder
         */
        public Builder maxId(Integer maxId) {
            this.maxId = maxId;
            return this;
        }

        /**
         * Setter for direction.
         * @param  direction  Direction value for direction.
         * @return Builder
         */
        public Builder direction(Direction direction) {
            this.direction = direction;
            return this;
        }

        /**
         * Setter for filter.
         * @param  filter  List of EventType value for filter.
         * @return Builder
         */
        public Builder filter(List<EventType> filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Setter for dateField.
         * @param  dateField  ListEventsDateField value for dateField.
         * @return Builder
         */
        public Builder dateField(ListEventsDateField dateField) {
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
         * Builds a new {@link ListEventsInput} object using the set fields.
         * @return {@link ListEventsInput}
         */
        public ListEventsInput build() {
            return new ListEventsInput(page, perPage, sinceId, maxId, direction, filter, dateField,
                    startDate, endDate, startDatetime, endDatetime);
        }
    }
}
