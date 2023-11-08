/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.ListSubscriptionComponentsInputDirection;
import java.util.List;

/**
 * This is a model class for ListSubscriptionComponentsInput type.
 */
public class ListSubscriptionComponentsInput {
    private String subscriptionId;
    private SubscriptionListDateField dateField;
    private ListSubscriptionComponentsInputDirection direction;
    private String endDate;
    private String endDatetime;
    private IncludeNotNull pricePointIds;
    private List<Integer> productFamilyIds;
    private ListSubscriptionComponentsSort sort;
    private String startDate;
    private String startDatetime;
    private ListSubscriptionComponentsInclude include;
    private Boolean filterUseSiteExchangeRate;
    private List<String> filterCurrencies;

    /**
     * Default constructor.
     */
    public ListSubscriptionComponentsInput() {
    }

    /**
     * Initialization constructor.
     * @param  subscriptionId  String value for subscriptionId.
     * @param  dateField  SubscriptionListDateField value for dateField.
     * @param  direction  ListSubscriptionComponentsInputDirection value for direction.
     * @param  endDate  String value for endDate.
     * @param  endDatetime  String value for endDatetime.
     * @param  pricePointIds  IncludeNotNull value for pricePointIds.
     * @param  productFamilyIds  List of Integer value for productFamilyIds.
     * @param  sort  ListSubscriptionComponentsSort value for sort.
     * @param  startDate  String value for startDate.
     * @param  startDatetime  String value for startDatetime.
     * @param  include  ListSubscriptionComponentsInclude value for include.
     * @param  filterUseSiteExchangeRate  Boolean value for filterUseSiteExchangeRate.
     * @param  filterCurrencies  List of String value for filterCurrencies.
     */
    public ListSubscriptionComponentsInput(
            String subscriptionId,
            SubscriptionListDateField dateField,
            ListSubscriptionComponentsInputDirection direction,
            String endDate,
            String endDatetime,
            IncludeNotNull pricePointIds,
            List<Integer> productFamilyIds,
            ListSubscriptionComponentsSort sort,
            String startDate,
            String startDatetime,
            ListSubscriptionComponentsInclude include,
            Boolean filterUseSiteExchangeRate,
            List<String> filterCurrencies) {
        this.subscriptionId = subscriptionId;
        this.dateField = dateField;
        this.direction = direction;
        this.endDate = endDate;
        this.endDatetime = endDatetime;
        this.pricePointIds = pricePointIds;
        this.productFamilyIds = productFamilyIds;
        this.sort = sort;
        this.startDate = startDate;
        this.startDatetime = startDatetime;
        this.include = include;
        this.filterUseSiteExchangeRate = filterUseSiteExchangeRate;
        this.filterCurrencies = filterCurrencies;
    }

    /**
     * Getter for SubscriptionId.
     * The Chargify id of the subscription
     * @return Returns the String
     */
    @JsonGetter("subscription_id")
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * The Chargify id of the subscription
     * @param subscriptionId Value for String
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for DateField.
     * The type of filter you'd like to apply to your search. Use in query `date_field=updated_at`.
     * @return Returns the SubscriptionListDateField
     */
    @JsonGetter("date_field")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionListDateField getDateField() {
        return dateField;
    }

    /**
     * Setter for DateField.
     * The type of filter you'd like to apply to your search. Use in query `date_field=updated_at`.
     * @param dateField Value for SubscriptionListDateField
     */
    @JsonSetter("date_field")
    public void setDateField(SubscriptionListDateField dateField) {
        this.dateField = dateField;
    }

    /**
     * Getter for Direction.
     * Controls the order in which results are returned. Use in query `direction=asc`.
     * @return Returns the ListSubscriptionComponentsInputDirection
     */
    @JsonGetter("direction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListSubscriptionComponentsInputDirection getDirection() {
        return direction;
    }

    /**
     * Setter for Direction.
     * Controls the order in which results are returned. Use in query `direction=asc`.
     * @param direction Value for ListSubscriptionComponentsInputDirection
     */
    @JsonSetter("direction")
    public void setDirection(ListSubscriptionComponentsInputDirection direction) {
        this.direction = direction;
    }

