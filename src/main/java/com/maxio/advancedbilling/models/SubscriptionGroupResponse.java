/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SubscriptionGroupResponse type.
 */
public class SubscriptionGroupResponse {
    private SubscriptionGroup subscriptionGroup;

    /**
     * Default constructor.
     */
    public SubscriptionGroupResponse() {
    }

    /**
     * Initialization constructor.
     * @param  subscriptionGroup  SubscriptionGroup value for subscriptionGroup.
     */
    public SubscriptionGroupResponse(
            SubscriptionGroup subscriptionGroup) {
        this.subscriptionGroup = subscriptionGroup;
    }

    /**
     * Getter for SubscriptionGroup.
     * @return Returns the SubscriptionGroup
     */
    @JsonGetter("subscription_group")
    public SubscriptionGroup getSubscriptionGroup() {
        return subscriptionGroup;
    }

    /**
     * Setter for SubscriptionGroup.
     * @param subscriptionGroup Value for SubscriptionGroup
     */
    @JsonSetter("subscription_group")
    public void setSubscriptionGroup(SubscriptionGroup subscriptionGroup) {
        this.subscriptionGroup = subscriptionGroup;
    }

    /**
     * Converts this SubscriptionGroupResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupResponse [" + "subscriptionGroup=" + subscriptionGroup + "]";
    }

    /**
     * Builds a new {@link SubscriptionGroupResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionGroupResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscriptionGroup);
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupResponse}.
     */
    public static class Builder {
        private SubscriptionGroup subscriptionGroup;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  subscriptionGroup  SubscriptionGroup value for subscriptionGroup.
         */
        public Builder(SubscriptionGroup subscriptionGroup) {
            this.subscriptionGroup = subscriptionGroup;
        }

        /**
         * Setter for subscriptionGroup.
         * @param  subscriptionGroup  SubscriptionGroup value for subscriptionGroup.
         * @return Builder
         */
        public Builder subscriptionGroup(SubscriptionGroup subscriptionGroup) {
            this.subscriptionGroup = subscriptionGroup;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroupResponse} object using the set fields.
         * @return {@link SubscriptionGroupResponse}
         */
        public SubscriptionGroupResponse build() {
            return new SubscriptionGroupResponse(subscriptionGroup);
        }
    }
}
