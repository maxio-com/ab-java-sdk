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
 * This is a model class for CouponCurrency type.
 */
public class CouponCurrency {
    private Integer id;
    private String currency;
    private Integer price;
    private Integer couponId;

    /**
     * Default constructor.
     */
    public CouponCurrency() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  currency  String value for currency.
     * @param  price  Integer value for price.
     * @param  couponId  Integer value for couponId.
     */
    public CouponCurrency(
            Integer id,
            String currency,
            Integer price,
            Integer couponId) {
        this.id = id;
        this.currency = currency;
        this.price = price;
        this.couponId = couponId;
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
     * Getter for CouponId.
     * @return Returns the Integer
     */
    @JsonGetter("coupon_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCouponId() {
        return couponId;
    }

    /**
     * Setter for CouponId.
     * @param couponId Value for Integer
     */
    @JsonSetter("coupon_id")
    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    /**
     * Converts this CouponCurrency into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CouponCurrency [" + "id=" + id + ", currency=" + currency + ", price=" + price
                + ", couponId=" + couponId + "]";
    }

    /**
     * Builds a new {@link CouponCurrency.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CouponCurrency.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .currency(getCurrency())
                .price(getPrice())
                .couponId(getCouponId());
        return builder;
    }

    /**
     * Class to build instances of {@link CouponCurrency}.
     */
    public static class Builder {
        private Integer id;
        private String currency;
        private Integer price;
        private Integer couponId;



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
         * Setter for couponId.
         * @param  couponId  Integer value for couponId.
         * @return Builder
         */
        public Builder couponId(Integer couponId) {
            this.couponId = couponId;
            return this;
        }

        /**
         * Builds a new {@link CouponCurrency} object using the set fields.
         * @return {@link CouponCurrency}
         */
        public CouponCurrency build() {
            return new CouponCurrency(id, currency, price, couponId);
        }
    }
}
