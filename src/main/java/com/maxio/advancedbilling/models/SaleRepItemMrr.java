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
 * This is a model class for SaleRepItemMrr type.
 */
public class SaleRepItemMrr {
    private String mrr;
    private String usage;
    private String recurring;

    /**
     * Default constructor.
     */
    public SaleRepItemMrr() {
    }

    /**
     * Initialization constructor.
     * @param  mrr  String value for mrr.
     * @param  usage  String value for usage.
     * @param  recurring  String value for recurring.
     */
    public SaleRepItemMrr(
            String mrr,
            String usage,
            String recurring) {
        this.mrr = mrr;
        this.usage = usage;
        this.recurring = recurring;
    }

    /**
     * Getter for Mrr.
     * @return Returns the String
     */
    @JsonGetter("mrr")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMrr() {
        return mrr;
    }

    /**
     * Setter for Mrr.
     * @param mrr Value for String
     */
    @JsonSetter("mrr")
    public void setMrr(String mrr) {
        this.mrr = mrr;
    }

    /**
     * Getter for Usage.
     * @return Returns the String
     */
    @JsonGetter("usage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUsage() {
        return usage;
    }

    /**
     * Setter for Usage.
     * @param usage Value for String
     */
    @JsonSetter("usage")
    public void setUsage(String usage) {
        this.usage = usage;
    }

    /**
     * Getter for Recurring.
     * @return Returns the String
     */
    @JsonGetter("recurring")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRecurring() {
        return recurring;
    }

    /**
     * Setter for Recurring.
     * @param recurring Value for String
     */
    @JsonSetter("recurring")
    public void setRecurring(String recurring) {
        this.recurring = recurring;
    }

    /**
     * Converts this SaleRepItemMrr into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SaleRepItemMrr [" + "mrr=" + mrr + ", usage=" + usage + ", recurring=" + recurring
                + "]";
    }

    /**
     * Builds a new {@link SaleRepItemMrr.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SaleRepItemMrr.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .mrr(getMrr())
                .usage(getUsage())
                .recurring(getRecurring());
        return builder;
    }

    /**
     * Class to build instances of {@link SaleRepItemMrr}.
     */
    public static class Builder {
        private String mrr;
        private String usage;
        private String recurring;



        /**
         * Setter for mrr.
         * @param  mrr  String value for mrr.
         * @return Builder
         */
        public Builder mrr(String mrr) {
            this.mrr = mrr;
            return this;
        }

        /**
         * Setter for usage.
         * @param  usage  String value for usage.
         * @return Builder
         */
        public Builder usage(String usage) {
            this.usage = usage;
            return this;
        }

        /**
         * Setter for recurring.
         * @param  recurring  String value for recurring.
         * @return Builder
         */
        public Builder recurring(String recurring) {
            this.recurring = recurring;
            return this;
        }

        /**
         * Builds a new {@link SaleRepItemMrr} object using the set fields.
         * @return {@link SaleRepItemMrr}
         */
        public SaleRepItemMrr build() {
            return new SaleRepItemMrr(mrr, usage, recurring);
        }
    }
}
