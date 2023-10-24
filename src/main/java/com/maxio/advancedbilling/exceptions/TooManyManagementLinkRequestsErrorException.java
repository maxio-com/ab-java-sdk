/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.TooManyManagementLinkRequests;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for TooManyManagementLinkRequestsErrorException type.
 */
public class TooManyManagementLinkRequestsErrorException extends ApiException {
    private static final long serialVersionUID = 15607221051414665L;
    private TooManyManagementLinkRequests errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public TooManyManagementLinkRequestsErrorException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * @return Returns the TooManyManagementLinkRequests
     */
    @JsonGetter("errors")
    public TooManyManagementLinkRequests getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for TooManyManagementLinkRequests
     */
    @JsonSetter("errors")
    private void setErrors(TooManyManagementLinkRequests errors) {
        this.errors = errors;
    }
}
