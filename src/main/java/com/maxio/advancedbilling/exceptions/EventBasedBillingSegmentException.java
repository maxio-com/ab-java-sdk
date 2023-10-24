/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.EventBasedBillingSegmentError;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for EventBasedBillingSegmentException type.
 */
public class EventBasedBillingSegmentException extends ApiException {
    private static final long serialVersionUID = 89819017052404877L;
    private EventBasedBillingSegmentError errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public EventBasedBillingSegmentException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * @return Returns the EventBasedBillingSegmentError
     */
    @JsonGetter("errors")
    public EventBasedBillingSegmentError getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for EventBasedBillingSegmentError
     */
    @JsonSetter("errors")
    private void setErrors(EventBasedBillingSegmentError errors) {
        this.errors = errors;
    }
}
