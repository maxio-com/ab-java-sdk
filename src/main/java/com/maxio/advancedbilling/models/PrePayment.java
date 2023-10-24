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
 * This is a model class for PrePayment type.
 */
public class PrePayment {
    private String subscriptionId;
    private String amountInCents;
    private String endingBalanceInCents;

    /**
     * Default constructor.
     */
    public PrePayment() {
    }

    /**
     * Initialization constructor.
     * @param  subscriptionId  String value for subscriptionId.
     * @param  amountInCents  String value for amountInCents.
     * @param  endingBalanceInCents  String value for endingBalanceInCents.
     */
    public PrePayment(
            String subscriptionId,
            String amountInCents,
            String endingBalanceInCents) {
        this.subscriptionId = subscriptionId;
        this.amountInCents = amountInCents;
        this.endingBalanceInCents = endingBalanceInCents;
    }

    /**
     * Getter for SubscriptionId.
     * The subscription id for the prepayment account
     * @return Returns the String
     */
    @JsonGetter("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * The subscription id for the prepayment account
     * @param subscriptionId Value for String
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for AmountInCents.
     * The amount in cents of the prepayment that was created as a result of this payment.
     * @return Returns the String
     */
    @JsonGetter("amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAmountInCents() {
        return amountInCents;
    }

    /**
     * Setter for AmountInCents.
     * The amount in cents of the prepayment that was created as a result of this payment.
     * @param amountInCents Value for String
     */
    @JsonSetter("amount_in_cents")
    public void setAmountInCents(String amountInCents) {
        this.amountInCents = amountInCents;
    }

    /**
     * Getter for EndingBalanceInCents.
     * The total balance of the prepayment account for this subscription including any prior
     * prepayments
     * @return Returns the String
     */
    @JsonGetter("ending_balance_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEndingBalanceInCents() {
        return endingBalanceInCents;
    }

    /**
     * Setter for EndingBalanceInCents.
     * The total balance of the prepayment account for this subscription including any prior
     * prepayments
     * @param endingBalanceInCents Value for String
     */
    @JsonSetter("ending_balance_in_cents")
    public void setEndingBalanceInCents(String endingBalanceInCents) {
        this.endingBalanceInCents = endingBalanceInCents;
    }

    /**
     * Converts this PrePayment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrePayment [" + "subscriptionId=" + subscriptionId + ", amountInCents="
                + amountInCents + ", endingBalanceInCents=" + endingBalanceInCents + "]";
    }

    /**
     * Builds a new {@link PrePayment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PrePayment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .subscriptionId(getSubscriptionId())
                .amountInCents(getAmountInCents())
                .endingBalanceInCents(getEndingBalanceInCents());
        return builder;
    }

    /**
     * Class to build instances of {@link PrePayment}.
     */
    public static class Builder {
        private String subscriptionId;
        private String amountInCents;
        private String endingBalanceInCents;



        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  String value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setter for amountInCents.
         * @param  amountInCents  String value for amountInCents.
         * @return Builder
         */
        public Builder amountInCents(String amountInCents) {
            this.amountInCents = amountInCents;
            return this;
        }

        /**
         * Setter for endingBalanceInCents.
         * @param  endingBalanceInCents  String value for endingBalanceInCents.
         * @return Builder
         */
        public Builder endingBalanceInCents(String endingBalanceInCents) {
            this.endingBalanceInCents = endingBalanceInCents;
            return this;
        }

        /**
         * Builds a new {@link PrePayment} object using the set fields.
         * @return {@link PrePayment}
         */
        public PrePayment build() {
            return new PrePayment(subscriptionId, amountInCents, endingBalanceInCents);
        }
    }
}
