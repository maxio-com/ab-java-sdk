/*
 * MaxioAdvancedBillingFormerlyChargifyAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.chargify.subdomain.exceptions;

import com.chargify.subdomain.models.Errors1;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for SubscriptionsActivateJson400ErrorException type.
 */
public class SubscriptionsActivateJson400ErrorException extends ApiException {
    private static final long serialVersionUID = -26866912022034224L;
    private Errors1 errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public SubscriptionsActivateJson400ErrorException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * @return Returns the Errors1
     */
    @JsonGetter("errors")
    public Errors1 getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for Errors1
     */
    @JsonSetter("errors")
    private void setErrors(Errors1 errors) {
        this.errors = errors;
    }
}
