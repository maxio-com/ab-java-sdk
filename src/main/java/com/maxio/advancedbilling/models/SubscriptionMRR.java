/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for SubscriptionMRR type.
 */
public class SubscriptionMRR
        extends BaseModel {
    private int subscriptionId;
    private long mrrAmountInCents;
    private SubscriptionMRRBreakout breakouts;

    /**
     * Default constructor.
     */
    public SubscriptionMRR() {
    }

    /**
     * Initialization constructor.
     * @param  subscriptionId  int value for subscriptionId.
     * @param  mrrAmountInCents  long value for mrrAmountInCents.
     * @param  breakouts  SubscriptionMRRBreakout value for breakouts.
     */
    public SubscriptionMRR(
            int subscriptionId,
            long mrrAmountInCents,
            SubscriptionMRRBreakout breakouts) {
        this.subscriptionId = subscriptionId;
        this.mrrAmountInCents = mrrAmountInCents;
        this.breakouts = breakouts;
    }

    /**
     * Getter for SubscriptionId.
     * @return Returns the int
     */
    @JsonGetter("subscription_id")
    public int getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * @param subscriptionId Value for int
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for MrrAmountInCents.
     * @return Returns the long
     */
    @JsonGetter("mrr_amount_in_cents")
    public long getMrrAmountInCents() {
        return mrrAmountInCents;
    }

    /**
     * Setter for MrrAmountInCents.
     * @param mrrAmountInCents Value for long
     */
    @JsonSetter("mrr_amount_in_cents")
    public void setMrrAmountInCents(long mrrAmountInCents) {
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
                + mrrAmountInCents + ", breakouts=" + breakouts + ", additionalProperties="
                + getAdditionalProperties() + "]";
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
        private int subscriptionId;
        private long mrrAmountInCents;
        private SubscriptionMRRBreakout breakouts;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  subscriptionId  int value for subscriptionId.
         * @param  mrrAmountInCents  long value for mrrAmountInCents.
         */
        public Builder(int subscriptionId, long mrrAmountInCents) {
            this.subscriptionId = subscriptionId;
            this.mrrAmountInCents = mrrAmountInCents;
        }

        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  int value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(int subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setter for mrrAmountInCents.
         * @param  mrrAmountInCents  long value for mrrAmountInCents.
         * @return Builder
         */
        public Builder mrrAmountInCents(long mrrAmountInCents) {
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
