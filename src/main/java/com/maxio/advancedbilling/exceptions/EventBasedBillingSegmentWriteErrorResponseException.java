/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.EventBasedBillingSegmentSingleError;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for EventBasedBillingSegmentWriteErrorResponseException type.
 */
public class EventBasedBillingSegmentWriteErrorResponseException extends ApiException {
    private static final long serialVersionUID = 25314913070504301L;
    private EventBasedBillingSegmentSingleError errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public EventBasedBillingSegmentWriteErrorResponseException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * The key of the object would be a number (an index in the request array) where the error
     * occurred. In the value object, the key represents the field and the value is an array with
     * error messages. In most cases, this object would contain just one key.
     * @return Returns the EventBasedBillingSegmentSingleError
     */
    @JsonGetter("errors")
    public EventBasedBillingSegmentSingleError getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * The key of the object would be a number (an index in the request array) where the error
     * occurred. In the value object, the key represents the field and the value is an array with
     * error messages. In most cases, this object would contain just one key.
     * @param errors Value for EventBasedBillingSegmentSingleError
     */
    @JsonSetter("errors")
    private void setErrors(EventBasedBillingSegmentSingleError errors) {
        this.errors = errors;
    }

    /**
     * Converts this EventBasedBillingSegmentWriteErrorResponseException into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EventBasedBillingSegmentWriteErrorResponseException [" + "statusCode="
                + getResponseCode() + ", message=" + getMessage() + ", errors=" + errors + "]";
    }
}
