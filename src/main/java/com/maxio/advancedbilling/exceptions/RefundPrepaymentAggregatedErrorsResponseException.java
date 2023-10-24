/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.RefundPrepaymentAggregatedError;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for RefundPrepaymentAggregatedErrorsResponseException type.
 */
public class RefundPrepaymentAggregatedErrorsResponseException extends ApiException {
    private static final long serialVersionUID = -83180220868429741L;
    private RefundPrepaymentAggregatedError errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public RefundPrepaymentAggregatedErrorsResponseException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * @return Returns the RefundPrepaymentAggregatedError
     */
    @JsonGetter("errors")
    public RefundPrepaymentAggregatedError getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for RefundPrepaymentAggregatedError
     */
    @JsonSetter("errors")
    private void setErrors(RefundPrepaymentAggregatedError errors) {
        this.errors = errors;
    }
}
