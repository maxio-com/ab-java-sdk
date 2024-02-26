/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.SubscriptionGroupSignupComponentAllocatedQuantity;
import com.maxio.advancedbilling.models.containers.SubscriptionGroupSignupComponentComponentId;
import com.maxio.advancedbilling.models.containers.SubscriptionGroupSignupComponentPricePointId;
import com.maxio.advancedbilling.models.containers.SubscriptionGroupSignupComponentUnitBalance;

/**
 * This is a model class for SubscriptionGroupSignupComponent type.
 */
public class SubscriptionGroupSignupComponent {
    private SubscriptionGroupSignupComponentComponentId componentId;
    private SubscriptionGroupSignupComponentAllocatedQuantity allocatedQuantity;
    private SubscriptionGroupSignupComponentUnitBalance unitBalance;
    private SubscriptionGroupSignupComponentPricePointId pricePointId;
    private SubscriptionGroupComponentCustomPrice customPrice;

    /**
     * Default constructor.
     */
    public SubscriptionGroupSignupComponent() {
    }

    /**
     * Initialization constructor.
     * @param  componentId  SubscriptionGroupSignupComponentComponentId value for componentId.
     * @param  allocatedQuantity  SubscriptionGroupSignupComponentAllocatedQuantity value for
     *         allocatedQuantity.
     * @param  unitBalance  SubscriptionGroupSignupComponentUnitBalance value for unitBalance.
     * @param  pricePointId  SubscriptionGroupSignupComponentPricePointId value for pricePointId.
     * @param  customPrice  SubscriptionGroupComponentCustomPrice value for customPrice.
     */
    public SubscriptionGroupSignupComponent(
            SubscriptionGroupSignupComponentComponentId componentId,
            SubscriptionGroupSignupComponentAllocatedQuantity allocatedQuantity,
            SubscriptionGroupSignupComponentUnitBalance unitBalance,
            SubscriptionGroupSignupComponentPricePointId pricePointId,
            SubscriptionGroupComponentCustomPrice customPrice) {
        this.componentId = componentId;
        this.allocatedQuantity = allocatedQuantity;
        this.unitBalance = unitBalance;
        this.pricePointId = pricePointId;
        this.customPrice = customPrice;
    }

    /**
     * Getter for ComponentId.
     * Required if passing any component to `components` attribute.
     * @return Returns the SubscriptionGroupSignupComponentComponentId
     */
    @JsonGetter("component_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionGroupSignupComponentComponentId getComponentId() {
        return componentId;
    }

    /**
     * Setter for ComponentId.
     * Required if passing any component to `components` attribute.
     * @param componentId Value for SubscriptionGroupSignupComponentComponentId
     */
    @JsonSetter("component_id")
    public void setComponentId(SubscriptionGroupSignupComponentComponentId componentId) {
        this.componentId = componentId;
    }

    /**
     * Getter for AllocatedQuantity.
     * @return Returns the SubscriptionGroupSignupComponentAllocatedQuantity
     */
    @JsonGetter("allocated_quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionGroupSignupComponentAllocatedQuantity getAllocatedQuantity() {
        return allocatedQuantity;
    }

    /**
     * Setter for AllocatedQuantity.
     * @param allocatedQuantity Value for SubscriptionGroupSignupComponentAllocatedQuantity
     */
    @JsonSetter("allocated_quantity")
    public void setAllocatedQuantity(SubscriptionGroupSignupComponentAllocatedQuantity allocatedQuantity) {
        this.allocatedQuantity = allocatedQuantity;
    }

    /**
     * Getter for UnitBalance.
     * @return Returns the SubscriptionGroupSignupComponentUnitBalance
     */
    @JsonGetter("unit_balance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionGroupSignupComponentUnitBalance getUnitBalance() {
        return unitBalance;
    }

    /**
     * Setter for UnitBalance.
     * @param unitBalance Value for SubscriptionGroupSignupComponentUnitBalance
     */
    @JsonSetter("unit_balance")
    public void setUnitBalance(SubscriptionGroupSignupComponentUnitBalance unitBalance) {
        this.unitBalance = unitBalance;
    }

