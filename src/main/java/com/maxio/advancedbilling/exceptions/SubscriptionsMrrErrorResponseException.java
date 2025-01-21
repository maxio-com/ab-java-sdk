/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.AttributeError;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for SubscriptionsMrrErrorResponseException type.
 */
public class SubscriptionsMrrErrorResponseException extends ApiException {
    private static final long serialVersionUID = 98591576532205777L;
    private AttributeError errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public SubscriptionsMrrErrorResponseException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * @return Returns the AttributeError
     */
    @JsonGetter("errors")
    public AttributeError getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for AttributeError
     */
    @JsonSetter("errors")
    private void setErrors(AttributeError errors) {
        this.errors = errors;
    }

    /**
     * Converts this SubscriptionsMrrErrorResponseException into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionsMrrErrorResponseException [" + "statusCode=" + getResponseCode()
                + ", message=" + getMessage() + ", errors=" + errors + "]";
    }
}
