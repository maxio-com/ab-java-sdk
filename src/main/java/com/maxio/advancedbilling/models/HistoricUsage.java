/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.ZonedDateTime;

/**
 * This is a model class for HistoricUsage type.
 */
public class HistoricUsage
        extends BaseModel {
    private Double totalUsageQuantity;
    private ZonedDateTime billingPeriodStartsAt;
    private ZonedDateTime billingPeriodEndsAt;

    /**
     * Default constructor.
     */
    public HistoricUsage() {
    }

    /**
     * Initialization constructor.
     * @param  totalUsageQuantity  Double value for totalUsageQuantity.
     * @param  billingPeriodStartsAt  ZonedDateTime value for billingPeriodStartsAt.
     * @param  billingPeriodEndsAt  ZonedDateTime value for billingPeriodEndsAt.
     */
    public HistoricUsage(
            Double totalUsageQuantity,
            ZonedDateTime billingPeriodStartsAt,
            ZonedDateTime billingPeriodEndsAt) {
        this.totalUsageQuantity = totalUsageQuantity;
        this.billingPeriodStartsAt = billingPeriodStartsAt;
        this.billingPeriodEndsAt = billingPeriodEndsAt;
    }

    /**
     * Getter for TotalUsageQuantity.
     * Total usage of a component for billing period
     * @return Returns the Double
     */
    @JsonGetter("total_usage_quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getTotalUsageQuantity() {
        return totalUsageQuantity;
    }

    /**
     * Setter for TotalUsageQuantity.
     * Total usage of a component for billing period
     * @param totalUsageQuantity Value for Double
     */
    @JsonSetter("total_usage_quantity")
    public void setTotalUsageQuantity(Double totalUsageQuantity) {
        this.totalUsageQuantity = totalUsageQuantity;
    }

    /**
     * Getter for BillingPeriodStartsAt.
     * Start date of billing period
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("billing_period_starts_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getBillingPeriodStartsAt() {
        return billingPeriodStartsAt;
    }

    /**
     * Setter for BillingPeriodStartsAt.
     * Start date of billing period
     * @param billingPeriodStartsAt Value for ZonedDateTime
     */
    @JsonSetter("billing_period_starts_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setBillingPeriodStartsAt(ZonedDateTime billingPeriodStartsAt) {
        this.billingPeriodStartsAt = billingPeriodStartsAt;
    }

    /**
     * Getter for BillingPeriodEndsAt.
     * End date of billing period
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("billing_period_ends_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getBillingPeriodEndsAt() {
        return billingPeriodEndsAt;
    }

    /**
     * Setter for BillingPeriodEndsAt.
     * End date of billing period
     * @param billingPeriodEndsAt Value for ZonedDateTime
     */
    @JsonSetter("billing_period_ends_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setBillingPeriodEndsAt(ZonedDateTime billingPeriodEndsAt) {
        this.billingPeriodEndsAt = billingPeriodEndsAt;
    }

    /**
     * Converts this HistoricUsage into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "HistoricUsage [" + "totalUsageQuantity=" + totalUsageQuantity
                + ", billingPeriodStartsAt=" + billingPeriodStartsAt + ", billingPeriodEndsAt="
                + billingPeriodEndsAt + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link HistoricUsage.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link HistoricUsage.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .totalUsageQuantity(getTotalUsageQuantity())
                .billingPeriodStartsAt(getBillingPeriodStartsAt())
                .billingPeriodEndsAt(getBillingPeriodEndsAt());
        return builder;
    }

    /**
     * Class to build instances of {@link HistoricUsage}.
     */
    public static class Builder {
        private Double totalUsageQuantity;
        private ZonedDateTime billingPeriodStartsAt;
        private ZonedDateTime billingPeriodEndsAt;



        /**
         * Setter for totalUsageQuantity.
         * @param  totalUsageQuantity  Double value for totalUsageQuantity.
         * @return Builder
         */
        public Builder totalUsageQuantity(Double totalUsageQuantity) {
            this.totalUsageQuantity = totalUsageQuantity;
            return this;
        }

        /**
         * Setter for billingPeriodStartsAt.
         * @param  billingPeriodStartsAt  ZonedDateTime value for billingPeriodStartsAt.
         * @return Builder
         */
        public Builder billingPeriodStartsAt(ZonedDateTime billingPeriodStartsAt) {
            this.billingPeriodStartsAt = billingPeriodStartsAt;
            return this;
        }

        /**
         * Setter for billingPeriodEndsAt.
         * @param  billingPeriodEndsAt  ZonedDateTime value for billingPeriodEndsAt.
         * @return Builder
         */
        public Builder billingPeriodEndsAt(ZonedDateTime billingPeriodEndsAt) {
            this.billingPeriodEndsAt = billingPeriodEndsAt;
            return this;
        }

        /**
         * Builds a new {@link HistoricUsage} object using the set fields.
         * @return {@link HistoricUsage}
         */
        public HistoricUsage build() {
            return new HistoricUsage(totalUsageQuantity, billingPeriodStartsAt,
                    billingPeriodEndsAt);
        }
    }
}
