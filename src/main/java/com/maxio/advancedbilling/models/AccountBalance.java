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
 * This is a model class for AccountBalance type.
 */
public class AccountBalance {
    private Integer balanceInCents;

    /**
     * Default constructor.
     */
    public AccountBalance() {
    }

    /**
     * Initialization constructor.
     * @param  balanceInCents  Integer value for balanceInCents.
     */
    public AccountBalance(
            Integer balanceInCents) {
        this.balanceInCents = balanceInCents;
    }

    /**
     * Getter for BalanceInCents.
     * The balance in cents.
     * @return Returns the Integer
     */
    @JsonGetter("balance_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getBalanceInCents() {
        return balanceInCents;
    }

    /**
     * Setter for BalanceInCents.
     * The balance in cents.
     * @param balanceInCents Value for Integer
     */
    @JsonSetter("balance_in_cents")
    public void setBalanceInCents(Integer balanceInCents) {
        this.balanceInCents = balanceInCents;
    }

    /**
     * Converts this AccountBalance into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AccountBalance [" + "balanceInCents=" + balanceInCents + "]";
    }

    /**
     * Builds a new {@link AccountBalance.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AccountBalance.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .balanceInCents(getBalanceInCents());
        return builder;
    }

    /**
     * Class to build instances of {@link AccountBalance}.
     */
    public static class Builder {
        private Integer balanceInCents;



        /**
         * Setter for balanceInCents.
         * @param  balanceInCents  Integer value for balanceInCents.
         * @return Builder
         */
        public Builder balanceInCents(Integer balanceInCents) {
            this.balanceInCents = balanceInCents;
            return this;
        }

        /**
         * Builds a new {@link AccountBalance} object using the set fields.
         * @return {@link AccountBalance}
         */
        public AccountBalance build() {
            return new AccountBalance(balanceInCents);
        }
    }
}
