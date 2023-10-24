/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.Map;

/**
 * This is a model class for EventBasedBillingSegmentError type.
 */
public class EventBasedBillingSegmentError {
    private Map<String, Object> segments;

    /**
     * Default constructor.
     */
    public EventBasedBillingSegmentError() {
    }

    /**
     * Initialization constructor.
     * @param  segments  Map of String, value for segments.
     */
    public EventBasedBillingSegmentError(
            Map<String, Object> segments) {
        this.segments = segments;
    }

    /**
     * Getter for Segments.
     * The key of the object would be a number (an index in the request array) where the error
     * occurred. In the value object, the key represents the field and the value is an array with
     * error messages. In most cases, this object would contain just one key.
     * @return Returns the Map of String, Object
     */
    @JsonGetter("segments")
    public Map<String, Object> getSegments() {
        return segments;
    }

    /**
     * Setter for Segments.
     * The key of the object would be a number (an index in the request array) where the error
     * occurred. In the value object, the key represents the field and the value is an array with
     * error messages. In most cases, this object would contain just one key.
     * @param segments Value for Map of String, Object
     */
    @JsonSetter("segments")
    public void setSegments(Map<String, Object> segments) {
        this.segments = segments;
    }

    /**
     * Converts this EventBasedBillingSegmentError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EventBasedBillingSegmentError [" + "segments=" + segments + "]";
    }

    /**
     * Builds a new {@link EventBasedBillingSegmentError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EventBasedBillingSegmentError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(segments);
        return builder;
    }

    /**
     * Class to build instances of {@link EventBasedBillingSegmentError}.
     */
    public static class Builder {
        private Map<String, Object> segments;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  segments  Map of String, value for segments.
         */
        public Builder(Map<String, Object> segments) {
            this.segments = segments;
        }

        /**
         * Setter for segments.
         * @param  segments  Map of String, value for segments.
         * @return Builder
         */
        public Builder segments(Map<String, Object> segments) {
            this.segments = segments;
            return this;
        }

        /**
         * Builds a new {@link EventBasedBillingSegmentError} object using the set fields.
         * @return {@link EventBasedBillingSegmentError}
         */
        public EventBasedBillingSegmentError build() {
            return new EventBasedBillingSegmentError(segments);
        }
    }
}
