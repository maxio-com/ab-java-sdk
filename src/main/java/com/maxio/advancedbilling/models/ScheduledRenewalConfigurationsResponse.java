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
import java.util.List;

/**
 * This is a model class for ScheduledRenewalConfigurationsResponse type.
 */
public class ScheduledRenewalConfigurationsResponse
        extends BaseModel {
    private List<ScheduledRenewalConfiguration> scheduledRenewalConfigurations;

    /**
     * Default constructor.
     */
    public ScheduledRenewalConfigurationsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  scheduledRenewalConfigurations  List of ScheduledRenewalConfiguration value for
     *         scheduledRenewalConfigurations.
     */
    public ScheduledRenewalConfigurationsResponse(
            List<ScheduledRenewalConfiguration> scheduledRenewalConfigurations) {
        this.scheduledRenewalConfigurations = scheduledRenewalConfigurations;
    }

    /**
     * Getter for ScheduledRenewalConfigurations.
     * @return Returns the List of ScheduledRenewalConfiguration
     */
    @JsonGetter("scheduled_renewal_configurations")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ScheduledRenewalConfiguration> getScheduledRenewalConfigurations() {
        return scheduledRenewalConfigurations;
    }

    /**
     * Setter for ScheduledRenewalConfigurations.
     * @param scheduledRenewalConfigurations Value for List of ScheduledRenewalConfiguration
     */
    @JsonSetter("scheduled_renewal_configurations")
    public void setScheduledRenewalConfigurations(List<ScheduledRenewalConfiguration> scheduledRenewalConfigurations) {
        this.scheduledRenewalConfigurations = scheduledRenewalConfigurations;
    }

    /**
     * Converts this ScheduledRenewalConfigurationsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ScheduledRenewalConfigurationsResponse [" + "scheduledRenewalConfigurations="
                + scheduledRenewalConfigurations + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ScheduledRenewalConfigurationsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ScheduledRenewalConfigurationsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .scheduledRenewalConfigurations(getScheduledRenewalConfigurations());
        return builder;
    }

    /**
     * Class to build instances of {@link ScheduledRenewalConfigurationsResponse}.
     */
    public static class Builder {
        private List<ScheduledRenewalConfiguration> scheduledRenewalConfigurations;



        /**
         * Setter for scheduledRenewalConfigurations.
         * @param  scheduledRenewalConfigurations  List of ScheduledRenewalConfiguration value for
         *         scheduledRenewalConfigurations.
         * @return Builder
         */
        public Builder scheduledRenewalConfigurations(
                List<ScheduledRenewalConfiguration> scheduledRenewalConfigurations) {
            this.scheduledRenewalConfigurations = scheduledRenewalConfigurations;
            return this;
        }

        /**
         * Builds a new {@link ScheduledRenewalConfigurationsResponse} object using the set fields.
         * @return {@link ScheduledRenewalConfigurationsResponse}
         */
        public ScheduledRenewalConfigurationsResponse build() {
            return new ScheduledRenewalConfigurationsResponse(scheduledRenewalConfigurations);
        }
    }
}
