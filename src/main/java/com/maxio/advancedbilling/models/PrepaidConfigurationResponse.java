/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for PrepaidConfigurationResponse type.
 */
public class PrepaidConfigurationResponse {
    private PrepaidConfiguration prepaidConfiguration;

    /**
     * Default constructor.
     */
    public PrepaidConfigurationResponse() {
    }

    /**
     * Initialization constructor.
     * @param  prepaidConfiguration  PrepaidConfiguration value for prepaidConfiguration.
     */
    public PrepaidConfigurationResponse(
            PrepaidConfiguration prepaidConfiguration) {
        this.prepaidConfiguration = prepaidConfiguration;
    }

    /**
     * Getter for PrepaidConfiguration.
     * @return Returns the PrepaidConfiguration
     */
    @JsonGetter("prepaid_configuration")
    public PrepaidConfiguration getPrepaidConfiguration() {
        return prepaidConfiguration;
    }

    /**
     * Setter for PrepaidConfiguration.
     * @param prepaidConfiguration Value for PrepaidConfiguration
     */
    @JsonSetter("prepaid_configuration")
    public void setPrepaidConfiguration(PrepaidConfiguration prepaidConfiguration) {
        this.prepaidConfiguration = prepaidConfiguration;
    }

    /**
     * Converts this PrepaidConfigurationResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrepaidConfigurationResponse [" + "prepaidConfiguration=" + prepaidConfiguration
                + "]";
    }

    /**
     * Builds a new {@link PrepaidConfigurationResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PrepaidConfigurationResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(prepaidConfiguration);
        return builder;
    }

    /**
     * Class to build instances of {@link PrepaidConfigurationResponse}.
     */
    public static class Builder {
        private PrepaidConfiguration prepaidConfiguration;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  prepaidConfiguration  PrepaidConfiguration value for prepaidConfiguration.
         */
        public Builder(PrepaidConfiguration prepaidConfiguration) {
            this.prepaidConfiguration = prepaidConfiguration;
        }

        /**
         * Setter for prepaidConfiguration.
         * @param  prepaidConfiguration  PrepaidConfiguration value for prepaidConfiguration.
         * @return Builder
         */
        public Builder prepaidConfiguration(PrepaidConfiguration prepaidConfiguration) {
            this.prepaidConfiguration = prepaidConfiguration;
            return this;
        }

        /**
         * Builds a new {@link PrepaidConfigurationResponse} object using the set fields.
         * @return {@link PrepaidConfigurationResponse}
         */
        public PrepaidConfigurationResponse build() {
            return new PrepaidConfigurationResponse(prepaidConfiguration);
        }
    }
}
