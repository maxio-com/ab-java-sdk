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
 * This is a model class for ListCouponSubcodesInput type.
 */
public class ListCouponSubcodesInput {
    private int couponId;
    private Integer page;
    private Integer perPage;

    /**
     * Default constructor.
     */
    public ListCouponSubcodesInput() {
        page = 1;
        perPage = 20;
    }

    /**
     * Initialization constructor.
     * @param  couponId  int value for couponId.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     */
    public ListCouponSubcodesInput(
            int couponId,
            Integer page,
            Integer perPage) {
        this.couponId = couponId;
        this.page = page;
        this.perPage = perPage;
    }

    /**
     * Getter for CouponId.
     * The Chargify id of the coupon
     * @return Returns the int
     */
    @JsonGetter("coupon_id")
    public int getCouponId() {
        return couponId;
    }

    /**
     * Setter for CouponId.
     * The Chargify id of the coupon
     * @param couponId Value for int
     */
    @JsonSetter("coupon_id")
    public void setCouponId(int couponId) {
        this.couponId = couponId;
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
     * Converts this ListCouponSubcodesInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListCouponSubcodesInput [" + "couponId=" + couponId + ", page=" + page
                + ", perPage=" + perPage + "]";
    }

    /**
     * Builds a new {@link ListCouponSubcodesInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListCouponSubcodesInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(couponId)
                .page(getPage())
                .perPage(getPerPage());
        return builder;
    }

    /**
     * Class to build instances of {@link ListCouponSubcodesInput}.
     */
    public static class Builder {
        private int couponId;
        private Integer page = 1;
        private Integer perPage = 20;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  couponId  int value for couponId.
         */
        public Builder(int couponId) {
            this.couponId = couponId;
        }

        /**
         * Setter for couponId.
         * @param  couponId  int value for couponId.
         * @return Builder
         */
        public Builder couponId(int couponId) {
            this.couponId = couponId;
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
         * Builds a new {@link ListCouponSubcodesInput} object using the set fields.
         * @return {@link ListCouponSubcodesInput}
         */
        public ListCouponSubcodesInput build() {
            return new ListCouponSubcodesInput(couponId, page, perPage);
        }
    }
}
