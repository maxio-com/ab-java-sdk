/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreateSubscriptionRequest type.
 */
public class CreateSubscriptionRequest {
    private CreateSubscription subscription;

    /**
     * Default constructor.
     */
    public CreateSubscriptionRequest() {
    }

    /**
     * Initialization constructor.
     * @param  subscription  CreateSubscription value for subscription.
     */
    public CreateSubscriptionRequest(
            CreateSubscription subscription) {
        this.subscription = subscription;
    }

    /**
     * Getter for Subscription.
     * @return Returns the CreateSubscription
     */
    @JsonGetter("subscription")
    public CreateSubscription getSubscription() {
        return subscription;
    }

    /**
     * Setter for Subscription.
     * @param subscription Value for CreateSubscription
     */
    @JsonSetter("subscription")
    public void setSubscription(CreateSubscription subscription) {
        this.subscription = subscription;
    }

    /**
     * Converts this CreateSubscriptionRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateSubscriptionRequest [" + "subscription=" + subscription + "]";
    }

    /**
     * Builds a new {@link CreateSubscriptionRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateSubscriptionRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscription);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateSubscriptionRequest}.
     */
    public static class Builder {
        private CreateSubscription subscription;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  subscription  CreateSubscription value for subscription.
         */
        public Builder(CreateSubscription subscription) {
            this.subscription = subscription;
        }

        /**
         * Setter for subscription.
         * @param  subscription  CreateSubscription value for subscription.
         * @return Builder
         */
        public Builder subscription(CreateSubscription subscription) {
            this.subscription = subscription;
            return this;
        }

        /**
         * Builds a new {@link CreateSubscriptionRequest} object using the set fields.
         * @return {@link CreateSubscriptionRequest}
         */
        public CreateSubscriptionRequest build() {
            return new CreateSubscriptionRequest(subscription);
        }
    }
}
