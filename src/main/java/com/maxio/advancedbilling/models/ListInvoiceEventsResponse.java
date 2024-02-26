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
 * This is a model class for ListInvoiceEventsResponse type.
 */
public class ListInvoiceEventsResponse {
    private List<InvoiceEvent> events;
    private Integer page;
    private Integer perPage;
    private Integer totalPages;

    /**
     * Default constructor.
     */
    public ListInvoiceEventsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  events  List of InvoiceEvent value for events.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  totalPages  Integer value for totalPages.
     */
    public ListInvoiceEventsResponse(
            List<InvoiceEvent> events,
            Integer page,
            Integer perPage,
            Integer totalPages) {
        this.events = events;
        this.page = page;
        this.perPage = perPage;
        this.totalPages = totalPages;
    }

    /**
     * Getter for Events.
     * @return Returns the List of InvoiceEvent
     */
    @JsonGetter("events")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InvoiceEvent> getEvents() {
        return events;
    }

    /**
     * Setter for Events.
     * @param events Value for List of InvoiceEvent
     */
    @JsonSetter("events")
    public void setEvents(List<InvoiceEvent> events) {
        this.events = events;
    }

    /**
     * Getter for Page.
     * @return Returns the Integer
     */
    @JsonGetter("page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPage() {
        return page;
    }

    /**
     * Setter for Page.
     * @param page Value for Integer
     */
    @JsonSetter("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * Getter for PerPage.
     * @return Returns the Integer
     */
    @JsonGetter("per_page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPerPage() {
        return perPage;
    }

    /**
     * Setter for PerPage.
     * @param perPage Value for Integer
     */
    @JsonSetter("per_page")
    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    /**
     * Getter for TotalPages.
     * @return Returns the Integer
     */
    @JsonGetter("total_pages")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * Setter for TotalPages.
     * @param totalPages Value for Integer
     */
    @JsonSetter("total_pages")
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * Converts this ListInvoiceEventsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListInvoiceEventsResponse [" + "events=" + events + ", page=" + page + ", perPage="
                + perPage + ", totalPages=" + totalPages + "]";
    }

    /**
     * Builds a new {@link ListInvoiceEventsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListInvoiceEventsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .events(getEvents())
                .page(getPage())
                .perPage(getPerPage())
                .totalPages(getTotalPages());
        return builder;
    }

    /**
     * Class to build instances of {@link ListInvoiceEventsResponse}.
     */
    public static class Builder {
        private List<InvoiceEvent> events;
        private Integer page;
        private Integer perPage;
        private Integer totalPages;



        /**
         * Setter for events.
         * @param  events  List of InvoiceEvent value for events.
         * @return Builder
         */
        public Builder events(List<InvoiceEvent> events) {
            this.events = events;
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
         * Setter for totalPages.
         * @param  totalPages  Integer value for totalPages.
         * @return Builder
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        /**
         * Builds a new {@link ListInvoiceEventsResponse} object using the set fields.
         * @return {@link ListInvoiceEventsResponse}
         */
        public ListInvoiceEventsResponse build() {
            return new ListInvoiceEventsResponse(events, page, perPage, totalPages);
        }
    }
}
