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
 * This is a model class for PrepaidUsageAllocationDetail type.
 */
public class PrepaidUsageAllocationDetail {
    private Integer allocationId;
    private Integer chargeId;
    private Integer usageQuantity;

    /**
     * Default constructor.
     */
    public PrepaidUsageAllocationDetail() {
    }

    /**
     * Initialization constructor.
     * @param  allocationId  Integer value for allocationId.
     * @param  chargeId  Integer value for chargeId.
     * @param  usageQuantity  Integer value for usageQuantity.
     */
    public PrepaidUsageAllocationDetail(
            Integer allocationId,
            Integer chargeId,
            Integer usageQuantity) {
        this.allocationId = allocationId;
        this.chargeId = chargeId;
        this.usageQuantity = usageQuantity;
    }

    /**
     * Getter for AllocationId.
     * @return Returns the Integer
     */
    @JsonGetter("allocation_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAllocationId() {
        return allocationId;
    }

    /**
     * Setter for AllocationId.
     * @param allocationId Value for Integer
     */
    @JsonSetter("allocation_id")
    public void setAllocationId(Integer allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * Getter for ChargeId.
     * @return Returns the Integer
     */
    @JsonGetter("charge_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getChargeId() {
        return chargeId;
    }

    /**
     * Setter for ChargeId.
     * @param chargeId Value for Integer
     */
    @JsonSetter("charge_id")
    public void setChargeId(Integer chargeId) {
        this.chargeId = chargeId;
    }

    /**
     * Getter for UsageQuantity.
     * @return Returns the Integer
     */
    @JsonGetter("usage_quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getUsageQuantity() {
        return usageQuantity;
    }

    /**
     * Setter for UsageQuantity.
     * @param usageQuantity Value for Integer
     */
    @JsonSetter("usage_quantity")
    public void setUsageQuantity(Integer usageQuantity) {
        this.usageQuantity = usageQuantity;
    }

    /**
     * Converts this PrepaidUsageAllocationDetail into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrepaidUsageAllocationDetail [" + "allocationId=" + allocationId + ", chargeId="
                + chargeId + ", usageQuantity=" + usageQuantity + "]";
    }

    /**
     * Builds a new {@link PrepaidUsageAllocationDetail.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PrepaidUsageAllocationDetail.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .allocationId(getAllocationId())
                .chargeId(getChargeId())
                .usageQuantity(getUsageQuantity());
        return builder;
    }

    /**
     * Class to build instances of {@link PrepaidUsageAllocationDetail}.
     */
    public static class Builder {
        private Integer allocationId;
        private Integer chargeId;
        private Integer usageQuantity;



        /**
         * Setter for allocationId.
         * @param  allocationId  Integer value for allocationId.
         * @return Builder
         */
        public Builder allocationId(Integer allocationId) {
            this.allocationId = allocationId;
            return this;
        }

        /**
         * Setter for chargeId.
         * @param  chargeId  Integer value for chargeId.
         * @return Builder
         */
        public Builder chargeId(Integer chargeId) {
            this.chargeId = chargeId;
            return this;
        }

        /**
         * Setter for usageQuantity.
         * @param  usageQuantity  Integer value for usageQuantity.
         * @return Builder
         */
        public Builder usageQuantity(Integer usageQuantity) {
            this.usageQuantity = usageQuantity;
            return this;
        }

        /**
         * Builds a new {@link PrepaidUsageAllocationDetail} object using the set fields.
         * @return {@link PrepaidUsageAllocationDetail}
         */
        public PrepaidUsageAllocationDetail build() {
            return new PrepaidUsageAllocationDetail(allocationId, chargeId, usageQuantity);
        }
    }
}
