/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for CustomerPayerChange type.
 */
public class CustomerPayerChange
        extends BaseModel {
    private InvoicePayerChange before;
    private InvoicePayerChange after;

    /**
     * Default constructor.
     */
    public CustomerPayerChange() {
    }

    /**
     * Initialization constructor.
     * @param  before  InvoicePayerChange value for before.
     * @param  after  InvoicePayerChange value for after.
     */
    @JsonCreator
    public CustomerPayerChange(
            @JsonProperty("before") InvoicePayerChange before,
            @JsonProperty("after") InvoicePayerChange after) {
        this.before = before;
        this.after = after;
    }

    /**
     * Getter for Before.
     * @return Returns the InvoicePayerChange
     */
    @JsonGetter("before")
    public InvoicePayerChange getBefore() {
        return before;
    }

    /**
     * Setter for Before.
     * @param before Value for InvoicePayerChange
     */
    @JsonSetter("before")
    public void setBefore(InvoicePayerChange before) {
        this.before = before;
    }

    /**
     * Getter for After.
     * @return Returns the InvoicePayerChange
     */
    @JsonGetter("after")
    public InvoicePayerChange getAfter() {
        return after;
    }

    /**
     * Setter for After.
     * @param after Value for InvoicePayerChange
     */
    @JsonSetter("after")
    public void setAfter(InvoicePayerChange after) {
        this.after = after;
    }

    /**
     * Converts this CustomerPayerChange into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomerPayerChange [" + "before=" + before + ", after=" + after
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CustomerPayerChange.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomerPayerChange.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(before, after);
        return builder;
    }

    /**
     * Class to build instances of {@link CustomerPayerChange}.
     */
    public static class Builder {
        private InvoicePayerChange before;
        private InvoicePayerChange after;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  before  InvoicePayerChange value for before.
         * @param  after  InvoicePayerChange value for after.
         */
        public Builder(InvoicePayerChange before, InvoicePayerChange after) {
            this.before = before;
            this.after = after;
        }

        /**
         * Setter for before.
         * @param  before  InvoicePayerChange value for before.
         * @return Builder
         */
        public Builder before(InvoicePayerChange before) {
            this.before = before;
            return this;
        }

        /**
         * Setter for after.
         * @param  after  InvoicePayerChange value for after.
         * @return Builder
         */
        public Builder after(InvoicePayerChange after) {
            this.after = after;
            return this;
        }

        /**
         * Builds a new {@link CustomerPayerChange} object using the set fields.
         * @return {@link CustomerPayerChange}
         */
        public CustomerPayerChange build() {
            return new CustomerPayerChange(before, after);
        }
    }
}
