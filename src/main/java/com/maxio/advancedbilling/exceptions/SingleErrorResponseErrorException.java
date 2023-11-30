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
 * This is a model class for SingleErrorResponseErrorException type.
 */
public class SingleErrorResponseErrorException extends ApiException {
    private static final long serialVersionUID = -33656825763779007L;
    private String error;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public SingleErrorResponseErrorException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Error.
     * @return Returns the String
     */
    @JsonGetter("error")
    public String getError() {
        return this.error;
    }

    /**
     * Setter for Error.
     * @param error Value for String
     */
    @JsonSetter("error")
    private void setError(String error) {
        this.error = error;
    }
}