    /**
     * Getter for EndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns components with
     * a timestamp up to and including 11:59:59PM in your site’s time zone on the date specified.
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
     * parameter will be used instead of end_date.
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
     * parameter will be used instead of end_date.
     * @param endDatetime Value for String
     */
    @JsonSetter("end_datetime")
    public void setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
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
     * Getter for Sort.
     * The attribute by which to sort. Use in query `sort=updated_at`.
     * @return Returns the ListSubscriptionComponentsSort
     */
    @JsonGetter("sort")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListSubscriptionComponentsSort getSort() {
        return sort;
    }

    /**
     * Setter for Sort.
     * The attribute by which to sort. Use in query `sort=updated_at`.
     * @param sort Value for ListSubscriptionComponentsSort
     */
    @JsonSetter("sort")
    public void setSort(ListSubscriptionComponentsSort sort) {
        this.sort = sort;
    }

    /**
     * Getter for StartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns components
     * with a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified.
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
     * specified.
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
     * parameter will be used instead of start_date.
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
     * parameter will be used instead of start_date.
     * @param startDatetime Value for String
     */
    @JsonSetter("start_datetime")
    public void setStartDatetime(String startDatetime) {
        this.startDatetime = startDatetime;
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
     * query `filter[currencies]=EUR,USD`.
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
     * query `filter[currencies]=EUR,USD`.
     * @param filterCurrencies Value for List of String
     */
    @JsonSetter("filter[currencies]")
    public void setFilterCurrencies(List<String> filterCurrencies) {
        this.filterCurrencies = filterCurrencies;
    }

    /**
     * Converts this ListSubscriptionComponentsInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListSubscriptionComponentsInput [" + "subscriptionId=" + subscriptionId
                + ", dateField=" + dateField + ", direction=" + direction + ", endDate=" + endDate
                + ", endDatetime=" + endDatetime + ", pricePointIds=" + pricePointIds
                + ", productFamilyIds=" + productFamilyIds + ", sort=" + sort + ", startDate="
                + startDate + ", startDatetime=" + startDatetime + ", include=" + include
                + ", filterUseSiteExchangeRate=" + filterUseSiteExchangeRate + ", filterCurrencies="
                + filterCurrencies + "]";
    }

    /**
     * Builds a new {@link ListSubscriptionComponentsInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListSubscriptionComponentsInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscriptionId)
                .dateField(getDateField())
                .direction(getDirection())
                .endDate(getEndDate())
                .endDatetime(getEndDatetime())
                .pricePointIds(getPricePointIds())
                .productFamilyIds(getProductFamilyIds())
                .sort(getSort())
                .startDate(getStartDate())
                .startDatetime(getStartDatetime())
                .include(getInclude())
                .filterUseSiteExchangeRate(getFilterUseSiteExchangeRate())
                .filterCurrencies(getFilterCurrencies());
        return builder;
    }

    /**
     * Class to build instances of {@link ListSubscriptionComponentsInput}.
     */
    public static class Builder {
        private String subscriptionId;
        private SubscriptionListDateField dateField;
        private ListSubscriptionComponentsInputDirection direction;
        private String endDate;
        private String endDatetime;
        private IncludeNotNull pricePointIds;
        private List<Integer> productFamilyIds;
        private ListSubscriptionComponentsSort sort;
        private String startDate;
        private String startDatetime;
        private ListSubscriptionComponentsInclude include;
        private Boolean filterUseSiteExchangeRate;
        private List<String> filterCurrencies;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  subscriptionId  String value for subscriptionId.
         */
        public Builder(String subscriptionId) {
            this.subscriptionId = subscriptionId;
        }

        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  String value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
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
         * Setter for direction.
         * @param  direction  ListSubscriptionComponentsInputDirection value for direction.
         * @return Builder
         */
        public Builder direction(ListSubscriptionComponentsInputDirection direction) {
            this.direction = direction;
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
         * Setter for sort.
         * @param  sort  ListSubscriptionComponentsSort value for sort.
         * @return Builder
         */
        public Builder sort(ListSubscriptionComponentsSort sort) {
            this.sort = sort;
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
         * Builds a new {@link ListSubscriptionComponentsInput} object using the set fields.
         * @return {@link ListSubscriptionComponentsInput}
         */
        public ListSubscriptionComponentsInput build() {
            return new ListSubscriptionComponentsInput(subscriptionId, dateField, direction,
                    endDate, endDatetime, pricePointIds, productFamilyIds, sort, startDate,
                    startDatetime, include, filterUseSiteExchangeRate, filterCurrencies);
        }
    }
}
