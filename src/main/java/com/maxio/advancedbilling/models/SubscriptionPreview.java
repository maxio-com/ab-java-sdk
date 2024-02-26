/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SubscriptionPreview type.
 */
public class SubscriptionPreview {
    private BillingManifest currentBillingManifest;
    private BillingManifest nextBillingManifest;

    /**
     * Default constructor.
     */
    public SubscriptionPreview() {
    }

    /**
     * Initialization constructor.
     * @param  currentBillingManifest  BillingManifest value for currentBillingManifest.
     * @param  nextBillingManifest  BillingManifest value for nextBillingManifest.
     */
    public SubscriptionPreview(
            BillingManifest currentBillingManifest,
            BillingManifest nextBillingManifest) {
        this.currentBillingManifest = currentBillingManifest;
        this.nextBillingManifest = nextBillingManifest;
    }

    /**
     * Getter for CurrentBillingManifest.
     * @return Returns the BillingManifest
     */
    @JsonGetter("current_billing_manifest")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BillingManifest getCurrentBillingManifest() {
        return currentBillingManifest;
    }

    /**
     * Setter for CurrentBillingManifest.
     * @param currentBillingManifest Value for BillingManifest
     */
    @JsonSetter("current_billing_manifest")
    public void setCurrentBillingManifest(BillingManifest currentBillingManifest) {
        this.currentBillingManifest = currentBillingManifest;
    }

    /**
     * Getter for NextBillingManifest.
     * @return Returns the BillingManifest
     */
    @JsonGetter("next_billing_manifest")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BillingManifest getNextBillingManifest() {
        return nextBillingManifest;
    }

    /**
     * Setter for NextBillingManifest.
     * @param nextBillingManifest Value for BillingManifest
     */
    @JsonSetter("next_billing_manifest")
    public void setNextBillingManifest(BillingManifest nextBillingManifest) {
        this.nextBillingManifest = nextBillingManifest;
    }

    /**
     * Converts this SubscriptionPreview into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionPreview [" + "currentBillingManifest=" + currentBillingManifest
                + ", nextBillingManifest=" + nextBillingManifest + "]";
    }

    /**
     * Builds a new {@link SubscriptionPreview.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionPreview.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .currentBillingManifest(getCurrentBillingManifest())
                .nextBillingManifest(getNextBillingManifest());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionPreview}.
     */
    public static class Builder {
        private BillingManifest currentBillingManifest;
        private BillingManifest nextBillingManifest;



        /**
         * Setter for currentBillingManifest.
         * @param  currentBillingManifest  BillingManifest value for currentBillingManifest.
         * @return Builder
         */
        public Builder currentBillingManifest(BillingManifest currentBillingManifest) {
            this.currentBillingManifest = currentBillingManifest;
            return this;
        }

        /**
         * Setter for nextBillingManifest.
         * @param  nextBillingManifest  BillingManifest value for nextBillingManifest.
         * @return Builder
         */
        public Builder nextBillingManifest(BillingManifest nextBillingManifest) {
            this.nextBillingManifest = nextBillingManifest;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionPreview} object using the set fields.
         * @return {@link SubscriptionPreview}
         */
        public SubscriptionPreview build() {
            return new SubscriptionPreview(currentBillingManifest, nextBillingManifest);
        }
    }
}
