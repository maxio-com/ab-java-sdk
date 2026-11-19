/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.ComponentPricePointAssignmentComponentId;
import com.maxio.advancedbilling.models.containers.ComponentPricePointAssignmentPricePoint;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for ComponentPricePointAssignment type.
 */
public class ComponentPricePointAssignment
        extends BaseModel {
    private ComponentPricePointAssignmentComponentId componentId;
    private ComponentPricePointAssignmentPricePoint pricePoint;

    /**
     * Default constructor.
     */
    public ComponentPricePointAssignment() {
    }

    /**
     * Initialization constructor.
     * @param  componentId  ComponentPricePointAssignmentComponentId value for componentId.
     * @param  pricePoint  ComponentPricePointAssignmentPricePoint value for pricePoint.
     */
    public ComponentPricePointAssignment(
            ComponentPricePointAssignmentComponentId componentId,
            ComponentPricePointAssignmentPricePoint pricePoint) {
        this.componentId = componentId;
        this.pricePoint = pricePoint;
    }

    /**
     * Getter for ComponentId.
     * The component to update. Pass the component ID as an integer, or the component handle as a
     * string with the `handle:` prefix, for example `handle:my-component`. The response returns the
     * value in the same form that you sent.
     * @return Returns the ComponentPricePointAssignmentComponentId
     */
    @JsonGetter("component_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ComponentPricePointAssignmentComponentId getComponentId() {
        return componentId;
    }

    /**
     * Setter for ComponentId.
     * The component to update. Pass the component ID as an integer, or the component handle as a
     * string with the `handle:` prefix, for example `handle:my-component`. The response returns the
     * value in the same form that you sent.
     * @param componentId Value for ComponentPricePointAssignmentComponentId
     */
    @JsonSetter("component_id")
    public void setComponentId(ComponentPricePointAssignmentComponentId componentId) {
        this.componentId = componentId;
    }

    /**
     * Getter for PricePoint.
     * @return Returns the ComponentPricePointAssignmentPricePoint
     */
    @JsonGetter("price_point")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ComponentPricePointAssignmentPricePoint getPricePoint() {
        return pricePoint;
    }

    /**
     * Setter for PricePoint.
     * @param pricePoint Value for ComponentPricePointAssignmentPricePoint
     */
    @JsonSetter("price_point")
    public void setPricePoint(ComponentPricePointAssignmentPricePoint pricePoint) {
        this.pricePoint = pricePoint;
    }

    /**
     * Converts this ComponentPricePointAssignment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ComponentPricePointAssignment [" + "componentId=" + componentId + ", pricePoint="
                + pricePoint + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ComponentPricePointAssignment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ComponentPricePointAssignment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .componentId(getComponentId())
                .pricePoint(getPricePoint());
        return builder;
    }

    /**
     * Class to build instances of {@link ComponentPricePointAssignment}.
     */
    public static class Builder {
        private ComponentPricePointAssignmentComponentId componentId;
        private ComponentPricePointAssignmentPricePoint pricePoint;



        /**
         * Setter for componentId.
         * @param  componentId  ComponentPricePointAssignmentComponentId value for componentId.
         * @return Builder
         */
        public Builder componentId(ComponentPricePointAssignmentComponentId componentId) {
            this.componentId = componentId;
            return this;
        }

        /**
         * Setter for pricePoint.
         * @param  pricePoint  ComponentPricePointAssignmentPricePoint value for pricePoint.
         * @return Builder
         */
        public Builder pricePoint(ComponentPricePointAssignmentPricePoint pricePoint) {
            this.pricePoint = pricePoint;
            return this;
        }

        /**
         * Builds a new {@link ComponentPricePointAssignment} object using the set fields.
         * @return {@link ComponentPricePointAssignment}
         */
        public ComponentPricePointAssignment build() {
            return new ComponentPricePointAssignment(componentId, pricePoint);
        }
    }
}
