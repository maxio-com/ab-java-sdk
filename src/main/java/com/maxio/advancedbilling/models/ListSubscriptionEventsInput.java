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
 * This is a model class for ListSubscriptionEventsInput type.
 */
public class ListSubscriptionEventsInput {
    private int subscriptionId;
    private Integer page;
    private Integer perPage;
    private Long sinceId;
    private Long maxId;
    private Direction direction;
    private List<EventKey> filter;

    /**
     * Default constructor.
     */
    public ListSubscriptionEventsInput() {
        page = 1;
        perPage = 20;
        direction = Direction.DESC;
    }

    /**
     * Initialization constructor.
     * @param  subscriptionId  int value for subscriptionId.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  sinceId  Long value for sinceId.
     * @param  maxId  Long value for maxId.
     * @param  direction  Direction value for direction.
     * @param  filter  List of EventKey value for filter.
     */
    public ListSubscriptionEventsInput(
            int subscriptionId,
            Integer page,
            Integer perPage,
            Long sinceId,
            Long maxId,
            Direction direction,
            List<EventKey> filter) {
        this.subscriptionId = subscriptionId;
        this.page = page;
        this.perPage = perPage;
        this.sinceId = sinceId;
        this.maxId = maxId;
        this.direction = direction;
        this.filter = filter;
    }

    /**
     * Getter for SubscriptionId.
     * The Chargify id of the subscription
     * @return Returns the int
     */
    @JsonGetter("subscription_id")
    public int getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * The Chargify id of the subscription
     * @param subscriptionId Value for int
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
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
     * Getter for SinceId.
     * Returns events with an id greater than or equal to the one specified
     * @return Returns the Long
     */
    @JsonGetter("since_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getSinceId() {
        return sinceId;
    }

    /**
     * Setter for SinceId.
     * Returns events with an id greater than or equal to the one specified
     * @param sinceId Value for Long
     */
    @JsonSetter("since_id")
    public void setSinceId(Long sinceId) {
        this.sinceId = sinceId;
    }

    /**
     * Getter for MaxId.
     * Returns events with an id less than or equal to the one specified
     * @return Returns the Long
     */
    @JsonGetter("max_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getMaxId() {
        return maxId;
    }

    /**
     * Setter for MaxId.
     * Returns events with an id less than or equal to the one specified
     * @param maxId Value for Long
     */
    @JsonSetter("max_id")
    public void setMaxId(Long maxId) {
        this.maxId = maxId;
    }

    /**
     * Getter for Direction.
     * The sort direction of the returned events.
     * @return Returns the Direction
     */
    @JsonGetter("direction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Direction getDirection() {
        return direction;
    }

    /**
     * Setter for Direction.
     * The sort direction of the returned events.
     * @param direction Value for Direction
     */
    @JsonSetter("direction")
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    /**
     * Getter for Filter.
     * You can pass multiple event keys after comma. Use in query
     * `filter=signup_success,payment_success`.
     * @return Returns the List of EventKey
     */
    @JsonGetter("filter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<EventKey> getFilter() {
        return filter;
    }

    /**
     * Setter for Filter.
     * You can pass multiple event keys after comma. Use in query
     * `filter=signup_success,payment_success`.
     * @param filter Value for List of EventKey
     */
    @JsonSetter("filter")
    public void setFilter(List<EventKey> filter) {
        this.filter = filter;
    }

    /**
     * Converts this ListSubscriptionEventsInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListSubscriptionEventsInput [" + "subscriptionId=" + subscriptionId + ", page="
                + page + ", perPage=" + perPage + ", sinceId=" + sinceId + ", maxId=" + maxId
                + ", direction=" + direction + ", filter=" + filter + "]";
    }

    /**
     * Builds a new {@link ListSubscriptionEventsInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListSubscriptionEventsInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscriptionId)
                .page(getPage())
                .perPage(getPerPage())
                .sinceId(getSinceId())
                .maxId(getMaxId())
                .direction(getDirection())
                .filter(getFilter());
        return builder;
    }

    /**
     * Class to build instances of {@link ListSubscriptionEventsInput}.
     */
    public static class Builder {
        private int subscriptionId;
        private Integer page = 1;
        private Integer perPage = 20;
        private Long sinceId;
        private Long maxId;
        private Direction direction = Direction.DESC;
        private List<EventKey> filter;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  subscriptionId  int value for subscriptionId.
         */
        public Builder(int subscriptionId) {
            this.subscriptionId = subscriptionId;
        }

        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  int value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(int subscriptionId) {
            this.subscriptionId = subscriptionId;
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
         * Setter for sinceId.
         * @param  sinceId  Long value for sinceId.
         * @return Builder
         */
        public Builder sinceId(Long sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        /**
         * Setter for maxId.
         * @param  maxId  Long value for maxId.
         * @return Builder
         */
        public Builder maxId(Long maxId) {
            this.maxId = maxId;
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
         * Setter for filter.
         * @param  filter  List of EventKey value for filter.
         * @return Builder
         */
        public Builder filter(List<EventKey> filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Builds a new {@link ListSubscriptionEventsInput} object using the set fields.
         * @return {@link ListSubscriptionEventsInput}
         */
        public ListSubscriptionEventsInput build() {
            return new ListSubscriptionEventsInput(subscriptionId, page, perPage, sinceId, maxId,
                    direction, filter);
        }
    }
}
