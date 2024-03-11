/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for SubscriptionGroupSingleError type.
 */
public class SubscriptionGroupSingleError
        extends BaseModel {
    private String subscriptionGroup;

    /**
     * Default constructor.
     */
    public SubscriptionGroupSingleError() {
    }

    /**
     * Initialization constructor.
     * @param  subscriptionGroup  String value for subscriptionGroup.
     */
    @JsonCreator
    public SubscriptionGroupSingleError(
            @JsonProperty("subscription_group") String subscriptionGroup) {
        this.subscriptionGroup = subscriptionGroup;
    }

    /**
     * Getter for SubscriptionGroup.
     * @return Returns the String
     */
    @JsonGetter("subscription_group")
    public String getSubscriptionGroup() {
        return subscriptionGroup;
    }

    /**
     * Setter for SubscriptionGroup.
     * @param subscriptionGroup Value for String
     */
    @JsonSetter("subscription_group")
    public void setSubscriptionGroup(String subscriptionGroup) {
        this.subscriptionGroup = subscriptionGroup;
    }

    /**
     * Converts this SubscriptionGroupSingleError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupSingleError [" + "subscriptionGroup=" + subscriptionGroup
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link SubscriptionGroupSingleError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionGroupSingleError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscriptionGroup);
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupSingleError}.
     */
    public static class Builder {
        private String subscriptionGroup;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  subscriptionGroup  String value for subscriptionGroup.
         */
        public Builder(String subscriptionGroup) {
            this.subscriptionGroup = subscriptionGroup;
        }

        /**
         * Setter for subscriptionGroup.
         * @param  subscriptionGroup  String value for subscriptionGroup.
         * @return Builder
         */
        public Builder subscriptionGroup(String subscriptionGroup) {
            this.subscriptionGroup = subscriptionGroup;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroupSingleError} object using the set fields.
         * @return {@link SubscriptionGroupSingleError}
         */
        public SubscriptionGroupSingleError build() {
            return new SubscriptionGroupSingleError(subscriptionGroup);
        }
    }
}
