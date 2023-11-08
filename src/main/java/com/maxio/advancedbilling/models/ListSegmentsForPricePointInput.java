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
 * This is a model class for ListSegmentsForPricePointInput type.
 */
public class ListSegmentsForPricePointInput {
    private String componentId;
    private String pricePointId;
    private Integer page;
    private Integer perPage;
    private String filterSegmentProperty1Value;
    private String filterSegmentProperty2Value;
    private String filterSegmentProperty3Value;
    private String filterSegmentProperty4Value;

    /**
     * Default constructor.
     */
    public ListSegmentsForPricePointInput() {
        page = 1;
        perPage = 30;
    }

    /**
     * Initialization constructor.
     * @param  componentId  String value for componentId.
     * @param  pricePointId  String value for pricePointId.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  filterSegmentProperty1Value  String value for filterSegmentProperty1Value.
     * @param  filterSegmentProperty2Value  String value for filterSegmentProperty2Value.
     * @param  filterSegmentProperty3Value  String value for filterSegmentProperty3Value.
     * @param  filterSegmentProperty4Value  String value for filterSegmentProperty4Value.
     */
    public ListSegmentsForPricePointInput(
            String componentId,
            String pricePointId,
            Integer page,
            Integer perPage,
            String filterSegmentProperty1Value,
            String filterSegmentProperty2Value,
            String filterSegmentProperty3Value,
            String filterSegmentProperty4Value) {
        this.componentId = componentId;
        this.pricePointId = pricePointId;
        this.page = page;
        this.perPage = perPage;
        this.filterSegmentProperty1Value = filterSegmentProperty1Value;
        this.filterSegmentProperty2Value = filterSegmentProperty2Value;
        this.filterSegmentProperty3Value = filterSegmentProperty3Value;
        this.filterSegmentProperty4Value = filterSegmentProperty4Value;
    }

    /**
     * Getter for ComponentId.
     * ID or Handle for the Component
     * @return Returns the String
     */
    @JsonGetter("component_id")
    public String getComponentId() {
        return componentId;
    }

    /**
     * Setter for ComponentId.
     * ID or Handle for the Component
     * @param componentId Value for String
     */
    @JsonSetter("component_id")
    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    /**
     * Getter for PricePointId.
     * ID or Handle for the Price Point belonging to the Component
     * @return Returns the String
     */
    @JsonGetter("price_point_id")
    public String getPricePointId() {
        return pricePointId;
    }

