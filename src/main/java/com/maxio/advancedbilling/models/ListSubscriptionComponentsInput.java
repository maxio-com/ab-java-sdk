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
 * This is a model class for ListSubscriptionComponentsInput type.
 */
public class ListSubscriptionComponentsInput {
    private int subscriptionId;
    private SubscriptionListDateField dateField;
    private SortingDirection direction;
    private ListSubscriptionComponentsFilter filter;
    private String endDate;
    private String endDatetime;
    private IncludeNotNull pricePointIds;
    private List<Integer> productFamilyIds;
    private ListSubscriptionComponentsSort sort;
    private String startDate;
    private String startDatetime;
    private List<ListSubscriptionComponentsInclude> include;
    private Boolean inUse;

    /**
     * Default constructor.
     */
    public ListSubscriptionComponentsInput() {
    }

    /**
     * Initialization constructor.
     * @param  subscriptionId  int value for subscriptionId.
     * @param  dateField  SubscriptionListDateField value for dateField.
     * @param  direction  SortingDirection value for direction.
     * @param  filter  ListSubscriptionComponentsFilter value for filter.
     * @param  endDate  String value for endDate.
     * @param  endDatetime  String value for endDatetime.
     * @param  pricePointIds  IncludeNotNull value for pricePointIds.
     * @param  productFamilyIds  List of Integer value for productFamilyIds.
     * @param  sort  ListSubscriptionComponentsSort value for sort.
     * @param  startDate  String value for startDate.
     * @param  startDatetime  String value for startDatetime.
     * @param  include  List of ListSubscriptionComponentsInclude value for include.
     * @param  inUse  Boolean value for inUse.
     */
    public ListSubscriptionComponentsInput(
            int subscriptionId,
            SubscriptionListDateField dateField,
            SortingDirection direction,
            ListSubscriptionComponentsFilter filter,
            String endDate,
            String endDatetime,
            IncludeNotNull pricePointIds,
            List<Integer> productFamilyIds,
            ListSubscriptionComponentsSort sort,
            String startDate,
            String startDatetime,
            List<ListSubscriptionComponentsInclude> include,
            Boolean inUse) {
        this.subscriptionId = subscriptionId;
        this.dateField = dateField;
        this.direction = direction;
        this.filter = filter;
        this.endDate = endDate;
        this.endDatetime = endDatetime;
        this.pricePointIds = pricePointIds;
        this.productFamilyIds = productFamilyIds;
        this.sort = sort;
        this.startDate = startDate;
        this.startDatetime = startDatetime;
        this.include = include;
        this.inUse = inUse;
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
     * Filter to use for List Subscription Components operation
     * @return Returns the ListSubscriptionComponentsFilter
     */
    @JsonGetter("filter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListSubscriptionComponentsFilter getFilter() {
        return filter;
    }

    /**
     * Setter for Filter.
     * Filter to use for List Subscription Components operation
     * @param filter Value for ListSubscriptionComponentsFilter
     */
    @JsonSetter("filter")
    public void setFilter(ListSubscriptionComponentsFilter filter) {
        this.filter = filter;
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
     * Allows including additional data in the response. Use in query
     * `include=subscription,historic_usages`.
     * @return Returns the List of ListSubscriptionComponentsInclude
     */
    @JsonGetter("include")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ListSubscriptionComponentsInclude> getInclude() {
        return include;
    }

    /**
     * Setter for Include.
     * Allows including additional data in the response. Use in query
     * `include=subscription,historic_usages`.
     * @param include Value for List of ListSubscriptionComponentsInclude
     */
    @JsonSetter("include")
    public void setInclude(List<ListSubscriptionComponentsInclude> include) {
        this.include = include;
    }

    /**
     * Getter for InUse.
     * If in_use is set to true, it returns only components that are currently in use. However, if
     * it's set to false or not provided, it returns all components connected with the subscription.
     * @return Returns the Boolean
     */
    @JsonGetter("in_use")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getInUse() {
        return inUse;
    }

    /**
     * Setter for InUse.
     * If in_use is set to true, it returns only components that are currently in use. However, if
     * it's set to false or not provided, it returns all components connected with the subscription.
     * @param inUse Value for Boolean
     */
    @JsonSetter("in_use")
    public void setInUse(Boolean inUse) {
        this.inUse = inUse;
    }

    /**
     * Converts this ListSubscriptionComponentsInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListSubscriptionComponentsInput [" + "subscriptionId=" + subscriptionId
                + ", dateField=" + dateField + ", direction=" + direction + ", filter=" + filter
                + ", endDate=" + endDate + ", endDatetime=" + endDatetime + ", pricePointIds="
                + pricePointIds + ", productFamilyIds=" + productFamilyIds + ", sort=" + sort
                + ", startDate=" + startDate + ", startDatetime=" + startDatetime + ", include="
                + include + ", inUse=" + inUse + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscriptionId)
                .dateField(getDateField())
                .direction(getDirection())
                .filter(getFilter())
                .endDate(getEndDate())
                .endDatetime(getEndDatetime())
                .pricePointIds(getPricePointIds())
                .productFamilyIds(getProductFamilyIds())
                .sort(getSort())
                .startDate(getStartDate())
                .startDatetime(getStartDatetime())
                .include(getInclude())
                .inUse(getInUse());
        return builder;
    }

    /**
     * Class to build instances of {@link ListSubscriptionComponentsInput}.
     */
    public static class Builder {
        private int subscriptionId;
        private SubscriptionListDateField dateField;
        private SortingDirection direction;
        private ListSubscriptionComponentsFilter filter;
        private String endDate;
        private String endDatetime;
        private IncludeNotNull pricePointIds;
        private List<Integer> productFamilyIds;
        private ListSubscriptionComponentsSort sort;
        private String startDate;
        private String startDatetime;
        private List<ListSubscriptionComponentsInclude> include;
        private Boolean inUse;

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
         * @param  direction  SortingDirection value for direction.
         * @return Builder
         */
        public Builder direction(SortingDirection direction) {
            this.direction = direction;
            return this;
        }

        /**
         * Setter for filter.
         * @param  filter  ListSubscriptionComponentsFilter value for filter.
         * @return Builder
         */
        public Builder filter(ListSubscriptionComponentsFilter filter) {
            this.filter = filter;
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
         * @param  include  List of ListSubscriptionComponentsInclude value for include.
         * @return Builder
         */
        public Builder include(List<ListSubscriptionComponentsInclude> include) {
            this.include = include;
            return this;
        }

        /**
         * Setter for inUse.
         * @param  inUse  Boolean value for inUse.
         * @return Builder
         */
        public Builder inUse(Boolean inUse) {
            this.inUse = inUse;
            return this;
        }

        /**
         * Builds a new {@link ListSubscriptionComponentsInput} object using the set fields.
         * @return {@link ListSubscriptionComponentsInput}
         */
        public ListSubscriptionComponentsInput build() {
            return new ListSubscriptionComponentsInput(subscriptionId, dateField, direction, filter,
                    endDate, endDatetime, pricePointIds, productFamilyIds, sort, startDate,
                    startDatetime, include, inUse);
        }
    }
}
