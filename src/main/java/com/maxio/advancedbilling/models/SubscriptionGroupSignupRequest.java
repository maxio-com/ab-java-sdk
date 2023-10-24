/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SubscriptionGroupSignupRequest type.
 */
public class SubscriptionGroupSignupRequest {
    private SubscriptionGroupSignup subscriptionGroup;

    /**
     * Default constructor.
     */
    public SubscriptionGroupSignupRequest() {
    }

    /**
     * Initialization constructor.
     * @param  subscriptionGroup  SubscriptionGroupSignup value for subscriptionGroup.
     */
    public SubscriptionGroupSignupRequest(
            SubscriptionGroupSignup subscriptionGroup) {
        this.subscriptionGroup = subscriptionGroup;
    }

    /**
     * Getter for SubscriptionGroup.
     * @return Returns the SubscriptionGroupSignup
     */
    @JsonGetter("subscription_group")
    public SubscriptionGroupSignup getSubscriptionGroup() {
        return subscriptionGroup;
    }

    /**
     * Setter for SubscriptionGroup.
     * @param subscriptionGroup Value for SubscriptionGroupSignup
     */
    @JsonSetter("subscription_group")
    public void setSubscriptionGroup(SubscriptionGroupSignup subscriptionGroup) {
        this.subscriptionGroup = subscriptionGroup;
    }

    /**
     * Converts this SubscriptionGroupSignupRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupSignupRequest [" + "subscriptionGroup=" + subscriptionGroup + "]";
    }

    /**
     * Builds a new {@link SubscriptionGroupSignupRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionGroupSignupRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscriptionGroup);
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupSignupRequest}.
     */
    public static class Builder {
        private SubscriptionGroupSignup subscriptionGroup;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  subscriptionGroup  SubscriptionGroupSignup value for subscriptionGroup.
         */
        public Builder(SubscriptionGroupSignup subscriptionGroup) {
            this.subscriptionGroup = subscriptionGroup;
        }

        /**
         * Setter for subscriptionGroup.
         * @param  subscriptionGroup  SubscriptionGroupSignup value for subscriptionGroup.
         * @return Builder
         */
        public Builder subscriptionGroup(SubscriptionGroupSignup subscriptionGroup) {
            this.subscriptionGroup = subscriptionGroup;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroupSignupRequest} object using the set fields.
         * @return {@link SubscriptionGroupSignupRequest}
         */
        public SubscriptionGroupSignupRequest build() {
            return new SubscriptionGroupSignupRequest(subscriptionGroup);
        }
    }
}
