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
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for PrepaidSubscriptionBalanceChanged type.
 */
public class PrepaidSubscriptionBalanceChanged
        extends BaseModel {
    private String reason;
    private long currentAccountBalanceInCents;
    private long prepaymentAccountBalanceInCents;
    private long currentUsageAmountInCents;

    /**
     * Default constructor.
     */
    public PrepaidSubscriptionBalanceChanged() {
    }

    /**
     * Initialization constructor.
     * @param  reason  String value for reason.
     * @param  currentAccountBalanceInCents  long value for currentAccountBalanceInCents.
     * @param  prepaymentAccountBalanceInCents  long value for prepaymentAccountBalanceInCents.
     * @param  currentUsageAmountInCents  long value for currentUsageAmountInCents.
     */
    @JsonCreator
    public PrepaidSubscriptionBalanceChanged(
            @JsonProperty("reason") String reason,
            @JsonProperty("current_account_balance_in_cents") long currentAccountBalanceInCents,
            @JsonProperty("prepayment_account_balance_in_cents") long prepaymentAccountBalanceInCents,
            @JsonProperty("current_usage_amount_in_cents") long currentUsageAmountInCents) {
        this.reason = reason;
        this.currentAccountBalanceInCents = currentAccountBalanceInCents;
        this.prepaymentAccountBalanceInCents = prepaymentAccountBalanceInCents;
        this.currentUsageAmountInCents = currentUsageAmountInCents;
    }

    /**
     * Getter for Reason.
     * @return Returns the String
     */
    @JsonGetter("reason")
    public String getReason() {
        return reason;
    }

    /**
     * Setter for Reason.
     * @param reason Value for String
     */
    @JsonSetter("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Getter for CurrentAccountBalanceInCents.
     * @return Returns the long
     */
    @JsonGetter("current_account_balance_in_cents")
    public long getCurrentAccountBalanceInCents() {
        return currentAccountBalanceInCents;
    }

    /**
     * Setter for CurrentAccountBalanceInCents.
     * @param currentAccountBalanceInCents Value for long
     */
    @JsonSetter("current_account_balance_in_cents")
    public void setCurrentAccountBalanceInCents(long currentAccountBalanceInCents) {
        this.currentAccountBalanceInCents = currentAccountBalanceInCents;
    }

    /**
     * Getter for PrepaymentAccountBalanceInCents.
     * @return Returns the long
     */
    @JsonGetter("prepayment_account_balance_in_cents")
    public long getPrepaymentAccountBalanceInCents() {
        return prepaymentAccountBalanceInCents;
    }

    /**
     * Setter for PrepaymentAccountBalanceInCents.
     * @param prepaymentAccountBalanceInCents Value for long
     */
    @JsonSetter("prepayment_account_balance_in_cents")
    public void setPrepaymentAccountBalanceInCents(long prepaymentAccountBalanceInCents) {
        this.prepaymentAccountBalanceInCents = prepaymentAccountBalanceInCents;
    }

    /**
     * Getter for CurrentUsageAmountInCents.
     * @return Returns the long
     */
    @JsonGetter("current_usage_amount_in_cents")
    public long getCurrentUsageAmountInCents() {
        return currentUsageAmountInCents;
    }

    /**
     * Setter for CurrentUsageAmountInCents.
     * @param currentUsageAmountInCents Value for long
     */
    @JsonSetter("current_usage_amount_in_cents")
    public void setCurrentUsageAmountInCents(long currentUsageAmountInCents) {
        this.currentUsageAmountInCents = currentUsageAmountInCents;
    }

    /**
     * Converts this PrepaidSubscriptionBalanceChanged into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrepaidSubscriptionBalanceChanged [" + "reason=" + reason
                + ", currentAccountBalanceInCents=" + currentAccountBalanceInCents
                + ", prepaymentAccountBalanceInCents=" + prepaymentAccountBalanceInCents
                + ", currentUsageAmountInCents=" + currentUsageAmountInCents
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PrepaidSubscriptionBalanceChanged.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PrepaidSubscriptionBalanceChanged.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(reason, currentAccountBalanceInCents,
                prepaymentAccountBalanceInCents, currentUsageAmountInCents);
        return builder;
    }

    /**
     * Class to build instances of {@link PrepaidSubscriptionBalanceChanged}.
     */
    public static class Builder {
        private String reason;
        private long currentAccountBalanceInCents;
        private long prepaymentAccountBalanceInCents;
        private long currentUsageAmountInCents;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  reason  String value for reason.
         * @param  currentAccountBalanceInCents  long value for currentAccountBalanceInCents.
         * @param  prepaymentAccountBalanceInCents  long value for prepaymentAccountBalanceInCents.
         * @param  currentUsageAmountInCents  long value for currentUsageAmountInCents.
         */
        public Builder(String reason, long currentAccountBalanceInCents,
                long prepaymentAccountBalanceInCents, long currentUsageAmountInCents) {
            this.reason = reason;
            this.currentAccountBalanceInCents = currentAccountBalanceInCents;
            this.prepaymentAccountBalanceInCents = prepaymentAccountBalanceInCents;
            this.currentUsageAmountInCents = currentUsageAmountInCents;
        }

        /**
         * Setter for reason.
         * @param  reason  String value for reason.
         * @return Builder
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Setter for currentAccountBalanceInCents.
         * @param  currentAccountBalanceInCents  long value for currentAccountBalanceInCents.
         * @return Builder
         */
        public Builder currentAccountBalanceInCents(long currentAccountBalanceInCents) {
            this.currentAccountBalanceInCents = currentAccountBalanceInCents;
            return this;
        }

        /**
         * Setter for prepaymentAccountBalanceInCents.
         * @param  prepaymentAccountBalanceInCents  long value for prepaymentAccountBalanceInCents.
         * @return Builder
         */
        public Builder prepaymentAccountBalanceInCents(long prepaymentAccountBalanceInCents) {
            this.prepaymentAccountBalanceInCents = prepaymentAccountBalanceInCents;
            return this;
        }

        /**
         * Setter for currentUsageAmountInCents.
         * @param  currentUsageAmountInCents  long value for currentUsageAmountInCents.
         * @return Builder
         */
        public Builder currentUsageAmountInCents(long currentUsageAmountInCents) {
            this.currentUsageAmountInCents = currentUsageAmountInCents;
            return this;
        }

        /**
         * Builds a new {@link PrepaidSubscriptionBalanceChanged} object using the set fields.
         * @return {@link PrepaidSubscriptionBalanceChanged}
         */
        public PrepaidSubscriptionBalanceChanged build() {
            return new PrepaidSubscriptionBalanceChanged(reason, currentAccountBalanceInCents,
                    prepaymentAccountBalanceInCents, currentUsageAmountInCents);
        }
    }
}
