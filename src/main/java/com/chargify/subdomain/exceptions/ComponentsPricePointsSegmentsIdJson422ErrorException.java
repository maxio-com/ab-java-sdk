/*
 * MaxioAdvancedBillingFormerlyChargifyAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.chargify.subdomain.exceptions;

import com.chargify.subdomain.models.Errors11;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for ComponentsPricePointsSegmentsIdJson422ErrorException type.
 */
public class ComponentsPricePointsSegmentsIdJson422ErrorException extends ApiException {
    private static final long serialVersionUID = -16507229188573295L;
    private Errors11 errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public ComponentsPricePointsSegmentsIdJson422ErrorException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * @return Returns the Errors11
     */
    @JsonGetter("errors")
    public Errors11 getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for Errors11
     */
    @JsonSetter("errors")
    private void setErrors(Errors11 errors) {
        this.errors = errors;
    }
}
