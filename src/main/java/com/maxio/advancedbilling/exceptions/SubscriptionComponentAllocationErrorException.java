/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.SubscriptionComponentAllocationErrorItem;
import io.apimatic.coreinterfaces.http.Context;
import java.util.List;

/**
 * This is a model class for SubscriptionComponentAllocationErrorException type.
 */
public class SubscriptionComponentAllocationErrorException extends ApiException {
    private static final long serialVersionUID = 33032245352135844L;
    private List<SubscriptionComponentAllocationErrorItem> errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public SubscriptionComponentAllocationErrorException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * @return Returns the List of SubscriptionComponentAllocationErrorItem
     */
    @JsonGetter("errors")
    public List<SubscriptionComponentAllocationErrorItem> getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for List of SubscriptionComponentAllocationErrorItem
     */
    @JsonSetter("errors")
    private void setErrors(List<SubscriptionComponentAllocationErrorItem> errors) {
        this.errors = errors;
    }
}
