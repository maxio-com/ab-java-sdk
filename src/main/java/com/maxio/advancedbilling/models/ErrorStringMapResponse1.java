/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.Map;

/**
 * This is a model class for ErrorStringMapResponse1 type.
 */
public class ErrorStringMapResponse1
        extends BaseModel {
    private Map<String, String> errors;

    /**
     * Default constructor.
     */
    public ErrorStringMapResponse1() {
    }

    /**
     * Initialization constructor.
     * @param  errors  Map of String, value for errors.
     */
    public ErrorStringMapResponse1(
            Map<String, String> errors) {
        this.errors = errors;
    }

    /**
     * Getter for Errors.
     * @return Returns the Map of String, String
     */
    @JsonGetter("errors")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, String> getErrors() {
        return errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for Map of String, String
     */
    @JsonSetter("errors")
    public void setErrors(Map<String, String> errors) {
        this.errors = errors;
    }

    /**
     * Converts this ErrorStringMapResponse1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ErrorStringMapResponse1 [" + "errors=" + errors + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ErrorStringMapResponse1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ErrorStringMapResponse1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .errors(getErrors());
        return builder;
    }

    /**
     * Class to build instances of {@link ErrorStringMapResponse1}.
     */
    public static class Builder {
        private Map<String, String> errors;



        /**
         * Setter for errors.
         * @param  errors  Map of String, value for errors.
         * @return Builder
         */
        public Builder errors(Map<String, String> errors) {
            this.errors = errors;
            return this;
        }

        /**
         * Builds a new {@link ErrorStringMapResponse1} object using the set fields.
         * @return {@link ErrorStringMapResponse1}
         */
        public ErrorStringMapResponse1 build() {
            return new ErrorStringMapResponse1(errors);
        }
    }
}
