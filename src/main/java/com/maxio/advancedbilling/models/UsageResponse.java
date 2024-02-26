/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UsageResponse type.
 */
public class UsageResponse {
    private Usage usage;

    /**
     * Default constructor.
     */
    public UsageResponse() {
    }

    /**
     * Initialization constructor.
     * @param  usage  Usage value for usage.
     */
    public UsageResponse(
            Usage usage) {
        this.usage = usage;
    }

    /**
     * Getter for Usage.
     * @return Returns the Usage
     */
    @JsonGetter("usage")
    public Usage getUsage() {
        return usage;
    }

    /**
     * Setter for Usage.
     * @param usage Value for Usage
     */
    @JsonSetter("usage")
    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    /**
     * Converts this UsageResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UsageResponse [" + "usage=" + usage + "]";
    }

    /**
     * Builds a new {@link UsageResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UsageResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(usage);
        return builder;
    }

    /**
     * Class to build instances of {@link UsageResponse}.
     */
    public static class Builder {
        private Usage usage;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  usage  Usage value for usage.
         */
        public Builder(Usage usage) {
            this.usage = usage;
        }

        /**
         * Setter for usage.
         * @param  usage  Usage value for usage.
         * @return Builder
         */
        public Builder usage(Usage usage) {
            this.usage = usage;
            return this;
        }

        /**
         * Builds a new {@link UsageResponse} object using the set fields.
         * @return {@link UsageResponse}
         */
        public UsageResponse build() {
            return new UsageResponse(usage);
        }
    }
}
