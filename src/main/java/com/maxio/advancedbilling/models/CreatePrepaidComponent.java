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
 * This is a model class for CreatePrepaidComponent type.
 */
public class CreatePrepaidComponent
        extends BaseModel {
    private PrepaidUsageComponent prepaidUsageComponent;

    /**
     * Default constructor.
     */
    public CreatePrepaidComponent() {
    }

    /**
     * Initialization constructor.
     * @param  prepaidUsageComponent  PrepaidUsageComponent value for prepaidUsageComponent.
     */
    public CreatePrepaidComponent(
            PrepaidUsageComponent prepaidUsageComponent) {
        this.prepaidUsageComponent = prepaidUsageComponent;
    }

    /**
     * Getter for PrepaidUsageComponent.
     * @return Returns the PrepaidUsageComponent
     */
    @JsonGetter("prepaid_usage_component")
    public PrepaidUsageComponent getPrepaidUsageComponent() {
        return prepaidUsageComponent;
    }

    /**
     * Setter for PrepaidUsageComponent.
     * @param prepaidUsageComponent Value for PrepaidUsageComponent
     */
    @JsonSetter("prepaid_usage_component")
    public void setPrepaidUsageComponent(PrepaidUsageComponent prepaidUsageComponent) {
        this.prepaidUsageComponent = prepaidUsageComponent;
    }

    /**
     * Converts this CreatePrepaidComponent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreatePrepaidComponent [" + "prepaidUsageComponent=" + prepaidUsageComponent
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(prepaidUsageComponent);
        return builder;
    }

    /**
     * Class to build instances of {@link CreatePrepaidComponent}.
     */
    public static class Builder {
        private PrepaidUsageComponent prepaidUsageComponent;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  prepaidUsageComponent  PrepaidUsageComponent value for prepaidUsageComponent.
         */
        public Builder(PrepaidUsageComponent prepaidUsageComponent) {
            this.prepaidUsageComponent = prepaidUsageComponent;
        }

        /**
         * Setter for prepaidUsageComponent.
         * @param  prepaidUsageComponent  PrepaidUsageComponent value for prepaidUsageComponent.
         * @return Builder
         */
        public Builder prepaidUsageComponent(PrepaidUsageComponent prepaidUsageComponent) {
            this.prepaidUsageComponent = prepaidUsageComponent;
            return this;
        }

        /**
         * Builds a new {@link CreatePrepaidComponent} object using the set fields.
         * @return {@link CreatePrepaidComponent}
         */
        public CreatePrepaidComponent build() {
            return new CreatePrepaidComponent(prepaidUsageComponent);
        }
    }
}
