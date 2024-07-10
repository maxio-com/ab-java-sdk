/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for CreateProductFamily type.
 */
public class CreateProductFamily
        extends BaseModel {
    private String name;
    private OptionalNullable<String> handle;
    private OptionalNullable<String> description;

    /**
     * Default constructor.
     */
    public CreateProductFamily() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     * @param  description  String value for description.
     */
    public CreateProductFamily(
            String name,
            String handle,
            String description) {
        this.name = name;
        this.handle = OptionalNullable.of(handle);
        this.description = OptionalNullable.of(description);
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     * @param  description  String value for description.
     */

    protected CreateProductFamily(String name, OptionalNullable<String> handle,
            OptionalNullable<String> description) {
        this.name = name;
        this.handle = handle;
        this.description = description;
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
     * Internal Getter for Handle.
     * @return Returns the Internal String
     */
    @JsonGetter("handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetHandle() {
        return this.handle;
    }

    /**
     * Getter for Handle.
     * @return Returns the String
     */
    public String getHandle() {
        return OptionalNullable.getFrom(handle);
    }

    /**
     * Setter for Handle.
     * @param handle Value for String
     */
    @JsonSetter("handle")
    public void setHandle(String handle) {
        this.handle = OptionalNullable.of(handle);
    }

    /**
     * UnSetter for Handle.
     */
    public void unsetHandle() {
        handle = null;
    }

    /**
     * Internal Getter for Description.
     * @return Returns the Internal String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDescription() {
        return this.description;
    }

    /**
     * Getter for Description.
     * @return Returns the String
     */
    public String getDescription() {
        return OptionalNullable.getFrom(description);
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = OptionalNullable.of(description);
    }

    /**
     * UnSetter for Description.
     */
    public void unsetDescription() {
        description = null;
    }

    /**
     * Converts this CreateProductFamily into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateProductFamily [" + "name=" + name + ", handle=" + handle + ", description="
                + description + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name);
        builder.handle = internalGetHandle();
        builder.description = internalGetDescription();
        return builder;
    }

    /**
     * Class to build instances of {@link CreateProductFamily}.
     */
    public static class Builder {
        private String name;
        private OptionalNullable<String> handle;
        private OptionalNullable<String> description;

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
            this.handle = OptionalNullable.of(handle);
            return this;
        }

        /**
         * UnSetter for handle.
         * @return Builder
         */
        public Builder unsetHandle() {
            handle = null;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = OptionalNullable.of(description);
            return this;
        }

        /**
         * UnSetter for description.
         * @return Builder
         */
        public Builder unsetDescription() {
            description = null;
            return this;
        }

        /**
         * Builds a new {@link CreateProductFamily} object using the set fields.
         * @return {@link CreateProductFamily}
         */
        public CreateProductFamily build() {
            return new CreateProductFamily(name, handle, description);
        }
    }
}
