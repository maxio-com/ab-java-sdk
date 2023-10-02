/*
 * MaxioAdvancedBillingFormerlyChargifyAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.chargify.subdomain.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Errors13 type.
 */
public class Errors13 {
    private Segments1 segments;

    /**
     * Default constructor.
     */
    public Errors13() {
    }

    /**
     * Initialization constructor.
     * @param  segments  Segments1 value for segments.
     */
    public Errors13(
            Segments1 segments) {
        this.segments = segments;
    }

    /**
     * Getter for Segments.
     * @return Returns the Segments1
     */
    @JsonGetter("segments")
    public Segments1 getSegments() {
        return segments;
    }

    /**
     * Setter for Segments.
     * @param segments Value for Segments1
     */
    @JsonSetter("segments")
    public void setSegments(Segments1 segments) {
        this.segments = segments;
    }

    /**
     * Converts this Errors13 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Errors13 [" + "segments=" + segments + "]";
    }

    /**
     * Builds a new {@link Errors13.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Errors13.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(segments);
        return builder;
    }

    /**
     * Class to build instances of {@link Errors13}.
     */
    public static class Builder {
        private Segments1 segments;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  segments  Segments1 value for segments.
         */
        public Builder(Segments1 segments) {
            this.segments = segments;
        }

        /**
         * Setter for segments.
         * @param  segments  Segments1 value for segments.
         * @return Builder
         */
        public Builder segments(Segments1 segments) {
            this.segments = segments;
            return this;
        }

        /**
         * Builds a new {@link Errors13} object using the set fields.
         * @return {@link Errors13}
         */
        public Errors13 build() {
            return new Errors13(segments);
        }
    }
}
