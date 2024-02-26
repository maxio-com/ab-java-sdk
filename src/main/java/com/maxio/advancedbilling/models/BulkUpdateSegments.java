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
 * This is a model class for BulkUpdateSegments type.
 */
public class BulkUpdateSegments {
    private List<BulkUpdateSegmentsItem> segments;

    /**
     * Default constructor.
     */
    public BulkUpdateSegments() {
    }

    /**
     * Initialization constructor.
     * @param  segments  List of BulkUpdateSegmentsItem value for segments.
     */
    public BulkUpdateSegments(
            List<BulkUpdateSegmentsItem> segments) {
        this.segments = segments;
    }

    /**
     * Getter for Segments.
     * @return Returns the List of BulkUpdateSegmentsItem
     */
    @JsonGetter("segments")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<BulkUpdateSegmentsItem> getSegments() {
        return segments;
    }

    /**
     * Setter for Segments.
     * @param segments Value for List of BulkUpdateSegmentsItem
     */
    @JsonSetter("segments")
    public void setSegments(List<BulkUpdateSegmentsItem> segments) {
        this.segments = segments;
    }

    /**
     * Converts this BulkUpdateSegments into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BulkUpdateSegments [" + "segments=" + segments + "]";
    }

    /**
     * Builds a new {@link BulkUpdateSegments.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BulkUpdateSegments.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .segments(getSegments());
        return builder;
    }

    /**
     * Class to build instances of {@link BulkUpdateSegments}.
     */
    public static class Builder {
        private List<BulkUpdateSegmentsItem> segments;



        /**
         * Setter for segments.
         * @param  segments  List of BulkUpdateSegmentsItem value for segments.
         * @return Builder
         */
        public Builder segments(List<BulkUpdateSegmentsItem> segments) {
            this.segments = segments;
            return this;
        }

        /**
         * Builds a new {@link BulkUpdateSegments} object using the set fields.
         * @return {@link BulkUpdateSegments}
         */
        public BulkUpdateSegments build() {
            return new BulkUpdateSegments(segments);
        }
    }
}
