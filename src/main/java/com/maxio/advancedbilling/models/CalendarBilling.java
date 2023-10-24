/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.CalendarBillingSnapDay;

/**
 * This is a model class for CalendarBilling type.
 */
public class CalendarBilling {
    private CalendarBillingSnapDay snapDay;
    private FirstChargeType calendarBillingFirstCharge;

    /**
     * Default constructor.
     */
    public CalendarBilling() {
    }

    /**
     * Initialization constructor.
     * @param  snapDay  CalendarBillingSnapDay value for snapDay.
     * @param  calendarBillingFirstCharge  FirstChargeType value for calendarBillingFirstCharge.
     */
    public CalendarBilling(
            CalendarBillingSnapDay snapDay,
            FirstChargeType calendarBillingFirstCharge) {
        this.snapDay = snapDay;
        this.calendarBillingFirstCharge = calendarBillingFirstCharge;
    }

    /**
     * Getter for SnapDay.
     * A day of month that subscription will be processed on. Can be 1 up to 28 or 'end'.
     * @return Returns the CalendarBillingSnapDay
     */
    @JsonGetter("snap_day")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CalendarBillingSnapDay getSnapDay() {
        return snapDay;
    }

    /**
     * Setter for SnapDay.
     * A day of month that subscription will be processed on. Can be 1 up to 28 or 'end'.
     * @param snapDay Value for CalendarBillingSnapDay
     */
    @JsonSetter("snap_day")
    public void setSnapDay(CalendarBillingSnapDay snapDay) {
        this.snapDay = snapDay;
    }

    /**
     * Getter for CalendarBillingFirstCharge.
     * @return Returns the FirstChargeType
     */
    @JsonGetter("calendar_billing_first_charge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FirstChargeType getCalendarBillingFirstCharge() {
        return calendarBillingFirstCharge;
    }

    /**
     * Setter for CalendarBillingFirstCharge.
     * @param calendarBillingFirstCharge Value for FirstChargeType
     */
    @JsonSetter("calendar_billing_first_charge")
    public void setCalendarBillingFirstCharge(FirstChargeType calendarBillingFirstCharge) {
        this.calendarBillingFirstCharge = calendarBillingFirstCharge;
    }

    /**
     * Converts this CalendarBilling into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CalendarBilling [" + "snapDay=" + snapDay + ", calendarBillingFirstCharge="
                + calendarBillingFirstCharge + "]";
    }

    /**
     * Builds a new {@link CalendarBilling.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CalendarBilling.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .snapDay(getSnapDay())
                .calendarBillingFirstCharge(getCalendarBillingFirstCharge());
        return builder;
    }

    /**
     * Class to build instances of {@link CalendarBilling}.
     */
    public static class Builder {
        private CalendarBillingSnapDay snapDay;
        private FirstChargeType calendarBillingFirstCharge;



        /**
         * Setter for snapDay.
         * @param  snapDay  CalendarBillingSnapDay value for snapDay.
         * @return Builder
         */
        public Builder snapDay(CalendarBillingSnapDay snapDay) {
            this.snapDay = snapDay;
            return this;
        }

        /**
         * Setter for calendarBillingFirstCharge.
         * @param  calendarBillingFirstCharge  FirstChargeType value for calendarBillingFirstCharge.
         * @return Builder
         */
        public Builder calendarBillingFirstCharge(FirstChargeType calendarBillingFirstCharge) {
            this.calendarBillingFirstCharge = calendarBillingFirstCharge;
            return this;
        }

        /**
         * Builds a new {@link CalendarBilling} object using the set fields.
         * @return {@link CalendarBilling}
         */
        public CalendarBilling build() {
            return new CalendarBilling(snapDay, calendarBillingFirstCharge);
        }
    }
}
