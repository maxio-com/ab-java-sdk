/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreatePrepaymentResponse type.
 */
public class CreatePrepaymentResponse {
    private CreatedPrepayment prepayment;

    /**
     * Default constructor.
     */
    public CreatePrepaymentResponse() {
    }

    /**
     * Initialization constructor.
     * @param  prepayment  CreatedPrepayment value for prepayment.
     */
    public CreatePrepaymentResponse(
            CreatedPrepayment prepayment) {
        this.prepayment = prepayment;
    }

    /**
     * Getter for Prepayment.
     * @return Returns the CreatedPrepayment
     */
    @JsonGetter("prepayment")
    public CreatedPrepayment getPrepayment() {
        return prepayment;
    }

    /**
     * Setter for Prepayment.
     * @param prepayment Value for CreatedPrepayment
     */
    @JsonSetter("prepayment")
    public void setPrepayment(CreatedPrepayment prepayment) {
        this.prepayment = prepayment;
    }

    /**
     * Converts this CreatePrepaymentResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreatePrepaymentResponse [" + "prepayment=" + prepayment + "]";
    }

    /**
     * Builds a new {@link CreatePrepaymentResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreatePrepaymentResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(prepayment);
        return builder;
    }

    /**
     * Class to build instances of {@link CreatePrepaymentResponse}.
     */
    public static class Builder {
        private CreatedPrepayment prepayment;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  prepayment  CreatedPrepayment value for prepayment.
         */
        public Builder(CreatedPrepayment prepayment) {
            this.prepayment = prepayment;
        }

        /**
         * Setter for prepayment.
         * @param  prepayment  CreatedPrepayment value for prepayment.
         * @return Builder
         */
        public Builder prepayment(CreatedPrepayment prepayment) {
            this.prepayment = prepayment;
            return this;
        }

        /**
         * Builds a new {@link CreatePrepaymentResponse} object using the set fields.
         * @return {@link CreatePrepaymentResponse}
         */
        public CreatePrepaymentResponse build() {
            return new CreatePrepaymentResponse(prepayment);
        }
    }
}
