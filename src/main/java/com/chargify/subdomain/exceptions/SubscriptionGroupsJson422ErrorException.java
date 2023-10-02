/*
 * MaxioAdvancedBillingFormerlyChargifyAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.chargify.subdomain.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for SubscriptionGroupsJson422ErrorException type.
 */
public class SubscriptionGroupsJson422ErrorException extends ApiException {
    private static final long serialVersionUID = -11823217012561525L;
    private String errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public SubscriptionGroupsJson422ErrorException(String reason, Context context) {
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
