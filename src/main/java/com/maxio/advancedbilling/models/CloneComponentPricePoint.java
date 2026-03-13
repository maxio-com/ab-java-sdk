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

/**
 * This is a model class for CloneComponentPricePoint type.
 */
public class CloneComponentPricePoint
        extends BaseModel {
    private String name;
    private String handle;

    /**
     * Default constructor.
     */
    public CloneComponentPricePoint() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     */
    public CloneComponentPricePoint(
            String name,
            String handle) {
        this.name = name;
        this.handle = handle;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
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
     * Getter for Handle.
     * @return Returns the String
     */
    @JsonGetter("handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHandle() {
        return handle;
    }

    /**
     * Setter for Handle.
     * @param handle Value for String
     */
    @JsonSetter("handle")
    public void setHandle(String handle) {
        this.handle = handle;
    }

    /**
     * Converts this CloneComponentPricePoint into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CloneComponentPricePoint [" + "name=" + name + ", handle=" + handle
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CloneComponentPricePoint.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CloneComponentPricePoint.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name)
                .handle(getHandle());
        return builder;
    }

    /**
     * Class to build instances of {@link CloneComponentPricePoint}.
     */
    public static class Builder {
        private String name;
        private String handle;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         */
        public Builder(String name) {
            this.name = name;
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
         * Setter for handle.
         * @param  handle  String value for handle.
         * @return Builder
         */
        public Builder handle(String handle) {
            this.handle = handle;
            return this;
        }

        /**
         * Builds a new {@link CloneComponentPricePoint} object using the set fields.
         * @return {@link CloneComponentPricePoint}
         */
        public CloneComponentPricePoint build() {
            return new CloneComponentPricePoint(name, handle);
        }
    }
}
