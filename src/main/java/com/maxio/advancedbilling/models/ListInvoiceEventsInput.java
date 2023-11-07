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
 * This is a model class for ListInvoiceEventsInput type.
 */
public class ListInvoiceEventsInput {
    private String sinceDate;
    private Integer sinceId;
    private Integer page;
    private Integer perPage;
    private String invoiceUid;
    private String withChangeInvoiceStatus;
    private List<InvoiceEventType> eventTypes;

    /**
     * Default constructor.
     */
    public ListInvoiceEventsInput() {
        page = 1;
        perPage = 100;
    }

    /**
     * Initialization constructor.
     * @param  sinceDate  String value for sinceDate.
     * @param  sinceId  Integer value for sinceId.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  invoiceUid  String value for invoiceUid.
     * @param  withChangeInvoiceStatus  String value for withChangeInvoiceStatus.
     * @param  eventTypes  List of InvoiceEventType value for eventTypes.
     */
    public ListInvoiceEventsInput(
            String sinceDate,
            Integer sinceId,
            Integer page,
            Integer perPage,
            String invoiceUid,
            String withChangeInvoiceStatus,
            List<InvoiceEventType> eventTypes) {
        this.sinceDate = sinceDate;
        this.sinceId = sinceId;
        this.page = page;
        this.perPage = perPage;
        this.invoiceUid = invoiceUid;
        this.withChangeInvoiceStatus = withChangeInvoiceStatus;
        this.eventTypes = eventTypes;
    }

    /**
     * Getter for SinceDate.
     * The timestamp in a format `YYYY-MM-DD T HH:MM:SS Z`, or `YYYY-MM-DD`(in this case, it returns
     * data from the beginning of the day). of the event from which you want to start the search.
     * All the events before the `since_date` timestamp are not returned in the response.
     * @return Returns the String
     */
    @JsonGetter("since_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSinceDate() {
        return sinceDate;
    }

    /**
     * Setter for SinceDate.
     * The timestamp in a format `YYYY-MM-DD T HH:MM:SS Z`, or `YYYY-MM-DD`(in this case, it returns
     * data from the beginning of the day). of the event from which you want to start the search.
     * All the events before the `since_date` timestamp are not returned in the response.
     * @param sinceDate Value for String
     */
    @JsonSetter("since_date")
    public void setSinceDate(String sinceDate) {
        this.sinceDate = sinceDate;
    }

    /**
     * Getter for SinceId.
     * The ID of the event from which you want to start the search(ID is not included. e.g. if ID is
     * set to 2, then all events with ID 3 and more will be shown) This parameter is not used if
     * since_date is defined.
     * @return Returns the Integer
     */
    @JsonGetter("since_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSinceId() {
        return sinceId;
    }

