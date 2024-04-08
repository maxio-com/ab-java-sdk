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
 * This is a model class for ListCouponsFilter type.
 */
public class ListCouponsFilter
        extends BaseModel {
    private BasicDateField dateField;
    private LocalDate startDate;
    private LocalDate endDate;
    private ZonedDateTime startDatetime;
    private ZonedDateTime endDatetime;
    private List<Integer> ids;
    private List<String> codes;
    private Boolean useSiteExchangeRate;

    /**
     * Default constructor.
     */
    public ListCouponsFilter() {
    }

    /**
     * Initialization constructor.
     * @param  dateField  BasicDateField value for dateField.
     * @param  startDate  LocalDate value for startDate.
     * @param  endDate  LocalDate value for endDate.
     * @param  startDatetime  ZonedDateTime value for startDatetime.
     * @param  endDatetime  ZonedDateTime value for endDatetime.
     * @param  ids  List of Integer value for ids.
     * @param  codes  List of String value for codes.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     */
    public ListCouponsFilter(
            BasicDateField dateField,
            LocalDate startDate,
            LocalDate endDate,
            ZonedDateTime startDatetime,
            ZonedDateTime endDatetime,
            List<Integer> ids,
            List<String> codes,
            Boolean useSiteExchangeRate) {
        this.dateField = dateField;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startDatetime = startDatetime;
        this.endDatetime = endDatetime;
        this.ids = ids;
        this.codes = codes;
        this.useSiteExchangeRate = useSiteExchangeRate;
    }

    /**
     * Getter for DateField.
     * The type of filter you would like to apply to your search. Use in query
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
     * The type of filter you would like to apply to your search. Use in query
     * `filter[date_field]=created_at`.
     * @param dateField Value for BasicDateField
     */
    @JsonSetter("date_field")
    public void setDateField(BasicDateField dateField) {
        this.dateField = dateField;
    }

    /**
     * Getter for StartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns coupons with
     * a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified. Use in query `filter[start_date]=2011-12-17`.
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
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns coupons with
     * a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified. Use in query `filter[start_date]=2011-12-17`.
     * @param startDate Value for LocalDate
     */
    @JsonSetter("start_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter for EndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns coupons with a
     * timestamp up to and including 11:59:59PM in your site’s time zone on the date specified. Use
     * in query `filter[end_date]=2011-12-15`.
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
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns coupons with a
     * timestamp up to and including 11:59:59PM in your site’s time zone on the date specified. Use
     * in query `filter[end_date]=2011-12-15`.
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
     * Returns coupons with a timestamp at or after exact time provided in query. You can specify
     * timezone in query - otherwise your site's time zone will be used. If provided, this parameter
     * will be used instead of start_date. Use in query
     * `filter[start_datetime]=2011-12-19T10:15:30+01:00`.
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
     * Returns coupons with a timestamp at or after exact time provided in query. You can specify
     * timezone in query - otherwise your site's time zone will be used. If provided, this parameter
     * will be used instead of start_date. Use in query
     * `filter[start_datetime]=2011-12-19T10:15:30+01:00`.
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
     * Returns coupons with a timestamp at or before exact time provided in query. You can specify
     * timezone in query - otherwise your site's time zone will be used. If provided, this parameter
     * will be used instead of end_date. Use in query
     * `filter[end_datetime]=2011-12-1T10:15:30+01:00`.
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
     * Returns coupons with a timestamp at or before exact time provided in query. You can specify
     * timezone in query - otherwise your site's time zone will be used. If provided, this parameter
     * will be used instead of end_date. Use in query
     * `filter[end_datetime]=2011-12-1T10:15:30+01:00`.
     * @param endDatetime Value for ZonedDateTime
     */
    @JsonSetter("end_datetime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setEndDatetime(ZonedDateTime endDatetime) {
        this.endDatetime = endDatetime;
    }

    /**
     * Getter for Ids.
     * Allows fetching coupons with matching id based on provided values. Use in query
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
     * Allows fetching coupons with matching id based on provided values. Use in query
     * `filter[ids]=1,2,3`.
     * @param ids Value for List of Integer
     */
    @JsonSetter("ids")
    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    /**
     * Getter for Codes.
     * Allows fetching coupons with matching codes based on provided values. Use in query
     * `filter[codes]=free,free_trial`.
     * @return Returns the List of String
     */
    @JsonGetter("codes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getCodes() {
        return codes;
    }

    /**
     * Setter for Codes.
     * Allows fetching coupons with matching codes based on provided values. Use in query
     * `filter[codes]=free,free_trial`.
     * @param codes Value for List of String
     */
    @JsonSetter("codes")
    public void setCodes(List<String> codes) {
        this.codes = codes;
    }

    /**
     * Getter for UseSiteExchangeRate.
     * Allows fetching coupons with matching use_site_exchange_rate based on provided value. Use in
     * query `filter[use_site_exchange_rate]=true`.
     * @return Returns the Boolean
     */
    @JsonGetter("use_site_exchange_rate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getUseSiteExchangeRate() {
        return useSiteExchangeRate;
    }

    /**
     * Setter for UseSiteExchangeRate.
     * Allows fetching coupons with matching use_site_exchange_rate based on provided value. Use in
     * query `filter[use_site_exchange_rate]=true`.
     * @param useSiteExchangeRate Value for Boolean
     */
    @JsonSetter("use_site_exchange_rate")
    public void setUseSiteExchangeRate(Boolean useSiteExchangeRate) {
        this.useSiteExchangeRate = useSiteExchangeRate;
    }

    /**
     * Converts this ListCouponsFilter into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListCouponsFilter [" + "dateField=" + dateField + ", startDate=" + startDate
                + ", endDate=" + endDate + ", startDatetime=" + startDatetime + ", endDatetime="
                + endDatetime + ", ids=" + ids + ", codes=" + codes + ", useSiteExchangeRate="
                + useSiteExchangeRate + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ListCouponsFilter.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListCouponsFilter.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .dateField(getDateField())
                .startDate(getStartDate())
                .endDate(getEndDate())
                .startDatetime(getStartDatetime())
                .endDatetime(getEndDatetime())
                .ids(getIds())
                .codes(getCodes())
                .useSiteExchangeRate(getUseSiteExchangeRate());
        return builder;
    }

    /**
     * Class to build instances of {@link ListCouponsFilter}.
     */
    public static class Builder {
        private BasicDateField dateField;
        private LocalDate startDate;
        private LocalDate endDate;
        private ZonedDateTime startDatetime;
        private ZonedDateTime endDatetime;
        private List<Integer> ids;
        private List<String> codes;
        private Boolean useSiteExchangeRate;



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
         * Setter for ids.
         * @param  ids  List of Integer value for ids.
         * @return Builder
         */
        public Builder ids(List<Integer> ids) {
            this.ids = ids;
            return this;
        }

        /**
         * Setter for codes.
         * @param  codes  List of String value for codes.
         * @return Builder
         */
        public Builder codes(List<String> codes) {
            this.codes = codes;
            return this;
        }

        /**
         * Setter for useSiteExchangeRate.
         * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
         * @return Builder
         */
        public Builder useSiteExchangeRate(Boolean useSiteExchangeRate) {
            this.useSiteExchangeRate = useSiteExchangeRate;
            return this;
        }

        /**
         * Builds a new {@link ListCouponsFilter} object using the set fields.
         * @return {@link ListCouponsFilter}
         */
        public ListCouponsFilter build() {
            return new ListCouponsFilter(dateField, startDate, endDate, startDatetime, endDatetime,
                    ids, codes, useSiteExchangeRate);
        }
    }
}
