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
 * This is a model class for UpdateAllocationExpirationDate type.
 */
public class UpdateAllocationExpirationDate {
    private AllocationExpirationDate allocation;

    /**
     * Default constructor.
     */
    public UpdateAllocationExpirationDate() {
    }

    /**
     * Initialization constructor.
     * @param  allocation  AllocationExpirationDate value for allocation.
     */
    public UpdateAllocationExpirationDate(
            AllocationExpirationDate allocation) {
        this.allocation = allocation;
    }

    /**
     * Getter for Allocation.
     * @return Returns the AllocationExpirationDate
     */
    @JsonGetter("allocation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AllocationExpirationDate getAllocation() {
        return allocation;
    }

    /**
     * Setter for Allocation.
     * @param allocation Value for AllocationExpirationDate
     */
    @JsonSetter("allocation")
    public void setAllocation(AllocationExpirationDate allocation) {
        this.allocation = allocation;
    }

    /**
     * Converts this UpdateAllocationExpirationDate into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateAllocationExpirationDate [" + "allocation=" + allocation + "]";
    }

    /**
     * Builds a new {@link UpdateAllocationExpirationDate.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateAllocationExpirationDate.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .allocation(getAllocation());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateAllocationExpirationDate}.
     */
    public static class Builder {
        private AllocationExpirationDate allocation;



        /**
         * Setter for allocation.
         * @param  allocation  AllocationExpirationDate value for allocation.
         * @return Builder
         */
        public Builder allocation(AllocationExpirationDate allocation) {
            this.allocation = allocation;
            return this;
        }

        /**
         * Builds a new {@link UpdateAllocationExpirationDate} object using the set fields.
         * @return {@link UpdateAllocationExpirationDate}
         */
        public UpdateAllocationExpirationDate build() {
            return new UpdateAllocationExpirationDate(allocation);
        }
    }
}
