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
 * This is a model class for AllocationResponse type.
 */
public class AllocationResponse {
    private Allocation allocation;

    /**
     * Default constructor.
     */
    public AllocationResponse() {
    }

    /**
     * Initialization constructor.
     * @param  allocation  Allocation value for allocation.
     */
    public AllocationResponse(
            Allocation allocation) {
        this.allocation = allocation;
    }

    /**
     * Getter for Allocation.
     * @return Returns the Allocation
     */
    @JsonGetter("allocation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Allocation getAllocation() {
        return allocation;
    }

    /**
     * Setter for Allocation.
     * @param allocation Value for Allocation
     */
    @JsonSetter("allocation")
    public void setAllocation(Allocation allocation) {
        this.allocation = allocation;
    }

    /**
     * Converts this AllocationResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AllocationResponse [" + "allocation=" + allocation + "]";
    }

    /**
     * Builds a new {@link AllocationResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AllocationResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .allocation(getAllocation());
        return builder;
    }

    /**
     * Class to build instances of {@link AllocationResponse}.
     */
    public static class Builder {
        private Allocation allocation;



        /**
         * Setter for allocation.
         * @param  allocation  Allocation value for allocation.
         * @return Builder
         */
        public Builder allocation(Allocation allocation) {
            this.allocation = allocation;
            return this;
        }

        /**
         * Builds a new {@link AllocationResponse} object using the set fields.
         * @return {@link AllocationResponse}
         */
        public AllocationResponse build() {
            return new AllocationResponse(allocation);
        }
    }
}
