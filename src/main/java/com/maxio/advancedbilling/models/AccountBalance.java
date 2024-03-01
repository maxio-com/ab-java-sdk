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
 * This is a model class for AccountBalance type.
 */
public class AccountBalance
        extends BaseModel {
    private Long balanceInCents;

    /**
     * Default constructor.
     */
    public AccountBalance() {
    }

    /**
     * Initialization constructor.
     * @param  balanceInCents  Long value for balanceInCents.
     */
    public AccountBalance(
            Long balanceInCents) {
        this.balanceInCents = balanceInCents;
    }

    /**
     * Getter for BalanceInCents.
     * The balance in cents.
     * @return Returns the Long
     */
    @JsonGetter("balance_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getBalanceInCents() {
        return balanceInCents;
    }

    /**
     * Setter for BalanceInCents.
     * The balance in cents.
     * @param balanceInCents Value for Long
     */
    @JsonSetter("balance_in_cents")
    public void setBalanceInCents(Long balanceInCents) {
        this.balanceInCents = balanceInCents;
    }

    /**
     * Converts this AccountBalance into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AccountBalance [" + "balanceInCents=" + balanceInCents + ", additionalProperties="
                + getAdditionalProperties() + "]";
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
        private Long balanceInCents;



        /**
         * Setter for balanceInCents.
         * @param  balanceInCents  Long value for balanceInCents.
         * @return Builder
         */
        public Builder balanceInCents(Long balanceInCents) {
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
