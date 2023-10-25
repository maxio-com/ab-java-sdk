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
 * This is a model class for CouponResponse type.
 */
public class CouponResponse {
    private Coupon coupon;

    /**
     * Default constructor.
     */
    public CouponResponse() {
    }

    /**
     * Initialization constructor.
     * @param  coupon  Coupon value for coupon.
     */
    public CouponResponse(
            Coupon coupon) {
        this.coupon = coupon;
    }

    /**
     * Getter for Coupon.
     * @return Returns the Coupon
     */
    @JsonGetter("coupon")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Coupon getCoupon() {
        return coupon;
    }

    /**
     * Setter for Coupon.
     * @param coupon Value for Coupon
     */
    @JsonSetter("coupon")
    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    /**
     * Converts this CouponResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CouponResponse [" + "coupon=" + coupon + "]";
    }

    /**
     * Builds a new {@link CouponResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CouponResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .coupon(getCoupon());
        return builder;
    }

    /**
     * Class to build instances of {@link CouponResponse}.
     */
    public static class Builder {
        private Coupon coupon;



        /**
         * Setter for coupon.
         * @param  coupon  Coupon value for coupon.
         * @return Builder
         */
        public Builder coupon(Coupon coupon) {
            this.coupon = coupon;
            return this;
        }

        /**
         * Builds a new {@link CouponResponse} object using the set fields.
         * @return {@link CouponResponse}
         */
        public CouponResponse build() {
            return new CouponResponse(coupon);
        }
    }
}
