/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.ProformaError;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for ProformaBadRequestErrorResponseException type.
 */
public class ProformaBadRequestErrorResponseException extends ApiException {
    private static final long serialVersionUID = -7685181879160838L;
    private ProformaError errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public ProformaBadRequestErrorResponseException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * @return Returns the ProformaError
     */
    @JsonGetter("errors")
    public ProformaError getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for ProformaError
     */
    @JsonSetter("errors")
    private void setErrors(ProformaError errors) {
        this.errors = errors;
    }
}
