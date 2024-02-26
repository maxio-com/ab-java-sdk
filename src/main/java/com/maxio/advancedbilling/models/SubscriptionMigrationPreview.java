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
    private Long proratedAdjustmentInCents;
    private Long chargeInCents;
    private Long paymentDueInCents;
    private Long creditAppliedInCents;

    /**
     * Default constructor.
     */
    public SubscriptionMigrationPreview() {
    }

    /**
     * Initialization constructor.
     * @param  proratedAdjustmentInCents  Long value for proratedAdjustmentInCents.
     * @param  chargeInCents  Long value for chargeInCents.
     * @param  paymentDueInCents  Long value for paymentDueInCents.
     * @param  creditAppliedInCents  Long value for creditAppliedInCents.
     */
    public SubscriptionMigrationPreview(
            Long proratedAdjustmentInCents,
            Long chargeInCents,
            Long paymentDueInCents,
            Long creditAppliedInCents) {
        this.proratedAdjustmentInCents = proratedAdjustmentInCents;
        this.chargeInCents = chargeInCents;
        this.paymentDueInCents = paymentDueInCents;
        this.creditAppliedInCents = creditAppliedInCents;
    }

    /**
     * Getter for ProratedAdjustmentInCents.
     * The amount of the prorated adjustment that would be issued for the current subscription.
     * @return Returns the Long
     */
    @JsonGetter("prorated_adjustment_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getProratedAdjustmentInCents() {
        return proratedAdjustmentInCents;
    }

    /**
     * Setter for ProratedAdjustmentInCents.
     * The amount of the prorated adjustment that would be issued for the current subscription.
     * @param proratedAdjustmentInCents Value for Long
     */
    @JsonSetter("prorated_adjustment_in_cents")
    public void setProratedAdjustmentInCents(Long proratedAdjustmentInCents) {
        this.proratedAdjustmentInCents = proratedAdjustmentInCents;
    }

    /**
     * Getter for ChargeInCents.
     * The amount of the charge that would be created for the new product.
     * @return Returns the Long
     */
    @JsonGetter("charge_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getChargeInCents() {
        return chargeInCents;
    }

    /**
     * Setter for ChargeInCents.
     * The amount of the charge that would be created for the new product.
     * @param chargeInCents Value for Long
     */
    @JsonSetter("charge_in_cents")
    public void setChargeInCents(Long chargeInCents) {
        this.chargeInCents = chargeInCents;
    }

    /**
     * Getter for PaymentDueInCents.
     * The amount of the payment due in the case of an upgrade.
     * @return Returns the Long
     */
    @JsonGetter("payment_due_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getPaymentDueInCents() {
        return paymentDueInCents;
    }

    /**
     * Setter for PaymentDueInCents.
     * The amount of the payment due in the case of an upgrade.
     * @param paymentDueInCents Value for Long
     */
    @JsonSetter("payment_due_in_cents")
    public void setPaymentDueInCents(Long paymentDueInCents) {
        this.paymentDueInCents = paymentDueInCents;
    }

    /**
     * Getter for CreditAppliedInCents.
     * Represents a credit in cents that is applied to your subscription as part of a migration
     * process for a specific product, which reduces the amount owed for the subscription.
     * @return Returns the Long
     */
    @JsonGetter("credit_applied_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getCreditAppliedInCents() {
        return creditAppliedInCents;
    }

    /**
     * Setter for CreditAppliedInCents.
     * Represents a credit in cents that is applied to your subscription as part of a migration
     * process for a specific product, which reduces the amount owed for the subscription.
     * @param creditAppliedInCents Value for Long
     */
    @JsonSetter("credit_applied_in_cents")
    public void setCreditAppliedInCents(Long creditAppliedInCents) {
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
        private Long proratedAdjustmentInCents;
        private Long chargeInCents;
        private Long paymentDueInCents;
        private Long creditAppliedInCents;



        /**
         * Setter for proratedAdjustmentInCents.
         * @param  proratedAdjustmentInCents  Long value for proratedAdjustmentInCents.
         * @return Builder
         */
        public Builder proratedAdjustmentInCents(Long proratedAdjustmentInCents) {
            this.proratedAdjustmentInCents = proratedAdjustmentInCents;
            return this;
        }

        /**
         * Setter for chargeInCents.
         * @param  chargeInCents  Long value for chargeInCents.
         * @return Builder
         */
        public Builder chargeInCents(Long chargeInCents) {
            this.chargeInCents = chargeInCents;
            return this;
        }

        /**
         * Setter for paymentDueInCents.
         * @param  paymentDueInCents  Long value for paymentDueInCents.
         * @return Builder
         */
        public Builder paymentDueInCents(Long paymentDueInCents) {
            this.paymentDueInCents = paymentDueInCents;
            return this;
        }

        /**
         * Setter for creditAppliedInCents.
         * @param  creditAppliedInCents  Long value for creditAppliedInCents.
         * @return Builder
         */
        public Builder creditAppliedInCents(Long creditAppliedInCents) {
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
