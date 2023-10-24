/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ComponentAllocationChange type.
 */
public class ComponentAllocationChange {
    private int previousAllocation;
    private int newAllocation;
    private int componentId;
    private String componentHandle;
    private String memo;
    private int allocationId;
    private Integer allocatedQuantity;

    /**
     * Default constructor.
     */
    public ComponentAllocationChange() {
    }

    /**
     * Initialization constructor.
     * @param  previousAllocation  int value for previousAllocation.
     * @param  newAllocation  int value for newAllocation.
     * @param  componentId  int value for componentId.
     * @param  componentHandle  String value for componentHandle.
     * @param  memo  String value for memo.
     * @param  allocationId  int value for allocationId.
     * @param  allocatedQuantity  Integer value for allocatedQuantity.
     */
    public ComponentAllocationChange(
            int previousAllocation,
            int newAllocation,
            int componentId,
            String componentHandle,
            String memo,
            int allocationId,
            Integer allocatedQuantity) {
        this.previousAllocation = previousAllocation;
        this.newAllocation = newAllocation;
        this.componentId = componentId;
        this.componentHandle = componentHandle;
        this.memo = memo;
        this.allocationId = allocationId;
        this.allocatedQuantity = allocatedQuantity;
    }

    /**
     * Initialization constructor.
     * @param  previousAllocation  int value for previousAllocation.
     * @param  newAllocation  int value for newAllocation.
     * @param  componentId  int value for componentId.
     * @param  componentHandle  String value for componentHandle.
     * @param  memo  String value for memo.
     * @param  allocationId  int value for allocationId.
     */
    @JsonCreator
    protected ComponentAllocationChange(
            @JsonProperty("previous_allocation") int previousAllocation,
            @JsonProperty("new_allocation") int newAllocation,
            @JsonProperty("component_id") int componentId,
            @JsonProperty("component_handle") String componentHandle,
            @JsonProperty("memo") String memo,
            @JsonProperty("allocation_id") int allocationId) {
        this(previousAllocation, newAllocation, componentId, componentHandle, memo, allocationId,
                null);
    }

    /**
     * Getter for PreviousAllocation.
     * @return Returns the int
     */
    @JsonGetter("previous_allocation")
    public int getPreviousAllocation() {
        return previousAllocation;
    }

    /**
     * Setter for PreviousAllocation.
     * @param previousAllocation Value for int
     */
    @JsonSetter("previous_allocation")
    public void setPreviousAllocation(int previousAllocation) {
        this.previousAllocation = previousAllocation;
    }

    /**
     * Getter for NewAllocation.
     * @return Returns the int
     */
    @JsonGetter("new_allocation")
    public int getNewAllocation() {
        return newAllocation;
    }

    /**
     * Setter for NewAllocation.
     * @param newAllocation Value for int
     */
    @JsonSetter("new_allocation")
    public void setNewAllocation(int newAllocation) {
        this.newAllocation = newAllocation;
    }

    /**
     * Getter for ComponentId.
     * @return Returns the int
     */
    @JsonGetter("component_id")
    public int getComponentId() {
        return componentId;
    }

    /**
     * Setter for ComponentId.
     * @param componentId Value for int
     */
    @JsonSetter("component_id")
    public void setComponentId(int componentId) {
        this.componentId = componentId;
    }

    /**
     * Getter for ComponentHandle.
     * @return Returns the String
     */
    @JsonGetter("component_handle")
    public String getComponentHandle() {
        return componentHandle;
    }

    /**
     * Setter for ComponentHandle.
     * @param componentHandle Value for String
     */
    @JsonSetter("component_handle")
    public void setComponentHandle(String componentHandle) {
        this.componentHandle = componentHandle;
    }

    /**
     * Getter for Memo.
     * @return Returns the String
     */
    @JsonGetter("memo")
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter for AllocationId.
     * @return Returns the int
     */
    @JsonGetter("allocation_id")
    public int getAllocationId() {
        return allocationId;
    }

