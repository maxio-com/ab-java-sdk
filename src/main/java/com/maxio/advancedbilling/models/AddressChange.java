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
 * This is a model class for AddressChange type.
 */
public class AddressChange
        extends BaseModel {
    private InvoiceAddress before;
    private InvoiceAddress after;

    /**
     * Default constructor.
     */
    public AddressChange() {
    }

    /**
     * Initialization constructor.
     * @param  before  InvoiceAddress value for before.
     * @param  after  InvoiceAddress value for after.
     */
    @JsonCreator
    public AddressChange(
            @JsonProperty("before") InvoiceAddress before,
            @JsonProperty("after") InvoiceAddress after) {
        this.before = before;
        this.after = after;
    }

    /**
     * Getter for Before.
     * @return Returns the InvoiceAddress
     */
    @JsonGetter("before")
    public InvoiceAddress getBefore() {
        return before;
    }

    /**
     * Setter for Before.
     * @param before Value for InvoiceAddress
     */
    @JsonSetter("before")
    public void setBefore(InvoiceAddress before) {
        this.before = before;
    }

    /**
     * Getter for After.
     * @return Returns the InvoiceAddress
     */
    @JsonGetter("after")
    public InvoiceAddress getAfter() {
        return after;
    }

    /**
     * Setter for After.
     * @param after Value for InvoiceAddress
     */
    @JsonSetter("after")
    public void setAfter(InvoiceAddress after) {
        this.after = after;
    }

    /**
     * Converts this AddressChange into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AddressChange [" + "before=" + before + ", after=" + after
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link AddressChange.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AddressChange.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(before, after);
        return builder;
    }

    /**
     * Class to build instances of {@link AddressChange}.
     */
    public static class Builder {
        private InvoiceAddress before;
        private InvoiceAddress after;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  before  InvoiceAddress value for before.
         * @param  after  InvoiceAddress value for after.
         */
        public Builder(InvoiceAddress before, InvoiceAddress after) {
            this.before = before;
            this.after = after;
        }

        /**
         * Setter for before.
         * @param  before  InvoiceAddress value for before.
         * @return Builder
         */
        public Builder before(InvoiceAddress before) {
            this.before = before;
            return this;
        }

        /**
         * Setter for after.
         * @param  after  InvoiceAddress value for after.
         * @return Builder
         */
        public Builder after(InvoiceAddress after) {
            this.after = after;
            return this;
        }

        /**
         * Builds a new {@link AddressChange} object using the set fields.
         * @return {@link AddressChange}
         */
        public AddressChange build() {
            return new AddressChange(before, after);
        }
    }
}
