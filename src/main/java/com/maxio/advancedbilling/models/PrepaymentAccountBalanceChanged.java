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
 * This is a model class for PrepaymentAccountBalanceChanged type.
 */
public class PrepaymentAccountBalanceChanged {
    private String reason;
    private int prepaymentAccountBalanceInCents;
    private int prepaymentBalanceChangeInCents;
    private String currencyCode;

    /**
     * Default constructor.
     */
    public PrepaymentAccountBalanceChanged() {
    }

    /**
     * Initialization constructor.
     * @param  reason  String value for reason.
     * @param  prepaymentAccountBalanceInCents  int value for prepaymentAccountBalanceInCents.
     * @param  prepaymentBalanceChangeInCents  int value for prepaymentBalanceChangeInCents.
     * @param  currencyCode  String value for currencyCode.
     */
    @JsonCreator
    public PrepaymentAccountBalanceChanged(
            @JsonProperty("reason") String reason,
            @JsonProperty("prepayment_account_balance_in_cents") int prepaymentAccountBalanceInCents,
            @JsonProperty("prepayment_balance_change_in_cents") int prepaymentBalanceChangeInCents,
            @JsonProperty("currency_code") String currencyCode) {
        this.reason = reason;
        this.prepaymentAccountBalanceInCents = prepaymentAccountBalanceInCents;
        this.prepaymentBalanceChangeInCents = prepaymentBalanceChangeInCents;
        this.currencyCode = currencyCode;
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
     * Getter for PrepaymentBalanceChangeInCents.
     * @return Returns the int
     */
    @JsonGetter("prepayment_balance_change_in_cents")
    public int getPrepaymentBalanceChangeInCents() {
        return prepaymentBalanceChangeInCents;
    }

    /**
     * Setter for PrepaymentBalanceChangeInCents.
     * @param prepaymentBalanceChangeInCents Value for int
     */
    @JsonSetter("prepayment_balance_change_in_cents")
    public void setPrepaymentBalanceChangeInCents(int prepaymentBalanceChangeInCents) {
        this.prepaymentBalanceChangeInCents = prepaymentBalanceChangeInCents;
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
     * Converts this PrepaymentAccountBalanceChanged into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrepaymentAccountBalanceChanged [" + "reason=" + reason
                + ", prepaymentAccountBalanceInCents=" + prepaymentAccountBalanceInCents
                + ", prepaymentBalanceChangeInCents=" + prepaymentBalanceChangeInCents
                + ", currencyCode=" + currencyCode + "]";
    }

    /**
     * Builds a new {@link PrepaymentAccountBalanceChanged.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PrepaymentAccountBalanceChanged.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(reason, prepaymentAccountBalanceInCents,
                prepaymentBalanceChangeInCents, currencyCode);
        return builder;
    }

    /**
     * Class to build instances of {@link PrepaymentAccountBalanceChanged}.
     */
    public static class Builder {
        private String reason;
        private int prepaymentAccountBalanceInCents;
        private int prepaymentBalanceChangeInCents;
        private String currencyCode;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  reason  String value for reason.
         * @param  prepaymentAccountBalanceInCents  int value for prepaymentAccountBalanceInCents.
         * @param  prepaymentBalanceChangeInCents  int value for prepaymentBalanceChangeInCents.
         * @param  currencyCode  String value for currencyCode.
         */
        public Builder(String reason, int prepaymentAccountBalanceInCents,
                int prepaymentBalanceChangeInCents, String currencyCode) {
            this.reason = reason;
            this.prepaymentAccountBalanceInCents = prepaymentAccountBalanceInCents;
            this.prepaymentBalanceChangeInCents = prepaymentBalanceChangeInCents;
            this.currencyCode = currencyCode;
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
         * Setter for prepaymentAccountBalanceInCents.
         * @param  prepaymentAccountBalanceInCents  int value for prepaymentAccountBalanceInCents.
         * @return Builder
         */
        public Builder prepaymentAccountBalanceInCents(int prepaymentAccountBalanceInCents) {
            this.prepaymentAccountBalanceInCents = prepaymentAccountBalanceInCents;
            return this;
        }

        /**
         * Setter for prepaymentBalanceChangeInCents.
         * @param  prepaymentBalanceChangeInCents  int value for prepaymentBalanceChangeInCents.
         * @return Builder
         */
        public Builder prepaymentBalanceChangeInCents(int prepaymentBalanceChangeInCents) {
            this.prepaymentBalanceChangeInCents = prepaymentBalanceChangeInCents;
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
         * Builds a new {@link PrepaymentAccountBalanceChanged} object using the set fields.
         * @return {@link PrepaymentAccountBalanceChanged}
         */
        public PrepaymentAccountBalanceChanged build() {
            return new PrepaymentAccountBalanceChanged(reason, prepaymentAccountBalanceInCents,
                    prepaymentBalanceChangeInCents, currencyCode);
        }
    }
}
