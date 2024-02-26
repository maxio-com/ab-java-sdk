/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for AttributeError type.
 */
public class AttributeError {
    private List<String> attribute;

    /**
     * Default constructor.
     */
    public AttributeError() {
    }

    /**
     * Initialization constructor.
     * @param  attribute  List of String value for attribute.
     */
    public AttributeError(
            List<String> attribute) {
        this.attribute = attribute;
    }

    /**
     * Getter for Attribute.
     * @return Returns the List of String
     */
    @JsonGetter("attribute")
    public List<String> getAttribute() {
        return attribute;
    }

    /**
     * Setter for Attribute.
     * @param attribute Value for List of String
     */
    @JsonSetter("attribute")
    public void setAttribute(List<String> attribute) {
        this.attribute = attribute;
    }

    /**
     * Converts this AttributeError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AttributeError [" + "attribute=" + attribute + "]";
    }

    /**
     * Builds a new {@link AttributeError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AttributeError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(attribute);
        return builder;
    }

    /**
     * Class to build instances of {@link AttributeError}.
     */
    public static class Builder {
        private List<String> attribute;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  attribute  List of String value for attribute.
         */
        public Builder(List<String> attribute) {
            this.attribute = attribute;
        }

        /**
         * Setter for attribute.
         * @param  attribute  List of String value for attribute.
         * @return Builder
         */
        public Builder attribute(List<String> attribute) {
            this.attribute = attribute;
            return this;
        }

        /**
         * Builds a new {@link AttributeError} object using the set fields.
         * @return {@link AttributeError}
         */
        public AttributeError build() {
            return new AttributeError(attribute);
        }
    }
}
