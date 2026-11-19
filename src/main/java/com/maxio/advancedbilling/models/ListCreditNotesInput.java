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
 * This is a model class for ListCreditNotesInput type.
 */
public class ListCreditNotesInput {
    private Integer subscriptionId;
    private CreditNoteDateField dateField;
    private String startDate;
    private String endDate;
    private String startDatetime;
    private String endDatetime;
    private Integer page;
    private Integer perPage;
    private Direction direction;
    private Boolean lineItems;
    private Boolean discounts;
    private Boolean taxes;
    private Boolean refunds;
    private Boolean applications;

    /**
     * Default constructor.
     */
    public ListCreditNotesInput() {
        dateField = CreditNoteDateField.ISSUE_DATE;
        page = 1;
        perPage = 20;
        direction = Direction.DESC;
        lineItems = false;
        discounts = false;
        taxes = false;
        refunds = false;
        applications = false;
    }

    /**
     * Initialization constructor.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  dateField  CreditNoteDateField value for dateField.
     * @param  startDate  String value for startDate.
     * @param  endDate  String value for endDate.
     * @param  startDatetime  String value for startDatetime.
     * @param  endDatetime  String value for endDatetime.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  direction  Direction value for direction.
     * @param  lineItems  Boolean value for lineItems.
     * @param  discounts  Boolean value for discounts.
     * @param  taxes  Boolean value for taxes.
     * @param  refunds  Boolean value for refunds.
     * @param  applications  Boolean value for applications.
     */
    public ListCreditNotesInput(
            Integer subscriptionId,
            CreditNoteDateField dateField,
            String startDate,
            String endDate,
            String startDatetime,
            String endDatetime,
            Integer page,
            Integer perPage,
            Direction direction,
            Boolean lineItems,
            Boolean discounts,
            Boolean taxes,
            Boolean refunds,
            Boolean applications) {
        this.subscriptionId = subscriptionId;
        this.dateField = dateField;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startDatetime = startDatetime;
        this.endDatetime = endDatetime;
        this.page = page;
        this.perPage = perPage;
        this.direction = direction;
        this.lineItems = lineItems;
        this.discounts = discounts;
        this.taxes = taxes;
        this.refunds = refunds;
        this.applications = applications;
    }

