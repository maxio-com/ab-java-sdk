/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for OverrideSubscriptionRequest type.
 */
public class OverrideSubscriptionRequest {
    private OverrideSubscription subscription;

    /**
     * Default constructor.
     */
    public OverrideSubscriptionRequest() {
    }

    /**
     * Initialization constructor.
     * @param  subscription  OverrideSubscription value for subscription.
     */
    public OverrideSubscriptionRequest(
            OverrideSubscription subscription) {
        this.subscription = subscription;
    }

    /**
     * Getter for Subscription.
     * @return Returns the OverrideSubscription
     */
    @JsonGetter("subscription")
    public OverrideSubscription getSubscription() {
        return subscription;
    }

    /**
     * Setter for Subscription.
     * @param subscription Value for OverrideSubscription
     */
    @JsonSetter("subscription")
    public void setSubscription(OverrideSubscription subscription) {
        this.subscription = subscription;
    }

    /**
     * Converts this OverrideSubscriptionRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OverrideSubscriptionRequest [" + "subscription=" + subscription + "]";
    }

    /**
     * Builds a new {@link OverrideSubscriptionRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OverrideSubscriptionRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscription);
        return builder;
    }

    /**
     * Class to build instances of {@link OverrideSubscriptionRequest}.
     */
    public static class Builder {
        private OverrideSubscription subscription;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  subscription  OverrideSubscription value for subscription.
         */
        public Builder(OverrideSubscription subscription) {
            this.subscription = subscription;
        }

        /**
         * Setter for subscription.
         * @param  subscription  OverrideSubscription value for subscription.
         * @return Builder
         */
        public Builder subscription(OverrideSubscription subscription) {
            this.subscription = subscription;
            return this;
        }

        /**
         * Builds a new {@link OverrideSubscriptionRequest} object using the set fields.
         * @return {@link OverrideSubscriptionRequest}
         */
        public OverrideSubscriptionRequest build() {
            return new OverrideSubscriptionRequest(subscription);
        }
    }
}
