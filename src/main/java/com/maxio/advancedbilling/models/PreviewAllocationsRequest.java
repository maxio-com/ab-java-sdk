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
 * This is a model class for PreviewAllocationsRequest type.
 */
public class PreviewAllocationsRequest {
    private List<CreateAllocation> allocations;
    private String effectiveProrationDate;

    /**
     * Default constructor.
     */
    public PreviewAllocationsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  allocations  List of CreateAllocation value for allocations.
     * @param  effectiveProrationDate  String value for effectiveProrationDate.
     */
    public PreviewAllocationsRequest(
            List<CreateAllocation> allocations,
            String effectiveProrationDate) {
        this.allocations = allocations;
        this.effectiveProrationDate = effectiveProrationDate;
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
     * Getter for EffectiveProrationDate.
     * To calculate proration amounts for a future time. Only within a current subscription period.
     * Only ISO8601 format is supported.
     * @return Returns the String
     */
    @JsonGetter("effective_proration_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEffectiveProrationDate() {
        return effectiveProrationDate;
    }

    /**
     * Setter for EffectiveProrationDate.
     * To calculate proration amounts for a future time. Only within a current subscription period.
     * Only ISO8601 format is supported.
     * @param effectiveProrationDate Value for String
     */
    @JsonSetter("effective_proration_date")
    public void setEffectiveProrationDate(String effectiveProrationDate) {
        this.effectiveProrationDate = effectiveProrationDate;
    }

    /**
     * Converts this PreviewAllocationsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PreviewAllocationsRequest [" + "allocations=" + allocations
                + ", effectiveProrationDate=" + effectiveProrationDate + "]";
    }

    /**
     * Builds a new {@link PreviewAllocationsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PreviewAllocationsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(allocations)
                .effectiveProrationDate(getEffectiveProrationDate());
        return builder;
    }

    /**
     * Class to build instances of {@link PreviewAllocationsRequest}.
     */
    public static class Builder {
        private List<CreateAllocation> allocations;
        private String effectiveProrationDate;

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
         * Setter for effectiveProrationDate.
         * @param  effectiveProrationDate  String value for effectiveProrationDate.
         * @return Builder
         */
        public Builder effectiveProrationDate(String effectiveProrationDate) {
            this.effectiveProrationDate = effectiveProrationDate;
            return this;
        }

        /**
         * Builds a new {@link PreviewAllocationsRequest} object using the set fields.
         * @return {@link PreviewAllocationsRequest}
         */
        public PreviewAllocationsRequest build() {
            return new PreviewAllocationsRequest(allocations, effectiveProrationDate);
        }
    }
}