    /**
     * Setter for PricePointId.
     * ID or Handle for the Price Point belonging to the Component
     * @param pricePointId Value for String
     */
    @JsonSetter("price_point_id")
    public void setPricePointId(String pricePointId) {
        this.pricePointId = pricePointId;
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
     * This parameter indicates how many records to fetch in each request. Default value is 30. The
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
     * This parameter indicates how many records to fetch in each request. Default value is 30. The
     * maximum allowed values is 200; any per_page value over 200 will be changed to 200. Use in
     * query `per_page=200`.
     * @param perPage Value for Integer
     */
    @JsonSetter("per_page")
    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    /**
     * Getter for FilterSegmentProperty1Value.
     * The value passed here would be used to filter segments. Pass a value related to
     * `segment_property_1` on attached Metric. If empty string is passed, this filter would be
     * rejected. Use in query `filter[segment_property_1_value]=EU`.
     * @return Returns the String
     */
    @JsonGetter("filter[segment_property_1_value]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFilterSegmentProperty1Value() {
        return filterSegmentProperty1Value;
    }

    /**
     * Setter for FilterSegmentProperty1Value.
     * The value passed here would be used to filter segments. Pass a value related to
     * `segment_property_1` on attached Metric. If empty string is passed, this filter would be
     * rejected. Use in query `filter[segment_property_1_value]=EU`.
     * @param filterSegmentProperty1Value Value for String
     */
    @JsonSetter("filter[segment_property_1_value]")
    public void setFilterSegmentProperty1Value(String filterSegmentProperty1Value) {
        this.filterSegmentProperty1Value = filterSegmentProperty1Value;
    }

    /**
     * Getter for FilterSegmentProperty2Value.
     * The value passed here would be used to filter segments. Pass a value related to
     * `segment_property_2` on attached Metric. If empty string is passed, this filter would be
     * rejected.
     * @return Returns the String
     */
    @JsonGetter("filter[segment_property_2_value]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFilterSegmentProperty2Value() {
        return filterSegmentProperty2Value;
    }

    /**
     * Setter for FilterSegmentProperty2Value.
     * The value passed here would be used to filter segments. Pass a value related to
     * `segment_property_2` on attached Metric. If empty string is passed, this filter would be
     * rejected.
     * @param filterSegmentProperty2Value Value for String
     */
    @JsonSetter("filter[segment_property_2_value]")
    public void setFilterSegmentProperty2Value(String filterSegmentProperty2Value) {
        this.filterSegmentProperty2Value = filterSegmentProperty2Value;
    }

    /**
     * Getter for FilterSegmentProperty3Value.
     * The value passed here would be used to filter segments. Pass a value related to
     * `segment_property_3` on attached Metric. If empty string is passed, this filter would be
     * rejected.
     * @return Returns the String
     */
    @JsonGetter("filter[segment_property_3_value]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFilterSegmentProperty3Value() {
        return filterSegmentProperty3Value;
    }

    /**
     * Setter for FilterSegmentProperty3Value.
     * The value passed here would be used to filter segments. Pass a value related to
     * `segment_property_3` on attached Metric. If empty string is passed, this filter would be
     * rejected.
     * @param filterSegmentProperty3Value Value for String
     */
    @JsonSetter("filter[segment_property_3_value]")
    public void setFilterSegmentProperty3Value(String filterSegmentProperty3Value) {
        this.filterSegmentProperty3Value = filterSegmentProperty3Value;
    }

    /**
     * Getter for FilterSegmentProperty4Value.
     * The value passed here would be used to filter segments. Pass a value related to
     * `segment_property_4` on attached Metric. If empty string is passed, this filter would be
     * rejected.
     * @return Returns the String
     */
    @JsonGetter("filter[segment_property_4_value]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFilterSegmentProperty4Value() {
        return filterSegmentProperty4Value;
    }

    /**
     * Setter for FilterSegmentProperty4Value.
     * The value passed here would be used to filter segments. Pass a value related to
     * `segment_property_4` on attached Metric. If empty string is passed, this filter would be
     * rejected.
     * @param filterSegmentProperty4Value Value for String
     */
    @JsonSetter("filter[segment_property_4_value]")
    public void setFilterSegmentProperty4Value(String filterSegmentProperty4Value) {
        this.filterSegmentProperty4Value = filterSegmentProperty4Value;
    }

    /**
     * Converts this ListSegmentsForPricePointInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListSegmentsForPricePointInput [" + "componentId=" + componentId + ", pricePointId="
                + pricePointId + ", page=" + page + ", perPage=" + perPage
                + ", filterSegmentProperty1Value=" + filterSegmentProperty1Value
                + ", filterSegmentProperty2Value=" + filterSegmentProperty2Value
                + ", filterSegmentProperty3Value=" + filterSegmentProperty3Value
                + ", filterSegmentProperty4Value=" + filterSegmentProperty4Value + "]";
    }

    /**
     * Builds a new {@link ListSegmentsForPricePointInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListSegmentsForPricePointInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(componentId, pricePointId)
                .page(getPage())
                .perPage(getPerPage())
                .filterSegmentProperty1Value(getFilterSegmentProperty1Value())
                .filterSegmentProperty2Value(getFilterSegmentProperty2Value())
                .filterSegmentProperty3Value(getFilterSegmentProperty3Value())
                .filterSegmentProperty4Value(getFilterSegmentProperty4Value());
        return builder;
    }

    /**
     * Class to build instances of {@link ListSegmentsForPricePointInput}.
     */
    public static class Builder {
        private String componentId;
        private String pricePointId;
        private Integer page = 1;
        private Integer perPage = 30;
        private String filterSegmentProperty1Value;
        private String filterSegmentProperty2Value;
        private String filterSegmentProperty3Value;
        private String filterSegmentProperty4Value;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  componentId  String value for componentId.
         * @param  pricePointId  String value for pricePointId.
         */
        public Builder(String componentId, String pricePointId) {
            this.componentId = componentId;
            this.pricePointId = pricePointId;
        }

        /**
         * Setter for componentId.
         * @param  componentId  String value for componentId.
         * @return Builder
         */
        public Builder componentId(String componentId) {
            this.componentId = componentId;
            return this;
        }

        /**
         * Setter for pricePointId.
         * @param  pricePointId  String value for pricePointId.
         * @return Builder
         */
        public Builder pricePointId(String pricePointId) {
            this.pricePointId = pricePointId;
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
         * Setter for filterSegmentProperty1Value.
         * @param  filterSegmentProperty1Value  String value for filterSegmentProperty1Value.
         * @return Builder
         */
        public Builder filterSegmentProperty1Value(String filterSegmentProperty1Value) {
            this.filterSegmentProperty1Value = filterSegmentProperty1Value;
            return this;
        }

        /**
         * Setter for filterSegmentProperty2Value.
         * @param  filterSegmentProperty2Value  String value for filterSegmentProperty2Value.
         * @return Builder
         */
        public Builder filterSegmentProperty2Value(String filterSegmentProperty2Value) {
            this.filterSegmentProperty2Value = filterSegmentProperty2Value;
            return this;
        }

        /**
         * Setter for filterSegmentProperty3Value.
         * @param  filterSegmentProperty3Value  String value for filterSegmentProperty3Value.
         * @return Builder
         */
        public Builder filterSegmentProperty3Value(String filterSegmentProperty3Value) {
            this.filterSegmentProperty3Value = filterSegmentProperty3Value;
            return this;
        }

        /**
         * Setter for filterSegmentProperty4Value.
         * @param  filterSegmentProperty4Value  String value for filterSegmentProperty4Value.
         * @return Builder
         */
        public Builder filterSegmentProperty4Value(String filterSegmentProperty4Value) {
            this.filterSegmentProperty4Value = filterSegmentProperty4Value;
            return this;
        }

        /**
         * Builds a new {@link ListSegmentsForPricePointInput} object using the set fields.
         * @return {@link ListSegmentsForPricePointInput}
         */
        public ListSegmentsForPricePointInput build() {
            return new ListSegmentsForPricePointInput(componentId, pricePointId, page, perPage,
                    filterSegmentProperty1Value, filterSegmentProperty2Value,
                    filterSegmentProperty3Value, filterSegmentProperty4Value);
        }
    }
}
