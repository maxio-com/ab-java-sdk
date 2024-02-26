/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreateSubscriptionGroupRequest type.
 */
public class CreateSubscriptionGroupRequest {
    private CreateSubscriptionGroup subscriptionGroup;

    /**
     * Default constructor.
     */
    public CreateSubscriptionGroupRequest() {
    }

    /**
     * Initialization constructor.
     * @param  subscriptionGroup  CreateSubscriptionGroup value for subscriptionGroup.
     */
    public CreateSubscriptionGroupRequest(
            CreateSubscriptionGroup subscriptionGroup) {
        this.subscriptionGroup = subscriptionGroup;
    }

    /**
     * Getter for SubscriptionGroup.
     * @return Returns the CreateSubscriptionGroup
     */
    @JsonGetter("subscription_group")
    public CreateSubscriptionGroup getSubscriptionGroup() {
        return subscriptionGroup;
    }

    /**
     * Setter for SubscriptionGroup.
     * @param subscriptionGroup Value for CreateSubscriptionGroup
     */
    @JsonSetter("subscription_group")
    public void setSubscriptionGroup(CreateSubscriptionGroup subscriptionGroup) {
        this.subscriptionGroup = subscriptionGroup;
    }

    /**
     * Converts this CreateSubscriptionGroupRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateSubscriptionGroupRequest [" + "subscriptionGroup=" + subscriptionGroup + "]";
    }

    /**
     * Builds a new {@link CreateSubscriptionGroupRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateSubscriptionGroupRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscriptionGroup);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateSubscriptionGroupRequest}.
     */
    public static class Builder {
        private CreateSubscriptionGroup subscriptionGroup;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  subscriptionGroup  CreateSubscriptionGroup value for subscriptionGroup.
         */
        public Builder(CreateSubscriptionGroup subscriptionGroup) {
            this.subscriptionGroup = subscriptionGroup;
        }

        /**
         * Setter for subscriptionGroup.
         * @param  subscriptionGroup  CreateSubscriptionGroup value for subscriptionGroup.
         * @return Builder
         */
        public Builder subscriptionGroup(CreateSubscriptionGroup subscriptionGroup) {
            this.subscriptionGroup = subscriptionGroup;
            return this;
        }

        /**
         * Builds a new {@link CreateSubscriptionGroupRequest} object using the set fields.
         * @return {@link CreateSubscriptionGroupRequest}
         */
        public CreateSubscriptionGroupRequest build() {
            return new CreateSubscriptionGroupRequest(subscriptionGroup);
        }
    }
}
