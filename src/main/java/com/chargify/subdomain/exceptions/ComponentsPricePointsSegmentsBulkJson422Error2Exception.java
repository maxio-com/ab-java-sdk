/*
 * MaxioAdvancedBillingFormerlyChargifyAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.chargify.subdomain.exceptions;

import com.chargify.subdomain.models.Errors13;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for ComponentsPricePointsSegmentsBulkJson422Error2Exception type.
 */
public class ComponentsPricePointsSegmentsBulkJson422Error2Exception extends ApiException {
    private static final long serialVersionUID = 40340147722720530L;
    private Errors13 errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public ComponentsPricePointsSegmentsBulkJson422Error2Exception(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * @return Returns the Errors13
     */
    @JsonGetter("errors")
    public Errors13 getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for Errors13
     */
    @JsonSetter("errors")
    private void setErrors(Errors13 errors) {
        this.errors = errors;
    }
}
