/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for PrepaymentResponse type.
 */
public class PrepaymentResponse {
    private Prepayment1 prepayment;

    /**
     * Default constructor.
     */
    public PrepaymentResponse() {
    }

    /**
     * Initialization constructor.
     * @param  prepayment  Prepayment1 value for prepayment.
     */
    public PrepaymentResponse(
            Prepayment1 prepayment) {
        this.prepayment = prepayment;
    }

    /**
     * Getter for Prepayment.
     * @return Returns the Prepayment1
     */
    @JsonGetter("prepayment")
    public Prepayment1 getPrepayment() {
        return prepayment;
    }

    /**
     * Setter for Prepayment.
     * @param prepayment Value for Prepayment1
     */
    @JsonSetter("prepayment")
    public void setPrepayment(Prepayment1 prepayment) {
        this.prepayment = prepayment;
    }

    /**
     * Converts this PrepaymentResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrepaymentResponse [" + "prepayment=" + prepayment + "]";
    }

    /**
     * Builds a new {@link PrepaymentResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PrepaymentResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(prepayment);
        return builder;
    }

    /**
     * Class to build instances of {@link PrepaymentResponse}.
     */
    public static class Builder {
        private Prepayment1 prepayment;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  prepayment  Prepayment1 value for prepayment.
         */
        public Builder(Prepayment1 prepayment) {
            this.prepayment = prepayment;
        }

        /**
         * Setter for prepayment.
         * @param  prepayment  Prepayment1 value for prepayment.
         * @return Builder
         */
        public Builder prepayment(Prepayment1 prepayment) {
            this.prepayment = prepayment;
            return this;
        }

        /**
         * Builds a new {@link PrepaymentResponse} object using the set fields.
         * @return {@link PrepaymentResponse}
         */
        public PrepaymentResponse build() {
            return new PrepaymentResponse(prepayment);
        }
    }
}
