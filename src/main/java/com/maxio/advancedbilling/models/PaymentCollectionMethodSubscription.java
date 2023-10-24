/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;



/**
 * This is a model class for PaymentCollectionMethodSubscription type.
 */
public class PaymentCollectionMethodSubscription {

    /**
     * Default constructor.
     */
    public PaymentCollectionMethodSubscription() {
    }

    /**
     * Converts this PaymentCollectionMethodSubscription into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentCollectionMethodSubscription [" + "]";
    }

    /**
     * Builds a new {@link PaymentCollectionMethodSubscription.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentCollectionMethodSubscription.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentCollectionMethodSubscription}.
     */
    public static class Builder {






        /**
         * Builds a new {@link PaymentCollectionMethodSubscription} object using the set fields.
         * @return {@link PaymentCollectionMethodSubscription}
         */
        public PaymentCollectionMethodSubscription build() {
            return new PaymentCollectionMethodSubscription();
        }
    }
}
