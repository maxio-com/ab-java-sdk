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
 * This is a model class for AccountBalances type.
 */
public class AccountBalances
        extends BaseModel {
    private AccountBalance openInvoices;
    private AccountBalance pendingInvoices;
    private AccountBalance pendingDiscounts;
    private AccountBalance serviceCredits;
    private AccountBalance prepayments;

    /**
     * Default constructor.
     */
    public AccountBalances() {
    }

    /**
     * Initialization constructor.
     * @param  openInvoices  AccountBalance value for openInvoices.
     * @param  pendingInvoices  AccountBalance value for pendingInvoices.
     * @param  pendingDiscounts  AccountBalance value for pendingDiscounts.
     * @param  serviceCredits  AccountBalance value for serviceCredits.
     * @param  prepayments  AccountBalance value for prepayments.
     */
    public AccountBalances(
            AccountBalance openInvoices,
            AccountBalance pendingInvoices,
            AccountBalance pendingDiscounts,
            AccountBalance serviceCredits,
            AccountBalance prepayments) {
        this.openInvoices = openInvoices;
        this.pendingInvoices = pendingInvoices;
        this.pendingDiscounts = pendingDiscounts;
        this.serviceCredits = serviceCredits;
        this.prepayments = prepayments;
    }

    /**
     * Getter for OpenInvoices.
     * The balance, in cents, of the sum of the subscription's open, payable invoices.
     * @return Returns the AccountBalance
     */
    @JsonGetter("open_invoices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AccountBalance getOpenInvoices() {
        return openInvoices;
    }

    /**
     * Setter for OpenInvoices.
     * The balance, in cents, of the sum of the subscription's open, payable invoices.
     * @param openInvoices Value for AccountBalance
     */
    @JsonSetter("open_invoices")
    public void setOpenInvoices(AccountBalance openInvoices) {
        this.openInvoices = openInvoices;
    }

    /**
     * Getter for PendingInvoices.
     * The balance, in cents, of the sum of the subscription's pending, payable invoices.
     * @return Returns the AccountBalance
     */
    @JsonGetter("pending_invoices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AccountBalance getPendingInvoices() {
        return pendingInvoices;
    }

    /**
     * Setter for PendingInvoices.
     * The balance, in cents, of the sum of the subscription's pending, payable invoices.
     * @param pendingInvoices Value for AccountBalance
     */
    @JsonSetter("pending_invoices")
    public void setPendingInvoices(AccountBalance pendingInvoices) {
        this.pendingInvoices = pendingInvoices;
    }

    /**
     * Getter for PendingDiscounts.
     * The balance, in cents, of the subscription's Pending Discount account.
     * @return Returns the AccountBalance
     */
    @JsonGetter("pending_discounts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AccountBalance getPendingDiscounts() {
        return pendingDiscounts;
    }

    /**
     * Setter for PendingDiscounts.
     * The balance, in cents, of the subscription's Pending Discount account.
     * @param pendingDiscounts Value for AccountBalance
     */
    @JsonSetter("pending_discounts")
    public void setPendingDiscounts(AccountBalance pendingDiscounts) {
        this.pendingDiscounts = pendingDiscounts;
    }

    /**
     * Getter for ServiceCredits.
     * The balance, in cents, of the subscription's Service Credit account.
     * @return Returns the AccountBalance
     */
    @JsonGetter("service_credits")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AccountBalance getServiceCredits() {
        return serviceCredits;
    }

    /**
     * Setter for ServiceCredits.
     * The balance, in cents, of the subscription's Service Credit account.
     * @param serviceCredits Value for AccountBalance
     */
    @JsonSetter("service_credits")
    public void setServiceCredits(AccountBalance serviceCredits) {
        this.serviceCredits = serviceCredits;
    }

    /**
     * Getter for Prepayments.
     * The balance, in cents, of the subscription's Prepayment account.
     * @return Returns the AccountBalance
     */
    @JsonGetter("prepayments")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AccountBalance getPrepayments() {
        return prepayments;
    }

    /**
     * Setter for Prepayments.
     * The balance, in cents, of the subscription's Prepayment account.
     * @param prepayments Value for AccountBalance
     */
    @JsonSetter("prepayments")
    public void setPrepayments(AccountBalance prepayments) {
        this.prepayments = prepayments;
    }

    /**
     * Converts this AccountBalances into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AccountBalances [" + "openInvoices=" + openInvoices + ", pendingInvoices="
                + pendingInvoices + ", pendingDiscounts=" + pendingDiscounts + ", serviceCredits="
                + serviceCredits + ", prepayments=" + prepayments + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .openInvoices(getOpenInvoices())
                .pendingInvoices(getPendingInvoices())
                .pendingDiscounts(getPendingDiscounts())
                .serviceCredits(getServiceCredits())
                .prepayments(getPrepayments());
        return builder;
    }

    /**
     * Class to build instances of {@link AccountBalances}.
     */
    public static class Builder {
        private AccountBalance openInvoices;
        private AccountBalance pendingInvoices;
        private AccountBalance pendingDiscounts;
        private AccountBalance serviceCredits;
        private AccountBalance prepayments;



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
         * Setter for pendingInvoices.
         * @param  pendingInvoices  AccountBalance value for pendingInvoices.
         * @return Builder
         */
        public Builder pendingInvoices(AccountBalance pendingInvoices) {
            this.pendingInvoices = pendingInvoices;
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
         * Setter for serviceCredits.
         * @param  serviceCredits  AccountBalance value for serviceCredits.
         * @return Builder
         */
        public Builder serviceCredits(AccountBalance serviceCredits) {
            this.serviceCredits = serviceCredits;
            return this;
        }

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
         * Builds a new {@link AccountBalances} object using the set fields.
         * @return {@link AccountBalances}
         */
        public AccountBalances build() {
            return new AccountBalances(openInvoices, pendingInvoices, pendingDiscounts,
                    serviceCredits, prepayments);
        }
    }
}
