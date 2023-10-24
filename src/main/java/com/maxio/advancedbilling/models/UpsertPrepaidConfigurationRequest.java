/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UpsertPrepaidConfigurationRequest type.
 */
public class UpsertPrepaidConfigurationRequest {
    private UpsertPrepaidConfiguration prepaidConfiguration;

    /**
     * Default constructor.
     */
    public UpsertPrepaidConfigurationRequest() {
    }

    /**
     * Initialization constructor.
     * @param  prepaidConfiguration  UpsertPrepaidConfiguration value for prepaidConfiguration.
     */
    public UpsertPrepaidConfigurationRequest(
            UpsertPrepaidConfiguration prepaidConfiguration) {
        this.prepaidConfiguration = prepaidConfiguration;
    }

    /**
     * Getter for PrepaidConfiguration.
     * @return Returns the UpsertPrepaidConfiguration
     */
    @JsonGetter("prepaid_configuration")
    public UpsertPrepaidConfiguration getPrepaidConfiguration() {
        return prepaidConfiguration;
    }

    /**
     * Setter for PrepaidConfiguration.
     * @param prepaidConfiguration Value for UpsertPrepaidConfiguration
     */
    @JsonSetter("prepaid_configuration")
    public void setPrepaidConfiguration(UpsertPrepaidConfiguration prepaidConfiguration) {
        this.prepaidConfiguration = prepaidConfiguration;
    }

    /**
     * Converts this UpsertPrepaidConfigurationRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpsertPrepaidConfigurationRequest [" + "prepaidConfiguration="
                + prepaidConfiguration + "]";
    }

    /**
     * Builds a new {@link UpsertPrepaidConfigurationRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpsertPrepaidConfigurationRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(prepaidConfiguration);
        return builder;
    }

    /**
     * Class to build instances of {@link UpsertPrepaidConfigurationRequest}.
     */
    public static class Builder {
        private UpsertPrepaidConfiguration prepaidConfiguration;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  prepaidConfiguration  UpsertPrepaidConfiguration value for prepaidConfiguration.
         */
        public Builder(UpsertPrepaidConfiguration prepaidConfiguration) {
            this.prepaidConfiguration = prepaidConfiguration;
        }

        /**
         * Setter for prepaidConfiguration.
         * @param  prepaidConfiguration  UpsertPrepaidConfiguration value for prepaidConfiguration.
         * @return Builder
         */
        public Builder prepaidConfiguration(UpsertPrepaidConfiguration prepaidConfiguration) {
            this.prepaidConfiguration = prepaidConfiguration;
            return this;
        }

        /**
         * Builds a new {@link UpsertPrepaidConfigurationRequest} object using the set fields.
         * @return {@link UpsertPrepaidConfigurationRequest}
         */
        public UpsertPrepaidConfigurationRequest build() {
            return new UpsertPrepaidConfigurationRequest(prepaidConfiguration);
        }
    }
}
