/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.ListSubscriptionComponentsForSiteInputDirection;
import java.util.List;

/**
 * This is a model class for ListSubscriptionComponentsForSiteInput type.
 */
public class ListSubscriptionComponentsForSiteInput {
    private Integer page;
    private Integer perPage;
    private ListSubscriptionComponentsSort sort;
    private ListSubscriptionComponentsForSiteInputDirection direction;
    private SubscriptionListDateField dateField;
    private String startDate;
    private String startDatetime;
    private String endDate;
    private String endDatetime;
    private List<Integer> subscriptionIds;
    private IncludeNotNull pricePointIds;
    private List<Integer> productFamilyIds;
    private ListSubscriptionComponentsInclude include;
    private Boolean filterUseSiteExchangeRate;
    private List<String> filterCurrencies;
    private List<SubscriptionState> filterSubscriptionStates;
    private SubscriptionListDateField filterSubscriptionDateField;
    private String filterSubscriptionStartDate;
    private String filterSubscriptionStartDatetime;
    private String filterSubscriptionEndDate;
    private String filterSubscriptionEndDatetime;

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
     * @param  direction  ListSubscriptionComponentsForSiteInputDirection value for direction.
     * @param  dateField  SubscriptionListDateField value for dateField.
     * @param  startDate  String value for startDate.
     * @param  startDatetime  String value for startDatetime.
     * @param  endDate  String value for endDate.
     * @param  endDatetime  String value for endDatetime.
     * @param  subscriptionIds  List of Integer value for subscriptionIds.
     * @param  pricePointIds  IncludeNotNull value for pricePointIds.
     * @param  productFamilyIds  List of Integer value for productFamilyIds.
     * @param  include  ListSubscriptionComponentsInclude value for include.
     * @param  filterUseSiteExchangeRate  Boolean value for filterUseSiteExchangeRate.
     * @param  filterCurrencies  List of String value for filterCurrencies.
     * @param  filterSubscriptionStates  List of SubscriptionState value for
     *         filterSubscriptionStates.
     * @param  filterSubscriptionDateField  SubscriptionListDateField value for
     *         filterSubscriptionDateField.
     * @param  filterSubscriptionStartDate  String value for filterSubscriptionStartDate.
     * @param  filterSubscriptionStartDatetime  String value for filterSubscriptionStartDatetime.
     * @param  filterSubscriptionEndDate  String value for filterSubscriptionEndDate.
     * @param  filterSubscriptionEndDatetime  String value for filterSubscriptionEndDatetime.
     */
    public ListSubscriptionComponentsForSiteInput(
            Integer page,
            Integer perPage,
            ListSubscriptionComponentsSort sort,
            ListSubscriptionComponentsForSiteInputDirection direction,
            SubscriptionListDateField dateField,
            String startDate,
            String startDatetime,
            String endDate,
            String endDatetime,
            List<Integer> subscriptionIds,
            IncludeNotNull pricePointIds,
            List<Integer> productFamilyIds,
            ListSubscriptionComponentsInclude include,
            Boolean filterUseSiteExchangeRate,
            List<String> filterCurrencies,
            List<SubscriptionState> filterSubscriptionStates,
            SubscriptionListDateField filterSubscriptionDateField,
            String filterSubscriptionStartDate,
            String filterSubscriptionStartDatetime,
            String filterSubscriptionEndDate,
            String filterSubscriptionEndDatetime) {
        this.page = page;
        this.perPage = perPage;
        this.sort = sort;
        this.direction = direction;
        this.dateField = dateField;
        this.startDate = startDate;
        this.startDatetime = startDatetime;
        this.endDate = endDate;
        this.endDatetime = endDatetime;
        this.subscriptionIds = subscriptionIds;
        this.pricePointIds = pricePointIds;
        this.productFamilyIds = productFamilyIds;
        this.include = include;
        this.filterUseSiteExchangeRate = filterUseSiteExchangeRate;
        this.filterCurrencies = filterCurrencies;
        this.filterSubscriptionStates = filterSubscriptionStates;
        this.filterSubscriptionDateField = filterSubscriptionDateField;
        this.filterSubscriptionStartDate = filterSubscriptionStartDate;
        this.filterSubscriptionStartDatetime = filterSubscriptionStartDatetime;
        this.filterSubscriptionEndDate = filterSubscriptionEndDate;
        this.filterSubscriptionEndDatetime = filterSubscriptionEndDatetime;
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
     * @return Returns the ListSubscriptionComponentsForSiteInputDirection
     */
    @JsonGetter("direction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListSubscriptionComponentsForSiteInputDirection getDirection() {
        return direction;
    }

    /**
     * Setter for Direction.
     * Controls the order in which results are returned. Use in query `direction=asc`.
     * @param direction Value for ListSubscriptionComponentsForSiteInputDirection
     */
    @JsonSetter("direction")
    public void setDirection(ListSubscriptionComponentsForSiteInputDirection direction) {
        this.direction = direction;
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
     * Getter for FilterUseSiteExchangeRate.
     * Allows fetching components allocation with matching use_site_exchange_rate based on provided
     * value. Use in query `filter[use_site_exchange_rate]=true`.
     * @return Returns the Boolean
     */
    @JsonGetter("filter[use_site_exchange_rate]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getFilterUseSiteExchangeRate() {
        return filterUseSiteExchangeRate;
    }

    /**
     * Setter for FilterUseSiteExchangeRate.
     * Allows fetching components allocation with matching use_site_exchange_rate based on provided
     * value. Use in query `filter[use_site_exchange_rate]=true`.
     * @param filterUseSiteExchangeRate Value for Boolean
     */
    @JsonSetter("filter[use_site_exchange_rate]")
    public void setFilterUseSiteExchangeRate(Boolean filterUseSiteExchangeRate) {
        this.filterUseSiteExchangeRate = filterUseSiteExchangeRate;
    }

    /**
     * Getter for FilterCurrencies.
     * Allows fetching components allocation with matching currency based on provided values. Use in
     * query `filter[currencies]=USD,EUR`.
     * @return Returns the List of String
     */
    @JsonGetter("filter[currencies]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getFilterCurrencies() {
        return filterCurrencies;
    }

    /**
     * Setter for FilterCurrencies.
     * Allows fetching components allocation with matching currency based on provided values. Use in
     * query `filter[currencies]=USD,EUR`.
     * @param filterCurrencies Value for List of String
     */
    @JsonSetter("filter[currencies]")
    public void setFilterCurrencies(List<String> filterCurrencies) {
        this.filterCurrencies = filterCurrencies;
    }

    /**
     * Getter for FilterSubscriptionStates.
     * Allows fetching components allocations that belong to the subscription with matching states
     * based on provided values. To use this filter you also have to include the following param in
     * the request `include=subscription`. Use in query
     * `filter[subscription][states]=active,canceled&amp;include=subscription`.
     * @return Returns the List of SubscriptionState
     */
    @JsonGetter("filter[subscription][states]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<SubscriptionState> getFilterSubscriptionStates() {
        return filterSubscriptionStates;
    }

    /**
     * Setter for FilterSubscriptionStates.
     * Allows fetching components allocations that belong to the subscription with matching states
     * based on provided values. To use this filter you also have to include the following param in
     * the request `include=subscription`. Use in query
     * `filter[subscription][states]=active,canceled&amp;include=subscription`.
     * @param filterSubscriptionStates Value for List of SubscriptionState
     */
    @JsonSetter("filter[subscription][states]")
    public void setFilterSubscriptionStates(List<SubscriptionState> filterSubscriptionStates) {
        this.filterSubscriptionStates = filterSubscriptionStates;
    }

    /**
     * Getter for FilterSubscriptionDateField.
     * The type of filter you'd like to apply to your search. To use this filter you also have to
     * include the following param in the request `include=subscription`.
     * @return Returns the SubscriptionListDateField
     */
    @JsonGetter("filter[subscription][date_field]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionListDateField getFilterSubscriptionDateField() {
        return filterSubscriptionDateField;
    }

    /**
     * Setter for FilterSubscriptionDateField.
     * The type of filter you'd like to apply to your search. To use this filter you also have to
     * include the following param in the request `include=subscription`.
     * @param filterSubscriptionDateField Value for SubscriptionListDateField
     */
    @JsonSetter("filter[subscription][date_field]")
    public void setFilterSubscriptionDateField(SubscriptionListDateField filterSubscriptionDateField) {
        this.filterSubscriptionDateField = filterSubscriptionDateField;
    }

    /**
     * Getter for FilterSubscriptionStartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns components
     * that belong to the subscription with a timestamp at or after midnight (12:00:00 AM) in your
     * site’s time zone on the date specified. To use this filter you also have to include the
     * following param in the request `include=subscription`.
     * @return Returns the String
     */
    @JsonGetter("filter[subscription][start_date]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFilterSubscriptionStartDate() {
        return filterSubscriptionStartDate;
    }

    /**
     * Setter for FilterSubscriptionStartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns components
     * that belong to the subscription with a timestamp at or after midnight (12:00:00 AM) in your
     * site’s time zone on the date specified. To use this filter you also have to include the
     * following param in the request `include=subscription`.
     * @param filterSubscriptionStartDate Value for String
     */
    @JsonSetter("filter[subscription][start_date]")
    public void setFilterSubscriptionStartDate(String filterSubscriptionStartDate) {
        this.filterSubscriptionStartDate = filterSubscriptionStartDate;
    }

    /**
     * Getter for FilterSubscriptionStartDatetime.
     * The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns components that belong to the subscription with a timestamp at or after exact time
     * provided in query. You can specify timezone in query - otherwise your site''s time zone will
     * be used. If provided, this parameter will be used instead of start_date. To use this filter
     * you also have to include the following param in the request `include=subscription`.
     * @return Returns the String
     */
    @JsonGetter("filter[subscription][start_datetime]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFilterSubscriptionStartDatetime() {
        return filterSubscriptionStartDatetime;
    }

    /**
     * Setter for FilterSubscriptionStartDatetime.
     * The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns components that belong to the subscription with a timestamp at or after exact time
     * provided in query. You can specify timezone in query - otherwise your site''s time zone will
     * be used. If provided, this parameter will be used instead of start_date. To use this filter
     * you also have to include the following param in the request `include=subscription`.
     * @param filterSubscriptionStartDatetime Value for String
     */
    @JsonSetter("filter[subscription][start_datetime]")
    public void setFilterSubscriptionStartDatetime(String filterSubscriptionStartDatetime) {
        this.filterSubscriptionStartDatetime = filterSubscriptionStartDatetime;
    }

    /**
     * Getter for FilterSubscriptionEndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns components that
     * belong to the subscription with a timestamp up to and including 11:59:59PM in your site’s
     * time zone on the date specified. To use this filter you also have to include the following
     * param in the request `include=subscription`.
     * @return Returns the String
     */
    @JsonGetter("filter[subscription][end_date]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFilterSubscriptionEndDate() {
        return filterSubscriptionEndDate;
    }

    /**
     * Setter for FilterSubscriptionEndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns components that
     * belong to the subscription with a timestamp up to and including 11:59:59PM in your site’s
     * time zone on the date specified. To use this filter you also have to include the following
     * param in the request `include=subscription`.
     * @param filterSubscriptionEndDate Value for String
     */
    @JsonSetter("filter[subscription][end_date]")
    public void setFilterSubscriptionEndDate(String filterSubscriptionEndDate) {
        this.filterSubscriptionEndDate = filterSubscriptionEndDate;
    }

    /**
     * Getter for FilterSubscriptionEndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns components that belong to the subscription with a timestamp at or before exact time
     * provided in query. You can specify timezone in query - otherwise your site''s time zone will
     * be used. If provided, this parameter will be used instead of end_date. To use this filter you
     * also have to include the following param in the request `include=subscription`.
     * @return Returns the String
     */
    @JsonGetter("filter[subscription][end_datetime]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFilterSubscriptionEndDatetime() {
        return filterSubscriptionEndDatetime;
    }

    /**
     * Setter for FilterSubscriptionEndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns components that belong to the subscription with a timestamp at or before exact time
     * provided in query. You can specify timezone in query - otherwise your site''s time zone will
     * be used. If provided, this parameter will be used instead of end_date. To use this filter you
     * also have to include the following param in the request `include=subscription`.
     * @param filterSubscriptionEndDatetime Value for String
     */
    @JsonSetter("filter[subscription][end_datetime]")
    public void setFilterSubscriptionEndDatetime(String filterSubscriptionEndDatetime) {
        this.filterSubscriptionEndDatetime = filterSubscriptionEndDatetime;
    }

    /**
     * Converts this ListSubscriptionComponentsForSiteInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListSubscriptionComponentsForSiteInput [" + "page=" + page + ", perPage=" + perPage
                + ", sort=" + sort + ", direction=" + direction + ", dateField=" + dateField
                + ", startDate=" + startDate + ", startDatetime=" + startDatetime + ", endDate="
                + endDate + ", endDatetime=" + endDatetime + ", subscriptionIds=" + subscriptionIds
                + ", pricePointIds=" + pricePointIds + ", productFamilyIds=" + productFamilyIds
                + ", include=" + include + ", filterUseSiteExchangeRate="
                + filterUseSiteExchangeRate + ", filterCurrencies=" + filterCurrencies
                + ", filterSubscriptionStates=" + filterSubscriptionStates
                + ", filterSubscriptionDateField=" + filterSubscriptionDateField
                + ", filterSubscriptionStartDate=" + filterSubscriptionStartDate
                + ", filterSubscriptionStartDatetime=" + filterSubscriptionStartDatetime
                + ", filterSubscriptionEndDate=" + filterSubscriptionEndDate
                + ", filterSubscriptionEndDatetime=" + filterSubscriptionEndDatetime + "]";
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
                .dateField(getDateField())
                .startDate(getStartDate())
                .startDatetime(getStartDatetime())
                .endDate(getEndDate())
                .endDatetime(getEndDatetime())
                .subscriptionIds(getSubscriptionIds())
                .pricePointIds(getPricePointIds())
                .productFamilyIds(getProductFamilyIds())
                .include(getInclude())
                .filterUseSiteExchangeRate(getFilterUseSiteExchangeRate())
                .filterCurrencies(getFilterCurrencies())
                .filterSubscriptionStates(getFilterSubscriptionStates())
                .filterSubscriptionDateField(getFilterSubscriptionDateField())
                .filterSubscriptionStartDate(getFilterSubscriptionStartDate())
                .filterSubscriptionStartDatetime(getFilterSubscriptionStartDatetime())
                .filterSubscriptionEndDate(getFilterSubscriptionEndDate())
                .filterSubscriptionEndDatetime(getFilterSubscriptionEndDatetime());
        return builder;
    }

    /**
     * Class to build instances of {@link ListSubscriptionComponentsForSiteInput}.
     */
    public static class Builder {
        private Integer page = 1;
        private Integer perPage = 20;
        private ListSubscriptionComponentsSort sort;
        private ListSubscriptionComponentsForSiteInputDirection direction;
        private SubscriptionListDateField dateField;
        private String startDate;
        private String startDatetime;
        private String endDate;
        private String endDatetime;
        private List<Integer> subscriptionIds;
        private IncludeNotNull pricePointIds;
        private List<Integer> productFamilyIds;
        private ListSubscriptionComponentsInclude include;
        private Boolean filterUseSiteExchangeRate;
        private List<String> filterCurrencies;
        private List<SubscriptionState> filterSubscriptionStates;
        private SubscriptionListDateField filterSubscriptionDateField;
        private String filterSubscriptionStartDate;
        private String filterSubscriptionStartDatetime;
        private String filterSubscriptionEndDate;
        private String filterSubscriptionEndDatetime;



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
         * @param  direction  ListSubscriptionComponentsForSiteInputDirection value for direction.
         * @return Builder
         */
        public Builder direction(ListSubscriptionComponentsForSiteInputDirection direction) {
            this.direction = direction;
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
         * Setter for filterUseSiteExchangeRate.
         * @param  filterUseSiteExchangeRate  Boolean value for filterUseSiteExchangeRate.
         * @return Builder
         */
        public Builder filterUseSiteExchangeRate(Boolean filterUseSiteExchangeRate) {
            this.filterUseSiteExchangeRate = filterUseSiteExchangeRate;
            return this;
        }

        /**
         * Setter for filterCurrencies.
         * @param  filterCurrencies  List of String value for filterCurrencies.
         * @return Builder
         */
        public Builder filterCurrencies(List<String> filterCurrencies) {
            this.filterCurrencies = filterCurrencies;
            return this;
        }

        /**
         * Setter for filterSubscriptionStates.
         * @param  filterSubscriptionStates  List of SubscriptionState value for
         *         filterSubscriptionStates.
         * @return Builder
         */
        public Builder filterSubscriptionStates(
                List<SubscriptionState> filterSubscriptionStates) {
            this.filterSubscriptionStates = filterSubscriptionStates;
            return this;
        }

        /**
         * Setter for filterSubscriptionDateField.
         * @param  filterSubscriptionDateField  SubscriptionListDateField value for
         *         filterSubscriptionDateField.
         * @return Builder
         */
        public Builder filterSubscriptionDateField(
                SubscriptionListDateField filterSubscriptionDateField) {
            this.filterSubscriptionDateField = filterSubscriptionDateField;
            return this;
        }

        /**
         * Setter for filterSubscriptionStartDate.
         * @param  filterSubscriptionStartDate  String value for filterSubscriptionStartDate.
         * @return Builder
         */
        public Builder filterSubscriptionStartDate(String filterSubscriptionStartDate) {
            this.filterSubscriptionStartDate = filterSubscriptionStartDate;
            return this;
        }

        /**
         * Setter for filterSubscriptionStartDatetime.
         * @param  filterSubscriptionStartDatetime  String value for
         *         filterSubscriptionStartDatetime.
         * @return Builder
         */
        public Builder filterSubscriptionStartDatetime(String filterSubscriptionStartDatetime) {
            this.filterSubscriptionStartDatetime = filterSubscriptionStartDatetime;
            return this;
        }

        /**
         * Setter for filterSubscriptionEndDate.
         * @param  filterSubscriptionEndDate  String value for filterSubscriptionEndDate.
         * @return Builder
         */
        public Builder filterSubscriptionEndDate(String filterSubscriptionEndDate) {
            this.filterSubscriptionEndDate = filterSubscriptionEndDate;
            return this;
        }

        /**
         * Setter for filterSubscriptionEndDatetime.
         * @param  filterSubscriptionEndDatetime  String value for filterSubscriptionEndDatetime.
         * @return Builder
         */
        public Builder filterSubscriptionEndDatetime(String filterSubscriptionEndDatetime) {
            this.filterSubscriptionEndDatetime = filterSubscriptionEndDatetime;
            return this;
        }

        /**
         * Builds a new {@link ListSubscriptionComponentsForSiteInput} object using the set fields.
         * @return {@link ListSubscriptionComponentsForSiteInput}
         */
        public ListSubscriptionComponentsForSiteInput build() {
            return new ListSubscriptionComponentsForSiteInput(page, perPage, sort, direction,
                    dateField, startDate, startDatetime, endDate, endDatetime, subscriptionIds,
                    pricePointIds, productFamilyIds, include, filterUseSiteExchangeRate,
                    filterCurrencies, filterSubscriptionStates, filterSubscriptionDateField,
                    filterSubscriptionStartDate, filterSubscriptionStartDatetime,
                    filterSubscriptionEndDate, filterSubscriptionEndDatetime);
        }
    }
}
