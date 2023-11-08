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
 * This is a model class for ListExportedInvoicesInput type.
 */
public class ListExportedInvoicesInput {
    private String batchId;
    private Integer perPage;
    private Integer page;

    /**
     * Default constructor.
     */
    public ListExportedInvoicesInput() {
        perPage = 100;
        page = 1;
    }

    /**
     * Initialization constructor.
     * @param  batchId  String value for batchId.
     * @param  perPage  Integer value for perPage.
     * @param  page  Integer value for page.
     */
    public ListExportedInvoicesInput(
            String batchId,
            Integer perPage,
            Integer page) {
        this.batchId = batchId;
        this.perPage = perPage;
        this.page = page;
    }

    /**
     * Getter for BatchId.
     * Id of a Batch Job.
     * @return Returns the String
     */
    @JsonGetter("batch_id")
    public String getBatchId() {
        return batchId;
    }

    /**
     * Setter for BatchId.
     * Id of a Batch Job.
     * @param batchId Value for String
     */
    @JsonSetter("batch_id")
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    /**
     * Getter for PerPage.
     * This parameter indicates how many records to fetch in each request. Default value is 100. The
     * maximum allowed values is 10000; any per_page value over 10000 will be changed to 10000.
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
     * maximum allowed values is 10000; any per_page value over 10000 will be changed to 10000.
     * @param perPage Value for Integer
     */
    @JsonSetter("per_page")
    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
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
     * Converts this ListExportedInvoicesInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListExportedInvoicesInput [" + "batchId=" + batchId + ", perPage=" + perPage
                + ", page=" + page + "]";
    }

    /**
     * Builds a new {@link ListExportedInvoicesInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListExportedInvoicesInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(batchId)
                .perPage(getPerPage())
                .page(getPage());
        return builder;
    }

    /**
     * Class to build instances of {@link ListExportedInvoicesInput}.
     */
    public static class Builder {
        private String batchId;
        private Integer perPage = 100;
        private Integer page = 1;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  batchId  String value for batchId.
         */
        public Builder(String batchId) {
            this.batchId = batchId;
        }

        /**
         * Setter for batchId.
         * @param  batchId  String value for batchId.
         * @return Builder
         */
        public Builder batchId(String batchId) {
            this.batchId = batchId;
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
         * Setter for page.
         * @param  page  Integer value for page.
         * @return Builder
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Builds a new {@link ListExportedInvoicesInput} object using the set fields.
         * @return {@link ListExportedInvoicesInput}
         */
        public ListExportedInvoicesInput build() {
            return new ListExportedInvoicesInput(batchId, perPage, page);
        }
    }
}
