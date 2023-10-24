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

/**
 * This is a model class for MeteredUsage type.
 */
public class MeteredUsage {
    private String previousUnitBalance;
    private int newUnitBalance;
    private int usageQuantity;
    private int componentId;
    private String componentHandle;
    private String memo;

    /**
     * Default constructor.
     */
    public MeteredUsage() {
    }

    /**
     * Initialization constructor.
     * @param  previousUnitBalance  String value for previousUnitBalance.
     * @param  newUnitBalance  int value for newUnitBalance.
     * @param  usageQuantity  int value for usageQuantity.
     * @param  componentId  int value for componentId.
     * @param  componentHandle  String value for componentHandle.
     * @param  memo  String value for memo.
     */
    @JsonCreator
    public MeteredUsage(
            @JsonProperty("previous_unit_balance") String previousUnitBalance,
            @JsonProperty("new_unit_balance") int newUnitBalance,
            @JsonProperty("usage_quantity") int usageQuantity,
            @JsonProperty("component_id") int componentId,
            @JsonProperty("component_handle") String componentHandle,
            @JsonProperty("memo") String memo) {
        this.previousUnitBalance = previousUnitBalance;
        this.newUnitBalance = newUnitBalance;
        this.usageQuantity = usageQuantity;
        this.componentId = componentId;
        this.componentHandle = componentHandle;
        this.memo = memo;
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
     * Converts this MeteredUsage into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MeteredUsage [" + "previousUnitBalance=" + previousUnitBalance + ", newUnitBalance="
                + newUnitBalance + ", usageQuantity=" + usageQuantity + ", componentId="
                + componentId + ", componentHandle=" + componentHandle + ", memo=" + memo + "]";
    }

    /**
     * Builds a new {@link MeteredUsage.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MeteredUsage.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(previousUnitBalance, newUnitBalance, usageQuantity,
                componentId, componentHandle, memo);
        return builder;
    }

    /**
     * Class to build instances of {@link MeteredUsage}.
     */
    public static class Builder {
        private String previousUnitBalance;
        private int newUnitBalance;
        private int usageQuantity;
        private int componentId;
        private String componentHandle;
        private String memo;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  previousUnitBalance  String value for previousUnitBalance.
         * @param  newUnitBalance  int value for newUnitBalance.
         * @param  usageQuantity  int value for usageQuantity.
         * @param  componentId  int value for componentId.
         * @param  componentHandle  String value for componentHandle.
         * @param  memo  String value for memo.
         */
        public Builder(String previousUnitBalance, int newUnitBalance, int usageQuantity,
                int componentId, String componentHandle, String memo) {
            this.previousUnitBalance = previousUnitBalance;
            this.newUnitBalance = newUnitBalance;
            this.usageQuantity = usageQuantity;
            this.componentId = componentId;
            this.componentHandle = componentHandle;
            this.memo = memo;
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
         * Setter for newUnitBalance.
         * @param  newUnitBalance  int value for newUnitBalance.
         * @return Builder
         */
        public Builder newUnitBalance(int newUnitBalance) {
            this.newUnitBalance = newUnitBalance;
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
         * Builds a new {@link MeteredUsage} object using the set fields.
         * @return {@link MeteredUsage}
         */
        public MeteredUsage build() {
            return new MeteredUsage(previousUnitBalance, newUnitBalance, usageQuantity, componentId,
                    componentHandle, memo);
        }
    }
}
