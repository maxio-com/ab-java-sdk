/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for ScheduledRenewalItemRequestBodyProduct type.
 */
public class ScheduledRenewalItemRequestBodyProduct
        extends BaseModel {
    private String itemType;
    private int itemId;
    private Integer pricePointId;
    private Integer quantity;
    private ScheduledRenewalProductPricePoint customPrice;

    /**
     * Default constructor.
     */
    public ScheduledRenewalItemRequestBodyProduct() {
        itemType = "Product";
    }

    /**
     * Initialization constructor.
     * @param  itemType  String value for itemType.
     * @param  itemId  int value for itemId.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  quantity  Integer value for quantity.
     * @param  customPrice  ScheduledRenewalProductPricePoint value for customPrice.
     */
    public ScheduledRenewalItemRequestBodyProduct(
            String itemType,
            int itemId,
            Integer pricePointId,
            Integer quantity,
            ScheduledRenewalProductPricePoint customPrice) {
        this.itemType = itemType;
        this.itemId = itemId;
        this.pricePointId = pricePointId;
        this.quantity = quantity;
        this.customPrice = customPrice;
    }

    /**
     * Initialization constructor.
     * @param  itemType  String value for itemType.
     * @param  itemId  int value for itemId.
     */
    @JsonCreator
    protected ScheduledRenewalItemRequestBodyProduct(
            @JsonProperty("item_type") String itemType,
            @JsonProperty("item_id") int itemId) {
        this(itemType, itemId, null, null, null);
    }

    /**
     * Getter for ItemType.
     * Item type to add. Either Product or Component.
     * @return Returns the String
     */
    @JsonGetter("item_type")
    public String getItemType() {
        return itemType;
    }

    /**
     * Setter for ItemType.
     * Item type to add. Either Product or Component.
     * @param itemType Value for String
     */
    @JsonSetter("item_type")
    private void setItemType(String itemType) {
        this.itemType = itemType;
    }

    /**
     * Getter for ItemId.
     * Product or component identifier.
     * @return Returns the int
     */
    @JsonGetter("item_id")
    public int getItemId() {
        return itemId;
    }

    /**
     * Setter for ItemId.
     * Product or component identifier.
     * @param itemId Value for int
     */
    @JsonSetter("item_id")
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    /**
     * Getter for PricePointId.
     * Price point identifier.
     * @return Returns the Integer
     */
    @JsonGetter("price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPricePointId() {
        return pricePointId;
    }

    /**
     * Setter for PricePointId.
     * Price point identifier.
     * @param pricePointId Value for Integer
     */
    @JsonSetter("price_point_id")
    public void setPricePointId(Integer pricePointId) {
        this.pricePointId = pricePointId;
    }

    /**
     * Getter for Quantity.
     * (Optional) Quantity for the item.
     * @return Returns the Integer
     */
    @JsonGetter("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * (Optional) Quantity for the item.
     * @param quantity Value for Integer
     */
    @JsonSetter("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for CustomPrice.
     * Custom pricing for a product within a scheduled renewal.
     * @return Returns the ScheduledRenewalProductPricePoint
     */
    @JsonGetter("custom_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ScheduledRenewalProductPricePoint getCustomPrice() {
        return customPrice;
    }

    /**
     * Setter for CustomPrice.
     * Custom pricing for a product within a scheduled renewal.
     * @param customPrice Value for ScheduledRenewalProductPricePoint
     */
    @JsonSetter("custom_price")
    public void setCustomPrice(ScheduledRenewalProductPricePoint customPrice) {
        this.customPrice = customPrice;
    }

    /**
     * Converts this ScheduledRenewalItemRequestBodyProduct into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ScheduledRenewalItemRequestBodyProduct [" + "itemType=" + itemType + ", itemId="
                + itemId + ", pricePointId=" + pricePointId + ", quantity=" + quantity
                + ", customPrice=" + customPrice + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ScheduledRenewalItemRequestBodyProduct.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ScheduledRenewalItemRequestBodyProduct.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(itemType, itemId)
                .pricePointId(getPricePointId())
                .quantity(getQuantity())
                .customPrice(getCustomPrice());
        return builder;
    }

    /**
     * Class to build instances of {@link ScheduledRenewalItemRequestBodyProduct}.
     */
    public static class Builder {
        private String itemType = "Product";
        private int itemId;
        private Integer pricePointId;
        private Integer quantity;
        private ScheduledRenewalProductPricePoint customPrice;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  itemType  String value for itemType.
         * @param  itemId  int value for itemId.
         */
        public Builder(String itemType, int itemId) {
            this.itemType = itemType;
            this.itemId = itemId;
        }

        /**
         * Setter for itemType.
         * @param  itemType  String value for itemType.
         * @return Builder
         */
        public Builder itemType(String itemType) {
            this.itemType = itemType;
            return this;
        }

        /**
         * Setter for itemId.
         * @param  itemId  int value for itemId.
         * @return Builder
         */
        public Builder itemId(int itemId) {
            this.itemId = itemId;
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
         * Setter for quantity.
         * @param  quantity  Integer value for quantity.
         * @return Builder
         */
        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Setter for customPrice.
         * @param  customPrice  ScheduledRenewalProductPricePoint value for customPrice.
         * @return Builder
         */
        public Builder customPrice(ScheduledRenewalProductPricePoint customPrice) {
            this.customPrice = customPrice;
            return this;
        }

        /**
         * Builds a new {@link ScheduledRenewalItemRequestBodyProduct} object using the set fields.
         * @return {@link ScheduledRenewalItemRequestBodyProduct}
         */
        public ScheduledRenewalItemRequestBodyProduct build() {
            return new ScheduledRenewalItemRequestBodyProduct(itemType, itemId, pricePointId,
                    quantity, customPrice);
        }
    }
}
