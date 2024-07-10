/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for ListProformaInvoicesMeta type.
 */
public class ListProformaInvoicesMeta
        extends BaseModel {
    private Integer totalCount;
    private Integer currentPage;
    private Integer totalPages;
    private Integer statusCode;

    /**
     * Default constructor.
     */
    public ListProformaInvoicesMeta() {
    }

    /**
     * Initialization constructor.
     * @param  totalCount  Integer value for totalCount.
     * @param  currentPage  Integer value for currentPage.
     * @param  totalPages  Integer value for totalPages.
     * @param  statusCode  Integer value for statusCode.
     */
    public ListProformaInvoicesMeta(
            Integer totalCount,
            Integer currentPage,
            Integer totalPages,
            Integer statusCode) {
        this.totalCount = totalCount;
        this.currentPage = currentPage;
        this.totalPages = totalPages;
        this.statusCode = statusCode;
    }

    /**
     * Getter for TotalCount.
     * @return Returns the Integer
     */
    @JsonGetter("total_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * Setter for TotalCount.
     * @param totalCount Value for Integer
     */
    @JsonSetter("total_count")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * Getter for CurrentPage.
     * @return Returns the Integer
     */
    @JsonGetter("current_page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCurrentPage() {
        return currentPage;
    }

    /**
     * Setter for CurrentPage.
     * @param currentPage Value for Integer
     */
    @JsonSetter("current_page")
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
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
     * Getter for StatusCode.
     * @return Returns the Integer
     */
    @JsonGetter("status_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * Setter for StatusCode.
     * @param statusCode Value for Integer
     */
    @JsonSetter("status_code")
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * Converts this ListProformaInvoicesMeta into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListProformaInvoicesMeta [" + "totalCount=" + totalCount + ", currentPage="
                + currentPage + ", totalPages=" + totalPages + ", statusCode=" + statusCode
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .totalCount(getTotalCount())
                .currentPage(getCurrentPage())
                .totalPages(getTotalPages())
                .statusCode(getStatusCode());
        return builder;
    }

    /**
     * Class to build instances of {@link ListProformaInvoicesMeta}.
     */
    public static class Builder {
        private Integer totalCount;
        private Integer currentPage;
        private Integer totalPages;
        private Integer statusCode;



        /**
         * Setter for totalCount.
         * @param  totalCount  Integer value for totalCount.
         * @return Builder
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Setter for currentPage.
         * @param  currentPage  Integer value for currentPage.
         * @return Builder
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
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
         * Setter for statusCode.
         * @param  statusCode  Integer value for statusCode.
         * @return Builder
         */
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Builds a new {@link ListProformaInvoicesMeta} object using the set fields.
         * @return {@link ListProformaInvoicesMeta}
         */
        public ListProformaInvoicesMeta build() {
            return new ListProformaInvoicesMeta(totalCount, currentPage, totalPages, statusCode);
        }
    }
}
