/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for CurrencyPrice type.
 */
public class CurrencyPrice
        extends BaseModel {
    private Integer id;
    private String currency;
    private Double price;
    private String formattedPrice;
    private Integer priceId;
    private Integer pricePointId;
    private Integer productPricePointId;
    private CurrencyPriceRole role;

    /**
     * Default constructor.
     */
    public CurrencyPrice() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  currency  String value for currency.
     * @param  price  Double value for price.
     * @param  formattedPrice  String value for formattedPrice.
     * @param  priceId  Integer value for priceId.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  productPricePointId  Integer value for productPricePointId.
     * @param  role  CurrencyPriceRole value for role.
     */
    public CurrencyPrice(
            Integer id,
            String currency,
            Double price,
            String formattedPrice,
            Integer priceId,
            Integer pricePointId,
            Integer productPricePointId,
            CurrencyPriceRole role) {
        this.id = id;
        this.currency = currency;
        this.price = price;
        this.formattedPrice = formattedPrice;
        this.priceId = priceId;
        this.pricePointId = pricePointId;
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
     * @return Returns the Double
     */
    @JsonGetter("price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getPrice() {
        return price;
    }

    /**
     * Setter for Price.
     * @param price Value for Double
     */
    @JsonSetter("price")
    public void setPrice(Double price) {
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
     * Getter for PriceId.
     * @return Returns the Integer
     */
    @JsonGetter("price_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPriceId() {
        return priceId;
    }

    /**
     * Setter for PriceId.
     * @param priceId Value for Integer
     */
    @JsonSetter("price_id")
    public void setPriceId(Integer priceId) {
        this.priceId = priceId;
    }

    /**
     * Getter for PricePointId.
     * @return Returns the Integer
     */
    @JsonGetter("price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPricePointId() {
        return pricePointId;
    }

    /**
     * Setter for PricePointId.
     * @param pricePointId Value for Integer
     */
    @JsonSetter("price_point_id")
    public void setPricePointId(Integer pricePointId) {
        this.pricePointId = pricePointId;
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
     * Converts this CurrencyPrice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CurrencyPrice [" + "id=" + id + ", currency=" + currency + ", price=" + price
                + ", formattedPrice=" + formattedPrice + ", priceId=" + priceId + ", pricePointId="
                + pricePointId + ", productPricePointId=" + productPricePointId + ", role=" + role
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CurrencyPrice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CurrencyPrice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .currency(getCurrency())
                .price(getPrice())
                .formattedPrice(getFormattedPrice())
                .priceId(getPriceId())
                .pricePointId(getPricePointId())
                .productPricePointId(getProductPricePointId())
                .role(getRole());
        return builder;
    }

    /**
     * Class to build instances of {@link CurrencyPrice}.
     */
    public static class Builder {
        private Integer id;
        private String currency;
        private Double price;
        private String formattedPrice;
        private Integer priceId;
        private Integer pricePointId;
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
         * @param  price  Double value for price.
         * @return Builder
         */
        public Builder price(Double price) {
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
         * Setter for priceId.
         * @param  priceId  Integer value for priceId.
         * @return Builder
         */
        public Builder priceId(Integer priceId) {
            this.priceId = priceId;
            return this;
        }

        /**
         * Setter for pricePointId.
         * @param  pricePointId  Integer value for pricePointId.
         * @return Builder
         */
        public Builder pricePointId(Integer pricePointId) {
            this.pricePointId = pricePointId;
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
         * Builds a new {@link CurrencyPrice} object using the set fields.
         * @return {@link CurrencyPrice}
         */
        public CurrencyPrice build() {
            return new CurrencyPrice(id, currency, price, formattedPrice, priceId, pricePointId,
                    productPricePointId, role);
        }
    }
}
