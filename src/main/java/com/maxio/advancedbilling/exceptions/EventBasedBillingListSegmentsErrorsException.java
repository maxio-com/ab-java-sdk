/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.Errors;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for EventBasedBillingListSegmentsErrorsException type.
 */
public class EventBasedBillingListSegmentsErrorsException extends ApiException {
    private static final long serialVersionUID = -31855400256883691L;
    private Errors errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public EventBasedBillingListSegmentsErrorsException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * @return Returns the Errors
     */
    @JsonGetter("errors")
    public Errors getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for Errors
     */
    @JsonSetter("errors")
    private void setErrors(Errors errors) {
        this.errors = errors;
    }
}
