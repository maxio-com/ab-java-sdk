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
 * This is a model class for Metafields type.
 */
public class Metafields {
    private Double id;
    private String name;
    private MetafieldScope scope;
    private MetafieldInput inputType;
    private List<String> mEnum;

    /**
     * Default constructor.
     */
    public Metafields() {
        inputType = MetafieldInput.TEXT;
    }

    /**
     * Initialization constructor.
     * @param  id  Double value for id.
     * @param  name  String value for name.
     * @param  scope  MetafieldScope value for scope.
     * @param  inputType  MetafieldInput value for inputType.
     * @param  mEnum  List of String value for mEnum.
     */
    public Metafields(
            Double id,
            String name,
            MetafieldScope scope,
            MetafieldInput inputType,
            List<String> mEnum) {
        this.id = id;
        this.name = name;
        this.scope = scope;
        this.inputType = inputType;
        this.mEnum = mEnum;
    }

    /**
     * Getter for Id.
     * @return Returns the Double
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Double
     */
    @JsonSetter("id")
    public void setId(Double id) {
        this.id = id;
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
     * Getter for Scope.
     * Warning: When updating a metafield's scope attribute, all scope attributes must be passed.
     * Partially complete scope attributes will override the existing settings.
     * @return Returns the MetafieldScope
     */
    @JsonGetter("scope")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MetafieldScope getScope() {
        return scope;
    }

    /**
     * Setter for Scope.
     * Warning: When updating a metafield's scope attribute, all scope attributes must be passed.
     * Partially complete scope attributes will override the existing settings.
     * @param scope Value for MetafieldScope
     */
    @JsonSetter("scope")
    public void setScope(MetafieldScope scope) {
        this.scope = scope;
    }

    /**
     * Getter for InputType.
     * Indicates how data should be added to the metafield. For example, a text type is just a
     * string, so a given metafield of this type can have any value attached. On the other hand,
     * dropdown and radio have a set of allowed values that can be input, and appear differently on
     * a Public Signup Page.
     * @return Returns the MetafieldInput
     */
    @JsonGetter("input_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MetafieldInput getInputType() {
        return inputType;
    }

    /**
     * Setter for InputType.
     * Indicates how data should be added to the metafield. For example, a text type is just a
     * string, so a given metafield of this type can have any value attached. On the other hand,
     * dropdown and radio have a set of allowed values that can be input, and appear differently on
     * a Public Signup Page.
     * @param inputType Value for MetafieldInput
     */
    @JsonSetter("input_type")
    public void setInputType(MetafieldInput inputType) {
        this.inputType = inputType;
    }

    /**
     * Getter for Enum.
     * Only applicable when input_type is radio or dropdown
     * @return Returns the List of String
     */
    @JsonGetter("enum")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getEnum() {
        return mEnum;
    }

    /**
     * Setter for Enum.
     * Only applicable when input_type is radio or dropdown
     * @param mEnum Value for List of String
     */
    @JsonSetter("enum")
    public void setEnum(List<String> mEnum) {
        this.mEnum = mEnum;
    }

    /**
     * Converts this Metafields into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Metafields [" + "id=" + id + ", name=" + name + ", scope=" + scope + ", inputType="
                + inputType + ", mEnum=" + mEnum + "]";
    }

    /**
     * Builds a new {@link Metafields.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Metafields.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .name(getName())
                .scope(getScope())
                .inputType(getInputType())
                .mEnum(getEnum());
        return builder;
    }

    /**
     * Class to build instances of {@link Metafields}.
     */
    public static class Builder {
        private Double id;
        private String name;
        private MetafieldScope scope;
        private MetafieldInput inputType = MetafieldInput.TEXT;
        private List<String> mEnum;



        /**
         * Setter for id.
         * @param  id  Double value for id.
         * @return Builder
         */
        public Builder id(Double id) {
            this.id = id;
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
         * Setter for scope.
         * @param  scope  MetafieldScope value for scope.
         * @return Builder
         */
        public Builder scope(MetafieldScope scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Setter for inputType.
         * @param  inputType  MetafieldInput value for inputType.
         * @return Builder
         */
        public Builder inputType(MetafieldInput inputType) {
            this.inputType = inputType;
            return this;
        }

        /**
         * Setter for mEnum.
         * @param  mEnum  List of String value for mEnum.
         * @return Builder
         */
        public Builder mEnum(List<String> mEnum) {
            this.mEnum = mEnum;
            return this;
        }

        /**
         * Builds a new {@link Metafields} object using the set fields.
         * @return {@link Metafields}
         */
        public Metafields build() {
            return new Metafields(id, name, scope, inputType, mEnum);
        }
    }
}
