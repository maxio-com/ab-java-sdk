/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for DunnerData type.
 */
public class DunnerData {
    private String state;
    private int subscriptionId;
    private int revenueAtRiskInCents;
    private String createdAt;
    private int attempts;
    private String lastAttemptedAt;

    /**
     * Default constructor.
     */
    public DunnerData() {
    }

    /**
     * Initialization constructor.
     * @param  state  String value for state.
     * @param  subscriptionId  int value for subscriptionId.
     * @param  revenueAtRiskInCents  int value for revenueAtRiskInCents.
     * @param  createdAt  String value for createdAt.
     * @param  attempts  int value for attempts.
     * @param  lastAttemptedAt  String value for lastAttemptedAt.
     */
    public DunnerData(
            String state,
            int subscriptionId,
            int revenueAtRiskInCents,
            String createdAt,
            int attempts,
            String lastAttemptedAt) {
        this.state = state;
        this.subscriptionId = subscriptionId;
        this.revenueAtRiskInCents = revenueAtRiskInCents;
        this.createdAt = createdAt;
        this.attempts = attempts;
        this.lastAttemptedAt = lastAttemptedAt;
    }

    /**
     * Getter for State.
     * @return Returns the String
     */
    @JsonGetter("state")
    public String getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for String
     */
    @JsonSetter("state")
    public void setState(String state) {
        this.state = state;
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
     * Getter for RevenueAtRiskInCents.
     * @return Returns the int
     */
    @JsonGetter("revenue_at_risk_in_cents")
    public int getRevenueAtRiskInCents() {
        return revenueAtRiskInCents;
    }

    /**
     * Setter for RevenueAtRiskInCents.
     * @param revenueAtRiskInCents Value for int
     */
    @JsonSetter("revenue_at_risk_in_cents")
    public void setRevenueAtRiskInCents(int revenueAtRiskInCents) {
        this.revenueAtRiskInCents = revenueAtRiskInCents;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for Attempts.
     * @return Returns the int
     */
    @JsonGetter("attempts")
    public int getAttempts() {
        return attempts;
    }

    /**
     * Setter for Attempts.
     * @param attempts Value for int
     */
    @JsonSetter("attempts")
    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    /**
     * Getter for LastAttemptedAt.
     * @return Returns the String
     */
    @JsonGetter("last_attempted_at")
    public String getLastAttemptedAt() {
        return lastAttemptedAt;
    }

    /**
     * Setter for LastAttemptedAt.
     * @param lastAttemptedAt Value for String
     */
    @JsonSetter("last_attempted_at")
    public void setLastAttemptedAt(String lastAttemptedAt) {
        this.lastAttemptedAt = lastAttemptedAt;
    }

    /**
     * Converts this DunnerData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DunnerData [" + "state=" + state + ", subscriptionId=" + subscriptionId
                + ", revenueAtRiskInCents=" + revenueAtRiskInCents + ", createdAt=" + createdAt
                + ", attempts=" + attempts + ", lastAttemptedAt=" + lastAttemptedAt + "]";
    }

    /**
     * Builds a new {@link DunnerData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DunnerData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(state, subscriptionId, revenueAtRiskInCents, createdAt,
                attempts, lastAttemptedAt);
        return builder;
    }

    /**
     * Class to build instances of {@link DunnerData}.
     */
    public static class Builder {
        private String state;
        private int subscriptionId;
        private int revenueAtRiskInCents;
        private String createdAt;
        private int attempts;
        private String lastAttemptedAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  state  String value for state.
         * @param  subscriptionId  int value for subscriptionId.
         * @param  revenueAtRiskInCents  int value for revenueAtRiskInCents.
         * @param  createdAt  String value for createdAt.
         * @param  attempts  int value for attempts.
         * @param  lastAttemptedAt  String value for lastAttemptedAt.
         */
        public Builder(String state, int subscriptionId, int revenueAtRiskInCents, String createdAt,
                int attempts, String lastAttemptedAt) {
            this.state = state;
            this.subscriptionId = subscriptionId;
            this.revenueAtRiskInCents = revenueAtRiskInCents;
            this.createdAt = createdAt;
            this.attempts = attempts;
            this.lastAttemptedAt = lastAttemptedAt;
        }

        /**
         * Setter for state.
         * @param  state  String value for state.
         * @return Builder
         */
        public Builder state(String state) {
            this.state = state;
            return this;
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
         * Setter for revenueAtRiskInCents.
         * @param  revenueAtRiskInCents  int value for revenueAtRiskInCents.
         * @return Builder
         */
        public Builder revenueAtRiskInCents(int revenueAtRiskInCents) {
            this.revenueAtRiskInCents = revenueAtRiskInCents;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for attempts.
         * @param  attempts  int value for attempts.
         * @return Builder
         */
        public Builder attempts(int attempts) {
            this.attempts = attempts;
            return this;
        }

        /**
         * Setter for lastAttemptedAt.
         * @param  lastAttemptedAt  String value for lastAttemptedAt.
         * @return Builder
         */
        public Builder lastAttemptedAt(String lastAttemptedAt) {
            this.lastAttemptedAt = lastAttemptedAt;
            return this;
        }

        /**
         * Builds a new {@link DunnerData} object using the set fields.
         * @return {@link DunnerData}
         */
        public DunnerData build() {
            return new DunnerData(state, subscriptionId, revenueAtRiskInCents, createdAt, attempts,
                    lastAttemptedAt);
        }
    }
}
