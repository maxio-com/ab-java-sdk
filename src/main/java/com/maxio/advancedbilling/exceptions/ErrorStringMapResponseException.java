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
 * This is a model class for ErrorStringMapResponseException type.
 */
public class ErrorStringMapResponseException extends ApiException {
    private static final long serialVersionUID = -8296088403807431L;
    private Map<String, String> errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public ErrorStringMapResponseException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * @return Returns the Map of String, String
     */
    @JsonGetter("errors")
    public Map<String, String> getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for Map of String, String
     */
    @JsonSetter("errors")
    private void setErrors(Map<String, String> errors) {
        this.errors = errors;
    }

    /**
     * Converts this ErrorStringMapResponseException into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ErrorStringMapResponseException [" + "statusCode=" + getResponseCode()
                + ", message=" + getMessage() + ", errors=" + errors + "]";
    }
}
