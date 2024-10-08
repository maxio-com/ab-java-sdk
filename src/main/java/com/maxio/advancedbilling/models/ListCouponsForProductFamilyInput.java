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
 * This is a model class for ListCouponsForProductFamilyInput type.
 */
public class ListCouponsForProductFamilyInput {
    private int productFamilyId;
    private Integer page;
    private Integer perPage;
    private ListCouponsFilter filter;
    private Boolean currencyPrices;

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
     * @param  filter  ListCouponsFilter value for filter.
     * @param  currencyPrices  Boolean value for currencyPrices.
     */
    public ListCouponsForProductFamilyInput(
            int productFamilyId,
            Integer page,
            Integer perPage,
            ListCouponsFilter filter,
            Boolean currencyPrices) {
        this.productFamilyId = productFamilyId;
        this.page = page;
        this.perPage = perPage;
        this.filter = filter;
        this.currencyPrices = currencyPrices;
    }

    /**
     * Getter for ProductFamilyId.
     * The Advanced Billing id of the product family to which the coupon belongs
     * @return Returns the int
     */
    @JsonGetter("product_family_id")
    public int getProductFamilyId() {
        return productFamilyId;
    }

    /**
     * Setter for ProductFamilyId.
     * The Advanced Billing id of the product family to which the coupon belongs
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
     * Getter for Filter.
     * Filter to use for List Coupons operations
     * @return Returns the ListCouponsFilter
     */
    @JsonGetter("filter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListCouponsFilter getFilter() {
        return filter;
    }

    /**
     * Setter for Filter.
     * Filter to use for List Coupons operations
     * @param filter Value for ListCouponsFilter
     */
    @JsonSetter("filter")
    public void setFilter(ListCouponsFilter filter) {
        this.filter = filter;
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
     * Converts this ListCouponsForProductFamilyInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListCouponsForProductFamilyInput [" + "productFamilyId=" + productFamilyId
                + ", page=" + page + ", perPage=" + perPage + ", filter=" + filter
                + ", currencyPrices=" + currencyPrices + "]";
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
                .filter(getFilter())
                .currencyPrices(getCurrencyPrices());
        return builder;
    }

    /**
     * Class to build instances of {@link ListCouponsForProductFamilyInput}.
     */
    public static class Builder {
        private int productFamilyId;
        private Integer page = 1;
        private Integer perPage = 30;
        private ListCouponsFilter filter;
        private Boolean currencyPrices;

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
         * Setter for filter.
         * @param  filter  ListCouponsFilter value for filter.
         * @return Builder
         */
        public Builder filter(ListCouponsFilter filter) {
            this.filter = filter;
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
         * Builds a new {@link ListCouponsForProductFamilyInput} object using the set fields.
         * @return {@link ListCouponsForProductFamilyInput}
         */
        public ListCouponsForProductFamilyInput build() {
            return new ListCouponsForProductFamilyInput(productFamilyId, page, perPage, filter,
                    currencyPrices);
        }
    }
}
