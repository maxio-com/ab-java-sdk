/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.ComponentSPricePointAssignmentPricePoint;

/**
 * This is a model class for ComponentSPricePointAssignment type.
 */
public class ComponentSPricePointAssignment {
    private Integer componentId;
    private ComponentSPricePointAssignmentPricePoint pricePoint;

    /**
     * Default constructor.
     */
    public ComponentSPricePointAssignment() {
    }

    /**
     * Initialization constructor.
     * @param  componentId  Integer value for componentId.
     * @param  pricePoint  ComponentSPricePointAssignmentPricePoint value for pricePoint.
     */
    public ComponentSPricePointAssignment(
            Integer componentId,
            ComponentSPricePointAssignmentPricePoint pricePoint) {
        this.componentId = componentId;
        this.pricePoint = pricePoint;
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
     * Getter for PricePoint.
     * @return Returns the ComponentSPricePointAssignmentPricePoint
     */
    @JsonGetter("price_point")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ComponentSPricePointAssignmentPricePoint getPricePoint() {
        return pricePoint;
    }

    /**
     * Setter for PricePoint.
     * @param pricePoint Value for ComponentSPricePointAssignmentPricePoint
     */
    @JsonSetter("price_point")
    public void setPricePoint(ComponentSPricePointAssignmentPricePoint pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Converts this ComponentSPricePointAssignment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ComponentSPricePointAssignment [" + "componentId=" + componentId + ", pricePoint="
                + pricePoint + "]";
    }

    /**
     * Builds a new {@link ComponentSPricePointAssignment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ComponentSPricePointAssignment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .componentId(getComponentId())
                .pricePoint(getPricePoint());
        return builder;
    }

    /**
     * Class to build instances of {@link ComponentSPricePointAssignment}.
     */
    public static class Builder {
        private Integer componentId;
        private ComponentSPricePointAssignmentPricePoint pricePoint;



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
         * Setter for pricePoint.
         * @param  pricePoint  ComponentSPricePointAssignmentPricePoint value for pricePoint.
         * @return Builder
         */
        public Builder pricePoint(ComponentSPricePointAssignmentPricePoint pricePoint) {
            this.pricePoint = pricePoint;
            return this;
        }

        /**
         * Builds a new {@link ComponentSPricePointAssignment} object using the set fields.
         * @return {@link ComponentSPricePointAssignment}
         */
        public ComponentSPricePointAssignment build() {
            return new ComponentSPricePointAssignment(componentId, pricePoint);
        }
    }
}
