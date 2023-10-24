/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ItemPricePointChanged type.
 */
public class ItemPricePointChanged {
    private int itemId;
    private String itemType;
    private String itemHandle;
    private String itemName;
    private ItemPricePointData previousPricePoint;
    private ItemPricePointData currentPricePoint;

    /**
     * Default constructor.
     */
    public ItemPricePointChanged() {
    }

    /**
     * Initialization constructor.
     * @param  itemId  int value for itemId.
     * @param  itemType  String value for itemType.
     * @param  itemHandle  String value for itemHandle.
     * @param  itemName  String value for itemName.
     * @param  previousPricePoint  ItemPricePointData value for previousPricePoint.
     * @param  currentPricePoint  ItemPricePointData value for currentPricePoint.
     */
    @JsonCreator
    public ItemPricePointChanged(
            @JsonProperty("item_id") int itemId,
            @JsonProperty("item_type") String itemType,
            @JsonProperty("item_handle") String itemHandle,
            @JsonProperty("item_name") String itemName,
            @JsonProperty("previous_price_point") ItemPricePointData previousPricePoint,
            @JsonProperty("current_price_point") ItemPricePointData currentPricePoint) {
        this.itemId = itemId;
        this.itemType = itemType;
        this.itemHandle = itemHandle;
        this.itemName = itemName;
        this.previousPricePoint = previousPricePoint;
        this.currentPricePoint = currentPricePoint;
    }

    /**
     * Getter for ItemId.
     * @return Returns the int
     */
    @JsonGetter("item_id")
    public int getItemId() {
        return itemId;
    }

    /**
     * Setter for ItemId.
     * @param itemId Value for int
     */
    @JsonSetter("item_id")
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    /**
     * Getter for ItemType.
     * @return Returns the String
     */
    @JsonGetter("item_type")
    public String getItemType() {
        return itemType;
    }

    /**
     * Setter for ItemType.
     * @param itemType Value for String
     */
    @JsonSetter("item_type")
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    /**
     * Getter for ItemHandle.
     * @return Returns the String
     */
    @JsonGetter("item_handle")
    public String getItemHandle() {
        return itemHandle;
    }

    /**
     * Setter for ItemHandle.
     * @param itemHandle Value for String
     */
    @JsonSetter("item_handle")
    public void setItemHandle(String itemHandle) {
        this.itemHandle = itemHandle;
    }

    /**
     * Getter for ItemName.
     * @return Returns the String
     */
    @JsonGetter("item_name")
    public String getItemName() {
        return itemName;
    }

    /**
     * Setter for ItemName.
     * @param itemName Value for String
     */
    @JsonSetter("item_name")
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * Getter for PreviousPricePoint.
     * @return Returns the ItemPricePointData
     */
    @JsonGetter("previous_price_point")
    public ItemPricePointData getPreviousPricePoint() {
        return previousPricePoint;
    }

    /**
     * Setter for PreviousPricePoint.
     * @param previousPricePoint Value for ItemPricePointData
     */
    @JsonSetter("previous_price_point")
    public void setPreviousPricePoint(ItemPricePointData previousPricePoint) {
        this.previousPricePoint = previousPricePoint;
    }

    /**
     * Getter for CurrentPricePoint.
     * @return Returns the ItemPricePointData
     */
    @JsonGetter("current_price_point")
    public ItemPricePointData getCurrentPricePoint() {
        return currentPricePoint;
    }

    /**
     * Setter for CurrentPricePoint.
     * @param currentPricePoint Value for ItemPricePointData
     */
    @JsonSetter("current_price_point")
    public void setCurrentPricePoint(ItemPricePointData currentPricePoint) {
        this.currentPricePoint = currentPricePoint;
    }

    /**
     * Converts this ItemPricePointChanged into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ItemPricePointChanged [" + "itemId=" + itemId + ", itemType=" + itemType
                + ", itemHandle=" + itemHandle + ", itemName=" + itemName + ", previousPricePoint="
                + previousPricePoint + ", currentPricePoint=" + currentPricePoint + "]";
    }

    /**
     * Builds a new {@link ItemPricePointChanged.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ItemPricePointChanged.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(itemId, itemType, itemHandle, itemName, previousPricePoint,
                currentPricePoint);
        return builder;
    }

    /**
     * Class to build instances of {@link ItemPricePointChanged}.
     */
    public static class Builder {
        private int itemId;
        private String itemType;
        private String itemHandle;
        private String itemName;
        private ItemPricePointData previousPricePoint;
        private ItemPricePointData currentPricePoint;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  itemId  int value for itemId.
         * @param  itemType  String value for itemType.
         * @param  itemHandle  String value for itemHandle.
         * @param  itemName  String value for itemName.
         * @param  previousPricePoint  ItemPricePointData value for previousPricePoint.
         * @param  currentPricePoint  ItemPricePointData value for currentPricePoint.
         */
        public Builder(int itemId, String itemType, String itemHandle, String itemName,
                ItemPricePointData previousPricePoint, ItemPricePointData currentPricePoint) {
            this.itemId = itemId;
            this.itemType = itemType;
            this.itemHandle = itemHandle;
            this.itemName = itemName;
            this.previousPricePoint = previousPricePoint;
            this.currentPricePoint = currentPricePoint;
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
         * Setter for itemType.
         * @param  itemType  String value for itemType.
         * @return Builder
         */
        public Builder itemType(String itemType) {
            this.itemType = itemType;
            return this;
        }

        /**
         * Setter for itemHandle.
         * @param  itemHandle  String value for itemHandle.
         * @return Builder
         */
        public Builder itemHandle(String itemHandle) {
            this.itemHandle = itemHandle;
            return this;
        }

        /**
         * Setter for itemName.
         * @param  itemName  String value for itemName.
         * @return Builder
         */
        public Builder itemName(String itemName) {
            this.itemName = itemName;
            return this;
        }

        /**
         * Setter for previousPricePoint.
         * @param  previousPricePoint  ItemPricePointData value for previousPricePoint.
         * @return Builder
         */
        public Builder previousPricePoint(ItemPricePointData previousPricePoint) {
            this.previousPricePoint = previousPricePoint;
            return this;
        }

        /**
         * Setter for currentPricePoint.
         * @param  currentPricePoint  ItemPricePointData value for currentPricePoint.
         * @return Builder
         */
        public Builder currentPricePoint(ItemPricePointData currentPricePoint) {
            this.currentPricePoint = currentPricePoint;
            return this;
        }

        /**
         * Builds a new {@link ItemPricePointChanged} object using the set fields.
         * @return {@link ItemPricePointChanged}
         */
        public ItemPricePointChanged build() {
            return new ItemPricePointChanged(itemId, itemType, itemHandle, itemName,
                    previousPricePoint, currentPricePoint);
        }
    }
}
