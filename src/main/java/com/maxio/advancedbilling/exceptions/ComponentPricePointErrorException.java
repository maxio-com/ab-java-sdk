/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.ComponentPricePointErrorItem;
import io.apimatic.coreinterfaces.http.Context;
import java.util.List;

/**
 * This is a model class for ComponentPricePointErrorException type.
 */
public class ComponentPricePointErrorException extends ApiException {
    private static final long serialVersionUID = 57082567359613322L;
    private List<ComponentPricePointErrorItem> errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public ComponentPricePointErrorException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * @return Returns the List of ComponentPricePointErrorItem
     */
    @JsonGetter("errors")
    public List<ComponentPricePointErrorItem> getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for List of ComponentPricePointErrorItem
     */
    @JsonSetter("errors")
    private void setErrors(List<ComponentPricePointErrorItem> errors) {
        this.errors = errors;
    }
}
