/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UpdateSubscriptionRequest type.
 */
public class UpdateSubscriptionRequest {
    private UpdateSubscription subscription;

    /**
     * Default constructor.
     */
    public UpdateSubscriptionRequest() {
    }

    /**
     * Initialization constructor.
     * @param  subscription  UpdateSubscription value for subscription.
     */
    public UpdateSubscriptionRequest(
            UpdateSubscription subscription) {
        this.subscription = subscription;
    }

    /**
     * Getter for Subscription.
     * @return Returns the UpdateSubscription
     */
    @JsonGetter("subscription")
    public UpdateSubscription getSubscription() {
        return subscription;
    }

    /**
     * Setter for Subscription.
     * @param subscription Value for UpdateSubscription
     */
    @JsonSetter("subscription")
    public void setSubscription(UpdateSubscription subscription) {
        this.subscription = subscription;
    }

    /**
     * Converts this UpdateSubscriptionRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateSubscriptionRequest [" + "subscription=" + subscription + "]";
    }

    /**
     * Builds a new {@link UpdateSubscriptionRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateSubscriptionRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscription);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateSubscriptionRequest}.
     */
    public static class Builder {
        private UpdateSubscription subscription;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  subscription  UpdateSubscription value for subscription.
         */
        public Builder(UpdateSubscription subscription) {
            this.subscription = subscription;
        }

        /**
         * Setter for subscription.
         * @param  subscription  UpdateSubscription value for subscription.
         * @return Builder
         */
        public Builder subscription(UpdateSubscription subscription) {
            this.subscription = subscription;
            return this;
        }

        /**
         * Builds a new {@link UpdateSubscriptionRequest} object using the set fields.
         * @return {@link UpdateSubscriptionRequest}
         */
        public UpdateSubscriptionRequest build() {
            return new UpdateSubscriptionRequest(subscription);
        }
    }
}
