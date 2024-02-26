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
 * This is a model class for ListMetafieldsResponse type.
 */
public class ListMetafieldsResponse {
    private Integer totalCount;
    private Integer currentPage;
    private Integer totalPages;
    private Integer perPage;
    private List<Metafield> metafields;

    /**
     * Default constructor.
     */
    public ListMetafieldsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  totalCount  Integer value for totalCount.
     * @param  currentPage  Integer value for currentPage.
     * @param  totalPages  Integer value for totalPages.
     * @param  perPage  Integer value for perPage.
     * @param  metafields  List of Metafield value for metafields.
     */
    public ListMetafieldsResponse(
            Integer totalCount,
            Integer currentPage,
            Integer totalPages,
            Integer perPage,
            List<Metafield> metafields) {
        this.totalCount = totalCount;
        this.currentPage = currentPage;
        this.totalPages = totalPages;
        this.perPage = perPage;
        this.metafields = metafields;
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
     * Getter for Metafields.
     * @return Returns the List of Metafield
     */
    @JsonGetter("metafields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Metafield> getMetafields() {
        return metafields;
    }

    /**
     * Setter for Metafields.
     * @param metafields Value for List of Metafield
     */
    @JsonSetter("metafields")
    public void setMetafields(List<Metafield> metafields) {
        this.metafields = metafields;
    }

    /**
     * Converts this ListMetafieldsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListMetafieldsResponse [" + "totalCount=" + totalCount + ", currentPage="
                + currentPage + ", totalPages=" + totalPages + ", perPage=" + perPage
                + ", metafields=" + metafields + "]";
    }

    /**
     * Builds a new {@link ListMetafieldsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListMetafieldsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .totalCount(getTotalCount())
                .currentPage(getCurrentPage())
                .totalPages(getTotalPages())
                .perPage(getPerPage())
                .metafields(getMetafields());
        return builder;
    }

    /**
     * Class to build instances of {@link ListMetafieldsResponse}.
     */
    public static class Builder {
        private Integer totalCount;
        private Integer currentPage;
        private Integer totalPages;
        private Integer perPage;
        private List<Metafield> metafields;



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
         * Setter for metafields.
         * @param  metafields  List of Metafield value for metafields.
         * @return Builder
         */
        public Builder metafields(List<Metafield> metafields) {
            this.metafields = metafields;
            return this;
        }

        /**
         * Builds a new {@link ListMetafieldsResponse} object using the set fields.
         * @return {@link ListMetafieldsResponse}
         */
        public ListMetafieldsResponse build() {
            return new ListMetafieldsResponse(totalCount, currentPage, totalPages, perPage,
                    metafields);
        }
    }
}
