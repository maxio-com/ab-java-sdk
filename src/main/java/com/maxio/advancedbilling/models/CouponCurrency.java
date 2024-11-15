/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for CouponCurrency type.
 */
public class CouponCurrency
        extends BaseModel {
    private OptionalNullable<Integer> id;
    private String currency;
    private OptionalNullable<Double> price;
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
     * @param  price  Double value for price.
     * @param  couponId  Integer value for couponId.
     */
    public CouponCurrency(
            Integer id,
            String currency,
            Double price,
            Integer couponId) {
        this.id = OptionalNullable.of(id);
        this.currency = currency;
        this.price = OptionalNullable.of(price);
        this.couponId = couponId;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  currency  String value for currency.
     * @param  price  Double value for price.
     * @param  couponId  Integer value for couponId.
     */

    protected CouponCurrency(OptionalNullable<Integer> id, String currency,
            OptionalNullable<Double> price, Integer couponId) {
        this.id = id;
        this.currency = currency;
        this.price = price;
        this.couponId = couponId;
    }

    /**
     * Internal Getter for Id.
     * @return Returns the Internal Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetId() {
        return this.id;
    }

    /**
     * Getter for Id.
     * @return Returns the Integer
     */
    public Integer getId() {
        return OptionalNullable.getFrom(id);
    }

    /**
     * Setter for Id.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = OptionalNullable.of(id);
    }

    /**
     * UnSetter for Id.
     */
    public void unsetId() {
        id = null;
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
     * Internal Getter for Price.
     * @return Returns the Internal Double
     */
    @JsonGetter("price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Double> internalGetPrice() {
        return this.price;
    }

    /**
     * Getter for Price.
     * @return Returns the Double
     */
    public Double getPrice() {
        return OptionalNullable.getFrom(price);
    }

    /**
     * Setter for Price.
     * @param price Value for Double
     */
    @JsonSetter("price")
    public void setPrice(Double price) {
        this.price = OptionalNullable.of(price);
    }

    /**
     * UnSetter for Price.
     */
    public void unsetPrice() {
        price = null;
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
                + ", couponId=" + couponId + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link CouponCurrency.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CouponCurrency.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .currency(getCurrency())
                .couponId(getCouponId());
        builder.id = internalGetId();
        builder.price = internalGetPrice();
        return builder;
    }

    /**
     * Class to build instances of {@link CouponCurrency}.
     */
    public static class Builder {
        private OptionalNullable<Integer> id;
        private String currency;
        private OptionalNullable<Double> price;
        private Integer couponId;



        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = OptionalNullable.of(id);
            return this;
        }

        /**
         * UnSetter for id.
         * @return Builder
         */
        public Builder unsetId() {
            id = null;
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
            this.price = OptionalNullable.of(price);
            return this;
        }

        /**
         * UnSetter for price.
         * @return Builder
         */
        public Builder unsetPrice() {
            price = null;
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
