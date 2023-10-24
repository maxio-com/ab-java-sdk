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
 * This is a model class for UpdateSubscriptionComponent type.
 */
public class UpdateSubscriptionComponent {
    private Integer componentId;
    private ComponentCustomPrice customPrice;

    /**
     * Default constructor.
     */
    public UpdateSubscriptionComponent() {
    }

    /**
     * Initialization constructor.
     * @param  componentId  Integer value for componentId.
     * @param  customPrice  ComponentCustomPrice value for customPrice.
     */
    public UpdateSubscriptionComponent(
            Integer componentId,
            ComponentCustomPrice customPrice) {
        this.componentId = componentId;
        this.customPrice = customPrice;
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
     * Converts this UpdateSubscriptionComponent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateSubscriptionComponent [" + "componentId=" + componentId + ", customPrice="
                + customPrice + "]";
    }

    /**
     * Builds a new {@link UpdateSubscriptionComponent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateSubscriptionComponent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .componentId(getComponentId())
                .customPrice(getCustomPrice());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateSubscriptionComponent}.
     */
    public static class Builder {
        private Integer componentId;
        private ComponentCustomPrice customPrice;



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
         * Setter for customPrice.
         * @param  customPrice  ComponentCustomPrice value for customPrice.
         * @return Builder
         */
        public Builder customPrice(ComponentCustomPrice customPrice) {
            this.customPrice = customPrice;
            return this;
        }

        /**
         * Builds a new {@link UpdateSubscriptionComponent} object using the set fields.
         * @return {@link UpdateSubscriptionComponent}
         */
        public UpdateSubscriptionComponent build() {
            return new UpdateSubscriptionComponent(componentId, customPrice);
        }
    }
}
