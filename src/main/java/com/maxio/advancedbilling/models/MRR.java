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
 * This is a model class for MRR type.
 */
public class MRR {
    private Integer amountInCents;
    private String amountFormatted;
    private String currency;
    private String currencySymbol;
    private Breakouts breakouts;
    private String atTime;

    /**
     * Default constructor.
     */
    public MRR() {
    }

    /**
     * Initialization constructor.
     * @param  amountInCents  Integer value for amountInCents.
     * @param  amountFormatted  String value for amountFormatted.
     * @param  currency  String value for currency.
     * @param  currencySymbol  String value for currencySymbol.
     * @param  breakouts  Breakouts value for breakouts.
     * @param  atTime  String value for atTime.
     */
    public MRR(
            Integer amountInCents,
            String amountFormatted,
            String currency,
            String currencySymbol,
            Breakouts breakouts,
            String atTime) {
        this.amountInCents = amountInCents;
        this.amountFormatted = amountFormatted;
        this.currency = currency;
        this.currencySymbol = currencySymbol;
        this.breakouts = breakouts;
        this.atTime = atTime;
    }

    /**
     * Getter for AmountInCents.
     * @return Returns the Integer
     */
    @JsonGetter("amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAmountInCents() {
        return amountInCents;
    }

    /**
     * Setter for AmountInCents.
     * @param amountInCents Value for Integer
     */
    @JsonSetter("amount_in_cents")
    public void setAmountInCents(Integer amountInCents) {
        this.amountInCents = amountInCents;
    }

    /**
     * Getter for AmountFormatted.
     * @return Returns the String
     */
    @JsonGetter("amount_formatted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAmountFormatted() {
        return amountFormatted;
    }

    /**
     * Setter for AmountFormatted.
     * @param amountFormatted Value for String
     */
    @JsonSetter("amount_formatted")
    public void setAmountFormatted(String amountFormatted) {
        this.amountFormatted = amountFormatted;
    }

    /**
     * Getter for Currency.
     * @return Returns the String
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for CurrencySymbol.
     * @return Returns the String
     */
    @JsonGetter("currency_symbol")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    /**
     * Setter for CurrencySymbol.
     * @param currencySymbol Value for String
     */
    @JsonSetter("currency_symbol")
    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    /**
     * Getter for Breakouts.
     * @return Returns the Breakouts
     */
    @JsonGetter("breakouts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Breakouts getBreakouts() {
        return breakouts;
    }

    /**
     * Setter for Breakouts.
     * @param breakouts Value for Breakouts
     */
    @JsonSetter("breakouts")
    public void setBreakouts(Breakouts breakouts) {
        this.breakouts = breakouts;
    }

    /**
     * Getter for AtTime.
     * ISO8601 timestamp
     * @return Returns the String
     */
    @JsonGetter("at_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAtTime() {
        return atTime;
    }

    /**
     * Setter for AtTime.
     * ISO8601 timestamp
     * @param atTime Value for String
     */
    @JsonSetter("at_time")
    public void setAtTime(String atTime) {
        this.atTime = atTime;
    }

    /**
     * Converts this MRR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MRR [" + "amountInCents=" + amountInCents + ", amountFormatted=" + amountFormatted
                + ", currency=" + currency + ", currencySymbol=" + currencySymbol + ", breakouts="
                + breakouts + ", atTime=" + atTime + "]";
    }

    /**
     * Builds a new {@link MRR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MRR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .amountInCents(getAmountInCents())
                .amountFormatted(getAmountFormatted())
                .currency(getCurrency())
                .currencySymbol(getCurrencySymbol())
                .breakouts(getBreakouts())
                .atTime(getAtTime());
        return builder;
    }

    /**
     * Class to build instances of {@link MRR}.
     */
    public static class Builder {
        private Integer amountInCents;
        private String amountFormatted;
        private String currency;
        private String currencySymbol;
        private Breakouts breakouts;
        private String atTime;



        /**
         * Setter for amountInCents.
         * @param  amountInCents  Integer value for amountInCents.
         * @return Builder
         */
        public Builder amountInCents(Integer amountInCents) {
            this.amountInCents = amountInCents;
            return this;
        }

        /**
         * Setter for amountFormatted.
         * @param  amountFormatted  String value for amountFormatted.
         * @return Builder
         */
        public Builder amountFormatted(String amountFormatted) {
            this.amountFormatted = amountFormatted;
            return this;
        }

        /**
         * Setter for currency.
         * @param  currency  String value for currency.
         * @return Builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Setter for currencySymbol.
         * @param  currencySymbol  String value for currencySymbol.
         * @return Builder
         */
        public Builder currencySymbol(String currencySymbol) {
            this.currencySymbol = currencySymbol;
            return this;
        }

        /**
         * Setter for breakouts.
         * @param  breakouts  Breakouts value for breakouts.
         * @return Builder
         */
        public Builder breakouts(Breakouts breakouts) {
            this.breakouts = breakouts;
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
         * Builds a new {@link MRR} object using the set fields.
         * @return {@link MRR}
         */
        public MRR build() {
            return new MRR(amountInCents, amountFormatted, currency, currencySymbol, breakouts,
                    atTime);
        }
    }
}
