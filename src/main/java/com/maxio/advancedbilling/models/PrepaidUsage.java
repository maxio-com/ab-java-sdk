/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for PrepaidUsage type.
 */
public class PrepaidUsage {
    private String previousUnitBalance;
    private String previousOverageUnitBalance;
    private int newUnitBalance;
    private int newOverageUnitBalance;
    private int usageQuantity;
    private int overageUsageQuantity;
    private int componentId;
    private String componentHandle;
    private String memo;
    private List<PrepaidUsageAllocationDetail> allocationDetails;

    /**
     * Default constructor.
     */
    public PrepaidUsage() {
    }

    /**
     * Initialization constructor.
     * @param  previousUnitBalance  String value for previousUnitBalance.
     * @param  previousOverageUnitBalance  String value for previousOverageUnitBalance.
     * @param  newUnitBalance  int value for newUnitBalance.
     * @param  newOverageUnitBalance  int value for newOverageUnitBalance.
     * @param  usageQuantity  int value for usageQuantity.
     * @param  overageUsageQuantity  int value for overageUsageQuantity.
     * @param  componentId  int value for componentId.
     * @param  componentHandle  String value for componentHandle.
     * @param  memo  String value for memo.
     * @param  allocationDetails  List of PrepaidUsageAllocationDetail value for allocationDetails.
     */
    @JsonCreator
    public PrepaidUsage(
            @JsonProperty("previous_unit_balance") String previousUnitBalance,
            @JsonProperty("previous_overage_unit_balance") String previousOverageUnitBalance,
            @JsonProperty("new_unit_balance") int newUnitBalance,
            @JsonProperty("new_overage_unit_balance") int newOverageUnitBalance,
            @JsonProperty("usage_quantity") int usageQuantity,
            @JsonProperty("overage_usage_quantity") int overageUsageQuantity,
            @JsonProperty("component_id") int componentId,
            @JsonProperty("component_handle") String componentHandle,
            @JsonProperty("memo") String memo,
            @JsonProperty("allocation_details") List<PrepaidUsageAllocationDetail> allocationDetails) {
        this.previousUnitBalance = previousUnitBalance;
        this.previousOverageUnitBalance = previousOverageUnitBalance;
        this.newUnitBalance = newUnitBalance;
        this.newOverageUnitBalance = newOverageUnitBalance;
        this.usageQuantity = usageQuantity;
        this.overageUsageQuantity = overageUsageQuantity;
        this.componentId = componentId;
        this.componentHandle = componentHandle;
        this.memo = memo;
        this.allocationDetails = allocationDetails;
    }

    /**
     * Getter for PreviousUnitBalance.
     * @return Returns the String
     */
    @JsonGetter("previous_unit_balance")
    public String getPreviousUnitBalance() {
        return previousUnitBalance;
    }

    /**
     * Setter for PreviousUnitBalance.
     * @param previousUnitBalance Value for String
     */
    @JsonSetter("previous_unit_balance")
    public void setPreviousUnitBalance(String previousUnitBalance) {
        this.previousUnitBalance = previousUnitBalance;
    }

    /**
     * Getter for PreviousOverageUnitBalance.
     * @return Returns the String
     */
    @JsonGetter("previous_overage_unit_balance")
    public String getPreviousOverageUnitBalance() {
        return previousOverageUnitBalance;
    }

    /**
     * Setter for PreviousOverageUnitBalance.
     * @param previousOverageUnitBalance Value for String
     */
    @JsonSetter("previous_overage_unit_balance")
    public void setPreviousOverageUnitBalance(String previousOverageUnitBalance) {
        this.previousOverageUnitBalance = previousOverageUnitBalance;
    }

    /**
     * Getter for NewUnitBalance.
     * @return Returns the int
     */
    @JsonGetter("new_unit_balance")
    public int getNewUnitBalance() {
        return newUnitBalance;
    }

    /**
     * Setter for NewUnitBalance.
     * @param newUnitBalance Value for int
     */
    @JsonSetter("new_unit_balance")
    public void setNewUnitBalance(int newUnitBalance) {
        this.newUnitBalance = newUnitBalance;
    }

    /**
     * Getter for NewOverageUnitBalance.
     * @return Returns the int
     */
    @JsonGetter("new_overage_unit_balance")
    public int getNewOverageUnitBalance() {
        return newOverageUnitBalance;
    }

    /**
     * Setter for NewOverageUnitBalance.
     * @param newOverageUnitBalance Value for int
     */
    @JsonSetter("new_overage_unit_balance")
    public void setNewOverageUnitBalance(int newOverageUnitBalance) {
        this.newOverageUnitBalance = newOverageUnitBalance;
    }

    /**
     * Getter for UsageQuantity.
     * @return Returns the int
     */
    @JsonGetter("usage_quantity")
    public int getUsageQuantity() {
        return usageQuantity;
    }

    /**
     * Setter for UsageQuantity.
     * @param usageQuantity Value for int
     */
    @JsonSetter("usage_quantity")
    public void setUsageQuantity(int usageQuantity) {
        this.usageQuantity = usageQuantity;
    }

    /**
     * Getter for OverageUsageQuantity.
     * @return Returns the int
     */
    @JsonGetter("overage_usage_quantity")
    public int getOverageUsageQuantity() {
        return overageUsageQuantity;
    }

