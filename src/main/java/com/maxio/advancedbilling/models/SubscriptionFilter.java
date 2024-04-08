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
import io.apimatic.core.types.BaseModel;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * This is a model class for SubscriptionFilter type.
 */
public class SubscriptionFilter
        extends BaseModel {
    private List<SubscriptionStateFilter> states;
    private SubscriptionListDateField dateField;
    private LocalDate startDate;
    private LocalDate endDate;
    private ZonedDateTime startDatetime;
    private ZonedDateTime endDatetime;

    /**
     * Default constructor.
     */
    public SubscriptionFilter() {
    }

    /**
     * Initialization constructor.
     * @param  states  List of SubscriptionStateFilter value for states.
     * @param  dateField  SubscriptionListDateField value for dateField.
     * @param  startDate  LocalDate value for startDate.
     * @param  endDate  LocalDate value for endDate.
     * @param  startDatetime  ZonedDateTime value for startDatetime.
     * @param  endDatetime  ZonedDateTime value for endDatetime.
     */
    public SubscriptionFilter(
            List<SubscriptionStateFilter> states,
            SubscriptionListDateField dateField,
            LocalDate startDate,
            LocalDate endDate,
            ZonedDateTime startDatetime,
            ZonedDateTime endDatetime) {
        this.states = states;
        this.dateField = dateField;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startDatetime = startDatetime;
        this.endDatetime = endDatetime;
    }

    /**
     * Getter for States.
     * Allows fetching components allocations that belong to the subscription with matching states
     * based on provided values. To use this filter you also have to include the following param in
     * the request `include=subscription`. Use in query
     * `filter[subscription][states]=active,canceled&amp;include=subscription`.
     * @return Returns the List of SubscriptionStateFilter
     */
    @JsonGetter("states")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<SubscriptionStateFilter> getStates() {
        return states;
    }

    /**
     * Setter for States.
     * Allows fetching components allocations that belong to the subscription with matching states
     * based on provided values. To use this filter you also have to include the following param in
     * the request `include=subscription`. Use in query
     * `filter[subscription][states]=active,canceled&amp;include=subscription`.
     * @param states Value for List of SubscriptionStateFilter
     */
    @JsonSetter("states")
    public void setStates(List<SubscriptionStateFilter> states) {
        this.states = states;
    }

    /**
     * Getter for DateField.
     * The type of filter you'd like to apply to your search. To use this filter you also have to
     * include the following param in the request `include=subscription`.
     * @return Returns the SubscriptionListDateField
     */
    @JsonGetter("date_field")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionListDateField getDateField() {
        return dateField;
    }

    /**
     * Setter for DateField.
     * The type of filter you'd like to apply to your search. To use this filter you also have to
     * include the following param in the request `include=subscription`.
     * @param dateField Value for SubscriptionListDateField
     */
    @JsonSetter("date_field")
    public void setDateField(SubscriptionListDateField dateField) {
        this.dateField = dateField;
    }

    /**
     * Getter for StartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns components
     * that belong to the subscription with a timestamp at or after midnight (12:00:00 AM) in your
     * site’s time zone on the date specified. To use this filter you also have to include the
     * following param in the request `include=subscription`.
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
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns components
     * that belong to the subscription with a timestamp at or after midnight (12:00:00 AM) in your
     * site’s time zone on the date specified. To use this filter you also have to include the
     * following param in the request `include=subscription`.
     * @param startDate Value for LocalDate
     */
    @JsonSetter("start_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter for EndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns components that
     * belong to the subscription with a timestamp up to and including 11:59:59PM in your site’s
     * time zone on the date specified. To use this filter you also have to include the following
     * param in the request `include=subscription`.
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
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns components that
     * belong to the subscription with a timestamp up to and including 11:59:59PM in your site’s
     * time zone on the date specified. To use this filter you also have to include the following
     * param in the request `include=subscription`.
     * @param endDate Value for LocalDate
     */
    @JsonSetter("end_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /**
     * Getter for StartDatetime.
     * The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns components that belong to the subscription with a timestamp at or after exact time
     * provided in query. You can specify timezone in query - otherwise your site''s time zone will
     * be used. If provided, this parameter will be used instead of start_date. To use this filter
     * you also have to include the following param in the request `include=subscription`.
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
     * Returns components that belong to the subscription with a timestamp at or after exact time
     * provided in query. You can specify timezone in query - otherwise your site''s time zone will
     * be used. If provided, this parameter will be used instead of start_date. To use this filter
     * you also have to include the following param in the request `include=subscription`.
     * @param startDatetime Value for ZonedDateTime
     */
    @JsonSetter("start_datetime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setStartDatetime(ZonedDateTime startDatetime) {
        this.startDatetime = startDatetime;
    }

    /**
     * Getter for EndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns components that belong to the subscription with a timestamp at or before exact time
     * provided in query. You can specify timezone in query - otherwise your site''s time zone will
     * be used. If provided, this parameter will be used instead of end_date. To use this filter you
     * also have to include the following param in the request `include=subscription`.
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
     * Returns components that belong to the subscription with a timestamp at or before exact time
     * provided in query. You can specify timezone in query - otherwise your site''s time zone will
     * be used. If provided, this parameter will be used instead of end_date. To use this filter you
     * also have to include the following param in the request `include=subscription`.
     * @param endDatetime Value for ZonedDateTime
     */
    @JsonSetter("end_datetime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setEndDatetime(ZonedDateTime endDatetime) {
        this.endDatetime = endDatetime;
    }

    /**
     * Converts this SubscriptionFilter into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionFilter [" + "states=" + states + ", dateField=" + dateField
                + ", startDate=" + startDate + ", endDate=" + endDate + ", startDatetime="
                + startDatetime + ", endDatetime=" + endDatetime + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link SubscriptionFilter.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionFilter.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .states(getStates())
                .dateField(getDateField())
                .startDate(getStartDate())
                .endDate(getEndDate())
                .startDatetime(getStartDatetime())
                .endDatetime(getEndDatetime());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionFilter}.
     */
    public static class Builder {
        private List<SubscriptionStateFilter> states;
        private SubscriptionListDateField dateField;
        private LocalDate startDate;
        private LocalDate endDate;
        private ZonedDateTime startDatetime;
        private ZonedDateTime endDatetime;



        /**
         * Setter for states.
         * @param  states  List of SubscriptionStateFilter value for states.
         * @return Builder
         */
        public Builder states(List<SubscriptionStateFilter> states) {
            this.states = states;
            return this;
        }

        /**
         * Setter for dateField.
         * @param  dateField  SubscriptionListDateField value for dateField.
         * @return Builder
         */
        public Builder dateField(SubscriptionListDateField dateField) {
            this.dateField = dateField;
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
         * Setter for endDate.
         * @param  endDate  LocalDate value for endDate.
         * @return Builder
         */
        public Builder endDate(LocalDate endDate) {
            this.endDate = endDate;
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
         * Setter for endDatetime.
         * @param  endDatetime  ZonedDateTime value for endDatetime.
         * @return Builder
         */
        public Builder endDatetime(ZonedDateTime endDatetime) {
            this.endDatetime = endDatetime;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionFilter} object using the set fields.
         * @return {@link SubscriptionFilter}
         */
        public SubscriptionFilter build() {
            return new SubscriptionFilter(states, dateField, startDate, endDate, startDatetime,
                    endDatetime);
        }
    }
}
