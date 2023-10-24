/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.RefundPrepaymentBaseRefundError;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for RefundPrepaymentBaseErrorsResponseException type.
 */
public class RefundPrepaymentBaseErrorsResponseException extends ApiException {
    private static final long serialVersionUID = 11097790563160369L;
    private RefundPrepaymentBaseRefundError errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public RefundPrepaymentBaseErrorsResponseException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * @return Returns the RefundPrepaymentBaseRefundError
     */
    @JsonGetter("errors")
    public RefundPrepaymentBaseRefundError getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for RefundPrepaymentBaseRefundError
     */
    @JsonSetter("errors")
    private void setErrors(RefundPrepaymentBaseRefundError errors) {
        this.errors = errors;
    }
}
