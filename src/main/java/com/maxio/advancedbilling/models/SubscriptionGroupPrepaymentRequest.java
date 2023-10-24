/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SubscriptionGroupPrepaymentRequest type.
 */
public class SubscriptionGroupPrepaymentRequest {
    private SubscriptionGroupPrepayment prepayment;

    /**
     * Default constructor.
     */
    public SubscriptionGroupPrepaymentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  prepayment  SubscriptionGroupPrepayment value for prepayment.
     */
    public SubscriptionGroupPrepaymentRequest(
            SubscriptionGroupPrepayment prepayment) {
        this.prepayment = prepayment;
    }

    /**
     * Getter for Prepayment.
     * @return Returns the SubscriptionGroupPrepayment
     */
    @JsonGetter("prepayment")
    public SubscriptionGroupPrepayment getPrepayment() {
        return prepayment;
    }

    /**
     * Setter for Prepayment.
     * @param prepayment Value for SubscriptionGroupPrepayment
     */
    @JsonSetter("prepayment")
    public void setPrepayment(SubscriptionGroupPrepayment prepayment) {
        this.prepayment = prepayment;
    }

    /**
     * Converts this SubscriptionGroupPrepaymentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupPrepaymentRequest [" + "prepayment=" + prepayment + "]";
    }

    /**
     * Builds a new {@link SubscriptionGroupPrepaymentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionGroupPrepaymentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(prepayment);
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupPrepaymentRequest}.
     */
    public static class Builder {
        private SubscriptionGroupPrepayment prepayment;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  prepayment  SubscriptionGroupPrepayment value for prepayment.
         */
        public Builder(SubscriptionGroupPrepayment prepayment) {
            this.prepayment = prepayment;
        }

        /**
         * Setter for prepayment.
         * @param  prepayment  SubscriptionGroupPrepayment value for prepayment.
         * @return Builder
         */
        public Builder prepayment(SubscriptionGroupPrepayment prepayment) {
            this.prepayment = prepayment;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroupPrepaymentRequest} object using the set fields.
         * @return {@link SubscriptionGroupPrepaymentRequest}
         */
        public SubscriptionGroupPrepaymentRequest build() {
            return new SubscriptionGroupPrepaymentRequest(prepayment);
        }
    }
}
