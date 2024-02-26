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
 * This is a model class for CreateMetadata type.
 */
public class CreateMetadata {
    private String name;
    private String value;

    /**
     * Default constructor.
     */
    public CreateMetadata() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  value  String value for value.
     */
    public CreateMetadata(
            String name,
            String value) {
        this.name = name;
        this.value = value;
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
     * Converts this CreateMetadata into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateMetadata [" + "name=" + name + ", value=" + value + "]";
    }

    /**
     * Builds a new {@link CreateMetadata.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateMetadata.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .value(getValue());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateMetadata}.
     */
    public static class Builder {
        private String name;
        private String value;



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
         * Builds a new {@link CreateMetadata} object using the set fields.
         * @return {@link CreateMetadata}
         */
        public CreateMetadata build() {
            return new CreateMetadata(name, value);
        }
    }
}
