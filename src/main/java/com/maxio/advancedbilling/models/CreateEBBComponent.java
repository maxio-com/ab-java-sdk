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
 * This is a model class for CreateEBBComponent type.
 */
public class CreateEBBComponent
        extends BaseModel {
    private EBBComponent eventBasedComponent;

    /**
     * Default constructor.
     */
    public CreateEBBComponent() {
    }

    /**
     * Initialization constructor.
     * @param  eventBasedComponent  EBBComponent value for eventBasedComponent.
     */
    public CreateEBBComponent(
            EBBComponent eventBasedComponent) {
        this.eventBasedComponent = eventBasedComponent;
    }

    /**
     * Getter for EventBasedComponent.
     * @return Returns the EBBComponent
     */
    @JsonGetter("event_based_component")
    public EBBComponent getEventBasedComponent() {
        return eventBasedComponent;
    }

    /**
     * Setter for EventBasedComponent.
     * @param eventBasedComponent Value for EBBComponent
     */
    @JsonSetter("event_based_component")
    public void setEventBasedComponent(EBBComponent eventBasedComponent) {
        this.eventBasedComponent = eventBasedComponent;
    }

    /**
     * Converts this CreateEBBComponent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateEBBComponent [" + "eventBasedComponent=" + eventBasedComponent
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CreateEBBComponent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateEBBComponent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(eventBasedComponent);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateEBBComponent}.
     */
    public static class Builder {
        private EBBComponent eventBasedComponent;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  eventBasedComponent  EBBComponent value for eventBasedComponent.
         */
        public Builder(EBBComponent eventBasedComponent) {
            this.eventBasedComponent = eventBasedComponent;
        }

        /**
         * Setter for eventBasedComponent.
         * @param  eventBasedComponent  EBBComponent value for eventBasedComponent.
         * @return Builder
         */
        public Builder eventBasedComponent(EBBComponent eventBasedComponent) {
            this.eventBasedComponent = eventBasedComponent;
            return this;
        }

        /**
         * Builds a new {@link CreateEBBComponent} object using the set fields.
         * @return {@link CreateEBBComponent}
         */
        public CreateEBBComponent build() {
            return new CreateEBBComponent(eventBasedComponent);
        }
    }
}
