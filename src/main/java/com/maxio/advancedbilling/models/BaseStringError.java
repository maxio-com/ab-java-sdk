/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for BaseStringError type.
 */
public class BaseStringError {
    private List<String> base;

    /**
     * Default constructor.
     */
    public BaseStringError() {
    }

    /**
     * Initialization constructor.
     * @param  base  List of String value for base.
     */
    public BaseStringError(
            List<String> base) {
        this.base = base;
    }

    /**
     * Getter for Base.
     * @return Returns the List of String
     */
    @JsonGetter("base")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getBase() {
        return base;
    }

    /**
     * Setter for Base.
     * @param base Value for List of String
     */
    @JsonSetter("base")
    public void setBase(List<String> base) {
        this.base = base;
    }

    /**
     * Converts this BaseStringError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BaseStringError [" + "base=" + base + "]";
    }

    /**
     * Builds a new {@link BaseStringError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BaseStringError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .base(getBase());
        return builder;
    }

    /**
     * Class to build instances of {@link BaseStringError}.
     */
    public static class Builder {
        private List<String> base;



        /**
         * Setter for base.
         * @param  base  List of String value for base.
         * @return Builder
         */
        public Builder base(List<String> base) {
            this.base = base;
            return this;
        }

        /**
         * Builds a new {@link BaseStringError} object using the set fields.
         * @return {@link BaseStringError}
         */
        public BaseStringError build() {
            return new BaseStringError(base);
        }
    }
}
