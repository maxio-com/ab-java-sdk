/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.ListProductPricePointsInputProductId;
import java.util.List;

/**
 * This is a model class for ListProductPricePointsInput type.
 */
public class ListProductPricePointsInput {
    private ListProductPricePointsInputProductId productId;
    private Integer page;
    private Integer perPage;
    private Boolean currencyPrices;
    private List<PricePointType> filterType;
    private Boolean archived;

    /**
     * Default constructor.
     */
    public ListProductPricePointsInput() {
        page = 1;
        perPage = 10;
    }

    /**
     * Initialization constructor.
     * @param  productId  ListProductPricePointsInputProductId value for productId.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  currencyPrices  Boolean value for currencyPrices.
     * @param  filterType  List of PricePointType value for filterType.
     * @param  archived  Boolean value for archived.
     */
    public ListProductPricePointsInput(
            ListProductPricePointsInputProductId productId,
            Integer page,
            Integer perPage,
            Boolean currencyPrices,
            List<PricePointType> filterType,
            Boolean archived) {
        this.productId = productId;
        this.page = page;
        this.perPage = perPage;
        this.currencyPrices = currencyPrices;
        this.filterType = filterType;
        this.archived = archived;
    }

    /**
     * Getter for ProductId.
     * The id or handle of the product. When using the handle, it must be prefixed with `handle:`
     * @return Returns the ListProductPricePointsInputProductId
     */
    @JsonGetter("product_id")
    public ListProductPricePointsInputProductId getProductId() {
        return productId;
    }

    /**
     * Setter for ProductId.
     * The id or handle of the product. When using the handle, it must be prefixed with `handle:`
     * @param productId Value for ListProductPricePointsInputProductId
     */
    @JsonSetter("product_id")
    public void setProductId(ListProductPricePointsInputProductId productId) {
        this.productId = productId;
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
     * This parameter indicates how many records to fetch in each request. Default value is 10. The
     * maximum allowed values is 200; any per_page value over 200 will be changed to 200.
     * @return Returns the Integer
     */
    @JsonGetter("per_page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPerPage() {
        return perPage;
    }

    /**
     * Setter for PerPage.
     * This parameter indicates how many records to fetch in each request. Default value is 10. The
     * maximum allowed values is 200; any per_page value over 200 will be changed to 200.
     * @param perPage Value for Integer
     */
    @JsonSetter("per_page")
    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    /**
     * Getter for CurrencyPrices.
     * When fetching a product's price points, if you have defined multiple currencies at the site
     * level, you can optionally pass the ?currency_prices=true query param to include an array of
     * currency price data in the response. If the product price point is set to
     * use_site_exchange_rate: true, it will return pricing based on the current exchange rate. If
     * the flag is set to false, it will return all of the defined prices for each currency.
     * @return Returns the Boolean
     */
    @JsonGetter("currency_prices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getCurrencyPrices() {
        return currencyPrices;
    }

    /**
     * Setter for CurrencyPrices.
     * When fetching a product's price points, if you have defined multiple currencies at the site
     * level, you can optionally pass the ?currency_prices=true query param to include an array of
     * currency price data in the response. If the product price point is set to
     * use_site_exchange_rate: true, it will return pricing based on the current exchange rate. If
     * the flag is set to false, it will return all of the defined prices for each currency.
     * @param currencyPrices Value for Boolean
     */
    @JsonSetter("currency_prices")
    public void setCurrencyPrices(Boolean currencyPrices) {
        this.currencyPrices = currencyPrices;
    }

    /**
     * Getter for FilterType.
     * Use in query: `filter[type]=catalog,default`.
     * @return Returns the List of PricePointType
     */
    @JsonGetter("filter[type]")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PricePointType> getFilterType() {
        return filterType;
    }

    /**
     * Setter for FilterType.
     * Use in query: `filter[type]=catalog,default`.
     * @param filterType Value for List of PricePointType
     */
    @JsonSetter("filter[type]")
    public void setFilterType(List<PricePointType> filterType) {
        this.filterType = filterType;
    }

    /**
     * Getter for Archived.
     * Set to include archived price points in the response.
     * @return Returns the Boolean
     */
    @JsonGetter("archived")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getArchived() {
        return archived;
    }

    /**
     * Setter for Archived.
     * Set to include archived price points in the response.
     * @param archived Value for Boolean
     */
    @JsonSetter("archived")
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    /**
     * Converts this ListProductPricePointsInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListProductPricePointsInput [" + "productId=" + productId + ", page=" + page
                + ", perPage=" + perPage + ", currencyPrices=" + currencyPrices + ", filterType="
                + filterType + ", archived=" + archived + "]";
    }

    /**
     * Builds a new {@link ListProductPricePointsInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListProductPricePointsInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(productId)
                .page(getPage())
                .perPage(getPerPage())
                .currencyPrices(getCurrencyPrices())
                .filterType(getFilterType())
                .archived(getArchived());
        return builder;
    }

    /**
     * Class to build instances of {@link ListProductPricePointsInput}.
     */
    public static class Builder {
        private ListProductPricePointsInputProductId productId;
        private Integer page = 1;
        private Integer perPage = 10;
        private Boolean currencyPrices;
        private List<PricePointType> filterType;
        private Boolean archived;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  productId  ListProductPricePointsInputProductId value for productId.
         */
        public Builder(ListProductPricePointsInputProductId productId) {
            this.productId = productId;
        }

        /**
         * Setter for productId.
         * @param  productId  ListProductPricePointsInputProductId value for productId.
         * @return Builder
         */
        public Builder productId(ListProductPricePointsInputProductId productId) {
            this.productId = productId;
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
         * Setter for currencyPrices.
         * @param  currencyPrices  Boolean value for currencyPrices.
         * @return Builder
         */
        public Builder currencyPrices(Boolean currencyPrices) {
            this.currencyPrices = currencyPrices;
            return this;
        }

        /**
         * Setter for filterType.
         * @param  filterType  List of PricePointType value for filterType.
         * @return Builder
         */
        public Builder filterType(List<PricePointType> filterType) {
            this.filterType = filterType;
            return this;
        }

        /**
         * Setter for archived.
         * @param  archived  Boolean value for archived.
         * @return Builder
         */
        public Builder archived(Boolean archived) {
            this.archived = archived;
            return this;
        }

        /**
         * Builds a new {@link ListProductPricePointsInput} object using the set fields.
         * @return {@link ListProductPricePointsInput}
         */
        public ListProductPricePointsInput build() {
            return new ListProductPricePointsInput(productId, page, perPage, currencyPrices,
                    filterType, archived);
        }
    }
}
