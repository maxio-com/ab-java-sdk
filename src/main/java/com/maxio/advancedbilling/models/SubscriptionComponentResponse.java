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
 * This is a model class for SubscriptionComponentResponse type.
 */
public class SubscriptionComponentResponse {
    private SubscriptionComponent component;

    /**
     * Default constructor.
     */
    public SubscriptionComponentResponse() {
    }

    /**
     * Initialization constructor.
     * @param  component  SubscriptionComponent value for component.
     */
    public SubscriptionComponentResponse(
            SubscriptionComponent component) {
        this.component = component;
    }

    /**
     * Getter for Component.
     * @return Returns the SubscriptionComponent
     */
    @JsonGetter("component")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionComponent getComponent() {
        return component;
    }

    /**
     * Setter for Component.
     * @param component Value for SubscriptionComponent
     */
    @JsonSetter("component")
    public void setComponent(SubscriptionComponent component) {
        this.component = component;
    }

    /**
     * Converts this SubscriptionComponentResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionComponentResponse [" + "component=" + component + "]";
    }

    /**
     * Builds a new {@link SubscriptionComponentResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionComponentResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .component(getComponent());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionComponentResponse}.
     */
    public static class Builder {
        private SubscriptionComponent component;



        /**
         * Setter for component.
         * @param  component  SubscriptionComponent value for component.
         * @return Builder
         */
        public Builder component(SubscriptionComponent component) {
            this.component = component;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionComponentResponse} object using the set fields.
         * @return {@link SubscriptionComponentResponse}
         */
        public SubscriptionComponentResponse build() {
            return new SubscriptionComponentResponse(component);
        }
    }
}
