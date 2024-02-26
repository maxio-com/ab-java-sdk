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
import java.util.List;

/**
 * This is a model class for PrepaymentsResponse type.
 */
public class PrepaymentsResponse
        extends BaseModel {
    private List<Prepayment> prepayments;

    /**
     * Default constructor.
     */
    public PrepaymentsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  prepayments  List of Prepayment value for prepayments.
     */
    public PrepaymentsResponse(
            List<Prepayment> prepayments) {
        this.prepayments = prepayments;
    }

    /**
     * Getter for Prepayments.
     * @return Returns the List of Prepayment
     */
    @JsonGetter("prepayments")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Prepayment> getPrepayments() {
        return prepayments;
    }

    /**
     * Setter for Prepayments.
     * @param prepayments Value for List of Prepayment
     */
    @JsonSetter("prepayments")
    public void setPrepayments(List<Prepayment> prepayments) {
        this.prepayments = prepayments;
    }

    /**
     * Converts this PrepaymentsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrepaymentsResponse [" + "prepayments=" + prepayments + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PrepaymentsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PrepaymentsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .prepayments(getPrepayments());
        return builder;
    }

    /**
     * Class to build instances of {@link PrepaymentsResponse}.
     */
    public static class Builder {
        private List<Prepayment> prepayments;



        /**
         * Setter for prepayments.
         * @param  prepayments  List of Prepayment value for prepayments.
         * @return Builder
         */
        public Builder prepayments(List<Prepayment> prepayments) {
            this.prepayments = prepayments;
            return this;
        }

        /**
         * Builds a new {@link PrepaymentsResponse} object using the set fields.
         * @return {@link PrepaymentsResponse}
         */
        public PrepaymentsResponse build() {
            return new PrepaymentsResponse(prepayments);
        }
    }
}
