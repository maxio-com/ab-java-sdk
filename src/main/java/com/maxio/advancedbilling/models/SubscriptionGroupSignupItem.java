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
import java.util.Map;

/**
 * This is a model class for SubscriptionGroupSignupItem type.
 */
public class SubscriptionGroupSignupItem {
    private String productHandle;
    private Integer productId;
    private Integer productPricePointId;
    private String productPricePointHandle;
    private Integer offerId;
    private String reference;
    private Boolean primary;
    private String currency;
    private List<String> couponCodes;
    private List<SubscriptionGroupSignupComponent> components;
    private CustomPriceUsedForSubscriptionCreateUpdate customPrice;
    private CalendarBilling calendarBilling;
    private Map<String, String> metafields;

    /**
     * Default constructor.
     */
    public SubscriptionGroupSignupItem() {
    }

    /**
     * Initialization constructor.
     * @param  productHandle  String value for productHandle.
     * @param  productId  Integer value for productId.
     * @param  productPricePointId  Integer value for productPricePointId.
     * @param  productPricePointHandle  String value for productPricePointHandle.
     * @param  offerId  Integer value for offerId.
     * @param  reference  String value for reference.
     * @param  primary  Boolean value for primary.
     * @param  currency  String value for currency.
     * @param  couponCodes  List of String value for couponCodes.
     * @param  components  List of SubscriptionGroupSignupComponent value for components.
     * @param  customPrice  CustomPriceUsedForSubscriptionCreateUpdate value for customPrice.
     * @param  calendarBilling  CalendarBilling value for calendarBilling.
     * @param  metafields  Map of String, value for metafields.
     */
    public SubscriptionGroupSignupItem(
            String productHandle,
            Integer productId,
            Integer productPricePointId,
            String productPricePointHandle,
            Integer offerId,
            String reference,
            Boolean primary,
            String currency,
            List<String> couponCodes,
            List<SubscriptionGroupSignupComponent> components,
            CustomPriceUsedForSubscriptionCreateUpdate customPrice,
            CalendarBilling calendarBilling,
            Map<String, String> metafields) {
        this.productHandle = productHandle;
        this.productId = productId;
        this.productPricePointId = productPricePointId;
        this.productPricePointHandle = productPricePointHandle;
        this.offerId = offerId;
        this.reference = reference;
        this.primary = primary;
        this.currency = currency;
        this.couponCodes = couponCodes;
        this.components = components;
        this.customPrice = customPrice;
        this.calendarBilling = calendarBilling;
        this.metafields = metafields;
    }

    /**
     * Getter for ProductHandle.
     * The API Handle of the product for which you are creating a subscription. Required, unless a
     * `product_id` is given instead.
     * @return Returns the String
     */
    @JsonGetter("product_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductHandle() {
        return productHandle;
    }

    /**
     * Setter for ProductHandle.
     * The API Handle of the product for which you are creating a subscription. Required, unless a
     * `product_id` is given instead.
     * @param productHandle Value for String
     */
    @JsonSetter("product_handle")
    public void setProductHandle(String productHandle) {
        this.productHandle = productHandle;
    }

    /**
     * Getter for ProductId.
     * The Product ID of the product for which you are creating a subscription. You can pass either
     * `product_id` or `product_handle`.
     * @return Returns the Integer
     */
    @JsonGetter("product_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductId() {
        return productId;
    }

    /**
     * Setter for ProductId.
     * The Product ID of the product for which you are creating a subscription. You can pass either
     * `product_id` or `product_handle`.
     * @param productId Value for Integer
     */
    @JsonSetter("product_id")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * Getter for ProductPricePointId.
     * The ID of the particular price point on the product.
     * @return Returns the Integer
     */
    @JsonGetter("product_price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductPricePointId() {
        return productPricePointId;
    }

    /**
     * Setter for ProductPricePointId.
     * The ID of the particular price point on the product.
     * @param productPricePointId Value for Integer
     */
    @JsonSetter("product_price_point_id")
    public void setProductPricePointId(Integer productPricePointId) {
        this.productPricePointId = productPricePointId;
    }

    /**
     * Getter for ProductPricePointHandle.
     * The user-friendly API handle of a product's particular price point.
     * @return Returns the String
     */
    @JsonGetter("product_price_point_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductPricePointHandle() {
        return productPricePointHandle;
    }

    /**
     * Setter for ProductPricePointHandle.
     * The user-friendly API handle of a product's particular price point.
     * @param productPricePointHandle Value for String
     */
    @JsonSetter("product_price_point_handle")
    public void setProductPricePointHandle(String productPricePointHandle) {
        this.productPricePointHandle = productPricePointHandle;
    }

