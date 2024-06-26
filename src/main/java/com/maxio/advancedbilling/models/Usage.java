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
import com.maxio.advancedbilling.models.containers.UsageQuantity;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.time.ZonedDateTime;

/**
 * This is a model class for Usage type.
 */
public class Usage
        extends BaseModel {
    private Long id;
    private OptionalNullable<String> memo;
    private ZonedDateTime createdAt;
    private Integer pricePointId;
    private UsageQuantity quantity;
    private Integer overageQuantity;
    private Integer componentId;
    private String componentHandle;
    private Integer subscriptionId;

    /**
     * Default constructor.
     */
    public Usage() {
    }

    /**
     * Initialization constructor.
     * @param  id  Long value for id.
     * @param  memo  String value for memo.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  quantity  UsageQuantity value for quantity.
     * @param  overageQuantity  Integer value for overageQuantity.
     * @param  componentId  Integer value for componentId.
     * @param  componentHandle  String value for componentHandle.
     * @param  subscriptionId  Integer value for subscriptionId.
     */
    public Usage(
            Long id,
            String memo,
            ZonedDateTime createdAt,
            Integer pricePointId,
            UsageQuantity quantity,
            Integer overageQuantity,
            Integer componentId,
            String componentHandle,
            Integer subscriptionId) {
        this.id = id;
        this.memo = OptionalNullable.of(memo);
        this.createdAt = createdAt;
        this.pricePointId = pricePointId;
        this.quantity = quantity;
        this.overageQuantity = overageQuantity;
        this.componentId = componentId;
        this.componentHandle = componentHandle;
        this.subscriptionId = subscriptionId;
    }

    /**
     * Initialization constructor.
     * @param  id  Long value for id.
     * @param  memo  String value for memo.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  quantity  UsageQuantity value for quantity.
     * @param  overageQuantity  Integer value for overageQuantity.
     * @param  componentId  Integer value for componentId.
     * @param  componentHandle  String value for componentHandle.
     * @param  subscriptionId  Integer value for subscriptionId.
     */

    protected Usage(Long id, OptionalNullable<String> memo, ZonedDateTime createdAt,
            Integer pricePointId, UsageQuantity quantity, Integer overageQuantity,
            Integer componentId, String componentHandle, Integer subscriptionId) {
        this.id = id;
        this.memo = memo;
        this.createdAt = createdAt;
        this.pricePointId = pricePointId;
        this.quantity = quantity;
        this.overageQuantity = overageQuantity;
        this.componentId = componentId;
        this.componentHandle = componentHandle;
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for Id.
     * @return Returns the Long
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Long
     */
    @JsonSetter("id")
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Internal Getter for Memo.
     * @return Returns the Internal String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetMemo() {
        return this.memo;
    }

    /**
     * Getter for Memo.
     * @return Returns the String
     */
    public String getMemo() {
        return OptionalNullable.getFrom(memo);
    }

    /**
     * Setter for Memo.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = OptionalNullable.of(memo);
    }

    /**
     * UnSetter for Memo.
     */
    public void unsetMemo() {
        memo = null;
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
     * Getter for Quantity.
     * @return Returns the UsageQuantity
     */
    @JsonGetter("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UsageQuantity getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * @param quantity Value for UsageQuantity
     */
    @JsonSetter("quantity")
    public void setQuantity(UsageQuantity quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for OverageQuantity.
     * @return Returns the Integer
     */
    @JsonGetter("overage_quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getOverageQuantity() {
        return overageQuantity;
    }

    /**
     * Setter for OverageQuantity.
     * @param overageQuantity Value for Integer
     */
    @JsonSetter("overage_quantity")
    public void setOverageQuantity(Integer overageQuantity) {
        this.overageQuantity = overageQuantity;
    }

    /**
     * Getter for ComponentId.
     * @return Returns the Integer
     */
    @JsonGetter("component_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getComponentId() {
        return componentId;
    }

    /**
     * Setter for ComponentId.
     * @param componentId Value for Integer
     */
    @JsonSetter("component_id")
    public void setComponentId(Integer componentId) {
        this.componentId = componentId;
    }

    /**
     * Getter for ComponentHandle.
     * @return Returns the String
     */
    @JsonGetter("component_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getComponentHandle() {
        return componentHandle;
    }

    /**
     * Setter for ComponentHandle.
     * @param componentHandle Value for String
     */
    @JsonSetter("component_handle")
    public void setComponentHandle(String componentHandle) {
        this.componentHandle = componentHandle;
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
     * Converts this Usage into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Usage [" + "id=" + id + ", memo=" + memo + ", createdAt=" + createdAt
                + ", pricePointId=" + pricePointId + ", quantity=" + quantity + ", overageQuantity="
                + overageQuantity + ", componentId=" + componentId + ", componentHandle="
                + componentHandle + ", subscriptionId=" + subscriptionId + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Usage.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Usage.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .createdAt(getCreatedAt())
                .pricePointId(getPricePointId())
                .quantity(getQuantity())
                .overageQuantity(getOverageQuantity())
                .componentId(getComponentId())
                .componentHandle(getComponentHandle())
                .subscriptionId(getSubscriptionId());
        builder.memo = internalGetMemo();
        return builder;
    }

    /**
     * Class to build instances of {@link Usage}.
     */
    public static class Builder {
        private Long id;
        private OptionalNullable<String> memo;
        private ZonedDateTime createdAt;
        private Integer pricePointId;
        private UsageQuantity quantity;
        private Integer overageQuantity;
        private Integer componentId;
        private String componentHandle;
        private Integer subscriptionId;



        /**
         * Setter for id.
         * @param  id  Long value for id.
         * @return Builder
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for memo.
         * @param  memo  String value for memo.
         * @return Builder
         */
        public Builder memo(String memo) {
            this.memo = OptionalNullable.of(memo);
            return this;
        }

        /**
         * UnSetter for memo.
         * @return Builder
         */
        public Builder unsetMemo() {
            memo = null;
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
         * @param  quantity  UsageQuantity value for quantity.
         * @return Builder
         */
        public Builder quantity(UsageQuantity quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Setter for overageQuantity.
         * @param  overageQuantity  Integer value for overageQuantity.
         * @return Builder
         */
        public Builder overageQuantity(Integer overageQuantity) {
            this.overageQuantity = overageQuantity;
            return this;
        }

        /**
         * Setter for componentId.
         * @param  componentId  Integer value for componentId.
         * @return Builder
         */
        public Builder componentId(Integer componentId) {
            this.componentId = componentId;
            return this;
        }

        /**
         * Setter for componentHandle.
         * @param  componentHandle  String value for componentHandle.
         * @return Builder
         */
        public Builder componentHandle(String componentHandle) {
            this.componentHandle = componentHandle;
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
         * Builds a new {@link Usage} object using the set fields.
         * @return {@link Usage}
         */
        public Usage build() {
            return new Usage(id, memo, createdAt, pricePointId, quantity, overageQuantity,
                    componentId, componentHandle, subscriptionId);
        }
    }
}
