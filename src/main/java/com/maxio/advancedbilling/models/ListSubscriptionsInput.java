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
import com.maxio.advancedbilling.models.containers.ListSubscriptionsInputDirection;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * This is a model class for ListSubscriptionsInput type.
 */
public class ListSubscriptionsInput {
    private Integer page;
    private Integer perPage;
    private SubscriptionState state;
    private Integer product;
    private Integer productPricePointId;
    private Integer coupon;
    private SubscriptionDateField dateField;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDateTime startDatetime;
    private LocalDateTime endDatetime;
    private Map<String, String> metadata;
    private ListSubscriptionsInputDirection direction;
    private SubscriptionSort sort;

    /**
     * Default constructor.
     */
    public ListSubscriptionsInput() {
        page = 1;
        perPage = 20;
        sort = SubscriptionSort.SIGNUP_DATE;
    }

    /**
     * Initialization constructor.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  state  SubscriptionState value for state.
     * @param  product  Integer value for product.
     * @param  productPricePointId  Integer value for productPricePointId.
     * @param  coupon  Integer value for coupon.
     * @param  dateField  SubscriptionDateField value for dateField.
     * @param  startDate  LocalDate value for startDate.
     * @param  endDate  LocalDate value for endDate.
     * @param  startDatetime  LocalDateTime value for startDatetime.
     * @param  endDatetime  LocalDateTime value for endDatetime.
     * @param  metadata  Map of String, value for metadata.
     * @param  direction  ListSubscriptionsInputDirection value for direction.
     * @param  sort  SubscriptionSort value for sort.
     */
    public ListSubscriptionsInput(
            Integer page,
            Integer perPage,
            SubscriptionState state,
            Integer product,
            Integer productPricePointId,
            Integer coupon,
            SubscriptionDateField dateField,
            LocalDate startDate,
            LocalDate endDate,
            LocalDateTime startDatetime,
            LocalDateTime endDatetime,
            Map<String, String> metadata,
            ListSubscriptionsInputDirection direction,
            SubscriptionSort sort) {
        this.page = page;
        this.perPage = perPage;
        this.state = state;
        this.product = product;
        this.productPricePointId = productPricePointId;
        this.coupon = coupon;
        this.dateField = dateField;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startDatetime = startDatetime;
        this.endDatetime = endDatetime;
        this.metadata = metadata;
        this.direction = direction;
        this.sort = sort;
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
     * Getter for State.
     * The current state of the subscription
     * @return Returns the SubscriptionState
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionState getState() {
        return state;
    }

    /**
     * Setter for State.
     * The current state of the subscription
     * @param state Value for SubscriptionState
     */
    @JsonSetter("state")
    public void setState(SubscriptionState state) {
        this.state = state;
    }

    /**
     * Getter for Product.
     * The product id of the subscription. (Note that the product handle cannot be used.)
     * @return Returns the Integer
     */
    @JsonGetter("product")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProduct() {
        return product;
    }

    /**
     * Setter for Product.
     * The product id of the subscription. (Note that the product handle cannot be used.)
     * @param product Value for Integer
     */
    @JsonSetter("product")
    public void setProduct(Integer product) {
        this.product = product;
    }

    /**
     * Getter for ProductPricePointId.
     * The ID of the product price point. If supplied, product is required
     * @return Returns the Integer
     */
    @JsonGetter("product_price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductPricePointId() {
        return productPricePointId;
    }

    /**
     * Setter for ProductPricePointId.
     * The ID of the product price point. If supplied, product is required
     * @param productPricePointId Value for Integer
     */
    @JsonSetter("product_price_point_id")
    public void setProductPricePointId(Integer productPricePointId) {
        this.productPricePointId = productPricePointId;
    }

    /**
     * Getter for Coupon.
     * The numeric id of the coupon currently applied to the subscription. (This can be found in the
     * URL when editing a coupon. Note that the coupon code cannot be used.)
     * @return Returns the Integer
     */
    @JsonGetter("coupon")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCoupon() {
        return coupon;
    }

    /**
     * Setter for Coupon.
     * The numeric id of the coupon currently applied to the subscription. (This can be found in the
     * URL when editing a coupon. Note that the coupon code cannot be used.)
     * @param coupon Value for Integer
     */
    @JsonSetter("coupon")
    public void setCoupon(Integer coupon) {
        this.coupon = coupon;
    }

    /**
     * Getter for DateField.
     * The type of filter you'd like to apply to your search. Allowed Values: ,
     * current_period_ends_at, current_period_starts_at, created_at, activated_at, canceled_at,
     * expires_at, trial_started_at, trial_ended_at, updated_at
     * @return Returns the SubscriptionDateField
     */
    @JsonGetter("date_field")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionDateField getDateField() {
        return dateField;
    }

    /**
     * Setter for DateField.
     * The type of filter you'd like to apply to your search. Allowed Values: ,
     * current_period_ends_at, current_period_starts_at, created_at, activated_at, canceled_at,
     * expires_at, trial_started_at, trial_ended_at, updated_at
     * @param dateField Value for SubscriptionDateField
     */
    @JsonSetter("date_field")
    public void setDateField(SubscriptionDateField dateField) {
        this.dateField = dateField;
    }

    /**
     * Getter for StartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns subscriptions
     * with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified. Use in query `start_date=2022-07-01`.
     * @return Returns the LocalDate
     */
    @JsonGetter("start_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * Setter for StartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns subscriptions
     * with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified. Use in query `start_date=2022-07-01`.
     * @param startDate Value for LocalDate
     */
    @JsonSetter("start_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter for EndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns subscriptions
     * with a timestamp up to and including 11:59:59PM in your site’s time zone on the date
     * specified. Use in query `end_date=2022-08-01`.
     * @return Returns the LocalDate
     */
    @JsonGetter("end_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * Setter for EndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns subscriptions
     * with a timestamp up to and including 11:59:59PM in your site’s time zone on the date
     * specified. Use in query `end_date=2022-08-01`.
     * @param endDate Value for LocalDate
     */
    @JsonSetter("end_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /**
     * Getter for StartDatetime.
     * The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns subscriptions with a timestamp at or after exact time provided in query. You can
     * specify timezone in query - otherwise your site's time zone will be used. If provided, this
     * parameter will be used instead of start_date. Use in query `start_datetime=2022-07-01
     * 09:00:05`.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("start_datetime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getStartDatetime() {
        return startDatetime;
    }

    /**
     * Setter for StartDatetime.
     * The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns subscriptions with a timestamp at or after exact time provided in query. You can
     * specify timezone in query - otherwise your site's time zone will be used. If provided, this
     * parameter will be used instead of start_date. Use in query `start_datetime=2022-07-01
     * 09:00:05`.
     * @param startDatetime Value for LocalDateTime
     */
    @JsonSetter("start_datetime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setStartDatetime(LocalDateTime startDatetime) {
        this.startDatetime = startDatetime;
    }

    /**
     * Getter for EndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns subscriptions with a timestamp at or before exact time provided in query. You can
     * specify timezone in query - otherwise your site's time zone will be used. If provided, this
     * parameter will be used instead of end_date. Use in query `end_datetime=2022-08-01 10:00:05`.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("end_datetime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getEndDatetime() {
        return endDatetime;
    }

    /**
     * Setter for EndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns subscriptions with a timestamp at or before exact time provided in query. You can
     * specify timezone in query - otherwise your site's time zone will be used. If provided, this
     * parameter will be used instead of end_date. Use in query `end_datetime=2022-08-01 10:00:05`.
     * @param endDatetime Value for LocalDateTime
     */
    @JsonSetter("end_datetime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setEndDatetime(LocalDateTime endDatetime) {
        this.endDatetime = endDatetime;
    }

    /**
     * Getter for Metadata.
     * The value of the metadata field specified in the parameter. Use in query
     * `metadata[my-field]=value&amp;metadata[other-field]=another_value`.
     * @return Returns the Map of String, String
     */
    @JsonGetter("metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * The value of the metadata field specified in the parameter. Use in query
     * `metadata[my-field]=value&amp;metadata[other-field]=another_value`.
     * @param metadata Value for Map of String, String
     */
    @JsonSetter("metadata")
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * Getter for Direction.
     * Controls the order in which results are returned. Use in query `direction=asc`.
     * @return Returns the ListSubscriptionsInputDirection
     */
    @JsonGetter("direction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListSubscriptionsInputDirection getDirection() {
        return direction;
    }

    /**
     * Setter for Direction.
     * Controls the order in which results are returned. Use in query `direction=asc`.
     * @param direction Value for ListSubscriptionsInputDirection
     */
    @JsonSetter("direction")
    public void setDirection(ListSubscriptionsInputDirection direction) {
        this.direction = direction;
    }

    /**
     * Getter for Sort.
     * The attribute by which to sort
     * @return Returns the SubscriptionSort
     */
    @JsonGetter("sort")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionSort getSort() {
        return sort;
    }

    /**
     * Setter for Sort.
     * The attribute by which to sort
     * @param sort Value for SubscriptionSort
     */
    @JsonSetter("sort")
    public void setSort(SubscriptionSort sort) {
        this.sort = sort;
    }

    /**
     * Converts this ListSubscriptionsInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListSubscriptionsInput [" + "page=" + page + ", perPage=" + perPage + ", state="
                + state + ", product=" + product + ", productPricePointId=" + productPricePointId
                + ", coupon=" + coupon + ", dateField=" + dateField + ", startDate=" + startDate
                + ", endDate=" + endDate + ", startDatetime=" + startDatetime + ", endDatetime="
                + endDatetime + ", metadata=" + metadata + ", direction=" + direction + ", sort="
                + sort + "]";
    }

    /**
     * Builds a new {@link ListSubscriptionsInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListSubscriptionsInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .page(getPage())
                .perPage(getPerPage())
                .state(getState())
                .product(getProduct())
                .productPricePointId(getProductPricePointId())
                .coupon(getCoupon())
                .dateField(getDateField())
                .startDate(getStartDate())
                .endDate(getEndDate())
                .startDatetime(getStartDatetime())
                .endDatetime(getEndDatetime())
                .metadata(getMetadata())
                .direction(getDirection())
                .sort(getSort());
        return builder;
    }

    /**
     * Class to build instances of {@link ListSubscriptionsInput}.
     */
    public static class Builder {
        private Integer page = 1;
        private Integer perPage = 20;
        private SubscriptionState state;
        private Integer product;
        private Integer productPricePointId;
        private Integer coupon;
        private SubscriptionDateField dateField;
        private LocalDate startDate;
        private LocalDate endDate;
        private LocalDateTime startDatetime;
        private LocalDateTime endDatetime;
        private Map<String, String> metadata;
        private ListSubscriptionsInputDirection direction;
        private SubscriptionSort sort = SubscriptionSort.SIGNUP_DATE;



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
         * Setter for state.
         * @param  state  SubscriptionState value for state.
         * @return Builder
         */
        public Builder state(SubscriptionState state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for product.
         * @param  product  Integer value for product.
         * @return Builder
         */
        public Builder product(Integer product) {
            this.product = product;
            return this;
        }

        /**
         * Setter for productPricePointId.
         * @param  productPricePointId  Integer value for productPricePointId.
         * @return Builder
         */
        public Builder productPricePointId(Integer productPricePointId) {
            this.productPricePointId = productPricePointId;
            return this;
        }

        /**
         * Setter for coupon.
         * @param  coupon  Integer value for coupon.
         * @return Builder
         */
        public Builder coupon(Integer coupon) {
            this.coupon = coupon;
            return this;
        }

        /**
         * Setter for dateField.
         * @param  dateField  SubscriptionDateField value for dateField.
         * @return Builder
         */
        public Builder dateField(SubscriptionDateField dateField) {
            this.dateField = dateField;
            return this;
        }

        /**
         * Setter for startDate.
         * @param  startDate  LocalDate value for startDate.
         * @return Builder
         */
        public Builder startDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * Setter for endDate.
         * @param  endDate  LocalDate value for endDate.
         * @return Builder
         */
        public Builder endDate(LocalDate endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * Setter for startDatetime.
         * @param  startDatetime  LocalDateTime value for startDatetime.
         * @return Builder
         */
        public Builder startDatetime(LocalDateTime startDatetime) {
            this.startDatetime = startDatetime;
            return this;
        }

        /**
         * Setter for endDatetime.
         * @param  endDatetime  LocalDateTime value for endDatetime.
         * @return Builder
         */
        public Builder endDatetime(LocalDateTime endDatetime) {
            this.endDatetime = endDatetime;
            return this;
        }

        /**
         * Setter for metadata.
         * @param  metadata  Map of String, value for metadata.
         * @return Builder
         */
        public Builder metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Setter for direction.
         * @param  direction  ListSubscriptionsInputDirection value for direction.
         * @return Builder
         */
        public Builder direction(ListSubscriptionsInputDirection direction) {
            this.direction = direction;
            return this;
        }

        /**
         * Setter for sort.
         * @param  sort  SubscriptionSort value for sort.
         * @return Builder
         */
        public Builder sort(SubscriptionSort sort) {
            this.sort = sort;
            return this;
        }

        /**
         * Builds a new {@link ListSubscriptionsInput} object using the set fields.
         * @return {@link ListSubscriptionsInput}
         */
        public ListSubscriptionsInput build() {
            return new ListSubscriptionsInput(page, perPage, state, product, productPricePointId,
                    coupon, dateField, startDate, endDate, startDatetime, endDatetime, metadata,
                    direction, sort);
        }
    }
}
