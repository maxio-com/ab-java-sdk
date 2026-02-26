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
 * This is a model class for ScheduledRenewalConfigurationResponse type.
 */
public class ScheduledRenewalConfigurationResponse
        extends BaseModel {
    private ScheduledRenewalConfiguration scheduledRenewalConfiguration;

    /**
     * Default constructor.
     */
    public ScheduledRenewalConfigurationResponse() {
    }

    /**
     * Initialization constructor.
     * @param  scheduledRenewalConfiguration  ScheduledRenewalConfiguration value for
     *         scheduledRenewalConfiguration.
     */
    public ScheduledRenewalConfigurationResponse(
            ScheduledRenewalConfiguration scheduledRenewalConfiguration) {
        this.scheduledRenewalConfiguration = scheduledRenewalConfiguration;
    }

    /**
     * Getter for ScheduledRenewalConfiguration.
     * @return Returns the ScheduledRenewalConfiguration
     */
    @JsonGetter("scheduled_renewal_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ScheduledRenewalConfiguration getScheduledRenewalConfiguration() {
        return scheduledRenewalConfiguration;
    }

    /**
     * Setter for ScheduledRenewalConfiguration.
     * @param scheduledRenewalConfiguration Value for ScheduledRenewalConfiguration
     */
    @JsonSetter("scheduled_renewal_configuration")
    public void setScheduledRenewalConfiguration(ScheduledRenewalConfiguration scheduledRenewalConfiguration) {
        this.scheduledRenewalConfiguration = scheduledRenewalConfiguration;
    }

    /**
     * Converts this ScheduledRenewalConfigurationResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ScheduledRenewalConfigurationResponse [" + "scheduledRenewalConfiguration="
                + scheduledRenewalConfiguration + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ScheduledRenewalConfigurationResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ScheduledRenewalConfigurationResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .scheduledRenewalConfiguration(getScheduledRenewalConfiguration());
        return builder;
    }

    /**
     * Class to build instances of {@link ScheduledRenewalConfigurationResponse}.
     */
    public static class Builder {
        private ScheduledRenewalConfiguration scheduledRenewalConfiguration;



        /**
         * Setter for scheduledRenewalConfiguration.
         * @param  scheduledRenewalConfiguration  ScheduledRenewalConfiguration value for
         *         scheduledRenewalConfiguration.
         * @return Builder
         */
        public Builder scheduledRenewalConfiguration(
                ScheduledRenewalConfiguration scheduledRenewalConfiguration) {
            this.scheduledRenewalConfiguration = scheduledRenewalConfiguration;
            return this;
        }

        /**
         * Builds a new {@link ScheduledRenewalConfigurationResponse} object using the set fields.
         * @return {@link ScheduledRenewalConfigurationResponse}
         */
        public ScheduledRenewalConfigurationResponse build() {
            return new ScheduledRenewalConfigurationResponse(scheduledRenewalConfiguration);
        }
    }
}
