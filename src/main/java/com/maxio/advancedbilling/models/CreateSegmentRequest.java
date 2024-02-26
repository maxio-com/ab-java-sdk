/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreateSegmentRequest type.
 */
public class CreateSegmentRequest {
    private CreateSegment segment;

    /**
     * Default constructor.
     */
    public CreateSegmentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  segment  CreateSegment value for segment.
     */
    public CreateSegmentRequest(
            CreateSegment segment) {
        this.segment = segment;
    }

    /**
     * Getter for Segment.
     * @return Returns the CreateSegment
     */
    @JsonGetter("segment")
    public CreateSegment getSegment() {
        return segment;
    }

    /**
     * Setter for Segment.
     * @param segment Value for CreateSegment
     */
    @JsonSetter("segment")
    public void setSegment(CreateSegment segment) {
        this.segment = segment;
    }

    /**
     * Converts this CreateSegmentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateSegmentRequest [" + "segment=" + segment + "]";
    }

    /**
     * Builds a new {@link CreateSegmentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateSegmentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(segment);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateSegmentRequest}.
     */
    public static class Builder {
        private CreateSegment segment;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  segment  CreateSegment value for segment.
         */
        public Builder(CreateSegment segment) {
            this.segment = segment;
        }

        /**
         * Setter for segment.
         * @param  segment  CreateSegment value for segment.
         * @return Builder
         */
        public Builder segment(CreateSegment segment) {
            this.segment = segment;
            return this;
        }

        /**
         * Builds a new {@link CreateSegmentRequest} object using the set fields.
         * @return {@link CreateSegmentRequest}
         */
        public CreateSegmentRequest build() {
            return new CreateSegmentRequest(segment);
        }
    }
}
