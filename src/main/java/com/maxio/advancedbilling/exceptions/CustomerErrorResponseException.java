/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.CustomerErrorResponseErrors;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for CustomerErrorResponseException type.
 */
public class CustomerErrorResponseException extends ApiException {
    private static final long serialVersionUID = -18428866054026842L;
    private CustomerErrorResponseErrors errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public CustomerErrorResponseException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * @return Returns the CustomerErrorResponseErrors
     */
    @JsonGetter("errors")
    public CustomerErrorResponseErrors getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for CustomerErrorResponseErrors
     */
    @JsonSetter("errors")
    private void setErrors(CustomerErrorResponseErrors errors) {
        this.errors = errors;
    }
}
