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
 * This is a model class for NestedErrorResponseException type.
 */
public class NestedErrorResponseException extends ApiException {
    private static final long serialVersionUID = 59526871775305143L;
    private Map<String, Object> errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public NestedErrorResponseException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * @return Returns the Map of String, Object
     */
    @JsonGetter("errors")
    public Map<String, Object> getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for Map of String, Object
     */
    @JsonSetter("errors")
    private void setErrors(Map<String, Object> errors) {
        this.errors = errors;
    }
}
