/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreateAllocationRequest type.
 */
public class CreateAllocationRequest {
    private CreateAllocation allocation;

    /**
     * Default constructor.
     */
    public CreateAllocationRequest() {
    }

    /**
     * Initialization constructor.
     * @param  allocation  CreateAllocation value for allocation.
     */
    public CreateAllocationRequest(
            CreateAllocation allocation) {
        this.allocation = allocation;
    }

    /**
     * Getter for Allocation.
     * @return Returns the CreateAllocation
     */
    @JsonGetter("allocation")
    public CreateAllocation getAllocation() {
        return allocation;
    }

    /**
     * Setter for Allocation.
     * @param allocation Value for CreateAllocation
     */
    @JsonSetter("allocation")
    public void setAllocation(CreateAllocation allocation) {
        this.allocation = allocation;
    }

    /**
     * Converts this CreateAllocationRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateAllocationRequest [" + "allocation=" + allocation + "]";
    }

    /**
     * Builds a new {@link CreateAllocationRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateAllocationRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(allocation);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateAllocationRequest}.
     */
    public static class Builder {
        private CreateAllocation allocation;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  allocation  CreateAllocation value for allocation.
         */
        public Builder(CreateAllocation allocation) {
            this.allocation = allocation;
        }

        /**
         * Setter for allocation.
         * @param  allocation  CreateAllocation value for allocation.
         * @return Builder
         */
        public Builder allocation(CreateAllocation allocation) {
            this.allocation = allocation;
            return this;
        }

        /**
         * Builds a new {@link CreateAllocationRequest} object using the set fields.
         * @return {@link CreateAllocationRequest}
         */
        public CreateAllocationRequest build() {
            return new CreateAllocationRequest(allocation);
        }
    }
}
