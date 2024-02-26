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
 * This is a model class for ListPublicKeysMeta type.
 */
public class ListPublicKeysMeta {
    private Integer totalCount;
    private Integer currentPage;
    private Integer totalPages;
    private Integer perPage;

    /**
     * Default constructor.
     */
    public ListPublicKeysMeta() {
    }

    /**
     * Initialization constructor.
     * @param  totalCount  Integer value for totalCount.
     * @param  currentPage  Integer value for currentPage.
     * @param  totalPages  Integer value for totalPages.
     * @param  perPage  Integer value for perPage.
     */
    public ListPublicKeysMeta(
            Integer totalCount,
            Integer currentPage,
            Integer totalPages,
            Integer perPage) {
        this.totalCount = totalCount;
        this.currentPage = currentPage;
        this.totalPages = totalPages;
        this.perPage = perPage;
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
     * Converts this ListPublicKeysMeta into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListPublicKeysMeta [" + "totalCount=" + totalCount + ", currentPage=" + currentPage
                + ", totalPages=" + totalPages + ", perPage=" + perPage + "]";
    }

    /**
     * Builds a new {@link ListPublicKeysMeta.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListPublicKeysMeta.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .totalCount(getTotalCount())
                .currentPage(getCurrentPage())
                .totalPages(getTotalPages())
                .perPage(getPerPage());
        return builder;
    }

    /**
     * Class to build instances of {@link ListPublicKeysMeta}.
     */
    public static class Builder {
        private Integer totalCount;
        private Integer currentPage;
        private Integer totalPages;
        private Integer perPage;



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
         * Setter for perPage.
         * @param  perPage  Integer value for perPage.
         * @return Builder
         */
        public Builder perPage(Integer perPage) {
            this.perPage = perPage;
            return this;
        }

        /**
         * Builds a new {@link ListPublicKeysMeta} object using the set fields.
         * @return {@link ListPublicKeysMeta}
         */
        public ListPublicKeysMeta build() {
            return new ListPublicKeysMeta(totalCount, currentPage, totalPages, perPage);
        }
    }
}
