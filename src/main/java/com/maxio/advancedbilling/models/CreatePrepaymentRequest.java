/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreatePrepaymentRequest type.
 */
public class CreatePrepaymentRequest {
    private CreatePrepayment prepayment;

    /**
     * Default constructor.
     */
    public CreatePrepaymentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  prepayment  CreatePrepayment value for prepayment.
     */
    public CreatePrepaymentRequest(
            CreatePrepayment prepayment) {
        this.prepayment = prepayment;
    }

    /**
     * Getter for Prepayment.
     * @return Returns the CreatePrepayment
     */
    @JsonGetter("prepayment")
    public CreatePrepayment getPrepayment() {
        return prepayment;
    }

    /**
     * Setter for Prepayment.
     * @param prepayment Value for CreatePrepayment
     */
    @JsonSetter("prepayment")
    public void setPrepayment(CreatePrepayment prepayment) {
        this.prepayment = prepayment;
    }

    /**
     * Converts this CreatePrepaymentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreatePrepaymentRequest [" + "prepayment=" + prepayment + "]";
    }

    /**
     * Builds a new {@link CreatePrepaymentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreatePrepaymentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(prepayment);
        return builder;
    }

    /**
     * Class to build instances of {@link CreatePrepaymentRequest}.
     */
    public static class Builder {
        private CreatePrepayment prepayment;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  prepayment  CreatePrepayment value for prepayment.
         */
        public Builder(CreatePrepayment prepayment) {
            this.prepayment = prepayment;
        }

        /**
         * Setter for prepayment.
         * @param  prepayment  CreatePrepayment value for prepayment.
         * @return Builder
         */
        public Builder prepayment(CreatePrepayment prepayment) {
            this.prepayment = prepayment;
            return this;
        }

        /**
         * Builds a new {@link CreatePrepaymentRequest} object using the set fields.
         * @return {@link CreatePrepaymentRequest}
         */
        public CreatePrepaymentRequest build() {
            return new CreatePrepaymentRequest(prepayment);
        }
    }
}
