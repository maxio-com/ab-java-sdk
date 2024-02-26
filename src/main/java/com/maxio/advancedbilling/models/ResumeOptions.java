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
 * This is a model class for ResumeOptions type.
 */
public class ResumeOptions {
    private Boolean requireResume;
    private Boolean forgiveBalance;

    /**
     * Default constructor.
     */
    public ResumeOptions() {
    }

    /**
     * Initialization constructor.
     * @param  requireResume  Boolean value for requireResume.
     * @param  forgiveBalance  Boolean value for forgiveBalance.
     */
    public ResumeOptions(
            Boolean requireResume,
            Boolean forgiveBalance) {
        this.requireResume = requireResume;
        this.forgiveBalance = forgiveBalance;
    }

    /**
     * Getter for RequireResume.
     * Chargify will only attempt to resume the subscription's billing period. If not resumable, the
     * subscription will be left in it's current state.
     * @return Returns the Boolean
     */
    @JsonGetter("require_resume")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRequireResume() {
        return requireResume;
    }

    /**
     * Setter for RequireResume.
     * Chargify will only attempt to resume the subscription's billing period. If not resumable, the
     * subscription will be left in it's current state.
     * @param requireResume Value for Boolean
     */
    @JsonSetter("require_resume")
    public void setRequireResume(Boolean requireResume) {
        this.requireResume = requireResume;
    }

    /**
     * Getter for ForgiveBalance.
     * Indicates whether or not Chargify should clear the subscription's existing balance before
     * attempting to resume the subscription. If subscription cannot be resumed, the balance will
     * remain as it was before the attempt to resume was made.
     * @return Returns the Boolean
     */
    @JsonGetter("forgive_balance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getForgiveBalance() {
        return forgiveBalance;
    }

    /**
     * Setter for ForgiveBalance.
     * Indicates whether or not Chargify should clear the subscription's existing balance before
     * attempting to resume the subscription. If subscription cannot be resumed, the balance will
     * remain as it was before the attempt to resume was made.
     * @param forgiveBalance Value for Boolean
     */
    @JsonSetter("forgive_balance")
    public void setForgiveBalance(Boolean forgiveBalance) {
        this.forgiveBalance = forgiveBalance;
    }

    /**
     * Converts this ResumeOptions into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ResumeOptions [" + "requireResume=" + requireResume + ", forgiveBalance="
                + forgiveBalance + "]";
    }

    /**
     * Builds a new {@link ResumeOptions.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ResumeOptions.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .requireResume(getRequireResume())
                .forgiveBalance(getForgiveBalance());
        return builder;
    }

    /**
     * Class to build instances of {@link ResumeOptions}.
     */
    public static class Builder {
        private Boolean requireResume;
        private Boolean forgiveBalance;



        /**
         * Setter for requireResume.
         * @param  requireResume  Boolean value for requireResume.
         * @return Builder
         */
        public Builder requireResume(Boolean requireResume) {
            this.requireResume = requireResume;
            return this;
        }

        /**
         * Setter for forgiveBalance.
         * @param  forgiveBalance  Boolean value for forgiveBalance.
         * @return Builder
         */
        public Builder forgiveBalance(Boolean forgiveBalance) {
            this.forgiveBalance = forgiveBalance;
            return this;
        }

        /**
         * Builds a new {@link ResumeOptions} object using the set fields.
         * @return {@link ResumeOptions}
         */
        public ResumeOptions build() {
            return new ResumeOptions(requireResume, forgiveBalance);
        }
    }
}
