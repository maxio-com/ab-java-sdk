/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ComponentResponse type.
 */
public class ComponentResponse {
    private Component component;

    /**
     * Default constructor.
     */
    public ComponentResponse() {
    }

    /**
     * Initialization constructor.
     * @param  component  Component value for component.
     */
    public ComponentResponse(
            Component component) {
        this.component = component;
    }

    /**
     * Getter for Component.
     * @return Returns the Component
     */
    @JsonGetter("component")
    public Component getComponent() {
        return component;
    }

    /**
     * Setter for Component.
     * @param component Value for Component
     */
    @JsonSetter("component")
    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * Converts this ComponentResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ComponentResponse [" + "component=" + component + "]";
    }

    /**
     * Builds a new {@link ComponentResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ComponentResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(component);
        return builder;
    }

    /**
     * Class to build instances of {@link ComponentResponse}.
     */
    public static class Builder {
        private Component component;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  component  Component value for component.
         */
        public Builder(Component component) {
            this.component = component;
        }

        /**
         * Setter for component.
         * @param  component  Component value for component.
         * @return Builder
         */
        public Builder component(Component component) {
            this.component = component;
            return this;
        }

        /**
         * Builds a new {@link ComponentResponse} object using the set fields.
         * @return {@link ComponentResponse}
         */
        public ComponentResponse build() {
            return new ComponentResponse(component);
        }
    }
}
