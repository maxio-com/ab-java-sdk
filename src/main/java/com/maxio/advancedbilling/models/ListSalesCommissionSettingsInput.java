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
 * This is a model class for ListSalesCommissionSettingsInput type.
 */
public class ListSalesCommissionSettingsInput {
    private String sellerId;
    private String authorization;
    private Boolean liveMode;
    private Integer page;
    private Integer perPage;

    /**
     * Default constructor.
     */
    public ListSalesCommissionSettingsInput() {
        authorization = "Bearer <<apiKey>>";
        page = 1;
        perPage = 100;
    }

    /**
     * Initialization constructor.
     * @param  sellerId  String value for sellerId.
     * @param  authorization  String value for authorization.
     * @param  liveMode  Boolean value for liveMode.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     */
    public ListSalesCommissionSettingsInput(
            String sellerId,
            String authorization,
            Boolean liveMode,
            Integer page,
            Integer perPage) {
        this.sellerId = sellerId;
        this.authorization = authorization;
        this.liveMode = liveMode;
        this.page = page;
        this.perPage = perPage;
    }

    /**
     * Getter for SellerId.
     * The Chargify id of your seller account
     * @return Returns the String
     */
    @JsonGetter("seller_id")
    public String getSellerId() {
        return sellerId;
    }

    /**
     * Setter for SellerId.
     * The Chargify id of your seller account
     * @param sellerId Value for String
     */
    @JsonSetter("seller_id")
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * Getter for Authorization.
     * For authorization use user API key. See details
     * [here](https://developers.chargify.com/docs/developer-docs/ZG9jOjMyNzk5NTg0-2020-04-20-new-api-authentication).
     * @return Returns the String
     */
    @JsonGetter("Authorization")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAuthorization() {
        return authorization;
    }

    /**
     * Setter for Authorization.
     * For authorization use user API key. See details
     * [here](https://developers.chargify.com/docs/developer-docs/ZG9jOjMyNzk5NTg0-2020-04-20-new-api-authentication).
     * @param authorization Value for String
     */
    @JsonSetter("Authorization")
    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    /**
     * Getter for LiveMode.
     * This parameter indicates if records should be fetched from live mode sites. Default value is
     * true.
     * @return Returns the Boolean
     */
    @JsonGetter("live_mode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getLiveMode() {
        return liveMode;
    }

    /**
     * Setter for LiveMode.
     * This parameter indicates if records should be fetched from live mode sites. Default value is
     * true.
     * @param liveMode Value for Boolean
     */
    @JsonSetter("live_mode")
    public void setLiveMode(Boolean liveMode) {
        this.liveMode = liveMode;
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
     * This parameter indicates how many records to fetch in each request. Default value is 100.
     * @return Returns the Integer
     */
    @JsonGetter("per_page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPerPage() {
        return perPage;
    }

    /**
     * Setter for PerPage.
     * This parameter indicates how many records to fetch in each request. Default value is 100.
     * @param perPage Value for Integer
     */
    @JsonSetter("per_page")
    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    /**
     * Converts this ListSalesCommissionSettingsInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListSalesCommissionSettingsInput [" + "sellerId=" + sellerId + ", authorization="
                + authorization + ", liveMode=" + liveMode + ", page=" + page + ", perPage="
                + perPage + "]";
    }

    /**
     * Builds a new {@link ListSalesCommissionSettingsInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListSalesCommissionSettingsInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(sellerId)
                .authorization(getAuthorization())
                .liveMode(getLiveMode())
                .page(getPage())
                .perPage(getPerPage());
        return builder;
    }

    /**
     * Class to build instances of {@link ListSalesCommissionSettingsInput}.
     */
    public static class Builder {
        private String sellerId;
        private String authorization = "Bearer <<apiKey>>";
        private Boolean liveMode;
        private Integer page = 1;
        private Integer perPage = 100;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  sellerId  String value for sellerId.
         */
        public Builder(String sellerId) {
            this.sellerId = sellerId;
        }

        /**
         * Setter for sellerId.
         * @param  sellerId  String value for sellerId.
         * @return Builder
         */
        public Builder sellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }

        /**
         * Setter for authorization.
         * @param  authorization  String value for authorization.
         * @return Builder
         */
        public Builder authorization(String authorization) {
            this.authorization = authorization;
            return this;
        }

        /**
         * Setter for liveMode.
         * @param  liveMode  Boolean value for liveMode.
         * @return Builder
         */
        public Builder liveMode(Boolean liveMode) {
            this.liveMode = liveMode;
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
         * Builds a new {@link ListSalesCommissionSettingsInput} object using the set fields.
         * @return {@link ListSalesCommissionSettingsInput}
         */
        public ListSalesCommissionSettingsInput build() {
            return new ListSalesCommissionSettingsInput(sellerId, authorization, liveMode, page,
                    perPage);
        }
    }
}
