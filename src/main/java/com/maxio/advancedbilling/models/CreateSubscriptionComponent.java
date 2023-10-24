/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.CreateSubscriptionComponentComponentId;
import com.maxio.advancedbilling.models.containers.CreateSubscriptionComponentPricePointId;

/**
 * This is a model class for CreateSubscriptionComponent type.
 */
public class CreateSubscriptionComponent {
    private CreateSubscriptionComponentComponentId componentId;
    private Boolean enabled;
    private Integer unitBalance;
    private Integer allocatedQuantity;
    private Integer quantity;
    private CreateSubscriptionComponentPricePointId pricePointId;
    private ComponentCustomPrice customPrice;

    /**
     * Default constructor.
     */
    public CreateSubscriptionComponent() {
    }

    /**
     * Initialization constructor.
     * @param  componentId  CreateSubscriptionComponentComponentId value for componentId.
     * @param  enabled  Boolean value for enabled.
     * @param  unitBalance  Integer value for unitBalance.
     * @param  allocatedQuantity  Integer value for allocatedQuantity.
     * @param  quantity  Integer value for quantity.
     * @param  pricePointId  CreateSubscriptionComponentPricePointId value for pricePointId.
     * @param  customPrice  ComponentCustomPrice value for customPrice.
     */
    public CreateSubscriptionComponent(
            CreateSubscriptionComponentComponentId componentId,
            Boolean enabled,
            Integer unitBalance,
            Integer allocatedQuantity,
            Integer quantity,
            CreateSubscriptionComponentPricePointId pricePointId,
            ComponentCustomPrice customPrice) {
        this.componentId = componentId;
        this.enabled = enabled;
        this.unitBalance = unitBalance;
        this.allocatedQuantity = allocatedQuantity;
        this.quantity = quantity;
        this.pricePointId = pricePointId;
        this.customPrice = customPrice;
    }

    /**
     * Getter for ComponentId.
     * @return Returns the CreateSubscriptionComponentComponentId
     */
    @JsonGetter("component_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateSubscriptionComponentComponentId getComponentId() {
        return componentId;
    }

    /**
     * Setter for ComponentId.
     * @param componentId Value for CreateSubscriptionComponentComponentId
     */
    @JsonSetter("component_id")
    public void setComponentId(CreateSubscriptionComponentComponentId componentId) {
        this.componentId = componentId;
    }

