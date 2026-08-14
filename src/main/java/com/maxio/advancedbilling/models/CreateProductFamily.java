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
    private Boolean surcharging;

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
     * @param  surcharging  Boolean value for surcharging.
     */
    public CreateProductFamily(
            String name,
            String handle,
            String description,
            Boolean surcharging) {
        this.name = name;
        this.handle = OptionalNullable.of(handle);
        this.description = OptionalNullable.of(description);
        this.surcharging = surcharging;
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     * @param  description  String value for description.
     * @param  surcharging  Boolean value for surcharging.
     */

    protected CreateProductFamily(String name, OptionalNullable<String> handle,
            OptionalNullable<String> description, Boolean surcharging) {
        this.name = name;
        this.handle = handle;
        this.description = description;
        this.surcharging = surcharging;
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
     * Getter for Surcharging.
     * Whether surcharging applies to this product family. Defaults to `true` when omitted. Only
     * applied on sites where surcharging is enabled.
     * @return Returns the Boolean
     */
    @JsonGetter("surcharging")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getSurcharging() {
        return surcharging;
    }

    /**
     * Setter for Surcharging.
     * Whether surcharging applies to this product family. Defaults to `true` when omitted. Only
     * applied on sites where surcharging is enabled.
     * @param surcharging Value for Boolean
     */
    @JsonSetter("surcharging")
    public void setSurcharging(Boolean surcharging) {
        this.surcharging = surcharging;
    }

    /**
     * Converts this CreateProductFamily into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateProductFamily [" + "name=" + name + ", handle=" + handle + ", description="
                + description + ", surcharging=" + surcharging + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CreateProductFamily.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateProductFamily.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name)
                .surcharging(getSurcharging());
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
        private Boolean surcharging;

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
         * Setter for surcharging.
         * @param  surcharging  Boolean value for surcharging.
         * @return Builder
         */
        public Builder surcharging(Boolean surcharging) {
            this.surcharging = surcharging;
            return this;
        }

        /**
         * Builds a new {@link CreateProductFamily} object using the set fields.
         * @return {@link CreateProductFamily}
         */
        public CreateProductFamily build() {
            return new CreateProductFamily(name, handle, description, surcharging);
        }
    }
}
