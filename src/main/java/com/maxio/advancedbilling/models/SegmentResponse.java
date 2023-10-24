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
 * This is a model class for SegmentResponse type.
 */
public class SegmentResponse {
    private Segment segment;

    /**
     * Default constructor.
     */
    public SegmentResponse() {
    }

    /**
     * Initialization constructor.
     * @param  segment  Segment value for segment.
     */
    public SegmentResponse(
            Segment segment) {
        this.segment = segment;
    }

    /**
     * Getter for Segment.
     * @return Returns the Segment
     */
    @JsonGetter("segment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Segment getSegment() {
        return segment;
    }

    /**
     * Setter for Segment.
     * @param segment Value for Segment
     */
    @JsonSetter("segment")
    public void setSegment(Segment segment) {
        this.segment = segment;
    }

    /**
     * Converts this SegmentResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SegmentResponse [" + "segment=" + segment + "]";
    }

    /**
     * Builds a new {@link SegmentResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SegmentResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .segment(getSegment());
        return builder;
    }

    /**
     * Class to build instances of {@link SegmentResponse}.
     */
    public static class Builder {
        private Segment segment;



        /**
         * Setter for segment.
         * @param  segment  Segment value for segment.
         * @return Builder
         */
        public Builder segment(Segment segment) {
            this.segment = segment;
            return this;
        }

        /**
         * Builds a new {@link SegmentResponse} object using the set fields.
         * @return {@link SegmentResponse}
         */
        public SegmentResponse build() {
            return new SegmentResponse(segment);
        }
    }
}
