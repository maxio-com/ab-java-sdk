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
    private List<PrepaymentPrepaymentsResponse> prepayments;

    /**
     * Default constructor.
     */
    public PrepaymentsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  prepayments  List of PrepaymentPrepaymentsResponse value for prepayments.
     */
    public PrepaymentsResponse(
            List<PrepaymentPrepaymentsResponse> prepayments) {
        this.prepayments = prepayments;
    }

    /**
     * Getter for Prepayments.
     * @return Returns the List of PrepaymentPrepaymentsResponse
     */
    @JsonGetter("prepayments")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PrepaymentPrepaymentsResponse> getPrepayments() {
        return prepayments;
    }

    /**
     * Setter for Prepayments.
     * @param prepayments Value for List of PrepaymentPrepaymentsResponse
     */
    @JsonSetter("prepayments")
    public void setPrepayments(List<PrepaymentPrepaymentsResponse> prepayments) {
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
        private List<PrepaymentPrepaymentsResponse> prepayments;



        /**
         * Setter for prepayments.
         * @param  prepayments  List of PrepaymentPrepaymentsResponse value for prepayments.
         * @return Builder
         */
        public Builder prepayments(List<PrepaymentPrepaymentsResponse> prepayments) {
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
