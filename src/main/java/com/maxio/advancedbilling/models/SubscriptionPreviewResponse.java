/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SubscriptionPreviewResponse type.
 */
public class SubscriptionPreviewResponse {
    private SubscriptionPreview subscriptionPreview;

    /**
     * Default constructor.
     */
    public SubscriptionPreviewResponse() {
    }

    /**
     * Initialization constructor.
     * @param  subscriptionPreview  SubscriptionPreview value for subscriptionPreview.
     */
    public SubscriptionPreviewResponse(
            SubscriptionPreview subscriptionPreview) {
        this.subscriptionPreview = subscriptionPreview;
    }

    /**
     * Getter for SubscriptionPreview.
     * @return Returns the SubscriptionPreview
     */
    @JsonGetter("subscription_preview")
    public SubscriptionPreview getSubscriptionPreview() {
        return subscriptionPreview;
    }

    /**
     * Setter for SubscriptionPreview.
     * @param subscriptionPreview Value for SubscriptionPreview
     */
    @JsonSetter("subscription_preview")
    public void setSubscriptionPreview(SubscriptionPreview subscriptionPreview) {
        this.subscriptionPreview = subscriptionPreview;
    }

    /**
     * Converts this SubscriptionPreviewResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionPreviewResponse [" + "subscriptionPreview=" + subscriptionPreview + "]";
    }

    /**
     * Builds a new {@link SubscriptionPreviewResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionPreviewResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscriptionPreview);
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionPreviewResponse}.
     */
    public static class Builder {
        private SubscriptionPreview subscriptionPreview;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  subscriptionPreview  SubscriptionPreview value for subscriptionPreview.
         */
        public Builder(SubscriptionPreview subscriptionPreview) {
            this.subscriptionPreview = subscriptionPreview;
        }

        /**
         * Setter for subscriptionPreview.
         * @param  subscriptionPreview  SubscriptionPreview value for subscriptionPreview.
         * @return Builder
         */
        public Builder subscriptionPreview(SubscriptionPreview subscriptionPreview) {
            this.subscriptionPreview = subscriptionPreview;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionPreviewResponse} object using the set fields.
         * @return {@link SubscriptionPreviewResponse}
         */
        public SubscriptionPreviewResponse build() {
            return new SubscriptionPreviewResponse(subscriptionPreview);
        }
    }
}
