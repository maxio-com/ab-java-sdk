/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for AccountBalance type.
 */
public class AccountBalance
        extends BaseModel {
    private Long balanceInCents;
    private OptionalNullable<Long> automaticBalanceInCents;
    private OptionalNullable<Long> remittanceBalanceInCents;

    /**
     * Default constructor.
     */
    public AccountBalance() {
    }

    /**
     * Initialization constructor.
     * @param  balanceInCents  Long value for balanceInCents.
     * @param  automaticBalanceInCents  Long value for automaticBalanceInCents.
     * @param  remittanceBalanceInCents  Long value for remittanceBalanceInCents.
     */
    public AccountBalance(
            Long balanceInCents,
            Long automaticBalanceInCents,
            Long remittanceBalanceInCents) {
        this.balanceInCents = balanceInCents;
        this.automaticBalanceInCents = OptionalNullable.of(automaticBalanceInCents);
        this.remittanceBalanceInCents = OptionalNullable.of(remittanceBalanceInCents);
    }

    /**
     * Initialization constructor.
     * @param  balanceInCents  Long value for balanceInCents.
     * @param  automaticBalanceInCents  Long value for automaticBalanceInCents.
     * @param  remittanceBalanceInCents  Long value for remittanceBalanceInCents.
     */

    protected AccountBalance(Long balanceInCents, OptionalNullable<Long> automaticBalanceInCents,
            OptionalNullable<Long> remittanceBalanceInCents) {
        this.balanceInCents = balanceInCents;
        this.automaticBalanceInCents = automaticBalanceInCents;
        this.remittanceBalanceInCents = remittanceBalanceInCents;
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
     * Internal Getter for AutomaticBalanceInCents.
     * The automatic balance in cents.
     * @return Returns the Internal Long
     */
    @JsonGetter("automatic_balance_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Long> internalGetAutomaticBalanceInCents() {
        return this.automaticBalanceInCents;
    }

    /**
     * Getter for AutomaticBalanceInCents.
     * The automatic balance in cents.
     * @return Returns the Long
     */
    public Long getAutomaticBalanceInCents() {
        return OptionalNullable.getFrom(automaticBalanceInCents);
    }

    /**
     * Setter for AutomaticBalanceInCents.
     * The automatic balance in cents.
     * @param automaticBalanceInCents Value for Long
     */
    @JsonSetter("automatic_balance_in_cents")
    public void setAutomaticBalanceInCents(Long automaticBalanceInCents) {
        this.automaticBalanceInCents = OptionalNullable.of(automaticBalanceInCents);
    }

    /**
     * UnSetter for AutomaticBalanceInCents.
     * The automatic balance in cents.
     */
    public void unsetAutomaticBalanceInCents() {
        automaticBalanceInCents = null;
    }

    /**
     * Internal Getter for RemittanceBalanceInCents.
     * The remittance balance in cents.
     * @return Returns the Internal Long
     */
    @JsonGetter("remittance_balance_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Long> internalGetRemittanceBalanceInCents() {
        return this.remittanceBalanceInCents;
    }

    /**
     * Getter for RemittanceBalanceInCents.
     * The remittance balance in cents.
     * @return Returns the Long
     */
    public Long getRemittanceBalanceInCents() {
        return OptionalNullable.getFrom(remittanceBalanceInCents);
    }

    /**
     * Setter for RemittanceBalanceInCents.
     * The remittance balance in cents.
     * @param remittanceBalanceInCents Value for Long
     */
    @JsonSetter("remittance_balance_in_cents")
    public void setRemittanceBalanceInCents(Long remittanceBalanceInCents) {
        this.remittanceBalanceInCents = OptionalNullable.of(remittanceBalanceInCents);
    }

    /**
     * UnSetter for RemittanceBalanceInCents.
     * The remittance balance in cents.
     */
    public void unsetRemittanceBalanceInCents() {
        remittanceBalanceInCents = null;
    }

    /**
     * Converts this AccountBalance into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AccountBalance [" + "balanceInCents=" + balanceInCents
                + ", automaticBalanceInCents=" + automaticBalanceInCents
                + ", remittanceBalanceInCents=" + remittanceBalanceInCents
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link AccountBalance.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AccountBalance.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .balanceInCents(getBalanceInCents());
        builder.automaticBalanceInCents = internalGetAutomaticBalanceInCents();
        builder.remittanceBalanceInCents = internalGetRemittanceBalanceInCents();
        return builder;
    }

    /**
     * Class to build instances of {@link AccountBalance}.
     */
    public static class Builder {
        private Long balanceInCents;
        private OptionalNullable<Long> automaticBalanceInCents;
        private OptionalNullable<Long> remittanceBalanceInCents;



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
         * Setter for automaticBalanceInCents.
         * @param  automaticBalanceInCents  Long value for automaticBalanceInCents.
         * @return Builder
         */
        public Builder automaticBalanceInCents(Long automaticBalanceInCents) {
            this.automaticBalanceInCents = OptionalNullable.of(automaticBalanceInCents);
            return this;
        }

        /**
         * UnSetter for automaticBalanceInCents.
         * @return Builder
         */
        public Builder unsetAutomaticBalanceInCents() {
            automaticBalanceInCents = null;
            return this;
        }

        /**
         * Setter for remittanceBalanceInCents.
         * @param  remittanceBalanceInCents  Long value for remittanceBalanceInCents.
         * @return Builder
         */
        public Builder remittanceBalanceInCents(Long remittanceBalanceInCents) {
            this.remittanceBalanceInCents = OptionalNullable.of(remittanceBalanceInCents);
            return this;
        }

        /**
         * UnSetter for remittanceBalanceInCents.
         * @return Builder
         */
        public Builder unsetRemittanceBalanceInCents() {
            remittanceBalanceInCents = null;
            return this;
        }

        /**
         * Builds a new {@link AccountBalance} object using the set fields.
         * @return {@link AccountBalance}
         */
        public AccountBalance build() {
            return new AccountBalance(balanceInCents, automaticBalanceInCents,
                    remittanceBalanceInCents);
        }
    }
}
