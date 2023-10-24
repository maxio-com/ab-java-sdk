/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;



/**
 * This is a model class for SubscriptionId type.
 */
public class SubscriptionId {

    /**
     * Default constructor.
     */
    public SubscriptionId() {
    }

    /**
     * Converts this SubscriptionId into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionId [" + "]";
    }

    /**
     * Builds a new {@link SubscriptionId.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionId.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionId}.
     */
    public static class Builder {






        /**
         * Builds a new {@link SubscriptionId} object using the set fields.
         * @return {@link SubscriptionId}
         */
        public SubscriptionId build() {
            return new SubscriptionId();
        }
    }
}