    /**
     * Getter for Enabled.
     * Used for on/off components only.
     * @return Returns the Boolean
     */
    @JsonGetter("enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Setter for Enabled.
     * Used for on/off components only.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Getter for UnitBalance.
     * Used for metered and events based components.
     * @return Returns the Integer
     */
    @JsonGetter("unit_balance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getUnitBalance() {
        return unitBalance;
    }

    /**
     * Setter for UnitBalance.
     * Used for metered and events based components.
     * @param unitBalance Value for Integer
     */
    @JsonSetter("unit_balance")
    public void setUnitBalance(Integer unitBalance) {
        this.unitBalance = unitBalance;
    }

    /**
     * Getter for AllocatedQuantity.
     * Used for quantity based components.
     * @return Returns the Integer
     */
    @JsonGetter("allocated_quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAllocatedQuantity() {
        return allocatedQuantity;
    }

    /**
     * Setter for AllocatedQuantity.
     * Used for quantity based components.
     * @param allocatedQuantity Value for Integer
     */
    @JsonSetter("allocated_quantity")
    public void setAllocatedQuantity(Integer allocatedQuantity) {
        this.allocatedQuantity = allocatedQuantity;
    }

    /**
     * Getter for Quantity.
     * Deprecated. Use `allocated_quantity` instead.
     * @return Returns the Integer
     */
    @JsonGetter("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * Deprecated. Use `allocated_quantity` instead.
     * @param quantity Value for Integer
     */
    @JsonSetter("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for PricePointId.
     * @return Returns the CreateSubscriptionComponentPricePointId
     */
    @JsonGetter("price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateSubscriptionComponentPricePointId getPricePointId() {
        return pricePointId;
    }

    /**
     * Setter for PricePointId.
     * @param pricePointId Value for CreateSubscriptionComponentPricePointId
     */
    @JsonSetter("price_point_id")
    public void setPricePointId(CreateSubscriptionComponentPricePointId pricePointId) {
        this.pricePointId = pricePointId;
    }

    /**
     * Getter for CustomPrice.
     * Create or update custom pricing unique to the subscription. Used in place of
     * `price_point_id`.
     * @return Returns the ComponentCustomPrice
     */
    @JsonGetter("custom_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ComponentCustomPrice getCustomPrice() {
        return customPrice;
    }

    /**
     * Setter for CustomPrice.
     * Create or update custom pricing unique to the subscription. Used in place of
     * `price_point_id`.
     * @param customPrice Value for ComponentCustomPrice
     */
    @JsonSetter("custom_price")
    public void setCustomPrice(ComponentCustomPrice customPrice) {
        this.customPrice = customPrice;
    }

    /**
     * Converts this CreateSubscriptionComponent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateSubscriptionComponent [" + "componentId=" + componentId + ", enabled="
                + enabled + ", unitBalance=" + unitBalance + ", allocatedQuantity="
                + allocatedQuantity + ", quantity=" + quantity + ", pricePointId=" + pricePointId
                + ", customPrice=" + customPrice + "]";
    }

    /**
     * Builds a new {@link CreateSubscriptionComponent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateSubscriptionComponent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .componentId(getComponentId())
                .enabled(getEnabled())
                .unitBalance(getUnitBalance())
                .allocatedQuantity(getAllocatedQuantity())
                .quantity(getQuantity())
                .pricePointId(getPricePointId())
                .customPrice(getCustomPrice());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateSubscriptionComponent}.
     */
    public static class Builder {
        private CreateSubscriptionComponentComponentId componentId;
        private Boolean enabled;
        private Integer unitBalance;
        private Integer allocatedQuantity;
        private Integer quantity;
        private CreateSubscriptionComponentPricePointId pricePointId;
        private ComponentCustomPrice customPrice;



        /**
         * Setter for componentId.
         * @param  componentId  CreateSubscriptionComponentComponentId value for componentId.
         * @return Builder
         */
        public Builder componentId(CreateSubscriptionComponentComponentId componentId) {
            this.componentId = componentId;
            return this;
        }

        /**
         * Setter for enabled.
         * @param  enabled  Boolean value for enabled.
         * @return Builder
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Setter for unitBalance.
         * @param  unitBalance  Integer value for unitBalance.
         * @return Builder
         */
        public Builder unitBalance(Integer unitBalance) {
            this.unitBalance = unitBalance;
            return this;
        }

        /**
         * Setter for allocatedQuantity.
         * @param  allocatedQuantity  Integer value for allocatedQuantity.
         * @return Builder
         */
        public Builder allocatedQuantity(Integer allocatedQuantity) {
            this.allocatedQuantity = allocatedQuantity;
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
         * Setter for pricePointId.
         * @param  pricePointId  CreateSubscriptionComponentPricePointId value for pricePointId.
         * @return Builder
         */
        public Builder pricePointId(CreateSubscriptionComponentPricePointId pricePointId) {
            this.pricePointId = pricePointId;
            return this;
        }

        /**
         * Setter for customPrice.
         * @param  customPrice  ComponentCustomPrice value for customPrice.
         * @return Builder
         */
        public Builder customPrice(ComponentCustomPrice customPrice) {
            this.customPrice = customPrice;
            return this;
        }

        /**
         * Builds a new {@link CreateSubscriptionComponent} object using the set fields.
         * @return {@link CreateSubscriptionComponent}
         */
        public CreateSubscriptionComponent build() {
            return new CreateSubscriptionComponent(componentId, enabled, unitBalance,
                    allocatedQuantity, quantity, pricePointId, customPrice);
        }
    }
}
