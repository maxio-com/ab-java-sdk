/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UpdateComponentRequest type.
 */
public class UpdateComponentRequest {
    private UpdateComponent component;

    /**
     * Default constructor.
     */
    public UpdateComponentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  component  UpdateComponent value for component.
     */
    public UpdateComponentRequest(
            UpdateComponent component) {
        this.component = component;
    }

    /**
     * Getter for Component.
     * @return Returns the UpdateComponent
     */
    @JsonGetter("component")
    public UpdateComponent getComponent() {
        return component;
    }

    /**
     * Setter for Component.
     * @param component Value for UpdateComponent
     */
    @JsonSetter("component")
    public void setComponent(UpdateComponent component) {
        this.component = component;
    }

    /**
     * Converts this UpdateComponentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateComponentRequest [" + "component=" + component + "]";
    }

    /**
     * Builds a new {@link UpdateComponentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateComponentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(component);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateComponentRequest}.
     */
    public static class Builder {
        private UpdateComponent component;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  component  UpdateComponent value for component.
         */
        public Builder(UpdateComponent component) {
            this.component = component;
        }

        /**
         * Setter for component.
         * @param  component  UpdateComponent value for component.
         * @return Builder
         */
        public Builder component(UpdateComponent component) {
            this.component = component;
            return this;
        }

        /**
         * Builds a new {@link UpdateComponentRequest} object using the set fields.
         * @return {@link UpdateComponentRequest}
         */
        public UpdateComponentRequest build() {
            return new UpdateComponentRequest(component);
        }
    }
}
