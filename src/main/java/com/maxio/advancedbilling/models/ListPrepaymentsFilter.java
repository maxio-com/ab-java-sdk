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

/**
 * This is a model class for ListPrepaymentsFilter type.
 */
public class ListPrepaymentsFilter
        extends BaseModel {
    private ListPrepaymentDateField dateField;
    private LocalDate startDate;
    private LocalDate endDate;

    /**
     * Default constructor.
     */
    public ListPrepaymentsFilter() {
    }

    /**
     * Initialization constructor.
     * @param  dateField  ListPrepaymentDateField value for dateField.
     * @param  startDate  LocalDate value for startDate.
     * @param  endDate  LocalDate value for endDate.
     */
    public ListPrepaymentsFilter(
            ListPrepaymentDateField dateField,
            LocalDate startDate,
            LocalDate endDate) {
        this.dateField = dateField;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * Getter for DateField.
     * The type of filter you would like to apply to your search. `created_at` - Time when
     * prepayment was created. `application_at` - Time when prepayment was applied to invoice. Use
     * in query `filter[date_field]=created_at`.
     * @return Returns the ListPrepaymentDateField
     */
    @JsonGetter("date_field")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListPrepaymentDateField getDateField() {
        return dateField;
    }

    /**
     * Setter for DateField.
     * The type of filter you would like to apply to your search. `created_at` - Time when
     * prepayment was created. `application_at` - Time when prepayment was applied to invoice. Use
     * in query `filter[date_field]=created_at`.
     * @param dateField Value for ListPrepaymentDateField
     */
    @JsonSetter("date_field")
    public void setDateField(ListPrepaymentDateField dateField) {
        this.dateField = dateField;
    }

    /**
     * Getter for StartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns prepayments
     * with a timestamp at or after midnight (12:00:00 AM) in your site's time zone on the date
     * specified. Use in query: `filter[start_date]=2011-12-15`.
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
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns prepayments
     * with a timestamp at or after midnight (12:00:00 AM) in your site's time zone on the date
     * specified. Use in query: `filter[start_date]=2011-12-15`.
     * @param startDate Value for LocalDate
     */
    @JsonSetter("start_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter for EndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns prepayments
     * with a timestamp up to and including 11:59:59PM in your site's time zone on the date
     * specified. Use in query: `filter[end_date]=2011-12-15`.
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
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns prepayments
     * with a timestamp up to and including 11:59:59PM in your site's time zone on the date
     * specified. Use in query: `filter[end_date]=2011-12-15`.
     * @param endDate Value for LocalDate
     */
    @JsonSetter("end_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /**
     * Converts this ListPrepaymentsFilter into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListPrepaymentsFilter [" + "dateField=" + dateField + ", startDate=" + startDate
                + ", endDate=" + endDate + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link ListPrepaymentsFilter.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListPrepaymentsFilter.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .dateField(getDateField())
                .startDate(getStartDate())
                .endDate(getEndDate());
        return builder;
    }

    /**
     * Class to build instances of {@link ListPrepaymentsFilter}.
     */
    public static class Builder {
        private ListPrepaymentDateField dateField;
        private LocalDate startDate;
        private LocalDate endDate;



        /**
         * Setter for dateField.
         * @param  dateField  ListPrepaymentDateField value for dateField.
         * @return Builder
         */
        public Builder dateField(ListPrepaymentDateField dateField) {
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
         * Builds a new {@link ListPrepaymentsFilter} object using the set fields.
         * @return {@link ListPrepaymentsFilter}
         */
        public ListPrepaymentsFilter build() {
            return new ListPrepaymentsFilter(dateField, startDate, endDate);
        }
    }
}
