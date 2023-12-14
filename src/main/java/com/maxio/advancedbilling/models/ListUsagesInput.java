/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.containers.ListUsagesInputComponentId;
import java.time.LocalDate;

/**
 * This is a model class for ListUsagesInput type.
 */
public class ListUsagesInput {
    private int subscriptionId;
    private ListUsagesInputComponentId componentId;
    private Integer sinceId;
    private Integer maxId;
    private LocalDate sinceDate;
    private LocalDate untilDate;
    private Integer page;
    private Integer perPage;

    /**
     * Default constructor.
     */
    public ListUsagesInput() {
        page = 1;
        perPage = 20;
    }

    /**
     * Initialization constructor.
     * @param  subscriptionId  int value for subscriptionId.
     * @param  componentId  ListUsagesInputComponentId value for componentId.
     * @param  sinceId  Integer value for sinceId.
     * @param  maxId  Integer value for maxId.
     * @param  sinceDate  LocalDate value for sinceDate.
     * @param  untilDate  LocalDate value for untilDate.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     */
    public ListUsagesInput(
            int subscriptionId,
            ListUsagesInputComponentId componentId,
            Integer sinceId,
            Integer maxId,
            LocalDate sinceDate,
            LocalDate untilDate,
            Integer page,
            Integer perPage) {
        this.subscriptionId = subscriptionId;
        this.componentId = componentId;
        this.sinceId = sinceId;
        this.maxId = maxId;
        this.sinceDate = sinceDate;
        this.untilDate = untilDate;
        this.page = page;
        this.perPage = perPage;
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
     * Getter for ComponentId.
     * Either the Chargify id for the component or the component's handle prefixed by `handle:`
     * @return Returns the ListUsagesInputComponentId
     */
    @JsonGetter("component_id")
    public ListUsagesInputComponentId getComponentId() {
        return componentId;
    }

    /**
     * Setter for ComponentId.
     * Either the Chargify id for the component or the component's handle prefixed by `handle:`
     * @param componentId Value for ListUsagesInputComponentId
     */
    @JsonSetter("component_id")
    public void setComponentId(ListUsagesInputComponentId componentId) {
        this.componentId = componentId;
    }

    /**
     * Getter for SinceId.
     * Returns usages with an id greater than or equal to the one specified
     * @return Returns the Integer
     */
    @JsonGetter("since_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSinceId() {
        return sinceId;
    }

    /**
     * Setter for SinceId.
     * Returns usages with an id greater than or equal to the one specified
     * @param sinceId Value for Integer
     */
    @JsonSetter("since_id")
    public void setSinceId(Integer sinceId) {
        this.sinceId = sinceId;
    }

    /**
     * Getter for MaxId.
     * Returns usages with an id less than or equal to the one specified
     * @return Returns the Integer
     */
    @JsonGetter("max_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getMaxId() {
        return maxId;
    }

    /**
     * Setter for MaxId.
     * Returns usages with an id less than or equal to the one specified
     * @param maxId Value for Integer
     */
    @JsonSetter("max_id")
    public void setMaxId(Integer maxId) {
        this.maxId = maxId;
    }

    /**
     * Getter for SinceDate.
     * Returns usages with a created_at date greater than or equal to midnight (12:00 AM) on the
     * date specified.
     * @return Returns the LocalDate
     */
    @JsonGetter("since_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getSinceDate() {
        return sinceDate;
    }

    /**
     * Setter for SinceDate.
     * Returns usages with a created_at date greater than or equal to midnight (12:00 AM) on the
     * date specified.
     * @param sinceDate Value for LocalDate
     */
    @JsonSetter("since_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setSinceDate(LocalDate sinceDate) {
        this.sinceDate = sinceDate;
    }

    /**
     * Getter for UntilDate.
     * Returns usages with a created_at date less than or equal to midnight (12:00 AM) on the date
     * specified.
     * @return Returns the LocalDate
     */
    @JsonGetter("until_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getUntilDate() {
        return untilDate;
    }

    /**
     * Setter for UntilDate.
     * Returns usages with a created_at date less than or equal to midnight (12:00 AM) on the date
     * specified.
     * @param untilDate Value for LocalDate
     */
    @JsonSetter("until_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setUntilDate(LocalDate untilDate) {
        this.untilDate = untilDate;
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
     * Converts this ListUsagesInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListUsagesInput [" + "subscriptionId=" + subscriptionId + ", componentId="
                + componentId + ", sinceId=" + sinceId + ", maxId=" + maxId + ", sinceDate="
                + sinceDate + ", untilDate=" + untilDate + ", page=" + page + ", perPage=" + perPage
                + "]";
    }

    /**
     * Builds a new {@link ListUsagesInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListUsagesInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscriptionId, componentId)
                .sinceId(getSinceId())
                .maxId(getMaxId())
                .sinceDate(getSinceDate())
                .untilDate(getUntilDate())
                .page(getPage())
                .perPage(getPerPage());
        return builder;
    }

    /**
     * Class to build instances of {@link ListUsagesInput}.
     */
    public static class Builder {
        private int subscriptionId;
        private ListUsagesInputComponentId componentId;
        private Integer sinceId;
        private Integer maxId;
        private LocalDate sinceDate;
        private LocalDate untilDate;
        private Integer page = 1;
        private Integer perPage = 20;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  subscriptionId  int value for subscriptionId.
         * @param  componentId  ListUsagesInputComponentId value for componentId.
         */
        public Builder(int subscriptionId, ListUsagesInputComponentId componentId) {
            this.subscriptionId = subscriptionId;
            this.componentId = componentId;
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
         * Setter for componentId.
         * @param  componentId  ListUsagesInputComponentId value for componentId.
         * @return Builder
         */
        public Builder componentId(ListUsagesInputComponentId componentId) {
            this.componentId = componentId;
            return this;
        }

        /**
         * Setter for sinceId.
         * @param  sinceId  Integer value for sinceId.
         * @return Builder
         */
        public Builder sinceId(Integer sinceId) {
            this.sinceId = sinceId;
            return this;
        }

        /**
         * Setter for maxId.
         * @param  maxId  Integer value for maxId.
         * @return Builder
         */
        public Builder maxId(Integer maxId) {
            this.maxId = maxId;
            return this;
        }

        /**
         * Setter for sinceDate.
         * @param  sinceDate  LocalDate value for sinceDate.
         * @return Builder
         */
        public Builder sinceDate(LocalDate sinceDate) {
            this.sinceDate = sinceDate;
            return this;
        }

        /**
         * Setter for untilDate.
         * @param  untilDate  LocalDate value for untilDate.
         * @return Builder
         */
        public Builder untilDate(LocalDate untilDate) {
            this.untilDate = untilDate;
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
         * Builds a new {@link ListUsagesInput} object using the set fields.
         * @return {@link ListUsagesInput}
         */
        public ListUsagesInput build() {
            return new ListUsagesInput(subscriptionId, componentId, sinceId, maxId, sinceDate,
                    untilDate, page, perPage);
        }
    }
}
