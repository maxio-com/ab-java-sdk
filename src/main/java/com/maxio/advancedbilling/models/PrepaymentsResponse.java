/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for PrepaymentsResponse type.
 */
public class PrepaymentsResponse {
    private List<Prepayment1> prepayments;

    /**
     * Default constructor.
     */
    public PrepaymentsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  prepayments  List of Prepayment1 value for prepayments.
     */
    public PrepaymentsResponse(
            List<Prepayment1> prepayments) {
        this.prepayments = prepayments;
    }

    /**
     * Getter for Prepayments.
     * @return Returns the List of Prepayment1
     */
    @JsonGetter("prepayments")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Prepayment1> getPrepayments() {
        return prepayments;
    }

    /**
     * Setter for Prepayments.
     * @param prepayments Value for List of Prepayment1
     */
    @JsonSetter("prepayments")
    public void setPrepayments(List<Prepayment1> prepayments) {
        this.prepayments = prepayments;
    }

    /**
     * Converts this PrepaymentsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrepaymentsResponse [" + "prepayments=" + prepayments + "]";
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
        private List<Prepayment1> prepayments;



        /**
         * Setter for prepayments.
         * @param  prepayments  List of Prepayment1 value for prepayments.
         * @return Builder
         */
        public Builder prepayments(List<Prepayment1> prepayments) {
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
