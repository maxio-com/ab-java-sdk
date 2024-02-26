/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UpdateSegmentRequest type.
 */
public class UpdateSegmentRequest {
    private UpdateSegment segment;

    /**
     * Default constructor.
     */
    public UpdateSegmentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  segment  UpdateSegment value for segment.
     */
    public UpdateSegmentRequest(
            UpdateSegment segment) {
        this.segment = segment;
    }

    /**
     * Getter for Segment.
     * @return Returns the UpdateSegment
     */
    @JsonGetter("segment")
    public UpdateSegment getSegment() {
        return segment;
    }

    /**
     * Setter for Segment.
     * @param segment Value for UpdateSegment
     */
    @JsonSetter("segment")
    public void setSegment(UpdateSegment segment) {
        this.segment = segment;
    }

    /**
     * Converts this UpdateSegmentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateSegmentRequest [" + "segment=" + segment + "]";
    }

    /**
     * Builds a new {@link UpdateSegmentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateSegmentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(segment);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateSegmentRequest}.
     */
    public static class Builder {
        private UpdateSegment segment;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  segment  UpdateSegment value for segment.
         */
        public Builder(UpdateSegment segment) {
            this.segment = segment;
        }

        /**
         * Setter for segment.
         * @param  segment  UpdateSegment value for segment.
         * @return Builder
         */
        public Builder segment(UpdateSegment segment) {
            this.segment = segment;
            return this;
        }

        /**
         * Builds a new {@link UpdateSegmentRequest} object using the set fields.
         * @return {@link UpdateSegmentRequest}
         */
        public UpdateSegmentRequest build() {
            return new UpdateSegmentRequest(segment);
        }
    }
}
