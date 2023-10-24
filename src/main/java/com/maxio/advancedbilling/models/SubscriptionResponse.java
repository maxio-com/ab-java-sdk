/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SubscriptionResponse type.
 */
public class SubscriptionResponse {
    private Subscription subscription;

    /**
     * Default constructor.
     */
    public SubscriptionResponse() {
    }

    /**
     * Initialization constructor.
     * @param  subscription  Subscription value for subscription.
     */
    public SubscriptionResponse(
            Subscription subscription) {
        this.subscription = subscription;
    }

    /**
     * Getter for Subscription.
     * @return Returns the Subscription
     */
    @JsonGetter("subscription")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Subscription getSubscription() {
        return subscription;
    }

    /**
     * Setter for Subscription.
     * @param subscription Value for Subscription
     */
    @JsonSetter("subscription")
    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    /**
     * Converts this SubscriptionResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionResponse [" + "subscription=" + subscription + "]";
    }

    /**
     * Builds a new {@link SubscriptionResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .subscription(getSubscription());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionResponse}.
     */
    public static class Builder {
        private Subscription subscription;



        /**
         * Setter for subscription.
         * @param  subscription  Subscription value for subscription.
         * @return Builder
         */
        public Builder subscription(Subscription subscription) {
            this.subscription = subscription;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionResponse} object using the set fields.
         * @return {@link SubscriptionResponse}
         */
        public SubscriptionResponse build() {
            return new SubscriptionResponse(subscription);
        }
    }
}
