/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.RenewalPreviewComponentComponentId;
import com.maxio.advancedbilling.models.containers.RenewalPreviewComponentPricePointId;

/**
 * This is a model class for RenewalPreviewComponent type.
 */
public class RenewalPreviewComponent {
    private RenewalPreviewComponentComponentId componentId;
    private Integer quantity;
    private RenewalPreviewComponentPricePointId pricePointId;

    /**
     * Default constructor.
     */
    public RenewalPreviewComponent() {
    }

    /**
     * Initialization constructor.
     * @param  componentId  RenewalPreviewComponentComponentId value for componentId.
     * @param  quantity  Integer value for quantity.
     * @param  pricePointId  RenewalPreviewComponentPricePointId value for pricePointId.
     */
    public RenewalPreviewComponent(
            RenewalPreviewComponentComponentId componentId,
            Integer quantity,
            RenewalPreviewComponentPricePointId pricePointId) {
        this.componentId = componentId;
        this.quantity = quantity;
        this.pricePointId = pricePointId;
    }

    /**
     * Getter for ComponentId.
     * Either the component's Chargify id or its handle prefixed with `handle:`
     * @return Returns the RenewalPreviewComponentComponentId
     */
    @JsonGetter("component_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RenewalPreviewComponentComponentId getComponentId() {
        return componentId;
    }

    /**
     * Setter for ComponentId.
     * Either the component's Chargify id or its handle prefixed with `handle:`
     * @param componentId Value for RenewalPreviewComponentComponentId
     */
    @JsonSetter("component_id")
    public void setComponentId(RenewalPreviewComponentComponentId componentId) {
        this.componentId = componentId;
    }

    /**
     * Getter for Quantity.
     * The quantity for which you wish to preview billing. This is useful if you want to preview a
     * predicted, higher usage value than is currently present on the subscription. This quantity
     * represents: - Whether or not an on/off component is enabled - use 0 for disabled or 1 for
     * enabled - The desired allocated_quantity for a quantity-based component - The desired
     * unit_balance for a metered component - The desired metric quantity for an events-based
     * component
     * @return Returns the Integer
     */
    @JsonGetter("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * The quantity for which you wish to preview billing. This is useful if you want to preview a
     * predicted, higher usage value than is currently present on the subscription. This quantity
     * represents: - Whether or not an on/off component is enabled - use 0 for disabled or 1 for
     * enabled - The desired allocated_quantity for a quantity-based component - The desired
     * unit_balance for a metered component - The desired metric quantity for an events-based
     * component
     * @param quantity Value for Integer
     */
    @JsonSetter("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for PricePointId.
     * Either the component price point's Chargify id or its handle prefixed with `handle:`
     * @return Returns the RenewalPreviewComponentPricePointId
     */
    @JsonGetter("price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RenewalPreviewComponentPricePointId getPricePointId() {
        return pricePointId;
    }

    /**
     * Setter for PricePointId.
     * Either the component price point's Chargify id or its handle prefixed with `handle:`
     * @param pricePointId Value for RenewalPreviewComponentPricePointId
     */
    @JsonSetter("price_point_id")
    public void setPricePointId(RenewalPreviewComponentPricePointId pricePointId) {
        this.pricePointId = pricePointId;
    }

    /**
     * Converts this RenewalPreviewComponent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RenewalPreviewComponent [" + "componentId=" + componentId + ", quantity=" + quantity
                + ", pricePointId=" + pricePointId + "]";
    }

    /**
     * Builds a new {@link RenewalPreviewComponent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RenewalPreviewComponent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .componentId(getComponentId())
                .quantity(getQuantity())
                .pricePointId(getPricePointId());
        return builder;
    }

    /**
     * Class to build instances of {@link RenewalPreviewComponent}.
     */
    public static class Builder {
        private RenewalPreviewComponentComponentId componentId;
        private Integer quantity;
        private RenewalPreviewComponentPricePointId pricePointId;



        /**
         * Setter for componentId.
         * @param  componentId  RenewalPreviewComponentComponentId value for componentId.
         * @return Builder
         */
        public Builder componentId(RenewalPreviewComponentComponentId componentId) {
            this.componentId = componentId;
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
         * @param  pricePointId  RenewalPreviewComponentPricePointId value for pricePointId.
         * @return Builder
         */
        public Builder pricePointId(RenewalPreviewComponentPricePointId pricePointId) {
            this.pricePointId = pricePointId;
            return this;
        }

        /**
         * Builds a new {@link RenewalPreviewComponent} object using the set fields.
         * @return {@link RenewalPreviewComponent}
         */
        public RenewalPreviewComponent build() {
            return new RenewalPreviewComponent(componentId, quantity, pricePointId);
        }
    }
}
