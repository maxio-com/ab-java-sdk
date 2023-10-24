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
 * This is a model class for BankAccountVerification type.
 */
public class BankAccountVerification {
    private Integer deposit1InCents;
    private Integer deposit2InCents;

    /**
     * Default constructor.
     */
    public BankAccountVerification() {
    }

    /**
     * Initialization constructor.
     * @param  deposit1InCents  Integer value for deposit1InCents.
     * @param  deposit2InCents  Integer value for deposit2InCents.
     */
    public BankAccountVerification(
            Integer deposit1InCents,
            Integer deposit2InCents) {
        this.deposit1InCents = deposit1InCents;
        this.deposit2InCents = deposit2InCents;
    }

    /**
     * Getter for Deposit1InCents.
     * @return Returns the Integer
     */
    @JsonGetter("deposit_1_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getDeposit1InCents() {
        return deposit1InCents;
    }

    /**
     * Setter for Deposit1InCents.
     * @param deposit1InCents Value for Integer
     */
    @JsonSetter("deposit_1_in_cents")
    public void setDeposit1InCents(Integer deposit1InCents) {
        this.deposit1InCents = deposit1InCents;
    }

    /**
     * Getter for Deposit2InCents.
     * @return Returns the Integer
     */
    @JsonGetter("deposit_2_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getDeposit2InCents() {
        return deposit2InCents;
    }

    /**
     * Setter for Deposit2InCents.
     * @param deposit2InCents Value for Integer
     */
    @JsonSetter("deposit_2_in_cents")
    public void setDeposit2InCents(Integer deposit2InCents) {
        this.deposit2InCents = deposit2InCents;
    }

    /**
     * Converts this BankAccountVerification into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BankAccountVerification [" + "deposit1InCents=" + deposit1InCents
                + ", deposit2InCents=" + deposit2InCents + "]";
    }

    /**
     * Builds a new {@link BankAccountVerification.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BankAccountVerification.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .deposit1InCents(getDeposit1InCents())
                .deposit2InCents(getDeposit2InCents());
        return builder;
    }

    /**
     * Class to build instances of {@link BankAccountVerification}.
     */
    public static class Builder {
        private Integer deposit1InCents;
        private Integer deposit2InCents;



        /**
         * Setter for deposit1InCents.
         * @param  deposit1InCents  Integer value for deposit1InCents.
         * @return Builder
         */
        public Builder deposit1InCents(Integer deposit1InCents) {
            this.deposit1InCents = deposit1InCents;
            return this;
        }

        /**
         * Setter for deposit2InCents.
         * @param  deposit2InCents  Integer value for deposit2InCents.
         * @return Builder
         */
        public Builder deposit2InCents(Integer deposit2InCents) {
            this.deposit2InCents = deposit2InCents;
            return this;
        }

        /**
         * Builds a new {@link BankAccountVerification} object using the set fields.
         * @return {@link BankAccountVerification}
         */
        public BankAccountVerification build() {
            return new BankAccountVerification(deposit1InCents, deposit2InCents);
        }
    }
}
