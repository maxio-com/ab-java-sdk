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
 * This is a model class for ListCouponsForProductFamilyInput type.
 */
public class ListCouponsForProductFamilyInput {
    private int productFamilyId;
    private Integer page;
    private Integer perPage;
    private BasicDateField filterDateField;
    private String filterEndDate;
    private String filterEndDatetime;
    private String filterStartDate;
    private String filterStartDatetime;
    private List<Integer> filterIds;
    private List<String> filterCodes;
    private Boolean currencyPrices;
    private Boolean filterUseSiteExchangeRate;

    /**
     * Default constructor.
     */
    public ListCouponsForProductFamilyInput() {
        page = 1;
        perPage = 30;
    }

    /**
     * Initialization constructor.
     * @param  productFamilyId  int value for productFamilyId.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  filterDateField  BasicDateField value for filterDateField.
     * @param  filterEndDate  String value for filterEndDate.
     * @param  filterEndDatetime  String value for filterEndDatetime.
     * @param  filterStartDate  String value for filterStartDate.
     * @param  filterStartDatetime  String value for filterStartDatetime.
     * @param  filterIds  List of Integer value for filterIds.
     * @param  filterCodes  List of String value for filterCodes.
     * @param  currencyPrices  Boolean value for currencyPrices.
     * @param  filterUseSiteExchangeRate  Boolean value for filterUseSiteExchangeRate.
     */
    public ListCouponsForProductFamilyInput(
            int productFamilyId,
            Integer page,
            Integer perPage,
            BasicDateField filterDateField,
            String filterEndDate,
            String filterEndDatetime,
            String filterStartDate,
            String filterStartDatetime,
            List<Integer> filterIds,
            List<String> filterCodes,
            Boolean currencyPrices,
            Boolean filterUseSiteExchangeRate) {
        this.productFamilyId = productFamilyId;
        this.page = page;
        this.perPage = perPage;
        this.filterDateField = filterDateField;
        this.filterEndDate = filterEndDate;
        this.filterEndDatetime = filterEndDatetime;
        this.filterStartDate = filterStartDate;
        this.filterStartDatetime = filterStartDatetime;
        this.filterIds = filterIds;
        this.filterCodes = filterCodes;
        this.currencyPrices = currencyPrices;
        this.filterUseSiteExchangeRate = filterUseSiteExchangeRate;
    }

    /**
     * Getter for ProductFamilyId.
     * The Chargify id of the product family to which the coupon belongs
     * @return Returns the int
     */
    @JsonGetter("product_family_id")
    public int getProductFamilyId() {
        return productFamilyId;
    }

