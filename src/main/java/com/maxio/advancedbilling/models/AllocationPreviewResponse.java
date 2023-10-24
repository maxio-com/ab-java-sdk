/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for AllocationPreviewResponse type.
 */
public class AllocationPreviewResponse {
    private AllocationPreview allocationPreview;

    /**
     * Default constructor.
     */
    public AllocationPreviewResponse() {
    }

    /**
     * Initialization constructor.
     * @param  allocationPreview  AllocationPreview value for allocationPreview.
     */
    public AllocationPreviewResponse(
            AllocationPreview allocationPreview) {
        this.allocationPreview = allocationPreview;
    }

    /**
     * Getter for AllocationPreview.
     * @return Returns the AllocationPreview
     */
    @JsonGetter("allocation_preview")
    public AllocationPreview getAllocationPreview() {
        return allocationPreview;
    }

    /**
     * Setter for AllocationPreview.
     * @param allocationPreview Value for AllocationPreview
     */
    @JsonSetter("allocation_preview")
    public void setAllocationPreview(AllocationPreview allocationPreview) {
        this.allocationPreview = allocationPreview;
    }

    /**
     * Converts this AllocationPreviewResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AllocationPreviewResponse [" + "allocationPreview=" + allocationPreview + "]";
    }

    /**
     * Builds a new {@link AllocationPreviewResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AllocationPreviewResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(allocationPreview);
        return builder;
    }

    /**
     * Class to build instances of {@link AllocationPreviewResponse}.
     */
    public static class Builder {
        private AllocationPreview allocationPreview;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  allocationPreview  AllocationPreview value for allocationPreview.
         */
        public Builder(AllocationPreview allocationPreview) {
            this.allocationPreview = allocationPreview;
        }

        /**
         * Setter for allocationPreview.
         * @param  allocationPreview  AllocationPreview value for allocationPreview.
         * @return Builder
         */
        public Builder allocationPreview(AllocationPreview allocationPreview) {
            this.allocationPreview = allocationPreview;
            return this;
        }

        /**
         * Builds a new {@link AllocationPreviewResponse} object using the set fields.
         * @return {@link AllocationPreviewResponse}
         */
        public AllocationPreviewResponse build() {
            return new AllocationPreviewResponse(allocationPreview);
        }
    }
}
