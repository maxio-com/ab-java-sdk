/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.SubscriptionGroupUpdateError;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for SubscriptionGroupUpdateErrorResponseException type.
 */
public class SubscriptionGroupUpdateErrorResponseException extends ApiException {
    private static final long serialVersionUID = 39993912697449238L;
    private SubscriptionGroupUpdateError errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public SubscriptionGroupUpdateErrorResponseException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * @return Returns the SubscriptionGroupUpdateError
     */
    @JsonGetter("errors")
    public SubscriptionGroupUpdateError getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for SubscriptionGroupUpdateError
     */
    @JsonSetter("errors")
    private void setErrors(SubscriptionGroupUpdateError errors) {
        this.errors = errors;
    }
}
