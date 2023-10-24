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
 * This is a model class for CreateQuantityBasedComponent type.
 */
public class CreateQuantityBasedComponent {
    private QuantityBasedComponent quantityBasedComponent;

    /**
     * Default constructor.
     */
    public CreateQuantityBasedComponent() {
    }

    /**
     * Initialization constructor.
     * @param  quantityBasedComponent  QuantityBasedComponent value for quantityBasedComponent.
     */
    @JsonCreator
    public CreateQuantityBasedComponent(
            @JsonProperty("quantity_based_component") QuantityBasedComponent quantityBasedComponent) {
        this.quantityBasedComponent = quantityBasedComponent;
    }

    /**
     * Getter for QuantityBasedComponent.
     * @return Returns the QuantityBasedComponent
     */
    @JsonGetter("quantity_based_component")
    public QuantityBasedComponent getQuantityBasedComponent() {
        return quantityBasedComponent;
    }

    /**
     * Setter for QuantityBasedComponent.
     * @param quantityBasedComponent Value for QuantityBasedComponent
     */
    @JsonSetter("quantity_based_component")
    public void setQuantityBasedComponent(QuantityBasedComponent quantityBasedComponent) {
        this.quantityBasedComponent = quantityBasedComponent;
    }

    /**
     * Converts this CreateQuantityBasedComponent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateQuantityBasedComponent [" + "quantityBasedComponent=" + quantityBasedComponent
                + "]";
    }

    /**
     * Builds a new {@link CreateQuantityBasedComponent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateQuantityBasedComponent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(quantityBasedComponent);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateQuantityBasedComponent}.
     */
    public static class Builder {
        private QuantityBasedComponent quantityBasedComponent;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  quantityBasedComponent  QuantityBasedComponent value for quantityBasedComponent.
         */
        public Builder(QuantityBasedComponent quantityBasedComponent) {
            this.quantityBasedComponent = quantityBasedComponent;
        }

        /**
         * Setter for quantityBasedComponent.
         * @param  quantityBasedComponent  QuantityBasedComponent value for quantityBasedComponent.
         * @return Builder
         */
        public Builder quantityBasedComponent(QuantityBasedComponent quantityBasedComponent) {
            this.quantityBasedComponent = quantityBasedComponent;
            return this;
        }

        /**
         * Builds a new {@link CreateQuantityBasedComponent} object using the set fields.
         * @return {@link CreateQuantityBasedComponent}
         */
        public CreateQuantityBasedComponent build() {
            return new CreateQuantityBasedComponent(quantityBasedComponent);
        }
    }
}