    /**
     * Getter for OfferId.
     * Use in place of passing product and component information to set up the subscription with an
     * existing offer. May be either the Chargify ID of the offer or its handle prefixed with
     * `handle:`
     * @return Returns the Integer
     */
    @JsonGetter("offer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getOfferId() {
        return offerId;
    }

    /**
     * Setter for OfferId.
     * Use in place of passing product and component information to set up the subscription with an
     * existing offer. May be either the Chargify ID of the offer or its handle prefixed with
     * `handle:`
     * @param offerId Value for Integer
     */
    @JsonSetter("offer_id")
    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    /**
     * Getter for Reference.
     * The reference value (provided by your app) for the subscription itelf.
     * @return Returns the String
     */
    @JsonGetter("reference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReference() {
        return reference;
    }

    /**
     * Setter for Reference.
     * The reference value (provided by your app) for the subscription itelf.
     * @param reference Value for String
     */
    @JsonSetter("reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Getter for Primary.
     * One of the subscriptions must be marked as primary in the group.
     * @return Returns the Boolean
     */
    @JsonGetter("primary")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPrimary() {
        return primary;
    }

    /**
     * Setter for Primary.
     * One of the subscriptions must be marked as primary in the group.
     * @param primary Value for Boolean
     */
    @JsonSetter("primary")
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    /**
     * Getter for Currency.
     * (Optional) If Multi-Currency is enabled and the currency is configured in Chargify, pass it
     * at signup to create a subscription on a non-default currency. Note that you cannot update the
     * currency of an existing subscription.
     * @return Returns the String
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * (Optional) If Multi-Currency is enabled and the currency is configured in Chargify, pass it
     * at signup to create a subscription on a non-default currency. Note that you cannot update the
     * currency of an existing subscription.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for CouponCodes.
     * An array for all the coupons attached to the subscription.
     * @return Returns the List of String
     */
    @JsonGetter("coupon_codes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getCouponCodes() {
        return couponCodes;
    }

    /**
     * Setter for CouponCodes.
     * An array for all the coupons attached to the subscription.
     * @param couponCodes Value for List of String
     */
    @JsonSetter("coupon_codes")
    public void setCouponCodes(List<String> couponCodes) {
        this.couponCodes = couponCodes;
    }

    /**
     * Getter for Components.
     * @return Returns the List of SubscriptionGroupSignupComponent
     */
    @JsonGetter("components")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<SubscriptionGroupSignupComponent> getComponents() {
        return components;
    }

    /**
     * Setter for Components.
     * @param components Value for List of SubscriptionGroupSignupComponent
     */
    @JsonSetter("components")
    public void setComponents(List<SubscriptionGroupSignupComponent> components) {
        this.components = components;
    }

    /**
     * Getter for CustomPrice.
     * (Optional) Used in place of `product_price_point_id` to define a custom price point unique to
     * the subscription
     * @return Returns the CustomPriceUsedForSubscriptionCreateUpdate
     */
    @JsonGetter("custom_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomPriceUsedForSubscriptionCreateUpdate getCustomPrice() {
        return customPrice;
    }

    /**
     * Setter for CustomPrice.
     * (Optional) Used in place of `product_price_point_id` to define a custom price point unique to
     * the subscription
     * @param customPrice Value for CustomPriceUsedForSubscriptionCreateUpdate
     */
    @JsonSetter("custom_price")
    public void setCustomPrice(CustomPriceUsedForSubscriptionCreateUpdate customPrice) {
        this.customPrice = customPrice;
    }

    /**
     * Getter for CalendarBilling.
     * (Optional). Cannot be used when also specifying next_billing_at
     * @return Returns the CalendarBilling
     */
    @JsonGetter("calendar_billing")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CalendarBilling getCalendarBilling() {
        return calendarBilling;
    }

    /**
     * Setter for CalendarBilling.
     * (Optional). Cannot be used when also specifying next_billing_at
     * @param calendarBilling Value for CalendarBilling
     */
    @JsonSetter("calendar_billing")
    public void setCalendarBilling(CalendarBilling calendarBilling) {
        this.calendarBilling = calendarBilling;
    }

    /**
     * Getter for Metafields.
     * (Optional) A set of key/value pairs representing custom fields and their values. Metafields
     * will be created “on-the-fly” in your site for a given key, if they have not been created yet.
     * @return Returns the Map of String, String
     */
    @JsonGetter("metafields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, String> getMetafields() {
        return metafields;
    }

    /**
     * Setter for Metafields.
     * (Optional) A set of key/value pairs representing custom fields and their values. Metafields
     * will be created “on-the-fly” in your site for a given key, if they have not been created yet.
     * @param metafields Value for Map of String, String
     */
    @JsonSetter("metafields")
    public void setMetafields(Map<String, String> metafields) {
        this.metafields = metafields;
    }

    /**
     * Converts this SubscriptionGroupSignupItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupSignupItem [" + "productHandle=" + productHandle + ", productId="
                + productId + ", productPricePointId=" + productPricePointId
                + ", productPricePointHandle=" + productPricePointHandle + ", offerId=" + offerId
                + ", reference=" + reference + ", primary=" + primary + ", currency=" + currency
                + ", couponCodes=" + couponCodes + ", components=" + components + ", customPrice="
                + customPrice + ", calendarBilling=" + calendarBilling + ", metafields="
                + metafields + "]";
    }

    /**
     * Builds a new {@link SubscriptionGroupSignupItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionGroupSignupItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .productHandle(getProductHandle())
                .productId(getProductId())
                .productPricePointId(getProductPricePointId())
                .productPricePointHandle(getProductPricePointHandle())
                .offerId(getOfferId())
                .reference(getReference())
                .primary(getPrimary())
                .currency(getCurrency())
                .couponCodes(getCouponCodes())
                .components(getComponents())
                .customPrice(getCustomPrice())
                .calendarBilling(getCalendarBilling())
                .metafields(getMetafields());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupSignupItem}.
     */
    public static class Builder {
        private String productHandle;
        private Integer productId;
        private Integer productPricePointId;
        private String productPricePointHandle;
        private Integer offerId;
        private String reference;
        private Boolean primary;
        private String currency;
        private List<String> couponCodes;
        private List<SubscriptionGroupSignupComponent> components;
        private CustomPriceUsedForSubscriptionCreateUpdate customPrice;
        private CalendarBilling calendarBilling;
        private Map<String, String> metafields;



        /**
         * Setter for productHandle.
         * @param  productHandle  String value for productHandle.
         * @return Builder
         */
        public Builder productHandle(String productHandle) {
            this.productHandle = productHandle;
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
         * Setter for offerId.
         * @param  offerId  Integer value for offerId.
         * @return Builder
         */
        public Builder offerId(Integer offerId) {
            this.offerId = offerId;
            return this;
        }

        /**
         * Setter for reference.
         * @param  reference  String value for reference.
         * @return Builder
         */
        public Builder reference(String reference) {
            this.reference = reference;
            return this;
        }

        /**
         * Setter for primary.
         * @param  primary  Boolean value for primary.
         * @return Builder
         */
        public Builder primary(Boolean primary) {
            this.primary = primary;
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
         * Setter for couponCodes.
         * @param  couponCodes  List of String value for couponCodes.
         * @return Builder
         */
        public Builder couponCodes(List<String> couponCodes) {
            this.couponCodes = couponCodes;
            return this;
        }

        /**
         * Setter for components.
         * @param  components  List of SubscriptionGroupSignupComponent value for components.
         * @return Builder
         */
        public Builder components(List<SubscriptionGroupSignupComponent> components) {
            this.components = components;
            return this;
        }

        /**
         * Setter for customPrice.
         * @param  customPrice  CustomPriceUsedForSubscriptionCreateUpdate value for customPrice.
         * @return Builder
         */
        public Builder customPrice(CustomPriceUsedForSubscriptionCreateUpdate customPrice) {
            this.customPrice = customPrice;
            return this;
        }

        /**
         * Setter for calendarBilling.
         * @param  calendarBilling  CalendarBilling value for calendarBilling.
         * @return Builder
         */
        public Builder calendarBilling(CalendarBilling calendarBilling) {
            this.calendarBilling = calendarBilling;
            return this;
        }

        /**
         * Setter for metafields.
         * @param  metafields  Map of String, value for metafields.
         * @return Builder
         */
        public Builder metafields(Map<String, String> metafields) {
            this.metafields = metafields;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroupSignupItem} object using the set fields.
         * @return {@link SubscriptionGroupSignupItem}
         */
        public SubscriptionGroupSignupItem build() {
            return new SubscriptionGroupSignupItem(productHandle, productId, productPricePointId,
                    productPricePointHandle, offerId, reference, primary, currency, couponCodes,
                    components, customPrice, calendarBilling, metafields);
        }
    }
}
