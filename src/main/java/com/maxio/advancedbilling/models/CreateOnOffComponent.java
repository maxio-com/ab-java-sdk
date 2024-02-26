/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for CreateOnOffComponent type.
 */
public class CreateOnOffComponent
        extends BaseModel {
    private OnOffComponent onOffComponent;

    /**
     * Default constructor.
     */
    public CreateOnOffComponent() {
    }

    /**
     * Initialization constructor.
     * @param  onOffComponent  OnOffComponent value for onOffComponent.
     */
    public CreateOnOffComponent(
            OnOffComponent onOffComponent) {
        this.onOffComponent = onOffComponent;
    }

    /**
     * Getter for OnOffComponent.
     * @return Returns the OnOffComponent
     */
    @JsonGetter("on_off_component")
    public OnOffComponent getOnOffComponent() {
        return onOffComponent;
    }

    /**
     * Setter for OnOffComponent.
     * @param onOffComponent Value for OnOffComponent
     */
    @JsonSetter("on_off_component")
    public void setOnOffComponent(OnOffComponent onOffComponent) {
        this.onOffComponent = onOffComponent;
    }

    /**
     * Converts this CreateOnOffComponent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateOnOffComponent [" + "onOffComponent=" + onOffComponent
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CreateOnOffComponent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateOnOffComponent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(onOffComponent);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateOnOffComponent}.
     */
    public static class Builder {
        private OnOffComponent onOffComponent;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  onOffComponent  OnOffComponent value for onOffComponent.
         */
        public Builder(OnOffComponent onOffComponent) {
            this.onOffComponent = onOffComponent;
        }

        /**
         * Setter for onOffComponent.
         * @param  onOffComponent  OnOffComponent value for onOffComponent.
         * @return Builder
         */
        public Builder onOffComponent(OnOffComponent onOffComponent) {
            this.onOffComponent = onOffComponent;
            return this;
        }

        /**
         * Builds a new {@link CreateOnOffComponent} object using the set fields.
         * @return {@link CreateOnOffComponent}
         */
        public CreateOnOffComponent build() {
            return new CreateOnOffComponent(onOffComponent);
        }
    }
}
