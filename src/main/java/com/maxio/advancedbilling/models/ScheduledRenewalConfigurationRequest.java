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
 * This is a model class for ScheduledRenewalConfigurationRequest type.
 */
public class ScheduledRenewalConfigurationRequest
        extends BaseModel {
    private ScheduledRenewalConfigurationRequestBody renewalConfiguration;

    /**
     * Default constructor.
     */
    public ScheduledRenewalConfigurationRequest() {
    }

    /**
     * Initialization constructor.
     * @param  renewalConfiguration  ScheduledRenewalConfigurationRequestBody value for
     *         renewalConfiguration.
     */
    public ScheduledRenewalConfigurationRequest(
            ScheduledRenewalConfigurationRequestBody renewalConfiguration) {
        this.renewalConfiguration = renewalConfiguration;
    }

    /**
     * Getter for RenewalConfiguration.
     * @return Returns the ScheduledRenewalConfigurationRequestBody
     */
    @JsonGetter("renewal_configuration")
    public ScheduledRenewalConfigurationRequestBody getRenewalConfiguration() {
        return renewalConfiguration;
    }

    /**
     * Setter for RenewalConfiguration.
     * @param renewalConfiguration Value for ScheduledRenewalConfigurationRequestBody
     */
    @JsonSetter("renewal_configuration")
    public void setRenewalConfiguration(ScheduledRenewalConfigurationRequestBody renewalConfiguration) {
        this.renewalConfiguration = renewalConfiguration;
    }

    /**
     * Converts this ScheduledRenewalConfigurationRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ScheduledRenewalConfigurationRequest [" + "renewalConfiguration="
                + renewalConfiguration + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link ScheduledRenewalConfigurationRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ScheduledRenewalConfigurationRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(renewalConfiguration);
        return builder;
    }

    /**
     * Class to build instances of {@link ScheduledRenewalConfigurationRequest}.
     */
    public static class Builder {
        private ScheduledRenewalConfigurationRequestBody renewalConfiguration;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  renewalConfiguration  ScheduledRenewalConfigurationRequestBody value for
         *         renewalConfiguration.
         */
        public Builder(ScheduledRenewalConfigurationRequestBody renewalConfiguration) {
            this.renewalConfiguration = renewalConfiguration;
        }

        /**
         * Setter for renewalConfiguration.
         * @param  renewalConfiguration  ScheduledRenewalConfigurationRequestBody value for
         *         renewalConfiguration.
         * @return Builder
         */
        public Builder renewalConfiguration(
                ScheduledRenewalConfigurationRequestBody renewalConfiguration) {
            this.renewalConfiguration = renewalConfiguration;
            return this;
        }

        /**
         * Builds a new {@link ScheduledRenewalConfigurationRequest} object using the set fields.
         * @return {@link ScheduledRenewalConfigurationRequest}
         */
        public ScheduledRenewalConfigurationRequest build() {
            return new ScheduledRenewalConfigurationRequest(renewalConfiguration);
        }
    }
}
