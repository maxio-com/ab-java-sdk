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
import com.maxio.advancedbilling.models.containers.ListSubscriptionsInputProduct;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

/**
 * This is a model class for ListSubscriptionsInput type.
 */
public class ListSubscriptionsInput {
    private Integer page;
    private Integer perPage;
    private SubscriptionSort sort;
    private SortingDirection direction;
    private SubscriptionStateFilter state;
    private ListSubscriptionsInputProduct product;
    private String q;
    private QScope qScope;
    private Integer customerId;
    private Integer productPricePointId;
    private Integer coupon;
    private String couponCode;
    private CollectionMethod1 collectionMethod;
    private Integer brandingThemeId;
    private SubscriptionDateField dateField;
    private LocalDate startDate;
    private LocalDate endDate;
    private ZonedDateTime startDatetime;
    private ZonedDateTime endDatetime;
    private Map<String, String> metadata;
    private GroupStatus groupStatus;
    private Boolean dunningExemption;
    private String paymentGateways;
    private String currencies;
    private List<SubscriptionListInclude> include;

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
     * @param  sort  SubscriptionSort value for sort.
     * @param  direction  SortingDirection value for direction.
     * @param  state  SubscriptionStateFilter value for state.
     * @param  product  ListSubscriptionsInputProduct value for product.
     * @param  q  String value for q.
     * @param  qScope  QScope value for qScope.
     * @param  customerId  Integer value for customerId.
     * @param  productPricePointId  Integer value for productPricePointId.
     * @param  coupon  Integer value for coupon.
     * @param  couponCode  String value for couponCode.
     * @param  collectionMethod  CollectionMethod1 value for collectionMethod.
     * @param  brandingThemeId  Integer value for brandingThemeId.
     * @param  dateField  SubscriptionDateField value for dateField.
     * @param  startDate  LocalDate value for startDate.
     * @param  endDate  LocalDate value for endDate.
     * @param  startDatetime  ZonedDateTime value for startDatetime.
     * @param  endDatetime  ZonedDateTime value for endDatetime.
     * @param  metadata  Map of String, value for metadata.
     * @param  groupStatus  GroupStatus value for groupStatus.
     * @param  dunningExemption  Boolean value for dunningExemption.
     * @param  paymentGateways  String value for paymentGateways.
     * @param  currencies  String value for currencies.
     * @param  include  List of SubscriptionListInclude value for include.
     */
    public ListSubscriptionsInput(
            Integer page,
            Integer perPage,
            SubscriptionSort sort,
            SortingDirection direction,
            SubscriptionStateFilter state,
            ListSubscriptionsInputProduct product,
            String q,
            QScope qScope,
            Integer customerId,
            Integer productPricePointId,
            Integer coupon,
            String couponCode,
            CollectionMethod1 collectionMethod,
            Integer brandingThemeId,
            SubscriptionDateField dateField,
            LocalDate startDate,
            LocalDate endDate,
            ZonedDateTime startDatetime,
            ZonedDateTime endDatetime,
            Map<String, String> metadata,
            GroupStatus groupStatus,
            Boolean dunningExemption,
            String paymentGateways,
            String currencies,
            List<SubscriptionListInclude> include) {
        this.page = page;
        this.perPage = perPage;
        this.sort = sort;
        this.direction = direction;
        this.state = state;
        this.product = product;
        this.q = q;
        this.qScope = qScope;
        this.customerId = customerId;
        this.productPricePointId = productPricePointId;
        this.coupon = coupon;
        this.couponCode = couponCode;
        this.collectionMethod = collectionMethod;
        this.brandingThemeId = brandingThemeId;
        this.dateField = dateField;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startDatetime = startDatetime;
        this.endDatetime = endDatetime;
        this.metadata = metadata;
        this.groupStatus = groupStatus;
        this.dunningExemption = dunningExemption;
        this.paymentGateways = paymentGateways;
        this.currencies = currencies;
        this.include = include;
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
     * Getter for Direction.
     * Controls the order in which results are returned. Use in query `direction=asc`.
     * @return Returns the SortingDirection
     */
    @JsonGetter("direction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SortingDirection getDirection() {
        return direction;
    }

    /**
     * Setter for Direction.
     * Controls the order in which results are returned. Use in query `direction=asc`.
     * @param direction Value for SortingDirection
     */
    @JsonSetter("direction")
    public void setDirection(SortingDirection direction) {
        this.direction = direction;
    }

    /**
     * Getter for State.
     * The current state of the subscription
     * @return Returns the SubscriptionStateFilter
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionStateFilter getState() {
        return state;
    }

    /**
     * Setter for State.
     * The current state of the subscription
     * @param state Value for SubscriptionStateFilter
     */
    @JsonSetter("state")
    public void setState(SubscriptionStateFilter state) {
        this.state = state;
    }

    /**
     * Getter for Product.
     * Filter subscriptions by product. Accepts product ID or exact product name. Product handle is
     * not supported.
     * @return Returns the ListSubscriptionsInputProduct
     */
    @JsonGetter("product")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListSubscriptionsInputProduct getProduct() {
        return product;
    }

    /**
     * Setter for Product.
     * Filter subscriptions by product. Accepts product ID or exact product name. Product handle is
     * not supported.
     * @param product Value for ListSubscriptionsInputProduct
     */
    @JsonSetter("product")
    public void setProduct(ListSubscriptionsInputProduct product) {
        this.product = product;
    }

    /**
     * Getter for Q.
     * Search string.
     * @return Returns the String
     */
    @JsonGetter("q")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getQ() {
        return q;
    }

    /**
     * Setter for Q.
     * Search string.
     * @param q Value for String
     */
    @JsonSetter("q")
    public void setQ(String q) {
        this.q = q;
    }

    /**
     * Getter for QScope.
     * Scope of fields used by the q search.
     * @return Returns the QScope
     */
    @JsonGetter("q_scope")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public QScope getQScope() {
        return qScope;
    }

    /**
     * Setter for QScope.
     * Scope of fields used by the q search.
     * @param qScope Value for QScope
     */
    @JsonSetter("q_scope")
    public void setQScope(QScope qScope) {
        this.qScope = qScope;
    }

    /**
     * Getter for CustomerId.
     * The Advanced Billing id of the customer.
     * @return Returns the Integer
     */
    @JsonGetter("customer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * Setter for CustomerId.
     * The Advanced Billing id of the customer.
     * @param customerId Value for Integer
     */
    @JsonSetter("customer_id")
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for ProductPricePointId.
     * The ID of the product price point. If supplied, product is required.
     * @return Returns the Integer
     */
    @JsonGetter("product_price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductPricePointId() {
        return productPricePointId;
    }

    /**
     * Setter for ProductPricePointId.
     * The ID of the product price point. If supplied, product is required.
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
     * Getter for CouponCode.
     * The coupon code currently applied to the subscription
     * @return Returns the String
     */
    @JsonGetter("coupon_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * Setter for CouponCode.
     * The coupon code currently applied to the subscription
     * @param couponCode Value for String
     */
    @JsonSetter("coupon_code")
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    /**
     * Getter for CollectionMethod.
     * The collection method for the subscription.
     * @return Returns the CollectionMethod1
     */
    @JsonGetter("collection_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CollectionMethod1 getCollectionMethod() {
        return collectionMethod;
    }

    /**
     * Setter for CollectionMethod.
     * The collection method for the subscription.
     * @param collectionMethod Value for CollectionMethod1
     */
    @JsonSetter("collection_method")
    public void setCollectionMethod(CollectionMethod1 collectionMethod) {
        this.collectionMethod = collectionMethod;
    }

    /**
     * Getter for BrandingThemeId.
     * Filter subscriptions by the ID of an assigned Branding Theme. Branding Themes is a beta
     * feature. See [Understand Branding
     * Themes](https://docs.maxio.com/hc/en-us/articles/43796895662093-Understand-Branding-Themes#understand-branding-themes-0-0)
     * for more information.
     * @return Returns the Integer
     */
    @JsonGetter("branding_theme_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getBrandingThemeId() {
        return brandingThemeId;
    }

    /**
     * Setter for BrandingThemeId.
     * Filter subscriptions by the ID of an assigned Branding Theme. Branding Themes is a beta
     * feature. See [Understand Branding
     * Themes](https://docs.maxio.com/hc/en-us/articles/43796895662093-Understand-Branding-Themes#understand-branding-themes-0-0)
     * for more information.
     * @param brandingThemeId Value for Integer
     */
    @JsonSetter("branding_theme_id")
    public void setBrandingThemeId(Integer brandingThemeId) {
        this.brandingThemeId = brandingThemeId;
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
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("start_datetime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getStartDatetime() {
        return startDatetime;
    }

    /**
     * Setter for StartDatetime.
     * The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns subscriptions with a timestamp at or after exact time provided in query. You can
     * specify timezone in query - otherwise your site's time zone will be used. If provided, this
     * parameter will be used instead of start_date. Use in query `start_datetime=2022-07-01
     * 09:00:05`.
     * @param startDatetime Value for ZonedDateTime
     */
    @JsonSetter("start_datetime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setStartDatetime(ZonedDateTime startDatetime) {
        this.startDatetime = startDatetime;
    }

    /**
     * Getter for EndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns subscriptions with a timestamp at or before exact time provided in query. You can
     * specify timezone in query - otherwise your site's time zone will be used. If provided, this
     * parameter will be used instead of end_date. Use in query `end_datetime=2022-08-01 10:00:05`.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("end_datetime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getEndDatetime() {
        return endDatetime;
    }

    /**
     * Setter for EndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns subscriptions with a timestamp at or before exact time provided in query. You can
     * specify timezone in query - otherwise your site's time zone will be used. If provided, this
     * parameter will be used instead of end_date. Use in query `end_datetime=2022-08-01 10:00:05`.
     * @param endDatetime Value for ZonedDateTime
     */
    @JsonSetter("end_datetime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setEndDatetime(ZonedDateTime endDatetime) {
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
     * Getter for GroupStatus.
     * Filter by whether a subscription is in a group.
     * @return Returns the GroupStatus
     */
    @JsonGetter("group_status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GroupStatus getGroupStatus() {
        return groupStatus;
    }

    /**
     * Setter for GroupStatus.
     * Filter by whether a subscription is in a group.
     * @param groupStatus Value for GroupStatus
     */
    @JsonSetter("group_status")
    public void setGroupStatus(GroupStatus groupStatus) {
        this.groupStatus = groupStatus;
    }

    /**
     * Getter for DunningExemption.
     * Filter by dunning exemption status.
     * @return Returns the Boolean
     */
    @JsonGetter("dunning_exemption")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDunningExemption() {
        return dunningExemption;
    }

    /**
     * Setter for DunningExemption.
     * Filter by dunning exemption status.
     * @param dunningExemption Value for Boolean
     */
    @JsonSetter("dunning_exemption")
    public void setDunningExemption(Boolean dunningExemption) {
        this.dunningExemption = dunningExemption;
    }

    /**
     * Getter for PaymentGateways.
     * Comma-separated payment gateway identifiers.
     * @return Returns the String
     */
    @JsonGetter("payment_gateways")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaymentGateways() {
        return paymentGateways;
    }

    /**
     * Setter for PaymentGateways.
     * Comma-separated payment gateway identifiers.
     * @param paymentGateways Value for String
     */
    @JsonSetter("payment_gateways")
    public void setPaymentGateways(String paymentGateways) {
        this.paymentGateways = paymentGateways;
    }

    /**
     * Getter for Currencies.
     * Comma-separated currency codes.
     * @return Returns the String
     */
    @JsonGetter("currencies")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrencies() {
        return currencies;
    }

    /**
     * Setter for Currencies.
     * Comma-separated currency codes.
     * @param currencies Value for String
     */
    @JsonSetter("currencies")
    public void setCurrencies(String currencies) {
        this.currencies = currencies;
    }

    /**
     * Getter for Include.
     * Allows including additional data in the response. Use in query:
     * `include[]=self_service_page_token`.
     * @return Returns the List of SubscriptionListInclude
     */
    @JsonGetter("include")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<SubscriptionListInclude> getInclude() {
        return include;
    }

    /**
     * Setter for Include.
     * Allows including additional data in the response. Use in query:
     * `include[]=self_service_page_token`.
     * @param include Value for List of SubscriptionListInclude
     */
    @JsonSetter("include")
    public void setInclude(List<SubscriptionListInclude> include) {
        this.include = include;
    }

    /**
     * Converts this ListSubscriptionsInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListSubscriptionsInput [" + "page=" + page + ", perPage=" + perPage + ", sort="
                + sort + ", direction=" + direction + ", state=" + state + ", product=" + product
                + ", q=" + q + ", qScope=" + qScope + ", customerId=" + customerId
                + ", productPricePointId=" + productPricePointId + ", coupon=" + coupon
                + ", couponCode=" + couponCode + ", collectionMethod=" + collectionMethod
                + ", brandingThemeId=" + brandingThemeId + ", dateField=" + dateField
                + ", startDate=" + startDate + ", endDate=" + endDate + ", startDatetime="
                + startDatetime + ", endDatetime=" + endDatetime + ", metadata=" + metadata
                + ", groupStatus=" + groupStatus + ", dunningExemption=" + dunningExemption
                + ", paymentGateways=" + paymentGateways + ", currencies=" + currencies
                + ", include=" + include + "]";
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
                .sort(getSort())
                .direction(getDirection())
                .state(getState())
                .product(getProduct())
                .q(getQ())
                .qScope(getQScope())
                .customerId(getCustomerId())
                .productPricePointId(getProductPricePointId())
                .coupon(getCoupon())
                .couponCode(getCouponCode())
                .collectionMethod(getCollectionMethod())
                .brandingThemeId(getBrandingThemeId())
                .dateField(getDateField())
                .startDate(getStartDate())
                .endDate(getEndDate())
                .startDatetime(getStartDatetime())
                .endDatetime(getEndDatetime())
                .metadata(getMetadata())
                .groupStatus(getGroupStatus())
                .dunningExemption(getDunningExemption())
                .paymentGateways(getPaymentGateways())
                .currencies(getCurrencies())
                .include(getInclude());
        return builder;
    }

    /**
     * Class to build instances of {@link ListSubscriptionsInput}.
     */
    public static class Builder {
        private Integer page = 1;
        private Integer perPage = 20;
        private SubscriptionSort sort = SubscriptionSort.SIGNUP_DATE;
        private SortingDirection direction;
        private SubscriptionStateFilter state;
        private ListSubscriptionsInputProduct product;
        private String q;
        private QScope qScope;
        private Integer customerId;
        private Integer productPricePointId;
        private Integer coupon;
        private String couponCode;
        private CollectionMethod1 collectionMethod;
        private Integer brandingThemeId;
        private SubscriptionDateField dateField;
        private LocalDate startDate;
        private LocalDate endDate;
        private ZonedDateTime startDatetime;
        private ZonedDateTime endDatetime;
        private Map<String, String> metadata;
        private GroupStatus groupStatus;
        private Boolean dunningExemption;
        private String paymentGateways;
        private String currencies;
        private List<SubscriptionListInclude> include;



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
         * Setter for sort.
         * @param  sort  SubscriptionSort value for sort.
         * @return Builder
         */
        public Builder sort(SubscriptionSort sort) {
            this.sort = sort;
            return this;
        }

        /**
         * Setter for direction.
         * @param  direction  SortingDirection value for direction.
         * @return Builder
         */
        public Builder direction(SortingDirection direction) {
            this.direction = direction;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  SubscriptionStateFilter value for state.
         * @return Builder
         */
        public Builder state(SubscriptionStateFilter state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for product.
         * @param  product  ListSubscriptionsInputProduct value for product.
         * @return Builder
         */
        public Builder product(ListSubscriptionsInputProduct product) {
            this.product = product;
            return this;
        }

        /**
         * Setter for q.
         * @param  q  String value for q.
         * @return Builder
         */
        public Builder q(String q) {
            this.q = q;
            return this;
        }

        /**
         * Setter for qScope.
         * @param  qScope  QScope value for qScope.
         * @return Builder
         */
        public Builder qScope(QScope qScope) {
            this.qScope = qScope;
            return this;
        }

        /**
         * Setter for customerId.
         * @param  customerId  Integer value for customerId.
         * @return Builder
         */
        public Builder customerId(Integer customerId) {
            this.customerId = customerId;
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
         * Setter for couponCode.
         * @param  couponCode  String value for couponCode.
         * @return Builder
         */
        public Builder couponCode(String couponCode) {
            this.couponCode = couponCode;
            return this;
        }

        /**
         * Setter for collectionMethod.
         * @param  collectionMethod  CollectionMethod1 value for collectionMethod.
         * @return Builder
         */
        public Builder collectionMethod(CollectionMethod1 collectionMethod) {
            this.collectionMethod = collectionMethod;
            return this;
        }

        /**
         * Setter for brandingThemeId.
         * @param  brandingThemeId  Integer value for brandingThemeId.
         * @return Builder
         */
        public Builder brandingThemeId(Integer brandingThemeId) {
            this.brandingThemeId = brandingThemeId;
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
         * @param  startDatetime  ZonedDateTime value for startDatetime.
         * @return Builder
         */
        public Builder startDatetime(ZonedDateTime startDatetime) {
            this.startDatetime = startDatetime;
            return this;
        }

        /**
         * Setter for endDatetime.
         * @param  endDatetime  ZonedDateTime value for endDatetime.
         * @return Builder
         */
        public Builder endDatetime(ZonedDateTime endDatetime) {
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
         * Setter for groupStatus.
         * @param  groupStatus  GroupStatus value for groupStatus.
         * @return Builder
         */
        public Builder groupStatus(GroupStatus groupStatus) {
            this.groupStatus = groupStatus;
            return this;
        }

        /**
         * Setter for dunningExemption.
         * @param  dunningExemption  Boolean value for dunningExemption.
         * @return Builder
         */
        public Builder dunningExemption(Boolean dunningExemption) {
            this.dunningExemption = dunningExemption;
            return this;
        }

        /**
         * Setter for paymentGateways.
         * @param  paymentGateways  String value for paymentGateways.
         * @return Builder
         */
        public Builder paymentGateways(String paymentGateways) {
            this.paymentGateways = paymentGateways;
            return this;
        }

        /**
         * Setter for currencies.
         * @param  currencies  String value for currencies.
         * @return Builder
         */
        public Builder currencies(String currencies) {
            this.currencies = currencies;
            return this;
        }

        /**
         * Setter for include.
         * @param  include  List of SubscriptionListInclude value for include.
         * @return Builder
         */
        public Builder include(List<SubscriptionListInclude> include) {
            this.include = include;
            return this;
        }

        /**
         * Builds a new {@link ListSubscriptionsInput} object using the set fields.
         * @return {@link ListSubscriptionsInput}
         */
        public ListSubscriptionsInput build() {
            return new ListSubscriptionsInput(page, perPage, sort, direction, state, product, q,
                    qScope, customerId, productPricePointId, coupon, couponCode, collectionMethod,
                    brandingThemeId, dateField, startDate, endDate, startDatetime, endDatetime,
                    metadata, groupStatus, dunningExemption, paymentGateways, currencies, include);
        }
    }
}
