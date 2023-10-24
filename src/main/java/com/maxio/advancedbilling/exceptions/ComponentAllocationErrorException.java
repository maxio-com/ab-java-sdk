/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.ComponentAllocationErrorItem;
import io.apimatic.coreinterfaces.http.Context;
import java.util.List;

/**
 * This is a model class for ComponentAllocationErrorException type.
 */
public class ComponentAllocationErrorException extends ApiException {
    private static final long serialVersionUID = -73494215843082120L;
    private List<ComponentAllocationErrorItem> errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public ComponentAllocationErrorException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * @return Returns the List of ComponentAllocationErrorItem
     */
    @JsonGetter("errors")
    public List<ComponentAllocationErrorItem> getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for List of ComponentAllocationErrorItem
     */
    @JsonSetter("errors")
    private void setErrors(List<ComponentAllocationErrorItem> errors) {
        this.errors = errors;
    }
}
