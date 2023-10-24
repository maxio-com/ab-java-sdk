/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;
import java.util.List;

/**
 * This is a model class for SubscriptionRemoveCouponErrorsException type.
 */
public class SubscriptionRemoveCouponErrorsException extends ApiException {
    private static final long serialVersionUID = 49532665515257296L;
    private List<String> subscription;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public SubscriptionRemoveCouponErrorsException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Subscription.
     * @return Returns the List of String
     */
    @JsonGetter("subscription")
    public List<String> getSubscription() {
        return this.subscription;
    }

    /**
     * Setter for Subscription.
     * @param subscription Value for List of String
     */
    @JsonSetter("subscription")
    private void setSubscription(List<String> subscription) {
        this.subscription = subscription;
    }
}
