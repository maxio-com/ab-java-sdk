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
 * This is a model class for ReactivationBilling type.
 */
public class ReactivationBilling {
    private ReactivationCharge reactivationCharge;

    /**
     * Default constructor.
     */
    public ReactivationBilling() {
        reactivationCharge = ReactivationCharge.PRORATED;
    }

    /**
     * Initialization constructor.
     * @param  reactivationCharge  ReactivationCharge value for reactivationCharge.
     */
    public ReactivationBilling(
            ReactivationCharge reactivationCharge) {
        this.reactivationCharge = reactivationCharge;
    }

    /**
     * Getter for ReactivationCharge.
     * You may choose how to handle the reactivation charge for that subscription: 1) `prorated` A
     * prorated charge for the product price will be attempted for to complete the period 2)
     * `immediate` A full-price charge for the product price will be attempted immediately 3)
     * `delayed` A full-price charge for the product price will be attempted at the next renewal
     * @return Returns the ReactivationCharge
     */
    @JsonGetter("reactivation_charge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ReactivationCharge getReactivationCharge() {
        return reactivationCharge;
    }

    /**
     * Setter for ReactivationCharge.
     * You may choose how to handle the reactivation charge for that subscription: 1) `prorated` A
     * prorated charge for the product price will be attempted for to complete the period 2)
     * `immediate` A full-price charge for the product price will be attempted immediately 3)
     * `delayed` A full-price charge for the product price will be attempted at the next renewal
     * @param reactivationCharge Value for ReactivationCharge
     */
    @JsonSetter("reactivation_charge")
    public void setReactivationCharge(ReactivationCharge reactivationCharge) {
        this.reactivationCharge = reactivationCharge;
    }

    /**
     * Converts this ReactivationBilling into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReactivationBilling [" + "reactivationCharge=" + reactivationCharge + "]";
    }

    /**
     * Builds a new {@link ReactivationBilling.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReactivationBilling.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .reactivationCharge(getReactivationCharge());
        return builder;
    }

    /**
     * Class to build instances of {@link ReactivationBilling}.
     */
    public static class Builder {
        private ReactivationCharge reactivationCharge = ReactivationCharge.PRORATED;



        /**
         * Setter for reactivationCharge.
         * @param  reactivationCharge  ReactivationCharge value for reactivationCharge.
         * @return Builder
         */
        public Builder reactivationCharge(ReactivationCharge reactivationCharge) {
            this.reactivationCharge = reactivationCharge;
            return this;
        }

        /**
         * Builds a new {@link ReactivationBilling} object using the set fields.
         * @return {@link ReactivationBilling}
         */
        public ReactivationBilling build() {
            return new ReactivationBilling(reactivationCharge);
        }
    }
}
