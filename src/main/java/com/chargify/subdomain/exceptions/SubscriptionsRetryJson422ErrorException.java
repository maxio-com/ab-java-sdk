/*
 * MaxioAdvancedBillingFormerlyChargifyAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.chargify.subdomain.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;
import java.util.List;

/**
 * This is a model class for SubscriptionsRetryJson422ErrorException type.
 */
public class SubscriptionsRetryJson422ErrorException extends ApiException {
    private static final long serialVersionUID = -99628155888051374L;
    private List<Object> errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public SubscriptionsRetryJson422ErrorException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * @return Returns the List of Object
     */
    @JsonGetter("errors")
    public List<Object> getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for List of Object
     */
    @JsonSetter("errors")
    private void setErrors(List<Object> errors) {
        this.errors = errors;
    }
}
