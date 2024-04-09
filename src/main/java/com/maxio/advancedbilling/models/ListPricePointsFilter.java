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
 * This is a model class for ListPricePointsFilter type.
 */
public class ListPricePointsFilter
        extends BaseModel {
    private BasicDateField dateField;
    private LocalDate startDate;
    private LocalDate endDate;
    private ZonedDateTime startDatetime;
    private ZonedDateTime endDatetime;
    private List<PricePointType> type;
    private List<Integer> ids;
    private IncludeNotNull archivedAt;

    /**
     * Default constructor.
     */
    public ListPricePointsFilter() {
    }

    /**
     * Initialization constructor.
     * @param  dateField  BasicDateField value for dateField.
     * @param  startDate  LocalDate value for startDate.
     * @param  endDate  LocalDate value for endDate.
     * @param  startDatetime  ZonedDateTime value for startDatetime.
     * @param  endDatetime  ZonedDateTime value for endDatetime.
     * @param  type  List of PricePointType value for type.
     * @param  ids  List of Integer value for ids.
     * @param  archivedAt  IncludeNotNull value for archivedAt.
     */
    public ListPricePointsFilter(
            BasicDateField dateField,
            LocalDate startDate,
            LocalDate endDate,
            ZonedDateTime startDatetime,
            ZonedDateTime endDatetime,
            List<PricePointType> type,
            List<Integer> ids,
            IncludeNotNull archivedAt) {
        this.dateField = dateField;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startDatetime = startDatetime;
        this.endDatetime = endDatetime;
        this.type = type;
        this.ids = ids;
        this.archivedAt = archivedAt;
    }

    /**
     * Getter for DateField.
     * The type of filter you would like to apply to your search. Use in query:
     * `filter[date_field]=created_at`.
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
     * `filter[date_field]=created_at`.
     * @param dateField Value for BasicDateField
     */
    @JsonSetter("date_field")
    public void setDateField(BasicDateField dateField) {
        this.dateField = dateField;
    }

    /**
     * Getter for StartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns price points
     * with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
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
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns price points
     * with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified.
     * @param startDate Value for LocalDate
     */
    @JsonSetter("start_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter for EndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns price points
     * with a timestamp up to and including 11:59:59PM in your site’s time zone on the date
     * specified.
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
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns price points
     * with a timestamp up to and including 11:59:59PM in your site’s time zone on the date
     * specified.
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
     * Returns price points with a timestamp at or after exact time provided in query. You can
     * specify timezone in query - otherwise your site's time zone will be used. If provided, this
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
     * Returns price points with a timestamp at or after exact time provided in query. You can
     * specify timezone in query - otherwise your site's time zone will be used. If provided, this
     * parameter will be used instead of start_date.
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
     * Returns price points with a timestamp at or before exact time provided in query. You can
     * specify timezone in query - otherwise your site's time zone will be used. If provided, this
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
     * Returns price points with a timestamp at or before exact time provided in query. You can
     * specify timezone in query - otherwise your site's time zone will be used. If provided, this
     * parameter will be used instead of end_date.
     * @param endDatetime Value for ZonedDateTime
     */
    @JsonSetter("end_datetime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setEndDatetime(ZonedDateTime endDatetime) {
        this.endDatetime = endDatetime;
    }

    /**
     * Getter for Type.
     * Allows fetching price points with matching type. Use in query: `filter[type]=custom,catalog`.
     * @return Returns the List of PricePointType
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PricePointType> getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Allows fetching price points with matching type. Use in query: `filter[type]=custom,catalog`.
     * @param type Value for List of PricePointType
     */
    @JsonSetter("type")
    public void setType(List<PricePointType> type) {
        this.type = type;
    }

    /**
     * Getter for Ids.
     * Allows fetching price points with matching id based on provided values. Use in query:
     * `filter[ids]=1,2,3`.
     * @return Returns the List of Integer
     */
    @JsonGetter("ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getIds() {
        return ids;
    }

    /**
     * Setter for Ids.
     * Allows fetching price points with matching id based on provided values. Use in query:
     * `filter[ids]=1,2,3`.
     * @param ids Value for List of Integer
     */
    @JsonSetter("ids")
    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    /**
     * Getter for ArchivedAt.
     * Allows fetching price points only if archived_at is present or not. Use in query:
     * `filter[archived_at]=not_null`.
     * @return Returns the IncludeNotNull
     */
    @JsonGetter("archived_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IncludeNotNull getArchivedAt() {
        return archivedAt;
    }

    /**
     * Setter for ArchivedAt.
     * Allows fetching price points only if archived_at is present or not. Use in query:
     * `filter[archived_at]=not_null`.
     * @param archivedAt Value for IncludeNotNull
     */
    @JsonSetter("archived_at")
    public void setArchivedAt(IncludeNotNull archivedAt) {
        this.archivedAt = archivedAt;
    }

    /**
     * Converts this ListPricePointsFilter into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListPricePointsFilter [" + "dateField=" + dateField + ", startDate=" + startDate
                + ", endDate=" + endDate + ", startDatetime=" + startDatetime + ", endDatetime="
                + endDatetime + ", type=" + type + ", ids=" + ids + ", archivedAt=" + archivedAt
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ListPricePointsFilter.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListPricePointsFilter.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .dateField(getDateField())
                .startDate(getStartDate())
                .endDate(getEndDate())
                .startDatetime(getStartDatetime())
                .endDatetime(getEndDatetime())
                .type(getType())
                .ids(getIds())
                .archivedAt(getArchivedAt());
        return builder;
    }

    /**
     * Class to build instances of {@link ListPricePointsFilter}.
     */
    public static class Builder {
        private BasicDateField dateField;
        private LocalDate startDate;
        private LocalDate endDate;
        private ZonedDateTime startDatetime;
        private ZonedDateTime endDatetime;
        private List<PricePointType> type;
        private List<Integer> ids;
        private IncludeNotNull archivedAt;



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
         * Setter for type.
         * @param  type  List of PricePointType value for type.
         * @return Builder
         */
        public Builder type(List<PricePointType> type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for ids.
         * @param  ids  List of Integer value for ids.
         * @return Builder
         */
        public Builder ids(List<Integer> ids) {
            this.ids = ids;
            return this;
        }

        /**
         * Setter for archivedAt.
         * @param  archivedAt  IncludeNotNull value for archivedAt.
         * @return Builder
         */
        public Builder archivedAt(IncludeNotNull archivedAt) {
            this.archivedAt = archivedAt;
            return this;
        }

        /**
         * Builds a new {@link ListPricePointsFilter} object using the set fields.
         * @return {@link ListPricePointsFilter}
         */
        public ListPricePointsFilter build() {
            return new ListPricePointsFilter(dateField, startDate, endDate, startDatetime,
                    endDatetime, type, ids, archivedAt);
        }
    }
}
