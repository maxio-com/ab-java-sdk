/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for CustomerCustomFieldsChange type.
 */
public class CustomerCustomFieldsChange
        extends BaseModel {
    private List<InvoiceCustomField> before;
    private List<InvoiceCustomField> after;

    /**
     * Default constructor.
     */
    public CustomerCustomFieldsChange() {
    }

    /**
     * Initialization constructor.
     * @param  before  List of InvoiceCustomField value for before.
     * @param  after  List of InvoiceCustomField value for after.
     */
    public CustomerCustomFieldsChange(
            List<InvoiceCustomField> before,
            List<InvoiceCustomField> after) {
        this.before = before;
        this.after = after;
    }

    /**
     * Getter for Before.
     * @return Returns the List of InvoiceCustomField
     */
    @JsonGetter("before")
    public List<InvoiceCustomField> getBefore() {
        return before;
    }

    /**
     * Setter for Before.
     * @param before Value for List of InvoiceCustomField
     */
    @JsonSetter("before")
    public void setBefore(List<InvoiceCustomField> before) {
        this.before = before;
    }

    /**
     * Getter for After.
     * @return Returns the List of InvoiceCustomField
     */
    @JsonGetter("after")
    public List<InvoiceCustomField> getAfter() {
        return after;
    }

    /**
     * Setter for After.
     * @param after Value for List of InvoiceCustomField
     */
    @JsonSetter("after")
    public void setAfter(List<InvoiceCustomField> after) {
        this.after = after;
    }

    /**
     * Converts this CustomerCustomFieldsChange into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomerCustomFieldsChange [" + "before=" + before + ", after=" + after
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(before, after);
        return builder;
    }

    /**
     * Class to build instances of {@link CustomerCustomFieldsChange}.
     */
    public static class Builder {
        private List<InvoiceCustomField> before;
        private List<InvoiceCustomField> after;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  before  List of InvoiceCustomField value for before.
         * @param  after  List of InvoiceCustomField value for after.
         */
        public Builder(List<InvoiceCustomField> before, List<InvoiceCustomField> after) {
            this.before = before;
            this.after = after;
        }

        /**
         * Setter for before.
         * @param  before  List of InvoiceCustomField value for before.
         * @return Builder
         */
        public Builder before(List<InvoiceCustomField> before) {
            this.before = before;
            return this;
        }

        /**
         * Setter for after.
         * @param  after  List of InvoiceCustomField value for after.
         * @return Builder
         */
        public Builder after(List<InvoiceCustomField> after) {
            this.after = after;
            return this;
        }

        /**
         * Builds a new {@link CustomerCustomFieldsChange} object using the set fields.
         * @return {@link CustomerCustomFieldsChange}
         */
        public CustomerCustomFieldsChange build() {
            return new CustomerCustomFieldsChange(before, after);
        }
    }
}
