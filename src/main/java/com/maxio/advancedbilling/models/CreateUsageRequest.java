/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreateUsageRequest type.
 */
public class CreateUsageRequest {
    private CreateUsage usage;

    /**
     * Default constructor.
     */
    public CreateUsageRequest() {
    }

    /**
     * Initialization constructor.
     * @param  usage  CreateUsage value for usage.
     */
    public CreateUsageRequest(
            CreateUsage usage) {
        this.usage = usage;
    }

    /**
     * Getter for Usage.
     * @return Returns the CreateUsage
     */
    @JsonGetter("usage")
    public CreateUsage getUsage() {
        return usage;
    }

    /**
     * Setter for Usage.
     * @param usage Value for CreateUsage
     */
    @JsonSetter("usage")
    public void setUsage(CreateUsage usage) {
        this.usage = usage;
    }

    /**
     * Converts this CreateUsageRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateUsageRequest [" + "usage=" + usage + "]";
    }

    /**
     * Builds a new {@link CreateUsageRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateUsageRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(usage);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateUsageRequest}.
     */
    public static class Builder {
        private CreateUsage usage;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  usage  CreateUsage value for usage.
         */
        public Builder(CreateUsage usage) {
            this.usage = usage;
        }

        /**
         * Setter for usage.
         * @param  usage  CreateUsage value for usage.
         * @return Builder
         */
        public Builder usage(CreateUsage usage) {
            this.usage = usage;
            return this;
        }

        /**
         * Builds a new {@link CreateUsageRequest} object using the set fields.
         * @return {@link CreateUsageRequest}
         */
        public CreateUsageRequest build() {
            return new CreateUsageRequest(usage);
        }
    }
}
