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
 * This is a model class for Proration type.
 */
public class Proration {
    private Boolean preservePeriod;

    /**
     * Default constructor.
     */
    public Proration() {
    }

    /**
     * Initialization constructor.
     * @param  preservePeriod  Boolean value for preservePeriod.
     */
    public Proration(
            Boolean preservePeriod) {
        this.preservePeriod = preservePeriod;
    }

    /**
     * Getter for PreservePeriod.
     * The alternative to sending preserve_period as a direct attribute to migration
     * @return Returns the Boolean
     */
    @JsonGetter("preserve_period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPreservePeriod() {
        return preservePeriod;
    }

    /**
     * Setter for PreservePeriod.
     * The alternative to sending preserve_period as a direct attribute to migration
     * @param preservePeriod Value for Boolean
     */
    @JsonSetter("preserve_period")
    public void setPreservePeriod(Boolean preservePeriod) {
        this.preservePeriod = preservePeriod;
    }

    /**
     * Converts this Proration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Proration [" + "preservePeriod=" + preservePeriod + "]";
    }

    /**
     * Builds a new {@link Proration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Proration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .preservePeriod(getPreservePeriod());
        return builder;
    }

    /**
     * Class to build instances of {@link Proration}.
     */
    public static class Builder {
        private Boolean preservePeriod;



        /**
         * Setter for preservePeriod.
         * @param  preservePeriod  Boolean value for preservePeriod.
         * @return Builder
         */
        public Builder preservePeriod(Boolean preservePeriod) {
            this.preservePeriod = preservePeriod;
            return this;
        }

        /**
         * Builds a new {@link Proration} object using the set fields.
         * @return {@link Proration}
         */
        public Proration build() {
            return new Proration(preservePeriod);
        }
    }
}
