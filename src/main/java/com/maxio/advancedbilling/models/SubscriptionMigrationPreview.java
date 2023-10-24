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
 * This is a model class for SubscriptionMigrationPreview type.
 */
public class SubscriptionMigrationPreview {
    private Integer proratedAdjustmentInCents;
    private Integer chargeInCents;
    private Integer paymentDueInCents;
    private Integer creditAppliedInCents;

    /**
     * Default constructor.
     */
    public SubscriptionMigrationPreview() {
    }

    /**
     * Initialization constructor.
     * @param  proratedAdjustmentInCents  Integer value for proratedAdjustmentInCents.
     * @param  chargeInCents  Integer value for chargeInCents.
     * @param  paymentDueInCents  Integer value for paymentDueInCents.
     * @param  creditAppliedInCents  Integer value for creditAppliedInCents.
     */
    public SubscriptionMigrationPreview(
            Integer proratedAdjustmentInCents,
            Integer chargeInCents,
            Integer paymentDueInCents,
            Integer creditAppliedInCents) {
        this.proratedAdjustmentInCents = proratedAdjustmentInCents;
        this.chargeInCents = chargeInCents;
        this.paymentDueInCents = paymentDueInCents;
        this.creditAppliedInCents = creditAppliedInCents;
    }

    /**
     * Getter for ProratedAdjustmentInCents.
     * The amount of the prorated adjustment that would be issued for the current subscription.
     * @return Returns the Integer
     */
    @JsonGetter("prorated_adjustment_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProratedAdjustmentInCents() {
        return proratedAdjustmentInCents;
    }

    /**
     * Setter for ProratedAdjustmentInCents.
     * The amount of the prorated adjustment that would be issued for the current subscription.
     * @param proratedAdjustmentInCents Value for Integer
     */
    @JsonSetter("prorated_adjustment_in_cents")
    public void setProratedAdjustmentInCents(Integer proratedAdjustmentInCents) {
        this.proratedAdjustmentInCents = proratedAdjustmentInCents;
    }

    /**
     * Getter for ChargeInCents.
     * The amount of the charge that would be created for the new product.
     * @return Returns the Integer
     */
    @JsonGetter("charge_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getChargeInCents() {
        return chargeInCents;
    }

    /**
     * Setter for ChargeInCents.
     * The amount of the charge that would be created for the new product.
     * @param chargeInCents Value for Integer
     */
    @JsonSetter("charge_in_cents")
    public void setChargeInCents(Integer chargeInCents) {
        this.chargeInCents = chargeInCents;
    }

    /**
     * Getter for PaymentDueInCents.
     * The amount of the payment due in the case of an upgrade.
     * @return Returns the Integer
     */
    @JsonGetter("payment_due_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPaymentDueInCents() {
        return paymentDueInCents;
    }

    /**
     * Setter for PaymentDueInCents.
     * The amount of the payment due in the case of an upgrade.
     * @param paymentDueInCents Value for Integer
     */
    @JsonSetter("payment_due_in_cents")
    public void setPaymentDueInCents(Integer paymentDueInCents) {
        this.paymentDueInCents = paymentDueInCents;
    }

    /**
     * Getter for CreditAppliedInCents.
     * Represents a credit in cents that is applied to your subscription as part of a migration
     * process for a specific product, which reduces the amount owed for the subscription.
     * @return Returns the Integer
     */
    @JsonGetter("credit_applied_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCreditAppliedInCents() {
        return creditAppliedInCents;
    }

    /**
     * Setter for CreditAppliedInCents.
     * Represents a credit in cents that is applied to your subscription as part of a migration
     * process for a specific product, which reduces the amount owed for the subscription.
     * @param creditAppliedInCents Value for Integer
     */
    @JsonSetter("credit_applied_in_cents")
    public void setCreditAppliedInCents(Integer creditAppliedInCents) {
        this.creditAppliedInCents = creditAppliedInCents;
    }

    /**
     * Converts this SubscriptionMigrationPreview into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionMigrationPreview [" + "proratedAdjustmentInCents="
                + proratedAdjustmentInCents + ", chargeInCents=" + chargeInCents
                + ", paymentDueInCents=" + paymentDueInCents + ", creditAppliedInCents="
                + creditAppliedInCents + "]";
    }

    /**
     * Builds a new {@link SubscriptionMigrationPreview.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionMigrationPreview.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .proratedAdjustmentInCents(getProratedAdjustmentInCents())
                .chargeInCents(getChargeInCents())
                .paymentDueInCents(getPaymentDueInCents())
                .creditAppliedInCents(getCreditAppliedInCents());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionMigrationPreview}.
     */
    public static class Builder {
        private Integer proratedAdjustmentInCents;
        private Integer chargeInCents;
        private Integer paymentDueInCents;
        private Integer creditAppliedInCents;



        /**
         * Setter for proratedAdjustmentInCents.
         * @param  proratedAdjustmentInCents  Integer value for proratedAdjustmentInCents.
         * @return Builder
         */
        public Builder proratedAdjustmentInCents(Integer proratedAdjustmentInCents) {
            this.proratedAdjustmentInCents = proratedAdjustmentInCents;
            return this;
        }

        /**
         * Setter for chargeInCents.
         * @param  chargeInCents  Integer value for chargeInCents.
         * @return Builder
         */
        public Builder chargeInCents(Integer chargeInCents) {
            this.chargeInCents = chargeInCents;
            return this;
        }

        /**
         * Setter for paymentDueInCents.
         * @param  paymentDueInCents  Integer value for paymentDueInCents.
         * @return Builder
         */
        public Builder paymentDueInCents(Integer paymentDueInCents) {
            this.paymentDueInCents = paymentDueInCents;
            return this;
        }

        /**
         * Setter for creditAppliedInCents.
         * @param  creditAppliedInCents  Integer value for creditAppliedInCents.
         * @return Builder
         */
        public Builder creditAppliedInCents(Integer creditAppliedInCents) {
            this.creditAppliedInCents = creditAppliedInCents;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionMigrationPreview} object using the set fields.
         * @return {@link SubscriptionMigrationPreview}
         */
        public SubscriptionMigrationPreview build() {
            return new SubscriptionMigrationPreview(proratedAdjustmentInCents, chargeInCents,
                    paymentDueInCents, creditAppliedInCents);
        }
    }
}