    /**
     * Setter for ProductFamilyId.
     * The Chargify id of the product family to which the coupon belongs
     * @param productFamilyId Value for int
     */
    @JsonSetter("product_family_id")
    public void setProductFamilyId(int productFamilyId) {
        this.productFamilyId = productFamilyId;
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
     * Getter for FilterDateField.
     * The type of filter you would like to apply to your search. Use in query
     * `filter[date_field]=created_at`.
     * @return Returns the BasicDateField
     */
    @JsonGetter("filter[date_field]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BasicDateField getFilterDateField() {
        return filterDateField;
    }

    /**
     * Setter for FilterDateField.
     * The type of filter you would like to apply to your search. Use in query
     * `filter[date_field]=created_at`.
     * @param filterDateField Value for BasicDateField
     */
    @JsonSetter("filter[date_field]")
    public void setFilterDateField(BasicDateField filterDateField) {
        this.filterDateField = filterDateField;
    }

    /**
     * Getter for FilterEndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns coupons with a
     * timestamp up to and including 11:59:59PM in your site’s time zone on the date specified. Use
     * in query `filter[date_field]=2011-12-15`.
     * @return Returns the String
     */
    @JsonGetter("filter[end_date]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFilterEndDate() {
        return filterEndDate;
    }

    /**
     * Setter for FilterEndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns coupons with a
     * timestamp up to and including 11:59:59PM in your site’s time zone on the date specified. Use
     * in query `filter[date_field]=2011-12-15`.
     * @param filterEndDate Value for String
     */
    @JsonSetter("filter[end_date]")
    public void setFilterEndDate(String filterEndDate) {
        this.filterEndDate = filterEndDate;
    }

    /**
     * Getter for FilterEndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns coupons with a timestamp at or before exact time provided in query. You can specify
     * timezone in query - otherwise your site's time zone will be used. If provided, this parameter
     * will be used instead of end_date. Use in query
     * `?filter[end_datetime]=2011-12-1T10:15:30+01:00`.
     * @return Returns the String
     */
    @JsonGetter("filter[end_datetime]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFilterEndDatetime() {
        return filterEndDatetime;
    }

    /**
     * Setter for FilterEndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns coupons with a timestamp at or before exact time provided in query. You can specify
     * timezone in query - otherwise your site's time zone will be used. If provided, this parameter
     * will be used instead of end_date. Use in query
     * `?filter[end_datetime]=2011-12-1T10:15:30+01:00`.
     * @param filterEndDatetime Value for String
     */
    @JsonSetter("filter[end_datetime]")
    public void setFilterEndDatetime(String filterEndDatetime) {
        this.filterEndDatetime = filterEndDatetime;
    }

    /**
     * Getter for FilterStartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns coupons with
     * a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified. Use in query `filter[start_date]=2011-12-17`.
     * @return Returns the String
     */
    @JsonGetter("filter[start_date]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFilterStartDate() {
        return filterStartDate;
    }

    /**
     * Setter for FilterStartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns coupons with
     * a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified. Use in query `filter[start_date]=2011-12-17`.
     * @param filterStartDate Value for String
     */
    @JsonSetter("filter[start_date]")
    public void setFilterStartDate(String filterStartDate) {
        this.filterStartDate = filterStartDate;
    }

    /**
     * Getter for FilterStartDatetime.
     * The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns coupons with a timestamp at or after exact time provided in query. You can specify
     * timezone in query - otherwise your site's time zone will be used. If provided, this parameter
     * will be used instead of start_date. Use in query
     * `filter[start_datetime]=2011-12-19T10:15:30+01:00`.
     * @return Returns the String
     */
    @JsonGetter("filter[start_datetime]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFilterStartDatetime() {
        return filterStartDatetime;
    }

    /**
     * Setter for FilterStartDatetime.
     * The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns coupons with a timestamp at or after exact time provided in query. You can specify
     * timezone in query - otherwise your site's time zone will be used. If provided, this parameter
     * will be used instead of start_date. Use in query
     * `filter[start_datetime]=2011-12-19T10:15:30+01:00`.
     * @param filterStartDatetime Value for String
     */
    @JsonSetter("filter[start_datetime]")
    public void setFilterStartDatetime(String filterStartDatetime) {
        this.filterStartDatetime = filterStartDatetime;
    }

    /**
     * Getter for FilterIds.
     * Allows fetching coupons with matching id based on provided values. Use in query
     * `filter[ids]=1,2,3`.
     * @return Returns the List of Integer
     */
    @JsonGetter("filter[ids]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getFilterIds() {
        return filterIds;
    }

    /**
     * Setter for FilterIds.
     * Allows fetching coupons with matching id based on provided values. Use in query
     * `filter[ids]=1,2,3`.
     * @param filterIds Value for List of Integer
     */
    @JsonSetter("filter[ids]")
    public void setFilterIds(List<Integer> filterIds) {
        this.filterIds = filterIds;
    }

    /**
     * Getter for FilterCodes.
     * Allows fetching coupons with matching codes based on provided values. Use in query
     * `filter[codes]=free,free_trial`.
     * @return Returns the List of String
     */
    @JsonGetter("filter[codes]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getFilterCodes() {
        return filterCodes;
    }

    /**
     * Setter for FilterCodes.
     * Allows fetching coupons with matching codes based on provided values. Use in query
     * `filter[codes]=free,free_trial`.
     * @param filterCodes Value for List of String
     */
    @JsonSetter("filter[codes]")
    public void setFilterCodes(List<String> filterCodes) {
        this.filterCodes = filterCodes;
    }

    /**
     * Getter for CurrencyPrices.
     * When fetching coupons, if you have defined multiple currencies at the site level, you can
     * optionally pass the `?currency_prices=true` query param to include an array of currency price
     * data in the response. Use in query `currency_prices=true`.
     * @return Returns the Boolean
     */
    @JsonGetter("currency_prices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getCurrencyPrices() {
        return currencyPrices;
    }

    /**
     * Setter for CurrencyPrices.
     * When fetching coupons, if you have defined multiple currencies at the site level, you can
     * optionally pass the `?currency_prices=true` query param to include an array of currency price
     * data in the response. Use in query `currency_prices=true`.
     * @param currencyPrices Value for Boolean
     */
    @JsonSetter("currency_prices")
    public void setCurrencyPrices(Boolean currencyPrices) {
        this.currencyPrices = currencyPrices;
    }

    /**
     * Getter for FilterUseSiteExchangeRate.
     * Allows fetching coupons with matching use_site_exchange_rate based on provided value. Use in
     * query `filter[use_site_exchange_rate]=true`.
     * @return Returns the Boolean
     */
    @JsonGetter("filter[use_site_exchange_rate]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getFilterUseSiteExchangeRate() {
        return filterUseSiteExchangeRate;
    }

    /**
     * Setter for FilterUseSiteExchangeRate.
     * Allows fetching coupons with matching use_site_exchange_rate based on provided value. Use in
     * query `filter[use_site_exchange_rate]=true`.
     * @param filterUseSiteExchangeRate Value for Boolean
     */
    @JsonSetter("filter[use_site_exchange_rate]")
    public void setFilterUseSiteExchangeRate(Boolean filterUseSiteExchangeRate) {
        this.filterUseSiteExchangeRate = filterUseSiteExchangeRate;
    }

    /**
     * Converts this ListCouponsForProductFamilyInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListCouponsForProductFamilyInput [" + "productFamilyId=" + productFamilyId
                + ", page=" + page + ", perPage=" + perPage + ", filterDateField=" + filterDateField
                + ", filterEndDate=" + filterEndDate + ", filterEndDatetime=" + filterEndDatetime
                + ", filterStartDate=" + filterStartDate + ", filterStartDatetime="
                + filterStartDatetime + ", filterIds=" + filterIds + ", filterCodes=" + filterCodes
                + ", currencyPrices=" + currencyPrices + ", filterUseSiteExchangeRate="
                + filterUseSiteExchangeRate + "]";
    }

    /**
     * Builds a new {@link ListCouponsForProductFamilyInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListCouponsForProductFamilyInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(productFamilyId)
                .page(getPage())
                .perPage(getPerPage())
                .filterDateField(getFilterDateField())
                .filterEndDate(getFilterEndDate())
                .filterEndDatetime(getFilterEndDatetime())
                .filterStartDate(getFilterStartDate())
                .filterStartDatetime(getFilterStartDatetime())
                .filterIds(getFilterIds())
                .filterCodes(getFilterCodes())
                .currencyPrices(getCurrencyPrices())
                .filterUseSiteExchangeRate(getFilterUseSiteExchangeRate());
        return builder;
    }

    /**
     * Class to build instances of {@link ListCouponsForProductFamilyInput}.
     */
    public static class Builder {
        private int productFamilyId;
        private Integer page = 1;
        private Integer perPage = 30;
        private BasicDateField filterDateField;
        private String filterEndDate;
        private String filterEndDatetime;
        private String filterStartDate;
        private String filterStartDatetime;
        private List<Integer> filterIds;
        private List<String> filterCodes;
        private Boolean currencyPrices;
        private Boolean filterUseSiteExchangeRate;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  productFamilyId  int value for productFamilyId.
         */
        public Builder(int productFamilyId) {
            this.productFamilyId = productFamilyId;
        }

        /**
         * Setter for productFamilyId.
         * @param  productFamilyId  int value for productFamilyId.
         * @return Builder
         */
        public Builder productFamilyId(int productFamilyId) {
            this.productFamilyId = productFamilyId;
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
         * Setter for filterDateField.
         * @param  filterDateField  BasicDateField value for filterDateField.
         * @return Builder
         */
        public Builder filterDateField(BasicDateField filterDateField) {
            this.filterDateField = filterDateField;
            return this;
        }

        /**
         * Setter for filterEndDate.
         * @param  filterEndDate  String value for filterEndDate.
         * @return Builder
         */
        public Builder filterEndDate(String filterEndDate) {
            this.filterEndDate = filterEndDate;
            return this;
        }

        /**
         * Setter for filterEndDatetime.
         * @param  filterEndDatetime  String value for filterEndDatetime.
         * @return Builder
         */
        public Builder filterEndDatetime(String filterEndDatetime) {
            this.filterEndDatetime = filterEndDatetime;
            return this;
        }

        /**
         * Setter for filterStartDate.
         * @param  filterStartDate  String value for filterStartDate.
         * @return Builder
         */
        public Builder filterStartDate(String filterStartDate) {
            this.filterStartDate = filterStartDate;
            return this;
        }

        /**
         * Setter for filterStartDatetime.
         * @param  filterStartDatetime  String value for filterStartDatetime.
         * @return Builder
         */
        public Builder filterStartDatetime(String filterStartDatetime) {
            this.filterStartDatetime = filterStartDatetime;
            return this;
        }

        /**
         * Setter for filterIds.
         * @param  filterIds  List of Integer value for filterIds.
         * @return Builder
         */
        public Builder filterIds(List<Integer> filterIds) {
            this.filterIds = filterIds;
            return this;
        }

        /**
         * Setter for filterCodes.
         * @param  filterCodes  List of String value for filterCodes.
         * @return Builder
         */
        public Builder filterCodes(List<String> filterCodes) {
            this.filterCodes = filterCodes;
            return this;
        }

        /**
         * Setter for currencyPrices.
         * @param  currencyPrices  Boolean value for currencyPrices.
         * @return Builder
         */
        public Builder currencyPrices(Boolean currencyPrices) {
            this.currencyPrices = currencyPrices;
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
         * Builds a new {@link ListCouponsForProductFamilyInput} object using the set fields.
         * @return {@link ListCouponsForProductFamilyInput}
         */
        public ListCouponsForProductFamilyInput build() {
            return new ListCouponsForProductFamilyInput(productFamilyId, page, perPage,
                    filterDateField, filterEndDate, filterEndDatetime, filterStartDate,
                    filterStartDatetime, filterIds, filterCodes, currencyPrices,
                    filterUseSiteExchangeRate);
        }
    }
}
