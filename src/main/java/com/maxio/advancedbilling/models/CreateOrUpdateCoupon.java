/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.CreateOrUpdateCouponCoupon;
import java.util.Map;

/**
 * This is a model class for CreateOrUpdateCoupon type.
 */
public class CreateOrUpdateCoupon {
    private CreateOrUpdateCouponCoupon coupon;
    private Map<String, Boolean> restrictedProducts;
    private Map<String, Boolean> restrictedComponents;

    /**
     * Default constructor.
     */
    public CreateOrUpdateCoupon() {
    }

    /**
     * Initialization constructor.
     * @param  coupon  CreateOrUpdateCouponCoupon value for coupon.
     * @param  restrictedProducts  Map of String, value for restrictedProducts.
     * @param  restrictedComponents  Map of String, value for restrictedComponents.
     */
    public CreateOrUpdateCoupon(
            CreateOrUpdateCouponCoupon coupon,
            Map<String, Boolean> restrictedProducts,
            Map<String, Boolean> restrictedComponents) {
        this.coupon = coupon;
        this.restrictedProducts = restrictedProducts;
        this.restrictedComponents = restrictedComponents;
    }

    /**
     * Getter for Coupon.
     * @return Returns the CreateOrUpdateCouponCoupon
     */
    @JsonGetter("coupon")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateOrUpdateCouponCoupon getCoupon() {
        return coupon;
    }

    /**
     * Setter for Coupon.
     * @param coupon Value for CreateOrUpdateCouponCoupon
     */
    @JsonSetter("coupon")
    public void setCoupon(CreateOrUpdateCouponCoupon coupon) {
        this.coupon = coupon;
    }

    /**
     * Getter for RestrictedProducts.
     * An object where the keys are product_ids and the values are booleans indicating if the coupon
     * should be applicable to the product
     * @return Returns the Map of String, Boolean
     */
    @JsonGetter("restricted_products")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, Boolean> getRestrictedProducts() {
        return restrictedProducts;
    }

    /**
     * Setter for RestrictedProducts.
     * An object where the keys are product_ids and the values are booleans indicating if the coupon
     * should be applicable to the product
     * @param restrictedProducts Value for Map of String, Boolean
     */
    @JsonSetter("restricted_products")
    public void setRestrictedProducts(Map<String, Boolean> restrictedProducts) {
        this.restrictedProducts = restrictedProducts;
    }

    /**
     * Getter for RestrictedComponents.
     * An object where the keys are component_ids and the values are booleans indicating if the
     * coupon should be applicable to the component
     * @return Returns the Map of String, Boolean
     */
    @JsonGetter("restricted_components")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, Boolean> getRestrictedComponents() {
        return restrictedComponents;
    }

    /**
     * Setter for RestrictedComponents.
     * An object where the keys are component_ids and the values are booleans indicating if the
     * coupon should be applicable to the component
     * @param restrictedComponents Value for Map of String, Boolean
     */
    @JsonSetter("restricted_components")
    public void setRestrictedComponents(Map<String, Boolean> restrictedComponents) {
        this.restrictedComponents = restrictedComponents;
    }

    /**
     * Converts this CreateOrUpdateCoupon into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateOrUpdateCoupon [" + "coupon=" + coupon + ", restrictedProducts="
                + restrictedProducts + ", restrictedComponents=" + restrictedComponents + "]";
    }

    /**
     * Builds a new {@link CreateOrUpdateCoupon.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateOrUpdateCoupon.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .coupon(getCoupon())
                .restrictedProducts(getRestrictedProducts())
                .restrictedComponents(getRestrictedComponents());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateOrUpdateCoupon}.
     */
    public static class Builder {
        private CreateOrUpdateCouponCoupon coupon;
        private Map<String, Boolean> restrictedProducts;
        private Map<String, Boolean> restrictedComponents;



        /**
         * Setter for coupon.
         * @param  coupon  CreateOrUpdateCouponCoupon value for coupon.
         * @return Builder
         */
        public Builder coupon(CreateOrUpdateCouponCoupon coupon) {
            this.coupon = coupon;
            return this;
        }

        /**
         * Setter for restrictedProducts.
         * @param  restrictedProducts  Map of String, value for restrictedProducts.
         * @return Builder
         */
        public Builder restrictedProducts(Map<String, Boolean> restrictedProducts) {
            this.restrictedProducts = restrictedProducts;
            return this;
        }

        /**
         * Setter for restrictedComponents.
         * @param  restrictedComponents  Map of String, value for restrictedComponents.
         * @return Builder
         */
        public Builder restrictedComponents(Map<String, Boolean> restrictedComponents) {
            this.restrictedComponents = restrictedComponents;
            return this;
        }

        /**
         * Builds a new {@link CreateOrUpdateCoupon} object using the set fields.
         * @return {@link CreateOrUpdateCoupon}
         */
        public CreateOrUpdateCoupon build() {
            return new CreateOrUpdateCoupon(coupon, restrictedProducts, restrictedComponents);
        }
    }
}
