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
import com.maxio.advancedbilling.models.containers.MetafieldEnum;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for Metafield type.
 */
public class Metafield
        extends BaseModel {
    private Integer id;
    private String name;
    private MetafieldScope scope;
    private Integer dataCount;
    private MetafieldInput inputType;
    private OptionalNullable<MetafieldEnum> mEnum;

    /**
     * Default constructor.
     */
    public Metafield() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  name  String value for name.
     * @param  scope  MetafieldScope value for scope.
     * @param  dataCount  Integer value for dataCount.
     * @param  inputType  MetafieldInput value for inputType.
     * @param  mEnum  MetafieldEnum value for mEnum.
     */
    public Metafield(
            Integer id,
            String name,
            MetafieldScope scope,
            Integer dataCount,
            MetafieldInput inputType,
            MetafieldEnum mEnum) {
        this.id = id;
        this.name = name;
        this.scope = scope;
        this.dataCount = dataCount;
        this.inputType = inputType;
        this.mEnum = OptionalNullable.of(mEnum);
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  name  String value for name.
     * @param  scope  MetafieldScope value for scope.
     * @param  dataCount  Integer value for dataCount.
     * @param  inputType  MetafieldInput value for inputType.
     * @param  mEnum  MetafieldEnum value for mEnum.
     */

    protected Metafield(Integer id, String name, MetafieldScope scope, Integer dataCount,
            MetafieldInput inputType, OptionalNullable<MetafieldEnum> mEnum) {
        this.id = id;
        this.name = name;
        this.scope = scope;
        this.dataCount = dataCount;
        this.inputType = inputType;
        this.mEnum = mEnum;
    }

    /**
     * Getter for Id.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
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
     * Getter for DataCount.
     * the amount of subscriptions this metafield has been applied to in Chargify
     * @return Returns the Integer
     */
    @JsonGetter("data_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getDataCount() {
        return dataCount;
    }

    /**
     * Setter for DataCount.
     * the amount of subscriptions this metafield has been applied to in Chargify
     * @param dataCount Value for Integer
     */
    @JsonSetter("data_count")
    public void setDataCount(Integer dataCount) {
        this.dataCount = dataCount;
    }

    /**
     * Getter for InputType.
     * Indicates how data should be added to the metafield. For example, a text type is just a
     * string, so a given metafield of this type can have any value attached. On the other hand,
     * dropdown and radio have a set of allowed values that can be input, and appear differently on
     * a Public Signup Page. Defaults to 'text'
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
     * a Public Signup Page. Defaults to 'text'
     * @param inputType Value for MetafieldInput
     */
    @JsonSetter("input_type")
    public void setInputType(MetafieldInput inputType) {
        this.inputType = inputType;
    }

    /**
     * Internal Getter for Enum.
     * @return Returns the Internal MetafieldEnum
     */
    @JsonGetter("enum")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<MetafieldEnum> internalGetEnum() {
        return this.mEnum;
    }

    /**
     * Getter for Enum.
     * @return Returns the MetafieldEnum
     */
    public MetafieldEnum getEnum() {
        return OptionalNullable.getFrom(mEnum);
    }

    /**
     * Setter for Enum.
     * @param mEnum Value for MetafieldEnum
     */
    @JsonSetter("enum")
    public void setEnum(MetafieldEnum mEnum) {
        this.mEnum = OptionalNullable.of(mEnum);
    }

    /**
     * UnSetter for Enum.
     */
    public void unsetEnum() {
        mEnum = null;
    }

    /**
     * Converts this Metafield into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Metafield [" + "id=" + id + ", name=" + name + ", scope=" + scope + ", dataCount="
                + dataCount + ", inputType=" + inputType + ", mEnum=" + mEnum
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .name(getName())
                .scope(getScope())
                .dataCount(getDataCount())
                .inputType(getInputType());
        builder.mEnum = internalGetEnum();
        return builder;
    }

    /**
     * Class to build instances of {@link Metafield}.
     */
    public static class Builder {
        private Integer id;
        private String name;
        private MetafieldScope scope;
        private Integer dataCount;
        private MetafieldInput inputType;
        private OptionalNullable<MetafieldEnum> mEnum;



        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
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
         * Setter for dataCount.
         * @param  dataCount  Integer value for dataCount.
         * @return Builder
         */
        public Builder dataCount(Integer dataCount) {
            this.dataCount = dataCount;
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
         * @param  mEnum  MetafieldEnum value for mEnum.
         * @return Builder
         */
        public Builder mEnum(MetafieldEnum mEnum) {
            this.mEnum = OptionalNullable.of(mEnum);
            return this;
        }

        /**
         * UnSetter for mEnum.
         * @return Builder
         */
        public Builder unsetMEnum() {
            mEnum = null;
            return this;
        }

        /**
         * Builds a new {@link Metafield} object using the set fields.
         * @return {@link Metafield}
         */
        public Metafield build() {
            return new Metafield(id, name, scope, dataCount, inputType, mEnum);
        }
    }
}
