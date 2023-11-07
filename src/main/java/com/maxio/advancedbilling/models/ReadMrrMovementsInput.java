/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.ReadMrrMovementsInputDirection;

/**
 * This is a model class for ReadMrrMovementsInput type.
 */
public class ReadMrrMovementsInput {
    private Integer subscriptionId;
    private Integer page;
    private Integer perPage;
    private ReadMrrMovementsInputDirection direction;

    /**
     * Default constructor.
     */
    public ReadMrrMovementsInput() {
        page = 1;
        perPage = 10;
    }

    /**
     * Initialization constructor.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  direction  ReadMrrMovementsInputDirection value for direction.
     */
    public ReadMrrMovementsInput(
            Integer subscriptionId,
            Integer page,
            Integer perPage,
            ReadMrrMovementsInputDirection direction) {
        this.subscriptionId = subscriptionId;
        this.page = page;
        this.perPage = perPage;
        this.direction = direction;
    }

    /**
     * Getter for SubscriptionId.
     * optionally filter results by subscription
     * @return Returns the Integer
     */
    @JsonGetter("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * optionally filter results by subscription
     * @param subscriptionId Value for Integer
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(Integer subscriptionId) {
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
     * This parameter indicates how many records to fetch in each request. Default value is 10. The
     * maximum allowed values is 50; any per_page value over 50 will be changed to 50. Use in query
     * `per_page=20`.
     * @return Returns the Integer
     */
    @JsonGetter("per_page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPerPage() {
        return perPage;
    }

    /**
     * Setter for PerPage.
     * This parameter indicates how many records to fetch in each request. Default value is 10. The
     * maximum allowed values is 50; any per_page value over 50 will be changed to 50. Use in query
     * `per_page=20`.
     * @param perPage Value for Integer
     */
    @JsonSetter("per_page")
    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    /**
     * Getter for Direction.
     * Controls the order in which results are returned. Use in query `direction=asc`.
     * @return Returns the ReadMrrMovementsInputDirection
     */
    @JsonGetter("direction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ReadMrrMovementsInputDirection getDirection() {
        return direction;
    }

    /**
     * Setter for Direction.
     * Controls the order in which results are returned. Use in query `direction=asc`.
     * @param direction Value for ReadMrrMovementsInputDirection
     */
    @JsonSetter("direction")
    public void setDirection(ReadMrrMovementsInputDirection direction) {
        this.direction = direction;
    }

    /**
     * Converts this ReadMrrMovementsInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReadMrrMovementsInput [" + "subscriptionId=" + subscriptionId + ", page=" + page
                + ", perPage=" + perPage + ", direction=" + direction + "]";
    }

    /**
     * Builds a new {@link ReadMrrMovementsInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReadMrrMovementsInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .subscriptionId(getSubscriptionId())
                .page(getPage())
                .perPage(getPerPage())
                .direction(getDirection());
        return builder;
    }

    /**
     * Class to build instances of {@link ReadMrrMovementsInput}.
     */
    public static class Builder {
        private Integer subscriptionId;
        private Integer page = 1;
        private Integer perPage = 10;
        private ReadMrrMovementsInputDirection direction;



        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  Integer value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(Integer subscriptionId) {
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
         * Setter for direction.
         * @param  direction  ReadMrrMovementsInputDirection value for direction.
         * @return Builder
         */
        public Builder direction(ReadMrrMovementsInputDirection direction) {
            this.direction = direction;
            return this;
        }

        /**
         * Builds a new {@link ReadMrrMovementsInput} object using the set fields.
         * @return {@link ReadMrrMovementsInput}
         */
        public ReadMrrMovementsInput build() {
            return new ReadMrrMovementsInput(subscriptionId, page, perPage, direction);
        }
    }
}
