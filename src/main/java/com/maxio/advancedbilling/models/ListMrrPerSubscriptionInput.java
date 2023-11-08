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
 * This is a model class for ListMrrPerSubscriptionInput type.
 */
public class ListMrrPerSubscriptionInput {
    private List<Integer> filterSubscriptionIds;
    private String atTime;
    private Integer page;
    private Integer perPage;
    private Direction direction;

    /**
     * Default constructor.
     */
    public ListMrrPerSubscriptionInput() {
        page = 1;
        perPage = 20;
    }

    /**
     * Initialization constructor.
     * @param  filterSubscriptionIds  List of Integer value for filterSubscriptionIds.
     * @param  atTime  String value for atTime.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  direction  Direction value for direction.
     */
    public ListMrrPerSubscriptionInput(
            List<Integer> filterSubscriptionIds,
            String atTime,
            Integer page,
            Integer perPage,
            Direction direction) {
        this.filterSubscriptionIds = filterSubscriptionIds;
        this.atTime = atTime;
        this.page = page;
        this.perPage = perPage;
        this.direction = direction;
    }

    /**
     * Getter for FilterSubscriptionIds.
     * Submit ids in order to limit results. Use in query: `filter[subscription_ids]=1,2,3`.
     * @return Returns the List of Integer
     */
    @JsonGetter("filter[subscription_ids]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getFilterSubscriptionIds() {
        return filterSubscriptionIds;
    }

    /**
     * Setter for FilterSubscriptionIds.
     * Submit ids in order to limit results. Use in query: `filter[subscription_ids]=1,2,3`.
     * @param filterSubscriptionIds Value for List of Integer
     */
    @JsonSetter("filter[subscription_ids]")
    public void setFilterSubscriptionIds(List<Integer> filterSubscriptionIds) {
        this.filterSubscriptionIds = filterSubscriptionIds;
    }

    /**
     * Getter for AtTime.
     * Submit a timestamp in ISO8601 format to request MRR for a historic time. Use in query:
     * `at_time=2022-01-10T10:00:00-05:00`.
     * @return Returns the String
     */
    @JsonGetter("at_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAtTime() {
        return atTime;
    }

    /**
     * Setter for AtTime.
     * Submit a timestamp in ISO8601 format to request MRR for a historic time. Use in query:
     * `at_time=2022-01-10T10:00:00-05:00`.
     * @param atTime Value for String
     */
    @JsonSetter("at_time")
    public void setAtTime(String atTime) {
        this.atTime = atTime;
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
     * Controls the order in which results are returned. Records are ordered by subscription_id in
     * ascending order by default. Use in query `direction=desc`.
     * @return Returns the Direction
     */
    @JsonGetter("direction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Direction getDirection() {
        return direction;
    }

    /**
     * Setter for Direction.
     * Controls the order in which results are returned. Records are ordered by subscription_id in
     * ascending order by default. Use in query `direction=desc`.
     * @param direction Value for Direction
     */
    @JsonSetter("direction")
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    /**
     * Converts this ListMrrPerSubscriptionInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListMrrPerSubscriptionInput [" + "filterSubscriptionIds=" + filterSubscriptionIds
                + ", atTime=" + atTime + ", page=" + page + ", perPage=" + perPage + ", direction="
                + direction + "]";
    }

    /**
     * Builds a new {@link ListMrrPerSubscriptionInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListMrrPerSubscriptionInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .filterSubscriptionIds(getFilterSubscriptionIds())
                .atTime(getAtTime())
                .page(getPage())
                .perPage(getPerPage())
                .direction(getDirection());
        return builder;
    }

    /**
     * Class to build instances of {@link ListMrrPerSubscriptionInput}.
     */
    public static class Builder {
        private List<Integer> filterSubscriptionIds;
        private String atTime;
        private Integer page = 1;
        private Integer perPage = 20;
        private Direction direction;



        /**
         * Setter for filterSubscriptionIds.
         * @param  filterSubscriptionIds  List of Integer value for filterSubscriptionIds.
         * @return Builder
         */
        public Builder filterSubscriptionIds(List<Integer> filterSubscriptionIds) {
            this.filterSubscriptionIds = filterSubscriptionIds;
            return this;
        }

        /**
         * Setter for atTime.
         * @param  atTime  String value for atTime.
         * @return Builder
         */
        public Builder atTime(String atTime) {
            this.atTime = atTime;
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
         * Builds a new {@link ListMrrPerSubscriptionInput} object using the set fields.
         * @return {@link ListMrrPerSubscriptionInput}
         */
        public ListMrrPerSubscriptionInput build() {
            return new ListMrrPerSubscriptionInput(filterSubscriptionIds, atTime, page, perPage,
                    direction);
        }
    }
}