    /**
     * Setter for SinceId.
     * The ID of the event from which you want to start the search(ID is not included. e.g. if ID is
     * set to 2, then all events with ID 3 and more will be shown) This parameter is not used if
     * since_date is defined.
     * @param sinceId Value for Integer
     */
    @JsonSetter("since_id")
    public void setSinceId(Integer sinceId) {
        this.sinceId = sinceId;
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
     * This parameter indicates how many records to fetch in each request. Default value is 100. The
     * maximum allowed values is 200; any per_page value over 200 will be changed to 200.
     * @return Returns the Integer
     */
    @JsonGetter("per_page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPerPage() {
        return perPage;
    }

    /**
     * Setter for PerPage.
     * This parameter indicates how many records to fetch in each request. Default value is 100. The
     * maximum allowed values is 200; any per_page value over 200 will be changed to 200.
     * @param perPage Value for Integer
     */
    @JsonSetter("per_page")
    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    /**
     * Getter for InvoiceUid.
     * Providing an invoice_uid allows for scoping of the invoice events to a single invoice or
     * credit note.
     * @return Returns the String
     */
    @JsonGetter("invoice_uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInvoiceUid() {
        return invoiceUid;
    }

    /**
     * Setter for InvoiceUid.
     * Providing an invoice_uid allows for scoping of the invoice events to a single invoice or
     * credit note.
     * @param invoiceUid Value for String
     */
    @JsonSetter("invoice_uid")
    public void setInvoiceUid(String invoiceUid) {
        this.invoiceUid = invoiceUid;
    }

    /**
     * Getter for WithChangeInvoiceStatus.
     * Use this parameter if you want to fetch also invoice events with change_invoice_status type.
     * @return Returns the String
     */
    @JsonGetter("with_change_invoice_status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getWithChangeInvoiceStatus() {
        return withChangeInvoiceStatus;
    }

    /**
     * Setter for WithChangeInvoiceStatus.
     * Use this parameter if you want to fetch also invoice events with change_invoice_status type.
     * @param withChangeInvoiceStatus Value for String
     */
    @JsonSetter("with_change_invoice_status")
    public void setWithChangeInvoiceStatus(String withChangeInvoiceStatus) {
        this.withChangeInvoiceStatus = withChangeInvoiceStatus;
    }

    /**
     * Getter for EventTypes.
     * Filter results by event_type. Supply a comma separated list of event types (listed above).
     * Use in query: `event_types=void_invoice,void_remainder`.
     * @return Returns the List of InvoiceEventType
     */
    @JsonGetter("event_types")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InvoiceEventType> getEventTypes() {
        return eventTypes;
    }

    /**
     * Setter for EventTypes.
     * Filter results by event_type. Supply a comma separated list of event types (listed above).
     * Use in query: `event_types=void_invoice,void_remainder`.
     * @param eventTypes Value for List of InvoiceEventType
     */
    @JsonSetter("event_types")
    public void setEventTypes(List<InvoiceEventType> eventTypes) {
        this.eventTypes = eventTypes;
    }

    /**
     * Converts this ListInvoiceEventsInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListInvoiceEventsInput [" + "sinceDate=" + sinceDate + ", sinceId=" + sinceId
                + ", page=" + page + ", perPage=" + perPage + ", invoiceUid=" + invoiceUid
                + ", withChangeInvoiceStatus=" + withChangeInvoiceStatus + ", eventTypes="
                + eventTypes + "]";
    }

    /**
     * Builds a new {@link ListInvoiceEventsInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListInvoiceEventsInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .sinceDate(getSinceDate())
                .sinceId(getSinceId())
                .page(getPage())
                .perPage(getPerPage())
                .invoiceUid(getInvoiceUid())
                .withChangeInvoiceStatus(getWithChangeInvoiceStatus())
                .eventTypes(getEventTypes());
        return builder;
    }

    /**
     * Class to build instances of {@link ListInvoiceEventsInput}.
     */
    public static class Builder {
        private String sinceDate;
        private Integer sinceId;
        private Integer page = 1;
        private Integer perPage = 100;
        private String invoiceUid;
        private String withChangeInvoiceStatus;
        private List<InvoiceEventType> eventTypes;



        /**
         * Setter for sinceDate.
         * @param  sinceDate  String value for sinceDate.
         * @return Builder
         */
        public Builder sinceDate(String sinceDate) {
            this.sinceDate = sinceDate;
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
         * Setter for invoiceUid.
         * @param  invoiceUid  String value for invoiceUid.
         * @return Builder
         */
        public Builder invoiceUid(String invoiceUid) {
            this.invoiceUid = invoiceUid;
            return this;
        }

        /**
         * Setter for withChangeInvoiceStatus.
         * @param  withChangeInvoiceStatus  String value for withChangeInvoiceStatus.
         * @return Builder
         */
        public Builder withChangeInvoiceStatus(String withChangeInvoiceStatus) {
            this.withChangeInvoiceStatus = withChangeInvoiceStatus;
            return this;
        }

        /**
         * Setter for eventTypes.
         * @param  eventTypes  List of InvoiceEventType value for eventTypes.
         * @return Builder
         */
        public Builder eventTypes(List<InvoiceEventType> eventTypes) {
            this.eventTypes = eventTypes;
            return this;
        }

        /**
         * Builds a new {@link ListInvoiceEventsInput} object using the set fields.
         * @return {@link ListInvoiceEventsInput}
         */
        public ListInvoiceEventsInput build() {
            return new ListInvoiceEventsInput(sinceDate, sinceId, page, perPage, invoiceUid,
                    withChangeInvoiceStatus, eventTypes);
        }
    }
}
