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
 * This is a model class for ListMRRResponseResult type.
 */
public class ListMRRResponseResult {
    private Integer page;
    private Integer perPage;
    private Integer totalPages;
    private Integer totalEntries;
    private String currency;
    private String currencySymbol;
    private List<Movement> movements;

    /**
     * Default constructor.
     */
    public ListMRRResponseResult() {
    }

    /**
     * Initialization constructor.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  totalPages  Integer value for totalPages.
     * @param  totalEntries  Integer value for totalEntries.
     * @param  currency  String value for currency.
     * @param  currencySymbol  String value for currencySymbol.
     * @param  movements  List of Movement value for movements.
     */
    public ListMRRResponseResult(
            Integer page,
            Integer perPage,
            Integer totalPages,
            Integer totalEntries,
            String currency,
            String currencySymbol,
            List<Movement> movements) {
        this.page = page;
        this.perPage = perPage;
        this.totalPages = totalPages;
        this.totalEntries = totalEntries;
        this.currency = currency;
        this.currencySymbol = currencySymbol;
        this.movements = movements;
    }

    /**
     * Getter for Page.
     * @return Returns the Integer
     */
    @JsonGetter("page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPage() {
        return page;
    }

    /**
     * Setter for Page.
     * @param page Value for Integer
     */
    @JsonSetter("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * Getter for PerPage.
     * @return Returns the Integer
     */
    @JsonGetter("per_page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPerPage() {
        return perPage;
    }

    /**
     * Setter for PerPage.
     * @param perPage Value for Integer
     */
    @JsonSetter("per_page")
    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    /**
     * Getter for TotalPages.
     * @return Returns the Integer
     */
    @JsonGetter("total_pages")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * Setter for TotalPages.
     * @param totalPages Value for Integer
     */
    @JsonSetter("total_pages")
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * Getter for TotalEntries.
     * @return Returns the Integer
     */
    @JsonGetter("total_entries")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalEntries() {
        return totalEntries;
    }

    /**
     * Setter for TotalEntries.
     * @param totalEntries Value for Integer
     */
    @JsonSetter("total_entries")
    public void setTotalEntries(Integer totalEntries) {
        this.totalEntries = totalEntries;
    }

    /**
     * Getter for Currency.
     * @return Returns the String
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for CurrencySymbol.
     * @return Returns the String
     */
    @JsonGetter("currency_symbol")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    /**
     * Setter for CurrencySymbol.
     * @param currencySymbol Value for String
     */
    @JsonSetter("currency_symbol")
    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    /**
     * Getter for Movements.
     * @return Returns the List of Movement
     */
    @JsonGetter("movements")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Movement> getMovements() {
        return movements;
    }

    /**
     * Setter for Movements.
     * @param movements Value for List of Movement
     */
    @JsonSetter("movements")
    public void setMovements(List<Movement> movements) {
        this.movements = movements;
    }

    /**
     * Converts this ListMRRResponseResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListMRRResponseResult [" + "page=" + page + ", perPage=" + perPage + ", totalPages="
                + totalPages + ", totalEntries=" + totalEntries + ", currency=" + currency
                + ", currencySymbol=" + currencySymbol + ", movements=" + movements + "]";
    }

    /**
     * Builds a new {@link ListMRRResponseResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListMRRResponseResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .page(getPage())
                .perPage(getPerPage())
                .totalPages(getTotalPages())
                .totalEntries(getTotalEntries())
                .currency(getCurrency())
                .currencySymbol(getCurrencySymbol())
                .movements(getMovements());
        return builder;
    }

    /**
     * Class to build instances of {@link ListMRRResponseResult}.
     */
    public static class Builder {
        private Integer page;
        private Integer perPage;
        private Integer totalPages;
        private Integer totalEntries;
        private String currency;
        private String currencySymbol;
        private List<Movement> movements;



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
         * Setter for totalPages.
         * @param  totalPages  Integer value for totalPages.
         * @return Builder
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        /**
         * Setter for totalEntries.
         * @param  totalEntries  Integer value for totalEntries.
         * @return Builder
         */
        public Builder totalEntries(Integer totalEntries) {
            this.totalEntries = totalEntries;
            return this;
        }

        /**
         * Setter for currency.
         * @param  currency  String value for currency.
         * @return Builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Setter for currencySymbol.
         * @param  currencySymbol  String value for currencySymbol.
         * @return Builder
         */
        public Builder currencySymbol(String currencySymbol) {
            this.currencySymbol = currencySymbol;
            return this;
        }

        /**
         * Setter for movements.
         * @param  movements  List of Movement value for movements.
         * @return Builder
         */
        public Builder movements(List<Movement> movements) {
            this.movements = movements;
            return this;
        }

        /**
         * Builds a new {@link ListMRRResponseResult} object using the set fields.
         * @return {@link ListMRRResponseResult}
         */
        public ListMRRResponseResult build() {
            return new ListMRRResponseResult(page, perPage, totalPages, totalEntries, currency,
                    currencySymbol, movements);
        }
    }
}
