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
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for SubscriptionGroupItem type.
 */
public class SubscriptionGroupItem {
    private Integer id;
    private OptionalNullable<String> reference;
    private Integer productId;
    private OptionalNullable<String> productHandle;
    private Integer productPricePointId;
    private String productPricePointHandle;
    private String currency;
    private OptionalNullable<String> couponCode;
    private Integer totalRevenueInCents;
    private Integer balanceInCents;

    /**
     * Default constructor.
     */
    public SubscriptionGroupItem() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  reference  String value for reference.
     * @param  productId  Integer value for productId.
     * @param  productHandle  String value for productHandle.
     * @param  productPricePointId  Integer value for productPricePointId.
     * @param  productPricePointHandle  String value for productPricePointHandle.
     * @param  currency  String value for currency.
     * @param  couponCode  String value for couponCode.
     * @param  totalRevenueInCents  Integer value for totalRevenueInCents.
     * @param  balanceInCents  Integer value for balanceInCents.
     */
    public SubscriptionGroupItem(
            Integer id,
            String reference,
            Integer productId,
            String productHandle,
            Integer productPricePointId,
            String productPricePointHandle,
            String currency,
            String couponCode,
            Integer totalRevenueInCents,
            Integer balanceInCents) {
        this.id = id;
        this.reference = OptionalNullable.of(reference);
        this.productId = productId;
        this.productHandle = OptionalNullable.of(productHandle);
        this.productPricePointId = productPricePointId;
        this.productPricePointHandle = productPricePointHandle;
        this.currency = currency;
        this.couponCode = OptionalNullable.of(couponCode);
        this.totalRevenueInCents = totalRevenueInCents;
        this.balanceInCents = balanceInCents;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  reference  String value for reference.
     * @param  productId  Integer value for productId.
     * @param  productHandle  String value for productHandle.
     * @param  productPricePointId  Integer value for productPricePointId.
     * @param  productPricePointHandle  String value for productPricePointHandle.
     * @param  currency  String value for currency.
     * @param  couponCode  String value for couponCode.
     * @param  totalRevenueInCents  Integer value for totalRevenueInCents.
     * @param  balanceInCents  Integer value for balanceInCents.
     */

    protected SubscriptionGroupItem(Integer id, OptionalNullable<String> reference,
            Integer productId, OptionalNullable<String> productHandle, Integer productPricePointId,
            String productPricePointHandle, String currency, OptionalNullable<String> couponCode,
            Integer totalRevenueInCents, Integer balanceInCents) {
        this.id = id;
        this.reference = reference;
        this.productId = productId;
        this.productHandle = productHandle;
        this.productPricePointId = productPricePointId;
        this.productPricePointHandle = productPricePointHandle;
        this.currency = currency;
        this.couponCode = couponCode;
        this.totalRevenueInCents = totalRevenueInCents;
        this.balanceInCents = balanceInCents;
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
     * Internal Getter for Reference.
     * @return Returns the Internal String
     */
    @JsonGetter("reference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetReference() {
        return this.reference;
    }

    /**
     * Getter for Reference.
     * @return Returns the String
     */
    public String getReference() {
        return OptionalNullable.getFrom(reference);
    }

    /**
     * Setter for Reference.
     * @param reference Value for String
     */
    @JsonSetter("reference")
    public void setReference(String reference) {
        this.reference = OptionalNullable.of(reference);
    }

    /**
     * UnSetter for Reference.
     */
    public void unsetReference() {
        reference = null;
    }

    /**
     * Getter for ProductId.
     * @return Returns the Integer
     */
    @JsonGetter("product_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductId() {
        return productId;
    }

    /**
     * Setter for ProductId.
     * @param productId Value for Integer
     */
    @JsonSetter("product_id")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * Internal Getter for ProductHandle.
     * @return Returns the Internal String
     */
    @JsonGetter("product_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetProductHandle() {
        return this.productHandle;
    }

    /**
     * Getter for ProductHandle.
     * @return Returns the String
     */
    public String getProductHandle() {
        return OptionalNullable.getFrom(productHandle);
    }

    /**
     * Setter for ProductHandle.
     * @param productHandle Value for String
     */
    @JsonSetter("product_handle")
    public void setProductHandle(String productHandle) {
        this.productHandle = OptionalNullable.of(productHandle);
    }

    /**
     * UnSetter for ProductHandle.
     */
    public void unsetProductHandle() {
        productHandle = null;
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
     * Getter for ProductPricePointHandle.
     * @return Returns the String
     */
    @JsonGetter("product_price_point_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductPricePointHandle() {
        return productPricePointHandle;
    }

    /**
     * Setter for ProductPricePointHandle.
     * @param productPricePointHandle Value for String
     */
    @JsonSetter("product_price_point_handle")
    public void setProductPricePointHandle(String productPricePointHandle) {
        this.productPricePointHandle = productPricePointHandle;
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
     * Internal Getter for CouponCode.
     * @return Returns the Internal String
     */
    @JsonGetter("coupon_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCouponCode() {
        return this.couponCode;
    }

    /**
     * Getter for CouponCode.
     * @return Returns the String
     */
    public String getCouponCode() {
        return OptionalNullable.getFrom(couponCode);
    }

    /**
     * Setter for CouponCode.
     * @param couponCode Value for String
     */
    @JsonSetter("coupon_code")
    public void setCouponCode(String couponCode) {
        this.couponCode = OptionalNullable.of(couponCode);
    }

    /**
     * UnSetter for CouponCode.
     */
    public void unsetCouponCode() {
        couponCode = null;
    }

    /**
     * Getter for TotalRevenueInCents.
     * @return Returns the Integer
     */
    @JsonGetter("total_revenue_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalRevenueInCents() {
        return totalRevenueInCents;
    }

    /**
     * Setter for TotalRevenueInCents.
     * @param totalRevenueInCents Value for Integer
     */
    @JsonSetter("total_revenue_in_cents")
    public void setTotalRevenueInCents(Integer totalRevenueInCents) {
        this.totalRevenueInCents = totalRevenueInCents;
    }

    /**
     * Getter for BalanceInCents.
     * @return Returns the Integer
     */
    @JsonGetter("balance_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getBalanceInCents() {
        return balanceInCents;
    }

    /**
     * Setter for BalanceInCents.
     * @param balanceInCents Value for Integer
     */
    @JsonSetter("balance_in_cents")
    public void setBalanceInCents(Integer balanceInCents) {
        this.balanceInCents = balanceInCents;
    }

    /**
     * Converts this SubscriptionGroupItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupItem [" + "id=" + id + ", reference=" + reference + ", productId="
                + productId + ", productHandle=" + productHandle + ", productPricePointId="
                + productPricePointId + ", productPricePointHandle=" + productPricePointHandle
                + ", currency=" + currency + ", couponCode=" + couponCode + ", totalRevenueInCents="
                + totalRevenueInCents + ", balanceInCents=" + balanceInCents + "]";
    }

    /**
     * Builds a new {@link SubscriptionGroupItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionGroupItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .productId(getProductId())
                .productPricePointId(getProductPricePointId())
                .productPricePointHandle(getProductPricePointHandle())
                .currency(getCurrency())
                .totalRevenueInCents(getTotalRevenueInCents())
                .balanceInCents(getBalanceInCents());
        builder.reference = internalGetReference();
        builder.productHandle = internalGetProductHandle();
        builder.couponCode = internalGetCouponCode();
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupItem}.
     */
    public static class Builder {
        private Integer id;
        private OptionalNullable<String> reference;
        private Integer productId;
        private OptionalNullable<String> productHandle;
        private Integer productPricePointId;
        private String productPricePointHandle;
        private String currency;
        private OptionalNullable<String> couponCode;
        private Integer totalRevenueInCents;
        private Integer balanceInCents;



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
         * Setter for reference.
         * @param  reference  String value for reference.
         * @return Builder
         */
        public Builder reference(String reference) {
            this.reference = OptionalNullable.of(reference);
            return this;
        }

        /**
         * UnSetter for reference.
         * @return Builder
         */
        public Builder unsetReference() {
            reference = null;
            return this;
        }

        /**
         * Setter for productId.
         * @param  productId  Integer value for productId.
         * @return Builder
         */
        public Builder productId(Integer productId) {
            this.productId = productId;
            return this;
        }

        /**
         * Setter for productHandle.
         * @param  productHandle  String value for productHandle.
         * @return Builder
         */
        public Builder productHandle(String productHandle) {
            this.productHandle = OptionalNullable.of(productHandle);
            return this;
        }

        /**
         * UnSetter for productHandle.
         * @return Builder
         */
        public Builder unsetProductHandle() {
            productHandle = null;
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
         * Setter for productPricePointHandle.
         * @param  productPricePointHandle  String value for productPricePointHandle.
         * @return Builder
         */
        public Builder productPricePointHandle(String productPricePointHandle) {
            this.productPricePointHandle = productPricePointHandle;
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
         * Setter for couponCode.
         * @param  couponCode  String value for couponCode.
         * @return Builder
         */
        public Builder couponCode(String couponCode) {
            this.couponCode = OptionalNullable.of(couponCode);
            return this;
        }

        /**
         * UnSetter for couponCode.
         * @return Builder
         */
        public Builder unsetCouponCode() {
            couponCode = null;
            return this;
        }

        /**
         * Setter for totalRevenueInCents.
         * @param  totalRevenueInCents  Integer value for totalRevenueInCents.
         * @return Builder
         */
        public Builder totalRevenueInCents(Integer totalRevenueInCents) {
            this.totalRevenueInCents = totalRevenueInCents;
            return this;
        }

        /**
         * Setter for balanceInCents.
         * @param  balanceInCents  Integer value for balanceInCents.
         * @return Builder
         */
        public Builder balanceInCents(Integer balanceInCents) {
            this.balanceInCents = balanceInCents;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroupItem} object using the set fields.
         * @return {@link SubscriptionGroupItem}
         */
        public SubscriptionGroupItem build() {
            return new SubscriptionGroupItem(id, reference, productId, productHandle,
                    productPricePointId, productPricePointHandle, currency, couponCode,
                    totalRevenueInCents, balanceInCents);
        }
    }
}