    /**
     * Getter for PricePointId.
     * @return Returns the SubscriptionGroupSignupComponentPricePointId
     */
    @JsonGetter("price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionGroupSignupComponentPricePointId getPricePointId() {
        return pricePointId;
    }

    /**
     * Setter for PricePointId.
     * @param pricePointId Value for SubscriptionGroupSignupComponentPricePointId
     */
    @JsonSetter("price_point_id")
    public void setPricePointId(SubscriptionGroupSignupComponentPricePointId pricePointId) {
        this.pricePointId = pricePointId;
    }

    /**
     * Getter for CustomPrice.
     * Used in place of `price_point_id` to define a custom price point unique to the subscription.
     * You still need to provide `component_id`.
     * @return Returns the SubscriptionGroupComponentCustomPrice
     */
    @JsonGetter("custom_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionGroupComponentCustomPrice getCustomPrice() {
        return customPrice;
    }

    /**
     * Setter for CustomPrice.
     * Used in place of `price_point_id` to define a custom price point unique to the subscription.
     * You still need to provide `component_id`.
     * @param customPrice Value for SubscriptionGroupComponentCustomPrice
     */
    @JsonSetter("custom_price")
    public void setCustomPrice(SubscriptionGroupComponentCustomPrice customPrice) {
        this.customPrice = customPrice;
    }

    /**
     * Converts this SubscriptionGroupSignupComponent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupSignupComponent [" + "componentId=" + componentId
                + ", allocatedQuantity=" + allocatedQuantity + ", unitBalance=" + unitBalance
                + ", pricePointId=" + pricePointId + ", customPrice=" + customPrice + "]";
    }

    /**
     * Builds a new {@link SubscriptionGroupSignupComponent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionGroupSignupComponent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .componentId(getComponentId())
                .allocatedQuantity(getAllocatedQuantity())
                .unitBalance(getUnitBalance())
                .pricePointId(getPricePointId())
                .customPrice(getCustomPrice());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupSignupComponent}.
     */
    public static class Builder {
        private SubscriptionGroupSignupComponentComponentId componentId;
        private SubscriptionGroupSignupComponentAllocatedQuantity allocatedQuantity;
        private SubscriptionGroupSignupComponentUnitBalance unitBalance;
        private SubscriptionGroupSignupComponentPricePointId pricePointId;
        private SubscriptionGroupComponentCustomPrice customPrice;



        /**
         * Setter for componentId.
         * @param  componentId  SubscriptionGroupSignupComponentComponentId value for componentId.
         * @return Builder
         */
        public Builder componentId(SubscriptionGroupSignupComponentComponentId componentId) {
            this.componentId = componentId;
            return this;
        }

        /**
         * Setter for allocatedQuantity.
         * @param  allocatedQuantity  SubscriptionGroupSignupComponentAllocatedQuantity value for
         *         allocatedQuantity.
         * @return Builder
         */
        public Builder allocatedQuantity(
                SubscriptionGroupSignupComponentAllocatedQuantity allocatedQuantity) {
            this.allocatedQuantity = allocatedQuantity;
            return this;
        }

        /**
         * Setter for unitBalance.
         * @param  unitBalance  SubscriptionGroupSignupComponentUnitBalance value for unitBalance.
         * @return Builder
         */
        public Builder unitBalance(SubscriptionGroupSignupComponentUnitBalance unitBalance) {
            this.unitBalance = unitBalance;
            return this;
        }

        /**
         * Setter for pricePointId.
         * @param  pricePointId  SubscriptionGroupSignupComponentPricePointId value for
         *         pricePointId.
         * @return Builder
         */
        public Builder pricePointId(SubscriptionGroupSignupComponentPricePointId pricePointId) {
            this.pricePointId = pricePointId;
            return this;
        }

        /**
         * Setter for customPrice.
         * @param  customPrice  SubscriptionGroupComponentCustomPrice value for customPrice.
         * @return Builder
         */
        public Builder customPrice(SubscriptionGroupComponentCustomPrice customPrice) {
            this.customPrice = customPrice;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroupSignupComponent} object using the set fields.
         * @return {@link SubscriptionGroupSignupComponent}
         */
        public SubscriptionGroupSignupComponent build() {
            return new SubscriptionGroupSignupComponent(componentId, allocatedQuantity, unitBalance,
                    pricePointId, customPrice);
        }
    }
}