    /**
     * Setter for AllocationId.
     * @param allocationId Value for int
     */
    @JsonSetter("allocation_id")
    public void setAllocationId(int allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * Getter for AllocatedQuantity.
     * @return Returns the Integer
     */
    @JsonGetter("allocated_quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAllocatedQuantity() {
        return allocatedQuantity;
    }

    /**
     * Setter for AllocatedQuantity.
     * @param allocatedQuantity Value for Integer
     */
    @JsonSetter("allocated_quantity")
    public void setAllocatedQuantity(Integer allocatedQuantity) {
        this.allocatedQuantity = allocatedQuantity;
    }

    /**
     * Converts this ComponentAllocationChange into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ComponentAllocationChange [" + "previousAllocation=" + previousAllocation
                + ", newAllocation=" + newAllocation + ", componentId=" + componentId
                + ", componentHandle=" + componentHandle + ", memo=" + memo + ", allocationId="
                + allocationId + ", allocatedQuantity=" + allocatedQuantity + "]";
    }

    /**
     * Builds a new {@link ComponentAllocationChange.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ComponentAllocationChange.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(previousAllocation, newAllocation, componentId,
                componentHandle, memo, allocationId)
                .allocatedQuantity(getAllocatedQuantity());
        return builder;
    }

    /**
     * Class to build instances of {@link ComponentAllocationChange}.
     */
    public static class Builder {
        private int previousAllocation;
        private int newAllocation;
        private int componentId;
        private String componentHandle;
        private String memo;
        private int allocationId;
        private Integer allocatedQuantity;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  previousAllocation  int value for previousAllocation.
         * @param  newAllocation  int value for newAllocation.
         * @param  componentId  int value for componentId.
         * @param  componentHandle  String value for componentHandle.
         * @param  memo  String value for memo.
         * @param  allocationId  int value for allocationId.
         */
        public Builder(int previousAllocation, int newAllocation, int componentId,
                String componentHandle, String memo, int allocationId) {
            this.previousAllocation = previousAllocation;
            this.newAllocation = newAllocation;
            this.componentId = componentId;
            this.componentHandle = componentHandle;
            this.memo = memo;
            this.allocationId = allocationId;
        }

        /**
         * Setter for previousAllocation.
         * @param  previousAllocation  int value for previousAllocation.
         * @return Builder
         */
        public Builder previousAllocation(int previousAllocation) {
            this.previousAllocation = previousAllocation;
            return this;
        }

        /**
         * Setter for newAllocation.
         * @param  newAllocation  int value for newAllocation.
         * @return Builder
         */
        public Builder newAllocation(int newAllocation) {
            this.newAllocation = newAllocation;
            return this;
        }

        /**
         * Setter for componentId.
         * @param  componentId  int value for componentId.
         * @return Builder
         */
        public Builder componentId(int componentId) {
            this.componentId = componentId;
            return this;
        }

        /**
         * Setter for componentHandle.
         * @param  componentHandle  String value for componentHandle.
         * @return Builder
         */
        public Builder componentHandle(String componentHandle) {
            this.componentHandle = componentHandle;
            return this;
        }

        /**
         * Setter for memo.
         * @param  memo  String value for memo.
         * @return Builder
         */
        public Builder memo(String memo) {
            this.memo = memo;
            return this;
        }

        /**
         * Setter for allocationId.
         * @param  allocationId  int value for allocationId.
         * @return Builder
         */
        public Builder allocationId(int allocationId) {
            this.allocationId = allocationId;
            return this;
        }

        /**
         * Setter for allocatedQuantity.
         * @param  allocatedQuantity  Integer value for allocatedQuantity.
         * @return Builder
         */
        public Builder allocatedQuantity(Integer allocatedQuantity) {
            this.allocatedQuantity = allocatedQuantity;
            return this;
        }

        /**
         * Builds a new {@link ComponentAllocationChange} object using the set fields.
         * @return {@link ComponentAllocationChange}
         */
        public ComponentAllocationChange build() {
            return new ComponentAllocationChange(previousAllocation, newAllocation, componentId,
                    componentHandle, memo, allocationId, allocatedQuantity);
        }
    }
}
