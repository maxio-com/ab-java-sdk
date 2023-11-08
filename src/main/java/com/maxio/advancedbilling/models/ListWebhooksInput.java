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
 * This is a model class for ListWebhooksInput type.
 */
public class ListWebhooksInput {
    private WebhookStatus status;
    private String sinceDate;
    private String untilDate;
    private Integer page;
    private Integer perPage;
    private WebhookOrder order;
    private Integer subscription;

    /**
     * Default constructor.
     */
    public ListWebhooksInput() {
        page = 1;
        perPage = 20;
    }

    /**
     * Initialization constructor.
     * @param  status  WebhookStatus value for status.
     * @param  sinceDate  String value for sinceDate.
     * @param  untilDate  String value for untilDate.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  order  WebhookOrder value for order.
     * @param  subscription  Integer value for subscription.
     */
    public ListWebhooksInput(
            WebhookStatus status,
            String sinceDate,
            String untilDate,
            Integer page,
            Integer perPage,
            WebhookOrder order,
            Integer subscription) {
        this.status = status;
        this.sinceDate = sinceDate;
        this.untilDate = untilDate;
        this.page = page;
        this.perPage = perPage;
        this.order = order;
        this.subscription = subscription;
    }

    /**
     * Getter for Status.
     * Webhooks with matching status would be returned.
     * @return Returns the WebhookStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public WebhookStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Webhooks with matching status would be returned.
     * @param status Value for WebhookStatus
     */
    @JsonSetter("status")
    public void setStatus(WebhookStatus status) {
        this.status = status;
    }

    /**
     * Getter for SinceDate.
     * Format YYYY-MM-DD. Returns Webhooks with the created_at date greater than or equal to the one
     * specified.
     * @return Returns the String
     */
    @JsonGetter("since_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSinceDate() {
        return sinceDate;
    }

    /**
     * Setter for SinceDate.
     * Format YYYY-MM-DD. Returns Webhooks with the created_at date greater than or equal to the one
     * specified.
     * @param sinceDate Value for String
     */
    @JsonSetter("since_date")
    public void setSinceDate(String sinceDate) {
        this.sinceDate = sinceDate;
    }

    /**
     * Getter for UntilDate.
     * Format YYYY-MM-DD. Returns Webhooks with the created_at date less than or equal to the one
     * specified.
     * @return Returns the String
     */
    @JsonGetter("until_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUntilDate() {
        return untilDate;
    }

    /**
     * Setter for UntilDate.
     * Format YYYY-MM-DD. Returns Webhooks with the created_at date less than or equal to the one
     * specified.
     * @param untilDate Value for String
     */
    @JsonSetter("until_date")
    public void setUntilDate(String untilDate) {
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
     * Getter for Order.
     * The order in which the Webhooks are returned.
     * @return Returns the WebhookOrder
     */
    @JsonGetter("order")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public WebhookOrder getOrder() {
        return order;
    }

    /**
     * Setter for Order.
     * The order in which the Webhooks are returned.
     * @param order Value for WebhookOrder
     */
    @JsonSetter("order")
    public void setOrder(WebhookOrder order) {
        this.order = order;
    }

    /**
     * Getter for Subscription.
     * The Chargify id of a subscription you'd like to filter for
     * @return Returns the Integer
     */
    @JsonGetter("subscription")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscription() {
        return subscription;
    }

    /**
     * Setter for Subscription.
     * The Chargify id of a subscription you'd like to filter for
     * @param subscription Value for Integer
     */
    @JsonSetter("subscription")
    public void setSubscription(Integer subscription) {
        this.subscription = subscription;
    }

    /**
     * Converts this ListWebhooksInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListWebhooksInput [" + "status=" + status + ", sinceDate=" + sinceDate
                + ", untilDate=" + untilDate + ", page=" + page + ", perPage=" + perPage
                + ", order=" + order + ", subscription=" + subscription + "]";
    }

    /**
     * Builds a new {@link ListWebhooksInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListWebhooksInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .status(getStatus())
                .sinceDate(getSinceDate())
                .untilDate(getUntilDate())
                .page(getPage())
                .perPage(getPerPage())
                .order(getOrder())
                .subscription(getSubscription());
        return builder;
    }

    /**
     * Class to build instances of {@link ListWebhooksInput}.
     */
    public static class Builder {
        private WebhookStatus status;
        private String sinceDate;
        private String untilDate;
        private Integer page = 1;
        private Integer perPage = 20;
        private WebhookOrder order;
        private Integer subscription;



        /**
         * Setter for status.
         * @param  status  WebhookStatus value for status.
         * @return Builder
         */
        public Builder status(WebhookStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for sinceDate.
         * @param  sinceDate  String value for sinceDate.
         * @return Builder
         */
        public Builder sinceDate(String sinceDate) {
            this.sinceDate = sinceDate;
            return this;
        }

        /**
         * Setter for untilDate.
         * @param  untilDate  String value for untilDate.
         * @return Builder
         */
        public Builder untilDate(String untilDate) {
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
         * Setter for order.
         * @param  order  WebhookOrder value for order.
         * @return Builder
         */
        public Builder order(WebhookOrder order) {
            this.order = order;
            return this;
        }

        /**
         * Setter for subscription.
         * @param  subscription  Integer value for subscription.
         * @return Builder
         */
        public Builder subscription(Integer subscription) {
            this.subscription = subscription;
            return this;
        }

        /**
         * Builds a new {@link ListWebhooksInput} object using the set fields.
         * @return {@link ListWebhooksInput}
         */
        public ListWebhooksInput build() {
            return new ListWebhooksInput(status, sinceDate, untilDate, page, perPage, order,
                    subscription);
        }
    }
}
