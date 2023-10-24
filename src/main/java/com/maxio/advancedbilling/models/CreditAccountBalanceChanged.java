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
 * This is a model class for CreditAccountBalanceChanged type.
 */
public class CreditAccountBalanceChanged {
    private String reason;
    private int serviceCreditAccountBalanceInCents;
    private int serviceCreditBalanceChangeInCents;
    private String currencyCode;
    private String atTime;

    /**
     * Default constructor.
     */
    public CreditAccountBalanceChanged() {
    }

    /**
     * Initialization constructor.
     * @param  reason  String value for reason.
     * @param  serviceCreditAccountBalanceInCents  int value for serviceCreditAccountBalanceInCents.
     * @param  serviceCreditBalanceChangeInCents  int value for serviceCreditBalanceChangeInCents.
     * @param  currencyCode  String value for currencyCode.
     * @param  atTime  String value for atTime.
     */
    @JsonCreator
    public CreditAccountBalanceChanged(
            @JsonProperty("reason") String reason,
            @JsonProperty("service_credit_account_balance_in_cents") int serviceCreditAccountBalanceInCents,
            @JsonProperty("service_credit_balance_change_in_cents") int serviceCreditBalanceChangeInCents,
            @JsonProperty("currency_code") String currencyCode,
            @JsonProperty("at_time") String atTime) {
        this.reason = reason;
        this.serviceCreditAccountBalanceInCents = serviceCreditAccountBalanceInCents;
        this.serviceCreditBalanceChangeInCents = serviceCreditBalanceChangeInCents;
        this.currencyCode = currencyCode;
        this.atTime = atTime;
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
     * Getter for ServiceCreditAccountBalanceInCents.
     * @return Returns the int
     */
    @JsonGetter("service_credit_account_balance_in_cents")
    public int getServiceCreditAccountBalanceInCents() {
        return serviceCreditAccountBalanceInCents;
    }

    /**
     * Setter for ServiceCreditAccountBalanceInCents.
     * @param serviceCreditAccountBalanceInCents Value for int
     */
    @JsonSetter("service_credit_account_balance_in_cents")
    public void setServiceCreditAccountBalanceInCents(int serviceCreditAccountBalanceInCents) {
        this.serviceCreditAccountBalanceInCents = serviceCreditAccountBalanceInCents;
    }

    /**
     * Getter for ServiceCreditBalanceChangeInCents.
     * @return Returns the int
     */
    @JsonGetter("service_credit_balance_change_in_cents")
    public int getServiceCreditBalanceChangeInCents() {
        return serviceCreditBalanceChangeInCents;
    }

    /**
     * Setter for ServiceCreditBalanceChangeInCents.
     * @param serviceCreditBalanceChangeInCents Value for int
     */
    @JsonSetter("service_credit_balance_change_in_cents")
    public void setServiceCreditBalanceChangeInCents(int serviceCreditBalanceChangeInCents) {
        this.serviceCreditBalanceChangeInCents = serviceCreditBalanceChangeInCents;
    }

    /**
     * Getter for CurrencyCode.
     * @return Returns the String
     */
    @JsonGetter("currency_code")
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Setter for CurrencyCode.
     * @param currencyCode Value for String
     */
    @JsonSetter("currency_code")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * Getter for AtTime.
     * @return Returns the String
     */
    @JsonGetter("at_time")
    public String getAtTime() {
        return atTime;
    }

    /**
     * Setter for AtTime.
     * @param atTime Value for String
     */
    @JsonSetter("at_time")
    public void setAtTime(String atTime) {
        this.atTime = atTime;
    }

    /**
     * Converts this CreditAccountBalanceChanged into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreditAccountBalanceChanged [" + "reason=" + reason
                + ", serviceCreditAccountBalanceInCents=" + serviceCreditAccountBalanceInCents
                + ", serviceCreditBalanceChangeInCents=" + serviceCreditBalanceChangeInCents
                + ", currencyCode=" + currencyCode + ", atTime=" + atTime + "]";
    }

    /**
     * Builds a new {@link CreditAccountBalanceChanged.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreditAccountBalanceChanged.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(reason, serviceCreditAccountBalanceInCents,
                serviceCreditBalanceChangeInCents, currencyCode, atTime);
        return builder;
    }

    /**
     * Class to build instances of {@link CreditAccountBalanceChanged}.
     */
    public static class Builder {
        private String reason;
        private int serviceCreditAccountBalanceInCents;
        private int serviceCreditBalanceChangeInCents;
        private String currencyCode;
        private String atTime;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  reason  String value for reason.
         * @param  serviceCreditAccountBalanceInCents  int value for
         *         serviceCreditAccountBalanceInCents.
         * @param  serviceCreditBalanceChangeInCents  int value for
         *         serviceCreditBalanceChangeInCents.
         * @param  currencyCode  String value for currencyCode.
         * @param  atTime  String value for atTime.
         */
        public Builder(String reason, int serviceCreditAccountBalanceInCents,
                int serviceCreditBalanceChangeInCents, String currencyCode, String atTime) {
            this.reason = reason;
            this.serviceCreditAccountBalanceInCents = serviceCreditAccountBalanceInCents;
            this.serviceCreditBalanceChangeInCents = serviceCreditBalanceChangeInCents;
            this.currencyCode = currencyCode;
            this.atTime = atTime;
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
         * Setter for serviceCreditAccountBalanceInCents.
         * @param  serviceCreditAccountBalanceInCents  int value for
         *         serviceCreditAccountBalanceInCents.
         * @return Builder
         */
        public Builder serviceCreditAccountBalanceInCents(
                int serviceCreditAccountBalanceInCents) {
            this.serviceCreditAccountBalanceInCents = serviceCreditAccountBalanceInCents;
            return this;
        }

        /**
         * Setter for serviceCreditBalanceChangeInCents.
         * @param  serviceCreditBalanceChangeInCents  int value for
         *         serviceCreditBalanceChangeInCents.
         * @return Builder
         */
        public Builder serviceCreditBalanceChangeInCents(int serviceCreditBalanceChangeInCents) {
            this.serviceCreditBalanceChangeInCents = serviceCreditBalanceChangeInCents;
            return this;
        }

        /**
         * Setter for currencyCode.
         * @param  currencyCode  String value for currencyCode.
         * @return Builder
         */
        public Builder currencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        /**
         * Setter for atTime.
         * @param  atTime  String value for atTime.
         * @return Builder
         */
        public Builder atTime(String atTime) {
            this.atTime = atTime;
            return this;
        }

        /**
         * Builds a new {@link CreditAccountBalanceChanged} object using the set fields.
         * @return {@link CreditAccountBalanceChanged}
         */
        public CreditAccountBalanceChanged build() {
            return new CreditAccountBalanceChanged(reason, serviceCreditAccountBalanceInCents,
                    serviceCreditBalanceChangeInCents, currencyCode, atTime);
        }
    }
}
