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
 * This is a model class for ProformaError type.
 */
public class ProformaError {
    private BaseStringError subscription;

    /**
     * Default constructor.
     */
    public ProformaError() {
    }

    /**
     * Initialization constructor.
     * @param  subscription  BaseStringError value for subscription.
     */
    public ProformaError(
            BaseStringError subscription) {
        this.subscription = subscription;
    }

    /**
     * Getter for Subscription.
     * The error is base if it is not directly associated with a single attribute.
     * @return Returns the BaseStringError
     */
    @JsonGetter("subscription")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BaseStringError getSubscription() {
        return subscription;
    }

    /**
     * Setter for Subscription.
     * The error is base if it is not directly associated with a single attribute.
     * @param subscription Value for BaseStringError
     */
    @JsonSetter("subscription")
    public void setSubscription(BaseStringError subscription) {
        this.subscription = subscription;
    }

    /**
     * Converts this ProformaError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProformaError [" + "subscription=" + subscription + "]";
    }

    /**
     * Builds a new {@link ProformaError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProformaError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .subscription(getSubscription());
        return builder;
    }

    /**
     * Class to build instances of {@link ProformaError}.
     */
    public static class Builder {
        private BaseStringError subscription;



        /**
         * Setter for subscription.
         * @param  subscription  BaseStringError value for subscription.
         * @return Builder
         */
        public Builder subscription(BaseStringError subscription) {
            this.subscription = subscription;
            return this;
        }

        /**
         * Builds a new {@link ProformaError} object using the set fields.
         * @return {@link ProformaError}
         */
        public ProformaError build() {
            return new ProformaError(subscription);
        }
    }
}
