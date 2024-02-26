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
 * This is a model class for OfferDiscount type.
 */
public class OfferDiscount {
    private String couponCode;
    private Integer couponId;
    private String couponName;

    /**
     * Default constructor.
     */
    public OfferDiscount() {
    }

    /**
     * Initialization constructor.
     * @param  couponCode  String value for couponCode.
     * @param  couponId  Integer value for couponId.
     * @param  couponName  String value for couponName.
     */
    public OfferDiscount(
            String couponCode,
            Integer couponId,
            String couponName) {
        this.couponCode = couponCode;
        this.couponId = couponId;
        this.couponName = couponName;
    }

    /**
     * Getter for CouponCode.
     * @return Returns the String
     */
    @JsonGetter("coupon_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * Setter for CouponCode.
     * @param couponCode Value for String
     */
    @JsonSetter("coupon_code")
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
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
     * Getter for CouponName.
     * @return Returns the String
     */
    @JsonGetter("coupon_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCouponName() {
        return couponName;
    }

    /**
     * Setter for CouponName.
     * @param couponName Value for String
     */
    @JsonSetter("coupon_name")
    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    /**
     * Converts this OfferDiscount into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OfferDiscount [" + "couponCode=" + couponCode + ", couponId=" + couponId
                + ", couponName=" + couponName + "]";
    }

    /**
     * Builds a new {@link OfferDiscount.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OfferDiscount.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .couponCode(getCouponCode())
                .couponId(getCouponId())
                .couponName(getCouponName());
        return builder;
    }

    /**
     * Class to build instances of {@link OfferDiscount}.
     */
    public static class Builder {
        private String couponCode;
        private Integer couponId;
        private String couponName;



        /**
         * Setter for couponCode.
         * @param  couponCode  String value for couponCode.
         * @return Builder
         */
        public Builder couponCode(String couponCode) {
            this.couponCode = couponCode;
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
         * Setter for couponName.
         * @param  couponName  String value for couponName.
         * @return Builder
         */
        public Builder couponName(String couponName) {
            this.couponName = couponName;
            return this;
        }

        /**
         * Builds a new {@link OfferDiscount} object using the set fields.
         * @return {@link OfferDiscount}
         */
        public OfferDiscount build() {
            return new OfferDiscount(couponCode, couponId, couponName);
        }
    }
}
