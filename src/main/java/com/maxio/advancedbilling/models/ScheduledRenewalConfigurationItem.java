/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.ZonedDateTime;

/**
 * This is a model class for ScheduledRenewalConfigurationItem type.
 */
public class ScheduledRenewalConfigurationItem
        extends BaseModel {
    private Integer id;
    private Integer subscriptionId;
    private Integer subscriptionRenewalConfigurationId;
    private Integer itemId;
    private String itemType;
    private String itemSubclass;
    private Integer pricePointId;
    private String pricePointType;
    private Integer quantity;
    private String decimalQuantity;
    private ZonedDateTime createdAt;

    /**
     * Default constructor.
     */
    public ScheduledRenewalConfigurationItem() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  subscriptionRenewalConfigurationId  Integer value for
     *         subscriptionRenewalConfigurationId.
     * @param  itemId  Integer value for itemId.
     * @param  itemType  String value for itemType.
     * @param  itemSubclass  String value for itemSubclass.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  pricePointType  String value for pricePointType.
     * @param  quantity  Integer value for quantity.
     * @param  decimalQuantity  String value for decimalQuantity.
     * @param  createdAt  ZonedDateTime value for createdAt.
     */
    public ScheduledRenewalConfigurationItem(
            Integer id,
            Integer subscriptionId,
            Integer subscriptionRenewalConfigurationId,
            Integer itemId,
            String itemType,
            String itemSubclass,
            Integer pricePointId,
            String pricePointType,
            Integer quantity,
            String decimalQuantity,
            ZonedDateTime createdAt) {
        this.id = id;
        this.subscriptionId = subscriptionId;
        this.subscriptionRenewalConfigurationId = subscriptionRenewalConfigurationId;
        this.itemId = itemId;
        this.itemType = itemType;
        this.itemSubclass = itemSubclass;
        this.pricePointId = pricePointId;
        this.pricePointType = pricePointType;
        this.quantity = quantity;
        this.decimalQuantity = decimalQuantity;
        this.createdAt = createdAt;
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
     * Getter for SubscriptionId.
     * @return Returns the Integer
     */
    @JsonGetter("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * @param subscriptionId Value for Integer
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for SubscriptionRenewalConfigurationId.
     * @return Returns the Integer
     */
    @JsonGetter("subscription_renewal_configuration_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscriptionRenewalConfigurationId() {
        return subscriptionRenewalConfigurationId;
    }

    /**
     * Setter for SubscriptionRenewalConfigurationId.
     * @param subscriptionRenewalConfigurationId Value for Integer
     */
    @JsonSetter("subscription_renewal_configuration_id")
    public void setSubscriptionRenewalConfigurationId(Integer subscriptionRenewalConfigurationId) {
        this.subscriptionRenewalConfigurationId = subscriptionRenewalConfigurationId;
    }

    /**
     * Getter for ItemId.
     * @return Returns the Integer
     */
    @JsonGetter("item_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getItemId() {
        return itemId;
    }

    /**
     * Setter for ItemId.
     * @param itemId Value for Integer
     */
    @JsonSetter("item_id")
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * Getter for ItemType.
     * @return Returns the String
     */
    @JsonGetter("item_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for ItemSubclass.
     * @return Returns the String
     */
    @JsonGetter("item_subclass")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getItemSubclass() {
        return itemSubclass;
    }

    /**
     * Setter for ItemSubclass.
     * @param itemSubclass Value for String
     */
    @JsonSetter("item_subclass")
    public void setItemSubclass(String itemSubclass) {
        this.itemSubclass = itemSubclass;
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
     * Getter for PricePointType.
     * @return Returns the String
     */
    @JsonGetter("price_point_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPricePointType() {
        return pricePointType;
    }

    /**
     * Setter for PricePointType.
     * @param pricePointType Value for String
     */
    @JsonSetter("price_point_type")
    public void setPricePointType(String pricePointType) {
        this.pricePointType = pricePointType;
    }

    /**
     * Getter for Quantity.
     * @return Returns the Integer
     */
    @JsonGetter("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * @param quantity Value for Integer
     */
    @JsonSetter("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for DecimalQuantity.
     * @return Returns the String
     */
    @JsonGetter("decimal_quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDecimalQuantity() {
        return decimalQuantity;
    }

    /**
     * Setter for DecimalQuantity.
     * @param decimalQuantity Value for String
     */
    @JsonSetter("decimal_quantity")
    public void setDecimalQuantity(String decimalQuantity) {
        this.decimalQuantity = decimalQuantity;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for ZonedDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Converts this ScheduledRenewalConfigurationItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ScheduledRenewalConfigurationItem [" + "id=" + id + ", subscriptionId="
                + subscriptionId + ", subscriptionRenewalConfigurationId="
                + subscriptionRenewalConfigurationId + ", itemId=" + itemId + ", itemType="
                + itemType + ", itemSubclass=" + itemSubclass + ", pricePointId=" + pricePointId
                + ", pricePointType=" + pricePointType + ", quantity=" + quantity
                + ", decimalQuantity=" + decimalQuantity + ", createdAt=" + createdAt
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ScheduledRenewalConfigurationItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ScheduledRenewalConfigurationItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .subscriptionId(getSubscriptionId())
                .subscriptionRenewalConfigurationId(getSubscriptionRenewalConfigurationId())
                .itemId(getItemId())
                .itemType(getItemType())
                .itemSubclass(getItemSubclass())
                .pricePointId(getPricePointId())
                .pricePointType(getPricePointType())
                .quantity(getQuantity())
                .decimalQuantity(getDecimalQuantity())
                .createdAt(getCreatedAt());
        return builder;
    }

    /**
     * Class to build instances of {@link ScheduledRenewalConfigurationItem}.
     */
    public static class Builder {
        private Integer id;
        private Integer subscriptionId;
        private Integer subscriptionRenewalConfigurationId;
        private Integer itemId;
        private String itemType;
        private String itemSubclass;
        private Integer pricePointId;
        private String pricePointType;
        private Integer quantity;
        private String decimalQuantity;
        private ZonedDateTime createdAt;



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
         * Setter for subscriptionId.
         * @param  subscriptionId  Integer value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(Integer subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setter for subscriptionRenewalConfigurationId.
         * @param  subscriptionRenewalConfigurationId  Integer value for
         *         subscriptionRenewalConfigurationId.
         * @return Builder
         */
        public Builder subscriptionRenewalConfigurationId(
                Integer subscriptionRenewalConfigurationId) {
            this.subscriptionRenewalConfigurationId = subscriptionRenewalConfigurationId;
            return this;
        }

        /**
         * Setter for itemId.
         * @param  itemId  Integer value for itemId.
         * @return Builder
         */
        public Builder itemId(Integer itemId) {
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
         * Setter for itemSubclass.
         * @param  itemSubclass  String value for itemSubclass.
         * @return Builder
         */
        public Builder itemSubclass(String itemSubclass) {
            this.itemSubclass = itemSubclass;
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
         * Setter for pricePointType.
         * @param  pricePointType  String value for pricePointType.
         * @return Builder
         */
        public Builder pricePointType(String pricePointType) {
            this.pricePointType = pricePointType;
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
         * Setter for decimalQuantity.
         * @param  decimalQuantity  String value for decimalQuantity.
         * @return Builder
         */
        public Builder decimalQuantity(String decimalQuantity) {
            this.decimalQuantity = decimalQuantity;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  ZonedDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Builds a new {@link ScheduledRenewalConfigurationItem} object using the set fields.
         * @return {@link ScheduledRenewalConfigurationItem}
         */
        public ScheduledRenewalConfigurationItem build() {
            return new ScheduledRenewalConfigurationItem(id, subscriptionId,
                    subscriptionRenewalConfigurationId, itemId, itemType, itemSubclass,
                    pricePointId, pricePointType, quantity, decimalQuantity, createdAt);
        }
    }
}
