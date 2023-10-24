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
 * This is a model class for BaseRefundError type.
 */
public class BaseRefundError {
    private List<Object> base;

    /**
     * Default constructor.
     */
    public BaseRefundError() {
    }

    /**
     * Initialization constructor.
     * @param  base  List of Object value for base.
     */
    public BaseRefundError(
            List<Object> base) {
        this.base = base;
    }

    /**
     * Getter for Base.
     * @return Returns the List of Object
     */
    @JsonGetter("base")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Object> getBase() {
        return base;
    }

    /**
     * Setter for Base.
     * @param base Value for List of Object
     */
    @JsonSetter("base")
    public void setBase(List<Object> base) {
        this.base = base;
    }

    /**
     * Converts this BaseRefundError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BaseRefundError [" + "base=" + base + "]";
    }

    /**
     * Builds a new {@link BaseRefundError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BaseRefundError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .base(getBase());
        return builder;
    }

    /**
     * Class to build instances of {@link BaseRefundError}.
     */
    public static class Builder {
        private List<Object> base;



        /**
         * Setter for base.
         * @param  base  List of Object value for base.
         * @return Builder
         */
        public Builder base(List<Object> base) {
            this.base = base;
            return this;
        }

        /**
         * Builds a new {@link BaseRefundError} object using the set fields.
         * @return {@link BaseRefundError}
         */
        public BaseRefundError build() {
            return new BaseRefundError(base);
        }
    }
}
