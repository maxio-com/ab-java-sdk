/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;
import java.util.Map;

/**
 * This is a model class for EventBasedBillingSegmentErrorsException type.
 */
public class EventBasedBillingSegmentErrorsException extends ApiException {
    private static final long serialVersionUID = 18296201083542039L;
    private Map<String, Object> errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public EventBasedBillingSegmentErrorsException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * The key of the object would be a number (an index in the request array) where the error
     * occurred. In the value object, the key represents the field and the value is an array with
     * error messages. In most cases, this object would contain just one key.
     * @return Returns the Map of String, Object
     */
    @JsonGetter("errors")
    public Map<String, Object> getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * The key of the object would be a number (an index in the request array) where the error
     * occurred. In the value object, the key represents the field and the value is an array with
     * error messages. In most cases, this object would contain just one key.
     * @param errors Value for Map of String, Object
     */
    @JsonSetter("errors")
    private void setErrors(Map<String, Object> errors) {
        this.errors = errors;
    }
}
