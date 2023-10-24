/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for SubscriptionMRRResponse type.
 */
public class SubscriptionMRRResponse {
    private List<SubscriptionMRR> subscriptionsMrr;

    /**
     * Default constructor.
     */
    public SubscriptionMRRResponse() {
    }

    /**
     * Initialization constructor.
     * @param  subscriptionsMrr  List of SubscriptionMRR value for subscriptionsMrr.
     */
    public SubscriptionMRRResponse(
            List<SubscriptionMRR> subscriptionsMrr) {
        this.subscriptionsMrr = subscriptionsMrr;
    }

    /**
     * Getter for SubscriptionsMrr.
     * @return Returns the List of SubscriptionMRR
     */
    @JsonGetter("subscriptions_mrr")
    public List<SubscriptionMRR> getSubscriptionsMrr() {
        return subscriptionsMrr;
    }

    /**
     * Setter for SubscriptionsMrr.
     * @param subscriptionsMrr Value for List of SubscriptionMRR
     */
    @JsonSetter("subscriptions_mrr")
    public void setSubscriptionsMrr(List<SubscriptionMRR> subscriptionsMrr) {
        this.subscriptionsMrr = subscriptionsMrr;
    }

    /**
     * Converts this SubscriptionMRRResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionMRRResponse [" + "subscriptionsMrr=" + subscriptionsMrr + "]";
    }

    /**
     * Builds a new {@link SubscriptionMRRResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionMRRResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscriptionsMrr);
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionMRRResponse}.
     */
    public static class Builder {
        private List<SubscriptionMRR> subscriptionsMrr;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  subscriptionsMrr  List of SubscriptionMRR value for subscriptionsMrr.
         */
        public Builder(List<SubscriptionMRR> subscriptionsMrr) {
            this.subscriptionsMrr = subscriptionsMrr;
        }

        /**
         * Setter for subscriptionsMrr.
         * @param  subscriptionsMrr  List of SubscriptionMRR value for subscriptionsMrr.
         * @return Builder
         */
        public Builder subscriptionsMrr(List<SubscriptionMRR> subscriptionsMrr) {
            this.subscriptionsMrr = subscriptionsMrr;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionMRRResponse} object using the set fields.
         * @return {@link SubscriptionMRRResponse}
         */
        public SubscriptionMRRResponse build() {
            return new SubscriptionMRRResponse(subscriptionsMrr);
        }
    }
}
