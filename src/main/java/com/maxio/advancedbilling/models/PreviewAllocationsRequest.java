/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for PreviewAllocationsRequest type.
 */
public class PreviewAllocationsRequest {
    private List<CreateAllocation> allocations;

    /**
     * Default constructor.
     */
    public PreviewAllocationsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  allocations  List of CreateAllocation value for allocations.
     */
    public PreviewAllocationsRequest(
            List<CreateAllocation> allocations) {
        this.allocations = allocations;
    }

    /**
     * Getter for Allocations.
     * @return Returns the List of CreateAllocation
     */
    @JsonGetter("allocations")
    public List<CreateAllocation> getAllocations() {
        return allocations;
    }

    /**
     * Setter for Allocations.
     * @param allocations Value for List of CreateAllocation
     */
    @JsonSetter("allocations")
    public void setAllocations(List<CreateAllocation> allocations) {
        this.allocations = allocations;
    }

    /**
     * Converts this PreviewAllocationsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PreviewAllocationsRequest [" + "allocations=" + allocations + "]";
    }

    /**
     * Builds a new {@link PreviewAllocationsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PreviewAllocationsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(allocations);
        return builder;
    }

    /**
     * Class to build instances of {@link PreviewAllocationsRequest}.
     */
    public static class Builder {
        private List<CreateAllocation> allocations;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  allocations  List of CreateAllocation value for allocations.
         */
        public Builder(List<CreateAllocation> allocations) {
            this.allocations = allocations;
        }

        /**
         * Setter for allocations.
         * @param  allocations  List of CreateAllocation value for allocations.
         * @return Builder
         */
        public Builder allocations(List<CreateAllocation> allocations) {
            this.allocations = allocations;
            return this;
        }

        /**
         * Builds a new {@link PreviewAllocationsRequest} object using the set fields.
         * @return {@link PreviewAllocationsRequest}
         */
        public PreviewAllocationsRequest build() {
            return new PreviewAllocationsRequest(allocations);
        }
    }
}
