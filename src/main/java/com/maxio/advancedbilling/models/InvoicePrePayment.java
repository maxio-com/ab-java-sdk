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
 * This is a model class for InvoicePrePayment type.
 */
public class InvoicePrePayment
        extends BaseModel {
    private Integer subscriptionId;
    private Long amountInCents;
    private Long endingBalanceInCents;

    /**
     * Default constructor.
     */
    public InvoicePrePayment() {
    }

    /**
     * Initialization constructor.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  amountInCents  Long value for amountInCents.
     * @param  endingBalanceInCents  Long value for endingBalanceInCents.
     */
    public InvoicePrePayment(
            Integer subscriptionId,
            Long amountInCents,
            Long endingBalanceInCents) {
        this.subscriptionId = subscriptionId;
        this.amountInCents = amountInCents;
        this.endingBalanceInCents = endingBalanceInCents;
    }

    /**
     * Getter for SubscriptionId.
     * The subscription id for the prepayment account
     * @return Returns the Integer
     */
    @JsonGetter("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * The subscription id for the prepayment account
     * @param subscriptionId Value for Integer
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for AmountInCents.
     * The amount in cents of the prepayment that was created as a result of this payment.
     * @return Returns the Long
     */
    @JsonGetter("amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getAmountInCents() {
        return amountInCents;
    }

    /**
     * Setter for AmountInCents.
     * The amount in cents of the prepayment that was created as a result of this payment.
     * @param amountInCents Value for Long
     */
    @JsonSetter("amount_in_cents")
    public void setAmountInCents(Long amountInCents) {
        this.amountInCents = amountInCents;
    }

    /**
     * Getter for EndingBalanceInCents.
     * The total balance of the prepayment account for this subscription including any prior
     * prepayments
     * @return Returns the Long
     */
    @JsonGetter("ending_balance_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getEndingBalanceInCents() {
        return endingBalanceInCents;
    }

    /**
     * Setter for EndingBalanceInCents.
     * The total balance of the prepayment account for this subscription including any prior
     * prepayments
     * @param endingBalanceInCents Value for Long
     */
    @JsonSetter("ending_balance_in_cents")
    public void setEndingBalanceInCents(Long endingBalanceInCents) {
        this.endingBalanceInCents = endingBalanceInCents;
    }

    /**
     * Converts this InvoicePrePayment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoicePrePayment [" + "subscriptionId=" + subscriptionId + ", amountInCents="
                + amountInCents + ", endingBalanceInCents=" + endingBalanceInCents
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link InvoicePrePayment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoicePrePayment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .subscriptionId(getSubscriptionId())
                .amountInCents(getAmountInCents())
                .endingBalanceInCents(getEndingBalanceInCents());
        return builder;
    }

    /**
     * Class to build instances of {@link InvoicePrePayment}.
     */
    public static class Builder {
        private Integer subscriptionId;
        private Long amountInCents;
        private Long endingBalanceInCents;



        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  Integer value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(Integer subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setter for amountInCents.
         * @param  amountInCents  Long value for amountInCents.
         * @return Builder
         */
        public Builder amountInCents(Long amountInCents) {
            this.amountInCents = amountInCents;
            return this;
        }

        /**
         * Setter for endingBalanceInCents.
         * @param  endingBalanceInCents  Long value for endingBalanceInCents.
         * @return Builder
         */
        public Builder endingBalanceInCents(Long endingBalanceInCents) {
            this.endingBalanceInCents = endingBalanceInCents;
            return this;
        }

        /**
         * Builds a new {@link InvoicePrePayment} object using the set fields.
         * @return {@link InvoicePrePayment}
         */
        public InvoicePrePayment build() {
            return new InvoicePrePayment(subscriptionId, amountInCents, endingBalanceInCents);
        }
    }
}
