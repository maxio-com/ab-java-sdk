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
 * This is a model class for CustomerCustomFieldsChange type.
 */
public class CustomerCustomFieldsChange {
    private List<ProformaCustomField> before;
    private List<ProformaCustomField> after;

    /**
     * Default constructor.
     */
    public CustomerCustomFieldsChange() {
    }

    /**
     * Initialization constructor.
     * @param  before  List of ProformaCustomField value for before.
     * @param  after  List of ProformaCustomField value for after.
     */
    public CustomerCustomFieldsChange(
            List<ProformaCustomField> before,
            List<ProformaCustomField> after) {
        this.before = before;
        this.after = after;
    }

    /**
     * Getter for Before.
     * @return Returns the List of ProformaCustomField
     */
    @JsonGetter("before")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ProformaCustomField> getBefore() {
        return before;
    }

    /**
     * Setter for Before.
     * @param before Value for List of ProformaCustomField
     */
    @JsonSetter("before")
    public void setBefore(List<ProformaCustomField> before) {
        this.before = before;
    }

    /**
     * Getter for After.
     * @return Returns the List of ProformaCustomField
     */
    @JsonGetter("after")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ProformaCustomField> getAfter() {
        return after;
    }

    /**
     * Setter for After.
     * @param after Value for List of ProformaCustomField
     */
    @JsonSetter("after")
    public void setAfter(List<ProformaCustomField> after) {
        this.after = after;
    }

    /**
     * Converts this CustomerCustomFieldsChange into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomerCustomFieldsChange [" + "before=" + before + ", after=" + after + "]";
    }

    /**
     * Builds a new {@link CustomerCustomFieldsChange.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomerCustomFieldsChange.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .before(getBefore())
                .after(getAfter());
        return builder;
    }

    /**
     * Class to build instances of {@link CustomerCustomFieldsChange}.
     */
    public static class Builder {
        private List<ProformaCustomField> before;
        private List<ProformaCustomField> after;



        /**
         * Setter for before.
         * @param  before  List of ProformaCustomField value for before.
         * @return Builder
         */
        public Builder before(List<ProformaCustomField> before) {
            this.before = before;
            return this;
        }

        /**
         * Setter for after.
         * @param  after  List of ProformaCustomField value for after.
         * @return Builder
         */
        public Builder after(List<ProformaCustomField> after) {
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
