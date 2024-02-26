/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for DeductServiceCreditRequest type.
 */
public class DeductServiceCreditRequest {
    private DeductServiceCredit deduction;

    /**
     * Default constructor.
     */
    public DeductServiceCreditRequest() {
    }

    /**
     * Initialization constructor.
     * @param  deduction  DeductServiceCredit value for deduction.
     */
    public DeductServiceCreditRequest(
            DeductServiceCredit deduction) {
        this.deduction = deduction;
    }

    /**
     * Getter for Deduction.
     * @return Returns the DeductServiceCredit
     */
    @JsonGetter("deduction")
    public DeductServiceCredit getDeduction() {
        return deduction;
    }

    /**
     * Setter for Deduction.
     * @param deduction Value for DeductServiceCredit
     */
    @JsonSetter("deduction")
    public void setDeduction(DeductServiceCredit deduction) {
        this.deduction = deduction;
    }

    /**
     * Converts this DeductServiceCreditRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeductServiceCreditRequest [" + "deduction=" + deduction + "]";
    }

    /**
     * Builds a new {@link DeductServiceCreditRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeductServiceCreditRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(deduction);
        return builder;
    }

    /**
     * Class to build instances of {@link DeductServiceCreditRequest}.
     */
    public static class Builder {
        private DeductServiceCredit deduction;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  deduction  DeductServiceCredit value for deduction.
         */
        public Builder(DeductServiceCredit deduction) {
            this.deduction = deduction;
        }

        /**
         * Setter for deduction.
         * @param  deduction  DeductServiceCredit value for deduction.
         * @return Builder
         */
        public Builder deduction(DeductServiceCredit deduction) {
            this.deduction = deduction;
            return this;
        }

        /**
         * Builds a new {@link DeductServiceCreditRequest} object using the set fields.
         * @return {@link DeductServiceCreditRequest}
         */
        public DeductServiceCreditRequest build() {
            return new DeductServiceCreditRequest(deduction);
        }
    }
}
