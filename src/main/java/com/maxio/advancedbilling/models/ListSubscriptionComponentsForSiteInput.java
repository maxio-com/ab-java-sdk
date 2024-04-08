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
 * This is a model class for ListSubscriptionComponentsForSiteInput type.
 */
public class ListSubscriptionComponentsForSiteInput {
    private Integer page;
    private Integer perPage;
    private ListSubscriptionComponentsSort sort;
    private SortingDirection direction;
    private ListSubscriptionComponentsForSiteFilter filter;
    private SubscriptionListDateField dateField;
    private String startDate;
    private String startDatetime;
    private String endDate;
    private String endDatetime;
    private List<Integer> subscriptionIds;
    private IncludeNotNull pricePointIds;
    private List<Integer> productFamilyIds;
    private ListSubscriptionComponentsInclude include;

    /**
     * Default constructor.
     */
    public ListSubscriptionComponentsForSiteInput() {
        page = 1;
        perPage = 20;
    }

    /**
     * Initialization constructor.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  sort  ListSubscriptionComponentsSort value for sort.
     * @param  direction  SortingDirection value for direction.
     * @param  filter  ListSubscriptionComponentsForSiteFilter value for filter.
     * @param  dateField  SubscriptionListDateField value for dateField.
     * @param  startDate  String value for startDate.
     * @param  startDatetime  String value for startDatetime.
     * @param  endDate  String value for endDate.
     * @param  endDatetime  String value for endDatetime.
     * @param  subscriptionIds  List of Integer value for subscriptionIds.
     * @param  pricePointIds  IncludeNotNull value for pricePointIds.
     * @param  productFamilyIds  List of Integer value for productFamilyIds.
     * @param  include  ListSubscriptionComponentsInclude value for include.
     */
    public ListSubscriptionComponentsForSiteInput(
            Integer page,
            Integer perPage,
            ListSubscriptionComponentsSort sort,
            SortingDirection direction,
            ListSubscriptionComponentsForSiteFilter filter,
            SubscriptionListDateField dateField,
            String startDate,
            String startDatetime,
            String endDate,
            String endDatetime,
            List<Integer> subscriptionIds,
            IncludeNotNull pricePointIds,
            List<Integer> productFamilyIds,
            ListSubscriptionComponentsInclude include) {
        this.page = page;
        this.perPage = perPage;
        this.sort = sort;
        this.direction = direction;
        this.filter = filter;
        this.dateField = dateField;
        this.startDate = startDate;
        this.startDatetime = startDatetime;
        this.endDate = endDate;
        this.endDatetime = endDatetime;
        this.subscriptionIds = subscriptionIds;
        this.pricePointIds = pricePointIds;
        this.productFamilyIds = productFamilyIds;
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
     * The attribute by which to sort. Use in query: `sort=updated_at`.
     * @return Returns the ListSubscriptionComponentsSort
     */
    @JsonGetter("sort")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListSubscriptionComponentsSort getSort() {
        return sort;
    }

    /**
     * Setter for Sort.
     * The attribute by which to sort. Use in query: `sort=updated_at`.
     * @param sort Value for ListSubscriptionComponentsSort
     */
    @JsonSetter("sort")
    public void setSort(ListSubscriptionComponentsSort sort) {
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
     * Getter for Filter.
     * Filter to use for List Subscription Components For Site operation
     * @return Returns the ListSubscriptionComponentsForSiteFilter
     */
    @JsonGetter("filter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListSubscriptionComponentsForSiteFilter getFilter() {
        return filter;
    }

    /**
     * Setter for Filter.
     * Filter to use for List Subscription Components For Site operation
     * @param filter Value for ListSubscriptionComponentsForSiteFilter
     */
    @JsonSetter("filter")
    public void setFilter(ListSubscriptionComponentsForSiteFilter filter) {
        this.filter = filter;
    }

    /**
     * Getter for DateField.
     * The type of filter you'd like to apply to your search. Use in query: `date_field=updated_at`.
     * @return Returns the SubscriptionListDateField
     */
    @JsonGetter("date_field")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionListDateField getDateField() {
        return dateField;
    }

    /**
     * Setter for DateField.
     * The type of filter you'd like to apply to your search. Use in query: `date_field=updated_at`.
     * @param dateField Value for SubscriptionListDateField
     */
    @JsonSetter("date_field")
    public void setDateField(SubscriptionListDateField dateField) {
        this.dateField = dateField;
    }

    /**
     * Getter for StartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns components
     * with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified. Use in query `start_date=2011-12-15`.
     * @return Returns the String
     */
    @JsonGetter("start_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStartDate() {
        return startDate;
    }

    /**
     * Setter for StartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns components
     * with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified. Use in query `start_date=2011-12-15`.
     * @param startDate Value for String
     */
    @JsonSetter("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter for StartDatetime.
     * The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns components with a timestamp at or after exact time provided in query. You can specify
     * timezone in query - otherwise your site''s time zone will be used. If provided, this
     * parameter will be used instead of start_date. Use in query `start_datetime=2022-07-01
     * 09:00:05`.
     * @return Returns the String
     */
    @JsonGetter("start_datetime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStartDatetime() {
        return startDatetime;
    }

    /**
     * Setter for StartDatetime.
     * The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns components with a timestamp at or after exact time provided in query. You can specify
     * timezone in query - otherwise your site''s time zone will be used. If provided, this
     * parameter will be used instead of start_date. Use in query `start_datetime=2022-07-01
     * 09:00:05`.
     * @param startDatetime Value for String
     */
    @JsonSetter("start_datetime")
    public void setStartDatetime(String startDatetime) {
        this.startDatetime = startDatetime;
    }

    /**
     * Getter for EndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns components with
     * a timestamp up to and including 11:59:59PM in your site’s time zone on the date specified.
     * Use in query `end_date=2011-12-16`.
     * @return Returns the String
     */
    @JsonGetter("end_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEndDate() {
        return endDate;
    }

    /**
     * Setter for EndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns components with
     * a timestamp up to and including 11:59:59PM in your site’s time zone on the date specified.
     * Use in query `end_date=2011-12-16`.
     * @param endDate Value for String
     */
    @JsonSetter("end_date")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * Getter for EndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns components with a timestamp at or before exact time provided in query. You can
     * specify timezone in query - otherwise your site''s time zone will be used. If provided, this
     * parameter will be used instead of end_date. Use in query `end_datetime=2022-07-01 09:00:05`.
     * @return Returns the String
     */
    @JsonGetter("end_datetime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEndDatetime() {
        return endDatetime;
    }

    /**
     * Setter for EndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns components with a timestamp at or before exact time provided in query. You can
     * specify timezone in query - otherwise your site''s time zone will be used. If provided, this
     * parameter will be used instead of end_date. Use in query `end_datetime=2022-07-01 09:00:05`.
     * @param endDatetime Value for String
     */
    @JsonSetter("end_datetime")
    public void setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
    }

    /**
     * Getter for SubscriptionIds.
     * Allows fetching components allocation with matching subscription id based on provided ids.
     * Use in query `subscription_ids=1,2,3`.
     * @return Returns the List of Integer
     */
    @JsonGetter("subscription_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getSubscriptionIds() {
        return subscriptionIds;
    }

    /**
     * Setter for SubscriptionIds.
     * Allows fetching components allocation with matching subscription id based on provided ids.
     * Use in query `subscription_ids=1,2,3`.
     * @param subscriptionIds Value for List of Integer
     */
    @JsonSetter("subscription_ids")
    public void setSubscriptionIds(List<Integer> subscriptionIds) {
        this.subscriptionIds = subscriptionIds;
    }

    /**
     * Getter for PricePointIds.
     * Allows fetching components allocation only if price point id is present. Use in query
     * `price_point_ids=not_null`.
     * @return Returns the IncludeNotNull
     */
    @JsonGetter("price_point_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IncludeNotNull getPricePointIds() {
        return pricePointIds;
    }

    /**
     * Setter for PricePointIds.
     * Allows fetching components allocation only if price point id is present. Use in query
     * `price_point_ids=not_null`.
     * @param pricePointIds Value for IncludeNotNull
     */
    @JsonSetter("price_point_ids")
    public void setPricePointIds(IncludeNotNull pricePointIds) {
        this.pricePointIds = pricePointIds;
    }

    /**
     * Getter for ProductFamilyIds.
     * Allows fetching components allocation with matching product family id based on provided ids.
     * Use in query `product_family_ids=1,2,3`.
     * @return Returns the List of Integer
     */
    @JsonGetter("product_family_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getProductFamilyIds() {
        return productFamilyIds;
    }

    /**
     * Setter for ProductFamilyIds.
     * Allows fetching components allocation with matching product family id based on provided ids.
     * Use in query `product_family_ids=1,2,3`.
     * @param productFamilyIds Value for List of Integer
     */
    @JsonSetter("product_family_ids")
    public void setProductFamilyIds(List<Integer> productFamilyIds) {
        this.productFamilyIds = productFamilyIds;
    }

    /**
     * Getter for Include.
     * Allows including additional data in the response. Use in query `include=subscription`.
     * @return Returns the ListSubscriptionComponentsInclude
     */
    @JsonGetter("include")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListSubscriptionComponentsInclude getInclude() {
        return include;
    }

    /**
     * Setter for Include.
     * Allows including additional data in the response. Use in query `include=subscription`.
     * @param include Value for ListSubscriptionComponentsInclude
     */
    @JsonSetter("include")
    public void setInclude(ListSubscriptionComponentsInclude include) {
        this.include = include;
    }

    /**
     * Converts this ListSubscriptionComponentsForSiteInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListSubscriptionComponentsForSiteInput [" + "page=" + page + ", perPage=" + perPage
                + ", sort=" + sort + ", direction=" + direction + ", filter=" + filter
                + ", dateField=" + dateField + ", startDate=" + startDate + ", startDatetime="
                + startDatetime + ", endDate=" + endDate + ", endDatetime=" + endDatetime
                + ", subscriptionIds=" + subscriptionIds + ", pricePointIds=" + pricePointIds
                + ", productFamilyIds=" + productFamilyIds + ", include=" + include + "]";
    }

    /**
     * Builds a new {@link ListSubscriptionComponentsForSiteInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListSubscriptionComponentsForSiteInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .page(getPage())
                .perPage(getPerPage())
                .sort(getSort())
                .direction(getDirection())
                .filter(getFilter())
                .dateField(getDateField())
                .startDate(getStartDate())
                .startDatetime(getStartDatetime())
                .endDate(getEndDate())
                .endDatetime(getEndDatetime())
                .subscriptionIds(getSubscriptionIds())
                .pricePointIds(getPricePointIds())
                .productFamilyIds(getProductFamilyIds())
                .include(getInclude());
        return builder;
    }

    /**
     * Class to build instances of {@link ListSubscriptionComponentsForSiteInput}.
     */
    public static class Builder {
        private Integer page = 1;
        private Integer perPage = 20;
        private ListSubscriptionComponentsSort sort;
        private SortingDirection direction;
        private ListSubscriptionComponentsForSiteFilter filter;
        private SubscriptionListDateField dateField;
        private String startDate;
        private String startDatetime;
        private String endDate;
        private String endDatetime;
        private List<Integer> subscriptionIds;
        private IncludeNotNull pricePointIds;
        private List<Integer> productFamilyIds;
        private ListSubscriptionComponentsInclude include;



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
         * @param  sort  ListSubscriptionComponentsSort value for sort.
         * @return Builder
         */
        public Builder sort(ListSubscriptionComponentsSort sort) {
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
         * Setter for filter.
         * @param  filter  ListSubscriptionComponentsForSiteFilter value for filter.
         * @return Builder
         */
        public Builder filter(ListSubscriptionComponentsForSiteFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Setter for dateField.
         * @param  dateField  SubscriptionListDateField value for dateField.
         * @return Builder
         */
        public Builder dateField(SubscriptionListDateField dateField) {
            this.dateField = dateField;
            return this;
        }

        /**
         * Setter for startDate.
         * @param  startDate  String value for startDate.
         * @return Builder
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * Setter for startDatetime.
         * @param  startDatetime  String value for startDatetime.
         * @return Builder
         */
        public Builder startDatetime(String startDatetime) {
            this.startDatetime = startDatetime;
            return this;
        }

        /**
         * Setter for endDate.
         * @param  endDate  String value for endDate.
         * @return Builder
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * Setter for endDatetime.
         * @param  endDatetime  String value for endDatetime.
         * @return Builder
         */
        public Builder endDatetime(String endDatetime) {
            this.endDatetime = endDatetime;
            return this;
        }

        /**
         * Setter for subscriptionIds.
         * @param  subscriptionIds  List of Integer value for subscriptionIds.
         * @return Builder
         */
        public Builder subscriptionIds(List<Integer> subscriptionIds) {
            this.subscriptionIds = subscriptionIds;
            return this;
        }

        /**
         * Setter for pricePointIds.
         * @param  pricePointIds  IncludeNotNull value for pricePointIds.
         * @return Builder
         */
        public Builder pricePointIds(IncludeNotNull pricePointIds) {
            this.pricePointIds = pricePointIds;
            return this;
        }

        /**
         * Setter for productFamilyIds.
         * @param  productFamilyIds  List of Integer value for productFamilyIds.
         * @return Builder
         */
        public Builder productFamilyIds(List<Integer> productFamilyIds) {
            this.productFamilyIds = productFamilyIds;
            return this;
        }

        /**
         * Setter for include.
         * @param  include  ListSubscriptionComponentsInclude value for include.
         * @return Builder
         */
        public Builder include(ListSubscriptionComponentsInclude include) {
            this.include = include;
            return this;
        }

        /**
         * Builds a new {@link ListSubscriptionComponentsForSiteInput} object using the set fields.
         * @return {@link ListSubscriptionComponentsForSiteInput}
         */
        public ListSubscriptionComponentsForSiteInput build() {
            return new ListSubscriptionComponentsForSiteInput(page, perPage, sort, direction,
                    filter, dateField, startDate, startDatetime, endDate, endDatetime,
                    subscriptionIds, pricePointIds, productFamilyIds, include);
        }
    }
}
