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
 * This is a model class for ProductPricePointCurrencyPrice type.
 */
public class ProductPricePointCurrencyPrice {
    private Integer id;
    private String currency;
    private Integer price;
    private String formattedPrice;
    private Integer productPricePointId;
    private CurrencyPriceRole role;

    /**
     * Default constructor.
     */
    public ProductPricePointCurrencyPrice() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  currency  String value for currency.
     * @param  price  Integer value for price.
     * @param  formattedPrice  String value for formattedPrice.
     * @param  productPricePointId  Integer value for productPricePointId.
     * @param  role  CurrencyPriceRole value for role.
     */
    public ProductPricePointCurrencyPrice(
            Integer id,
            String currency,
            Integer price,
            String formattedPrice,
            Integer productPricePointId,
            CurrencyPriceRole role) {
        this.id = id;
        this.currency = currency;
        this.price = price;
        this.formattedPrice = formattedPrice;
        this.productPricePointId = productPricePointId;
        this.role = role;
    }

    /**
     * Getter for Id.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
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
     * Getter for Price.
     * @return Returns the Integer
     */
    @JsonGetter("price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPrice() {
        return price;
    }

    /**
     * Setter for Price.
     * @param price Value for Integer
     */
    @JsonSetter("price")
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * Getter for FormattedPrice.
     * @return Returns the String
     */
    @JsonGetter("formatted_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFormattedPrice() {
        return formattedPrice;
    }

    /**
     * Setter for FormattedPrice.
     * @param formattedPrice Value for String
     */
    @JsonSetter("formatted_price")
    public void setFormattedPrice(String formattedPrice) {
        this.formattedPrice = formattedPrice;
    }

    /**
     * Getter for ProductPricePointId.
     * @return Returns the Integer
     */
    @JsonGetter("product_price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductPricePointId() {
        return productPricePointId;
    }

    /**
     * Setter for ProductPricePointId.
     * @param productPricePointId Value for Integer
     */
    @JsonSetter("product_price_point_id")
    public void setProductPricePointId(Integer productPricePointId) {
        this.productPricePointId = productPricePointId;
    }

    /**
     * Getter for Role.
     * Role for the price.
     * @return Returns the CurrencyPriceRole
     */
    @JsonGetter("role")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CurrencyPriceRole getRole() {
        return role;
    }

    /**
     * Setter for Role.
     * Role for the price.
     * @param role Value for CurrencyPriceRole
     */
    @JsonSetter("role")
    public void setRole(CurrencyPriceRole role) {
        this.role = role;
    }

    /**
     * Converts this ProductPricePointCurrencyPrice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProductPricePointCurrencyPrice [" + "id=" + id + ", currency=" + currency
                + ", price=" + price + ", formattedPrice=" + formattedPrice
                + ", productPricePointId=" + productPricePointId + ", role=" + role + "]";
    }

    /**
     * Builds a new {@link ProductPricePointCurrencyPrice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProductPricePointCurrencyPrice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .currency(getCurrency())
                .price(getPrice())
                .formattedPrice(getFormattedPrice())
                .productPricePointId(getProductPricePointId())
                .role(getRole());
        return builder;
    }

    /**
     * Class to build instances of {@link ProductPricePointCurrencyPrice}.
     */
    public static class Builder {
        private Integer id;
        private String currency;
        private Integer price;
        private String formattedPrice;
        private Integer productPricePointId;
        private CurrencyPriceRole role;



        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
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
         * Setter for price.
         * @param  price  Integer value for price.
         * @return Builder
         */
        public Builder price(Integer price) {
            this.price = price;
            return this;
        }

        /**
         * Setter for formattedPrice.
         * @param  formattedPrice  String value for formattedPrice.
         * @return Builder
         */
        public Builder formattedPrice(String formattedPrice) {
            this.formattedPrice = formattedPrice;
            return this;
        }

        /**
         * Setter for productPricePointId.
         * @param  productPricePointId  Integer value for productPricePointId.
         * @return Builder
         */
        public Builder productPricePointId(Integer productPricePointId) {
            this.productPricePointId = productPricePointId;
            return this;
        }

        /**
         * Setter for role.
         * @param  role  CurrencyPriceRole value for role.
         * @return Builder
         */
        public Builder role(CurrencyPriceRole role) {
            this.role = role;
            return this;
        }

        /**
         * Builds a new {@link ProductPricePointCurrencyPrice} object using the set fields.
         * @return {@link ProductPricePointCurrencyPrice}
         */
        public ProductPricePointCurrencyPrice build() {
            return new ProductPricePointCurrencyPrice(id, currency, price, formattedPrice,
                    productPricePointId, role);
        }
    }
}
