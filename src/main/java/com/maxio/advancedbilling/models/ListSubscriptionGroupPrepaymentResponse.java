/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for ListSubscriptionGroupPrepaymentResponse type.
 */
public class ListSubscriptionGroupPrepaymentResponse {
    private List<ListSubscriptionGroupPrepayment> prepayments;

    /**
     * Default constructor.
     */
    public ListSubscriptionGroupPrepaymentResponse() {
    }

    /**
     * Initialization constructor.
     * @param  prepayments  List of ListSubscriptionGroupPrepayment value for prepayments.
     */
    public ListSubscriptionGroupPrepaymentResponse(
            List<ListSubscriptionGroupPrepayment> prepayments) {
        this.prepayments = prepayments;
    }

    /**
     * Getter for Prepayments.
     * @return Returns the List of ListSubscriptionGroupPrepayment
     */
    @JsonGetter("prepayments")
    public List<ListSubscriptionGroupPrepayment> getPrepayments() {
        return prepayments;
    }

    /**
     * Setter for Prepayments.
     * @param prepayments Value for List of ListSubscriptionGroupPrepayment
     */
    @JsonSetter("prepayments")
    public void setPrepayments(List<ListSubscriptionGroupPrepayment> prepayments) {
        this.prepayments = prepayments;
    }

    /**
     * Converts this ListSubscriptionGroupPrepaymentResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListSubscriptionGroupPrepaymentResponse [" + "prepayments=" + prepayments + "]";
    }

    /**
     * Builds a new {@link ListSubscriptionGroupPrepaymentResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListSubscriptionGroupPrepaymentResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(prepayments);
        return builder;
    }

    /**
     * Class to build instances of {@link ListSubscriptionGroupPrepaymentResponse}.
     */
    public static class Builder {
        private List<ListSubscriptionGroupPrepayment> prepayments;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  prepayments  List of ListSubscriptionGroupPrepayment value for prepayments.
         */
        public Builder(List<ListSubscriptionGroupPrepayment> prepayments) {
            this.prepayments = prepayments;
        }

        /**
         * Setter for prepayments.
         * @param  prepayments  List of ListSubscriptionGroupPrepayment value for prepayments.
         * @return Builder
         */
        public Builder prepayments(List<ListSubscriptionGroupPrepayment> prepayments) {
            this.prepayments = prepayments;
            return this;
        }

        /**
         * Builds a new {@link ListSubscriptionGroupPrepaymentResponse} object using the set fields.
         * @return {@link ListSubscriptionGroupPrepaymentResponse}
         */
        public ListSubscriptionGroupPrepaymentResponse build() {
            return new ListSubscriptionGroupPrepaymentResponse(prepayments);
        }
    }
}
