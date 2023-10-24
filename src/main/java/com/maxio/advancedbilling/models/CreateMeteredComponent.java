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
 * This is a model class for CreateMeteredComponent type.
 */
public class CreateMeteredComponent {
    private MeteredComponent meteredComponent;

    /**
     * Default constructor.
     */
    public CreateMeteredComponent() {
    }

    /**
     * Initialization constructor.
     * @param  meteredComponent  MeteredComponent value for meteredComponent.
     */
    @JsonCreator
    public CreateMeteredComponent(
            @JsonProperty("metered_component") MeteredComponent meteredComponent) {
        this.meteredComponent = meteredComponent;
    }

    /**
     * Getter for MeteredComponent.
     * @return Returns the MeteredComponent
     */
    @JsonGetter("metered_component")
    public MeteredComponent getMeteredComponent() {
        return meteredComponent;
    }

    /**
     * Setter for MeteredComponent.
     * @param meteredComponent Value for MeteredComponent
     */
    @JsonSetter("metered_component")
    public void setMeteredComponent(MeteredComponent meteredComponent) {
        this.meteredComponent = meteredComponent;
    }

    /**
     * Converts this CreateMeteredComponent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateMeteredComponent [" + "meteredComponent=" + meteredComponent + "]";
    }

    /**
     * Builds a new {@link CreateMeteredComponent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateMeteredComponent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(meteredComponent);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateMeteredComponent}.
     */
    public static class Builder {
        private MeteredComponent meteredComponent;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  meteredComponent  MeteredComponent value for meteredComponent.
         */
        public Builder(MeteredComponent meteredComponent) {
            this.meteredComponent = meteredComponent;
        }

        /**
         * Setter for meteredComponent.
         * @param  meteredComponent  MeteredComponent value for meteredComponent.
         * @return Builder
         */
        public Builder meteredComponent(MeteredComponent meteredComponent) {
            this.meteredComponent = meteredComponent;
            return this;
        }

        /**
         * Builds a new {@link CreateMeteredComponent} object using the set fields.
         * @return {@link CreateMeteredComponent}
         */
        public CreateMeteredComponent build() {
            return new CreateMeteredComponent(meteredComponent);
        }
    }
}
