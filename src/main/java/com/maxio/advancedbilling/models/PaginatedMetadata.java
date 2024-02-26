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
 * This is a model class for PaginatedMetadata type.
 */
public class PaginatedMetadata {
    private Integer totalCount;
    private Integer currentPage;
    private Integer totalPages;
    private Integer perPage;
    private List<Metadata> metadata;

    /**
     * Default constructor.
     */
    public PaginatedMetadata() {
    }

    /**
     * Initialization constructor.
     * @param  totalCount  Integer value for totalCount.
     * @param  currentPage  Integer value for currentPage.
     * @param  totalPages  Integer value for totalPages.
     * @param  perPage  Integer value for perPage.
     * @param  metadata  List of Metadata value for metadata.
     */
    public PaginatedMetadata(
            Integer totalCount,
            Integer currentPage,
            Integer totalPages,
            Integer perPage,
            List<Metadata> metadata) {
        this.totalCount = totalCount;
        this.currentPage = currentPage;
        this.totalPages = totalPages;
        this.perPage = perPage;
        this.metadata = metadata;
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
     * Getter for Metadata.
     * @return Returns the List of Metadata
     */
    @JsonGetter("metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Metadata> getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * @param metadata Value for List of Metadata
     */
    @JsonSetter("metadata")
    public void setMetadata(List<Metadata> metadata) {
        this.metadata = metadata;
    }

    /**
     * Converts this PaginatedMetadata into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaginatedMetadata [" + "totalCount=" + totalCount + ", currentPage=" + currentPage
                + ", totalPages=" + totalPages + ", perPage=" + perPage + ", metadata=" + metadata
                + "]";
    }

    /**
     * Builds a new {@link PaginatedMetadata.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaginatedMetadata.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .totalCount(getTotalCount())
                .currentPage(getCurrentPage())
                .totalPages(getTotalPages())
                .perPage(getPerPage())
                .metadata(getMetadata());
        return builder;
    }

    /**
     * Class to build instances of {@link PaginatedMetadata}.
     */
    public static class Builder {
        private Integer totalCount;
        private Integer currentPage;
        private Integer totalPages;
        private Integer perPage;
        private List<Metadata> metadata;



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
         * Setter for metadata.
         * @param  metadata  List of Metadata value for metadata.
         * @return Builder
         */
        public Builder metadata(List<Metadata> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds a new {@link PaginatedMetadata} object using the set fields.
         * @return {@link PaginatedMetadata}
         */
        public PaginatedMetadata build() {
            return new PaginatedMetadata(totalCount, currentPage, totalPages, perPage, metadata);
        }
    }
}
