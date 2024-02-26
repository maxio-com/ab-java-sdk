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
 * This is a model class for PrepaymentAccountBalanceChanged type.
 */
public class PrepaymentAccountBalanceChanged
        extends BaseModel {
    private String reason;
    private long prepaymentAccountBalanceInCents;
    private long prepaymentBalanceChangeInCents;
    private String currencyCode;

    /**
     * Default constructor.
     */
    public PrepaymentAccountBalanceChanged() {
    }

    /**
     * Initialization constructor.
     * @param  reason  String value for reason.
     * @param  prepaymentAccountBalanceInCents  long value for prepaymentAccountBalanceInCents.
     * @param  prepaymentBalanceChangeInCents  long value for prepaymentBalanceChangeInCents.
     * @param  currencyCode  String value for currencyCode.
     */
    @JsonCreator
    public PrepaymentAccountBalanceChanged(
            @JsonProperty("reason") String reason,
            @JsonProperty("prepayment_account_balance_in_cents") long prepaymentAccountBalanceInCents,
            @JsonProperty("prepayment_balance_change_in_cents") long prepaymentBalanceChangeInCents,
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
     * Getter for PrepaymentBalanceChangeInCents.
     * @return Returns the long
     */
    @JsonGetter("prepayment_balance_change_in_cents")
    public long getPrepaymentBalanceChangeInCents() {
        return prepaymentBalanceChangeInCents;
    }

    /**
     * Setter for PrepaymentBalanceChangeInCents.
     * @param prepaymentBalanceChangeInCents Value for long
     */
    @JsonSetter("prepayment_balance_change_in_cents")
    public void setPrepaymentBalanceChangeInCents(long prepaymentBalanceChangeInCents) {
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
                + ", currencyCode=" + currencyCode + ", additionalProperties="
                + getAdditionalProperties() + "]";
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
        private long prepaymentAccountBalanceInCents;
        private long prepaymentBalanceChangeInCents;
        private String currencyCode;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  reason  String value for reason.
         * @param  prepaymentAccountBalanceInCents  long value for prepaymentAccountBalanceInCents.
         * @param  prepaymentBalanceChangeInCents  long value for prepaymentBalanceChangeInCents.
         * @param  currencyCode  String value for currencyCode.
         */
        public Builder(String reason, long prepaymentAccountBalanceInCents,
                long prepaymentBalanceChangeInCents, String currencyCode) {
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
         * @param  prepaymentAccountBalanceInCents  long value for prepaymentAccountBalanceInCents.
         * @return Builder
         */
        public Builder prepaymentAccountBalanceInCents(long prepaymentAccountBalanceInCents) {
            this.prepaymentAccountBalanceInCents = prepaymentAccountBalanceInCents;
            return this;
        }

        /**
         * Setter for prepaymentBalanceChangeInCents.
         * @param  prepaymentBalanceChangeInCents  long value for prepaymentBalanceChangeInCents.
         * @return Builder
         */
        public Builder prepaymentBalanceChangeInCents(long prepaymentBalanceChangeInCents) {
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
