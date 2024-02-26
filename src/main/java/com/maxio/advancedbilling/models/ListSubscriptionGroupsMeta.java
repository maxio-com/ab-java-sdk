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
 * This is a model class for ListSubscriptionGroupsMeta type.
 */
public class ListSubscriptionGroupsMeta {
    private Integer currentPage;
    private Integer totalCount;

    /**
     * Default constructor.
     */
    public ListSubscriptionGroupsMeta() {
    }

    /**
     * Initialization constructor.
     * @param  currentPage  Integer value for currentPage.
     * @param  totalCount  Integer value for totalCount.
     */
    public ListSubscriptionGroupsMeta(
            Integer currentPage,
            Integer totalCount) {
        this.currentPage = currentPage;
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
     * Converts this ListSubscriptionGroupsMeta into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListSubscriptionGroupsMeta [" + "currentPage=" + currentPage + ", totalCount="
                + totalCount + "]";
    }

    /**
     * Builds a new {@link ListSubscriptionGroupsMeta.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListSubscriptionGroupsMeta.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .currentPage(getCurrentPage())
                .totalCount(getTotalCount());
        return builder;
    }

    /**
     * Class to build instances of {@link ListSubscriptionGroupsMeta}.
     */
    public static class Builder {
        private Integer currentPage;
        private Integer totalCount;



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
         * Setter for totalCount.
         * @param  totalCount  Integer value for totalCount.
         * @return Builder
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Builds a new {@link ListSubscriptionGroupsMeta} object using the set fields.
         * @return {@link ListSubscriptionGroupsMeta}
         */
        public ListSubscriptionGroupsMeta build() {
            return new ListSubscriptionGroupsMeta(currentPage, totalCount);
        }
    }
}
