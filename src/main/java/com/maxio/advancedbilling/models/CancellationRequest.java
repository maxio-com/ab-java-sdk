/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CancellationRequest type.
 */
public class CancellationRequest {
    private CancellationOptions subscription;

    /**
     * Default constructor.
     */
    public CancellationRequest() {
    }

    /**
     * Initialization constructor.
     * @param  subscription  CancellationOptions value for subscription.
     */
    public CancellationRequest(
            CancellationOptions subscription) {
        this.subscription = subscription;
    }

    /**
     * Getter for Subscription.
     * @return Returns the CancellationOptions
     */
    @JsonGetter("subscription")
    public CancellationOptions getSubscription() {
        return subscription;
    }

    /**
     * Setter for Subscription.
     * @param subscription Value for CancellationOptions
     */
    @JsonSetter("subscription")
    public void setSubscription(CancellationOptions subscription) {
        this.subscription = subscription;
    }

    /**
     * Converts this CancellationRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CancellationRequest [" + "subscription=" + subscription + "]";
    }

    /**
     * Builds a new {@link CancellationRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CancellationRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscription);
        return builder;
    }

    /**
     * Class to build instances of {@link CancellationRequest}.
     */
    public static class Builder {
        private CancellationOptions subscription;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  subscription  CancellationOptions value for subscription.
         */
        public Builder(CancellationOptions subscription) {
            this.subscription = subscription;
        }

        /**
         * Setter for subscription.
         * @param  subscription  CancellationOptions value for subscription.
         * @return Builder
         */
        public Builder subscription(CancellationOptions subscription) {
            this.subscription = subscription;
            return this;
        }

        /**
         * Builds a new {@link CancellationRequest} object using the set fields.
         * @return {@link CancellationRequest}
         */
        public CancellationRequest build() {
            return new CancellationRequest(subscription);
        }
    }
}
