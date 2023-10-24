/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.MetafieldEnum;

/**
 * This is a model class for Metafield type.
 */
public class Metafield {
    private Double id;
    private String name;
    private MetafieldScope scope;
    private Integer dataCount;
    private String inputType;
    private MetafieldEnum mEnum;

    /**
     * Default constructor.
     */
    public Metafield() {
    }

    /**
     * Initialization constructor.
     * @param  id  Double value for id.
     * @param  name  String value for name.
     * @param  scope  MetafieldScope value for scope.
     * @param  dataCount  Integer value for dataCount.
     * @param  inputType  String value for inputType.
     * @param  mEnum  MetafieldEnum value for mEnum.
     */
    public Metafield(
            Double id,
            String name,
            MetafieldScope scope,
            Integer dataCount,
            String inputType,
            MetafieldEnum mEnum) {
        this.id = id;
        this.name = name;
        this.scope = scope;
        this.dataCount = dataCount;
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
     * @return Returns the String
     */
    @JsonGetter("input_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInputType() {
        return inputType;
    }

    /**
     * Setter for InputType.
     * @param inputType Value for String
     */
    @JsonSetter("input_type")
    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    /**
     * Getter for Enum.
     * @return Returns the MetafieldEnum
     */
    @JsonGetter("enum")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MetafieldEnum getEnum() {
        return mEnum;
    }

    /**
     * Setter for Enum.
     * @param mEnum Value for MetafieldEnum
     */
    @JsonSetter("enum")
    public void setEnum(MetafieldEnum mEnum) {
        this.mEnum = mEnum;
    }

    /**
     * Converts this Metafield into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Metafield [" + "id=" + id + ", name=" + name + ", scope=" + scope + ", dataCount="
                + dataCount + ", inputType=" + inputType + ", mEnum=" + mEnum + "]";
    }

    /**
     * Builds a new {@link Metafield.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Metafield.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .name(getName())
                .scope(getScope())
                .dataCount(getDataCount())
                .inputType(getInputType())
                .mEnum(getEnum());
        return builder;
    }

    /**
     * Class to build instances of {@link Metafield}.
     */
    public static class Builder {
        private Double id;
        private String name;
        private MetafieldScope scope;
        private Integer dataCount;
        private String inputType;
        private MetafieldEnum mEnum;



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
         * @param  inputType  String value for inputType.
         * @return Builder
         */
        public Builder inputType(String inputType) {
            this.inputType = inputType;
            return this;
        }

        /**
         * Setter for mEnum.
         * @param  mEnum  MetafieldEnum value for mEnum.
         * @return Builder
         */
        public Builder mEnum(MetafieldEnum mEnum) {
            this.mEnum = mEnum;
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
