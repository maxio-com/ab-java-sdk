/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UpdateMetadata type.
 */
public class UpdateMetadata {
    private String currentName;
    private String name;
    private String value;

    /**
     * Default constructor.
     */
    public UpdateMetadata() {
    }

    /**
     * Initialization constructor.
     * @param  currentName  String value for currentName.
     * @param  name  String value for name.
     * @param  value  String value for value.
     */
    public UpdateMetadata(
            String currentName,
            String name,
            String value) {
        this.currentName = currentName;
        this.name = name;
        this.value = value;
    }

    /**
     * Getter for CurrentName.
     * @return Returns the String
     */
    @JsonGetter("current_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrentName() {
        return currentName;
    }

    /**
     * Setter for CurrentName.
     * @param currentName Value for String
     */
    @JsonSetter("current_name")
    public void setCurrentName(String currentName) {
        this.currentName = currentName;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Value.
     * @return Returns the String
     */
    @JsonGetter("value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * @param value Value for String
     */
    @JsonSetter("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Converts this UpdateMetadata into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateMetadata [" + "currentName=" + currentName + ", name=" + name + ", value="
                + value + "]";
    }

    /**
     * Builds a new {@link UpdateMetadata.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateMetadata.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .currentName(getCurrentName())
                .name(getName())
                .value(getValue());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateMetadata}.
     */
    public static class Builder {
        private String currentName;
        private String name;
        private String value;



        /**
         * Setter for currentName.
         * @param  currentName  String value for currentName.
         * @return Builder
         */
        public Builder currentName(String currentName) {
            this.currentName = currentName;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for value.
         * @param  value  String value for value.
         * @return Builder
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Builds a new {@link UpdateMetadata} object using the set fields.
         * @return {@link UpdateMetadata}
         */
        public UpdateMetadata build() {
            return new UpdateMetadata(currentName, name, value);
        }
    }
}
