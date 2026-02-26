/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for ScheduledRenewalConfigurationItemResponse type.
 */
public class ScheduledRenewalConfigurationItemResponse
        extends BaseModel {
    private ScheduledRenewalConfigurationItem scheduledRenewalConfigurationItem;

    /**
     * Default constructor.
     */
    public ScheduledRenewalConfigurationItemResponse() {
    }

    /**
     * Initialization constructor.
     * @param  scheduledRenewalConfigurationItem  ScheduledRenewalConfigurationItem value for
     *         scheduledRenewalConfigurationItem.
     */
    public ScheduledRenewalConfigurationItemResponse(
            ScheduledRenewalConfigurationItem scheduledRenewalConfigurationItem) {
        this.scheduledRenewalConfigurationItem = scheduledRenewalConfigurationItem;
    }

    /**
     * Getter for ScheduledRenewalConfigurationItem.
     * @return Returns the ScheduledRenewalConfigurationItem
     */
    @JsonGetter("scheduled_renewal_configuration_item")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ScheduledRenewalConfigurationItem getScheduledRenewalConfigurationItem() {
        return scheduledRenewalConfigurationItem;
    }

    /**
     * Setter for ScheduledRenewalConfigurationItem.
     * @param scheduledRenewalConfigurationItem Value for ScheduledRenewalConfigurationItem
     */
    @JsonSetter("scheduled_renewal_configuration_item")
    public void setScheduledRenewalConfigurationItem(ScheduledRenewalConfigurationItem scheduledRenewalConfigurationItem) {
        this.scheduledRenewalConfigurationItem = scheduledRenewalConfigurationItem;
    }

    /**
     * Converts this ScheduledRenewalConfigurationItemResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ScheduledRenewalConfigurationItemResponse [" + "scheduledRenewalConfigurationItem="
                + scheduledRenewalConfigurationItem + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ScheduledRenewalConfigurationItemResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ScheduledRenewalConfigurationItemResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .scheduledRenewalConfigurationItem(getScheduledRenewalConfigurationItem());
        return builder;
    }

    /**
     * Class to build instances of {@link ScheduledRenewalConfigurationItemResponse}.
     */
    public static class Builder {
        private ScheduledRenewalConfigurationItem scheduledRenewalConfigurationItem;



        /**
         * Setter for scheduledRenewalConfigurationItem.
         * @param  scheduledRenewalConfigurationItem  ScheduledRenewalConfigurationItem value for
         *         scheduledRenewalConfigurationItem.
         * @return Builder
         */
        public Builder scheduledRenewalConfigurationItem(
                ScheduledRenewalConfigurationItem scheduledRenewalConfigurationItem) {
            this.scheduledRenewalConfigurationItem = scheduledRenewalConfigurationItem;
            return this;
        }

        /**
         * Builds a new {@link ScheduledRenewalConfigurationItemResponse} object using the set
         * fields.
         * @return {@link ScheduledRenewalConfigurationItemResponse}
         */
        public ScheduledRenewalConfigurationItemResponse build() {
            return new ScheduledRenewalConfigurationItemResponse(scheduledRenewalConfigurationItem);
        }
    }
}
