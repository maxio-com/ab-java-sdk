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
 * This is a model class for PrepaidSubscriptionBalanceChanged type.
 */
public class PrepaidSubscriptionBalanceChanged {
    private String reason;
    private int currentAccountBalanceInCents;
    private int prepaymentAccountBalanceInCents;
    private int currentUsageAmountInCents;

    /**
     * Default constructor.
     */
    public PrepaidSubscriptionBalanceChanged() {
    }

    /**
     * Initialization constructor.
     * @param  reason  String value for reason.
     * @param  currentAccountBalanceInCents  int value for currentAccountBalanceInCents.
     * @param  prepaymentAccountBalanceInCents  int value for prepaymentAccountBalanceInCents.
     * @param  currentUsageAmountInCents  int value for currentUsageAmountInCents.
     */
    @JsonCreator
    public PrepaidSubscriptionBalanceChanged(
            @JsonProperty("reason") String reason,
            @JsonProperty("current_account_balance_in_cents") int currentAccountBalanceInCents,
            @JsonProperty("prepayment_account_balance_in_cents") int prepaymentAccountBalanceInCents,
            @JsonProperty("current_usage_amount_in_cents") int currentUsageAmountInCents) {
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
     * @return Returns the int
     */
    @JsonGetter("current_account_balance_in_cents")
    public int getCurrentAccountBalanceInCents() {
        return currentAccountBalanceInCents;
    }

    /**
     * Setter for CurrentAccountBalanceInCents.
     * @param currentAccountBalanceInCents Value for int
     */
    @JsonSetter("current_account_balance_in_cents")
    public void setCurrentAccountBalanceInCents(int currentAccountBalanceInCents) {
        this.currentAccountBalanceInCents = currentAccountBalanceInCents;
    }

    /**
     * Getter for PrepaymentAccountBalanceInCents.
     * @return Returns the int
     */
    @JsonGetter("prepayment_account_balance_in_cents")
    public int getPrepaymentAccountBalanceInCents() {
        return prepaymentAccountBalanceInCents;
    }

    /**
     * Setter for PrepaymentAccountBalanceInCents.
     * @param prepaymentAccountBalanceInCents Value for int
     */
    @JsonSetter("prepayment_account_balance_in_cents")
    public void setPrepaymentAccountBalanceInCents(int prepaymentAccountBalanceInCents) {
        this.prepaymentAccountBalanceInCents = prepaymentAccountBalanceInCents;
    }

    /**
     * Getter for CurrentUsageAmountInCents.
     * @return Returns the int
     */
    @JsonGetter("current_usage_amount_in_cents")
    public int getCurrentUsageAmountInCents() {
        return currentUsageAmountInCents;
    }

    /**
     * Setter for CurrentUsageAmountInCents.
     * @param currentUsageAmountInCents Value for int
     */
    @JsonSetter("current_usage_amount_in_cents")
    public void setCurrentUsageAmountInCents(int currentUsageAmountInCents) {
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
                + ", currentUsageAmountInCents=" + currentUsageAmountInCents + "]";
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
        private int currentAccountBalanceInCents;
        private int prepaymentAccountBalanceInCents;
        private int currentUsageAmountInCents;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  reason  String value for reason.
         * @param  currentAccountBalanceInCents  int value for currentAccountBalanceInCents.
         * @param  prepaymentAccountBalanceInCents  int value for prepaymentAccountBalanceInCents.
         * @param  currentUsageAmountInCents  int value for currentUsageAmountInCents.
         */
        public Builder(String reason, int currentAccountBalanceInCents,
                int prepaymentAccountBalanceInCents, int currentUsageAmountInCents) {
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
         * @param  currentAccountBalanceInCents  int value for currentAccountBalanceInCents.
         * @return Builder
         */
        public Builder currentAccountBalanceInCents(int currentAccountBalanceInCents) {
            this.currentAccountBalanceInCents = currentAccountBalanceInCents;
            return this;
        }

        /**
         * Setter for prepaymentAccountBalanceInCents.
         * @param  prepaymentAccountBalanceInCents  int value for prepaymentAccountBalanceInCents.
         * @return Builder
         */
        public Builder prepaymentAccountBalanceInCents(int prepaymentAccountBalanceInCents) {
            this.prepaymentAccountBalanceInCents = prepaymentAccountBalanceInCents;
            return this;
        }

        /**
         * Setter for currentUsageAmountInCents.
         * @param  currentUsageAmountInCents  int value for currentUsageAmountInCents.
         * @return Builder
         */
        public Builder currentUsageAmountInCents(int currentUsageAmountInCents) {
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