    /**
     * Getter for SubscriptionId.
     * The subscription's Advanced Billing id
     * @return Returns the Integer
     */
    @JsonGetter("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * The subscription's Advanced Billing id
     * @param subscriptionId Value for Integer
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for DateField.
     * The type of filter you would like to apply to your search. Use in query
     * `date_field=issue_date`. If a date range is provided without an explicit `date_field`, it
     * defaults to `issue_date`. If only `start_datetime`/`end_datetime` are provided without an
     * explicit `date_field`, it defaults to `created_at` instead. An unrecognized `date_field` is
     * ignored rather than raising an error.
     * @return Returns the CreditNoteDateField
     */
    @JsonGetter("date_field")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreditNoteDateField getDateField() {
        return dateField;
    }

    /**
     * Setter for DateField.
     * The type of filter you would like to apply to your search. Use in query
     * `date_field=issue_date`. If a date range is provided without an explicit `date_field`, it
     * defaults to `issue_date`. If only `start_datetime`/`end_datetime` are provided without an
     * explicit `date_field`, it defaults to `created_at` instead. An unrecognized `date_field` is
     * ignored rather than raising an error.
     * @param dateField Value for CreditNoteDateField
     */
    @JsonSetter("date_field")
    public void setDateField(CreditNoteDateField dateField) {
        this.dateField = dateField;
    }

    /**
     * Getter for StartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns credit notes
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
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns credit notes
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
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns credit notes
     * with a timestamp up to and including 11:59:59PM in your site’s time zone on the date
     * specified.
     * @return Returns the String
     */
    @JsonGetter("end_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEndDate() {
        return endDate;
    }

    /**
     * Setter for EndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns credit notes
     * with a timestamp up to and including 11:59:59PM in your site’s time zone on the date
     * specified.
     * @param endDate Value for String
     */
    @JsonSetter("end_date")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * Getter for StartDatetime.
     * The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns credit notes with a timestamp at or after exact time provided in query. If provided,
     * this parameter will be used instead of start_date. If no timezone offset is included in the
     * value, it is interpreted as UTC. Allowed to be used only along with date_field set to
     * created_at or updated_at.
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
     * Returns credit notes with a timestamp at or after exact time provided in query. If provided,
     * this parameter will be used instead of start_date. If no timezone offset is included in the
     * value, it is interpreted as UTC. Allowed to be used only along with date_field set to
     * created_at or updated_at.
     * @param startDatetime Value for String
     */
    @JsonSetter("start_datetime")
    public void setStartDatetime(String startDatetime) {
        this.startDatetime = startDatetime;
    }

    /**
     * Getter for EndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns credit notes with a timestamp at or before exact time provided in query. If provided,
     * this parameter will be used instead of end_date. If no timezone offset is included in the
     * value, it is interpreted as UTC. Allowed to be used only along with date_field set to
     * created_at or updated_at.
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
     * Returns credit notes with a timestamp at or before exact time provided in query. If provided,
     * this parameter will be used instead of end_date. If no timezone offset is included in the
     * value, it is interpreted as UTC. Allowed to be used only along with date_field set to
     * created_at or updated_at.
     * @param endDatetime Value for String
     */
    @JsonSetter("end_datetime")
    public void setEndDatetime(String endDatetime) {
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
     * Getter for Direction.
     * The sort direction of the returned credit notes, sorted by sequence_number.
     * @return Returns the Direction
     */
    @JsonGetter("direction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Direction getDirection() {
        return direction;
    }

    /**
     * Setter for Direction.
     * The sort direction of the returned credit notes, sorted by sequence_number.
     * @param direction Value for Direction
     */
    @JsonSetter("direction")
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    /**
     * Getter for LineItems.
     * Include line items data.
     * @return Returns the Boolean
     */
    @JsonGetter("line_items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getLineItems() {
        return lineItems;
    }

    /**
     * Setter for LineItems.
     * Include line items data.
     * @param lineItems Value for Boolean
     */
    @JsonSetter("line_items")
    public void setLineItems(Boolean lineItems) {
        this.lineItems = lineItems;
    }

    /**
     * Getter for Discounts.
     * Include discounts data.
     * @return Returns the Boolean
     */
    @JsonGetter("discounts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDiscounts() {
        return discounts;
    }

    /**
     * Setter for Discounts.
     * Include discounts data.
     * @param discounts Value for Boolean
     */
    @JsonSetter("discounts")
    public void setDiscounts(Boolean discounts) {
        this.discounts = discounts;
    }

    /**
     * Getter for Taxes.
     * Include taxes data.
     * @return Returns the Boolean
     */
    @JsonGetter("taxes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTaxes() {
        return taxes;
    }

    /**
     * Setter for Taxes.
     * Include taxes data.
     * @param taxes Value for Boolean
     */
    @JsonSetter("taxes")
    public void setTaxes(Boolean taxes) {
        this.taxes = taxes;
    }

    /**
     * Getter for Refunds.
     * Include refunds data.
     * @return Returns the Boolean
     */
    @JsonGetter("refunds")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRefunds() {
        return refunds;
    }

    /**
     * Setter for Refunds.
     * Include refunds data.
     * @param refunds Value for Boolean
     */
    @JsonSetter("refunds")
    public void setRefunds(Boolean refunds) {
        this.refunds = refunds;
    }

    /**
     * Getter for Applications.
     * Include applications data.
     * @return Returns the Boolean
     */
    @JsonGetter("applications")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getApplications() {
        return applications;
    }

    /**
     * Setter for Applications.
     * Include applications data.
     * @param applications Value for Boolean
     */
    @JsonSetter("applications")
    public void setApplications(Boolean applications) {
        this.applications = applications;
    }

    /**
     * Converts this ListCreditNotesInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListCreditNotesInput [" + "subscriptionId=" + subscriptionId + ", dateField="
                + dateField + ", startDate=" + startDate + ", endDate=" + endDate
                + ", startDatetime=" + startDatetime + ", endDatetime=" + endDatetime + ", page="
                + page + ", perPage=" + perPage + ", direction=" + direction + ", lineItems="
                + lineItems + ", discounts=" + discounts + ", taxes=" + taxes + ", refunds="
                + refunds + ", applications=" + applications + "]";
    }

    /**
     * Builds a new {@link ListCreditNotesInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListCreditNotesInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .subscriptionId(getSubscriptionId())
                .dateField(getDateField())
                .startDate(getStartDate())
                .endDate(getEndDate())
                .startDatetime(getStartDatetime())
                .endDatetime(getEndDatetime())
                .page(getPage())
                .perPage(getPerPage())
                .direction(getDirection())
                .lineItems(getLineItems())
                .discounts(getDiscounts())
                .taxes(getTaxes())
                .refunds(getRefunds())
                .applications(getApplications());
        return builder;
    }

    /**
     * Class to build instances of {@link ListCreditNotesInput}.
     */
    public static class Builder {
        private Integer subscriptionId;
        private CreditNoteDateField dateField = CreditNoteDateField.ISSUE_DATE;
        private String startDate;
        private String endDate;
        private String startDatetime;
        private String endDatetime;
        private Integer page = 1;
        private Integer perPage = 20;
        private Direction direction = Direction.DESC;
        private Boolean lineItems = false;
        private Boolean discounts = false;
        private Boolean taxes = false;
        private Boolean refunds = false;
        private Boolean applications = false;



        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  Integer value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(Integer subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setter for dateField.
         * @param  dateField  CreditNoteDateField value for dateField.
         * @return Builder
         */
        public Builder dateField(CreditNoteDateField dateField) {
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
         * Setter for direction.
         * @param  direction  Direction value for direction.
         * @return Builder
         */
        public Builder direction(Direction direction) {
            this.direction = direction;
            return this;
        }

        /**
         * Setter for lineItems.
         * @param  lineItems  Boolean value for lineItems.
         * @return Builder
         */
        public Builder lineItems(Boolean lineItems) {
            this.lineItems = lineItems;
            return this;
        }

        /**
         * Setter for discounts.
         * @param  discounts  Boolean value for discounts.
         * @return Builder
         */
        public Builder discounts(Boolean discounts) {
            this.discounts = discounts;
            return this;
        }

        /**
         * Setter for taxes.
         * @param  taxes  Boolean value for taxes.
         * @return Builder
         */
        public Builder taxes(Boolean taxes) {
            this.taxes = taxes;
            return this;
        }

        /**
         * Setter for refunds.
         * @param  refunds  Boolean value for refunds.
         * @return Builder
         */
        public Builder refunds(Boolean refunds) {
            this.refunds = refunds;
            return this;
        }

        /**
         * Setter for applications.
         * @param  applications  Boolean value for applications.
         * @return Builder
         */
        public Builder applications(Boolean applications) {
            this.applications = applications;
            return this;
        }

        /**
         * Builds a new {@link ListCreditNotesInput} object using the set fields.
         * @return {@link ListCreditNotesInput}
         */
        public ListCreditNotesInput build() {
            return new ListCreditNotesInput(subscriptionId, dateField, startDate, endDate,
                    startDatetime, endDatetime, page, perPage, direction, lineItems, discounts,
                    taxes, refunds, applications);
        }
    }
}
