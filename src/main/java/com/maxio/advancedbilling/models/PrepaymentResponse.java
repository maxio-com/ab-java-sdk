/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for PrepaymentResponse type.
 */
public class PrepaymentResponse
        extends BaseModel {
    private Prepayment prepayment;

    /**
     * Default constructor.
     */
    public PrepaymentResponse() {
    }

    /**
     * Initialization constructor.
     * @param  prepayment  Prepayment value for prepayment.
     */
    public PrepaymentResponse(
            Prepayment prepayment) {
        this.prepayment = prepayment;
    }

    /**
     * Getter for Prepayment.
     * @return Returns the Prepayment
     */
    @JsonGetter("prepayment")
    public Prepayment getPrepayment() {
        return prepayment;
    }

    /**
     * Setter for Prepayment.
     * @param prepayment Value for Prepayment
     */
    @JsonSetter("prepayment")
    public void setPrepayment(Prepayment prepayment) {
        this.prepayment = prepayment;
    }

    /**
     * Converts this PrepaymentResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrepaymentResponse [" + "prepayment=" + prepayment + ", additionalProperties="
                + getAdditionalProperties() + "]";
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
        private Prepayment prepayment;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  prepayment  Prepayment value for prepayment.
         */
        public Builder(Prepayment prepayment) {
            this.prepayment = prepayment;
        }

        /**
         * Setter for prepayment.
         * @param  prepayment  Prepayment value for prepayment.
         * @return Builder
         */
        public Builder prepayment(Prepayment prepayment) {
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
