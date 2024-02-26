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
 * This is a model class for SubscriptionGroupBalances type.
 */
public class SubscriptionGroupBalances {
    private AccountBalance prepayments;
    private AccountBalance serviceCredits;
    private AccountBalance openInvoices;
    private AccountBalance pendingDiscounts;

    /**
     * Default constructor.
     */
    public SubscriptionGroupBalances() {
    }

    /**
     * Initialization constructor.
     * @param  prepayments  AccountBalance value for prepayments.
     * @param  serviceCredits  AccountBalance value for serviceCredits.
     * @param  openInvoices  AccountBalance value for openInvoices.
     * @param  pendingDiscounts  AccountBalance value for pendingDiscounts.
     */
    public SubscriptionGroupBalances(
            AccountBalance prepayments,
            AccountBalance serviceCredits,
            AccountBalance openInvoices,
            AccountBalance pendingDiscounts) {
        this.prepayments = prepayments;
        this.serviceCredits = serviceCredits;
        this.openInvoices = openInvoices;
        this.pendingDiscounts = pendingDiscounts;
    }

    /**
     * Getter for Prepayments.
     * @return Returns the AccountBalance
     */
    @JsonGetter("prepayments")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AccountBalance getPrepayments() {
        return prepayments;
    }

    /**
     * Setter for Prepayments.
     * @param prepayments Value for AccountBalance
     */
    @JsonSetter("prepayments")
    public void setPrepayments(AccountBalance prepayments) {
        this.prepayments = prepayments;
    }

    /**
     * Getter for ServiceCredits.
     * @return Returns the AccountBalance
     */
    @JsonGetter("service_credits")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AccountBalance getServiceCredits() {
        return serviceCredits;
    }

    /**
     * Setter for ServiceCredits.
     * @param serviceCredits Value for AccountBalance
     */
    @JsonSetter("service_credits")
    public void setServiceCredits(AccountBalance serviceCredits) {
        this.serviceCredits = serviceCredits;
    }

    /**
     * Getter for OpenInvoices.
     * @return Returns the AccountBalance
     */
    @JsonGetter("open_invoices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AccountBalance getOpenInvoices() {
        return openInvoices;
    }

    /**
     * Setter for OpenInvoices.
     * @param openInvoices Value for AccountBalance
     */
    @JsonSetter("open_invoices")
    public void setOpenInvoices(AccountBalance openInvoices) {
        this.openInvoices = openInvoices;
    }

    /**
     * Getter for PendingDiscounts.
     * @return Returns the AccountBalance
     */
    @JsonGetter("pending_discounts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AccountBalance getPendingDiscounts() {
        return pendingDiscounts;
    }

    /**
     * Setter for PendingDiscounts.
     * @param pendingDiscounts Value for AccountBalance
     */
    @JsonSetter("pending_discounts")
    public void setPendingDiscounts(AccountBalance pendingDiscounts) {
        this.pendingDiscounts = pendingDiscounts;
    }

    /**
     * Converts this SubscriptionGroupBalances into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupBalances [" + "prepayments=" + prepayments + ", serviceCredits="
                + serviceCredits + ", openInvoices=" + openInvoices + ", pendingDiscounts="
                + pendingDiscounts + "]";
    }

    /**
     * Builds a new {@link SubscriptionGroupBalances.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionGroupBalances.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .prepayments(getPrepayments())
                .serviceCredits(getServiceCredits())
                .openInvoices(getOpenInvoices())
                .pendingDiscounts(getPendingDiscounts());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupBalances}.
     */
    public static class Builder {
        private AccountBalance prepayments;
        private AccountBalance serviceCredits;
        private AccountBalance openInvoices;
        private AccountBalance pendingDiscounts;



        /**
         * Setter for prepayments.
         * @param  prepayments  AccountBalance value for prepayments.
         * @return Builder
         */
        public Builder prepayments(AccountBalance prepayments) {
            this.prepayments = prepayments;
            return this;
        }

        /**
         * Setter for serviceCredits.
         * @param  serviceCredits  AccountBalance value for serviceCredits.
         * @return Builder
         */
        public Builder serviceCredits(AccountBalance serviceCredits) {
            this.serviceCredits = serviceCredits;
            return this;
        }

        /**
         * Setter for openInvoices.
         * @param  openInvoices  AccountBalance value for openInvoices.
         * @return Builder
         */
        public Builder openInvoices(AccountBalance openInvoices) {
            this.openInvoices = openInvoices;
            return this;
        }

        /**
         * Setter for pendingDiscounts.
         * @param  pendingDiscounts  AccountBalance value for pendingDiscounts.
         * @return Builder
         */
        public Builder pendingDiscounts(AccountBalance pendingDiscounts) {
            this.pendingDiscounts = pendingDiscounts;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroupBalances} object using the set fields.
         * @return {@link SubscriptionGroupBalances}
         */
        public SubscriptionGroupBalances build() {
            return new SubscriptionGroupBalances(prepayments, serviceCredits, openInvoices,
                    pendingDiscounts);
        }
    }
}
