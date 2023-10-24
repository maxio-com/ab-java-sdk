/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.CustomerError;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for CustomersJson422ErrorException type.
 */
public class CustomersJson422ErrorException extends ApiException {
    private static final long serialVersionUID = 129112003262932050L;
    private CustomerError errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public CustomersJson422ErrorException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * @return Returns the CustomerError
     */
    @JsonGetter("errors")
    public CustomerError getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for CustomerError
     */
    @JsonSetter("errors")
    private void setErrors(CustomerError errors) {
        this.errors = errors;
    }
}
