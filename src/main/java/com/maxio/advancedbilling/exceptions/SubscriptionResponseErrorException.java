/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.Subscription;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for SubscriptionResponseErrorException type.
 */
public class SubscriptionResponseErrorException extends ApiException {
    private static final long serialVersionUID = -53087963905887759L;
    private Subscription subscription;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public SubscriptionResponseErrorException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Subscription.
     * @return Returns the Subscription
     */
    @JsonGetter("subscription")
    public Subscription getSubscription() {
        return this.subscription;
    }

    /**
     * Setter for Subscription.
     * @param subscription Value for Subscription
     */
    @JsonSetter("subscription")
    private void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    /**
     * Converts this SubscriptionResponseErrorException into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionResponseErrorException [" + "statusCode=" + getResponseCode()
                + ", message=" + getMessage() + ", subscription=" + subscription + "]";
    }
}
