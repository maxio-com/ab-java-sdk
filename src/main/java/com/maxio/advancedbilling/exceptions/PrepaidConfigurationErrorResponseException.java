/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.PrepaidConfigurationErrorResponseErrors;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for PrepaidConfigurationErrorResponseException type.
 */
public class PrepaidConfigurationErrorResponseException extends ApiException {
    private static final long serialVersionUID = 101834158370112526L;
    private PrepaidConfigurationErrorResponseErrors errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public PrepaidConfigurationErrorResponseException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * @return Returns the PrepaidConfigurationErrorResponseErrors
     */
    @JsonGetter("errors")
    public PrepaidConfigurationErrorResponseErrors getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for PrepaidConfigurationErrorResponseErrors
     */
    @JsonSetter("errors")
    private void setErrors(PrepaidConfigurationErrorResponseErrors errors) {
        this.errors = errors;
    }
}
