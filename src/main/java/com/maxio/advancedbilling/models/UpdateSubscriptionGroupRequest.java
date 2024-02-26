/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UpdateSubscriptionGroupRequest type.
 */
public class UpdateSubscriptionGroupRequest {
    private UpdateSubscriptionGroup subscriptionGroup;

    /**
     * Default constructor.
     */
    public UpdateSubscriptionGroupRequest() {
    }

    /**
     * Initialization constructor.
     * @param  subscriptionGroup  UpdateSubscriptionGroup value for subscriptionGroup.
     */
    public UpdateSubscriptionGroupRequest(
            UpdateSubscriptionGroup subscriptionGroup) {
        this.subscriptionGroup = subscriptionGroup;
    }

    /**
     * Getter for SubscriptionGroup.
     * @return Returns the UpdateSubscriptionGroup
     */
    @JsonGetter("subscription_group")
    public UpdateSubscriptionGroup getSubscriptionGroup() {
        return subscriptionGroup;
    }

    /**
     * Setter for SubscriptionGroup.
     * @param subscriptionGroup Value for UpdateSubscriptionGroup
     */
    @JsonSetter("subscription_group")
    public void setSubscriptionGroup(UpdateSubscriptionGroup subscriptionGroup) {
        this.subscriptionGroup = subscriptionGroup;
    }

    /**
     * Converts this UpdateSubscriptionGroupRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateSubscriptionGroupRequest [" + "subscriptionGroup=" + subscriptionGroup + "]";
    }

    /**
     * Builds a new {@link UpdateSubscriptionGroupRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateSubscriptionGroupRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscriptionGroup);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateSubscriptionGroupRequest}.
     */
    public static class Builder {
        private UpdateSubscriptionGroup subscriptionGroup;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  subscriptionGroup  UpdateSubscriptionGroup value for subscriptionGroup.
         */
        public Builder(UpdateSubscriptionGroup subscriptionGroup) {
            this.subscriptionGroup = subscriptionGroup;
        }

        /**
         * Setter for subscriptionGroup.
         * @param  subscriptionGroup  UpdateSubscriptionGroup value for subscriptionGroup.
         * @return Builder
         */
        public Builder subscriptionGroup(UpdateSubscriptionGroup subscriptionGroup) {
            this.subscriptionGroup = subscriptionGroup;
            return this;
        }

        /**
         * Builds a new {@link UpdateSubscriptionGroupRequest} object using the set fields.
         * @return {@link UpdateSubscriptionGroupRequest}
         */
        public UpdateSubscriptionGroupRequest build() {
            return new UpdateSubscriptionGroupRequest(subscriptionGroup);
        }
    }
}
