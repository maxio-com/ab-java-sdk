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
 * This is a model class for ListSegmentsResponse type.
 */
public class ListSegmentsResponse {
    private List<Segment> segments;

    /**
     * Default constructor.
     */
    public ListSegmentsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  segments  List of Segment value for segments.
     */
    public ListSegmentsResponse(
            List<Segment> segments) {
        this.segments = segments;
    }

    /**
     * Getter for Segments.
     * @return Returns the List of Segment
     */
    @JsonGetter("segments")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Segment> getSegments() {
        return segments;
    }

    /**
     * Setter for Segments.
     * @param segments Value for List of Segment
     */
    @JsonSetter("segments")
    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    /**
     * Converts this ListSegmentsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListSegmentsResponse [" + "segments=" + segments + "]";
    }

    /**
     * Builds a new {@link ListSegmentsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListSegmentsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .segments(getSegments());
        return builder;
    }

    /**
     * Class to build instances of {@link ListSegmentsResponse}.
     */
    public static class Builder {
        private List<Segment> segments;



        /**
         * Setter for segments.
         * @param  segments  List of Segment value for segments.
         * @return Builder
         */
        public Builder segments(List<Segment> segments) {
            this.segments = segments;
            return this;
        }

        /**
         * Builds a new {@link ListSegmentsResponse} object using the set fields.
         * @return {@link ListSegmentsResponse}
         */
        public ListSegmentsResponse build() {
            return new ListSegmentsResponse(segments);
        }
    }
}
