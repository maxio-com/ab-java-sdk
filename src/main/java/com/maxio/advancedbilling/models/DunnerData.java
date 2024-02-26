/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import java.time.ZonedDateTime;

/**
 * This is a model class for DunnerData type.
 */
public class DunnerData {
    private String state;
    private int subscriptionId;
    private long revenueAtRiskInCents;
    private ZonedDateTime createdAt;
    private int attempts;
    private ZonedDateTime lastAttemptedAt;

    /**
     * Default constructor.
     */
    public DunnerData() {
    }

    /**
     * Initialization constructor.
     * @param  state  String value for state.
     * @param  subscriptionId  int value for subscriptionId.
     * @param  revenueAtRiskInCents  long value for revenueAtRiskInCents.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  attempts  int value for attempts.
     * @param  lastAttemptedAt  ZonedDateTime value for lastAttemptedAt.
     */
    public DunnerData(
            String state,
            int subscriptionId,
            long revenueAtRiskInCents,
            ZonedDateTime createdAt,
            int attempts,
            ZonedDateTime lastAttemptedAt) {
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
     * @return Returns the long
     */
    @JsonGetter("revenue_at_risk_in_cents")
    public long getRevenueAtRiskInCents() {
        return revenueAtRiskInCents;
    }

    /**
     * Setter for RevenueAtRiskInCents.
     * @param revenueAtRiskInCents Value for long
     */
    @JsonSetter("revenue_at_risk_in_cents")
    public void setRevenueAtRiskInCents(long revenueAtRiskInCents) {
        this.revenueAtRiskInCents = revenueAtRiskInCents;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("created_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for ZonedDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(ZonedDateTime createdAt) {
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
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("last_attempted_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getLastAttemptedAt() {
        return lastAttemptedAt;
    }

    /**
     * Setter for LastAttemptedAt.
     * @param lastAttemptedAt Value for ZonedDateTime
     */
    @JsonSetter("last_attempted_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setLastAttemptedAt(ZonedDateTime lastAttemptedAt) {
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
        private long revenueAtRiskInCents;
        private ZonedDateTime createdAt;
        private int attempts;
        private ZonedDateTime lastAttemptedAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  state  String value for state.
         * @param  subscriptionId  int value for subscriptionId.
         * @param  revenueAtRiskInCents  long value for revenueAtRiskInCents.
         * @param  createdAt  ZonedDateTime value for createdAt.
         * @param  attempts  int value for attempts.
         * @param  lastAttemptedAt  ZonedDateTime value for lastAttemptedAt.
         */
        public Builder(String state, int subscriptionId, long revenueAtRiskInCents,
                ZonedDateTime createdAt, int attempts, ZonedDateTime lastAttemptedAt) {
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
         * @param  revenueAtRiskInCents  long value for revenueAtRiskInCents.
         * @return Builder
         */
        public Builder revenueAtRiskInCents(long revenueAtRiskInCents) {
            this.revenueAtRiskInCents = revenueAtRiskInCents;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  ZonedDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(ZonedDateTime createdAt) {
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
         * @param  lastAttemptedAt  ZonedDateTime value for lastAttemptedAt.
         * @return Builder
         */
        public Builder lastAttemptedAt(ZonedDateTime lastAttemptedAt) {
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
