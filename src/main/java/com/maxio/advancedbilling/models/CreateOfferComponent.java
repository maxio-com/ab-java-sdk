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
 * This is a model class for CreateOfferComponent type.
 */
public class CreateOfferComponent {
    private Integer componentId;
    private Integer startingQuantity;

    /**
     * Default constructor.
     */
    public CreateOfferComponent() {
    }

    /**
     * Initialization constructor.
     * @param  componentId  Integer value for componentId.
     * @param  startingQuantity  Integer value for startingQuantity.
     */
    public CreateOfferComponent(
            Integer componentId,
            Integer startingQuantity) {
        this.componentId = componentId;
        this.startingQuantity = startingQuantity;
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
     * Getter for StartingQuantity.
     * @return Returns the Integer
     */
    @JsonGetter("starting_quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getStartingQuantity() {
        return startingQuantity;
    }

    /**
     * Setter for StartingQuantity.
     * @param startingQuantity Value for Integer
     */
    @JsonSetter("starting_quantity")
    public void setStartingQuantity(Integer startingQuantity) {
        this.startingQuantity = startingQuantity;
    }

    /**
     * Converts this CreateOfferComponent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateOfferComponent [" + "componentId=" + componentId + ", startingQuantity="
                + startingQuantity + "]";
    }

    /**
     * Builds a new {@link CreateOfferComponent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateOfferComponent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .componentId(getComponentId())
                .startingQuantity(getStartingQuantity());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateOfferComponent}.
     */
    public static class Builder {
        private Integer componentId;
        private Integer startingQuantity;



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
         * Setter for startingQuantity.
         * @param  startingQuantity  Integer value for startingQuantity.
         * @return Builder
         */
        public Builder startingQuantity(Integer startingQuantity) {
            this.startingQuantity = startingQuantity;
            return this;
        }

        /**
         * Builds a new {@link CreateOfferComponent} object using the set fields.
         * @return {@link CreateOfferComponent}
         */
        public CreateOfferComponent build() {
            return new CreateOfferComponent(componentId, startingQuantity);
        }
    }
}
