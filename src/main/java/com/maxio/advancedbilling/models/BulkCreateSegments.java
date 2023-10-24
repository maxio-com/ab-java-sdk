/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for BulkCreateSegments type.
 */
public class BulkCreateSegments {
    private List<CreateSegment> segments;

    /**
     * Default constructor.
     */
    public BulkCreateSegments() {
    }

    /**
     * Initialization constructor.
     * @param  segments  List of CreateSegment value for segments.
     */
    public BulkCreateSegments(
            List<CreateSegment> segments) {
        this.segments = segments;
    }

    /**
     * Getter for Segments.
     * @return Returns the List of CreateSegment
     */
    @JsonGetter("segments")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CreateSegment> getSegments() {
        return segments;
    }

    /**
     * Setter for Segments.
     * @param segments Value for List of CreateSegment
     */
    @JsonSetter("segments")
    public void setSegments(List<CreateSegment> segments) {
        this.segments = segments;
    }

    /**
     * Converts this BulkCreateSegments into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BulkCreateSegments [" + "segments=" + segments + "]";
    }

    /**
     * Builds a new {@link BulkCreateSegments.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BulkCreateSegments.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .segments(getSegments());
        return builder;
    }

    /**
     * Class to build instances of {@link BulkCreateSegments}.
     */
    public static class Builder {
        private List<CreateSegment> segments;



        /**
         * Setter for segments.
         * @param  segments  List of CreateSegment value for segments.
         * @return Builder
         */
        public Builder segments(List<CreateSegment> segments) {
            this.segments = segments;
            return this;
        }

        /**
         * Builds a new {@link BulkCreateSegments} object using the set fields.
         * @return {@link BulkCreateSegments}
         */
        public BulkCreateSegments build() {
            return new BulkCreateSegments(segments);
        }
    }
}
