/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for SingleStringErrorResponseException type.
 */
public class SingleStringErrorResponseException extends ApiException {
    private static final long serialVersionUID = -31768512097620212L;
    private String errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public SingleStringErrorResponseException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * @return Returns the String
     */
    @JsonGetter("errors")
    public String getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for String
     */
    @JsonSetter("errors")
    private void setErrors(String errors) {
        this.errors = errors;
    }
}