    /**
     * Setter for OverageUsageQuantity.
     * @param overageUsageQuantity Value for int
     */
    @JsonSetter("overage_usage_quantity")
    public void setOverageUsageQuantity(int overageUsageQuantity) {
        this.overageUsageQuantity = overageUsageQuantity;
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
     * Getter for AllocationDetails.
     * @return Returns the List of PrepaidUsageAllocationDetail
     */
    @JsonGetter("allocation_details")
    public List<PrepaidUsageAllocationDetail> getAllocationDetails() {
        return allocationDetails;
    }

    /**
     * Setter for AllocationDetails.
     * @param allocationDetails Value for List of PrepaidUsageAllocationDetail
     */
    @JsonSetter("allocation_details")
    public void setAllocationDetails(List<PrepaidUsageAllocationDetail> allocationDetails) {
        this.allocationDetails = allocationDetails;
    }

    /**
     * Converts this PrepaidUsage into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrepaidUsage [" + "previousUnitBalance=" + previousUnitBalance
                + ", previousOverageUnitBalance=" + previousOverageUnitBalance + ", newUnitBalance="
                + newUnitBalance + ", newOverageUnitBalance=" + newOverageUnitBalance
                + ", usageQuantity=" + usageQuantity + ", overageUsageQuantity="
                + overageUsageQuantity + ", componentId=" + componentId + ", componentHandle="
                + componentHandle + ", memo=" + memo + ", allocationDetails=" + allocationDetails
                + "]";
    }

    /**
     * Builds a new {@link PrepaidUsage.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PrepaidUsage.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(previousUnitBalance, previousOverageUnitBalance,
                newUnitBalance, newOverageUnitBalance, usageQuantity, overageUsageQuantity,
                componentId, componentHandle, memo, allocationDetails);
        return builder;
    }

    /**
     * Class to build instances of {@link PrepaidUsage}.
     */
    public static class Builder {
        private String previousUnitBalance;
        private String previousOverageUnitBalance;
        private int newUnitBalance;
        private int newOverageUnitBalance;
        private int usageQuantity;
        private int overageUsageQuantity;
        private int componentId;
        private String componentHandle;
        private String memo;
        private List<PrepaidUsageAllocationDetail> allocationDetails;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  previousUnitBalance  String value for previousUnitBalance.
         * @param  previousOverageUnitBalance  String value for previousOverageUnitBalance.
         * @param  newUnitBalance  int value for newUnitBalance.
         * @param  newOverageUnitBalance  int value for newOverageUnitBalance.
         * @param  usageQuantity  int value for usageQuantity.
         * @param  overageUsageQuantity  int value for overageUsageQuantity.
         * @param  componentId  int value for componentId.
         * @param  componentHandle  String value for componentHandle.
         * @param  memo  String value for memo.
         * @param  allocationDetails  List of PrepaidUsageAllocationDetail value for
         *         allocationDetails.
         */
        public Builder(String previousUnitBalance, String previousOverageUnitBalance,
                int newUnitBalance, int newOverageUnitBalance, int usageQuantity,
                int overageUsageQuantity, int componentId, String componentHandle, String memo,
                List<PrepaidUsageAllocationDetail> allocationDetails) {
            this.previousUnitBalance = previousUnitBalance;
            this.previousOverageUnitBalance = previousOverageUnitBalance;
            this.newUnitBalance = newUnitBalance;
            this.newOverageUnitBalance = newOverageUnitBalance;
            this.usageQuantity = usageQuantity;
            this.overageUsageQuantity = overageUsageQuantity;
            this.componentId = componentId;
            this.componentHandle = componentHandle;
            this.memo = memo;
            this.allocationDetails = allocationDetails;
        }

        /**
         * Setter for previousUnitBalance.
         * @param  previousUnitBalance  String value for previousUnitBalance.
         * @return Builder
         */
        public Builder previousUnitBalance(String previousUnitBalance) {
            this.previousUnitBalance = previousUnitBalance;
            return this;
        }

        /**
         * Setter for previousOverageUnitBalance.
         * @param  previousOverageUnitBalance  String value for previousOverageUnitBalance.
         * @return Builder
         */
        public Builder previousOverageUnitBalance(String previousOverageUnitBalance) {
            this.previousOverageUnitBalance = previousOverageUnitBalance;
            return this;
        }

        /**
         * Setter for newUnitBalance.
         * @param  newUnitBalance  int value for newUnitBalance.
         * @return Builder
         */
        public Builder newUnitBalance(int newUnitBalance) {
            this.newUnitBalance = newUnitBalance;
            return this;
        }

        /**
         * Setter for newOverageUnitBalance.
         * @param  newOverageUnitBalance  int value for newOverageUnitBalance.
         * @return Builder
         */
        public Builder newOverageUnitBalance(int newOverageUnitBalance) {
            this.newOverageUnitBalance = newOverageUnitBalance;
            return this;
        }

        /**
         * Setter for usageQuantity.
         * @param  usageQuantity  int value for usageQuantity.
         * @return Builder
         */
        public Builder usageQuantity(int usageQuantity) {
            this.usageQuantity = usageQuantity;
            return this;
        }

        /**
         * Setter for overageUsageQuantity.
         * @param  overageUsageQuantity  int value for overageUsageQuantity.
         * @return Builder
         */
        public Builder overageUsageQuantity(int overageUsageQuantity) {
            this.overageUsageQuantity = overageUsageQuantity;
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
         * Setter for allocationDetails.
         * @param  allocationDetails  List of PrepaidUsageAllocationDetail value for
         *         allocationDetails.
         * @return Builder
         */
        public Builder allocationDetails(List<PrepaidUsageAllocationDetail> allocationDetails) {
            this.allocationDetails = allocationDetails;
            return this;
        }

        /**
         * Builds a new {@link PrepaidUsage} object using the set fields.
         * @return {@link PrepaidUsage}
         */
        public PrepaidUsage build() {
            return new PrepaidUsage(previousUnitBalance, previousOverageUnitBalance, newUnitBalance,
                    newOverageUnitBalance, usageQuantity, overageUsageQuantity, componentId,
                    componentHandle, memo, allocationDetails);
        }
    }
}
