/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SubscriptionMRRBreakout type.
 */
public class SubscriptionMRRBreakout {
    private double planAmountInCents;
    private double usageAmountInCents;

    /**
     * Default constructor.
     */
    public SubscriptionMRRBreakout() {
    }

    /**
     * Initialization constructor.
     * @param  planAmountInCents  double value for planAmountInCents.
     * @param  usageAmountInCents  double value for usageAmountInCents.
     */
    public SubscriptionMRRBreakout(
            double planAmountInCents,
            double usageAmountInCents) {
        this.planAmountInCents = planAmountInCents;
        this.usageAmountInCents = usageAmountInCents;
    }

    /**
     * Getter for PlanAmountInCents.
     * @return Returns the double
     */
    @JsonGetter("plan_amount_in_cents")
    public double getPlanAmountInCents() {
        return planAmountInCents;
    }

    /**
     * Setter for PlanAmountInCents.
     * @param planAmountInCents Value for double
     */
    @JsonSetter("plan_amount_in_cents")
    public void setPlanAmountInCents(double planAmountInCents) {
        this.planAmountInCents = planAmountInCents;
    }

    /**
     * Getter for UsageAmountInCents.
     * @return Returns the double
     */
    @JsonGetter("usage_amount_in_cents")
    public double getUsageAmountInCents() {
        return usageAmountInCents;
    }

    /**
     * Setter for UsageAmountInCents.
     * @param usageAmountInCents Value for double
     */
    @JsonSetter("usage_amount_in_cents")
    public void setUsageAmountInCents(double usageAmountInCents) {
        this.usageAmountInCents = usageAmountInCents;
    }

    /**
     * Converts this SubscriptionMRRBreakout into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionMRRBreakout [" + "planAmountInCents=" + planAmountInCents
                + ", usageAmountInCents=" + usageAmountInCents + "]";
    }

    /**
     * Builds a new {@link SubscriptionMRRBreakout.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionMRRBreakout.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(planAmountInCents, usageAmountInCents);
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionMRRBreakout}.
     */
    public static class Builder {
        private double planAmountInCents;
        private double usageAmountInCents;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  planAmountInCents  double value for planAmountInCents.
         * @param  usageAmountInCents  double value for usageAmountInCents.
         */
        public Builder(double planAmountInCents, double usageAmountInCents) {
            this.planAmountInCents = planAmountInCents;
            this.usageAmountInCents = usageAmountInCents;
        }

        /**
         * Setter for planAmountInCents.
         * @param  planAmountInCents  double value for planAmountInCents.
         * @return Builder
         */
        public Builder planAmountInCents(double planAmountInCents) {
            this.planAmountInCents = planAmountInCents;
            return this;
        }

        /**
         * Setter for usageAmountInCents.
         * @param  usageAmountInCents  double value for usageAmountInCents.
         * @return Builder
         */
        public Builder usageAmountInCents(double usageAmountInCents) {
            this.usageAmountInCents = usageAmountInCents;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionMRRBreakout} object using the set fields.
         * @return {@link SubscriptionMRRBreakout}
         */
        public SubscriptionMRRBreakout build() {
            return new SubscriptionMRRBreakout(planAmountInCents, usageAmountInCents);
        }
    }
}
