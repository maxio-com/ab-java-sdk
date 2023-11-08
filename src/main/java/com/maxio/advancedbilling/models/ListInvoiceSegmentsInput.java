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
 * This is a model class for ListInvoiceSegmentsInput type.
 */
public class ListInvoiceSegmentsInput {
    private String invoiceUid;
    private Integer page;
    private Integer perPage;
    private Direction direction;

    /**
     * Default constructor.
     */
    public ListInvoiceSegmentsInput() {
        page = 1;
        perPage = 20;
        direction = Direction.ASC;
    }

    /**
     * Initialization constructor.
     * @param  invoiceUid  String value for invoiceUid.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  direction  Direction value for direction.
     */
    public ListInvoiceSegmentsInput(
            String invoiceUid,
            Integer page,
            Integer perPage,
            Direction direction) {
        this.invoiceUid = invoiceUid;
        this.page = page;
        this.perPage = perPage;
        this.direction = direction;
    }

    /**
     * Getter for InvoiceUid.
     * The unique identifier of the consolidated invoice
     * @return Returns the String
     */
    @JsonGetter("invoice_uid")
    public String getInvoiceUid() {
        return invoiceUid;
    }

    /**
     * Setter for InvoiceUid.
     * The unique identifier of the consolidated invoice
     * @param invoiceUid Value for String
     */
    @JsonSetter("invoice_uid")
    public void setInvoiceUid(String invoiceUid) {
        this.invoiceUid = invoiceUid;
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
     * Sort direction of the returned segments.
     * @return Returns the Direction
     */
    @JsonGetter("direction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Direction getDirection() {
        return direction;
    }

    /**
     * Setter for Direction.
     * Sort direction of the returned segments.
     * @param direction Value for Direction
     */
    @JsonSetter("direction")
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    /**
     * Converts this ListInvoiceSegmentsInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListInvoiceSegmentsInput [" + "invoiceUid=" + invoiceUid + ", page=" + page
                + ", perPage=" + perPage + ", direction=" + direction + "]";
    }

    /**
     * Builds a new {@link ListInvoiceSegmentsInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListInvoiceSegmentsInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(invoiceUid)
                .page(getPage())
                .perPage(getPerPage())
                .direction(getDirection());
        return builder;
    }

    /**
     * Class to build instances of {@link ListInvoiceSegmentsInput}.
     */
    public static class Builder {
        private String invoiceUid;
        private Integer page = 1;
        private Integer perPage = 20;
        private Direction direction = Direction.ASC;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  invoiceUid  String value for invoiceUid.
         */
        public Builder(String invoiceUid) {
            this.invoiceUid = invoiceUid;
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
         * Builds a new {@link ListInvoiceSegmentsInput} object using the set fields.
         * @return {@link ListInvoiceSegmentsInput}
         */
        public ListInvoiceSegmentsInput build() {
            return new ListInvoiceSegmentsInput(invoiceUid, page, perPage, direction);
        }
    }
}
