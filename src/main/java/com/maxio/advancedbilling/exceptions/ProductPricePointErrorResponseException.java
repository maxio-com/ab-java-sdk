/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.ProductPricePointErrors;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for ProductPricePointErrorResponseException type.
 */
public class ProductPricePointErrorResponseException extends ApiException {
    private static final long serialVersionUID = -58754930854777035L;
    private ProductPricePointErrors errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public ProductPricePointErrorResponseException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * @return Returns the ProductPricePointErrors
     */
    @JsonGetter("errors")
    public ProductPricePointErrors getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for ProductPricePointErrors
     */
    @JsonSetter("errors")
    private void setErrors(ProductPricePointErrors errors) {
        this.errors = errors;
    }
}
