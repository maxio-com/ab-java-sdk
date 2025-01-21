/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.SubscriptionGroupCreateErrorResponseErrors;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for SubscriptionGroupCreateErrorResponseException type.
 */
public class SubscriptionGroupCreateErrorResponseException extends ApiException {
    private static final long serialVersionUID = -111296046900054378L;
    private SubscriptionGroupCreateErrorResponseErrors errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public SubscriptionGroupCreateErrorResponseException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * @return Returns the SubscriptionGroupCreateErrorResponseErrors
     */
    @JsonGetter("errors")
    public SubscriptionGroupCreateErrorResponseErrors getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for SubscriptionGroupCreateErrorResponseErrors
     */
    @JsonSetter("errors")
    private void setErrors(SubscriptionGroupCreateErrorResponseErrors errors) {
        this.errors = errors;
    }

    /**
     * Converts this SubscriptionGroupCreateErrorResponseException into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupCreateErrorResponseException [" + "statusCode=" + getResponseCode()
                + ", message=" + getMessage() + ", errors=" + errors + "]";
    }
}
