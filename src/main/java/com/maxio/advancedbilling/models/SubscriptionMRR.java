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
 * This is a model class for SubscriptionMRR type.
 */
public class SubscriptionMRR {
    private double subscriptionId;
    private double mrrAmountInCents;
    private SubscriptionMRRBreakout breakouts;

    /**
     * Default constructor.
     */
    public SubscriptionMRR() {
    }

    /**
     * Initialization constructor.
     * @param  subscriptionId  double value for subscriptionId.
     * @param  mrrAmountInCents  double value for mrrAmountInCents.
     * @param  breakouts  SubscriptionMRRBreakout value for breakouts.
     */
    public SubscriptionMRR(
            double subscriptionId,
            double mrrAmountInCents,
            SubscriptionMRRBreakout breakouts) {
        this.subscriptionId = subscriptionId;
        this.mrrAmountInCents = mrrAmountInCents;
        this.breakouts = breakouts;
    }

    /**
     * Getter for SubscriptionId.
     * @return Returns the double
     */
    @JsonGetter("subscription_id")
    public double getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * @param subscriptionId Value for double
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(double subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for MrrAmountInCents.
     * @return Returns the double
     */
    @JsonGetter("mrr_amount_in_cents")
    public double getMrrAmountInCents() {
        return mrrAmountInCents;
    }

    /**
     * Setter for MrrAmountInCents.
     * @param mrrAmountInCents Value for double
     */
    @JsonSetter("mrr_amount_in_cents")
    public void setMrrAmountInCents(double mrrAmountInCents) {
        this.mrrAmountInCents = mrrAmountInCents;
    }

    /**
     * Getter for Breakouts.
     * @return Returns the SubscriptionMRRBreakout
     */
    @JsonGetter("breakouts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionMRRBreakout getBreakouts() {
        return breakouts;
    }

    /**
     * Setter for Breakouts.
     * @param breakouts Value for SubscriptionMRRBreakout
     */
    @JsonSetter("breakouts")
    public void setBreakouts(SubscriptionMRRBreakout breakouts) {
        this.breakouts = breakouts;
    }

    /**
     * Converts this SubscriptionMRR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionMRR [" + "subscriptionId=" + subscriptionId + ", mrrAmountInCents="
                + mrrAmountInCents + ", breakouts=" + breakouts + "]";
    }

    /**
     * Builds a new {@link SubscriptionMRR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionMRR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscriptionId, mrrAmountInCents)
                .breakouts(getBreakouts());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionMRR}.
     */
    public static class Builder {
        private double subscriptionId;
        private double mrrAmountInCents;
        private SubscriptionMRRBreakout breakouts;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  subscriptionId  double value for subscriptionId.
         * @param  mrrAmountInCents  double value for mrrAmountInCents.
         */
        public Builder(double subscriptionId, double mrrAmountInCents) {
            this.subscriptionId = subscriptionId;
            this.mrrAmountInCents = mrrAmountInCents;
        }

        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  double value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(double subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setter for mrrAmountInCents.
         * @param  mrrAmountInCents  double value for mrrAmountInCents.
         * @return Builder
         */
        public Builder mrrAmountInCents(double mrrAmountInCents) {
            this.mrrAmountInCents = mrrAmountInCents;
            return this;
        }

        /**
         * Setter for breakouts.
         * @param  breakouts  SubscriptionMRRBreakout value for breakouts.
         * @return Builder
         */
        public Builder breakouts(SubscriptionMRRBreakout breakouts) {
            this.breakouts = breakouts;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionMRR} object using the set fields.
         * @return {@link SubscriptionMRR}
         */
        public SubscriptionMRR build() {
            return new SubscriptionMRR(subscriptionId, mrrAmountInCents, breakouts);
        }
    }
}
